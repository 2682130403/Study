package com.example.designpattern;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ImageLoader {
    LruCache<String, Bitmap> mInageCache;
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    Handler mHandler = new Handler(Looper.getMainLooper());

    public ImageLoader() {
        initImageCache();
    }

    private void initImageCache() {

    }

}
