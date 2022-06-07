package com.example.a10119013_uts_akb_if1.view.CatatanHarian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119013_uts_akb_if1.R;
import com.example.a10119013_uts_akb_if1.databinding.FragmentCatatanharianBinding;

//NIM   : 10119013
//NAMA  : FIONA AVILA PUTRI
//KELAS : IF-1

public class CatatanHarianFragment extends Fragment {

    private RecyclerView daftar_catatan_harian;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_catatanharian, container, false);

        daftar_catatan_harian = view.findViewById(R.id.daftar_catatan_harian);

        
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}