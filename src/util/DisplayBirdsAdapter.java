package util;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import com.tabdemonew.tabdemonew.BirdsSearch;

import modal.Birdrow;
import android.R;
import android.content.Context;
import android.sax.RootElement;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayBirdsAdapter extends ArrayAdapter<Birdrow>{
	LayoutInflater _Inflater;
	ArrayList< Birdrow> items=new ArrayList<Birdrow>();

	public DisplayBirdsAdapter(Context context, int textViewResourceId,
			List<Birdrow> objects) {
		super(context, textViewResourceId, objects);
		this.items=(ArrayList<Birdrow>) objects;
		_Inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	/* (non-Javadoc)
	 * @see android.widget.ArrayAdapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowview=convertView;
		
		if(rowview==null){
			
			rowview=_Inflater.inflate(com.tabdemonew.tabdemonew.R.layout.list_row,null);
		}
		
		Birdrow eachBird=getItem(position);
		((TextView)rowview.findViewById(com.tabdemonew.tabdemonew.R.id.bird_name)).setText(eachBird.get_Engname());
		((TextView)rowview.findViewById(com.tabdemonew.tabdemonew.R.id.sci_name)).setText(eachBird.get_Sciname());
		((ImageView)rowview.findViewById(com.tabdemonew.tabdemonew.R.id.thumbnail_img)).setImageDrawable(eachBird.get_image());
		
		
		
		
		
		
		
		return rowview;
	}

	
	
}
