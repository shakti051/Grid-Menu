package com.example.gridmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainGrid = findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid){
        for (int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
    cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
         Intent intent = new Intent(MainActivity.this,ActivityOne.class);
         intent.putExtra("info","This is activity from card item "+finalI);
         startActivity(intent);
            //    Toast.makeText(MainActivity.this,"Clicked at index"+finalI,Toast.LENGTH_SHORT).show();

      /*  if (finalI == 0){ // Open activity one
            Intent intent = new Intent(MainActivity.this,ActivityOne.class);
          startActivity(intent);
          }
          else if (finalI == 1){ // Open activity two
            Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
            startActivity(intent);
          }else if (finalI == 2){ // Open activity three
            Intent intent = new Intent(MainActivity.this,ActivityThree.class);
            startActivity(intent);
        }else if (finalI == 3){ // Open activity four
            Intent intent = new Intent(MainActivity.this,ActivityFour.class);
            startActivity(intent);
        }else if (finalI == 4){ // Open activity one
            Intent intent = new Intent(MainActivity.this,ActivityFive.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this,"Please set Activity for this cart item.",Toast.LENGTH_SHORT).show();
        }
      */  }
    });
        }
    }
}
