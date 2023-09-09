package sk.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] cities= getResources().getStringArray(R.array.city);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,cities);
        ListView listView=findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);
    }
}