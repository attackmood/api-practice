package com.cantaur.api.touristsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "태그 DTO")
@Getter
@Setter
public class Tag {

  private Long tagUid;

  private String tagName;

  @JsonIgnore
  private LocalDateTime createdAt;

  @JsonIgnore
  private LocalDateTime changedAt;


}
