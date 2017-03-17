package com.example.administrator.resgistdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.resgistdemo.R;
import com.example.administrator.resgistdemo.customAdapter.FindEmployerAdapter;
import com.example.administrator.resgistdemo.model.FindEmployerDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/17.
 */
public class FindEmployerFragment extends Fragment {

    private final List<FindEmployerDetail> list = new ArrayList<FindEmployerDetail>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_find_employer_tab, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        initFindEmployDetails();
        FindEmployerAdapter findEmployerAdapter = new FindEmployerAdapter(getActivity(), R.layout.activity_find_employer_detail_item, list);

        ListView lv = (ListView) getView().findViewById(R.id.id_find_employer_list_view);
        lv.setAdapter(findEmployerAdapter);

    }

    private void initFindEmployDetails() {
        FindEmployerDetail item0 = new FindEmployerDetail("2015-7-6至2016", "25元/时", "北京.通州.果园");
        FindEmployerDetail item1 = new FindEmployerDetail("2015-7-6至2016-7-6", "25元/时", "北京.通州.果园");
        FindEmployerDetail item2 = new FindEmployerDetail("2015-7-6至2016-7-6", "25元/时", "北京.通州.果园");
        FindEmployerDetail item3 = new FindEmployerDetail("2015-7-6至2016-7-6", "25元/时", "北京.通州.果园");
        FindEmployerDetail item4 = new FindEmployerDetail("2015-7-6至2016-7-6", "25元/时", "北京.通州.果园");
        FindEmployerDetail item5 = new FindEmployerDetail("2015-7-6至2016-7-6", "25元/时", "北京.通州.果园");

        list.add(item0);
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
    }
}
