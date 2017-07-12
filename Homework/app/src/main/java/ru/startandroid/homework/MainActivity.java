package ru.startandroid.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButtons();
        buttons();
    }

    public void addButtons(){
        final TextView textView = (TextView) findViewById(R.id.textView);
        final TableLayout tableLayout = (TableLayout)findViewById(R.id.tablelayout);
        List<TableRow> tableRows = new ArrayList<>();
        final int temp[] = new int[]{0};

        for (int i = 0; i <= 2;i ++){
            tableRows.add(new TableRow(this));
            tableLayout.addView(tableRows.get(i));

            for (int j = 0; j <= 2; j ++){
                final Button button1 = new Button(this);
                temp[0]++;
                button1.setText((temp[0]) + "");
                button1.setTextSize(20);
                tableRows.get(i).addView(button1);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(textView.getText() + ("" +  button1.getText()));
                    }
                });
            }
        }
    }

    public void buttons(){
        Button button_clear = (Button)findViewById(R.id.clear);
        Button button_enter = (Button)findViewById(R.id.enter);

        final TextView textView = (TextView) findViewById(R.id.textView);
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),textView.getText(),Toast.LENGTH_SHORT).show();
                textView.setText("");
            }
        });
    }
}
