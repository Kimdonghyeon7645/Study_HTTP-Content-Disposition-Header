# Study_HTTP-Content-Disposition-Header
: Http의 Content-Disposition 헤더를 알아보고, 실제로 사용하는 파일을 다운로드 시켜주는 API 서버 만들기

## Content-Disposition 이란

- **Disposition** : 기질, 성향, 배치, 배열
- HTTP Response Header(응답 해더)의 **Content-Disposition** : HTTP Response Body(응답 바디)에서 오는 컨텐츠 기질.성향을 알려주는 속성  
-> 기본(default)값 : ```inline``` (= web에 전달되는 데이터 정도의 의미)  
-> 특수한 경우 : ```attachment``` + ```filename=파일명.확장자``` 와 함께 작성시 body에 오는 값을 브라우저가 **filename의 값(파일명.확장자)으로** 다운로드    
```
Content-disposition: attachment; filename="ppap.jpg"    (여기서 ""는 서버에서 헤더설정시 붙일 필요 없음)
```


## 참고

- [HTTP Content-Disposition란](https://lannstark.tistory.com/8)
- [ResponseEntity란](https://a1010100z.tistory.com/106)
- [이미지 다운로드(직접 WAS에서)](https://gofnrk.tistory.com/80)
- [resources 폴더에서 파일 가져오기](https://mkyong.com/spring/spring-read-file-from-resources-folder/)