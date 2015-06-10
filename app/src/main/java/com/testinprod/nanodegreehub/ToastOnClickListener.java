package com.testinprod.nanodegreehub;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Tim on 6/9/2015.
 */
public class ToastOnClickListener implements View.OnClickListener
{
    private String _toastMsg;
    public ToastOnClickListener(String message)
    {
        _toastMsg = message;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), _toastMsg, Toast.LENGTH_SHORT).show();
    }
}
