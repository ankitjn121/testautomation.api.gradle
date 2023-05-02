package com.pratilipi.automation.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.testng.Reporter;

import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * @author ankitjain
 */
public class Log {

    private static Logger logger;

    public static Logger getLogger() {
        return Log.logger;
    }
    private static final ThreadLocal<String> logDirectory = new InheritableThreadLocal<>();

    private static String getCallerMethodName() {
        final StackTraceElement[] frame = Thread.currentThread()
                .getStackTrace(); //to get the caller info skip frame is 3, get stack info 3 level down
        return frame[4].getMethodName();
    }

    /**
     *
     */
    private static String getCallerClassName() {
        final StackTraceElement[] frame = Thread.currentThread()
                .getStackTrace(); //to get the caller info skip frame is 3, get stack info 3 level down
        return frame[4].getClassName();
    }

    /**
     * @param message
     */
    private static String getFormattedMessage(final String message) {

        //set the value in log4j2 xml file using system.set property
        ThreadContext.put("logPath", Log.logDirectory.get());
        // set the correct lof file - this will enable to writ logs in different files in Multithreaded applications
        ThreadContext.put("logFilename", Thread.currentThread().getName() + "_" + Thread.currentThread().getId());

        return "[" + Log.getCallerClassName() + "." + Log.getCallerMethodName() + "] - " + message;
    }

    /**
     * Initialise logger.
     *
     * @param appType the app type
     * @param logPath the log path
     */
    public static void initialiseLogger(final Type appType, final String logPath) {
        try {

            System.setProperty("javax.xml.parsers.DocumentBuilderFactory", "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");

            Log.logDirectory.set(logPath);
            Log.logger = (LogManager.getLogger(appType));
            Log.getLogger().info(Log.getFormattedMessage("Logger initialised for " + appType.getTypeName()));

        } catch (final Exception ex) {
            logger.debug("exception when initialising the logger for " + appType.getTypeName());
            logger.debug(ex.getMessage());
            logger.trace(Arrays.toString(ex.getStackTrace()));
        }

    }

    //endregion Logger initialize functions

    //region Log functions

    /**
     * Error.
     *
     * @param message the message
     */
    public static void error(final String message) {
        if (Log.getLogger() == null) {
            logger.error("error - " + Log.getFormattedMessage(message));
            return;
        }
        Log.getLogger().error(Log.getFormattedMessage(message));
    }

    /**
     * Warn.
     *
     * @param message the message
     */
    public static void warn(final String message) {
        if (Log.getLogger() == null) {
            logger.warn("warn - " + Log.getFormattedMessage(message));
            return;
        }
        Log.getLogger().warn(Log.getFormattedMessage(message));
    }

    /**
     * Fatal.
     *
     * @param message the message
     */
    public static void fatal(final String message) {
        if (Log.getLogger() == null) {
            logger.fatal("fatal - " + Log.getFormattedMessage(message));
            return;
        }
        Log.getLogger().fatal(Log.getFormattedMessage(message));
    }

    /**
     * Info.
     *
     * @param message the message
     */
    public static void info(final String message) {
        if (Log.getLogger() == null) {
            logger.info("info - " + Log.getFormattedMessage(message));
            return;
        }
        Log.getLogger().info(Log.getFormattedMessage(message));
    }

    /**
     * Info.
     *
     * @param message the message
     */
    public static void result(final String message) {
        Log.info(Log.getFormattedMessage(message));
        Reporter.log(message + "</br>");
    }

    /**
     * Debug.
     *
     * @param message the message
     */
    public static void debug(final String message) {
        if (Log.getLogger() == null) {
            logger.debug("debug - " + Log.getFormattedMessage(message));
            return;
        }
        Log.getLogger().debug(Log.getFormattedMessage(message));
    }

    /**
     * Trace.
     *
     * @param message the message
     */
    public static void trace(final String message) {
        if (Log.getLogger() == null) {
            logger.trace("debug - " + Log.getFormattedMessage(message));
            return;
        }
        Log.getLogger().trace(Log.getFormattedMessage(message));
    }

    /**
     * Assertion error.
     *
     * @param ex the ex
     */
    public static void assertionError(final AssertionError ex) {
        logger.error("error - " + Log.getFormattedMessage(ex.getMessage()));
        logger.trace("Stack Trace - " + Arrays.toString(ex.getStackTrace()));
    }

    /**
     * Exception.
     *
     * @param ex the ex
     */
    public static void exception(final Exception ex) {
        Log.getLogger().warn(Log.getFormattedMessage(ex.getMessage()));
        Log.getLogger().debug("Stack Trace - " + Arrays.toString(ex.getStackTrace()));
    }

}

