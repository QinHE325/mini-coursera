# Microservice Course

### Endpoints

#### Save Course

```
POST /api/course HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Cookie: JSESSIONID=610D816672DD87590807D1D36564BAC6
Content-Length: 83

{
"title": "test_course-3",
"subtitle": "test_subtitle-3",
"price": 8
}
```

#### Get Courses
```
GET /api/course HTTP/1.1
Host: localhost:3333
Cookie: JSESSIONID=610D816672DD87590807D1D36564BAC6
```

#### Delete Course
```
DELETE /api/course/2 HTTP/1.1
Host: localhost:3333
Cookie: JSESSIONID=610D816672DD87590807D1D36564BAC6
```