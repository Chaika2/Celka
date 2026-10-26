/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYG;
import celestial.rYT;
import celestial.rYn_1;

public final class rYp_1
extends Enum<rYp_1>
implements rYT {
    public static final /* enum */ rYp_1 INSTANCE = new rYp_1();
    private static final /* synthetic */ rYp_1[] $VALUES;

    static {
        $VALUES = rYp_1.id_class();
    }

    public static rYp_1[] values() {
        return (rYp_1[])$VALUES.clone();
    }

    public static rYp_1 valueOf(String string) {
        return Enum.valueOf(rYp_1.class, string);
    }

    private static /* synthetic */ rYp_1[] id_class() {
        return new rYp_1[]{INSTANCE};
    }

    @Override
    public rYG id_class(long l, int n, int n2, int n3, rYn_1 rYn_12) {
        return rYn_12.id_protected(n >> 2, n2 >> 2, n3 >> 2);
    }
}

