package com.kolatv.plugins;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kolatv.plugins.unity.ToastPlugin;
import com.kolatv.plugins.unity.UsbChecker;

public class MainActivity extends AppCompatActivity {
    UsbChecker usbChecker = new UsbChecker();
    ToastPlugin toastPlugin = new ToastPlugin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        if(usbChecker.IsUsbConnect(this))
        {
            toastPlugin.SendToast(this, "Usb is connected");
        }
        else
        {
            toastPlugin.SendToast(this, "Usb is not connected");
        }
    }
}