package jerome.com.mainlite.domain.excutor.impls.lite;

import android.support.annotation.NonNull;

import jerome.com.mainlite.domain.excutor.IExecutorCallback;
import jerome.com.mainlite.domain.excutor.ITask;

public class LiteTask implements ITask {

//    private SimpleTask
    @Override
    public void setTag(String tag) {

    }

    @Override
    public String getTag() {
        return null;
    }

    @Override
    public void post(IExecutorCallback callback) {

    }

    @Override
    public void post(IExecutorCallback callback, long delay) {

    }

    @Override
    public boolean cancel() {
        return false;
    }

    @Override
    public int compareTo(@NonNull ITask o) {
        return 0;
    }
}
