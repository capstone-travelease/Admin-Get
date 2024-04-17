package com.capstone.GetServices.DTOs;

import java.util.List;

public class ResponseTicketDTO {
    private Integer code;
    private List<TicketListDTO> data;
    private String message;

    public ResponseTicketDTO(Integer code, List<TicketListDTO> data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<TicketListDTO> getData() {
        return data;
    }

    public void setData(List<TicketListDTO> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseTicketDTO{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
