/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author nisalsp9
 */
public class Hotel {

    private String name;
    private String nameCN;
    private String city;
    private String cate;
    private String type;
    private String chain;
    private String address;
    private String gps;
//    private String rename;
//    private String rephone;
//    private String email;
//    private String saname;
//    private String saphone;
//    private String gmname;
//    private String gmphone;

    public Hotel() {
    }

    public Hotel(String name, String nameCN, String city, String cate, String type, String chain, String address, String gps) {
        this.name = name;
        this.nameCN = nameCN;
        this.city = city;
        this.cate = cate;
        this.type = type;
        this.chain = chain;
        this.address = address;
        this.gps = gps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCN() {
        return nameCN;
    }

    public void setNameCN(String nameCN) {
        this.nameCN = nameCN;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    
}
