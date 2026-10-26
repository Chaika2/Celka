/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IU;
import celestial.fB_2;
import celestial.rCF;
import celestial.xc_3;
import celestial.xd_3;
import java.util.function.Predicate;

public class fb_3 {
    private final fB_2 id_class;
    private final IU id_break;

    public fb_3(fB_2 fB_22, IU iU) {
        if (fB_22 == null) {
            throw new IllegalArgumentException("Missing condition for selector");
        }
        if (iU == null) {
            throw new IllegalArgumentException("Missing variant for selector");
        }
        this.id_class = fB_22;
        this.id_break = iU;
    }

    public boolean equals(Object object) {
        return this == object;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public IU id_class() {
        return this.id_break;
    }

    public Predicate<xc_3> id_class(rCF<xd_3, xc_3> rCF2) {
        return this.id_class.getPredicate(rCF2);
    }
}

