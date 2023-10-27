package com.lifecycleawarecomponent

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MainActivityDefaultLifeCycleObserver : DefaultLifecycleObserver {
    companion object{
        const val TAG ="LifeCycleObserver"
    }
    //After: This method will be called after the LifecycleOwner's onCreate method returns.
    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i(TAG,"DefaultLifeCycleObserver- onCreate")
    }
    //After: This method will be called after the LifecycleOwner's onStart method returns.
    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.i(TAG,"DefaultLifeCycleObserver- onStart")
    }
    //After: This method will be called after the LifecycleOwner's onResume method returns.
    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i(TAG,"DefaultLifeCycleObserver- onResume")
    }
    //Before: This method will be called before the LifecycleOwner's onPause method returns.
    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.i(TAG,"DefaultLifeCycleObserver- onPause")
    }
    //Before : This method will be called before the LifecycleOwner's onStop method returns.
    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.i(TAG,"DefaultLifeCycleObserver- onStop")
    }
    //Before : This method will be called before the LifecycleOwner's onDestroy method returns.
    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i(TAG,"DefaultLifeCycleObserver- onStop")
    }
}