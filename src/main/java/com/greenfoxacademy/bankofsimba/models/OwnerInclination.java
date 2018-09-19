package com.greenfoxacademy.bankofsimba.models;

public enum OwnerInclination {
    BAD_GUY {
        @Override
        public String toString() {
            return "Bad Guy";
        }
    },
    GOOD_ONE {
        @Override
        public String toString() {
            return "Good One";
        }
    }
}
