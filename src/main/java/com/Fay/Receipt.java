package com.Fay;

public class Receipt {
    private String data;
    private int term;

    public static final class Builder {
        private String data;
        private int term;

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setTerm(int days) {
            this.term = days;
            return this;
        }

        public Receipt build() {
            return new Receipt(this);
        }
    }

    private Receipt(Builder builder) {
        this.data = builder.data;
        this.term = builder.term;
    }

    public int getTerm() {
        return term;
    }
}