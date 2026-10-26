/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCI
extends Enum<rCI>
implements rpH_2 {
    public static final /* enum */ rCI LEFT = new rCI();
    public static final /* enum */ rCI RIGHT = new rCI();
    private static final /* synthetic */ rCI[] $VALUES;

    static {
        $VALUES = rCI.id_break();
    }

    public String toString() {
        return this.id_class();
    }

    public static rCI[] values() {
        return (rCI[])$VALUES.clone();
    }

    public static rCI valueOf(String string) {
        return Enum.valueOf(rCI.class, string);
    }

    @Override
    public String id_class() {
        return this == LEFT ? "left" : "right";
    }

    private static /* synthetic */ rCI[] id_break() {
        return new rCI[]{LEFT, RIGHT};
    }
}

