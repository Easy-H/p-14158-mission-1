package com.back.domain.member.member.entity

import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Member(
    @Column(unique = true)
    var username: String? = null,

    var password: String? = null,

    var nickname: String? = null) : BaseEntity() {

    constructor() : this(null, null, null)

}