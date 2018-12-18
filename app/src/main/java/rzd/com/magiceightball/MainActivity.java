package rzd.com.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnAsk1;
    ImageView imgDice1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAsk1 = findViewById(R.id.btnAsk);
        imgDice1 = findViewById(R.id.imgDice);

        setListeners();


    }

    private void setListeners(){
        btnAsk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random genRandomNum = new Random();
                final int[] diceArray = {R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5};

                int genNum = genRandomNum.nextInt(5);

                imgDice1.setImageResource(diceArray[genNum]);

            }
        });
    }
}
