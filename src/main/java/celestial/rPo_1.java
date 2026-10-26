/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rPo_1
extends Enum<rPo_1> {
    public static final /* enum */ rPo_1 WAIT = new rPo_1();
    public static final /* enum */ rPo_1 MOVE_TO = new rPo_1();
    public static final /* enum */ rPo_1 STRAFE = new rPo_1();
    public static final /* enum */ rPo_1 JUMPING = new rPo_1();
    private static final /* synthetic */ rPo_1[] $VALUES;

    static {
        $VALUES = rPo_1.id_class();
    }

    public static rPo_1[] values() {
        return (rPo_1[])$VALUES.clone();
    }

    public static rPo_1 valueOf(String string) {
        return Enum.valueOf(rPo_1.class, string);
    }

    private static /* synthetic */ rPo_1[] id_class() {
        return new rPo_1[]{WAIT, MOVE_TO, STRAFE, JUMPING};
    }
}

