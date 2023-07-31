package com.cantaur.api.controller;

import com.cantaur.api.model.SuccessResponse;
import com.cantaur.api.model.tour.Region;
import com.cantaur.api.model.tour.res.ResTouristSite;
import com.cantaur.api.service.tour.TouristSiteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cantaur/api/tourist")
@Slf4j
@Tag(name = "관광지", description = "관광지 정보 API")
public class TouristSiteController {
    final TouristSiteService touristSiteService;



    /**
     * 울산의 지역리스트를 조회합니다.
     * @return SuccessResponse
     */
    @GetMapping("/region")
    @Operation(summary = "지역 정보조회 조회", description = "지역 정보조회를 조회한다")
    @ApiResponse(
            responseCode = "200", description = "지역 정보조회 조회성공",
            content = @Content(schema = @Schema(implementation = Region.class)))
    public SuccessResponse getRegionList() {
        return new SuccessResponse(touristSiteService.getRegionList());
    }






    /**
     * 지역코드로 관광지리스트를 조회합니다.
     * @param regionCd
     * @return SuccessResponse
     */
    @GetMapping("/{regionCd}")
    @Parameter(name = "regionCd", description = "지역코드", in = ParameterIn.PATH)
    @Operation(summary = "관광지 리스트 조회", description = "각 구군의 관광지 리스트를 조회한다")
    @ApiResponse(responseCode = "200", description = "관광지 리스트 조회성공"
            , content = @Content(schema = @Schema(implementation = ResTouristSite.class)))
    public SuccessResponse getTouristSiteList(
            @PathVariable("regionCd") String regionCd
    ) {
        return new SuccessResponse(touristSiteService.getTouristSiteList(regionCd));
    }


    /**
     * 관광지일련번호로 관광지상세정보를 조회합니다.
     * @param touristSiteUid
     * @return SuccessResponse
     */
    @GetMapping("/site/{touristSiteUid}")
    @Parameter(name = "touristSiteUid", description = "관광지일련번호", in = ParameterIn.PATH)
    @Operation(summary = "관광지 상세정보 조회", description = "관광지 상세정보를 조회한다")
    @ApiResponse(responseCode = "200", description = "관광지 상세정보 조회성공"
            , content = @Content(schema = @Schema(implementation = ResTouristSite.class)))
    public SuccessResponse getTouristSite(@PathVariable("touristSiteUid") Long touristSiteUid) {
        return new SuccessResponse(touristSiteService.getTouristSite(touristSiteUid));
    }








}
