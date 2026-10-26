/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rEB;

public final class rrES
extends Enum<rrES> {
    public static final /* enum */ rrES VINDICATOR = new rrES(aI_2.U, new int[]{0, 0, 2, 0, 1, 4, 2, 5});
    public static final /* enum */ rrES EVOKER = new rrES(aI_2.id_return, new int[]{0, 0, 0, 0, 0, 1, 1, 2});
    public static final /* enum */ rrES PILLAGER = new rrES(aI_2.W, new int[]{0, 4, 3, 3, 4, 4, 4, 2});
    public static final /* enum */ rrES WITCH = new rrES(aI_2.a, new int[]{0, 0, 0, 0, 3, 0, 0, 1});
    public static final /* enum */ rrES RAVAGER = new rrES(aI_2.u, new int[]{0, 0, 0, 1, 0, 1, 0, 2});
    public static final rrES[] VALUES;
    public final aI_2<? extends rEB> type;
    public final int[] waveCounts;
    private static final /* synthetic */ rrES[] $VALUES;

    private rrES(aI_2<? extends rEB> aI_22, int[] nArray) {
        this.type = aI_22;
        this.waveCounts = nArray;
    }

    static {
        $VALUES = rrES.id_class();
        VALUES = rrES.values();
    }

    public static rrES[] values() {
        return (rrES[])$VALUES.clone();
    }

    public static rrES valueOf(String string) {
        return Enum.valueOf(rrES.class, string);
    }

    private static /* synthetic */ rrES[] id_class() {
        return new rrES[]{VINDICATOR, EVOKER, PILLAGER, WITCH, RAVAGER};
    }
}

