package com.cantaur.api.touristsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "관광지태그 DTO")
@Getter
@Setter
public class TouristSiteTag {

  private Long touristSiteUid;
  private Long tagUid;
  private Long sortSeq;
  @JsonIgnore
  private LocalDateTime createdAt;




}
