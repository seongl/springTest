package com.apple.model;

import org.hibernate.validator.constraints.Range;

/**
 * Created by seonglee on 7/15/18.
 */
public class Goal {
    @Range(min=1, max=120)
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
