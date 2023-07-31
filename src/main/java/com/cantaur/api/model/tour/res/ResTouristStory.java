package com.cantaur.api.model.tour.res;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "여행담 Response VO")
@Getter
@Setter
public class ResTouristStory {

    @Schema(description = "여행담일련번호", type = "Long")
    private String touristStoryUid;

    @Schema(description = "관광지일련번호", type = "Long")
    private String touristSiteUid;

    @Schema(description = "날짜정보(ex.2023년 1월 19일 목요일)", type = "Long")
    private String dateInfo;

    @JsonIgnore
    private String memberUid;

    @Schema(description = "여행담내용", type = "String")
    private String contents;

    @Schema(description = "좋아요개수", type = "Long")
    private Long heartCount;

    @Schema(description = "여행담좋아요여부", type = "String")
    private String heartYn;

    @Schema(description = "사용자 게시물 여부", type = "String")
    private String userContentsYn;



}
