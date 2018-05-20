package com.example.ihsan.barubaru;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivGofood;
    private ImageView ivGosend;
    private TextView tvGofood;
    private TextView tvGosend;
    private ImageView ivGoride;
    private ImageView ivGomart;
    private TextView tvGoride;
    private TextView tvGomart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ivGofood = (ImageView) findViewById(R.id.iv_gofood);
        ivGosend = (ImageView) findViewById(R.id.iv_gosend);
        tvGofood = (TextView) findViewById(R.id.tv_gofood);
        tvGosend = (TextView) findViewById(R.id.tv_gosend);
        ivGoride = (ImageView) findViewById(R.id.iv_goride);
        ivGomart = (ImageView) findViewById(R.id.iv_gomart);
        tvGoride = (TextView) findViewById(R.id.tv_goride);
        tvGomart = (TextView) findViewById(R.id.tv_gomart);
    }

    public void Pindahojek(View view) {
        Intent intent = new Intent(this, GoFoodActivity.class);
        startActivity(intent);
    }

    public void Pindahgosend(View view) {
        Intent intent = new Intent(this, GoSendActivity.class);
        startActivity(intent);
    }

    public void Pindahgoride(View view) {
        Intent intent = new Intent(this, GoRideActivity.class);
        startActivity(intent);
    }

    public void Pindahmart(View view) {
        Intent intent = new Intent(this, GoMartActivity.class);
        startActivity(intent);
    }
}
