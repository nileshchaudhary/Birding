package com.tabdemonew.tabdemonew;

import java.util.ArrayList;
import java.util.List;

import util.DisplayBirdsAdapter;
import modal.Birdrow;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by Knight on 04-Jun-14.
 */
public class DisplayBirds extends ListFragment {

	DisplayBirdsAdapter dispadapter;
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v=inflater.inflate(R.layout.display_birds, container,false);
		
		
		
		return v;
	}

	
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	
		List<Birdrow> items=new ArrayList<Birdrow>();
		for(int i=0;i<10;i++){
			String enfname="Bird Name "+(i+1);
			String sciname="Scinetificus Namus "+(i+1);
			Drawable thimbnail=getResources().getDrawable(R.drawable.ic_launcher);
			
			
			items.add(new Birdrow(enfname,sciname,thimbnail));
		}
		
		
		
		dispadapter=new DisplayBirdsAdapter(getActivity(), android.R.layout.simple_list_item_1, items);
		setListAdapter(dispadapter);
	}
	
	  @Override
      public void onListItemClick(ListView l, View v, int position, long id) {
          // Insert desired behavior here.
          Log.i("DisplayBirdFragment", "Item clicked: " + id);
      }

	
    




}