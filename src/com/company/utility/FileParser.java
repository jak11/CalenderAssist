package com.company.utility;

import com.company.beans.Meeting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kumavatj on 5/27/17.
 */
public class FileParser {
    public static List<Meeting> fetchMeetingDetailsFrom(String filename){
        List<Meeting> meetings = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = null;
            DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
            while ((line = br.readLine()) != null) {
                Meeting meeting = new Meeting();
                String[] str = line.split(",");
                meeting.setDescription(str[0]);
                meeting.setStartTime(dateFormat.parse(str[1]));
                meeting.setEndTime(dateFormat.parse(str[2]));
                meeting.setAttendeesCount(Integer.parseInt(str[3]));
                meeting.setScheduler(str[4]);
                meetings.add(meeting);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return meetings;
    }
}
