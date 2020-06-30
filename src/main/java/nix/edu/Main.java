package nix.edu;

import nix.edu.data.Listener;
import nix.edu.service.impl.SingerServiceImpl;

public class Main {
    public static void main(String[] args) {
        SingerServiceImpl singer = new SingerServiceImpl();
        singer.startPerformance(new Listener());
    }
}
