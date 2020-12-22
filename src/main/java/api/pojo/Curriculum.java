package api.pojo;

public class Curriculum {//课程
    private int id;
    private String menu_name;
    private String create_date;
    private String modify_date;
    private String curriculum_name;
    private String course_introduction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
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

    public String getCurriculum_name() {
        return curriculum_name;
    }

    public void setCurriculum_name(String curriculum_name) {
        this.curriculum_name = curriculum_name;
    }

    public String getCourse_introduction() {
        return course_introduction;
    }

    public void setCourse_introduction(String course_introduction) {
        this.course_introduction = course_introduction;
    }
}
