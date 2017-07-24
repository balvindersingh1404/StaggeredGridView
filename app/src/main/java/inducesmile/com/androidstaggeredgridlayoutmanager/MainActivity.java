package inducesmile.com.androidstaggeredgridlayoutmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(MainActivity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects("Alkane","", R.drawable.one));
        listViewItems.add(new ItemObjects("Ethane","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Ethane","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Ethane","capital", R.drawable.two));

        listViewItems.add(new ItemObjects("Alkyne","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Benzene","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Amide","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Amino Acid","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Phenol","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Carbonxylic","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Nitril","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ether","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Ester","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Alcohol","capital", R.drawable.four));

        listViewItems.add(new ItemObjects("Alkane","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ethane","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Alkyne","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Benzene","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Amide","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Amino Acid","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Phenol","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Carbonxylic","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Nitril","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ether","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Ester","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Alcohol","capital", R.drawable.four));

        listViewItems.add(new ItemObjects("Alkane","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ethane","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Alkyne","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Benzene","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Amide","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Amino Acid","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Phenol","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Carbonxylic","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Nitril","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ether","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Ester","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Alcohol","capital", R.drawable.four));

        listViewItems.add(new ItemObjects("Alkane","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ethane","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Alkyne","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Benzene","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Amide","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Amino Acid","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Phenol","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Carbonxylic","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Nitril","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ether","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Ester","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Alcohol","capital", R.drawable.four));

        listViewItems.add(new ItemObjects("Alkane","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ethane","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Alkyne","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Benzene","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Amide","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Amino Acid","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Phenol","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Carbonxylic","capital", R.drawable.four));
        listViewItems.add(new ItemObjects("Nitril","capital", R.drawable.one));
        listViewItems.add(new ItemObjects("Ether","capital", R.drawable.two));
        listViewItems.add(new ItemObjects("Ester","capital", R.drawable.three));
        listViewItems.add(new ItemObjects("Alcohol","capital", R.drawable.four));

        return listViewItems;
    }
}
