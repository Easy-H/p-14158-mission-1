package com.back.domain.post.post.entity

import com.back.domain.member.member.entity.Member
import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

@Entity
class Post(
    @ManyToOne // Post 가 많고(Many) Member 가 적다(One) // N:1 관계
    var author: Member? = null,
    var title: String? = null,
    @Column(columnDefinition = "TEXT")
    var content: String? = null

) : BaseEntity() {

    constructor() : this(null, null, null)

}