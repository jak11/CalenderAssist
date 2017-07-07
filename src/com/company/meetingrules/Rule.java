package com.company.meetingrules;

import com.company.beans.Meeting;

/**
 * Created by kumavatj on 5/27/17.
 */
public interface Rule {
    public boolean evaluate(Meeting m1, Meeting m2);
}
