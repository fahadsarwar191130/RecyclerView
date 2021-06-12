package com.example.recyclerview_19130;


import android.content.Context;
import android.renderscript.RenderScript;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Player> playerlist;
    private Context context;

    public RecyclerAdapter(List<Player> playerlist, Context context) {
        this.playerlist = playerlist;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater L_Inflater = LayoutInflater.from(parent.getContext());
        View view = L_Inflater.inflate(R.layout.recyclerview_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        Player player = playerlist.get(position);
        holder.playerName.setText(player.getName());
        holder.playerClub.setText(player.getClub());
    }

    @Override
    public int getItemCount() {

        return playerlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView playerName , playerClub , shirtNumber;
        ImageView delete ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            playerName = itemView.findViewById(R.id.tv_playerName);
            playerClub = itemView.findViewById(R.id.tv_playerClub);
            shirtNumber = itemView.findViewById(R.id.tv_shirtNumber);
            delete = itemView.findViewById(R.id.btnDelete);

            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playerlist.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });
        }


        @Override
        public void onClick(View v) {

        }
    }
}
