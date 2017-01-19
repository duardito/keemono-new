package com.keemono.core.base;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by eduard.frades on 18/1/17.
 */
@MappedSuperclass
public abstract class AbstractDomain implements Serializable {

    public AbstractDomain(String className) {
        this.setUuid(uuid = className+":"+uuid);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {

        if (uuid == null) {
            return UUID.randomUUID().toString();
        }
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
