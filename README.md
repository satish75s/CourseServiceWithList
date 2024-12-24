# CourseServiceWithList


POST:http://localhost:8080/course/addCourse

Payload:
{
  "courseId": 0,
  "name": "ssk",
  "startDate": "27/06/1980",
  "fees": 2000,
  "certificateAvailable": true
}

Payload Response:
{
  "courseId": 81,
  "name": "ssk",
  "startDate": "27/06/1980",
  "fees": 2000,
  "certificateAvailable": true
}

Payload:
{
  "courseId": 0,
  "name": "Ram",
  "startDate": "28/08/1990",
  "fees": 3000,
  "certificateAvailable": false
}

Payload Response:
{
  "courseId": 2298,
  "name": "Ram",
  "startDate": "28/08/1990",
  "fees": 3000,
  "certificateAvailable": false
}

GET: http://localhost:8080/course/findAll

Response Body:
[
  {
    "courseId": 81,
    "name": "ssk",
    "startDate": "27/06/1980",
    "fees": 2000,
    "certificateAvailable": true
  },
  {
    "courseId": 2298,
    "name": "Ram",
    "startDate": "28/08/1990",
    "fees": 3000,
    "certificateAvailable": false
  }
]

GET: http://localhost:8080/course/searchCourseById/81
{
  "courseId": 81,
  "name": "ssk",
  "startDate": "27/06/1980",
  "fees": 2000,
  "certificateAvailable": true
}	

GET: http://localhost:8080/course/search/request?courseId=2298
{
  "courseId": 2298,
  "name": "Ram",
  "startDate": "28/08/1990",
  "fees": 3000,
  "certificateAvailable": false
}

PUT: http://localhost:8080/course/updateCourse/83
Request Body:
{
  "courseId": ,
  "name": "kumar",
  "startDate": "27/05/1990",
  "fees": 5000,
  "certificateAvailable": false
}

Response Body:
{
  "courseId": 83,
  "name": "kumar",
  "startDate": "27/05/1990",
  "fees": 5000,
  "certificateAvailable": false
}

DELETE:
http://localhost:8080/course/deleteCourse/83

