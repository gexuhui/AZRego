package com.gexuhui.regohd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "pineapple", "Strawberry", "Cherry", "Mango"};
    private List<Fruit> fruitList = new ArrayList<>();

    private void initFruits(){
        for( int i =0; i<40;i++){
            //Fruit apple = new Fruit("Apple",R.drawable.ic_launcher_foreground);
            Fruit apple = new Fruit("Apple", R.drawable.pay);
            fruitList.add(apple);
//            Fruit banana = new Fruit("Banana",R.drawable.card);
//            fruitList.add(banana);
//            Fruit orange = new Fruit("Orange",R.drawable.card);
//            fruitList.add(orange);
//            Fruit watermelon = new Fruit("Watermelon",R.drawable.card);
//            fruitList.add(watermelon);
//            Fruit pear = new Fruit("Pear",R.drawable.card);
//            fruitList.add(pear);
//            Fruit grape = new Fruit("Grape",R.drawable.card);
//            fruitList.add(grape);
//            Fruit pineapple = new Fruit("Pineapple",R.drawable.card);
//            fruitList.add(pineapple);
//            Fruit strawberry = new Fruit("Strawberry",R.drawable.card);
//            fruitList.add(strawberry);
//            Fruit cherry = new Fruit("Cherry",R.drawable.card);
//            fruitList.add(cherry);
//            Fruit mango = new Fruit("Mango",R.drawable.card);
//            fruitList.add(mango);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.first_layout);
//        setContentView(R.layout.second_layout);
//        setContentView(R.layout.thrid_layout);
//        setContentView(R.layout.fourth_layout);
//        setContentView(R.layout.fifth_layout);
//        setContentView(R.layout.sixth_layout);
//        setContentView(R.layout.listview_layout);
//        setContentView(R.layout.seven_layout);
        setContentView(R.layout.eighth_layout);

//        initFruits();// 初始化水果数据
//        FruitAdapter arrayAdapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
//        ListView listView = (ListView) findViewById(R.id.listview);
//        listView.setAdapter(arrayAdapter);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, data);
//        ListView listVW = (ListView)findViewById(R.id.list_view);
//        listVW.setAdapter(adapter);


//        AlertDialog.Builder ald = new AlertDialog.Builder(MainActivity.this);
//        ald.setTitle("提示框");
//        ald.setMessage("提示的内容");
//        ald.setCancelable(false);
//        ald.setPositiveButton("好的", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, "好的哦", Toast.LENGTH_SHORT).show();
//            }
//        });
//        ald.setNegativeButton("取消", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
//            }
//        });
//        ald.show();


//        bt.setOnClickListener(self);
//        @Override


//        ProgressBar myProgressBar = (ProgressBar) findViewById(R.id.my_progress_bar);
//
//        ProgressDialog myProgressDialog = new ProgressDialog(MainActivity.this);
//        myProgressDialog.setTitle("ProgressDialog");
//        myProgressDialog.setMessage("Loading……");
//        myProgressDialog.setCancelable(true);

//        Button bt = (Button)findViewById(R.id.click_button);
//        bt.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                System.out.println("点击");
//                myProgressDialog.show();
//                ald.show();
//                myProgressBar.setProgress(myProgressBar.getProgress()+10);
//                if (myProgressBar.getProgress() == myProgressBar.getMax()) {
//                    myProgressBar.setVisibility(View.GONE);
//                    myProgressBar.setProgress(0);
//                } else {
//                    myProgressBar.setVisibility(View.VISIBLE);
//                }
//            }
//        });

    }
}