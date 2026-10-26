/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 */
package celestial;

import celestial.rRR;
import celestial.rfH_2;
import celestial.ryw_3;
import com.google.common.cache.CacheLoader;

public class QX
extends CacheLoader<rfH_2, ryw_3> {
    private final rRR id_class;
    private final boolean id_break;

    public QX(rRR rRR2, boolean bl) {
        this.id_class = rRR2;
        this.id_break = bl;
    }

    public /* synthetic */ Object load(Object object) throws Exception {
        return this.id_class((rfH_2)object);
    }

    public ryw_3 id_class(rfH_2 rfH_22) throws Exception {
        return new ryw_3(this.id_class, rfH_22, this.id_break);
    }
}

