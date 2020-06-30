package nix.edu.config.impl;

import org.reflections.Reflections;
import nix.edu.config.AppConfiguration;

import java.util.Map;
import java.util.Set;

public class JavaAppConfiguration implements AppConfiguration {

    private Reflections scanner;
    private Map<Class, Class> mapImpl;

    public JavaAppConfiguration(String packageToScan, Map<Class, Class> mapImpl){
        this.scanner = new Reflections(packageToScan);
        this.mapImpl = mapImpl;
    }
    @Override
    public <T> Class<? extends T> getCurrentImplementation(Class<T> type) {
        return mapImpl.computeIfAbsent(type, aClass -> {
            Set<Class<? extends T>> children = scanner.getSubTypesOf(type);
            if (children.size() != 1) {
                throw new RuntimeException("может быть только одна имплементация");
            }
            return children.iterator().next();
        });
    }
}
