# AI-Powered Code Refactoring Assistant 🧠💻

An intelligent web application that leverages an LLM (OpenRouter API) to analyze and refactor Java code, improving readability and efficiency. Built with Spring Boot and MySQL, the tool offers developers an instant way to optimize and clean their Java code.

---

## 🚀 Features

- ✅ Refactors Java code using AI (OpenRouter - LLaMA3 8B model)
- ✅ REST API integration with secure API key handling
- ✅ Interactive web interface built using Spring MVC
- ✅ Code history tracking with MySQL and JPA
- ✅ Error handling for invalid input/API issues

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot, Spring MVC, Spring Data JPA
- **Frontend:** Thymeleaf, HTML, CSS
- **Database:** MySQL
- **API Integration:** OpenRouter API (LLaMA 3 model)
- **Testing & Debugging:** Postman
- **Build Tool:** Maven
- **IDE:** Spring Tool Suite (STS)

---

## 📸 Screenshots

> Include screenshots of:

- Code Input Form
- ![code refactor](https://github.com/user-attachments/assets/ac7c93e3-2840-4a31-a98d-b296772ff1aa)

- Refactored Output
![code refactor 2](https://github.com/user-attachments/assets/1f01543d-df26-4fda-a8ed-b2c87c9d774e)

- Database Records
- ![code refactor 3](https://github.com/user-attachments/assets/b85a5756-f385-4909-a68a-7e41800421de)


---

## ⚙️ How It Works

1. User inputs raw Java code in a form.
2. Backend sends the code to OpenRouter API via a secured REST request.
3. API responds with optimized/refactored Java code.
4. Refactored code is displayed on the frontend and stored in the database.

---

## 🔐 API Key Management

To keep your API key secure:

- Store the OpenRouter key in `application.properties`:
  ```properties
  openrouter.api.key=YOUR_API_KEY
