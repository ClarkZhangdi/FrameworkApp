package jerome.com.mainlite.domain.excutor.impls;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import jerome.com.mainlite.domain.excutor.ITask;
import jerome.com.mainlite.domain.excutor.ITaskQueue;

/**
 * 实现一个线程安全的集合 BlockingQueue 来维护ITask对象
 */
public class TaskQueue implements ITaskQueue {

    private final BlockingQueue<ITask> mBlockingQueue = new PriorityBlockingQueue<>();


    @Override
    public void addTask(ITask task) {
        mBlockingQueue.add(task);
    }

    @Override
    public ITask findByTag(String tag) {
        for (ITask task : mBlockingQueue) {
            if (task.getTag().equals(tag)) {
                return task;
            }
        }
        return null;
    }

    @Override
    public boolean removeTask(ITask task) {

        return mBlockingQueue.remove(task);
    }

    @Override
    public Collection<ITask> getQueue() {
        return mBlockingQueue;
    }

    @Override
    public void clear() {
        mBlockingQueue.clear();
    }
}
