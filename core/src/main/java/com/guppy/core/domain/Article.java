package com.guppy.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "article")
public class Article {

    @Id
    @Column(name = "article_idx")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long articleIdx;

    @Column(name = "article_title")
    private String title;

    @Column(name = "article_content")
    private String content;

    @Column(name = "service_type")
    private String serviceType;

    @Builder
    public Article(String title, String content, String serviceType) {
        this.title = title;
        this.content = content;
        this.serviceType = serviceType;
    }
}