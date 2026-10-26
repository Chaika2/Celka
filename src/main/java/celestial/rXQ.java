/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXN;

public final class rXQ
extends Enum<rXQ> {
    public static final /* enum */ rXQ MAINHAND = new rXQ(rXN.HAND, 0, 0, "mainhand");
    public static final /* enum */ rXQ OFFHAND = new rXQ(rXN.HAND, 1, 5, "offhand");
    public static final /* enum */ rXQ FEET = new rXQ(rXN.ARMOR, 0, 1, "feet");
    public static final /* enum */ rXQ LEGS = new rXQ(rXN.ARMOR, 1, 2, "legs");
    public static final /* enum */ rXQ CHEST = new rXQ(rXN.ARMOR, 2, 3, "chest");
    public static final /* enum */ rXQ HEAD = new rXQ(rXN.ARMOR, 3, 4, "head");
    private final rXN slotType;
    private final int index;
    private final int slotIndex;
    private final String name;
    private static final /* synthetic */ rXQ[] $VALUES;

    public int id_byte() {
        return this.slotIndex;
    }

    private rXQ(rXN rXN2, int n2, int n3, String string2) {
        this.slotType = rXN2;
        this.index = n2;
        this.slotIndex = n3;
        this.name = string2;
    }

    static {
        $VALUES = rXQ.id_throws();
    }

    public static rXQ[] values() {
        return (rXQ[])$VALUES.clone();
    }

    public static rXQ valueOf(String string) {
        return Enum.valueOf(rXQ.class, string);
    }

    public rXN id_class() {
        return this.slotType;
    }

    public static rXQ id_class(rXN rXN2, int n) {
        for (rXQ rXQ2 : rXQ.values()) {
            if (rXQ2.id_class() != rXN2 || rXQ2.id_break() != n) continue;
            return rXQ2;
        }
        throw new IllegalArgumentException("Invalid slot '" + rXN2 + "': " + n);
    }

    public static rXQ id_class(String string) {
        for (rXQ rXQ2 : rXQ.values()) {
            if (!rXQ2.id_protected().equals(string)) continue;
            return rXQ2;
        }
        throw new IllegalArgumentException("Invalid slot '" + string + "'");
    }

    public int id_break() {
        return this.index;
    }

    private static /* synthetic */ rXQ[] id_throws() {
        return new rXQ[]{MAINHAND, OFFHAND, FEET, LEGS, CHEST, HEAD};
    }

    public String id_protected() {
        return this.name;
    }
}

