package com.senon.module_life.contract;

import com.senon.lib_common.base.BasePresenter;
import com.senon.lib_common.base.BaseResponse;
import com.senon.lib_common.base.BaseViewImp;
import com.senon.lib_common.bean.KnowledgeSysArticle;


public interface KnowledgeSysActivityCon {

    interface View extends BaseViewImp {

        void getDataResult(BaseResponse<KnowledgeSysArticle> data);

    }

    abstract class Presenter extends BasePresenter<View> {

        public abstract void getData(int cid,int page,boolean isDialog, boolean cancelable);


    }
}
