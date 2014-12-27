package com.ddiehl.android.helloandroid.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ddiehl.android.helloandroid.main.Module;

import java.util.ArrayList;

public class ModuleSelectionAdapter extends ArrayAdapter<Module> {
	private static final String TAG = ModuleSelectionAdapter.class.getSimpleName();
	private Context context;
    private int layoutResourceId;
    private ArrayList<Module> data = null;
	
	public ModuleSelectionAdapter(Context c, int layoutId, ArrayList<Module> list) {
		super(c, layoutId, list);
		context = c;
		layoutResourceId = layoutId;
		data = list;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemHolder holder = null;
        Module module = data.get(position);

        LayoutInflater inflater = ( (Activity) context ).getLayoutInflater();

        if (row == null)
            row = inflater.inflate(layoutResourceId, parent, false);
        
        holder = new ItemHolder();
        holder.module = module;
        holder.itemText = (TextView) row.findViewById(com.ddiehl.android.helloandroid.R.id.itemText);
        row.setTag(holder);
        
        holder.itemText.setText(holder.module.getName());
		
		return row;
	}
	
	static class ItemHolder {
        Module module;
		TextView itemText;
	}
	
}
