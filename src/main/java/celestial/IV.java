/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.IJ;
import celestial.Ij_1;
import celestial.xc_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public class IV {
    private final List<Pair<Predicate<xc_3>, IJ>> id_class = Lists.newArrayList();

    public void id_class(Predicate<xc_3> predicate, IJ iJ) {
        this.id_class.add((Pair<Predicate<xc_3>, IJ>)Pair.of(predicate, (Object)iJ));
    }

    public IJ id_class() {
        return new Ij_1(this.id_class);
    }
}

