package com.company.utility;

import com.company.beans.Meeting;
import com.company.meetingrules.AttendeeRuleImpl;
import com.company.meetingrules.RankRuleImpl;
import com.company.meetingrules.Rule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kumavatj on 5/27/17.
 */
public class MeetingSchedular {
    private  List<Rule> ruleList = new ArrayList<>();

    public MeetingSchedular(){
        ruleList.add(new RankRuleImpl());
        ruleList.add(new AttendeeRuleImpl());
    }

    public List<Meeting> resolveConflictingMeetings(List<Meeting> list){

        List<Meeting> res = new ArrayList<>();
        Collections.sort(list, new Comparator<Meeting>() {
            public int compare(Meeting m1, Meeting m2) {
                return m1.getStartTime().compareTo(m2.getStartTime());
            }
        });
        //System.out.println(list);
        Meeting m1, m2;
        Date st1, end1, st2, end2;
        Set<Integer> removeIndex = new HashSet<Integer>();


        for (int i=0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                m1 = list.get(i);
                m2 = list.get(j);
                st1 = m1.getStartTime();
                end1 = m1.getEndTime();

                st2 = m2.getStartTime();
                end2 = m2.getEndTime();


                //Means time is overlapping
                if (st1.before(end2) && st2.before(end1)) {
                    boolean flag = false;
                    for(Rule r : ruleList){
                        if(r.evaluate(m1,m2)){
                            removeIndex.add(j);
                            flag = true;
                            break;
                        }
                    }

                    if(!flag){
                        removeIndex.add(i);
                    }

                }
            }
        }
        System.out.println("====");
        for (Integer temp : removeIndex) {
            System.out.println(temp.intValue());
            //list.remove(temp.intValue());
        }
        System.out.println("====");

        for (int i=0; i < list.size(); i++){
            if(!removeIndex.contains(i)){
                res.add(list.get(i));
            }
        }
        return res;
    }
}
