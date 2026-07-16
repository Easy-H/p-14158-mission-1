package com.back.domain.member.member.entity

import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Member : BaseEntity {
    @Column(unique = true)
    var username: String? = null
        private set
    var password: String? = null
        private set
    var nickname: String? = null
        private set

    constructor()

    constructor(username: String?, password: String?, nickname: String?) {
        this.username = username
        this.password = password
        this.nickname = nickname
    }
}