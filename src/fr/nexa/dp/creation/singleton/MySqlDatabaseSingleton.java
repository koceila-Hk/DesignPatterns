package fr.nexa.dp.creation.singleton;

import java.sql.Connection;

public final class MySqlDatabaseSingleton {

    private static MySqlDatabaseSingleton instance;

    private MySqlDatabaseSingleton() {
    }

    public static MySqlDatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new MySqlDatabaseSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        return null;
    }
}
