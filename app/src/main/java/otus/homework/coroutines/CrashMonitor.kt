package otus.homework.coroutines

import android.util.Log

object CrashMonitor {
    private const val TAG = "CrashMonitor"

    /**
     * Pretend this is Crashlytics/AppCenter
     */
    fun trackWarning(ex: Throwable) {
        Log.e(TAG, ex.message.toString())
    }
}