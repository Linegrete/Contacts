package com.example.contacts;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private ArrayList<Contact> contacts;

    public ContactAdapter(Context context, ArrayList<Contact> contacts){
        this.contacts = contacts;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false );
        return new ContactViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position){
        final Contact c = contacts.get(position);
        holder.name.setText(c.getName());
        holder.lastname.setText(c.getLastname());
        holder.phone.setText(c.getPhone());
    }

    @Override
    public int getItemCount(){return 3;}

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView lastname;
        private TextView phone;

        public ContactViewHolder (View itemView){
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.lblname);
            lastname = (TextView) itemView.findViewById(R.id.lbllastname);
            phone = (TextView) itemView.findViewById(R.id.lblphone);
        }
    }

}
