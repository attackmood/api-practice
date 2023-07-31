package com.cantaur.api.model.tour.res;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "관광지 Response VO")
@Getter
@Setter
public class ResTouristSite {

  @Schema(description = "관광지일련번호", type = "Long")
  private Long touristSiteUid;

  @Schema(description = "지역코드", type = "String")
  private String regionCode;

  @Schema(description = "지역명", type = "String")
  private String regionName;

  @Schema(description = "관광지명", type = "String")
  private String touristSiteName;

  @Schema(description = "관광지주소", type = "String")
  private String touristSiteAddr;

  @Schema(description = "대표이미지", type = "String")
  private String representImgFileId;

  @JsonIgnore
  private LocalDateTime createdAt;

  @JsonIgnore
  private LocalDateTime changedAt;

  @Schema(description = "관광지태그리스트", type = "TouristSiteTag")
  private List<ResTouristSiteTag> touristSiteTagList;

  @Schema(description = "추천관광지리스트", type = "ResRecommendTouristSite")
  private List<ResRecommendTouristSite> recommendTouristSiteList;










}
