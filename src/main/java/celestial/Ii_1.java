/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.IJ;
import celestial.Ia_1;
import celestial.fr_3;
import com.google.common.collect.Lists;
import java.util.List;

public class Ii_1 {
    private final List<fr_3> id_class = Lists.newArrayList();

    public Ii_1 id_class(IJ iJ, int n) {
        if (iJ != null) {
            this.id_class.add(new fr_3(iJ, n));
        }
        return this;
    }

    public IJ id_class() {
        if (this.id_class.isEmpty()) {
            return null;
        }
        return this.id_class.size() == 1 ? this.id_class.get((int)0).id_class : new Ia_1(this.id_class);
    }
}

