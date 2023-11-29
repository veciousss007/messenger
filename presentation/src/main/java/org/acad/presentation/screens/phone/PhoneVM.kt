package org.acad.presentation.screens.phone

import androidx.lifecycle.ViewModel
import org.acad.domain.model.User
import org.acad.domain.usecase.SSCUseCase
import org.acad.presentation.base.BaseVM
import org.acad.presentation.screens.phone.PhoneVM.*

/**
 * Created by Acad Bek on 11/29/2023
 */
class PhoneVM constructor(
    private val sscUseCase: SSCUseCase
) : BaseVM<State, Input, Effect>() {
    data class State(
        val user: User? =null
    )
    class Effect
    class Input

    override fun getDefaultState() = State()
    override fun processInput(input: Input) {  }
}