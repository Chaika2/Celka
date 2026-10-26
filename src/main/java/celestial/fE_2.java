/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 */
package celestial;

import celestial.fB_2;
import celestial.rCF;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fE_2
implements fB_2 {
    private final Iterable<? extends fB_2> id_byte;

    public fE_2(Iterable<? extends fB_2> iterable) {
        this.id_byte = iterable;
    }

    @Override
    public Predicate<xc_3> getPredicate(rCF<xd_3, xc_3> rCF2) {
        List list = Streams.stream(this.id_byte).map(fB_22 -> fB_22.getPredicate(rCF2)).collect(Collectors.toList());
        return xc_32 -> list.stream().anyMatch(predicate -> predicate.test(xc_32));
    }
}

