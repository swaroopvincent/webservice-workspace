package com.swarup.learning.webservice;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * Created by swaroop on 14/12/16.
 */
public class GeoIpLocator {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("Please provide the ipAddress for the service!");
        }
        else {
            String ipAddress = args[0];
            GeoIPService ipService = new GeoIPService();
            GeoIPServiceSoap ipServiceSoap = ipService.getGeoIPServiceSoap();
            GeoIP geoIP = ipServiceSoap.getGeoIP(ipAddress);
            System.out.println("ipAddress :: "+ ipAddress + ", Location :: "+ geoIP.getCountryName());
        }
    }
}
