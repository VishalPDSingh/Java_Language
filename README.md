# Java String (Quick Notes)

## 🔹 String
- Sequence of characters → `"Hello"`
- Immutable (cannot be changed)
- Stored in String Constant Pool (SCP)

## 🔹 Memory
- `"ABC"` → SCP
- `new String("ABC")` → Heap

## 🔹 Comparison
- `==` → reference
- `equals()` → value

## 🔹 Concatenation
- `"A" + "B"` → SCP (compile-time)
- `a + b` → Heap (runtime)
- Left → Right evaluation

## 🔹 Immutability
- Any modification creates new object

## 🔹 Mutable Classes
- `StringBuilder` → fast, not thread-safe
- `StringBuffer` → thread-safe, slower

## 🔹 Capacity
- Default = 16
- Formula → `(old * 2) + 2`

## 🔹 Rule
- No variable → SCP  
- Variable present → Heap
