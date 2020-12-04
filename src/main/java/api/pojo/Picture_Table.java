package api.pojo;

public class Picture_Table {//图片表
    private  int id;
    private  String  picture;
    private  String Creation_time;
    private  String Modification_time;
    private  int Type;
    private  int Foreign_id;

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

    public String getCreation_time() {
        return Creation_time;
    }

    public void setCreation_time(String creation_time) {
        Creation_time = creation_time;
    }

    public String getModification_time() {
        return Modification_time;
    }

    public void setModification_time(String modification_time) {
        Modification_time = modification_time;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getForeign_id() {
        return Foreign_id;
    }

    public void setForeign_id(int foreign_id) {
        Foreign_id = foreign_id;
    }
}
