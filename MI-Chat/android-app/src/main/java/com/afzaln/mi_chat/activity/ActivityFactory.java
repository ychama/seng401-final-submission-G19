package com.afzaln.mi_chat.activity;

import com.afzaln.mi_chat.activity.*;

import android.app.Activity;

public  class ActivityFactory implements FlyweightActivity {
    private static HashMap <String, Activity> activityMap  = new HashMap<String, ActivityFactory>(); 

   public static Activity getActivity(String name){
        Activity activity = null;

        if(activityMap.containsKey(name))
        activity = activityMap.get(name);
        
        else {
        assignActivty( name,  activity);
        activityMap.put(name, activity);
        }
        return activity;

        // if(name.equals("login")){
        //     return LoginActivity.class;
        // } else if(name.equals("messages")){
        //     return MessageActivity.class;
        // }
        // else if(name.equals("settings")){
        //     return SettingsActivity.class;
        // }
        // else if(name.equals("image")){
        //     return ImageActivity.class;
        // }
        // else if(name.equals("about")){
        //     return AboutActivity.class;
        // }
    }

    public static void assignActivty(String key, Activity activity){
            switch(key){
                case "login":
                activity = LoginActivity.class;
                    break;
                case "messages":
                activity = MessagesActivity.class;
                    break;
                case "settings":
                activity =  SettingsActivity.class;
                    break;
                case "image":
                activity = ImageActivity.class;
                    break;
                case "about":
                activity = AboutActivity.class;
                default:
                    break;
            }
    }

   
}
