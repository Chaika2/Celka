/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRl_1;

public final class Zr_1
extends Enum<Zr_1> {
    public static final /* enum */ Zr_1 SURVIVAL = new Zr_1("survival", rRl_1.SURVIVAL);
    public static final /* enum */ Zr_1 HARDCORE = new Zr_1("hardcore", rRl_1.SURVIVAL);
    public static final /* enum */ Zr_1 CREATIVE = new Zr_1("creative", rRl_1.CREATIVE);
    public static final /* enum */ Zr_1 DEBUG = new Zr_1("spectator", rRl_1.SPECTATOR);
    public final String field_228217_e_;
    public final rRl_1 field_228218_f_;
    private static final /* synthetic */ Zr_1[] $VALUES;

    private Zr_1(String string2, rRl_1 rRl_12) {
        this.field_228217_e_ = string2;
        this.field_228218_f_ = rRl_12;
    }

    static {
        $VALUES = Zr_1.id_class();
    }

    public static Zr_1[] values() {
        return (Zr_1[])$VALUES.clone();
    }

    public static Zr_1 valueOf(String string) {
        return Enum.valueOf(Zr_1.class, string);
    }

    private static /* synthetic */ Zr_1[] id_class() {
        return new Zr_1[]{SURVIVAL, HARDCORE, CREATIVE, DEBUG};
    }
}

