package app.polibuda.gimbus.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        View view = findViewById(R.id.activity2);
        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                finish();
                return false;
            }
        });
    }
}
