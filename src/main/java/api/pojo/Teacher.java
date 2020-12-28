package api.pojo;

public class Teacher {//老师表
    private int id;//主键
    private String creation_date;//创建时间
    private String modification_date;//修改时间
    private String name;//姓名
    private String introduce;//介绍
    private String positionp;//职位
    private String technical_expertise;//技术专长
    private String project_experience;//项目经验
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getModification_date() {
        return modification_date;
    }

    public void setModification_date(String modification_date) {
        this.modification_date = modification_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getPositionp() {
        return positionp;
    }

    public void setPositionp(String positionp) {
        this.positionp = positionp;
    }

    public String getTechnical_expertise() {
        return technical_expertise;
    }

    public void setTechnical_expertise(String technical_expertise) {
        this.technical_expertise = technical_expertise;
    }

    public String getProject_experience() {
        return project_experience;
    }

    public void setProject_experience(String project_experience) {
        this.project_experience = project_experience;
    }
}
