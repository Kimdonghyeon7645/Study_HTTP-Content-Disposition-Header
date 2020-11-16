package com.kimdonghyeon.study.httpheader;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDownloadController {
    @GetMapping("/download")
    public ResponseEntity<String> downloadTextFile() {
        String text = "모른다는 절망보단 모르는 것을 알게 되었다는 희망을 가지자.";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=iam.txt");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(text);
    }
}
