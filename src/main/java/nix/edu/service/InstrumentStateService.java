package nix.edu.service;

import nix.edu.exception.MicroException;

public class InstrumentStateService {
    private boolean microState = true;

    public void isMicroOk(){
        if(microState){
            System.out.println("Микрофон исправен");
        } else{
            throw new MicroException("Микрофон неисправен");
        }
    }
}
