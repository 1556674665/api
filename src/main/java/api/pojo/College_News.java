package api.pojo;

public class College_News {//塞杰新闻
    /**
     * 主键
     * 创建时间
     * 修改时间
     * 标题
     * 内容
     * 来源
     */
    private  int id;	//主键
    private  String creation_time;	//创建时间
    private  String modification_time;	//修改时间
    private  String title;	///标题
    private  String content; //	内容
    private  String source;	//来源

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(String creation_time) {
        this.creation_time = creation_time;
    }

    public String getModification_time() {
        return modification_time;
    }

    public void setModification_time(String modification_time) {
        this.modification_time = modification_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
