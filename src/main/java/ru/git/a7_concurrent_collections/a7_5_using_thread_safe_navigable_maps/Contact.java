package ru.git.a7_concurrent_collections.a7_5_using_thread_safe_navigable_maps;

public class Contact {
    private final String name;
    private final String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
