/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class jF_2
extends Enum<jF_2> {
    public static final /* enum */ jF_2 FLOAT = new jF_2(4, "Float", 5126);
    public static final /* enum */ jF_2 UBYTE = new jF_2(1, "Unsigned Byte", 5121);
    public static final /* enum */ jF_2 BYTE = new jF_2(1, "Byte", 5120);
    public static final /* enum */ jF_2 USHORT = new jF_2(2, "Unsigned Short", 5123);
    public static final /* enum */ jF_2 SHORT = new jF_2(2, "Short", 5122);
    public static final /* enum */ jF_2 UINT = new jF_2(4, "Unsigned Int", 5125);
    public static final /* enum */ jF_2 INT = new jF_2(4, "Int", 5124);
    private final int size;
    private final String displayName;
    private final int glConstant;
    private static final /* synthetic */ jF_2[] $VALUES;

    public int id_byte() {
        return this.glConstant;
    }

    private jF_2(int n2, String string2, int n3) {
        this.size = n2;
        this.displayName = string2;
        this.glConstant = n3;
    }

    static {
        $VALUES = jF_2.id_protected();
    }

    public static jF_2[] values() {
        return (jF_2[])$VALUES.clone();
    }

    public static jF_2 valueOf(String string) {
        return Enum.valueOf(jF_2.class, string);
    }

    public int id_class() {
        return this.size;
    }

    public String id_break() {
        return this.displayName;
    }

    private static /* synthetic */ jF_2[] id_protected() {
        return new jF_2[]{FLOAT, UBYTE, BYTE, USHORT, SHORT, UINT, INT};
    }
}

