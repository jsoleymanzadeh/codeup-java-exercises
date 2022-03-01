import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {
    public static ArrayList<HashMap<String, String>> addItems(ArrayList<HashMap<String, String>> groceryList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add new item? [y/N] ");
        if (!scanner.next().equals("y")) {
            return groceryList;
        }
        HashMap<String, String> item = new HashMap<>();
        System.out.print("\n1: Fruits\n2: Vegetables\n3: Grains\n4: Protein Foods\n5: Dairy\n6: Other\n\nItem Category: ");
        String category = scanner.next();
        while (!category.equals("1") && !category.equals("2") && !category.equals("3") && !category.equals("4") && !category.equals("5") && !category.equals("6")) {
            System.out.print("\nTry again.\n\n1: Fruits\n2: Vegetables\n3: Grains\n4: Protein Foods\n5: Dairy\n6: Other\n\nItem Category: ");
            category = scanner.next();
        }
        switch (category) {
            case "1":
                item.put("category", "Fruits");
                break;
            case "2":
                item.put("category", "Vegetables");
                break;
            case "3":
                item.put("category", "Grains");
                break;
            case "4":
                item.put("category", "Protein Foods");
                break;
            case "5":
                item.put("category", "Dairy");
                break;
            case "6":
                item.put("category", "Other");
                break;
        }
        System.out.print("Item Name: ");
        String name = scanner.next();
        item.put("name", name);
        System.out.print("Item Quantity: ");
        String quantity = scanner.next();
        item.put("quantity", quantity);
        groceryList.add(item);
        System.out.println();
        return addItems(groceryList);
    }

    private static ArrayList<HashMap<String, String>> editItems(ArrayList<HashMap<String, String>> groceryList) {
        Scanner scanner = new Scanner(System.in);
        int numberSelector = 1;
        System.out.println("\n0: Cancel");
        for (HashMap<String, String> item : groceryList) {
            System.out.printf("%d:\t%s\tx%s\n", numberSelector, item.get("name"), item.get("quantity"));
            item.put("selector", String.valueOf(numberSelector));
            numberSelector++;
        }
        System.out.print("\nEdit Item: ");
        String userInput = scanner.next();
        if (userInput.equals("0")) {
            return groceryList;
        }
        boolean exists = false;
        for (HashMap<String, String> item : groceryList) {
            if (userInput.equals(item.get("selector"))) {
                exists = true;
                System.out.print("Item Name: ");
                item.put("name", scanner.next());
                System.out.print("Item Quantity: ");
                item.put("quantity", scanner.next());
            }
        }
        if (!exists) {
            System.out.println("Try again.");
        }
        return editItems(groceryList);
    }

    private static void displayList(ArrayList<HashMap<String, String>> groceryList) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> categories = new HashMap<>();
        int numberSelector = 1;
        for (HashMap<String, String> item : groceryList) {
            if (!categories.containsValue(item.get("category"))) {
                categories.put(String.valueOf(numberSelector), item.get("category"));
                numberSelector++;
            }
        }
        System.out.print("\n0:\tAll");
        for (String key : categories.keySet()) {
            System.out.printf("\n%s: %s", key, categories.get(key));
        }
        System.out.print("\n7: Add Item");
        System.out.print("\n8: Edit Item");
        System.out.println("\n9: Exit");
        System.out.print("\nDisplay Category: ");
        String userInput = scanner.next();
        while (!categories.containsKey(userInput) && !userInput.equals("0") && !userInput.equals("7") && !userInput.equals("8") && !userInput.equals("9")) {
            System.out.print("Try again.\nDisplay Category: ");
            userInput = scanner.next();
        }
        switch (userInput) {
            case "0":
                for (String category : categories.values()) {
                    System.out.printf("\n%s: ", category);
                    for (HashMap<String, String> item : groceryList) {
                        if (category.equals(item.get("category"))) {
                            System.out.printf("\n\t%s\tx%s", item.get("name"), item.get("quantity"));
                        }
                    }
                }
                System.out.println();
                break;
            case "7":
                groceryList = addItems(groceryList);
                groceryList.sort(new GroceryListComparator());
                break;
            case "8":
                groceryList = editItems(groceryList);
                groceryList.sort(new GroceryListComparator());
                break;
            case "9":
                System.out.println("Exiting...");
                return;
            default:
                System.out.printf("\n%s: ", categories.get(userInput));
                for (HashMap<String, String> item : groceryList) {
                    if (categories.get(userInput).equals(item.get("category"))) {
                        System.out.printf("\n\t%s\tx%s", item.get("name"), item.get("quantity"));
                    }
                }
                System.out.println();
                break;
        }
        displayList(groceryList);
    }

    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> groceryList = new ArrayList<>();
        groceryList = addItems(groceryList);
        groceryList.sort(new GroceryListComparator());
        displayList(groceryList);
    }
}