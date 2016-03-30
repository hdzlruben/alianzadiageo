package com.ioblok.aliadosdiageo.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import com.ioblok.aliadosdiageo.R;
import com.ioblok.aliadosdiageo.models.ListModelMenu;
import com.ioblok.aliadosdiageo.utilis.CustomTextViewMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kreativeco on 27/03/16.
 */
public class CustomMenuAdapter extends ArrayAdapter<ListModelMenu> {

    Context context;
    Activity activity;
    ListModelMenu[] data = null;
    public ArrayList<ListModelMenu> customListView = null;
    int resource;
    int spSize;
    LayoutInflater inflater;

    public CustomMenuAdapter(Context context, int resource) {
        super(context, resource);
    }

    public CustomMenuAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public CustomMenuAdapter(Context context, int resource, ListModelMenu[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        inflater = ((Activity) this.context).getLayoutInflater();
        data = objects;

    }

    public CustomMenuAdapter(Context context, int resource, int textViewResourceId, ListModelMenu[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public CustomMenuAdapter(Activity activity, int resource, ArrayList<ListModelMenu> objects) {
        super(activity, resource, objects);
        this.activity = activity;
        this.resource = resource;
        inflater = activity.getLayoutInflater();
        customListView = objects;
    }

    public CustomMenuAdapter(Context context, int resource, int textViewResourceId, List<ListModelMenu> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ListModelMenuHolder holder = null;

        if (row == null) {
            row = inflater.inflate(resource, parent, false);
            holder = new ListModelMenuHolder();
            holder.textView = (CustomTextViewMenu) row.findViewById(R.id.tv_name_menu);
            holder.llParent = (LinearLayout) row.findViewById(R.id.ll_parent);
            holder.llFamilies = (LinearLayout) row.findViewById(R.id.ll_families);
            holder.llCategories = (LinearLayout) row.findViewById(R.id.ll_categories);
            holder.llProcess = (LinearLayout) row.findViewById(R.id.ll_process);
            row.setTag(holder);
        } else {
            holder = (ListModelMenuHolder) row.getTag();
        }

        ListModelMenu listModelMenu = customListView.get(position);
        holder.textView.setText(listModelMenu.getNameList());
        holder.llParent.setBackgroundColor(activity.getResources().getColor(customListView.get(position).getColorItem()));
        holder.textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, activity.getResources().getDimensionPixelSize( R.dimen.tv_menu_title ));
        hideSubmenu(holder, position);

        return row;
    }

    static class ListModelMenuHolder {
        CustomTextViewMenu textView;
        LinearLayout llParent;
        LinearLayout llFamilies;
        LinearLayout llCategories;
        LinearLayout llProcess;
    }

    public void hideSubmenu(ListModelMenuHolder holder, int position) {
        if (position == 1) {

            holder.llCategories.setVisibility(View.GONE);
            holder.llProcess.setVisibility(View.GONE);
            setTVParams(holder.llFamilies);
            holder.llFamilies.setVisibility(View.GONE);

        }else if(position == 2){

            holder.llFamilies.setVisibility(View.GONE);
            holder.llProcess.setVisibility(View.GONE);
            setTVParams(holder.llCategories);
            holder.llCategories.setVisibility(View.GONE);

        }else if (position == 3){

            holder.llFamilies.setVisibility(View.GONE);
            holder.llCategories.setVisibility(View.GONE);
            setTVParams(holder.llProcess);
            holder.llProcess.setVisibility(View.GONE);

        }else {

            holder.llFamilies.setVisibility(View.GONE);
            holder.llCategories.setVisibility(View.GONE);
            holder.llProcess.setVisibility(View.GONE);

        }

    }

    public void setTVParams(LinearLayout linearLayout){
        for(int i=0; i<((ViewGroup)linearLayout).getChildCount(); ++i) {
            View nextChild = ((ViewGroup)linearLayout).getChildAt(i);
            if(nextChild instanceof CustomTextViewMenu){
                ((CustomTextViewMenu) nextChild).setTextSize(TypedValue.COMPLEX_UNIT_PX, activity.getResources().getDimensionPixelSize( R.dimen.tv_sub_menu_title ));
            }
        }
    }
}
