package at.mci.claudiasteiner.vorbereitung12_TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Drink tea = new Tea();
        tea.prepareRecipe();  // Output: Boiling water... Steeping the tea... Pouring into cup... Adding lemon...

        Drink coffee = new Coffee();
        coffee.prepareRecipe();  // Output: Boiling water... Dripping coffee through filter... Pouring into cup... Adding sugar and milk...
    }
}