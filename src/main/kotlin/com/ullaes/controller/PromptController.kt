package com.ullaes.controller

import com.ullaes.controller.dto.PromptGenerationRequest
import com.ullaes.service.PromptService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PromptController(
    private val promptService: PromptService
) {

    @PostMapping("/generatePrompt")
    fun sendMessage(@RequestBody body: PromptGenerationRequest): String {
        return promptService.exchange(body)
    }
}