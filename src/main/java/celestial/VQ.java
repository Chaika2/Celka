/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ForwardingList
 */
package celestial;

import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rqs_3;
import com.google.common.collect.ForwardingList;
import java.util.Iterator;
import java.util.List;

public class VQ
extends ForwardingList<rdn_3> {
    private final rqs_3<rdn_3> id_class = rqs_3.id_class(rhz_3.id_protected(), rdn_3.id_break);

    public boolean isEmpty() {
        Iterator iterator = this.delegate().iterator();
        while (iterator.hasNext()) {
            rdn_3 rdn_32 = (rdn_3)iterator.next();
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    public void id_class(rcy_3 rcy_32) {
        Object object = this.delegate();
        for (int i = 0; i < object.size(); ++i) {
            object.set(i, rdn_3.id_class(rcy_32.id_class(i)));
        }
    }

    public rcy_3 id_class() {
        rcy_3 rcy_32 = new rcy_3();
        Iterator iterator = this.delegate().iterator();
        while (iterator.hasNext()) {
            rdn_3 rdn_32 = (rdn_3)iterator.next();
            rcy_32.add(rdn_32.id_break(new rcd_3()));
        }
        return rcy_32;
    }

    protected List<rdn_3> delegate() {
        return this.id_class;
    }
}

