package responsepojo;

import java.util.List;

public class Flickr {
    private List<Object> small;

    public List<Object> getSmall() {
        return small;
    }

    public void setSmall(List<Object> small) {
        this.small = small;
    }

    public List<Object> getOriginal() {
        return original;
    }

    public void setOriginal(List<Object> original) {
        this.original = original;
    }

    private List<Object> original;
}
