/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.ints.IntRBTreeSet
 *  it.unimi.dsi.fastutil.ints.IntSortedSet
 */
package celestial;

import celestial.rKI;
import celestial.rKn_1;
import celestial.rqm_3;
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;
import java.util.stream.IntStream;

public class rKw_1
implements rKn_1 {
    private final rKI[] id_class;
    private final double id_break;
    private final double id_byte;

    private rKw_1(rqm_3 rqm_32, IntSortedSet intSortedSet) {
        int n;
        if (intSortedSet.isEmpty()) {
            throw new IllegalArgumentException("Need some octaves!");
        }
        int n2 = -intSortedSet.firstInt();
        int n3 = n2 + (n = intSortedSet.lastInt()) + 1;
        if (n3 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
        }
        rKI rKI2 = new rKI(rqm_32);
        int n4 = n;
        this.id_class = new rKI[n3];
        if (n >= 0 && n < n3 && intSortedSet.contains(0)) {
            this.id_class[n] = rKI2;
        }
        for (int i = n + 1; i < n3; ++i) {
            if (i >= 0 && intSortedSet.contains(n4 - i)) {
                this.id_class[i] = new rKI(rqm_32);
                continue;
            }
            rqm_32.id_class(262);
        }
        if (n > 0) {
            long l = (long)(rKI2.id_class(rKI2.id_break, rKI2.id_byte, rKI2.id_protected) * 9.223372036854776E18);
            rqm_3 rqm_33 = new rqm_3(l);
            for (int i = n4 - 1; i >= 0; --i) {
                if (i < n3 && intSortedSet.contains(n4 - i)) {
                    this.id_class[i] = new rKI(rqm_33);
                    continue;
                }
                rqm_33.id_class(262);
            }
        }
        this.id_byte = Math.pow(2.0, n);
        this.id_break = 1.0 / (Math.pow(2.0, n3) - 1.0);
    }

    public rKw_1(rqm_3 rqm_32, List<Integer> list) {
        this(rqm_32, (IntSortedSet)new IntRBTreeSet(list));
    }

    public rKw_1(rqm_3 rqm_32, IntStream intStream) {
        this(rqm_32, (List)intStream.boxed().collect(ImmutableList.toImmutableList()));
    }

    public double id_class(double d, double d2, boolean bl) {
        double d3 = 0.0;
        double d4 = this.id_byte;
        double d5 = this.id_break;
        for (rKI rKI2 : this.id_class) {
            if (rKI2 != null) {
                d3 += rKI2.id_class(d * d4 + (bl ? rKI2.id_break : 0.0), d2 * d4 + (bl ? rKI2.id_byte : 0.0)) * d5;
            }
            d4 /= 2.0;
            d5 *= 2.0;
        }
        return d3;
    }

    @Override
    public double id_class(double d, double d2, double d3, double d4) {
        return this.id_class(d, d2, true) * 0.55;
    }
}

