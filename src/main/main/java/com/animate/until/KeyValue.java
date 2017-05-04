package com.animate.until;

/**
 *
 * Created by Administrator on 2016/12/7.
 */
public class KeyValue {

    private String key;
    private Object value;
    private Object backupValue;

    public KeyValue() {
    }

    public KeyValue(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public KeyValue(String key, Object value, Object backupValue) {
        this.key = key;
        this.value = value;
        this.backupValue = backupValue;
    }

    public String getKey() {
        return key;
    }

    public KeyValue setKey(String key) {
        this.key = key;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public KeyValue setValue(Object value) {
        this.value = value;
        return this;
    }

    public Object getBackupValue() {
        return backupValue;
    }

    public KeyValue setBackupValue(Object backupValue) {
        this.backupValue = backupValue;
        return this;
    }
}
