/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class ryZ_2
extends Enum<ryZ_2> {
    public static final /* enum */ ryZ_2 SUCCESS = new ryZ_2();
    public static final /* enum */ ryZ_2 CONSUME = new ryZ_2();
    public static final /* enum */ ryZ_2 PASS = new ryZ_2();
    public static final /* enum */ ryZ_2 FAIL = new ryZ_2();
    private static final /* synthetic */ ryZ_2[] $VALUES;

    public boolean id_byte() {
        return this == CONSUME;
    }

    static {
        $VALUES = ryZ_2.id_protected();
    }

    public static ryZ_2[] values() {
        return (ryZ_2[])$VALUES.clone();
    }

    public static ryZ_2 valueOf(String string) {
        return Enum.valueOf(ryZ_2.class, string);
    }

    public static ryZ_2 id_class(boolean bl) {
        return bl ? SUCCESS : CONSUME;
    }

    public boolean id_class() {
        return this == SUCCESS || this == CONSUME;
    }

    public boolean id_break() {
        return this == SUCCESS;
    }

    private static /* synthetic */ ryZ_2[] id_protected() {
        return new ryZ_2[]{SUCCESS, CONSUME, PASS, FAIL};
    }
}

