/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rZT
extends Enum<rZT> {
    public static final /* enum */ rZT INTERACT = new rZT();
    public static final /* enum */ rZT ATTACK = new rZT();
    public static final /* enum */ rZT INTERACT_AT = new rZT();
    private static final /* synthetic */ rZT[] $VALUES;

    static {
        $VALUES = rZT.id_class();
    }

    public static rZT[] values() {
        return (rZT[])$VALUES.clone();
    }

    public static rZT valueOf(String string) {
        return Enum.valueOf(rZT.class, string);
    }

    private static /* synthetic */ rZT[] id_class() {
        return new rZT[]{INTERACT, ATTACK, INTERACT_AT};
    }
}

