/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Kb_1;
import celestial.om_3;

public final class oZ_2
extends Enum<oZ_2> {
    public static final /* enum */ oZ_2 REPLACE = new oZ_2((rfi_32, rfH_22, rd_1, rrEm_12) -> rd_1);
    public static final /* enum */ oZ_2 OUTLINE = new oZ_2((rfi_32, rfH_22, rd_1, rrEm_12) -> rfH_22.b_() != rfi_32.id_class && rfH_22.b_() != rfi_32.id_protected && rfH_22.c_() != rfi_32.id_break && rfH_22.c_() != rfi_32.id_throws && rfH_22.d_() != rfi_32.id_byte && rfH_22.d_() != rfi_32.id_case ? null : rd_1);
    public static final /* enum */ oZ_2 HOLLOW = new oZ_2((rfi_32, rfH_22, rd_1, rrEm_12) -> rfH_22.b_() != rfi_32.id_class && rfH_22.b_() != rfi_32.id_protected && rfH_22.c_() != rfi_32.id_break && rfH_22.c_() != rfi_32.id_throws && rfH_22.d_() != rfi_32.id_byte && rfH_22.d_() != rfi_32.id_case ? om_3.id_break : rd_1);
    public static final /* enum */ oZ_2 DESTROY = new oZ_2((rfi_32, rfH_22, rd_1, rrEm_12) -> {
        rrEm_12.id_break(rfH_22, true);
        return rd_1;
    });
    public final Kb_1 filter;
    private static final /* synthetic */ oZ_2[] $VALUES;

    private oZ_2(Kb_1 kb_1) {
        this.filter = kb_1;
    }

    static {
        $VALUES = oZ_2.id_class();
    }

    public static oZ_2[] values() {
        return (oZ_2[])$VALUES.clone();
    }

    public static oZ_2 valueOf(String string) {
        return Enum.valueOf(oZ_2.class, string);
    }

    private static /* synthetic */ oZ_2[] id_class() {
        return new oZ_2[]{REPLACE, OUTLINE, HOLLOW, DESTROY};
    }
}

