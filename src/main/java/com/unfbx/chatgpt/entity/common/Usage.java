package com.unfbx.chatgpt.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：
 *
 * @author https:www.unfbx.com
 *  2023-02-15
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Usage implements Serializable {
    @JsonProperty("prompt_tokens")
    private long promptTokens;
    @JsonProperty("completion_tokens")
    private long completionTokens;
    @JsonProperty("total_tokens")
    private long totalTokens;
    @JsonProperty("prompt_tokens_details")
    private PromptTokensDetails promptTokensDetails;

    @JsonProperty("prompt_cache_hit_tokens")
    private long promptCacheHitTokens;

    @JsonProperty("prompt_cache_miss_tokens")
    private long promptCacheMissTokens;

    @Data
    public static class PromptTokensDetails {
        @JsonProperty("cached_tokens")
        private long cachedTokens;
    }

}
