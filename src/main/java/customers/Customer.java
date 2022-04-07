package customers;


public class Customer {
        String customerName;

        public Customer(String customerName) {
                this.customerName = customerName;
        }

        public String getCustomerName() {
                return customerName;
        }

        public void setCustomerName(String customerName) {
                this.customerName = customerName;
        }

        @Override
        public String toString() {
                return "Customer{" +
                        "customerName='" + customerName + '\'' +
                        '}';
        }
}
