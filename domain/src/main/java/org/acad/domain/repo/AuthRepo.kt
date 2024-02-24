package org.acad.domain.repo

/**
 * Created by Acad Bek on 2/24/2024
 */
interface AuthRepo {
    fun sendSmsCode(phone: String)
}