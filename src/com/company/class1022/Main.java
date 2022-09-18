package company.class1022;

public class Main {
    public static void main(String[] args) {
        Database db = Database.get_instance();
        System.out.println(db.getConnection());
    }
}
