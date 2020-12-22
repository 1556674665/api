package api.pojo;

public class Img {//图片表
    private  int id;
    private  String priture_name;
    private  String  picture;
    private  int foreign_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getPriture_name() {
        return priture_name;
    }

    public void setPriture_name(String priture_name) {
        this.priture_name = priture_name;
    }

    public int getForeign_id() {
        return foreign_id;
    }

    public void setForeign_id(int foreign_id) {
        this.foreign_id = foreign_id;
    }
}
