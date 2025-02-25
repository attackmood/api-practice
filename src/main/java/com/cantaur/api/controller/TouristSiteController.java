package com.cantaur.api.controller;

import com.cantaur.api.service.tour.TouristSiteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cantaur/api/tourist")
@Slf4j
@Tag(name = "관광지", description = "관광지 정보 API")
public class TouristSiteController {
    final TouristSiteService touristSiteService;




}
