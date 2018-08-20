package com.github.mgl.fizz_buzz_whizz;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameNumber {

  private Integer fizz;
  private Integer buzz;
  private Integer whizz;
}
