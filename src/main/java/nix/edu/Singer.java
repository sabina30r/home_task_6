package nix.edu;

public class Singer {

    private InstrumentState instrumentsState = new InstrumentState();

    public void startPerformance(Listener listener){
        instrumentsState.isMicroOk();
        System.out.println("Дожидается зрителей");
        sing(listener);
    }

    public void sing(Listener listener){
        System.out.println("Приветствует зрителей");
        System.out.println("Отрабатывает концертную программу");
        System.out.println("Прощается со зрителями");
        System.out.println("Даёт автографы");
    }
}
