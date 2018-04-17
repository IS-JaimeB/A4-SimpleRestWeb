package org.conversor;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/conversor")
public class ConversorResource {
    @GET
    public String decimal(@QueryParam("conversor") long conversor) {
        return Long.toString(xdecimal(conversor));
    }

    long xdecimal(long conversor) {
        String binary = "";
        while(conversor>0){
            binary=(conversor%2)+binary;
            conversor=conversor/2;
        }
        return Long.parseLong(binary);
    }
}