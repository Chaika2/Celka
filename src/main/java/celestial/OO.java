/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class OO
extends Enum<OO> {
    public static final /* enum */ OO INSTANCE = new OO();
    protected int x;
    protected int y;
    protected int w;
    protected int h;
    private static final /* synthetic */ OO[] $VALUES;

    static {
        $VALUES = OO.id_class();
    }

    public static OO[] values() {
        return (OO[])$VALUES.clone();
    }

    public static OO valueOf(String string) {
        return Enum.valueOf(OO.class, string);
    }

    private static /* synthetic */ OO[] id_class() {
        return new OO[]{INSTANCE};
    }
}

