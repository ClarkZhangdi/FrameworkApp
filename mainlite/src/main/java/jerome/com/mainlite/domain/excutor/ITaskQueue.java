package jerome.com.mainlite.domain.excutor;

import java.util.Collection;

public interface ITaskQueue {

    void addTask(ITask task);

    ITask findByTag(String tag);

    boolean removeTask(ITask task);

    Collection<ITask> getQueue();

    void clear();
}
