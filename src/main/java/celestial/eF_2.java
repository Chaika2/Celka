/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class eF_2
extends Enum<eF_2> {
    public static final /* enum */ eF_2 COMMON = new eF_2(10);
    public static final /* enum */ eF_2 UNCOMMON = new eF_2(5);
    public static final /* enum */ eF_2 RARE = new eF_2(2);
    public static final /* enum */ eF_2 VERY_RARE = new eF_2(1);
    private final int weight;
    private static final /* synthetic */ eF_2[] $VALUES;

    private eF_2(int n2) {
        this.weight = n2;
    }

    static {
        $VALUES = eF_2.id_break();
    }

    public static eF_2[] values() {
        return (eF_2[])$VALUES.clone();
    }

    public static eF_2 valueOf(String string) {
        return Enum.valueOf(eF_2.class, string);
    }

    public int id_class() {
        return this.weight;
    }

    private static /* synthetic */ eF_2[] id_break() {
        return new eF_2[]{COMMON, UNCOMMON, RARE, VERY_RARE};
    }
}

