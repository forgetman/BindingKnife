package knife

import android.view.View
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable

/**
 * @author yuansui
 * @since 2018/6/5
 */
fun View.clicks(): Observable<Any> {
    return RxView.clicks(this)
}

fun View.clicks(action: () -> Unit) {
    RxView.clicks(this).subscribe {
        action()
    }
}

fun View.longClicks(): Observable<Any> {
    return RxView.longClicks(this)
}

fun View.longClicks(action: () -> Unit) {
    RxView.longClicks(this).subscribe { action() }
}