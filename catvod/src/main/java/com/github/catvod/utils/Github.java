package com.github.catvod.utils;

public class Github {

    private static String getUrl(String path, String name) {
        return path + name;
    }

    // 获取远程配置文件的内容
    public static String getJson(boolean dev, String name) {
        return getUrl("https://example.com/update", "release.json");
    }

    // 从远程配置文件中解析 APK 的基础下载链接
    public static String getApkBaseUrlFromJson(String jsonString) {
        try {
            org.json.JSONObject json = new org.json.JSONObject(jsonString);
            return json.getString("apkurl");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    // 获取 APK 的完整下载链接
    public static String getApkUrl(String apkBaseUrl, String name) {
        return apkBaseUrl + name + ".apk";
    }
}