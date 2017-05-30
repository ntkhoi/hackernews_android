package hackernews.khoint.com.hackernews.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by khoint on 5/30/17.
 */

public class RetrofitUtils {

    public static Retrofit get(){

        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
