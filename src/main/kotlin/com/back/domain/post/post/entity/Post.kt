package com.back.domain.post.post.entity

import com.back.domain.member.member.entity.Member
import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
class Post(
    @field:ManyToOne // Post 가 많고(Many) Member 가 적다(One) // N:1 관계
    val author: Member,
    var title: String,
    @field:Column(columnDefinition = "TEXT")
    var content: String

) : BaseEntity()