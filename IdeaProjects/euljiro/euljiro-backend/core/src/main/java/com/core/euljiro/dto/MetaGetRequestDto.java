package com.core.euljiro.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MetaGetRequestDto {
    private String word;
    private String comments;
    private String fstCrtId;
    private String lstMdfId;

    @Builder
    public MetaGetRequestDto(String word, String comments, String fstCrtId, String lstMdfId){
        this.word= word;
        this.comments=comments;
        this.fstCrtId = fstCrtId;
        this.lstMdfId = lstMdfId;
    }


}
