package com.kamlesh.myapplication

import kotlinx.coroutines.delay

fun main() {

}


class MyThread :Thread() {
    override fun run() {
        super.run()
    }

    override fun toString(): String {
        return super.toString()
    }

    override fun clone(): Any {
        return super.clone()
    }

    override fun start() {
        super.start()
    }

    override fun interrupt() {
        super.interrupt()
    }

    override fun isInterrupted(): Boolean {
        return super.isInterrupted()
    }

    override fun destroy() {
        super.destroy()
    }

    override fun countStackFrames(): Int {
        return super.countStackFrames()
    }

    override fun getContextClassLoader(): ClassLoader? {
        return super.getContextClassLoader()
    }

    override fun setContextClassLoader(cl: ClassLoader?) {
        super.setContextClassLoader(cl)
    }

    override fun getStackTrace(): Array<StackTraceElement> {
        return super.getStackTrace()
    }

    override fun getId(): Long {
        return super.getId()
    }

    override fun getState(): State {
        return super.getState()
    }

    override fun getUncaughtExceptionHandler(): UncaughtExceptionHandler? {
        return super.getUncaughtExceptionHandler()
    }

    override fun setUncaughtExceptionHandler(eh: UncaughtExceptionHandler?) {
        super.setUncaughtExceptionHandler(eh)
    }
}