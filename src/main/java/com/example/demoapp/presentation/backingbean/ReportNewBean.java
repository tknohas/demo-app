package com.example.demoapp.presentation.backingbean;

import com.example.demoapp.infrastructure.repository.ReportRepository;

import dto.ReportDto;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
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

  @Inject
  private ReportRepository reportRepository;

  public void create() {
    ReportDto newReport = new ReportDto();
    newReport.setTitle(title);
    newReport.setDetail(detail);
    reportRepository.create(newReport);
  }
}
