/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrdR
extends Enum<rrdR> {
    public static final /* enum */ rrdR UNIFORM = new rrdR();
    public static final /* enum */ rrdR ATTRIBUTE = new rrdR();
    public static final /* enum */ rrdR CONST_INT = new rrdR();
    public static final /* enum */ rrdR CONST_IVEC3 = new rrdR();
    public static final /* enum */ rrdR CONST_FLOAT = new rrdR();
    public static final /* enum */ rrdR CONST_VEC2 = new rrdR();
    public static final /* enum */ rrdR CONST_VEC4 = new rrdR();
    public static final /* enum */ rrdR CONST_BOOL = new rrdR();
    public static final /* enum */ rrdR PROPERTY = new rrdR();
    public static final /* enum */ rrdR EXTENSION = new rrdR();
    public static final /* enum */ rrdR LAYOUT = new rrdR();
    private static final /* synthetic */ rrdR[] $VALUES;

    static {
        $VALUES = rrdR.id_class();
    }

    public static rrdR[] values() {
        return (rrdR[])$VALUES.clone();
    }

    public static rrdR valueOf(String string) {
        return Enum.valueOf(rrdR.class, string);
    }

    private static /* synthetic */ rrdR[] id_class() {
        return new rrdR[]{UNIFORM, ATTRIBUTE, CONST_INT, CONST_IVEC3, CONST_FLOAT, CONST_VEC2, CONST_VEC4, CONST_BOOL, PROPERTY, EXTENSION, LAYOUT};
    }
}

