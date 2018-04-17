package com.jorgeazzufranco.laboratorio5;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by uca on 04-17-18.
 */

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder>{
    private ArrayList<Serie> series;


    public static class SeriesViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView name;
        ImageView img;
        Button boton;

       public SeriesViewHolder(View itemView){
           super(itemView);
           card=itemView.findViewById(R.id.cardview);
           name=itemView.findViewById(R.id.name);
           img=itemView.findViewById(R.id.img);
           boton=itemView.findViewById(R.id.btn);
       }
    }
    public SeriesAdapter(ArrayList<Serie> series) {this.series=series;}

    @Override
    public SeriesViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
    return (new SeriesViewHolder(v));
    }

    @Override
    public void onBindViewHolder(SeriesViewHolder holder, final int position) {
        holder.name.setText(series.get(position).getName());
        holder.img.setImageResource(series.get(position).getImg());
        holder.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),series.get(position).getName(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return series.size();
    }
}

