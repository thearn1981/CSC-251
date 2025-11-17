import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UI {
    public static Parent createMainLayout(Stage stage) {
        BorderPane root = new BorderPane();

        // Menu bar
        MenuBar menuBar = new MenuBar();

        // File menu
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> {
            if (stage != null) stage.close();
            else Platform.exit();
        });
        fileMenu.getItems().addAll(exitItem);

        // Reservation menu
        Menu reservationMenu = new Menu("Reservation");
        MenuItem createReservation = new MenuItem("Create New Reservation");
        MenuItem viewReservations = new MenuItem("View Reservations");
        MenuItem updateReservation = new MenuItem("Update Reservation");

        createReservation.setOnAction(e -> setCenterText(root, "Create New Reservation - form goes here"));
        viewReservations.setOnAction(e -> setCenterText(root, "View Reservations - list goes here"));
        updateReservation.setOnAction(e -> setCenterText(root, "Update Reservation - selection/edit UI goes here"));

        reservationMenu.getItems().addAll(createReservation, viewReservations, updateReservation);

        // Inventory menu
        Menu inventoryMenu = new Menu("Inventory");
        MenuItem fullInventory = new MenuItem("Full Inventory");
        MenuItem currentInventory = new MenuItem("Current Inventory");
        MenuItem editInventory = new MenuItem("Edit Inventory");

        fullInventory.setOnAction(e -> setCenterText(root, "Full Inventory - full list"));
        currentInventory.setOnAction(e -> setCenterText(root, "Current Inventory - available items"));
        editInventory.setOnAction(e -> setCenterText(root, "Edit Inventory - edit form"));

        inventoryMenu.getItems().addAll(fullInventory, currentInventory, editInventory);

        // Customers menu
        Menu customersMenu = new Menu("Customers");
        MenuItem addCustomer = new MenuItem("Add Customer");
        MenuItem updateCustomer = new MenuItem("Update Customer");
        MenuItem editCustomer = new MenuItem("Edit Customer");

        addCustomer.setOnAction(e -> setCenterText(root, "Add Customer - form"));
        updateCustomer.setOnAction(e -> setCenterText(root, "Update Customer - select and update"));
        editCustomer.setOnAction(e -> setCenterText(root, "Edit Customer - edit details"));

        customersMenu.getItems().addAll(addCustomer, updateCustomer, editCustomer);

        // Help menu
        Menu helpMenu = new Menu("Help");
        MenuItem aboutItem = new MenuItem("About");
        aboutItem.setOnAction(e -> {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("About");
            a.setHeaderText(null);
            a.setContentText("Tables & Chairs - Reservation Manager\nDemo UI.");
            a.initOwner(stage);
            a.showAndWait();
        });
        helpMenu.getItems().add(aboutItem);

        menuBar.getMenus().addAll(fileMenu, reservationMenu, inventoryMenu, customersMenu, helpMenu);
        root.setTop(menuBar);

        // Default center
        setCenterText(root, "Welcome to Reservation Manager");

        return root;
    }

    private static void setCenterText(BorderPane root, String text) {
        Label label = new Label(text);
        label.setStyle("-fx-font-size: 14px;");
        StackPane center = new StackPane(label);
        center.setAlignment(Pos.CENTER);
        root.setCenter(center);
    }
}
