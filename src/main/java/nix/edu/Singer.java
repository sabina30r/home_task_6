package nix.edu;

public class Singer {

    private InstrumentState instrumentsStateChecker = new InstrumentState();
    private SingerResponsibility singerResponsibility = new SingerResponsibility();
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
