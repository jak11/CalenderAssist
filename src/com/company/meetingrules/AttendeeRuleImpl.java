package com.company.meetingrules;

import com.company.beans.Meeting;

/**
 * Created by kumavatj on 5/27/17.
 */
public class AttendeeRuleImpl implements Rule{
    @Override
    public boolean evaluate(Meeting m1, Meeting m2) {
        if(m1 == null || m2 == null){
            return false;
        }

        if(m1.getAttendeesCount() < m2.getAttendeesCount()){
            return true;
        }

        return false;
    }
}
