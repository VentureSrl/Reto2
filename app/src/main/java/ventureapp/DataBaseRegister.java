import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseRegister extends SQLiteOpenHelper {

    //Creando base de dats
    public DataBaseRegister(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table register (dni integer primary key, nombre text, apellido text, edad integer)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists register");
        db.execSQL("create table register (dni integer primary key, nombre text, apellido text, edad integer)");

    }
}
