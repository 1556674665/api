package api.pojo;

public class Img {//图片表
    /**
     * 主键
     * 图片
     * 创建时间
     * 修改时间
     * 类型
     * 分类之后的id
     * 图片名称
     */
    private  int id;
    private  String picture_name;
    private  String  picture_url;
    private  String  create_date;
    private  String  modify_date;
    private  int  type_id;
    private  int foreign_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }
    public String getPicture_name() {
        return picture_name;
    }

    public void setPicture_name(String picture_name) {
        this.picture_name = picture_name;
    }

    public int getForeign_id() {
        return foreign_id;
    }

    public void setForeign_id(int foreign_id) {
        this.foreign_id = foreign_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getModify_date() {
        return modify_date;
    }

    public void setModify_date(String modify_date) {
        this.modify_date = modify_date;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }
}
