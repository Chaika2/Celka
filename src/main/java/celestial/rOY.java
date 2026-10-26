/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Locale;

public final class rOY
extends Enum<rOY> {
    public static final /* enum */ rOY KOB = new rOY(0, 0);
    public static final /* enum */ rOY SUNSTREAK = new rOY(0, 1);
    public static final /* enum */ rOY SNOOPER = new rOY(0, 2);
    public static final /* enum */ rOY DASHER = new rOY(0, 3);
    public static final /* enum */ rOY BRINELY = new rOY(0, 4);
    public static final /* enum */ rOY SPOTTY = new rOY(0, 5);
    public static final /* enum */ rOY FLOPPER = new rOY(1, 0);
    public static final /* enum */ rOY STRIPEY = new rOY(1, 1);
    public static final /* enum */ rOY GLITTER = new rOY(1, 2);
    public static final /* enum */ rOY BLOCKFISH = new rOY(1, 3);
    public static final /* enum */ rOY BETTY = new rOY(1, 4);
    public static final /* enum */ rOY CLAYFISH = new rOY(1, 5);
    private final int field_212552_m;
    private final int field_212553_n;
    private static final rOY[] field_212554_o;
    private static final /* synthetic */ rOY[] $VALUES;

    public String id_byte() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    private rOY(int n2, int n3) {
        this.field_212552_m = n2;
        this.field_212553_n = n3;
    }

    static {
        $VALUES = rOY.id_protected();
        field_212554_o = rOY.values();
    }

    public static rOY[] values() {
        return (rOY[])$VALUES.clone();
    }

    public static rOY valueOf(String string) {
        return Enum.valueOf(rOY.class, string);
    }

    public int id_class() {
        return this.field_212552_m;
    }

    public static String id_class(int n, int n2) {
        return field_212554_o[n2 + 6 * n].id_byte();
    }

    public int id_break() {
        return this.field_212553_n;
    }

    private static /* synthetic */ rOY[] id_protected() {
        return new rOY[]{KOB, SUNSTREAK, SNOOPER, DASHER, BRINELY, SPOTTY, FLOPPER, STRIPEY, GLITTER, BLOCKFISH, BETTY, CLAYFISH};
    }
}

