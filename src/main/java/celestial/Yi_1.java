/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Yi_1
extends Enum<Yi_1> {
    public static final /* enum */ Yi_1 ONLY = new Yi_1(false, false);
    public static final /* enum */ Yi_1 THROUGH = new Yi_1(true, true);
    public static final /* enum */ Yi_1 FROM = new Yi_1(false, true);
    public static final /* enum */ Yi_1 UNTIL = new Yi_1(true, false);
    public static final /* enum */ Yi_1 EVERYTHING = new Yi_1(true, true);
    public final boolean includesParents;
    public final boolean includesChildren;
    private static final /* synthetic */ Yi_1[] $VALUES;

    private Yi_1(boolean bl, boolean bl2) {
        this.includesParents = bl;
        this.includesChildren = bl2;
    }

    static {
        $VALUES = Yi_1.id_class();
    }

    public static Yi_1[] values() {
        return (Yi_1[])$VALUES.clone();
    }

    public static Yi_1 valueOf(String string) {
        return Enum.valueOf(Yi_1.class, string);
    }

    private static /* synthetic */ Yi_1[] id_class() {
        return new Yi_1[]{ONLY, THROUGH, FROM, UNTIL, EVERYTHING};
    }
}

