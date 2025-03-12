
# 🚀 Virtual Queue Management System  

A **Java-based Virtual Queue Management System** designed to efficiently manage customer queues using a **priority-based token mechanism**. This project follows **Object-Oriented Programming (OOP) principles**, ensuring modularity, scalability, and maintainability.  

## 📌 Features  
✔ **Virtual Token System** – Customers receive tokens instead of waiting in physical queues  
✔ **VIP Priority Handling** – VIP customers are served first  
✔ **First-In-First-Out (FIFO) Processing** – Regular customers are served in order of arrival  
✔ **Automated Token Generation** – Unique tokens generated using a thread-safe counter  
✔ **Queue Management** – View and manage the queue in real time  
✔ **User-Friendly Console Interface** – Simple and intuitive CLI-based interaction  

---

## 🎯 **OOP Principles Implemented**
### ✅ **Encapsulation**
- Each class (`Customer`, `Token`, `QueueManage`, `ServiceDesk`) encapsulates data and provides controlled access through getter methods.

### ✅ **Inheritance**
- The `Token` class **implements** `Comparable<Token>` to enable **customized sorting logic** for prioritizing VIP customers.

### ✅ **Polymorphism**
- The `compareTo` method in `Token` **overrides** the default sorting behavior to prioritize VIPs while maintaining FIFO for regular customers.

---

## 📁 **Project Structure**
```
📦 VirtualQueueSystem
 ┣ 📂 src
 ┃ ┣ 📂 Entities
 ┃ ┃ ┣ 📜 Customer.java       # Defines customer attributes (Encapsulation)
 ┃ ┃ ┣ 📜 QueueManage.java    # Manages the customer queue (Encapsulation)
 ┃ ┃ ┣ 📜 ServiceDesk.java    # Handles the customer service process
 ┃ ┃ ┣ 📜 Token.java          # Generates and prioritizes tokens (Polymorphism)
 ┃ ┃ ┣ 📜 Main.java           # Entry point, user interaction & CLI logic
```

---

## 🚀 **Setup and Execution**
### 🔹 **Prerequisites**
- Java Development Kit (JDK) **8 or later**
- Java compiler (`javac`) and runtime (`java`)

### 🔹 **Clone the Repository**
```bash
git clone https://github.com/your-username/VirtualQueueSystem.git
```

### 🔹 **Navigate to the Project Directory**
```bash
cd VirtualQueueSystem/src
```

### 🔹 **Compile and Run the Application**
```bash
javac Entities/*.java
java Entities.Main
```

---

## 🖥️ **How It Works (With Example Input/Output)**
### 🏷️ **Step 1: Running the Program**
```bash
java Entities.Main
```

### 🏷️ **Step 2: Menu Options**
```
==== Virtual Queue System ====
1. Get Token
2. Call Next Customer
3. Display Queue
4. Exit
Enter your choice: 
```

### 🏷️ **Step 3: Adding Customers**
#### 🔹 Input:
```
Enter customer name: Ayan
Is this a VIP customer? (yes/no): no
```
#### 🔹 Output:
```
Token generated: 1 for Ayan
```

#### 🔹 Input:
```
Enter customer name: Amit
Is this a VIP customer? (yes/no): yes
```
#### 🔹 Output:
```
Token generated: 2 for Amit
```

### 🏷️ **Step 4: Displaying Queue**
#### 🔹 Input:
```
3 (Display Queue)
```
#### 🔹 Output:
```
Current Queue:
Token 2 - Amit (VIP: true)
Token 1 - Ayan(VIP: false)
```

### 🏷️ **Step 5: Calling Next Customer**
#### 🔹 Input:
```
2 (Call Next Customer)
```
#### 🔹 Output:
```
Now serving: Token 2 - Amit
```

### 🏷️ **Step 6: Calling Another Customer**
#### 🔹 Input:
```
2 (Call Next Customer)
```
#### 🔹 Output:
```
Now serving: Token 1 - Ayan
```

### 🏷️ **Step 7: Calling Next When Queue is Empty**
#### 🔹 Input:
```
2 (Call Next Customer)
```
#### 🔹 Output:
```
No customers in the queue.
```

---

## 🔮 **Future Enhancements**
🔹 **Graphical User Interface (GUI)** – Implement a modern interface using **JavaFX/Swing**  
🔹 **Real-time Notifications** – Notify customers when their turn is near  
🔹 **Database Integration** – Store customer records for improved tracking  
🔹 **Multi-Service Desks** – Extend support for multiple service points  

---

## 📜 **License**
This project is open-source and available under the **MIT License**.

---

## 🤝 **Contributing**
Contributions are welcome! Feel free to submit issues or pull requests to improve the system.

---

## 📧 **Contact**
For any inquiries, reach out via:  
📩 Email: sarkarayan153@gmail.com 

```
