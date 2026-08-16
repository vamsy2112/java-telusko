
// Problem 6(Combined Challenge)—Library Management System Goal:Static,final,abstraction,and inheritance in one design—closer to real project structure.Abstract
// class LibraryItem:
// private final String title,
// private final String itemId

// static int totalItems (increment in constructor)
// Abstract method getItemType() returning a String
// Concrete method getInfo() printing "[{itemId}] {title} - Type: {getItemType()}"
// Subclasses Book and DVD, each

// implementing getItemType() ("Book" / "DVD")
// Interface Borrowable with method borrowItem() — implement it in Book

// only (DVDs are reference-only, can't be borrowed)

// In main(): create 2 books and 1 DVD,

// print getInfo() for all three, call borrowItem() only on books, and print LibraryItem.totalItems at the end.
// Expected output pattern:
// [B001] The Hobbit - Type: Book
// [B002] Dune - Type: Book
// [D001] Inception - Type: DVD
// The Hobbit has been borrowed.
// Dune has been borrowed.
// Total items in library: 3
// Try them roughly in order — 1 and 2 are quick warm-ups, 3–4 are the real conceptual jump, 5 reinforces your Employee exercise pattern, and 6 forces you to combine everything the way an interviewer would. Send me your solutions as you go and I'll review them (or if you get stuck, tell me exactly where and I'll nudge rather than solve it for you).

abstract class LibraryItem {
    private final String title;
    private final String itemId;

    abstract String getItemType();

    LibraryItem(String itemId, String title) { // parameterised constructor whenever we want to print different utputs
                                               // based on the values for same obj reference. Refer to line number 87,
                                               // 88, 89.
        this.itemId = itemId;
        this.title = title;
    }

    // Getters for title
    public String getTitle() {
        return title;
    }

    // Getter for itemId
    public String getItemId() {
        return itemId;
    }

    public void getInfo() {
        // NEEDS TO PRINT "[{itemId}] {title} - Type: {getItemType()}"

        System.out.println("[" + getItemId() + "]" + " " + getTitle() + " - Type: " + getItemType());
    }
}

interface Borrowable {
    void borrowItem();
}

class Book extends LibraryItem implements Borrowable {
    Book(String itemId, String title) {
        super(itemId, title);
    }

    public String getItemType() {
        return "Book";
    }

    public void borrowItem() {
        System.out.println(getTitle() + " has been borrowed");
    }
}

class DVD extends LibraryItem {
    DVD(String itemId, String title) {
        super(itemId, title);
    }

    public String getItemType() {
        return "DVD";
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        Book obj = new Book("B001", "The Hobbit"); // pass the values to the parameterised constructor
        Book obj1 = new Book("B002", "Dune");
        DVD obj2 = new DVD("D001", "Inception");

        obj.getInfo();
        obj1.getInfo();
        obj2.getInfo();

        obj.borrowItem();
        obj1.borrowItem();

        LibraryItem arr[] = { obj, obj1, obj2 };

        System.out.println("Total items in library: " + arr.length);
    }
}
