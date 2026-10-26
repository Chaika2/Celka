/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCH
extends Enum<rCH>
implements rpH_2 {
    public static final /* enum */ rCH FLOOR = new rCH("floor");
    public static final /* enum */ rCH WALL = new rCH("wall");
    public static final /* enum */ rCH CEILING = new rCH("ceiling");
    private final String name;
    private static final /* synthetic */ rCH[] $VALUES;

    private rCH(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCH.id_break();
    }

    public static rCH[] values() {
        return (rCH[])$VALUES.clone();
    }

    public static rCH valueOf(String string) {
        return Enum.valueOf(rCH.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCH[] id_break() {
        return new rCH[]{FLOOR, WALL, CEILING};
    }
}

