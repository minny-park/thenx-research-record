package org.thenx.record.recordspringaop.service;

/**
 * @author May
 * <p>
 * 普通接口
 */
@FunctionalInterface
public interface AopService {

    /**
     * 返回个接口
     *
     * @param param 整型参数
     */
    String resp(int param);
}
