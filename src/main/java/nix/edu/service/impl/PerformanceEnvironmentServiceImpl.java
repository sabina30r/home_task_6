package nix.edu.service.impl;

import nix.edu.annotation.Value;
import nix.edu.service.PerformanceEnvironmentService;

public class PerformanceEnvironmentServiceImpl implements PerformanceEnvironmentService {

    @Value("hall")
    private String concertHall;

    @Value("DJ")
    private String soundMan;

    @Override
    public void check() {
        System.out.println("Концертный зал " + concertHall + " готов, DJ " + soundMan + " на месте.");
    }
}
