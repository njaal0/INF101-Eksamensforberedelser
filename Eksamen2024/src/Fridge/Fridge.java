package Fridge;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Fridge implements IFridge {

    private List<FridgeItem> items;
    private int numItems;
    private int maxCapacity;

    public Fridge(int maxCapacity) {
        this.items = new ArrayList<>();
        this.numItems = 0;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int nItemsInFridge() {
        return this.numItems;
    }

    @Override
    public int totalSize() {
        return this.maxCapacity;
    }

    @Override
    public boolean placeIn(FridgeItem item) {
        if (items.size() < maxCapacity && (!item.hasExpired())) {
            items.add(item);
            numItems++;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void takeOut(FridgeItem item) {
        for (int i = items.size() - 1; i > 0; i--) {
            if (item.equals(items.get(i))) {
                items.remove(items.get(i));
                numItems--;
            } else {
                throw new NoSuchElementException();
            }
        }

    }

    @Override
    public void emptyFridge() {
        this.items.clear();
    }

    @Override
    public List<FridgeItem> removeExpiredFood() {
        for (int i = items.size() - 1; i > 0; i--) {
            if (items.get(i).hasExpired()) {
                items.remove(i);
                numItems--;
            }
        }

        return items;
    }
}