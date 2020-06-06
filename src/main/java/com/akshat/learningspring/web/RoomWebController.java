package com.akshat.learningspring.web;

import com.akshat.learningspring.business.service.ReservationService;
import com.akshat.learningspring.data.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomWebController {
    private final ReservationService reservationService;

    @Autowired
    public RoomWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        List<Room> rooms = this.reservationService.getAllRooms();
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}

