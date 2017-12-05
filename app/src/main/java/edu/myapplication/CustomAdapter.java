package edu.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;

/**
 * Created by Ankit on 05/12/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    ArrayList<String> category;
    ArrayList<Model> list;

    public CustomAdapter(Context context, ArrayList<String> category) {
        this.context = context;
        this.category = category;
        this.list = new ArrayList<>();
        for (int i = 0; i < category.size(); i++) {
            Model model = new Model();
            model.setCheck(false);
            list.add(i, model);

        }
    }


    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dashboard_list_category_layout, parent, false);
        CustomAdapter.ViewHolder holder = new CustomAdapter.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(final CustomAdapter.ViewHolder holder, final int position) {

        final Model model = list.get(position);
        holder.chk.setText(category.get(position));
        holder.chk.setOnCheckedChangeListener(null);
        holder.chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    Model model = new Model();
                    model.setCheck(isChecked);
                    list.set(holder.getAdapterPosition(),model);
            }
        });
        holder.chk.setChecked(model.getCheck());

    }


    class ViewHolder extends RecyclerView.ViewHolder {


        CheckBox chk;


        public ViewHolder(View view) {
            super(view);
            chk = (CheckBox) view.findViewById(R.id.chk);


        }

    }


    @Override
    public int getItemCount() {

        return category.size();
    }


}
