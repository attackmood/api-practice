package com.cantaur.api.model.tour.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "추천관광지 Response VO")
@Getter
@Setter
public class ResRecommendTouristSite {

    @Schema(description = "관광지일련번호", type = "String")
    private String touristSiteUid;

    @Schema(description = "관광지명", type = "String")
    private String touristSiteName;

    @Schema(description = "관광지주소", type = "String")
    private String touristSiteAddr;

    @Schema(description = "대표이미지파일아이디", type = "String")
    private String representImgFileId;

}
