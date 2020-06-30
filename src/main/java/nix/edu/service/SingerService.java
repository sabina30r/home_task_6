package nix.edu.service;

import nix.edu.data.Listener;

public class SingerService {

    private InstrumentStateService instrumentsStateChecker = new InstrumentStateService();
    private SingerResponsibilityService singerResponsibility = new SingerResponsibilityService();

    public void startPerformance(Listener listener){
        instrumentsStateChecker.isMicroOk();
        singerResponsibility.startResponsibility(listener);
        sing(listener);
        singerResponsibility.finishResponsibility(listener);
    }

    public void sing(Listener listener){
        System.out.println("Отрабатывает концертную программу");
    }
}
