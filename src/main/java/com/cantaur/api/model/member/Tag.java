package com.cantaur.api.model.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "태그 DTO")
@Getter
@Setter
public class Tag {

  @Schema(description = "태그일련번호", type = "Long")
  private Long tagUid;

  @Schema(description = "태그명", type = "String")
  private String tagName;

  @JsonIgnore
  private LocalDateTime createdAt;

  @JsonIgnore
  private LocalDateTime changedAt;


}
