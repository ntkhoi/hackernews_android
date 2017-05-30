package hackernews.khoint.com.hackernews;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import hackernews.khoint.com.hackernews.api.HNApi;
import hackernews.khoint.com.hackernews.model.TopStories;
import hackernews.khoint.com.hackernews.utils.RetrofitUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private HNApi mHNApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHNApi = RetrofitUtils.get().create(HNApi.class);


//        mHNApi.getTopStories().enqueue(new Callback<TopStories>() {
//            @Override
//            public void onResponse(Call<TopStories> call, Response<TopStories> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<TopStories> call, Throwable t) {
//
//            }
//        });




    }



}
