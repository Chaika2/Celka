/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class xN_2
extends Enum<xN_2> {
    public static final /* enum */ xN_2 INVISIBLE = new xN_2();
    public static final /* enum */ xN_2 ENTITYBLOCK_ANIMATED = new xN_2();
    public static final /* enum */ xN_2 MODEL = new xN_2();
    private static final /* synthetic */ xN_2[] $VALUES;

    static {
        $VALUES = xN_2.id_class();
    }

    public static xN_2[] values() {
        return (xN_2[])$VALUES.clone();
    }

    public static xN_2 valueOf(String string) {
        return Enum.valueOf(xN_2.class, string);
    }

    private static /* synthetic */ xN_2[] id_class() {
        return new xN_2[]{INVISIBLE, ENTITYBLOCK_ANIMATED, MODEL};
    }
}

