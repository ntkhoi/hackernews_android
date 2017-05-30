package hackernews.khoint.com.hackernews.model;



/**
 * Created by khoint on 5/30/17.
 */



import com.google.gson.annotations.SerializedName;
import java.io.Serializable;



public class HNStory {

    @SerializedName("id")
    private int id;

    @SerializedName("by")
    private  String author;

    @SerializedName("title")
    private  String title;

    @SerializedName("type")
    private  String type;

    @SerializedName("url")
    private  String url;

    @SerializedName("time")
    private  Float time;

    @SerializedName("score")
    private  int score;

    @SerializedName("descendants")
    private  String descendants;



    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public  String getAuthor(){
        return  author;
    }

    public  String getType(){
        return type;
    }

    public  String getUrl(){
        return url;
    }

    public  Float getTime(){
        return time;
    }

    public int getScore() {
        return score;
    }

    public String getDescendants(){
        return descendants;
    }

}





