package com.example.a10119013_uts_akb_if1.model.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;
import androidx.annotation.Nullable;

import com.example.a10119013_uts_akb_if1.model.CatatanHarian.CatatanHarianModel;

public class DatabaseHelper extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME = "CatatanHarian.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "catatan_harian";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_JUDUL = "judul";
    private static final String COLUMN_ISI = "isi";
    private static final String COLUMN_KATEGORI = "kategori";
    private static final String COLUMN_TANGGAL = "tanggal";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_JUDUL + " TEXT, " +
                COLUMN_KATEGORI + " TEXT, " +
                COLUMN_ISI + " TEXT, " +
                COLUMN_TANGGAL + " TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void tambahCatatanHarian(CatatanHarianModel catatanHarian){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_JUDUL, catatanHarian.getJudul());
        cv.put(COLUMN_KATEGORI, catatanHarian.getKategori());
        cv.put(COLUMN_ISI, catatanHarian.getIsi());
        cv.put(COLUMN_TANGGAL, catatanHarian.getTanggal());
        long result = db.insert(TABLE_NAME,null, cv);
        if(result == -1){
            Toast.makeText(context, "Gagal!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Berhasil!", Toast.LENGTH_SHORT).show();
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM "+ TABLE_NAME + " ORDER BY "+ COLUMN_TANGGAL +" DESC";
        Cursor cursor = null;
        if(db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    public void ubahDiary(CatatanHarianModel catatanHarian){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        String id = catatanHarian.getId();
        cv.put(COLUMN_JUDUL, catatanHarian.getJudul());
        cv.put(COLUMN_KATEGORI, catatanHarian.getKategori());
        cv.put(COLUMN_ISI, catatanHarian.getIsi());
        cv.put(COLUMN_TANGGAL, catatanHarian.getTanggal());
        long result = db.update(TABLE_NAME, cv, "id=?", new String[]{id});
        if(result == -1){
            Toast.makeText(context, "Gagal!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Berhasil!", Toast.LENGTH_SHORT).show();
        }
    }

    public void deleteOne(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_NAME, "id=?", new String[]{id});
        if(result == -1){
            Toast.makeText(context, "Gagal!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Berhasil!", Toast.LENGTH_SHORT).show();
        }
    }
}