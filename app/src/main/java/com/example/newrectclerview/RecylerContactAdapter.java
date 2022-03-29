package com.example.newrectclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class RecylerContactAdapter extends RecyclerView.Adapter<RecylerContactAdapter.ViewHolder> {
Context context;
ArrayList <ContactModel> arraycontact;
    RecylerContactAdapter(Context context, ArrayList<ContactModel> arraycontact){
 this.context=context;
 this.arraycontact=arraycontact;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view=   LayoutInflater.from(context).inflate(R.layout.contect_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
     return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.imgcontact.setImageResource(arraycontact.get(position).img);
       holder.txtname.setText(arraycontact.get(position).name);
       holder.txtnumber.setText(arraycontact.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arraycontact.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{
        TextView txtname,txtnumber;
        ImageView imgcontact;
        public ViewHolder(@NonNull View itemview){
            super(itemview);
            txtname=itemview.findViewById(R.id.txtname);
            txtnumber=itemview.findViewById(R.id.txtcontact);
            imgcontact=itemview.findViewById(R.id.imgcontact);

        }

    }
}
