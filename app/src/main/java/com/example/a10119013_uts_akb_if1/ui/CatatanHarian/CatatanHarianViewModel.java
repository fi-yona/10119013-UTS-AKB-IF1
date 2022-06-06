package com.example.a10119013_uts_akb_if1.ui.CatatanHarian;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CatatanHarianViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CatatanHarianViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}