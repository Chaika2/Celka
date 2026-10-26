/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QF;
import celestial.VF;
import celestial.cN_2;
import celestial.jI_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rrba_3;
import celestial.rrbb_3;

public class rrMu_1 {
    public static boolean id_class(VF vF) {
        rgP_2 rgP_22 = rrMu_1.id_class(vF, 0.0);
        return rgP_22 != null;
    }

    public static rgP_2 id_class(QF qF, double d) {
        if (qF == QF.id_int) {
            return qF.id_class(new rgn_3("options.chunks", (int)d));
        }
        if (qF == QF.id_volatile) {
            if (d >= 4.0) {
                return qF.id_class(new rgn_3("of.general.max"));
            }
            return d == 0.0 ? cN_2.id_class(qF.id_class(), false) : qF.id_byte((int)d);
        }
        if (qF == QF.id_class) {
            int n = (int)d * 2 + 1;
            return qF.id_class(new rgn_3("options.biomeBlendRadius." + n));
        }
        String string = rrMu_1.id_break(qF, d);
        return string != null ? new rgN_2(string) : null;
    }

    public static String id_break(QF qF, double d) {
        String string = jI_2.id_class(qF.id_byte(), new Object[0]) + ": ";
        if (qF == QF.d) {
            return d == 0.0 ? string + jI_2.id_class("options.off", new Object[0]) : string + (int)(d * 100.0) + "%";
        }
        if (qF == QF.s) {
            int n = (int)d;
            switch (n) {
                case 0: {
                    return string + rrba_3.id_class("of.options.mipmap.nearest");
                }
                case 1: {
                    return string + rrba_3.id_class("of.options.mipmap.linear");
                }
                case 2: {
                    return string + rrba_3.id_class("of.options.mipmap.bilinear");
                }
                case 3: {
                    return string + rrba_3.id_class("of.options.mipmap.trilinear");
                }
            }
            return string + "of.options.mipmap.nearest";
        }
        if (qF == QF.rr) {
            int n = (int)d;
            Object object = "";
            if (n != rrbb_3.q()) {
                object = " (" + rrba_3.id_class("of.general.restart") + ")";
            }
            return n == 0 ? string + rrba_3.id_byte() + (String)object : string + n + (String)object;
        }
        if (qF == QF.rP) {
            int n = (int)d;
            return n == 1 ? string + rrba_3.id_byte() : string + n;
        }
        return null;
    }
}

