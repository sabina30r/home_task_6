package nix.edu.service.impl;


import nix.edu.data.Listener;
import nix.edu.service.SingerResponsibilityService;

public class SingerResponsibilityServiceImpl implements SingerResponsibilityService {

    public void startResponsibility(Listener listener) {
        System.out.println("Дожидается зрителей");
        System.out.println("Приветствует зрителей");
    }

    public void finishResponsibility(Listener listener){
        System.out.println("Прощается со зрителями");
        System.out.println("Даёт автографы");
    }

}

