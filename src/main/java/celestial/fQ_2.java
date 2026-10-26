/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.QY;
import celestial.fJ_2;
import celestial.fN_2;
import celestial.fV_2;
import celestial.ff_3;
import celestial.fj_3;
import celestial.fk_3;
import celestial.ja_3;
import celestial.ji_3;
import celestial.rpo_3;
import celestial.rqO_2;
import com.google.common.collect.Lists;

public final class fQ_2
extends fj_3 {
    private static final rqO_2 id_int = new rqO_2("missingno");
    private static fk_3 id_new;
    private static final rpo_3<fN_2> id_continue;
    private static final fV_2 id_super;

    public static fk_3 id_byte() {
        if (id_new == null) {
            id_new = new fk_3(id_continue.id_class());
            QY.id_instanceof().A().id_class(id_int, (ff_3)id_new);
        }
        return id_new;
    }

    public fQ_2(fJ_2 fJ_22, fV_2 fV_22, int n, int n2, int n3, int n4, int n5) {
        super(fJ_22, fV_22, n, n2, n3, n4, n5, fQ_2.id_class(fV_22.id_break(), fV_22.id_byte()));
    }

    private fQ_2(fJ_2 fJ_22, int n, int n2, int n3, int n4, int n5) {
        super(fJ_22, id_super, n, n2, n3, n4, n5, id_continue.id_class());
    }

    static {
        id_continue = new rpo_3<fN_2>(() -> {
            fN_2 fN_22 = new fN_2(16, 16, false);
            int n = -16777216;
            int n2 = -524040;
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    if (i < 8 ^ j < 8) {
                        fN_22.id_class(j, i, -524040);
                        continue;
                    }
                    fN_22.id_class(j, i, -16777216);
                }
            }
            fN_22.id_catch();
            return fN_22;
        });
        id_super = new fV_2(id_int, 16, 16, new ji_3(Lists.newArrayList((Object[])new ja_3[]{new ja_3(0, -1)}), 16, 16, 1, false));
    }

    public static fQ_2 id_class(fJ_2 fJ_22, int n, int n2, int n3, int n4, int n5) {
        return new fQ_2(fJ_22, n, n2, n3, n4, n5);
    }

    public static rqO_2 id_class() {
        return id_int;
    }

    private static fN_2 id_class(int n, int n2) {
        int n3 = n / 2;
        int n4 = n2 / 2;
        fN_2 fN_22 = new fN_2(n, n2, false);
        int n5 = -16777216;
        int n6 = -524040;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i < n4 ^ j < n3) {
                    fN_22.id_class(j, i, n6);
                    continue;
                }
                fN_22.id_class(j, i, n5);
            }
        }
        return fN_22;
    }

    @Override
    public void close() {
        super.close();
    }

    public static fV_2 id_break() {
        return id_super;
    }
}

