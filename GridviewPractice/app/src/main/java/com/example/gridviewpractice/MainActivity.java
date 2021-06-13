package com.example.gridviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int LastDays = cal.getActualMaximum(Calendar.DATE);
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
<<<<<<< HEAD
        int j = 0;
        Calendar firstmonth = Calendar.getInstance();
        firstmonth.set(year, month, 1);
        getSupportActionBar().setTitle(year + "년" + (month + 1) + "월");

        String[] items = new String[42];
        int dow = (firstmonth.get(Calendar.DAY_OF_WEEK) - 1);
        for (int i = 0; i < 42; i++) {
            items[i] = "";
        }
        int lastDate = firstmonth.getActualMaximum(Calendar.DATE);
        for (int i = (dow); i < lastDate + dow; i++) {
            j++;
            items[i] = "" + j;
=======
        int j=0;
        Calendar firstmonth = Calendar.getInstance();
        firstmonth.set(year,month,1);
        getSupportActionBar().setTitle(year + "년" + (month+1) + "월");

        String[] items = new String[42];
        int dow = (firstmonth.get(Calendar.DAY_OF_WEEK)-1);
        for (int i=0; i<42;i++) {
            items[i] = "";
        }
        int lastDate = firstmonth.getActualMaximum(Calendar.DATE);
        for (int i =(dow); i<lastDate+dow; i++) {
            j++;
            items[i]=""+j;
>>>>>>> b59704bbd0824139f10ad4b6768b5aadc804c97e
        }

        //어댑터 준비 (배열 객체 이용, simple_list_item_1 리소스 사용
        ArrayAdapter<String> adapt
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                items);
        {


        }

        // id를 바탕으로 화면 레이아웃에 정의된 GridView 객체 로딩
        GridView gridview = (GridView) findViewById(R.id.gridview);
        // 어댑터를 GridView 객체에 연결
        gridview.setAdapter(adapt);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
<<<<<<< HEAD
                Toast.makeText(getApplicationContext(), year + "." + (month + 1) + "." + (position - 1),
=======
                Toast.makeText(getApplicationContext(),year+"."+(month+1)+"."+ (position-1),
>>>>>>> b59704bbd0824139f10ad4b6768b5aadc804c97e
                        Toast.LENGTH_SHORT).show();// 토스트 메세지 출력 다시 만들어야 함
            }
        });

    }
<<<<<<< HEAD

    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
    }
=======
>>>>>>> b59704bbd0824139f10ad4b6768b5aadc804c97e
// 달력 부분 프래그넌트로 만들기

}
