package com.hzy.lib7z;
public interface IExtractCallback {
    void onStart();
    void onProgress(long count, long total);
    void onError(int code, String msg);
    void onSucceed();
}