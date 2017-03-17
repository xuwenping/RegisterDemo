package com.example.administrator.resgistdemo.customAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.administrator.resgistdemo.R;
import com.example.administrator.resgistdemo.model.FindEmployerDetail;

import java.util.List;

/**
 * Created by Administrator on 2017/3/17.
 */
public class FindEmployerAdapter extends ArrayAdapter<FindEmployerDetail> {

    private int resourceId;

    public FindEmployerAdapter(
            Context context,
            int textViewResourceId,
            List<FindEmployerDetail> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FindEmployerDetail findEmployerDetail = getItem(position);
        View view = null;
        ViewHolder viewHolder;

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.date = (TextView) view.findViewById(R.id.id_date);
            viewHolder.pirce = (TextView) view.findViewById(R.id.id_price);
            viewHolder.localtionDetail = (TextView) view.findViewById(R.id.id_location_detail);

            view.setTag(viewHolder);
        }
        else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.date.setText(findEmployerDetail.getmServerDatePeriod());
        viewHolder.pirce.setText(findEmployerDetail.getmPrice());
        viewHolder.localtionDetail.setText(findEmployerDetail.getmAddress());

        return view;
    }

    class ViewHolder {
        TextView date;
        TextView pirce;
        TextView localtionDetail;
    }
}
