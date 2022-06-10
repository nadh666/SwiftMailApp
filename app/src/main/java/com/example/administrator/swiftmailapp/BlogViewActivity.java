package com.example.administrator.swiftmailapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BlogViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_view);

        WebView blogVw = (WebView) findViewById(R.id.wbBlogView);
        blogVw.setWebViewClient(new WebViewClient());

        blogVw.loadUrl("http://brickygadget.blogspot.com/");
    }
}
