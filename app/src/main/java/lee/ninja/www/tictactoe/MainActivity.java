package lee.ninja.www.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset,boardChanger;
     int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =(Button)findViewById(R.id.b1);
        b2 =(Button)findViewById(R.id.b2);
        b3 =(Button)findViewById(R.id.b3);
        b4 =(Button)findViewById(R.id.b4);
        b5 =(Button)findViewById(R.id.b5);
        b6 =(Button)findViewById(R.id.b6);
        b7 =(Button)findViewById(R.id.b7);
        b8 =(Button)findViewById(R.id.b8);
        b9 =(Button)findViewById(R.id.b9);
        reset =(Button)findViewById(R.id.reset);
        boardChanger =(Button)findViewById(R.id.boardChanger);
        turn =1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("X");
            }
        });
    }
}
