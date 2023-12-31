package com.hparadise.admin.dto.member;

import com.hparadise.admin.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class MemberSearchRequest extends BaseTimeEntity {
    private Long id;
    private String name;
    private String email;
    private String role;
    private LocalDateTime loginDate;
    private String useYn;
    private String targetDate;
    private String startDate;
    private String endDate;
    private String target;
    private String search;
}
