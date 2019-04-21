package com.example.jenisburung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageBitmaps();


    }
    private void initImageBitmaps(){
        mImageUrls.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2015/10/25/5624578/5624578_8388b1c5-9598-452c-887e-0995dc2af4c9.jpg");
        mNames.add("Burung Jalak Bali");

        mImageUrls.add("https://cdn0-a.production.vidio.static6.com/uploads/video/image/688587/burung-lovebird-lutino-mata-merah-mm-b98c82.jpg");
        mNames.add("Burung Love Bird");

        mImageUrls.add("https://kicaumania.net/wp-content/uploads/2018/08/cara-merawat-burung-pleci.png");
        mNames.add("Burung Pleci");

        mImageUrls.add("https://www.situsburung.com/wp-content/uploads/2015/10/MP3-Suara-Burung-Murai-Batu-500x348.jpg");
        mNames.add("Burung Murai Batu");

        mImageUrls.add("https://burungnya.com/wp-content/uploads/2016/09/Burung-Cendet-singaporebirds.com_.jpg");
        mNames.add("Burung Cendet");

        mImageUrls.add("https://1.bp.blogspot.com/-j9mFHKF5diY/Wp1U5IRK3gI/AAAAAAAAFQE/F-jsAULGfS4wV7A2uChaCOECdIqqmsNXQCLcBGAs/s1600/Burung%2BAnis%2BMerah%2BNgeplong.jpg");
        mNames.add("Burung Anis Merah");

        mImageUrls.add("http://hargacara.com/wp-content/uploads/2016/12/harga-burung-gelatik-batu.jpg");
        mNames.add("Burung Gelatik");

        mImageUrls.add("http://kicuit.com/wp-content/uploads/2018/08/Makanan-Terbaik-Untuk-Burung-Kolibri-Ninja.jpg");
        mNames.add("Burung Kolibri Ninja");

        mImageUrls.add("https://i1.wp.com/hobiburung.org/wp-content/uploads/2017/12/burung-pancawarna-gacor.png?fit=728%2C468&ssl=1");
        mNames.add("Burung Pancawarna");

        initRecyclerView();
    }
    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter (this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
