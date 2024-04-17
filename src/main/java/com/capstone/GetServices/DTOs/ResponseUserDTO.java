package com.capstone.GetServices.DTOs;

import java.util.List;

public class ResponseUserDTO {
    private Integer code;
    private List<UserListDTO> data;
    private String message;

    public ResponseUserDTO(Integer code, List<UserListDTO> data, String message) {
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

    public List<UserListDTO> getData() {
        return data;
    }

    public void setData(List<UserListDTO> data) {
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
        return "ResponseUserDTO{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
