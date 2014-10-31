package com.ddiehl.android.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ddiehl.android.helloandroid.adapters.ModuleSelectionAdapter;
import com.ddiehl.android.helloandroid.modules.Animations;
import com.ddiehl.android.helloandroid.modules.EditTextChangeListener;

import java.util.ArrayList;


public class LauncherActivity extends Activity {
    private ListView mListView;
    private ModuleSelectionAdapter mListAdapter;
    private ArrayList<Module> mModuleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        mModuleList = new ArrayList<Module>();
        mModuleList.add(new Module("Animations", Animations.class));
        mModuleList.add(new Module("EditTextOnFocusChange", EditTextChangeListener.class));
        refresh();
    }

    private void refresh() {
        if (mListAdapter == null) {
            mListAdapter = new ModuleSelectionAdapter(this, R.layout.activity_launcher_list_item, mModuleList);
            mListView = (ListView) findViewById(R.id.tool_selection_list);
            mListView.setAdapter(mListAdapter);
            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                    Module m = mModuleList.get(pos);
                    v.getContext().startActivity(new Intent(v.getContext(), m.getModuleClass()));
                }
            });
        } else {
            mListAdapter.notifyDataSetChanged();
        }
    }

}
