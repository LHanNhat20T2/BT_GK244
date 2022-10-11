package com.example.bttonghop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
public class TravelActivity extends AppCompatActivity {
    private RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        initView();
    }



    public void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<TravelViews> arrayList = new ArrayList<>();
        arrayList.add(new TravelViews(R.drawable.img_thanhdiamyson, "Thánh Địa Mỹ Sơn", "Với hơn 70 đền tháp cổ..."));
        arrayList.add(new TravelViews(R.drawable.img_langbichhoa, "Đến với Làng Bích Họa Tam", "Đến với Làng Bích Họa..."));
        arrayList.add(new TravelViews(R.drawable.img_bienhamy, "Bãi biển Hà My", "Nếu bạn yêu thích không..."));
        arrayList.add(new TravelViews(R.drawable.img_bairang, "Bãi Biển Rạng", "Bãi Biển Rạng cũng là một... "));
        arrayList.add(new TravelViews(R.drawable.img_ghenhbanthan, "Ghềnh Đá Bàn Than", "Du lịch Quảng Nam, ghềnh... "));
        arrayList.add(new TravelViews(R.drawable.img_honkemdadung, "Hòn Kẽm Đá Dừng", "Hòn Kẽm Đá Dừng là một..."));
        arrayList.add(new TravelViews(R.drawable.img_thacho, "Thác Hố Giang Thơm", "Nếu là một người yêu..."));
        arrayList.add(new TravelViews(R.drawable.img_thacgrang, "Thác Grăng", "Sở hữu phong cảnh thiên..."));
        arrayList.add(new TravelViews(R.drawable.img_khelim, "Khe Lim", "Khe Lim nổi tiếng với khung ..."));
        arrayList.add(new TravelViews(R.drawable.img_hophuninh, "Hồ Phú Ninh", "Là một trong những..."));

        TravelAdapter shopAdapter = new TravelAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(shopAdapter);
    }


}