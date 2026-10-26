/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class cK_2
extends Enum<cK_2> {
    public static final /* enum */ cK_2 OBTAINED = new cK_2(0);
    public static final /* enum */ cK_2 UNOBTAINED = new cK_2(1);
    private final int id;
    private static final /* synthetic */ cK_2[] $VALUES;

    private cK_2(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = cK_2.id_break();
    }

    public static cK_2[] values() {
        return (cK_2[])$VALUES.clone();
    }

    public static cK_2 valueOf(String string) {
        return Enum.valueOf(cK_2.class, string);
    }

    public int id_class() {
        return this.id;
    }

    private static /* synthetic */ cK_2[] id_break() {
        return new cK_2[]{OBTAINED, UNOBTAINED};
    }
}

