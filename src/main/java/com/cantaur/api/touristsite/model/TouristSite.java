package com.cantaur.api.touristsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "관광지 DTO")
@Getter
@Setter
public class TouristSite {

  private Long touristSiteUid;

  private String regionCode;

  private String touristSiteName;

  private String touristSiteAddr;

  private String representImgFileId;

  @JsonIgnore
  private LocalDateTime createdAt;

  @JsonIgnore
  private LocalDateTime changedAt;


}
