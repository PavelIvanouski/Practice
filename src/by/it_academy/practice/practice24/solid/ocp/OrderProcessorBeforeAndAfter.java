package by.it_academy.practice.practice24.solid.ocp;

public class OrderProcessorBeforeAndAfter extends OrderProcessor {
    public OrderProcessorBeforeAndAfter() {
        super();
    }

    @Override
    public void someLogic() {
        // some logic before
        beforeProcessing();
        super.someLogic();
        // some logic after
        afterProcessing();
    }

    private void beforeProcessing() {

    }
    private void afterProcessing() {

    }
}
