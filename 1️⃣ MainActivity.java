package com.zyppayx.app;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                        // Create WebView
                                WebView webView = new WebView(this);

                                        // Enable JavaScript & storage
                                                WebSettings settings = webView.getSettings();
                                                        settings.setJavaScriptEnabled(true);
                                                                settings.setDomStorageEnabled(true);

                                                                        // Ensure links stay inside the app
                                                                                webView.setWebViewClient(new WebViewClient());

                                                                                        // Load your Zyppayx website
                                                                                                webView.loadUrl("https://zyppayx.name.ng");

                                                                                                        // Set WebView as the main content
                                                                                                                setContentView(webView);
                                                                                                                    }
                                                                                                                    }