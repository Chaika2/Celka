/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.fc_3;
import celestial.rqR_2;
import celestial.uJ_2;

public final class us_3
extends Enum<us_3>
implements uJ_2 {
    public static final /* enum */ us_3 INSTANCE = new us_3();
    private static final fN_2 NATIVE_IMAGE;
    private static final /* synthetic */ us_3[] $VALUES;

    @Override
    public float id_byte() {
        return 1.0f;
    }

    static {
        $VALUES = us_3.id_volatile();
        NATIVE_IMAGE = rqR_2.id_class(new fN_2(fc_3.RGBA, 5, 8, false), fN_22 -> {
            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 5; ++j) {
                    boolean bl = j == 0 || j + 1 == 5 || i == 0 || i + 1 == 8;
                    fN_22.id_class(j, i, bl ? -1 : 0);
                }
            }
            fN_22.id_catch();
        });
    }

    public static us_3[] values() {
        return (us_3[])$VALUES.clone();
    }

    public static us_3 valueOf(String string) {
        return Enum.valueOf(us_3.class, string);
    }

    @Override
    public void id_class(int n, int n2) {
        NATIVE_IMAGE.id_class(0, n, n2, false);
    }

    @Override
    public int id_class() {
        return 5;
    }

    @Override
    public int id_break() {
        return 8;
    }

    @Override
    public boolean id_protected() {
        return true;
    }

    private static /* synthetic */ us_3[] id_volatile() {
        return new us_3[]{INSTANCE};
    }

    @Override
    public float getAdvance() {
        return 6.0f;
    }
}

