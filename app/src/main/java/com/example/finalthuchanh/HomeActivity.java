package com.example.finalthuchanh;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HomeActivity extends AppCompatActivity {
    private ListView listOrder;
    private Button btnAdd;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        listOrder = findViewById(R.id.listOrder);

        OkHttpClient client = new OkHttpClient();
        Moshi moshi = new Moshi.Builder().build();
        Type usersType = Types.newParameterizedType(List.class, Order.class);
        final JsonAdapter<List<Order>> jsonAdapter = moshi.adapter(usersType);
        Request request = new Request.Builder()
                .url("https://60b095591f26610017ffe880.mockapi.io/api/orders/")
                .build();
        client.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("Error", "Network Error");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
                final List<Order> users = jsonAdapter.fromJson(json);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        listOrder.setAdapter(new OrderAdapter(HomeActivity.this, users, R.layout.item_view));
                    }
                });
            }
        });
    }
}
