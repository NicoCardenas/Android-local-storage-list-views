package co.edu.eci.ieti.android.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import co.edu.eci.ieti.android.database.entity.Task;

@Database(entities = {Task.class}, version = 1)
public abstract class AppData extends RoomDatabase {
    public abstract Task getTaskDao();
}
