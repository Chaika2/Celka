/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rhT_2
extends Enum<rhT_2> {
    public static final /* enum */ rhT_2 FLYING = new rhT_2();
    public static final /* enum */ rhT_2 HOOKED_IN_ENTITY = new rhT_2();
    public static final /* enum */ rhT_2 BOBBING = new rhT_2();
    private static final /* synthetic */ rhT_2[] $VALUES;

    static {
        $VALUES = rhT_2.id_class();
    }

    public static rhT_2[] values() {
        return (rhT_2[])$VALUES.clone();
    }

    public static rhT_2 valueOf(String string) {
        return Enum.valueOf(rhT_2.class, string);
    }

    private static /* synthetic */ rhT_2[] id_class() {
        return new rhT_2[]{FLYING, HOOKED_IN_ENTITY, BOBBING};
    }
}

