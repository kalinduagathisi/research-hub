package com.kaw.research_hub;

import lombok.Data;

import java.util.List;

@Data
public class GeminiResponse {
    private List<Candidate> candidateList;

    private static class Candidate {
        private Content content;
    }

    private static class Content {
        private List<Part> parts;
    }

    private static class Part {
        private String text;
    }
}
