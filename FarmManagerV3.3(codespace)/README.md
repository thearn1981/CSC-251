# Farm Manager V3.2

A comprehensive farm management system built in Java with a graphical user interface for tracking inventory, services, animals, customers, and invoices.

## 🌱 Features

- **Inventory Management** - Track supplies and equipment
- **Services Management** - Manage farm services and schedules  
- **Animals Management** - Monitor livestock and sales
- **Customer Management** - Handle customer data and loyalty points
- **Invoice Management** - Process sales and transactions
- **CSV Data Storage** - Simple file-based data persistence

## 🚀 Running in GitHub Codespaces

This project is configured to run in GitHub Codespaces with a desktop environment for the GUI application.

### Quick Start

1. **Open in Codespaces**: Click the "Code" button and select "Create codespace on main"

2. **Wait for setup**: The devcontainer will automatically install Java and desktop environment

3. **Access the Desktop**: 
   - Click on the "Ports" tab in VS Code
   - Click the globe icon next to port 6080 (Desktop web)
   - This opens a web-based desktop environment

4. **Run the Application**:
   ```bash
   # Make the run script executable and run it
   chmod +x run.sh
   ./run.sh
   ```

   Or manually:
   ```bash
   # Compile all Java files
   javac *.java
   
   # Run the main application
   java Main
   ```

### Alternative: VS Code Terminal

You can also compile and run from the VS Code terminal, but you'll need to access the GUI through the desktop environment (port 6080).

## 💻 Local Development

For local development on your machine:

```bash
# Compile
javac *.java

# Run
java Main
```

### Requirements
- Java 17 or higher
- GUI environment (for Swing components)

## 📁 Project Structure

```
├── Main.java              # Main application entry point
├── UI.java               # User interface components
├── InventoryManager.java # Inventory management logic
├── ServicesManager.java  # Services management logic
├── AnimalsManager.java   # Animals management logic
├── SalesManager.java     # Customer and invoice management
├── *.csv                 # Data files (auto-generated)
└── .devcontainer/        # Codespaces configuration
```

## 🔧 Technical Details

- **Language**: Java
- **GUI Framework**: Swing
- **Data Storage**: CSV files
- **Date Format**: MM-DD-YYYY
- **Architecture**: Modular design with separate managers for each domain

## 📊 Data Files

The application automatically creates and manages these CSV files:
- `inventory.csv` - Item inventory data
- `services.csv` - Service scheduling data
- `animals.csv` - Livestock information
- `customers.csv` - Customer information
- `invoices.csv` - Sales transaction data

## 🛠️ Development Notes

- All GUI dialogs use consistent styling and error handling
- CSV data includes headers for better data management
- Input validation prevents data corruption
- Automatic text wrapping for better user experience

## 👥 Credits

Created by Mattea Isley, Demetrius Johnson, and Teresa Hearn
Assisted by ChatGPT and Claude AI