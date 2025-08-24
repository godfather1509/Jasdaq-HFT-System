# Limit Order Book Engine

This project implements a high-performance, price–time priority **Limit Order Book (LOB)** designed for trading and matching engines. It leverages a **Red–Black Tree** to maintain sorted price levels with `O(log M)` insertion, while each price level holds orders in a **doubly linked list** to preserve strict FIFO execution. **Hash maps** provide constant-time `O(1)` access for order cancellation and execution.

To minimize overhead, the engine is built with **compact, low-allocation data structures**, avoiding costly runtime allocations and standard-library bloat. The result is a lightweight, efficient order book suitable for low-latency trading simulations, backtesting, or as a foundation for a production-grade matching engine.
