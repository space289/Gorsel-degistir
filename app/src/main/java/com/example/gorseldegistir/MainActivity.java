package com.example.gorseldegistir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gorseldegistir.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Gorsel> gorselArrayList = new ArrayList<>();
    int seciliSiraNo;
    Button buttonIleri;
    Button buttonGeri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        buttonIleri = findViewById(R.id.button2);
        buttonGeri = findViewById(R.id.button);

        Gorsel dunya = new Gorsel("Dünya Gezegeni" , 1 ,R.drawable.a);
        Gorsel merkur = new Gorsel("Merkür Gezegeni",2,R.drawable.b);
        Gorsel jupiter = new Gorsel("Jupiter Gezegeni",3,R.drawable.jupiter);
        Gorsel saturn = new Gorsel("Saturn Gezegeni",4,R.drawable.saturn);
        gorselArrayList.add(dunya);
        gorselArrayList.add(merkur);
        gorselArrayList.add(jupiter);
        gorselArrayList.add(saturn);

        binding.imageView2.setImageResource(gorselArrayList.get(0).getFoto());
        binding.textView.setText("Bilgi : " + gorselArrayList.get(0).getBilgi());
        seciliSiraNo = 0;

        buttonIleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ileriGitme(view);
            }
        });

        buttonGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geriGelme(view);
            }
        });


    }

    public void geriGelme(View view){
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageView2.setImageResource(gorselArrayList.get(seciliSiraNo).getFoto());
            binding.textView.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).getBilgi());
        }
    }

    public void ileriGitme(View view){
        if(seciliSiraNo<gorselArrayList.size()-1){
            seciliSiraNo++;
            binding.imageView2.setImageResource(gorselArrayList.get(seciliSiraNo).getFoto());
            binding.textView.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).getBilgi());
        }
    }


}