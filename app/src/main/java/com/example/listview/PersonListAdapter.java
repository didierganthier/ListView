package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PersonListAdapter extends ArrayAdapter<Person> {

    private Context mContext;
    int mResource;
    private int lastPosition = -1;

    static class ViewHolder{
        TextView name,age,sexe;
    }

    public PersonListAdapter(Context context, int resource, List<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String sexe = getItem(position).getSexe();
        String age = getItem(position).getAge();

        Person person = new Person(name,sexe,age);

        final View result;

        ViewHolder holder;

        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.tvName);
            holder.age = (TextView) convertView.findViewById(R.id.tvAge);
            holder.sexe = (TextView) convertView.findViewById(R.id.tvSexe);

            result = convertView;

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
            result = convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext,(position > lastPosition)?R.anim.load_down_anim:R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition =position;

        holder.name.setText(person.getName());
        holder.age.setText(person.getAge());
        holder.sexe.setText(person.getSexe());

        return convertView;
    }
}
