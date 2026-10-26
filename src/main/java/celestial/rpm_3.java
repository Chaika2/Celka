/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rpm_3
extends Enum<rpm_3> {
    public static final /* enum */ rpm_3 MAIN_HAND = new rpm_3();
    public static final /* enum */ rpm_3 OFF_HAND = new rpm_3();
    private static final /* synthetic */ rpm_3[] $VALUES;

    static {
        $VALUES = rpm_3.id_break();
    }

    public static rpm_3[] values() {
        return (rpm_3[])$VALUES.clone();
    }

    public static rpm_3 valueOf(String string) {
        return Enum.valueOf(rpm_3.class, string);
    }

    public rpm_3 id_class() {
        return this == MAIN_HAND ? OFF_HAND : MAIN_HAND;
    }

    private static /* synthetic */ rpm_3[] id_break() {
        return new rpm_3[]{MAIN_HAND, OFF_HAND};
    }
}

