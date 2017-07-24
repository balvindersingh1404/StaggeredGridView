package inducesmile.com.androidstaggeredgridlayoutmanager;

public class ItemObjects {
    private String name;
    private String capital;

    private int photo;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ItemObjects(String name, String capital, int photo) {
        this.name = name;
        this.capital = capital;

        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
