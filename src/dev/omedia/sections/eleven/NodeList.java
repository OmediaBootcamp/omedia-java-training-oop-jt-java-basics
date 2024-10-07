package dev.omedia.sections.eleven;

public interface NodeList {
    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);

    ListItem getRoot();
}