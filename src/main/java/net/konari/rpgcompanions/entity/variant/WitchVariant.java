package net.konari.rpgcompanions.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum WitchVariant {
    DEFAULT(0),
    DARKB(1),
    YELLOWC(2),
    REDD(3);

    private static final WitchVariant[] BY_IDA = Arrays.stream(values()).sorted(Comparator.
            comparingInt(WitchVariant::getId)).toArray(WitchVariant[]::new);
    private final int ida;

    WitchVariant(int id) {

        this.ida = id;
    }

    public int getId() {

        return this.ida;
    }

    public static WitchVariant byId(int id) {

        return BY_IDA[id % BY_IDA.length];
    }
}
