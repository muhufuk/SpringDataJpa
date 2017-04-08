package com.ufuk.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * Created by Ufuk on 8.04.2017.
 */
@MappedSuperclass
public class AbstractEntity
{
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Version
    private int Version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }
}
