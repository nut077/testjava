package com.nut.test.impl;

public class AnimateActivityManager {
    public void accept(ActivityClient activityClient) {
        activityClient.doSomething();
    }
    public void accept2(ActivityClient activityClient, String str) {
        activityClient.doSomething(str);
    }
}
