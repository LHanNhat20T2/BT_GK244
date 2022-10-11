package com.example.bttonghop;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
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
        holder.imgHinh.setImageResource(travelviews.get(position).getHinhAnh());;


//click items view
        switch (position){
            case 0:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), Detail_MySon.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 1:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), Detail_langBichHoa.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 2:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), Detail_bienHaMy.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 3:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), Detail_BaiRang.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;

            case 4:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), Detail_GhenDaBanThan.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;

            case 5:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), Detail_HKDDung.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
        }



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