package com.hades.example.android.kotlin_library;

public class KotlinBean {
    String desc = KotlinBean.class.getSimpleName();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
