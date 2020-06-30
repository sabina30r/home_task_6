package nix.edu.service.impl;

import nix.edu.data.Listener;
import nix.edu.service.MicroService;
import nix.edu.service.SingerResponsibilityService;
import nix.edu.service.SingerService;


public class SingerServiceImpl implements SingerService<Listener> {

    private MicroService microService = new MicroServiceImpl();
    private SingerResponsibilityService singerResponsibilityService= new SingerResponsibilityServiceImpl();

    public void startPerformance(Listener listener){
        microService.isOk();
        singerResponsibilityService.startResponsibility(listener);
        sing(listener);
        singerResponsibilityService.finishResponsibility(listener);
    }

    public void sing(Listener listener){
        System.out.println("Отрабатывает концертную программу");
    }
}