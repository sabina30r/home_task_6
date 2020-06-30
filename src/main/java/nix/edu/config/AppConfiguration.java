package nix.edu.config;

public interface AppConfiguration {
    <T> Class<? extends T> getCurrentImplementation(Class<T> type);
}
