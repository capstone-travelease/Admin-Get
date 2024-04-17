package com.capstone.GetServices.Repositories;

import com.capstone.GetServices.DTOs.TicketListDTO;
import com.capstone.GetServices.DTOs.UserListDTO;
import com.capstone.GetServices.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetInfoRepository extends JpaRepository<Users, Long> {
    @Query("SELECT new com.capstone.GetServices.DTOs.TicketListDTO(b.bookingId, b.checkinDate, b.checkoutDate, b.totalPrice) FROM Booking b")
    List<TicketListDTO> getTicketList();

    @Query("SELECT new com.capstone.GetServices.DTOs.UserListDTO(u.id, u.email, u.phone, u.fullname) FROM Users u WHERE u.role = 1")
    List<UserListDTO> getUserList();
}
