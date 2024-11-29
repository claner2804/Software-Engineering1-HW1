package at.mci.claudiasteiner.vorbereitung12_TemplateMethod;

// Concrete class for Coffee
class Coffee extends Drink {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}