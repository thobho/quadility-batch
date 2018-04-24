package com.thobho.quadility.commons.business;

import java.io.Serializable;
import java.util.Arrays;

import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class Measurement implements Serializable {
    private double startLatt;
    private double startLong;
    private long startTimestamp;

    private double endLatt;
    private double endLong;
    private long endTimestamp;

    private float[] x;
    private float[] y;
    private float[] z;
    private long[] timestamps;

    public Measurement() {
        //default constructor
    }

    public double getStartLatt() {
        return startLatt;
    }

    public void setStartLatt(double startLatt) {
        this.startLatt = startLatt;
    }

    public double getStartLong() {
        return startLong;
    }

    public void setStartLong(double startLong) {
        this.startLong = startLong;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public double getEndLatt() {
        return endLatt;
    }

    public void setEndLatt(double endLatt) {
        this.endLatt = endLatt;
    }

    public double getEndLong() {
        return endLong;
    }

    public void setEndLong(double endLong) {
        this.endLong = endLong;
    }

    public long getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public float[] getX() {
        return x;
    }

    public void setX(float[] x) {
        this.x = x;
    }

    public float[] getY() {
        return y;
    }

    public void setY(float[] y) {
        this.y = y;
    }

    public float[] getZ() {
        return z;
    }

    public void setZ(float[] z) {
        this.z = z;
    }

    public long[] getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(long[] timestamps) {
        this.timestamps = timestamps;
    }

    @Override
    public String toString() {
        return "MeasurementEntity{" +
                "startLatt=" + startLatt +
                ", startLong=" + startLong +
                ", startTimestamp=" + startTimestamp +
                ", endLatt=" + endLatt +
                ", endLong=" + endLong +
                ", endTimestamp=" + endTimestamp +
                ", x=" + Arrays.toString(x) +
                ", y=" + Arrays.toString(y) +
                ", z=" + Arrays.toString(z) +
                ", timestamps=" + Arrays.toString(timestamps) +
                '}';
    }
}
