/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.fc_3;
import celestial.rqR_2;
import celestial.uJ_2;

public final class uW_2
extends Enum<uW_2>
implements uJ_2 {
    public static final /* enum */ uW_2 INSTANCE = new uW_2();
    private static final fN_2 WHITE_GLYPH;
    private static final /* synthetic */ uW_2[] $VALUES;

    @Override
    public float id_byte() {
        return 1.0f;
    }

    static {
        $VALUES = uW_2.id_volatile();
        WHITE_GLYPH = rqR_2.id_class(new fN_2(fc_3.RGBA, 5, 8, false), fN_22 -> {
            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 5; ++j) {
                    boolean bl = j == 0 || j + 1 == 5 || i == 0 || i + 1 == 8;
                    fN_22.id_class(j, i, -1);
                }
            }
            fN_22.id_catch();
        });
    }

    public static uW_2[] values() {
        return (uW_2[])$VALUES.clone();
    }

    public static uW_2 valueOf(String string) {
        return Enum.valueOf(uW_2.class, string);
    }

    @Override
    public void id_class(int n, int n2) {
        WHITE_GLYPH.id_class(0, n, n2, false);
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

    private static /* synthetic */ uW_2[] id_volatile() {
        return new uW_2[]{INSTANCE};
    }

    @Override
    public float getAdvance() {
        return 6.0f;
    }
}

