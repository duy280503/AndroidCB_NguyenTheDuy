package com.example.xucxac;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button rollButton;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView = findViewById(R.id.imageView);
        rollButton = findViewById(R.id.buttonOne);
        random = new Random();

        imageView.setImageResource(R.drawable.perspective_dice_six_faces_five);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }
    private void rollDice() {
        int diceRoll = random.nextInt(6) + 1; // Số từ 1 đến 6
            if (diceRoll == 1) imageView.setImageResource(R.drawable.perspective_dice_six_faces_one);
            if (diceRoll == 2) imageView.setImageResource(R.drawable.perspective_dice_six_faces_two);
            if (diceRoll == 3) imageView.setImageResource(R.drawable.perspective_dice_six_faces_three);
            if (diceRoll == 4) imageView.setImageResource(R.drawable.perspective_dice_six_faces_four);
            if (diceRoll == 5) imageView.setImageResource(R.drawable.perspective_dice_six_faces_five);
            if (diceRoll == 6) imageView.setImageResource(R.drawable.dice_six);
    }
}