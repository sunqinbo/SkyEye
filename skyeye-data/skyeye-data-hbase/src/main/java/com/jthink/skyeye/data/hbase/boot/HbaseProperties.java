package com.jthink.skyeye.data.hbase.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * JThink@JThink
 *
 * @author JThink
 * @version 0.0.1
 * @desc
 * @date 2016-11-16 14:51:42
 */
@ConfigurationProperties(prefix = "spring.data.hbase")
public class HbaseProperties {

    private String quorum;

    public String getQuorum() {
        return quorum;
    }

    public void setQuorum(String quorum) {
        this.quorum = quorum;
    }
}
