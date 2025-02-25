package com.cantaur.api.controller;

import com.cantaur.api.service.tour.TouristStoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cantaur/api/tourist/story")
@Slf4j
@Tag(name = "여행담", description = "여행담 리뷰 API")
public class TouristStoryController {
    final TouristStoryService touristStoryService;


}
