package com.capstone.GetServices.Services;

import com.capstone.GetServices.DTOs.TicketListDTO;
import com.capstone.GetServices.DTOs.UserListDTO;
import com.capstone.GetServices.Repositories.GetInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetInfoService {
    private final GetInfoRepository getInfoRepository;

    public GetInfoService(GetInfoRepository getInfoRepository) {
        this.getInfoRepository = getInfoRepository;
    }

    public List<TicketListDTO> GetInfoTicket(){
        return getInfoRepository.getTicketList();
    }

    public List<UserListDTO> GetInfoUser(){
        return getInfoRepository.getUserList();
    }
}
