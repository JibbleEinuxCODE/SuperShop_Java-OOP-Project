import java.util.ArrayList;
import java.util.List;

import ModelClass.Product;

public class SuperShop {

    private String shopName;
    private String shopPlace;
    private String contract;

    private List<Owner> owners;
    private List<Administrator> administrators;
    private List<Accountant> accountants;
    private List<Worker> workers;

    private List<Product> products;

    public SuperShop(String shopName, String shopPlace, String contract) {
        this.shopName = shopName;
        this.shopPlace = shopPlace;
        this.contract = contract;
        administrators = new ArrayList<>();
        workers = new ArrayList<>();
        accountants = new ArrayList<>();
        owners = new ArrayList<>();
        products = new ArrayList<>();
    }

    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void addAdministrator(Administrator administrator) {
        administrators.add(administrator);
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void printAllAdministrators() {
        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                System.out.println("\n------------------------------------");
                System.out.println("            Administrators Details             ");
                System.out.println("--------------------------------------\n");

                getAdministrators().get(i).displayAdministrator();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printAllWorkers() {

        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Worker Details             ");
                System.out.println("-------------------------------------\n");

                getWorkers().get(i).displayWorkers();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Accountant> getAccountants() {
        return accountants;
    }

    public void addAccountant(Accountant accountant) {
        accountants.add(accountant);
    }

    public void printAllAccountants() {
        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Accountants Details             ");
                System.out.println("-------------------------------------\n");

                getAccountants().get(i).displayAccountant();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchAccountant(String Name) {
        try {

            for (int i = 0; i < getAccountants().size(); i++) {
                if (getAccountants().get(i).getName().toString().trim().equalsIgnoreCase(Name)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Find Accountant Details            ");
                    System.out.println("-------------------------------------\n");

                    getAccountants().get(i).displayAccountant();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    public void printAllOwners() {
        try {
            for (int i = 0; i < owners.size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Owners Details             ");
                System.out.println("-------------------------------------\n");

                getOwners().get(i).displayOwners();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchOwners(String Name) {
        try {

            for (int i = 0; i < getOwners().size(); i++) {
                if (getOwners().get(i).getName().toString().trim().equalsIgnoreCase(Name)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Find Owner Details            ");
                    System.out.println("-------------------------------------\n");

                    getOwners().get(i).displayOwners();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printAllProducts() {
        try {

            for (int i = 0; i < getProducts().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("          Product Details            ");
                System.out.println("-------------------------------------\n");

                getProducts().get(i).displayItem();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
    }

    public void printProductsByCategory(String Category) {
        try {

            for (int i = 0; i < getProducts().size(); i++) {

                if (getProducts().get(i).getCategory().toString().trim().equalsIgnoreCase(Category)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Product Details            ");
                    System.out.println("-------------------------------------\n");

                    getProducts().get(i).displayItem();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
    }

}
