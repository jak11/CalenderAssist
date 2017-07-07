package com.company.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kumavatj on 5/27/17.
 */
public class RankStore {
    public static final Map<String, Integer> employees;
    static
    {
        employees = new HashMap<String, Integer>();
        employees.put("Nitish", 4);
        employees.put("Amit", 6);
    }
}
