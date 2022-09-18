package company.class1020;

public class Projector {

    private static Projector _instance;
    private Projector(){}

    private static Object obj = new Object();

    public String name = "Deafault";
    public static Projector getInstance(){
        if(_instance == null){
            synchronized (obj){
                if(_instance == null){
                    _instance = new Projector();
                }
            }
        }
        return _instance;
    }
}
