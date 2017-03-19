package evia.huji.ac.il.ex2;

/**
 * Created by Evyatar Ben-Shitrit on 19/03/2017.
 */

public class Task {

    private String task;

    public Task(String task) {
        this.task = task;
    }

    public String getTaskText() {
        return this.task;
    }

    public void setTaskText(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "#" + this.task;
    }
}
