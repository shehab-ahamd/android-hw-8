package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();
       Pokemon p = (Pokemon) b.getSerializable("pokemon");

        TextView name = findViewById(R.id.textView4);
        TextView attack = findViewById(R.id.textView5);
        TextView defence = findViewById(R.id.textView6);
        TextView total = findViewById(R.id.textView7);
        ImageView img = findViewById(R.id.imageView2);


        name.setText(p.getName());
        attack.setText("attack:"+p.getAttack()+"");
        defence.setText("defence:"+p.getDefence()+"");
        total.setText("total:"+p.getTotal()+"");
        img.setImageResource(p.getImage());

    }
}