package org.acad.domain.repo

/**
 * Created by Acad Bek on 11/29/2023
 */
interface AuthRepo {
    fun sendSmsCode(phone: String)
}