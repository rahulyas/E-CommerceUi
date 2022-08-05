package com.example.vegetableui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VegetableFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VegetableFragment extends Fragment {
    RecyclerView recyclerView_v;
    ArrayList<VegetableModel> model_v= new ArrayList<>();
    VegetableAdapter adapter_v;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VegetableFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VegetableFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VegetableFragment newInstance(String param1, String param2) {
        VegetableFragment fragment = new VegetableFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_vegetable, container, false);
        recyclerView_v = root.findViewById(R.id.recycleview_vegetable);
        recyclerView_v.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        model_v.add(new VegetableModel(R.drawable.v,"Cauliflower()","1Kg","50"));
        model_v.add(new VegetableModel(R.drawable.v1,"Beetroot","1Kg","40"));
        model_v.add(new VegetableModel(R.drawable.v2,"Sweet corn","1Kg","25"));
        model_v.add(new VegetableModel(R.drawable.v3,"Calabash","1Kg","20"));
        model_v.add(new VegetableModel(R.drawable.v4,"Potato","1Kg","30"));
        adapter_v =new VegetableAdapter(getContext(),model_v);
        recyclerView_v.setAdapter(adapter_v);

        return root;

    }
}