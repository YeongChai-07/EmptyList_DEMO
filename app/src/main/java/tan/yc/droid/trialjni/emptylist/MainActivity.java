package tan.yc.droid.trialjni.emptylist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    ArrayAdapter<String> listData_Adapter;
    ArrayList<String> testData = new ArrayList<String>();

    ListView myListView;

    TextView statusMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusMessage = (TextView) findViewById(R.id.textView_MSG);
        listData_Adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1 );

        listData_Adapter.addAll(testData);
        myListView = (ListView) findViewById(R.id.listView1);

        myListView.setAdapter(listData_Adapter);

        if(listData_Adapter.getCount() == 0)   // Represents that the adapter is empty (No content at all)
        {
            statusMessage.setText("Data not loaded. (Maybe the listview is empty?)");

        }
        else
        {
            statusMessage.setText("HELLO WORLD! There are a list of items in the ListView.");
        }


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
}
