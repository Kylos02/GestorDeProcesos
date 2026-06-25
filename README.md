# 🖥️ Process Manager

> A CPU scheduling algorithm simulator developed in Java as a project for the Operating Systems course.

---

## 📋 Description

**Process Manager** is a Java console application that simulates the main CPU scheduling algorithms used by modern operating systems. The goal of the project is to practically illustrate how the OS decides the order in which processes access the CPU, calculating key metrics such as waiting time, turnaround time, and response time.

---

## ✨ Features

- 🔄 **Simulation of multiple scheduling algorithms**
- 📊 **Automatic metric calculation**: average waiting time, turnaround time (TAT), and response time
- 🧵 **Support for processes with different priorities and burst times**
- 💻 **Interactive console interface** to manually enter processes
- 📈 **Text-based Gantt chart** to visualize process execution

---

## 🧠 Implemented Algorithms

| Algorithm | Description |
|---|---|
| **FCFS** (First Come, First Served) | Processes are served in the order they arrive |
| **SJF** (Shortest Job First) | Prioritizes the process with the shortest burst time |
| **Round Robin** | Assigns a fixed time quantum to each process in turn |
| **Priority Scheduling** | Serves processes according to their assigned priority level |

---

## 🚀 Installation & Setup

### Prerequisites

- **Java JDK 8** or higher
- **NetBeans IDE** (recommended) or any Java-compatible IDE

### Steps

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Kylos02/GestorDeProcesos.git
   cd GestorDeProcesos
   ```

2. **Open the project in NetBeans:**
   - Go to `File > Open Project`
   - Select the `proyecto_SO` folder

3. **Run the project:**
   - Press `F6` or click the **Run Project** button
   - Or compile and run it from the terminal:

   ```bash
   cd proyecto_SO
   javac -d bin src/gestordeprocesos/*.java
   java -cp bin gestordeprocesos.GestorDeProcesos
   ```

---

## 🖱️ Usage

When the application starts, it will prompt you to enter process data through the console:

```
Enter the number of processes: 3

Process 1:
  Arrival time: 0
  Burst time: 5
  Priority: 2

Process 2:
  Arrival time: 1
  Burst time: 3
  Priority: 1
...

Select an algorithm:
  [1] FCFS
  [2] SJF
  [3] Round Robin
  [4] Priority Scheduling
```

Once finished, the program will display the **Gantt chart** and each process's metrics.

---

## 🛠️ Technologies

- **Language:** Java
- **IDE:** NetBeans
- **Java Version:** JDK 8+
- **Paradigm:** Object-Oriented Programming (OOP)

---

## 📁 Project Structure

```
GestorDeProcesos/
├── proyecto_SO/
│   └── src/
│       └── gestordeprocesos/
│           ├── GestorDeProcesos.java   # Main class
│           ├── Proceso.java            # Process model
│           └── Algoritmos.java         # Scheduling logic
├── LICENSE
└── README.md
```

---

## 📚 Academic Context

This project was developed as part of the **Operating Systems** course. Its purpose is to practically reinforce the theoretical concepts of CPU scheduling covered in class.

---

## 👤 Author

**Kylos02**
- GitHub: [@Kylos02](https://github.com/Kylos02)

---

## 📄 License

This project is licensed under the **Apache 2.0 License**. See the [LICENSE](LICENSE) file for details.
