package sg.com.kaplan.pdma.listviewexample;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EventsAdapter extends ArrayAdapter<Event> {

    public EventsAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Event event = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.event_layout,
                    parent, false);
        }

        //align the data to the xml layout
        TextView textViewName = (TextView) convertView.findViewById(R.id.textViewEvent);
        TextView textViewLocation = (TextView) convertView.findViewById(R.id.textViewLocation);
        TextView textViewDateTime = (TextView) convertView.findViewById(R.id.textViewDateTime);

        textViewName.setText(event.getName());
        textViewLocation.setText(event.getLocation());
        textViewDateTime.setText(event.getDatetime());

        return convertView;
    }
}
