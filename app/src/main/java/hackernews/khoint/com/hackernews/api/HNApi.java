package hackernews.khoint.com.hackernews.api;

import java.util.List;

import hackernews.khoint.com.hackernews.model.HNStory;
import hackernews.khoint.com.hackernews.model.TopStories;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by khoint on 5/30/17.
 */

public interface HNApi {

    @GET("/topstories.json")
    Call<TopStories> getTopStories();
//
//    @GET("{id}/videos")
//    Call<ListTrailer> getTrailer(@Path("id") String id);
}