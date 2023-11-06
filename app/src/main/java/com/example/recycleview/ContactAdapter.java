package com.example.recycleview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private final LayoutInflater mInflater;
    private List<ContactModel> contactList;
    private Context context;
    final ContactAdapter.OnItemClickListener listener;

    public ContactAdapter(List<ContactModel> contactList, Context context, ContactAdapter.OnItemClickListener listener) {
        this.mInflater = LayoutInflater.from(context);
        this.contactList = contactList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.contact_item, null);
        return new ContactAdapter.ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvNumber, tvStatus;
        ImageView ivAvatar;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvNumber = itemView.findViewById(R.id.tvNumber);
            tvStatus = itemView.findViewById(R.id.tvStatus);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
        }

        public void bindData(final ContactModel item){
            ivAvatar.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            tvName.setText(item.getName());
            tvNumber.setText(item.getNumber());
            tvStatus.setText(item.getStatus());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(item);
                }
            });
        }
        public interface OnItemClickListener {
            void onItemClick(ContactModel item);
        }
    }
}
