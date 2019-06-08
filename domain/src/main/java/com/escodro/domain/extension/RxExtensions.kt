package com.escodro.domain.extension

import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Extension to apply the default schedulers to the [Observable].
 */
fun <T> Observable<T>.applySchedulers(): Observable<T> =
    subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())

/**
 * Extension to apply the default schedulers to the [Flowable].
 */
fun <T> Flowable<T>.applySchedulers(): Flowable<T> =
    subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())

/**
 * Extension to apply the default schedulers to the [Single].
 */
fun <T> Single<T>.applySchedulers(): Single<T> =
    subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
