package com.ncmon.thrall.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * @author ncmon on 2018/9/26
 */
public class CommunicateViewModel extends ViewModel {
    private static final String TAG = CommunicateViewModel.class.getSimpleName();
    private MutableLiveData<String> mNameLiveData;

    public LiveData<String> getName(){
        if (mNameLiveData == null) {
            mNameLiveData = new MutableLiveData<>();
        }
        return mNameLiveData;
    }

    public void setName(String name){
        if (mNameLiveData != null){
            mNameLiveData.setValue(name);
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        mNameLiveData = null;
    }
}
