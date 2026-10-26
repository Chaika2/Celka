/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.II;
import celestial.IJ;
import celestial.Ip_1;
import celestial.fj_3;
import celestial.rCZ;
import celestial.rVL;
import celestial.rqO_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class lY_2 {
    private final Map<xc_3, IJ> id_class = Maps.newIdentityHashMap();
    private final Ip_1 id_break;

    public static II id_byte(xc_3 xc_32) {
        return lY_2.id_class(rVL.id_strictfp.id_break(xc_32.id_break()), xc_32);
    }

    public lY_2(Ip_1 ip_1) {
        this.id_break = ip_1;
    }

    public static String id_class(Map<rCZ<?>, Comparable<?>> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<rCZ<?>, Comparable<?>> entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(',');
            }
            rCZ<?> rCZ2 = entry.getKey();
            stringBuilder.append(rCZ2.id_throws());
            stringBuilder.append('=');
            stringBuilder.append(lY_2.id_class(rCZ2, entry.getValue()));
        }
        return stringBuilder.toString();
    }

    public fj_3 id_class(xc_3 xc_32) {
        return this.id_break(xc_32).id_throws();
    }

    private static <T extends Comparable<T>> String id_class(rCZ<T> rCZ2, Comparable<?> comparable) {
        return rCZ2.id_class(comparable);
    }

    public Ip_1 id_class() {
        return this.id_break;
    }

    public static II id_class(rqO_2 rqO_22, xc_3 xc_32) {
        return new II(rqO_22, lY_2.id_class(xc_32.id_goto()));
    }

    public IJ id_break(xc_3 xc_32) {
        IJ iJ = this.id_class.get(xc_32);
        if (iJ == null) {
            iJ = this.id_break.id_break();
        }
        return iJ;
    }

    public void id_break() {
        this.id_class.clear();
        for (xd_3 xd_32 : rVL.id_strictfp) {
            xd_32.id_new().id_class().forEach(xc_32 -> {
                IJ iJ = this.id_class.put((xc_3)xc_32, this.id_break.id_class(lY_2.id_byte(xc_32)));
            });
        }
    }
}

