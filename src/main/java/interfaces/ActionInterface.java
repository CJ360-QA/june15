package interfaces;

public interface ActionInterface {
int a=100;


public void clickAction(String name);

public boolean geTtext(String text);

public boolean getTitle(String title);

public static void act() {
	System.out.println("static method");
}

public default void art() {
	System.out.println("default method");
}
}
