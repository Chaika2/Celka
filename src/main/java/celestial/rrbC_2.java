/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrbC_2
extends Enum<rrbC_2> {
    public static final /* enum */ rrbC_2 HORSE = new rrbC_2();
    public static final /* enum */ rrbC_2 DONKEY = new rrbC_2();
    public static final /* enum */ rrbC_2 MULE = new rrbC_2();
    public static final /* enum */ rrbC_2 LLAMA = new rrbC_2();
    public static final /* enum */ rrbC_2 DISPENSER = new rrbC_2();
    public static final /* enum */ rrbC_2 DROPPER = new rrbC_2();
    private static final /* synthetic */ rrbC_2[] $VALUES;

    static {
        $VALUES = rrbC_2.id_class();
    }

    public static rrbC_2[] values() {
        return (rrbC_2[])$VALUES.clone();
    }

    public static rrbC_2 valueOf(String string) {
        return Enum.valueOf(rrbC_2.class, string);
    }

    private static /* synthetic */ rrbC_2[] id_class() {
        return new rrbC_2[]{HORSE, DONKEY, MULE, LLAMA, DISPENSER, DROPPER};
    }
}

