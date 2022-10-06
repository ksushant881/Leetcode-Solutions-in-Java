package com.leetcode.Utils;

public class Pair<k, v> {
    public k key;
    public v value;

    public Pair() {

    }

    public Pair(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(k value) {
        this.key = value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public k getKey() {
        return this.key;
    }

    public v getValue() {
        return this.value;
    }

    public void set(k first, v second) {
        this.key = first;
        this.value = second;
    }

    public Pair<k, v> get() {
        return this;
    }
}
