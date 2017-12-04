package com.example.jayeshp.carddemo;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jayesh P on 13-Jun-17.
 */

public class MemberAdapter extends RecyclerView.Adapter<MemberAdapter.MemberViewHolder> {

    Context context;

    List<MemberBean> memberBeanList;

    public MemberAdapter(Context context, List<MemberBean> memberBeanList) {
        this.context = context;
        this.memberBeanList = memberBeanList;
    }

    public class MemberViewHolder extends RecyclerView.ViewHolder
    {
        CardView cv1;
        ImageView iv1;
        TextView tv1,tv2;
        public MemberViewHolder(View itemView) {
            super(itemView);

            cv1=(CardView)itemView.findViewById(R.id.cv);
            iv1=(ImageView)itemView.findViewById(R.id.imageView);
            tv1=(TextView)itemView.findViewById(R.id.textView);
            tv2=(TextView)itemView.findViewById(R.id.textView2);
        }
    }

    @Override
    public MemberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item,parent);
        MemberViewHolder holder=new MemberViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MemberViewHolder holder, int position) {
        holder.tv1.setText(memberBeanList.get(position).getName());
        holder.tv2.setText(memberBeanList.get(position).getEmail());
        holder.iv1.setImageResource(memberBeanList.get(position).getPhoto());
    }



    @Override
    public int getItemCount() {
        return 0;
    }
}
