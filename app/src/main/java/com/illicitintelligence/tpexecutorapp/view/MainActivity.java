package com.illicitintelligence.tpexecutorapp.view;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import com.illicitintelligence.tpexecutorapp.R;
import com.illicitintelligence.tpexecutorapp.tasks.RestaurantTask;
import com.illicitintelligence.tpexecutorapp.util.HandlerUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Runnable> myList = new ArrayList<>();

    Handler handler = new Handler();

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myList.add(new RestaurantTask("Sarah", 12));
        myList.add(new RestaurantTask("James", 4));
        myList.add(new RestaurantTask("John", 5));
        myList.add(new RestaurantTask("Harry", 8));
        myList.add(new RestaurantTask("Susan", 1));
        myList.add(new RestaurantTask("Jason", 13));


        HandlerUtil handlerUtil = new HandlerUtil(handler, myList);
        handlerUtil.runTasks();

    }
}
