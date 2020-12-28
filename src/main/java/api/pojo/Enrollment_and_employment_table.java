package api.pojo;

public class Enrollment_and_employment_table//招生就业
{
    /**
     * 主键
     * 创建时间
     * 修改时间
     * 标题
     * 内容
     * 来源
     */
    private  int id;
    private String create_date;
    private String modify_date;
    private String  title;
    private String  content;
    private String  source;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
