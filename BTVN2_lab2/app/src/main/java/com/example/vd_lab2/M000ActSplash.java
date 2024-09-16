package com.example.vd_lab2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class M000ActSplash extends AppCompatActivity {

    ProgressBar progressBar;
    Button buttonStart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_splash);

        // Liên kết các view với mã nguồn
        progressBar = findViewById(R.id.progressBar);
        buttonStart = findViewById(R.id.btn_run);

        // Đặt sự kiện OnClickListener cho button
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiển thị ProgressBar
                progressBar.setVisibility(View.VISIBLE);

                // Giả lập quá trình xử lý (3 giây)
                new android.os.Handler().postDelayed(
                        new Runnable() {
                            @Override
                            public void run() {
                                // Ẩn ProgressBar sau khi hoàn tất
                                progressBar.setVisibility(View.GONE);
                            }
                        }, 3000);
            }
        });
    }
}
