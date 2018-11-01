package e.adem2.dosyaislemleri;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String dosyaAdi = "dosyam";

        File file = new File(getFilesDir(),dosyaAdi);
        //Dosya tanımlandı


        String metin = "merhaba herkese!";
        FileOutputStream outputStream;


        try{
            outputStream = openFileOutput(dosyaAdi, Context.MODE_PRIVATE);
            outputStream.write(metin.getBytes());
            outputStream.close();
            Toast.makeText(this, "Dosya tanımlandı", Toast.LENGTH_SHORT).show();
        }catch(Exception e){
            e.printStackTrace();
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }
}
