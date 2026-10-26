/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqu_3;

public final class rAl_1
extends Enum<rAl_1> {
    public static final /* enum */ rAl_1 TOO_OLD = new rAl_1("old");
    public static final /* enum */ rAl_1 TOO_NEW = new rAl_1("new");
    public static final /* enum */ rAl_1 COMPATIBLE = new rAl_1("compatible");
    private final rgP_2 description;
    private final rgP_2 confirmMessage;
    private static final /* synthetic */ rAl_1[] $VALUES;

    public rgP_2 id_byte() {
        return this.confirmMessage;
    }

    private rAl_1(String string2) {
        this.description = new rgn_3("pack.incompatible." + string2).id_class(rgF_2.GRAY);
        this.confirmMessage = new rgn_3("pack.incompatible.confirm." + string2);
    }

    static {
        $VALUES = rAl_1.id_protected();
    }

    public static rAl_1[] values() {
        return (rAl_1[])$VALUES.clone();
    }

    public static rAl_1 valueOf(String string) {
        return Enum.valueOf(rAl_1.class, string);
    }

    public static rAl_1 id_class(int n) {
        if (n < rqu_3.id_class().getPackVersion()) {
            return TOO_OLD;
        }
        return n > rqu_3.id_class().getPackVersion() ? TOO_NEW : COMPATIBLE;
    }

    public boolean id_class() {
        return this == COMPATIBLE;
    }

    public rgP_2 id_break() {
        return this.description;
    }

    private static /* synthetic */ rAl_1[] id_protected() {
        return new rAl_1[]{TOO_OLD, TOO_NEW, COMPATIBLE};
    }
}

