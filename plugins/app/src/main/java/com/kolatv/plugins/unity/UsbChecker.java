package com.kolatv.plugins.unity;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;

import java.util.HashMap;

public class UsbChecker {
    public boolean IsUsbConnect(Context context)
    {
        String deviceName;
        UsbManager um = (UsbManager) context.getSystemService(Context.USB_SERVICE);
        if (um == null)
        {
            return false;
        }
        HashMap<String, UsbDevice> deviceList = um.getDeviceList();
        return !deviceList.isEmpty();
    }
}
