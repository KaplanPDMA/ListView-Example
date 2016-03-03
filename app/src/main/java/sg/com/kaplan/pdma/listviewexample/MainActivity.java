package sg.com.kaplan.pdma.listviewexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // Construct the data source
      ArrayList<Event> events = new ArrayList<Event>();
      events.add(new Event("Kaplan Open House", "WE Level 2", "27 Feb 2016 2pm"));
      events.add(new Event("Ice cream challenge", "Bugis+", "27 Feb 2016 3pm"));
      //the data can be from a JSON backend, now simply hardcoded

      // Create the adapter to convert the array to views
      EventsAdapter adapter = new EventsAdapter(this, events);
      adapter.add(new Event("Kaplan SCIST Android session", "WE", "17 Mar 2016 6.30pm"));
      //also possible to add at the adapter

      // Attach the adapter to a ListView
      ListView listView = (ListView) findViewById(R.id.listView);
      listView.setAdapter(adapter);

      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Event event = (Event) parent.getItemAtPosition(position);
            Toast.makeText(getApplicationContext(), "Selected: " + event.getName(), Toast.LENGTH_SHORT).show();
         }
      });

   }

}
