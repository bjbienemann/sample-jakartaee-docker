package com.agilliza.domain;

import java.net.InetAddress;

public class HostDomain {

    private final String address;
    private final String name;

    public HostDomain(InetAddress inetAddress ) {
        this.address = inetAddress.getHostAddress();
        this.name = inetAddress.getHostName();
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

}
