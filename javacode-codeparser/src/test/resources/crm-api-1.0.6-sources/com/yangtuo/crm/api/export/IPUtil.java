package com.yangtuo.crm.api.export;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author qiyu
 * @date 2018/5/22
 */
public class IPUtil {
    private static final Logger log = LoggerFactory.getLogger(IPUtil.class);

    public static String getServerIp() {
        try {
            InetAddress address = InetAddress.getLocalHost();
            return address.getHostAddress();
        } catch (UnknownHostException e) {
            log.error("IpUtil get ip error", e);
        }
        return StringUtils.EMPTY;
    }

}
