package com.cantaur.api.model.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "관광지 DTO")
@Getter
@Setter
public class TouristSite {

  @Schema(description = "관광지일련번호", type = "Long")
  private Long touristSiteUid;

  @Schema(description = "지역코드", type = "String")
  private String regionCode;

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


}
