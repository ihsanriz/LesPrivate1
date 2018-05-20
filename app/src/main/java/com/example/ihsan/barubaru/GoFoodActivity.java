package com.example.ihsan.barubaru;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GoFoodActivity extends AppCompatActivity {

    private EditText edtKilometer;
    private Button btnHitung;
    private TextView tvTotalBiaya;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
        initView();
    }

    private void initView() {
        edtKilometer = (EditText) findViewById(R.id.edt_kilometer);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        tvTotalBiaya = (TextView) findViewById(R.id.tv_total_biaya);
        tvResult = (TextView) findViewById(R.id.tv_result);
    }

    public void totalBiaya (View view) {
        if (TextUtils.isEmpty(edtKilometer.getText())){
            edtKilometer.setError("Data Kosong");
            return;
        }
        String total = edtKilometer.getText().toString();
        int totalAngka = Integer.parseInt(total);
        int hasil = hitungHarga(totalAngka);
        displayMessage(hasil);

        Toast.makeText(this, "Harga yang harus dibayar : "+hasil, Toast.LENGTH_SHORT).show();
    }

    private void displayMessage(int hasil) {
        tvResult.setText("Rp. "+hasil);
    }

    private int hitungHarga(int total){
        int hargaPerkilometer = 3500;
        int hasilKali = total * hargaPerkilometer;
        return hasilKali;
    }
}
