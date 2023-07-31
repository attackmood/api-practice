package com.cantaur.api.model.tour;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "관광지태그 DTO")
@Getter
@Setter
public class TouristSiteTag {

  @Schema(description = "관광지일련번호", type = "Long")
  private Long touristSiteUid;

  @Schema(description = "태그일련번호", type = "Long")
  private Long tagUid;

  @Schema(description = "정렬순서", type = "Long")
  private Long sortSeq;
  
  @JsonIgnore
  private LocalDateTime createdAt;




}
