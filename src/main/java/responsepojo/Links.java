package responsepojo;

public class Links {
    private Patch patch;

    public Patch getPatch() {
        return patch;
    }

    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    public Reddit getReddit() {
        return reddit;
    }

    public void setReddit(Reddit reddit) {
        this.reddit = reddit;
    }

    public Flickr getFlickr() {
        return flickr;
    }

    public void setFlickr(Flickr flickr) {
        this.flickr = flickr;
    }

    public Object getPresskit() {
        return presskit;
    }

    public void setPresskit(Object presskit) {
        this.presskit = presskit;
    }

    public String getWebcast() {
        return webcast;
    }

    public void setWebcast(String webcast) {
        this.webcast = webcast;
    }

    public String getYoutube_id() {
        return youtube_id;
    }

    public void setYoutube_id(String youtube_id) {
        this.youtube_id = youtube_id;
    }

    public Object getArticle() {
        return article;
    }

    public void setArticle(Object article) {
        this.article = article;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    private Reddit reddit;
    private Flickr flickr;
    private Object presskit;
    private String webcast;
    private String youtube_id;
    private Object article;
    private String wikipedia;
}
