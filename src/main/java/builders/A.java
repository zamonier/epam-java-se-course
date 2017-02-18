package builders;

public class A {

    private int x;

    A() {
    }

    class Builder {

        private int x;

        public Builder x(int x) {
            this.x = x;
            return this;
        }

        public A build() {
            A.this.x = this.x;
            return A.this;
        }
    }
}