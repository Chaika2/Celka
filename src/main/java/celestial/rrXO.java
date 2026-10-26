/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public class rrXO {
    public static Iq_1 id_class(Iterator<Iq_1> iterator, int n) {
        if (iterator == null) {
            return null;
        }
        if (n < 0) {
            return null;
        }
        for (int i = 0; i < n; ++i) {
            if (!iterator.hasNext()) {
                return null;
            }
            Iq_1 iq_1 = iterator.next();
        }
        return !iterator.hasNext() ? null : iterator.next();
    }

    public static Iq_1 id_class(ImmutableList<Iq_1> immutableList, int n) {
        if (immutableList == null) {
            return null;
        }
        if (n < 0) {
            return null;
        }
        return n >= immutableList.size() ? null : (Iq_1)immutableList.get(n);
    }
}

