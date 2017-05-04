package com.animate.until;

import java.lang.reflect.ParameterizedType;

/**
 *
 * Created by Administrator on 2017/1/17.
 */
public class Logger<T> {
    private Class<T> entityClass;
    private String className;
    private org.apache.log4j.Logger logger;

    public Logger() {
        entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        className = entityClass.getName();
        logger = org.apache.log4j.Logger.getLogger(this.entityClass);
    }

    public void loggerInfo(String str) {
        logger.info(this.getClass() + ":" + str);
    }

    public void loggerDebug(String str) {
        logger.debug(this.getClass() + ":" + str);
    }

    public void loggerError(String str) {
        logger.error(this.getClass() + ":" + str);
    }

    public void loggerWarn(String str) {
        logger.warn(this.getClass() + ":" + str);
    }

    public void loggerFatal(String str) {
        logger.fatal(this.getClass() + ":" + str);
    }

    public org.apache.log4j.Logger getLogger() {
        return logger;
    }

    public Logger setLogger(org.apache.log4j.Logger logger) {
        this.logger = logger;
        return this;
    }
}
