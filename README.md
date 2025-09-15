
## 🔧 Key Features

*   **Flexible Parking Allocation:** Choose between different algorithms for finding a spot (Nearest, Best Fit, Farthest First).
*   **Dynamic Pricing:** Supports different fee models (flat rate, vehicle-based).
*   **Multiple Payment Methods:** Easily extendable to support Cash, UPI, Credit Card, etc.
*   **Thread-Safe Design:** Uses concurrent collections and synchronized methods to handle multiple concurrent entries and exits.
*   **Real-time Availability:** Check the availability of spots on each floor.

## 🚀 Potential Enhancements

*   **Factory Patterns:** Implement explicit factories for creating `Vehicle`, `FeeStrategy`, and `ParkingStrategy` objects.
*   **Observer Pattern:** Notify users when a spot becomes available on their preferred floor.
*   **More Strategies:** Implement a `TimeBasedFeeStrategy` (e.g., peak/off-peak hours) or a `LoyaltyDiscountStrategy`.

## 📚 Learning Outcomes

This project serves as an excellent practice for:
*   Identifying and applying appropriate design patterns.
*   Modeling real-world systems using object-oriented principles.
*   Writing clean, maintainable, and extensible code.
*   Thinking about concurrency and thread safety.