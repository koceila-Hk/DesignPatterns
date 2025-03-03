package fr.nexa.dp.creation.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        MySqlDatabaseSingleton db1 = MySqlDatabaseSingleton.getInstance();
        MySqlDatabaseSingleton db2 = MySqlDatabaseSingleton.getInstance();
        MySqlDatabaseSingleton db3 = MySqlDatabaseSingleton.getInstance();
        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);
    }
}
