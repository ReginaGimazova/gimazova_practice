package ru.startandroid.task3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder>{

    List<Recept> events;
    OnEventClickListener listener;

    public EventAdapter(List<Recept> events, OnEventClickListener listener) {
        this.events = events;
        this.listener = listener;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EventViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, final int position) {
        holder.name.setText(events.get(position).getName());
        holder.comlexity.setText(events.get(position).getThe_complexity_cooking());
        holder.discription.setText(events.get(position).getDescription());
        holder.time.setText(events.get(position).getTime());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onEventClick(events.get(position));
            }
        });
    }


    @Override
    public int getItemCount() {
        return events.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView comlexity;
        TextView discription;
        TextView time;
        RelativeLayout relativeLayout;

        public EventViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            comlexity = (TextView) itemView.findViewById(R.id.complexity);
            discription = (TextView)itemView.findViewById(R.id.discription);
            time = (TextView)itemView.findViewById(R.id.time);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relative);
        }
    }

    public interface OnEventClickListener {
        void onEventClick(Recept recept);
        void onLongClickListener(Recept recept);
    }
}
