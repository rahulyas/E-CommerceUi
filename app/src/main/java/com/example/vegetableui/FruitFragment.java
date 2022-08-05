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
 * Use the {@link FruitFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FruitFragment extends Fragment {

    RecyclerView recyclerView_f;
    ArrayList<FruitModel> model_f= new ArrayList<>();
    FruitAdapter adapter_f;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FruitFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FruitFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FruitFragment newInstance(String param1, String param2) {
        FruitFragment fragment = new FruitFragment();
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
        final View root = inflater.inflate(R.layout.fragment_fruit, container, false);
        recyclerView_f = root.findViewById(R.id.recycleview_fruite);
        recyclerView_f.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        model_f.add(new FruitModel(R.drawable.f1,"Cauliflower()","1","50"));
        model_f.add(new FruitModel(R.drawable.f2,"Beetroot","1","40"));
        model_f.add(new FruitModel(R.drawable.f3,"Sweet corn","1","25"));
        model_f.add(new FruitModel(R.drawable.f4,"Calabash","1","20"));
        model_f.add(new FruitModel(R.drawable.f5,"Potato","1","30"));
        adapter_f =new FruitAdapter(getContext(),model_f);
        recyclerView_f.setAdapter(adapter_f);

        return root;

    }
}