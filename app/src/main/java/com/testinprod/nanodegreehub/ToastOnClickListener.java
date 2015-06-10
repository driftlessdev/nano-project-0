package com.testinprod.nanodegreehub;

import android.view.View;
import android.widget.Toast;


/**
 * Toast OnClickListener Wrapper
 *
 * <p>Wrapper to do a simple toast message in response to a click.</p>
 *
 * <p>Adapted from <a href="http://stackoverflow.com/questions/10614696/how-to-pass-parameters-to-onclicklistener">http://stackoverflow.com/questions/10614696/how-to-pass-parameters-to-onclicklistener</a></p>
 *
 * @author Tim Schaab
 * @version 1.0
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
