package com.capstone.GetServices.DTOs;

import java.util.Date;

public class TicketListDTO {
    private Integer ticket_id;
    private Date checkin_date;
    private Date checkout_date;
    private Long total;

    public TicketListDTO(Integer ticket_id, Date checkin_date, Date checkout_date, Long total) {
        this.ticket_id = ticket_id;
        this.checkin_date = checkin_date;
        this.checkout_date = checkout_date;
        this.total = total;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Date getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(Date checkin_date) {
        this.checkin_date = checkin_date;
    }

    public Date getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(Date checkout_date) {
        this.checkout_date = checkout_date;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TicketListDTO{" +
                "ticket_id=" + ticket_id +
                ", checkin_date=" + checkin_date +
                ", checkout_date=" + checkout_date +
                ", total=" + total +
                '}';
    }
}
