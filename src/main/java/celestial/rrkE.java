/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdD;
import java.util.Comparator;

public class rrkE
implements Comparator<rrdD> {
    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rrdD)object, (rrdD)object2);
    }

    public int id_class(rrdD rrdD2, rrdD rrdD3) {
        return rrdD2.id_class().compareToIgnoreCase(rrdD3.id_class());
    }
}

