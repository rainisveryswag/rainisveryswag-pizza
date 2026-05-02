# 🍕 CulinaPizza

> A native Android recipe application for pizza lovers — built with Java at ENSA Marrakech.

**Author:** Yousra Zarri

---

## About

CulinaPizza is a native Android application developed in Java as part of a university lab project at ENSA Marrakech. The app lets users browse a diverse pizza menu, check preparation times and pricing, and follow detailed step-by-step recipe instructions.

---

## Features

- **Splash Screen** — Animated launch screen using a smooth fade-in effect via `AlphaAnimation`.
- **Pizza Catalog** — Scrollable list powered by a custom `BaseAdapter`, displaying thumbnails, names, and prices.
- **Recipe Detail View** — Full recipe breakdown including ingredients, description, and preparation steps, wrapped in a `ScrollView` for easy reading.
- **In-Memory Data Persistence** — Singleton pattern keeps data consistent and accessible throughout the session.

---

## Project Structure

The codebase is organized into clearly separated packages to keep the architecture clean and maintainable:

| Package | Responsibility |
|---|---|
| `classes` | Business entity — `PizzaEntity` |
| `dao` | Generic `IDao<T>` interface defining core CRUD operations |
| `services` | Data logic layer — `PizzaProvider` handles storage and retrieval |
| `adapter` | `CustomPizzaAdapter` — bridges data to UI components |
| `ui` | Activities for each screen: Splash, List, and Detail |

---

## Tech Stack

| | |
|---|---|
| **Language** | Java |
| **Layouts** | XML with custom styles and card-based design |
| **Navigation** | `Intent`-based, passing entity IDs between activities |
| **Design Pattern** | Singleton for data management |

---

## Getting Started

1. Clone the repository
2. Open the project in **Android Studio**
3. Build and run on an emulator or physical device (API level 21+)

---

## Academic Context

This project was developed as part of a mobile development lab at **ENSA Marrakech**. It demonstrates core Android concepts including custom adapters, activity navigation with intents, and separation of concerns through layered architecture.
