package com.practice.intervicequestions.wissen;
import java.io.*;
import java.util.*;

public class TestClass {
     public  static ArrayList<Slot> slotList = new ArrayList<>();

     static void addToList(Slot slot){
         boolean isAdded = false;
         if(slotList.size()==0) {
             slotList.add(slot);
             isAdded = true;
         } else {
             for (Slot s : slotList) {
                 int lowestEndTime = findLowestEndTime();
                 if ( lowestEndTime == s.endTime && s.endTime <= slot.startTime) {
                     slotList.add(slot);
                     slotList.remove(s);
                     isAdded = true;
                     break;
                 }
             }
         }
         if(!isAdded){
             slotList.add(slot);
         }

         System.out.println("Here");
     }

     static int findLowestEndTime(){
         int lowestEndTime = slotList.get(0).endTime;
         for( Slot s : slotList){
             if (s.endTime < lowestEndTime)
                 lowestEndTime = s.endTime;
         }
         return lowestEndTime;
     }
/*
     static int[][] sortByStartTime(int[][] arr){
                  
     }*/
    static int minParkingSpaces(int[][] parkingStartEndTimes) {
        int count = 0;
        for (int i = 0 ;i < parkingStartEndTimes.length; i++){
            Slot slot = new Slot(parkingStartEndTimes[i][0], parkingStartEndTimes[i][1]);
            addToList(slot);
            if (slotList.size() > count){
                count = slotList.size();
            }

        }
       return count;
    }

    // DO NOT MODIFY ANYTHING BELOW THIS LINE!!

    public static void main(String[] args) throws IOException {
         //18
        // 5,10 0,20 25,40 35,45 25,40 0,40 50,60 250, 300 0,20 5,10 0,20 25,40 35,45 25,40 0,40 50,60 250, 300 0,20
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int[][] parkingStartEndTimeList = new int[n][2];
        String[] parkingStartEndTimes = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
            for (int j = 0; j < parkingStartEndTime.length; j++) {
                parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
            }
        }

        int out = minParkingSpaces(parkingStartEndTimeList);
        System.out.println(out);

        wr.close();
        br.close();
    }
}
class Slot{
    public int startTime;
    public int endTime;
    Slot(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
}