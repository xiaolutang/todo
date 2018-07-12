package com.example.android.architecture.blueprints.todoapp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright (c) 2018, 唐小陆 All rights reserved.
 * author：txl
 * date：2018/7/12
 * description：将时间戳转换成时间，
 */
public class TimeUtil {

    public static final String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

    public static String getCurrentSystemTime(String format){
        if(format == null || format.isEmpty()){
            format = yyyy_MM_dd_HH_mm_ss;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(format  );
        return dateFormat.format( new Date(  ) );
    }
}
