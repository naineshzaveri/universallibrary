package com.example.universallibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Nainesh Zaveri on 23/12/18.
 */
public class ToasterMessager {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
