package com.qqkj.inspection.common.function;

@FunctionalInterface
public interface CacheSelector<T> {
    T select() throws Exception;
}
