package com.ullaes.service

import com.ullaes.client.OpenChatClient
import com.ullaes.controller.dto.PromptGenerationRequest
import org.springframework.stereotype.Service

@Service
class PromptService(
    private val client : OpenChatClient
) {

    fun exchange(body: PromptGenerationRequest): String {
        return client.sendMessage(body.theme)
    }
}