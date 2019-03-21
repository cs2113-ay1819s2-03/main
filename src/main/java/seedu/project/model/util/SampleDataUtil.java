package seedu.project.model.util;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.project.model.ProjectList;
import seedu.project.model.ReadOnlyProjectList;
import seedu.project.model.project.Project;
import seedu.project.model.project.UniqueProjectList;
import seedu.project.model.tag.Tag;
import seedu.project.model.task.Deadline;
import seedu.project.model.task.Description;
import seedu.project.model.Name;
import seedu.project.model.task.Task;
import seedu.project.model.task.UniqueTaskList;

/**
 * Contains utility methods for populating {@code Project} with sample data.
 */
public class SampleDataUtil {
    public static Task[] getSampleTasks() {
        return new Task[] {
            new Task(new Name("Sample task 1"), new Description("This is a sample task"), new Deadline("1-1-2011"),
                getTagSet("SAMPLE")),
            new Task(new Name("Sample task 2"), new Description("This is a sample task"), new Deadline("1-1-2011"),
                    getTagSet("SAMPLE"))
        };
    }

    public static Project[] getSampleProjects() {
        return new Project[] {
                new Project(new Name("Sample project 1")),
                new Project(new Name("Sample project 2"))
        };
    }

    public static ProjectList getSampleProjectList() {
        ProjectList projectList = new ProjectList();
        for (Project project : getSampleProjects()) {
            for (Task task : getSampleTasks()) {
                project.addTask(task);
            }
            projectList.addProject(project);
        }
        return projectList;
    }

    /**
     * Returns a task set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}