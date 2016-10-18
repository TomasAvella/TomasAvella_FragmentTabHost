package fragmenttabhost.example.net.fragmenttabhost;

import android.support.v4.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tomas on 16/10/2016.
 */
public class FragmentPestanya2 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.pestanya2_layout, container, false);
        TextView tv = (TextView) v.findViewById(R.id.text);
        Resources res = getResources();
        tv.setText(res.getString(R.string.eti_tab2));
        return v;

    }
}