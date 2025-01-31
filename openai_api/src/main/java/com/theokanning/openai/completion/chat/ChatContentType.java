package com.theokanning.openai.completion.chat;

/**
 * see {@link ChatMessage} documentation.
 */
public enum ChatContentType {
    TEXT("text"),
    IMAGE_URL("image_url");

    private final String value;

    ChatContentType(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
