package com.company;

import com.company.beans.Meeting;
import com.company.utility.FileParser;
import com.company.utility.MeetingSchedular;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Meeting> list = FileParser.fetchMeetingDetailsFrom("/Users/kumavatj/CalenderAssist/src/com/company/input.txt");
        //System.out.println(list.size());
        for (Meeting m : list){
            System.out.println(m);
        }
        MeetingSchedular sc = new MeetingSchedular();
        List<Meeting> res = sc.resolveConflictingMeetings(list);
        //System.out.println(res);
        for (Meeting m : res){
            System.out.println(m);
        }

    }
}
