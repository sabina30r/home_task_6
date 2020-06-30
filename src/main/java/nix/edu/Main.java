package nix.edu;

public class Main {
    public static void main(String[] args) {
        Singer singer = new Singer();
        singer.startPerformance(new Listener());
    }
}
