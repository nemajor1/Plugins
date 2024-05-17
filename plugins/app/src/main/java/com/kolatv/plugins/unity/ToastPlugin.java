package com.kolatv.plugins.unity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

public class ToastPlugin {
    public void SendToast(Context context, String text)
    {
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        toast.show();
    }
}
