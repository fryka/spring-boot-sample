package se.replior.tol5.openshiftdemo.interfaces;

import java.net.InetAddress;

public class ResponseDto {

    private String localHostName;

    public String getLocalHostIp() {
        return localHostIp;
    }

    public void setLocalHostIp(String localHostIp) {
        this.localHostIp = localHostIp;
    }

    public String getLocalHostName() {

        return localHostName;
    }

    public void setLocalHostName(String localHostName) {
        this.localHostName = localHostName;
    }

    private String localHostIp;

    public ResponseDto() {
        try {
            this.localHostName = InetAddress.getLocalHost().getHostName();
        }
        catch(Exception e) {
            this.localHostName = "unknown";
        }
        try {
            this.localHostIp = InetAddress.getLocalHost().getHostAddress();
        }
        catch(Exception e) {
            this.localHostIp = "unknown";
        }
    }
}
