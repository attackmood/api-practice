package com.cantaur.api.controller;

import com.cantaur.api.model.SuccessResponse;
import com.cantaur.api.model.tour.req.ReqTouristStory;
import com.cantaur.api.model.tour.req.ReqTouristStoryHeart;
import com.cantaur.api.model.tour.res.ResTouristStory;
import com.cantaur.api.service.tour.TouristStoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cantaur/api/tourist/story")
@Slf4j
@Tag(name = "여행담", description = "여행담 리뷰 API")
public class TouristStoryController {
    final TouristStoryService touristStoryService;



    /**
     * 해당 관광지의 여행담 리스트를 조회합니다.
     * @return SuccessResponse
     */
    @GetMapping("/{touristSiteUid}")
    @Parameter(name = "touristSiteUid", description = "관광지일련번호", in = ParameterIn.PATH)
    @Operation(summary = "여행담 리뷰 리스트 조회", description = "여행담 리뷰 리스트를 조회한다")
    @ApiResponse(responseCode = "200", description = "여행담리뷰 리스트 조회성공"
            , content = @Content(schema = @Schema(implementation = ResTouristStory.class)))
    public SuccessResponse getTouristStoryList(@PathVariable("touristSiteUid") Long touristSiteUid){
        return new SuccessResponse(touristStoryService.getTouristStoryList(touristSiteUid));
    }


    @PostMapping("")
    @Operation(summary = "여행담 리뷰 등록", description = "여행담 커뮤니티에 리뷰를 등록한다.")
    public SuccessResponse insertTouristStory(
            @RequestBody @Valid ReqTouristStory reqTouristStory
    ){
        touristStoryService.insertTouristStory(reqTouristStory);
        return new SuccessResponse();
    }


    @PostMapping("/heart")
    @Operation(summary = "여행담 좋아요", description = "여행담 게시물에 좋아요를 누른다")
    public SuccessResponse insertTouristStoryHeart(
            @RequestBody @Valid ReqTouristStoryHeart reqTouristStoryHeart
    ){
        touristStoryService.insertTouristStoryHeart(reqTouristStoryHeart);
        return new SuccessResponse();
    }


    @DeleteMapping("/{touristStoryUid}")
    @Operation(summary = "여행담리뷰 삭제", description = "여행담리뷰를 삭제한다.")
    public SuccessResponse deleteTouristStory(
            @PathVariable @Valid Long touristStoryUid
    ){
        touristStoryService.deleteTouristStory(touristStoryUid);
        return null;
    }



}
