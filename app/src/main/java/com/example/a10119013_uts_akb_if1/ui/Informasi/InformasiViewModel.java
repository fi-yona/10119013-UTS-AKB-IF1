package com.example.a10119013_uts_akb_if1.ui.Informasi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformasiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InformasiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}