/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.NK;
import celestial.Na_1;
import com.google.common.collect.Sets;
import java.util.Set;

public class Ne_1
implements Na_1 {
    private final int id_class;
    private final Set<NK> id_break = Sets.newIdentityHashSet();

    @Override
    public int id_byte() {
        return this.id_class;
    }

    public Ne_1(int n) {
        this.id_class = n;
    }

    @Override
    public NK id_class() {
        if (this.id_break.size() >= this.id_class) {
            return null;
        }
        NK nK = NK.id_class();
        if (nK != null) {
            this.id_break.add(nK);
        }
        return nK;
    }

    @Override
    public boolean id_class(NK nK) {
        if (!this.id_break.remove(nK)) {
            return false;
        }
        nK.id_break();
        return true;
    }

    @Override
    public void id_break() {
        this.id_break.forEach(NK::id_break);
        this.id_break.clear();
    }

    @Override
    public int id_protected() {
        return this.id_break.size();
    }
}

