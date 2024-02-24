package org.acad.presentation.screen.phone

import org.acad.domain.model.User
import org.acad.domain.usecase.auth.SendSmsCodeUseCase
import org.acad.presentation.base.BaseVM
import org.acad.presentation.screen.phone.PhoneVM.*

/**
 * Created by Acad Bek on 2/24/2024
 */
class PhoneVM(
    private val SendSmsCodeUseCase: SendSmsCodeUseCase
) : BaseVM<State, Input, Effect>() {
    data class State (
        val user: User? = null
    )
    class Input
    class Effect

    override fun getDefaultState() = State()
    override fun processInput(input: Input) {
        TODO("Not yet implemented")
    }
}