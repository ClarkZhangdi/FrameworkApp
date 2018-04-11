package jerome.com.mainlite.base.presenter;


import java.util.ArrayList;
import java.util.List;

import jerome.com.mainlite.domain.utils.LogUtil;

public abstract class AbsBasePresenter<T extends IBaseView> implements IBasePresenter {


    private T mView;
    private List<String> mTasks;

    public T getBaseView() {
        return mView;
    }

    public void addTaskTag(String tag) {
        if (mTasks == null) {
            mTasks = new ArrayList<>();
        }
        mTasks.add(tag);
    }

    @Override
    public void destroy() {
        LogUtil.w("AbsBasePresenter destroy");
        if (mTasks!=null&& !mTasks.isEmpty()){
            for (String tag:mTasks){
            }
        }
    }
}
