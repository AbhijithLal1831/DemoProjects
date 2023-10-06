public class InterfaceImpl implements LibraryInterface {
    @Override
    public void checkout() {
        System.out.println("CheckedOut");

    }

    @Override
    public void returnItem() {
        System.out.println("Item Returned");

    }
}
