package company.class1022;

public class Database {
    //Make the constructor as private
    //Create a private static instance
    //Create a public getter fpr the instance
    //Create a new instance inside an if statemetn which check if the instance is null
    //Create a private static object which all sync the entry of only one thread
    //double lock
    private Database(){}

    private static Database _instance;

    private static Object obj = new Object();

    public static Database get_instance(){

        if(_instance== null){
            synchronized (obj){
                if (_instance == null){
                    _instance = new Database();
                }
            }
        }
        return _instance;
    }

    public String getConnection(){
        return "You are Connected";
    }
}
