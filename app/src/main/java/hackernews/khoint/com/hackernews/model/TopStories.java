package hackernews.khoint.com.hackernews.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by khoint on 5/30/17.
 */

public class TopStories {

    @SerializedName("results")
    private List<Integer> _nNewsItemId;

    public List<Integer> getMovies() {
        return _nNewsItemId;
    }
}
