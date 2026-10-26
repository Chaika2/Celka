/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.util.Arrays;
import java.util.Comparator;

public final class Vm_1
extends Enum<Vm_1> {
    public static final /* enum */ Vm_1 ALL = new Vm_1(0, "options.particles.all");
    public static final /* enum */ Vm_1 DECREASED = new Vm_1(1, "options.particles.decreased");
    public static final /* enum */ Vm_1 MINIMAL = new Vm_1(2, "options.particles.minimal");
    private static final Vm_1[] BY_ID;
    private final int id;
    private final String resourceKey;
    private static final /* synthetic */ Vm_1[] $VALUES;

    private static /* synthetic */ Vm_1[] id_byte() {
        return new Vm_1[]{ALL, DECREASED, MINIMAL};
    }

    private Vm_1(int n2, String string2) {
        this.id = n2;
        this.resourceKey = string2;
    }

    static {
        $VALUES = Vm_1.id_byte();
        BY_ID = (Vm_1[])Arrays.stream(Vm_1.values()).sorted(Comparator.comparingInt(Vm_1::id_break)).toArray(Vm_1[]::new);
    }

    public static Vm_1[] values() {
        return (Vm_1[])$VALUES.clone();
    }

    public static Vm_1 valueOf(String string) {
        return Enum.valueOf(Vm_1.class, string);
    }

    public String id_class() {
        return this.resourceKey;
    }

    public static Vm_1 id_class(int n) {
        return BY_ID[rfU_2.id_break(n, BY_ID.length)];
    }

    public int id_break() {
        return this.id;
    }
}

