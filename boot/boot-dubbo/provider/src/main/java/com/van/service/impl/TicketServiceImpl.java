package com.van.service.impl;

import com.van.service.TicketService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service：Dubbo也有Service注解，所以用Component区分一下
//@Component
@Service("ticketService")
public class TicketServiceImpl implements TicketService {
    @Override
    public String buyTicket() {
        return "buy";
    }
}
