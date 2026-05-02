# CulinaPizza

> A native Android pizza recipe app built in Java at ENSA Marrakech by Yousra Zarri.

---

## Features

- **Splash Screen** — Fade-in animation via `AlphaAnimation`, auto-transitions after 2.5 seconds.
- **Pizza Catalog** — Scrollable `ListView` of 10 pizza varieties with thumbnails, names, prep times, and prices.
- **Recipe Detail View** — Full breakdown per pizza: image, ingredients, description, and step-by-step instructions in a `ScrollView`.
- **In-Memory Data** — Singleton `PizzaProvider` keeps data consistent across the session with no database required.

---

## Pizza Menu

| # | Name | Price | Prep Time |
|---|------|-------|-----------|
| 1 | Royal Blue Margherita | $2 | 25 min |
| 2 | Golden Truffle Mushroom | $4 | 35 min |
| 3 | Raini Signature Supreme | $5 | 40 min |
| 4 | Spicy Honey Pepperoni | $3 | 30 min |
| 5 | Mediterranean Veggie | $3 | 30 min |
| 6 | Blue Cheese Steak Pizza | $5 | 45 min |
| 7 | Smoky BBQ Pulled Pork | $4 | 35 min |
| 8 | Prosciutto & Fig | $3 | 25 min |
| 9 | Chicken Pesto Royale | $3 | 35 min |
| 10 | Four Cheese Gold | $4 | 30 min |

---

## Architecture

```
SplashActivity (2.5s fade-in)
    ↓
ListPizzaActivity  ←  CustomPizzaAdapter  ←  PizzaProvider (Singleton)
    ↓ (PIZZA_ID via Intent)
PizzaDetailActivity
```

| Package | Contents |
|---------|----------|
| `classes` | `PizzaEntity` — data model |
| `dao` | `IDao<T>` — generic CRUD interface |
| `services` | `PizzaProvider` — singleton data layer |
| `adapter` | `CustomPizzaAdapter` — ListView adapter |
| `ui` | `SplashActivity`, `ListPizzaActivity`, `PizzaDetailActivity` |

---

## Tech Stack

| | |
|---|---|
| **Language** | Java |
| **Min SDK** | 24 (Android 7.0) |
| **Target SDK** | 36 |
| **Build** | Gradle 9.1.0 (Kotlin DSL) |
| **UI** | AppCompat + Material Design 1.13.0 |
| **Layout** | XML with ConstraintLayout & card-based design |
| **Navigation** | Intent-based with entity ID passing |

---

## Getting Started

1. Clone the repository
2. Open in **Android Studio**
3. Build and run on an emulator or device (API 24+)

---

## Academic Context

Developed as a mobile development lab project at **ENSA Marrakech**, demonstrating custom adapters, Intent-based navigation, Singleton pattern, DAO abstraction, and layered MVC-style architecture.

---

**Author:** Yousra Zarri
