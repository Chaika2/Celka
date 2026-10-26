/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.WI;

public final class Wf_1
extends Enum<Wf_1>
implements WI {
    public static final /* enum */ Wf_1 SKELETON = new Wf_1();
    public static final /* enum */ Wf_1 WITHER_SKELETON = new Wf_1();
    public static final /* enum */ Wf_1 PLAYER = new Wf_1();
    public static final /* enum */ Wf_1 ZOMBIE = new Wf_1();
    public static final /* enum */ Wf_1 CREEPER = new Wf_1();
    public static final /* enum */ Wf_1 DRAGON = new Wf_1();
    private static final /* synthetic */ Wf_1[] $VALUES;

    static {
        $VALUES = Wf_1.id_class();
    }

    public static Wf_1[] values() {
        return (Wf_1[])$VALUES.clone();
    }

    public static Wf_1 valueOf(String string) {
        return Enum.valueOf(Wf_1.class, string);
    }

    private static /* synthetic */ Wf_1[] id_class() {
        return new Wf_1[]{SKELETON, WITHER_SKELETON, PLAYER, ZOMBIE, CREEPER, DRAGON};
    }
}

