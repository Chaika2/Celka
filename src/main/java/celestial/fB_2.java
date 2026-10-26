/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCF;
import celestial.xc_3;
import celestial.xd_3;
import java.util.function.Predicate;

@FunctionalInterface
public interface fB_2 {
    public static final fB_2 id_class = rCF2 -> xc_32 -> true;
    public static final fB_2 id_break = rCF2 -> xc_32 -> false;

    public Predicate<xc_3> getPredicate(rCF<xd_3, xc_3> var1);
}

