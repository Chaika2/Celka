/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class iM_2
extends Enum<iM_2> {
    public static final /* enum */ iM_2 STANDING = new iM_2();
    public static final /* enum */ iM_2 FALL_FLYING = new iM_2();
    public static final /* enum */ iM_2 SLEEPING = new iM_2();
    public static final /* enum */ iM_2 SWIMMING = new iM_2();
    public static final /* enum */ iM_2 SPIN_ATTACK = new iM_2();
    public static final /* enum */ iM_2 CROUCHING = new iM_2();
    public static final /* enum */ iM_2 DYING = new iM_2();
    private static final /* synthetic */ iM_2[] $VALUES;

    static {
        $VALUES = iM_2.id_class();
    }

    public static iM_2[] values() {
        return (iM_2[])$VALUES.clone();
    }

    public static iM_2 valueOf(String string) {
        return Enum.valueOf(iM_2.class, string);
    }

    private static /* synthetic */ iM_2[] id_class() {
        return new iM_2[]{STANDING, FALL_FLYING, SLEEPING, SWIMMING, SPIN_ATTACK, CROUCHING, DYING};
    }
}

