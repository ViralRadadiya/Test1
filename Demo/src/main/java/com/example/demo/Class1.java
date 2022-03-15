package com.example.demo;

import android.content.Context;
import android.widget.Toast;

class Class1 {

    void showToast(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
