package com.example.oakridge.appdevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HideImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_image);
        final TextView example5=(TextView)findViewById(R.id.img);
        final Button example6=(Button)findViewById(R.id.show);
        example6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttontext=example6.getText().toString();
                if(buttontext=="Hide")
                {
                 example5.setVisibility(View.GONE);
                    example6.setText("Show");

                }

                else{
                    example5.setVisibility(View.VISIBLE);
                    example6.setText("Hide");

                }

            }
        });
    }
}
