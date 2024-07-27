package develop.differ.bid;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivitySharedPreferences extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

    }

    private void editorSharedPreferences(){
        SharedPreferences sharedPreferences = getSharedPreferences("MyPreferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("MY_KEY", "VALUE");
        editor.apply();
        // или editor.commit(); - если требуется синхронное выполнение
    }

    private void readSharedPreferences(){
        // Чтение строки из SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("MyPreferences", MODE_PRIVATE);
        String valueString = sharedPreferences.getString("MY_KEY", "VALUE");
    }

}
