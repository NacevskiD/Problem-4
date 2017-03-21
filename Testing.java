package com.david;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by David on 3/20/2017.
 */
public class Testing {
    String lakeName;
    double time;
    HashMap<String,Double> runs;
    ArrayList<String> lakes;

    Testing(){
        this.lakeName = lakeName;
        this.time = time;
        HashMap<String,Double> runs = new HashMap<String,Double>();
        ArrayList<String> lakes = new ArrayList<String>();
    }

    void setLakeName(String lakeName){
        this.lakeName = lakeName;
    }
    String getLakeName(){
        return lakeName;
    }

    void setTime(Double time) {
        this.time = time;
        if (runs.containsKey(lakeName) && (time > runs.get(lakeName))) {
            runs.put(lakeName, time);

        } else {
            runs.put(lakeName, time);
        }
    }

    Double getTime(){
        return time;
    }

    void printInfo(){
        for (Object x : runs.keySet()){
            System.out.println("Fastest time for " + x + " with " + runs.get(x));
        }
    }
}
