package customers;


public class Customer {
        String CustomerName;

        public Customer(String customerName) {
                CustomerName = customerName;
        }

        public String getCustomerName() {
                return CustomerName;
        }

        public void setCustomerName(String customerName) {
                CustomerName = customerName;
        }

        @Override
        public String toString() {
                return "Customer{" +
                        "CustomerName='" + CustomerName + '\'' +
                        '}';
        }
}

