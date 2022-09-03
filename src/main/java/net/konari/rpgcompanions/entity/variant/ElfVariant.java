package net.konari.rpgcompanions.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ElfVariant {
    DEFAULT(8),
    REDELF(9),
    YELLOWELFB(10),
    REDELFB(11);

    private static final ElfVariant[] BY_IDB = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ElfVariant::getId)).toArray(ElfVariant[]::new);
    private final int idb;

    ElfVariant(int id) {
        this.idb = id;
    }

    public int getId() {
        return this.idb;
    }

    public static ElfVariant byId(int id) {
        return BY_IDB[id % BY_IDB.length];
    }
}
