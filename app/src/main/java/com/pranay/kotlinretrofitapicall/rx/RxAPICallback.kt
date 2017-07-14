package com.pranay.kotlinretrofitapicall.rx

/**
 * Created by  on 7/15/2017.
 */
interface RxAPICallback<P> {
    fun onSuccess(t: P)

    fun onFailed(throwable: Throwable)
}