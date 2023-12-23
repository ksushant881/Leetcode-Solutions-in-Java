package com.leetcode.Utils;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return getKey().equals(pair.getKey()) && getValue().equals(pair.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey(), getValue());
    }
}
