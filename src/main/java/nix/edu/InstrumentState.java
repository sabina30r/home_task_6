package nix.edu;

public class InstrumentState {
    private boolean microState = true;

    public void isMicroOk(){
        if(microState){
            System.out.println("Микрофон исправен");
        } else{
            throw new MicroException ("Микрофон неисправен");
        }
    }
}
