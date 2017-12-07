package profchoper.course;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private final int id;

    private final String name;
    private final String alias;

    public Course(int id, String name, String alias) {
        this.id = id;
        this.name = name;
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }
}
