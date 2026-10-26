/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rke_3
extends Enum<rke_3> {
    public static final /* enum */ rke_3 CRAFTING = new rke_3();
    public static final /* enum */ rke_3 FURNACE = new rke_3();
    public static final /* enum */ rke_3 BLAST_FURNACE = new rke_3();
    public static final /* enum */ rke_3 SMOKER = new rke_3();
    private static final /* synthetic */ rke_3[] $VALUES;

    static {
        $VALUES = rke_3.id_class();
    }

    public static rke_3[] values() {
        return (rke_3[])$VALUES.clone();
    }

    public static rke_3 valueOf(String string) {
        return Enum.valueOf(rke_3.class, string);
    }

    private static /* synthetic */ rke_3[] id_class() {
        return new rke_3[]{CRAFTING, FURNACE, BLAST_FURNACE, SMOKER};
    }
}

