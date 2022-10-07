package com.example.bttonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.ViewHodler> {
    ArrayList<TravelViews> travelviews;
    Context context;

    public TravelAdapter(ArrayList<TravelViews> travelviews, Context context) {
        this.travelviews = travelviews;
        this.context = context;
    }

    @Override
    public ViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.layout_views,parent,false);


        return new ViewHodler(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodler holder, int position) {
        holder.txtName.setText(travelviews.get(position).getTen());
        holder.txtMota.setText(travelviews.get(position).getMota());
        holder.imgHinh.setImageResource(travelviews.get(position).getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return travelviews.size();
    }

    public class  ViewHodler extends RecyclerView.ViewHolder{

        TextView txtName,txtMota;
        ImageView imgHinh;

        public ViewHodler(@NonNull View itemView) {
            super(itemView);

            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtMota = (TextView) itemView.findViewById(R.id.txtMota);
            imgHinh = (ImageView) itemView.findViewById(R.id.imgHinh);
        }
    }
}