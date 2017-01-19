package com.keemono.common.mapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by eduard.frades on 19/1/17.
 */
public abstract class BaseMapper {

    @Autowired
    protected CustomMapper mapper;
}
