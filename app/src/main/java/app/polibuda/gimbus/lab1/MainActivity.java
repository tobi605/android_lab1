package app.polibuda.gimbus.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(getApplicationContext(), Activity2.class);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }

    public void run2(View view){
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        startActivity(intent);
    }

    public void run3(View view) {
        Intent intent = new Intent(getApplicationContext(), Activity3.class);
        startActivity(intent);
    }


    public void run4(View view) {
        Intent intent = new Intent(getApplicationContext(), Activity4.class);
        startActivity(intent);
    }

    public void run5(View view) {
        startActivity(new Intent(getApplicationContext(), Activity5.class));
    }
}
