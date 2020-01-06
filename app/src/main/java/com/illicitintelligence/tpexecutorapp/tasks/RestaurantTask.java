package com.illicitintelligence.tpexecutorapp.tasks;

import android.util.Log;

public class RestaurantTask implements Runnable {

    private String name;
    private int seconds;

    public RestaurantTask(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    @Override
    public void run() {
        for (int i = 0; i < seconds; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.d("TAG_X", name);
        }
        Log.d("TAG_X", name + " is done with task.");

    }
}
