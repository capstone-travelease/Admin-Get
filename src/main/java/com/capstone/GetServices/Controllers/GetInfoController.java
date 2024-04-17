package com.capstone.GetServices.Controllers;

import com.capstone.GetServices.DTOs.ResponseTicketDTO;
import com.capstone.GetServices.DTOs.ResponseUserDTO;
import com.capstone.GetServices.Services.GetInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetInfoController {
    private final GetInfoService getInfoService;

    public GetInfoController(GetInfoService getInfoService) {
        this.getInfoService = getInfoService;
    }

    @GetMapping("/admin/api/tickets")
    public ResponseTicketDTO getTicket(){
        try {
            return new ResponseTicketDTO(
                    200,
                    getInfoService.GetInfoTicket(),
                    "Successful"
            );
        } catch (Exception error){
            return new ResponseTicketDTO(
                    error.hashCode(),
                    List.of(),
                    error.toString()
            );
        }
    }

    @GetMapping("/admin/api/users")
    public ResponseUserDTO getUser(){
        try {
            return new ResponseUserDTO(
                    200,
                    getInfoService.GetInfoUser(),
                    "Successful"
            );
        } catch (Exception error){
            return new ResponseUserDTO(
                    error.hashCode(),
                    List.of(),
                    error.toString()
            );
        }
    }
}
