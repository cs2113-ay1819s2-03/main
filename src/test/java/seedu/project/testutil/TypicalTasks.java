package seedu.project.testutil;

import static seedu.project.logic.commands.CommandTestUtil.VALID_DEADLINE_CP2106;
import static seedu.project.logic.commands.CommandTestUtil.VALID_DEADLINE_CS2101;
import static seedu.project.logic.commands.CommandTestUtil.VALID_DESCRIPTION_CP2106;
import static seedu.project.logic.commands.CommandTestUtil.VALID_DESCRIPTION_CS2101;
import static seedu.project.logic.commands.CommandTestUtil.VALID_NAME_CP2106;
import static seedu.project.logic.commands.CommandTestUtil.VALID_NAME_CS2101;
import static seedu.project.logic.commands.CommandTestUtil.VALID_TAG_CP2106;
import static seedu.project.logic.commands.CommandTestUtil.VALID_TAG_CS2101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.project.model.ProjectList;
import seedu.project.model.project.Project;
import seedu.project.model.task.Task;

/**
 * A utility class containing a list of {@code Task} objects to be used in tests.
 */
public class TypicalTasks {

    public static final Task GROUP_MEETING = new TaskBuilder().withName("Group meeting")
            .withDescription("find teammates for group discussion on presentation")
            .withDeadline("1-1-2011")
            .withTags("TYPICAL").build();
    public static final Task REPORT_SUBMISSION = new TaskBuilder().withName("Report submission")
            .withDescription("submit report to John Doe")
            .withDeadline("1-1-2011")
            .withTags("TYPICAL").build();
    public static final Task FEEDBACK = new TaskBuilder().withName("Feedback")
            .withDescription("submit feedback")
            .withDeadline("1-1-2011").build();
    public static final Task TEACHING_FEEDBACK = new TaskBuilder().withName("Teaching Feedback")
            .withDescription("submit teaching feedback via portal")
            .withDeadline("1-1-2011").withTags("TYPICAL").build();
    public static final Task PRINT = new TaskBuilder().withName("Print slides")
            .withDescription("print chapter 4 slides")
            .withDeadline("1-1-2011").build();
    public static final Task QUIZ = new TaskBuilder().withName("Complete quiz")
            .withDescription("attempt quiz at portal, multiple attempts possible")
            .withDeadline("1-1-2011").build();
    public static final Task CONSULTATION = new TaskBuilder().withName("Go for consultation")
            .withDescription("find mr john doe for consultation at office 04-15")
            .withDeadline("1-1-2011").build();

    // Manually added
    public static final Task LECTURE = new TaskBuilder().withName("Attend lecture")
            .withDescription("attend lecture at utown lecture theatre")
            .withDeadline("1-1-2011").build();
    public static final Task TUTORIAL = new TaskBuilder().withName("Attend tutorial")
            .withDescription("attend tutorial at utown classroom")
            .withDeadline("1-1-2011").withTags("TUTORIAL").build();

    // Manually added - Task's details found in {@code CommandTestUtil}
    public static final Task CS2101_MILESTONE = new TaskBuilder().withName(VALID_NAME_CS2101)
            .withDescription(VALID_DESCRIPTION_CS2101).withDeadline(VALID_DEADLINE_CS2101)
            .withTags(VALID_TAG_CS2101).build();
    public static final Task CP2106_MILESTONE = new TaskBuilder().withName(VALID_NAME_CP2106)
            .withDescription(VALID_DESCRIPTION_CP2106).withDeadline(VALID_DEADLINE_CP2106)
            .withTags(VALID_TAG_CP2106).build();

    public static final Project CS2101 = new ProjectBuilder().withTask(CS2101_MILESTONE, QUIZ).build();
    public static final Project CP2106 = new ProjectBuilder().withTask(CP2106_MILESTONE).build();

    public static final String KEYWORD_MATCHING_TEST = "Feedback"; // A keyword that matches Feedback

    private TypicalTasks() {} // prevents instantiation

    /**
     * Returns an {@code ProjectList} with the typical projects.
     */
    public static ProjectList getTypicalProjectList() {
        ProjectList pl = new ProjectList();
        pl.addProject(CS2101);
        //for (Project project : getTypicalProjects()) {
        //pl.addProject(project);
        //}
        return pl;
    }

    /**
     * Returns an {@code Project} with all the typical tasks.
     */
    public static Project getTypicalProject() {
        Project p = new Project();
        p.setName("TYPICAL");
        for (Task task : getTypicalTasks()) {
            p.addTask(task);
        }
        return p;
    }

    public static List<Project> getTypicalProjects() {
        return new ArrayList<>(Arrays.asList(CS2101, CP2106));
    }

    public static List<Task> getTypicalTasks() {
        return new ArrayList<>(Arrays.asList(GROUP_MEETING, REPORT_SUBMISSION, FEEDBACK, TEACHING_FEEDBACK, PRINT,
                QUIZ, CONSULTATION));
    }
}