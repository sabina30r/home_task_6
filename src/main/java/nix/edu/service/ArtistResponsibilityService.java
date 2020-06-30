package nix.edu.service;


import nix.edu.data.abstr.Observer;

public interface ArtistResponsibilityService <O extends Observer> {
    void startResponsibility(O o);
    void finishResponsibility(O o);

}
