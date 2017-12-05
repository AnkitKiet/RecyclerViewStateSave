package edu.myapplication;

import java.io.Serializable;

/**
 * Created by Ankit on 06/12/17.
 */

public class Model implements Serializable{

    private Boolean check;

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}
