public static String getCallerClassAndMethodName() {
    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    if (stackTrace.length <= 3) {
        return null;
    }
    
    StackTraceElement caller = stackTrace[3];
    return caller.getClassName() + "#" + caller.getMethodName();
}
