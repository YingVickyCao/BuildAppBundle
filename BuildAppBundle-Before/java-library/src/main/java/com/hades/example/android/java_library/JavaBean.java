package com.hades.example.android.java_library;

public class JavaBean {
    String desc = JavaBean.class.getSimpleName();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}