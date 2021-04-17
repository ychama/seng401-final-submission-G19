package com.afzaln.mi_chat.activity;

import com.afzaln.mi_chat.activity.*;
import android.app.Activity;

public  class ActivityFactory { 
    public Activity getActivity(String name){
        if(name.equals("login")){
            return LoginActivity.class;
        } else if(name.equals("messages")){
            return MessagesActivity.class;
        }
        else if(name.equals("settings")){
            return SettingsActivity.class;
        }
        else if(name.equals("image")){
            return ImageActivity.class;
        }
        else if(name.equals("about")){
            return AboutActivity.class;
        }
    }
}
