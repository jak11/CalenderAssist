package com.company.meetingrules;

import com.company.beans.Meeting;
import com.company.utility.RankStore;

/**
 * Created by kumavatj on 5/27/17.
 */
public class RankRuleImpl implements Rule{
    @Override
    public boolean evaluate(Meeting m1, Meeting m2) {
        if(m1 == null || m2 == null){
            return false;
        }

        if(RankStore.employees.get(m1.getScheduler()) < RankStore.employees.get(m2.getScheduler())){
            return true;
        }

        return false;
    }
}
