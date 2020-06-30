package nix.edu;

import nix.edu.data.Listener;
import nix.edu.service.SingerService;

public class Main {
    public static void main(String[] args) {
        SingerService singer = new SingerService();
        singer.startPerformance(new Listener());
    }
}
