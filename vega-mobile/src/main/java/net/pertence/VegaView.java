package net.pertence;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;

public class VegaView extends WebView {
    public VegaView(Context context) {
        super(context);
    }

    public VegaView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VegaView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    void loadSpec(String url) {
        String base64String = Base64.encodeToString(url.getBytes(), Base64.NO_PADDING);
        super.loadUrl("file:///android_res/raw/src.html?spec=$base64String");
    }
}

