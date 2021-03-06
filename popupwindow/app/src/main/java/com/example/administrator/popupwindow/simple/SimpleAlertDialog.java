package com.example.administrator.popupwindow.simple;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.popupwindow.R;


/**
 * Created by Li on 2017/3/6.
 */

public class SimpleAlertDialog extends DialogFragment {



    public static DialogFragment getInstance(String title,String msg){
        SimpleAlertDialog simpleAlertDialog = new SimpleAlertDialog();
        Bundle args = new Bundle();
        args.putString("title", title);
        args.putString("msg", msg);
        simpleAlertDialog.setArguments(args);
        return simpleAlertDialog;
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = getArguments().getString("title");
        String msg   = getArguments().getString("msg");

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0);
        builder.setTitle(title)
                .setMessage(msg)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"click ok",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"click cancel",Toast.LENGTH_SHORT).show();
                    }
                });

        return builder.create();
    }




}
