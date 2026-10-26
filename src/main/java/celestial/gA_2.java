/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class gA_2
extends Enum<gA_2> {
    public static final /* enum */ gA_2 NONE = new gA_2();
    public static final /* enum */ gA_2 NORMAL = new gA_2();
    public static final /* enum */ gA_2 END = new gA_2();
    private static final /* synthetic */ gA_2[] $VALUES;

    static {
        $VALUES = gA_2.id_class();
    }

    public static gA_2[] values() {
        return (gA_2[])$VALUES.clone();
    }

    public static gA_2 valueOf(String string) {
        return Enum.valueOf(gA_2.class, string);
    }

    private static /* synthetic */ gA_2[] id_class() {
        return new gA_2[]{NONE, NORMAL, END};
    }
}

