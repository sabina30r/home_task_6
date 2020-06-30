package nix.edu.service.impl;

import nix.edu.exception.MicroException;
import nix.edu.service.MicroService;

public class MicroServiceImpl implements MicroService {

    private boolean microState = true;

    public void isOk(){
        if(microState){
            System.out.println("Микрофон исправен");
        } else{
            throw new MicroException("Микрофон неисправен");
        }
    }
}
