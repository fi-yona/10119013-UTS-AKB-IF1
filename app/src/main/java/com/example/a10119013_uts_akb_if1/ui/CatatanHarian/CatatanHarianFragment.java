package com.example.a10119013_uts_akb_if1.ui.CatatanHarian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a10119013_uts_akb_if1.databinding.FragmentCatatanharianBinding;

public class CatatanHarianFragment extends Fragment {

    private FragmentCatatanharianBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CatatanHarianViewModel galleryViewModel =
                new ViewModelProvider(this).get(CatatanHarianViewModel.class);

        binding = FragmentCatatanharianBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}