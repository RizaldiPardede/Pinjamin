package models.account;

public class Role {
    private long id_Role;
    private String role_name;

    public long getId_Role() {
        return id_Role;
    }

    public void setId_Role(long id_Role) {
        this.id_Role = id_Role;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
