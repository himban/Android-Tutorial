package tdevm.tutorial;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;
    EditText editText;
    TextView textView;
    FloatingActionButton floatingActionButton;
    public static final String TAG = "MERA ACTIVITYYYYYYY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate was Called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_click_me);
        editText = (EditText)findViewById(R.id.et_enter_name);
        textView = (TextView)findViewById(R.id.tv_display_name);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fb_main);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this,"working",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Display.class);
                intent.putExtra("NAME",editText.getText().toString());
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });


    }


}
