package com.azelart.vlille.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Weather DTO.
 * @author Corentin Azelart
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ServerDTO {

    /**
     * Server name.
     */
    private String name;

    /**
     * Server port.
     */
    private Integer port;

    /**
     * Hazelcast ip.
     */
    private String hazelcastName;

    /**
     * Hazelcast port.
     */
    private Integer hazelcastPort;

    /**
     * Instances.
     */
    private List<InstanceDTO> instances;
}
