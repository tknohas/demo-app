package com.example.demoapp.presentation.backingbean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Named
@RequestScoped
@Getter
@Setter
public class ReportNewBean {
  @NotBlank(message="タイトルを入力してください。")
  private String title;
  private String detail;
}
