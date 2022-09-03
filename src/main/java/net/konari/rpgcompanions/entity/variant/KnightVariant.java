package net.konari.rpgcompanions.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum KnightVariant {

    DEFAULT(4),
    REDK(5),
    BLUEK(6),
    GRENK(7);

    private static final KnightVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(KnightVariant::getIdb)).toArray(KnightVariant[]::new);
    private final int id;

    KnightVariant(int id) {
        this.id = id;
    }

    public int getIdb() {
        return this.id;
    }

    public static KnightVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
