/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.EnumSet;
import java.util.Set;

public final class rvU_2
extends Enum<rvU_2> {
    public static final /* enum */ rvU_2 X = new rvU_2(0);
    public static final /* enum */ rvU_2 Y = new rvU_2(1);
    public static final /* enum */ rvU_2 Z = new rvU_2(2);
    public static final /* enum */ rvU_2 Y_ROT = new rvU_2(3);
    public static final /* enum */ rvU_2 X_ROT = new rvU_2(4);
    private final int bit;
    private static final /* synthetic */ rvU_2[] $VALUES;

    private rvU_2(int n2) {
        this.bit = n2;
    }

    static {
        $VALUES = rvU_2.id_break();
    }

    public static rvU_2[] values() {
        return (rvU_2[])$VALUES.clone();
    }

    public static rvU_2 valueOf(String string) {
        return Enum.valueOf(rvU_2.class, string);
    }

    public static int id_class(Set<rvU_2> set) {
        int n = 0;
        for (rvU_2 rvU_22 : set) {
            n |= rvU_22.id_class();
        }
        return n;
    }

    public static Set<rvU_2> id_class(int n) {
        EnumSet<rvU_2> enumSet = EnumSet.noneOf(rvU_2.class);
        for (rvU_2 rvU_22 : rvU_2.values()) {
            if (!rvU_22.id_break(n)) continue;
            enumSet.add(rvU_22);
        }
        return enumSet;
    }

    private int id_class() {
        return 1 << this.bit;
    }

    private static /* synthetic */ rvU_2[] id_break() {
        return new rvU_2[]{X, Y, Z, Y_ROT, X_ROT};
    }

    private boolean id_break(int n) {
        return (n & this.id_class()) == this.id_class();
    }
}

