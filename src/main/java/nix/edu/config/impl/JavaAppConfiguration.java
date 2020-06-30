package nix.edu.config.impl;

import org.reflections.Reflections;
import nix.edu.config.AppConfiguration;

import java.util.Set;

public class JavaAppConfiguration implements AppConfiguration {

    private Reflections scanner;

    public JavaAppConfiguration(String packageToScan){
        this.scanner = new Reflections(packageToScan);
    }
    @Override
    public <T> Class<? extends T> getCurrentImplementation(Class<T> type) {
        Set<Class<? extends T>> children = scanner.getSubTypesOf(type);
        if(children.size() != 1) throw new RuntimeException("Может быть только 1 имплементация");
        return children.iterator().next();
    }
}
