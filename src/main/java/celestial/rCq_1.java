/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCq_1
extends Enum<rCq_1>
implements rpH_2 {
    public static final /* enum */ rCq_1 FLOOR = new rCq_1("floor");
    public static final /* enum */ rCq_1 CEILING = new rCq_1("ceiling");
    public static final /* enum */ rCq_1 SINGLE_WALL = new rCq_1("single_wall");
    public static final /* enum */ rCq_1 DOUBLE_WALL = new rCq_1("double_wall");
    private final String name;
    private static final /* synthetic */ rCq_1[] $VALUES;

    private rCq_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCq_1.id_break();
    }

    public static rCq_1[] values() {
        return (rCq_1[])$VALUES.clone();
    }

    public static rCq_1 valueOf(String string) {
        return Enum.valueOf(rCq_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCq_1[] id_break() {
        return new rCq_1[]{FLOOR, CEILING, SINGLE_WALL, DOUBLE_WALL};
    }
}

