/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;

public final class rpZ_2
extends Enum<rpZ_2> {
    public static final /* enum */ rpZ_2 LEFT = new rpZ_2(new rgn_3("options.mainHand.left"));
    public static final /* enum */ rpZ_2 RIGHT = new rpZ_2(new rgn_3("options.mainHand.right"));
    private final rgP_2 handName;
    private static final /* synthetic */ rpZ_2[] $VALUES;

    private static /* synthetic */ rpZ_2[] id_byte() {
        return new rpZ_2[]{LEFT, RIGHT};
    }

    private rpZ_2(rgP_2 rgP_22) {
        this.handName = rgP_22;
    }

    static {
        $VALUES = rpZ_2.id_byte();
    }

    public String toString() {
        return this.handName.getString();
    }

    public static rpZ_2[] values() {
        return (rpZ_2[])$VALUES.clone();
    }

    public static rpZ_2 valueOf(String string) {
        return Enum.valueOf(rpZ_2.class, string);
    }

    public rpZ_2 id_class() {
        return this == LEFT ? RIGHT : LEFT;
    }

    public rgP_2 id_break() {
        return this.handName;
    }
}

