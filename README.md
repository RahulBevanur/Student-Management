# 🎓 Student Management System

A **Spring Boot** project to manage students and their marks.  
This system allows CRUD operations on students, adding/updating marks, and sorting students based on different conditions (like standard, section, topper, etc.).

---

## 📌 Models

### 🔹 Student Model
```java
Long id;
String name;
int standard;
char section;
@Join Marks;
```

### 🔹 Subject (Marks) Model
```java
int standard;
Long id;
int 1st_Lang;
int 2nd_Lang;
int 3rd_Lang;
int Science;
int Mathematics;
int SST;
```

---

## 🚀 Features
- Add, update, delete student records
- Add and update student marks
- Fetch student details by ID or standard
- Sort and filter students based on:
  - Standard  
  - Standard + Section  
  - Marks greater/less than a value  
  - Class toppers  
  - Section toppers  

---

## 🛠 Tech Stack
- **Java 17+**  
- **Spring Boot** (Web, JPA, Validation)  
- **Hibernate**  
- **MySQL / H2 Database**  
- **Lombok**  
- **Maven**

---

## ⚙️ API Endpoints

### 🔹 Student APIs
Base URL: `http://localhost:8080`
| Method | Endpoint                     | Description             |
|--------|-------------------------------|-------------------------|
| POST   | `/api/student/add`           | Add new student        |
| GET    | `/api/student/all`           | Get all students       |
| GET    | `/api/student/all/{id}`      | Get student by ID      |
| PUT    | `/api/student/update/{id}`   | Update student         |
| DELETE | `/api/student/delete/{id}`   | Delete student         |

---

### 🔹 Marks APIs
Base URL: `http://localhost:8080`
| Method | Endpoint                     | Description             |
|--------|-------------------------------|-------------------------|
| POST   | `/api/marks/add`             | Add student marks      |
| GET    | `/api/marks/all/{id}`        | Get all marks by ID    |
| PUT    | `/api/marks/update`          | Update marks           |

---

### 🔹 Sorting & Filter APIs
Base URL: `http://localhost:8080`
| Method | Endpoint                                   | Description                                   |
|--------|---------------------------------------------|-----------------------------------------------|
| GET    | `/api/sort/{std}`                         | Get students by standard                      |
| GET    | `/api/sort/{std,section}`                 | Get students by standard & section            |
| GET    | `/api/sort/topper/{std,section}`          | Get section toppers                           |
| GET    | `/api/sort/les/{std,section,value}`       | Get students with marks `< value`             |
| GET    | `/api/sort/grt/{std,section,value}`       | Get students with marks `> value`             |
| GET    | `/api/sort/topper/{std}`                  | Get toppers by standard                       |
| GET    | `/api/sort/std/les/{value}`               | Get students with marks `< value` (any std)   |
| GET    | `/api/sort/std/grt/{value}`               | Get students with marks `> value` (any std)   |

---

## 📊 Example Data
| ID   | Standard | Subjects (Marks) |
|------|----------|------------------|
| 053  | 1        | 23, 32, 34       |
| 053  | 2        | 23, 43, 43       |

---

## 🧑‍💻 Contribution
- Fork the repository  
- Create a new feature branch  
- Commit changes and submit a PR  

---

## 📜 License
This project is licensed under the **MIT License**.
