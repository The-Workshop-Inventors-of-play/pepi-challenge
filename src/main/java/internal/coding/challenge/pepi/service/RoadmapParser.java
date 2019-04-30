package internal.coding.challenge.pepi.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import internal.coding.challenge.pepi.domain.Roadmap;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoadmapParser {

    private final ObjectMapper objectMapper;

    public Roadmap parse(File file) throws IOException {
        return objectMapper.readValue(file, Roadmap.class);
    }
}
