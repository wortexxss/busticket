# Bus Ticket Calculator 🚌💰

A simple Java program that calculates bus ticket prices based on distance, age discounts, and trip type (one-way or round-trip). This project demonstrates basic Java concepts such as conditional statements, user input handling, and simple mathematical operations.

## 🚀 Features
- ✅ Calculates ticket price based on **distance (km)**
- ✅ Applies **age-based discounts**
- ✅ Supports **one-way and round-trip fares**
- ✅ Simple and user-friendly **console interface**

## 📌 How It Works
1. The user enters the **distance (km)**.
2. The user enters their **age**.
3. The user selects **trip type**:
   - `1` → One-way trip
   - `2` → Round-trip (20% discount applied)
4. The program calculates and displays the final ticket price.

## 🛠️ Technologies Used
- **Java**
- **Scanner (for user input)**
- **Basic conditional logic**
  
## 📌 Code Overview
```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter the distance in km: ");
int km = sc.nextInt();
