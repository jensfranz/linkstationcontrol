package de.lwv.franz.linkstationcontrol.controller;

import de.lwv.franz.linkstationcontrol.dto.LinkstationControlDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkstationControlController {

    @RequestMapping
    public LinkstationControlDto getStatus() {
        return new LinkstationControlDto();
    }
}
