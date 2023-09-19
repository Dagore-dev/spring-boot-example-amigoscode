package dev.dagore;

public record NewCustomerRequest(
        String name,
        String email,
        Integer age
) {}
