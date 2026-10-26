/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYG;
import celestial.rYT;
import celestial.rYn_1;
import celestial.rYq_1;

public final class rYH
extends Enum<rYH>
implements rYT {
    public static final /* enum */ rYH INSTANCE = new rYH();
    private static final /* synthetic */ rYH[] $VALUES;

    static {
        $VALUES = rYH.id_class();
    }

    public static rYH[] values() {
        return (rYH[])$VALUES.clone();
    }

    public static rYH valueOf(String string) {
        return Enum.valueOf(rYH.class, string);
    }

    private static /* synthetic */ rYH[] id_class() {
        return new rYH[]{INSTANCE};
    }

    @Override
    public rYG id_class(long l, int n, int n2, int n3, rYn_1 rYn_12) {
        return rYq_1.INSTANCE.id_class(l, n, 0, n3, rYn_12);
    }
}

