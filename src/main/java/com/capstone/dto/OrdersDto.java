package com.capstone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class OrdersDto {
    private int u_id;
    private int p_id;
    private String menu;
    private int price;
    private String request;
    private int fee;
    private boolean remit;

    @Override
    public String toString() {
        return "OrderDto{" +
                "uId=" + u_id +
                ", pId='" + p_id + '\'' +
                ", menu='" + menu + '\'' +
                ", price=" + price +
                ", request='" + request + '\'' +
                ", fee=" + fee +
                ", remit=" + remit +
                '}';
    }
}
