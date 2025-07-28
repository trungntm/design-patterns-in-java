# Abstract Factory Pattern

## Purpose

The Abstract Factory pattern is a *creational* design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

It is often called a **factory of factories**, because it encapsulates a group of individual factories that have a common theme, allowing the client code to create objects without knowing the specific classes being instantiated.

### Key Benefits:
- **Consistency**: Ensures that products from the same family are used together
- **Flexibility**: Easy to switch between different product families
- **Isolation**: Separates client code from concrete product classes
- **Extensibility**: New product families can be added without modifying existing code

## Components of Abstract Factory Pattern

### 1. **Abstract Factory**
Declares the interface for operations that create abstract products.

### 2. **Concrete Factory**
Implements the operations to create concrete product objects.

### 3. **Abstract Product**
Declares an interface for a type of product object.

### 4. **Concrete Product**
Defines a product object to be created by the corresponding concrete factory.

### 5. **Client**
Uses only interfaces declared by Abstract Factory and Abstract Product classes.

## Real-World Use Cases

### 1. **Cross-Platform GUI Applications**
- Creating UI components (buttons, checkboxes, menus) for different operating systems
- Each OS has its own look and feel, but the same functionality
- Example: Windows, macOS, Linux GUI components

### 2. **Database Connectivity**
- Different database drivers (MySQL, PostgreSQL, Oracle)
- Each database has specific connection, statement, and result set implementations
- Client code remains database-agnostic

### 3. **Game Development**
- Different themes or environments (Medieval, SciFi, Fantasy)
- Each theme has its own set of characters, weapons, and environments
- Consistent visual style within each theme

### 4. **Document Processing**
- Different document formats (PDF, Word, HTML)
- Each format has specific parsers, formatters, and exporters
- Unified interface for document operations

### 5. **E-commerce Platforms**
- Different payment gateways (PayPal, Stripe, Square)
- Each gateway has specific payment, refund, and validation implementations
- Consistent payment processing interface

## Programing Example

Imagine a UI framework that supports multiple platforms: MacOS, Windows. Each platform has its own style of widgets like Button, Checkbox.

To keep the UI consistent, we should only use components from the same "family" (e.g., Mac-style Button with Mac-style Checkbox, not a Windows-style one). The Abstract Factory ensures we get the right components as a group.

Frameworks like Swing, SWT, or Android Themes follow similar abstract factory patterns for rendering views/components.

### Class Structure:

#### Abstract Factory Interface
```java
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
```

#### Product Interfaces
```java
public interface Button {
    void render();
    void onClick();
}

public interface Checkbox {
    void render();
    void toggle();
}
```

#### Concrete Factories
- `MacFactory`: Creates macOS-specific UI components
```java
public class MacFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacCheckbox();
  }
}
```
- `WindowsFactory`: Creates Windows-specific UI components
```java
public class WindowsFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
```

#### Concrete Products
- `MacButton`, `MacCheckbox`: macOS implementations
```java
public class MacButton implements Button {

  @Override
  public void render() {
    System.out.println("Rendering Mac button");
  }

  @Override
  public void onClick() {
    System.out.println("Mac button clicked");
  }
}

public class MacCheckbox implements Checkbox {

  @Override
  public void render() {
    System.out.println("Rendering Mac checkbox");
  }

  @Override
  public void toggle() {
    System.out.println("Mac button toggled");
  }
}
```
- `WindowsButton`, `WindowsCheckbox`: Windows implementations
```java
public class WindowsButton implements Button {

  @Override
  public void render() {
    System.out.println("Rendering windows button");
  }

  @Override
  public void onClick() {
    System.out.println("Clicked on windows button");
  }
}

public class WindowsCheckbox implements Checkbox {

  @Override
  public void render() {
    System.out.println("Rendering windows checkbox");
  }

  @Override
  public void toggle() {
    System.out.println("Windows button toggled");
  }
}
```

#### Client:
```java
public class Application {
    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void render() {
        button.render();
        checkbox.render();
    }
}
```

#### Example Usage:

##### OS Detector to detect OS name:

```java
public class OSDetector {

  public static String detectOS(String osName) {
    if (osName.contains("win")) {
      return "windows";
    } else if (osName.contains("mac")) {
      return "mac";
    } else {
      return "Unsupported OS";
    }
  }
}
```

##### GUI Factory Detector to get the appropriate factory:
```java
public class GUIFactoryDetector {

  public static GUIFactory getFactory(String osName) {
    switch (osName) {
      case "mac":
        return new MacFactory();
      case "windows":
        return new WindowsFactory();
      default:
        throw new UnsupportedOperationException("Unsupported OS");
    }
  }
}
```

##### Main class to run the application:
```java
public class Main {

  public static void main(String[] args) {
    String osName = OSDetector.detectOS(System.getProperty("os.name").toLowerCase());
    GUIFactory factory = GUIFactoryDetector.getFactory(osName);

    Application app = new Application(factory);
    app.render();
    app.onClick();
    app.onToggle();
  }
}
```

## UML Diagram

![Abstract Factory Pattern UML Diagram](src/main/resources/abstract-factory.png)

## Pattern Structure

### Components:

1. **Abstract Factory (GUIFactory)**: Declares methods for creating abstract products
2. **Concrete Factory (MacFactory, WindowsFactory)**: Implements operations to create concrete products
3. **Abstract Product (Button, Checkbox)**: Declares interfaces for product objects
4. **Concrete Product (MacButton, WindowsButton, etc.)**: Implements the abstract product interface
5. **Client (Application)**: Uses only interfaces declared by Abstract Factory and Abstract Product

## When to Use

✅ **Use Abstract Factory when:**
- Your system needs to be independent of how its products are created
- You need to configure your system with one of multiple families of products
- A family of related product objects is designed to be used together
- You want to provide a class library of products and reveal only their interfaces

❌ **Avoid Abstract Factory when:**
- You only have one product family
- The product families rarely change
- The complexity overhead isn't justified by the flexibility gained

## Advantages & Disadvantages

### Advantages:
- ✅ Isolates concrete classes
- ✅ Makes exchanging product families easy
- ✅ Promotes consistency among products
- ✅ Supports Open/Closed Principle

### Disadvantages:
- ❌ Can be difficult to extend with new kinds of products
- ❌ Increases code complexity
- ❌ May lead to unnecessary abstraction if only one product family exists

The application will automatically detect your operating system and create the appropriate UI components (Mac or Windows style).
