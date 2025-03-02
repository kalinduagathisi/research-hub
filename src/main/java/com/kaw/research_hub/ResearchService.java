package com.kaw.research_hub;

import org.springframework.stereotype.Service;

@Service
public class ResearchService {

    public String processContent(ResearchRequest researchRequest) {
        // build the prompt
        // query the AI model API
        // parse the response
        // return response
        return null;
    }

    private String buildPrompt(ResearchRequest researchRequest) {
        StringBuilder prompt = new StringBuilder();
        switch (researchRequest.getOperation()) {
            case "summarize:":
                prompt.append("Provide a clear and concise summery of the following text in few sentences:\n\n");
                break;
            case "suggest":
                prompt.append("Based on the following content, suggest related topics and further reading. Format the response with clear headings and bullet points:\n\n");
                break;
            default:
                throw new IllegalArgumentException("Unkown Operation: " + researchRequest.getOperation());
        }
        prompt.append(researchRequest.getContent());
        return prompt.toString();
    }
}
