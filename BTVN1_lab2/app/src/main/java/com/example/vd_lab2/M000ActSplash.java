package com.example.vd_lab2;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class M000ActSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_splash);

        // Tham chiếu đến layout, ImageView, và TextView
        RelativeLayout splashLayout = findViewById(R.id.splashLayout);
        ImageView iconImageView = findViewById(R.id.iconImageView);
        TextView nameTextView = findViewById(R.id.nameTextView);

        // Mảng màu
        int[] colors = {
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.black),
                getResources().getColor(R.color.teal_700),
                getResources().getColor(R.color.teal_200),
                getResources().getColor(R.color.purple_700),
                getResources().getColor(R.color.purple_500),
                getResources().getColor(R.color.purple_200)
        };

        // Mảng icon
        int[] icons = {
                R.drawable.teddy,
                R.drawable.dog,
                R.drawable.snout,
                R.drawable.cow,
                R.drawable.penguin
        };

        // Mảng tên động vật tương ứng với icon
        String[] names = {
                "Teddy",
                "Dog",
                "Snout",
                "Cow",
                "Penguin"
        };

        // Tạo đối tượng Random
        Random random = new Random();

        // Chọn chỉ số ngẫu nhiên
        int index = random.nextInt(icons.length);

        // Chọn màu, icon và tên ngẫu nhiên
        int randomColor = colors[random.nextInt(colors.length)];
        int randomIcon = icons[index]; // Chọn icon dựa trên chỉ số ngẫu nhiên
        String randomName = names[index]; // Lấy tên từ mảng names dựa trên chỉ số ngẫu nhiên

        // Đặt màu nền cho layout
        splashLayout.setBackgroundColor(randomColor);

        // Đặt icon cho ImageView
        iconImageView.setImageResource(randomIcon);

        // Đặt tên cho TextView
        nameTextView.setText(randomName);

    }
}
