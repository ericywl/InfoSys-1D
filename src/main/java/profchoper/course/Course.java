package profchoper.course;


public class Course {
    private final String id;
    private final String name;
    private final String alias;

    public Course(String id, String name, String alias) {
        this.id = id;
        this.name = name;
        this.alias = alias;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }
}
