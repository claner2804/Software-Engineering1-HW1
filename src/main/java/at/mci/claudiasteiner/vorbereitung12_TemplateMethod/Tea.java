package at.mci.claudiasteiner.vorbereitung12_TemplateMethod;

// Concrete class for Tea
class Tea extends Drink {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon...");
    }
}