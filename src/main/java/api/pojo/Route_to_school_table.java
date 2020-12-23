package api.pojo;

public class Route_to_school_table
{
    private int id;
    private String create_date;
    private String modify_date;
    private String registration_telephone;
    private String school_address;
    private String school_website;
    private String nearby_bus_stop;
    private String nearby_bus;

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

    public String getRegistration_telephone() {
        return registration_telephone;
    }

    public void setRegistration_telephone(String registration_telephone) {
        this.registration_telephone = registration_telephone;
    }

    public String getSchool_address() {
        return school_address;
    }

    public void setSchool_address(String school_address) {
        this.school_address = school_address;
    }

    public String getSchool_website() {
        return school_website;
    }

    public void setSchool_website(String school_website) {
        this.school_website = school_website;
    }

    public String getNearby_bus_stop() {
        return nearby_bus_stop;
    }

    public void setNearby_bus_stop(String nearby_bus_stop) {
        this.nearby_bus_stop = nearby_bus_stop;
    }

    public String getNearby_bus() {
        return nearby_bus;
    }

    public void setNearby_bus(String nearby_bus) {
        this.nearby_bus = nearby_bus;
    }
}
