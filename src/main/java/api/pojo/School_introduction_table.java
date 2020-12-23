package api.pojo;

public class School_introduction_table
{
    private int id;
    private String creation_date;
    private String modification_date;
    private String brief_introduction;
    private String teaching_advantages;

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

    public String getBrief_introduction() {
        return brief_introduction;
    }

    public void setBrief_introduction(String brief_introduction) {
        this.brief_introduction = brief_introduction;
    }

    public String getTeaching_advantages() {
        return teaching_advantages;
    }

    public void setTeaching_advantages(String teaching_advantages) {
        this.teaching_advantages = teaching_advantages;
    }
}
