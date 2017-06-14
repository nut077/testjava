package com.nut.test.io;

import java.io.Serializable;

public class SimpleObject implements Serializable {
    private String content;
    private int x, y, z;

    public SimpleObject(String content, int x, int y, int z) {
        this.content = content;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
