import java.util.ArrayList;

public class Menu implements Link{ // Leaf
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void click() {
        System.out.println(name);
    }


}
