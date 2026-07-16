package com.back.domain.post.post.entity

import com.back.domain.member.member.entity.Member
import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

@Entity
class Post : BaseEntity {
    @ManyToOne // Post 가 많고(Many) Member 가 적다(One) // N:1 관계
    var author: Member? = null // 필드명 : AUTHOR_ID, 설명 : MEMBER 테이블의 ID값이 저장
        private set
    var title: String? = null

    @Column(columnDefinition = "TEXT")
    var content: String? = null

    constructor()

    constructor(author: Member?, title: String?, content: String?) {
        this.author = author
        this.title = title
        this.content = content
    }
}