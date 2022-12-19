package com.example.trytoprogramm.ui.PeopleList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.trytoprogramm.R;
import com.example.trytoprogramm.databinding.FragmentPeoplelistBinding;
import java.util.ArrayList;
import java.util.List;

public class PeopleListFragment extends Fragment {

    ListView peopleListView;
    private FragmentPeoplelistBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPeoplelistBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        setUpList();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void setUpList() {

        List<String> people = new ArrayList<>();

        people.add("Jakob");
        people.add("Jonas");
        people.add("Marc");
        people.add("Martin");
        people.add("Lukas");
        people.add("Phillip");
        people.add("Killian");
        people.add("Mathias");

        peopleListView = (ListView) binding.getRoot().findViewById(R.id.peoplelist);
        ArrayAdapter<String> arrayAdapter;
        arrayAdapter = new ArrayAdapter<>(this.getActivity(), R.layout.fragment_rowitem_peoplelist, R.id.rowitem, people);
        peopleListView.setAdapter(arrayAdapter);
    }
}