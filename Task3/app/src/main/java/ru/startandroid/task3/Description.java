package ru.startandroid.task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        TextView name = (TextView)findViewById(R.id.name_);
        TextView full_description = (TextView)findViewById(R.id.full_discription);
        TextView time = (TextView)findViewById(R.id.time_);


        if (getIntent().getExtras() != null){
            Recept event = (Recept) getIntent().getExtras().getSerializable(EventFragment.TAG_RECEPT);
            name.setText(event.getName());
            full_description.setText(event.getDescription());
            time.setText(event.getTime());
        }
    }
}
