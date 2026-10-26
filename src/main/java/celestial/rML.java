/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.xc_3;
import celestial.xu_3;

public final class rML
extends Enum<rML> {
    public static final /* enum */ rML RED = new rML("red", xu_3.rT.id_continue());
    public static final /* enum */ rML BROWN = new rML("brown", xu_3.rq.id_continue());
    public final String name;
    public final xc_3 renderState;
    private static final /* synthetic */ rML[] $VALUES;

    private rML(String string2, xc_3 xc_32) {
        this.name = string2;
        this.renderState = xc_32;
    }

    static {
        $VALUES = rML.id_break();
    }

    public static rML[] values() {
        return (rML[])$VALUES.clone();
    }

    public static rML valueOf(String string) {
        return Enum.valueOf(rML.class, string);
    }

    public xc_3 id_class() {
        return this.renderState;
    }

    public static rML id_class(String string) {
        for (rML rML2 : rML.values()) {
            if (!rML2.name.equals(string)) continue;
            return rML2;
        }
        return RED;
    }

    private static /* synthetic */ rML[] id_break() {
        return new rML[]{RED, BROWN};
    }
}

