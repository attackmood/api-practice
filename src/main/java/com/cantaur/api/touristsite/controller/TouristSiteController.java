package com.cantaur.api.touristsite.controller;

import com.cantaur.api.touristsite.service.TouristSiteService;
import com.cantaur.api.touristsite.model.Region;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cantaur/api/tourist")
@Slf4j
@Tag(name = "샘플", description = "기본 샘플 API")
public class TouristSiteController {
    final TouristSiteService touristSiteService;


    @GetMapping("/region")
    @Operation(summary = "구군 정보조회 조회", description = "구군 정보조회를 조회한다")
    @ApiResponse(
            responseCode = "200", description = "구군 정보조회 조회성공",
            content = @Content(schema = @Schema(implementation = Region.class)))
    public List<Region> getRegionList(
            @RequestHeader(name = "Accept-Language", defaultValue = "ko") String langCd
    ) {
        log.info("ㅇ아아아ㅏ");
        return touristSiteService.getRegionList();
    }

}
