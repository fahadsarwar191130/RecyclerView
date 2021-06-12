package com.example.recyclerview_19130;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView R_View;
    RecyclerAdapter R_Adapter;

    List<Player> playerlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerlist.add(new Player("Messi" , "Bareclona" , 10));
        playerlist.add(new Player("Ronaldo" , "Real Madrid" , 7));
        playerlist.add(new Player("Neymar" , "Bareclona" , 16));
        playerlist.add(new Player("Ronaldino" , "Juventus " , 26));
        playerlist.add(new Player("Lewandowski" , "FCB" , 8));
        playerlist.add(new Player("Sergio Ramos" , "JVT" , 5));
        playerlist.add(new Player("Harry Kane" , "XYZ" , 9));
        playerlist.add(new Player("Sadio Mané" , "Arsenal" , 2));
        playerlist.add(new Player("Zlatan " , "Manchester United" , 1));
        playerlist.add(new Player("Mohamed Salah" , "Chelsea " , 11));
        playerlist.add(new Player("Zinedine Zidane" , "Liverpool " , 18));
        R_View = findViewById(R.id.rv_players);

        R_View.setLayoutManager(new LinearLayoutManager(this));
        R_View.setHasFixedSize(true);
        R_Adapter = new RecyclerAdapter(playerlist,MainActivity.this);

        R_View.setAdapter(R_Adapter);
    }
}