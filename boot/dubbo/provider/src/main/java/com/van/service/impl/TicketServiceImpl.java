package com.van.service.impl;

import com.van.service.TicketService;
import org.springframework.stereotype.Component;

//@Service：Dubbo也有Service注解，所以用Component区分一下
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String buyTicket() {
        return "buy";
    }
}
