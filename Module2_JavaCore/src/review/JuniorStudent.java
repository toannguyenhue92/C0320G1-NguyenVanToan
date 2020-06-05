package review;

public abstract class JuniorStudent {
    private String name;

    public JuniorStudent() {
    }

    public JuniorStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void showInfo();
}
