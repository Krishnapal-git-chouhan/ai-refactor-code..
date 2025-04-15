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
- Home Page
- Code Input Form
- Refactored Output
- Database Records

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
