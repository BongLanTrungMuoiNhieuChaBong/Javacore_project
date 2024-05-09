public class Product {
        private String name;
        private String size;
        int Quantity;
        private double price;

    public Product() {
    }

    public Product(String name) {
            this.name = name;
        }


        public  void product(String name, String size, double price) {
            this.name = name;
            this.size = size;
            this.price = price;
        }
//
//    public String getName() {
//        return name;
//    }
//    public String getSize() {
//        return size;
//    }
//    public double getPrice() {
//        return price;
//    }
}
