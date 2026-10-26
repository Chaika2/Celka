/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package celestial;

import celestial.rdn_3;
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class rrCA
implements Comparator<rdn_3> {
    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rdn_3)object, (rdn_3)object2);
    }

    public int id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return ComparisonChain.start().compare(rdn_33.id_char(), rdn_32.id_char()).result();
    }
}

