package com.lifecycleawarecomponent

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver : LifecycleObserver {
    companion object{
        const val TAG ="LifeCycleObserver"
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun myOnCreate(){
        Log.i(TAG,"myOnCreate")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun myOnResume(){
        Log.i(TAG,"myOnResume")
    }
}