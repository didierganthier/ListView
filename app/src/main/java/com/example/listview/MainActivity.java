package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);

        Person didier = new Person("Didier","Masculin","21");
        Person olivier = new Person("Olivier","Masculin","26");
        Person michaelle = new Person("Michaelle","Feminin", "55");
        Person aisha = new Person("Aisha","Feminin","19");
        Person gandhi = new Person("Ghandy","Masculin", "24");
        Person fadja = new Person("Leila","Feminin","22");
        Person bananah = new Person("Savannah","Feminin","22");
        Person sukikoo = new Person("Sukaina","Feminin","23");

        ArrayList<Person> people = new ArrayList<>();
        people.add(didier);
        people.add(olivier);
        people.add(michaelle);
        people.add(aisha);
        people.add(gandhi);
        people.add(fadja);
        people.add(bananah);
        people.add(sukikoo);
        people.add(didier);
        people.add(olivier);
        people.add(michaelle);
        people.add(aisha);
        people.add(gandhi);
        people.add(fadja);
        people.add(bananah);
        people.add(sukikoo);
        people.add(didier);
        people.add(olivier);
        people.add(michaelle);
        people.add(aisha);
        people.add(gandhi);
        people.add(fadja);
        people.add(bananah);
        people.add(sukikoo);

        PersonListAdapter adapter = new PersonListAdapter(this,R.layout.adapter_layout,people);
        listView.setAdapter(adapter);
    }
}
