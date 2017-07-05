package com.guppy.core.domain;

import com.guppy.core.domain.enums.Status;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_idx")
    private long commentIdx;

    @Column(name = "content")
    private String content;

    @Column(name = "client_ip")
    private String clientIp;

    @Column(name = "article_idx")
    private long articleIdx;

    @Column(name = "parent_idx")
    private long parentIdx;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

    /*@Column(name = "user_name")
    private String userName;*/

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name="user_idx")
    private User user;

    @Builder
    public Comment(String content, String clientIp, long articleIdx, long parentIdx, User user) {
        this.content = content;
        this.clientIp = clientIp;
        this.articleIdx = articleIdx;
        this.parentIdx = parentIdx;
        this.user = user;
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = LocalDateTime.now();
    }

    public String getConvertModifiedAt() {
        return modifiedAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm"));
    }
}
