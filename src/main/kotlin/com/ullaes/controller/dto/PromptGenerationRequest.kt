package com.ullaes.controller.dto

data class PromptGenerationRequest(
    val theme: String,
    val characters: List<String>
)
