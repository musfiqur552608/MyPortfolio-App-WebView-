package com.example.myportfolioapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebViewClient
import com.example.myportfolioapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.webView.loadUrl("https://musfiqur-rahman-se.netlify.app/")
        @SuppressLint("SetJavaScriptEnabled")
        binding.webView.settings.javaScriptEnabled=true
        binding.webView.webViewClient= WebViewClient()
    }
}