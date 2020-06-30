package nix.edu.service.impl;

import nix.edu.exception.MicroException;
import nix.edu.service.MicroService;

public class PerformanceProcessServiceImpl implements MicroService {

    private boolean microState = true;
    private boolean soundOn = true;

    @Override
    public void isOk() {
        if (microState) {
            System.out.println("Микрофон исправен");
        } else {
            throw new MicroException("Микрофон неисправен");
        }
        if (soundOn) {
            System.out.println("Звук включён");
        } else {
            throw new MicroException("Звук выключен");
        }
    }
}
