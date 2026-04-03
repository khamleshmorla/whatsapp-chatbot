# 📱 WhatsApp Chatbot Backend (Spring Boot)

## 🚀 Overview

This project is a WhatsApp chatbot backend simulation built using Spring Boot.
It exposes a REST API that receives messages (simulating WhatsApp input) and returns predefined responses.

The application demonstrates core backend concepts such as:
- REST API development
- Dependency Injection (IoC)
- Exception Handling
- Logging

---

## 🛠️ Tech Stack
- Java 17+
- Spring Boot
- Maven
- SLF4J (Logging)
- Postman (API Testing)

---

## 📂 Project Structure

```text
com.chatbot.whatsapp_bot
│
├── controller        (Handles API requests)
├── service           (Business logic)
├── model             (Request & Response DTOs)
├── exception         (Custom + global exception handling)
└── main              (Application entry point)
```

---

## 🔗 API Endpoint

**POST** `/webhook`

Simulates receiving a WhatsApp message.

---

## 📥 Sample Request

```json
{
  "message": "Hi"
}
```

---

## 📤 Sample Responses

**Valid Input:**

```json
{
  "reply": "Hello"
}
```

**Another Input:**

```json
{
  "reply": "Goodbye"
}
```

**Invalid Input:**

```text
Message cannot be empty
```

---

## ⚙️ Features

1. **REST API**
   - Accepts JSON input
   - Returns JSON response

2. **Dependency Injection**
   - Constructor-based injection used
   - Managed by Spring IoC container

3. **Exception Handling**
   - Custom exception (`InvalidMessageException`)
   - Global handler using `@ControllerAdvice`

4. **Logging**
   - Implemented using SLF4J
   - Logs incoming messages and responses

**Example logs:**
```text
Incoming Message: Hi
Bot reply: Hello
```

---

## 🧪 Testing

Tested using Postman with:
- Valid inputs (Hi, Bye)
- Invalid input (empty message)

---

## ▶️ How to Run

1. Clone the repository
   ```bash
   git clone https://github.com/khamleshmorla/whatsapp-chatbot.git
   ```
2. Open in IDE (Eclipse/IntelliJ)
3. Run the main class:
   `WhatsappBotApplication.java`
4. Server will start at:
   `http://localhost:8080`

---

## 🎯 Conclusion

This project serves as a foundational example of building a robust and scalable RESTful backend service using Spring Boot. It highlights essential practices such as dependency injection, structured project layout, elegant exception handling, and functional API design—the perfect starting point for developing more complex messaging or chatbot applications.

---

## 👨‍💻 Author

**Khamlesh**
- [GitHub](https://github.com/khamleshmorla)
- [LinkedIn](www.linkedin.com/in/khamleshmorla)
