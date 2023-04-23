package com.example.lasthw1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table
@Entity
public class Number {
    @GeneratedValue
    @Id
    private int id;
    private String type;
    private int x;
    private int y;

    private int result;
    public Number() {
    }

    public Number( String type,int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
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
}
