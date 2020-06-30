package nix.edu.service;

import nix.edu.data.Listener;

public class SingerResponsibilityService {
    public void startResponsibility(Listener listener) {
        System.out.println("Дожидается зрителей");
        System.out.println("Приветствует зрителей");
    }

    public void finishResponsibility(Listener listener){
        System.out.println("Прощается со зрителями");
        System.out.println("Даёт автографы");
    }

}

