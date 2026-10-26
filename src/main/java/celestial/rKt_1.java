/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.ints.IntBidirectionalIterator
 *  it.unimi.dsi.fastutil.ints.IntRBTreeSet
 *  it.unimi.dsi.fastutil.ints.IntSortedSet
 */
package celestial;

import celestial.rKn_1;
import celestial.rKy_1;
import celestial.rfU_2;
import celestial.rqm_3;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntBidirectionalIterator;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;
import java.util.stream.IntStream;

public class rKt_1
implements rKn_1 {
    private final rKy_1[] id_class;
    private final DoubleList id_break;
    private final double id_byte;
    private final double id_protected;

    private rKt_1(rqm_3 rqm_32, Pair<Integer, DoubleList> pair) {
        double d;
        int n = (Integer)pair.getFirst();
        this.id_break = (DoubleList)pair.getSecond();
        rKy_1 rKy_12 = new rKy_1(rqm_32);
        int n2 = this.id_break.size();
        int n3 = -n;
        this.id_class = new rKy_1[n2];
        if (n3 >= 0 && n3 < n2 && (d = this.id_break.getDouble(n3)) != 0.0) {
            this.id_class[n3] = rKy_12;
        }
        for (int i = n3 - 1; i >= 0; --i) {
            if (i < n2) {
                double d2 = this.id_break.getDouble(i);
                if (d2 != 0.0) {
                    this.id_class[i] = new rKy_1(rqm_32);
                    continue;
                }
                rqm_32.id_class(262);
                continue;
            }
            rqm_32.id_class(262);
        }
        if (n3 < n2 - 1) {
            long l = (long)(rKy_12.id_class(0.0, 0.0, 0.0, 0.0, 0.0) * 9.223372036854776E18);
            rqm_3 rqm_33 = new rqm_3(l);
            for (int i = n3 + 1; i < n2; ++i) {
                if (i >= 0) {
                    double d3 = this.id_break.getDouble(i);
                    if (d3 != 0.0) {
                        this.id_class[i] = new rKy_1(rqm_33);
                        continue;
                    }
                    rqm_33.id_class(262);
                    continue;
                }
                rqm_33.id_class(262);
            }
        }
        this.id_protected = Math.pow(2.0, -n3);
        this.id_byte = Math.pow(2.0, n2 - 1) / (Math.pow(2.0, n2) - 1.0);
    }

    private rKt_1(rqm_3 rqm_32, IntSortedSet intSortedSet) {
        this(rqm_32, rKt_1.id_class(intSortedSet));
    }

    public rKt_1(rqm_3 rqm_32, List<Integer> list) {
        this(rqm_32, (IntSortedSet)new IntRBTreeSet(list));
    }

    public rKt_1(rqm_3 rqm_32, IntStream intStream) {
        this(rqm_32, (List)intStream.boxed().collect(ImmutableList.toImmutableList()));
    }

    public double id_class(double d, double d2, double d3, double d4, double d5, boolean bl) {
        double d6 = 0.0;
        double d7 = this.id_protected;
        double d8 = this.id_byte;
        for (int i = 0; i < this.id_class.length; ++i) {
            rKy_1 rKy_12 = this.id_class[i];
            if (rKy_12 != null) {
                d6 += this.id_break.getDouble(i) * rKy_12.id_class(rKt_1.id_class(d * d7), bl ? -rKy_12.id_break : rKt_1.id_class(d2 * d7), rKt_1.id_class(d3 * d7), d4 * d7, d5 * d7) * d8;
            }
            d7 *= 2.0;
            d8 /= 2.0;
        }
        return d6;
    }

    public rKy_1 id_class(int n) {
        return this.id_class[this.id_class.length - 1 - n];
    }

    @Override
    public double id_class(double d, double d2, double d3, double d4) {
        return this.id_class(d, d2, 0.0, d3, d4, false);
    }

    public static double id_class(double d) {
        return d - (double)rfU_2.id_protected(d / 3.3554432E7 + 0.5) * 3.3554432E7;
    }

    public double id_class(double d, double d2, double d3) {
        return this.id_class(d, d2, d3, 0.0, 0.0, false);
    }

    private static Pair<Integer, DoubleList> id_class(IntSortedSet intSortedSet) {
        int n;
        if (intSortedSet.isEmpty()) {
            throw new IllegalArgumentException("Need some octaves!");
        }
        int n2 = -intSortedSet.firstInt();
        int n3 = n2 + (n = intSortedSet.lastInt()) + 1;
        if (n3 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
        }
        DoubleArrayList doubleArrayList = new DoubleArrayList(new double[n3]);
        IntBidirectionalIterator intBidirectionalIterator = intSortedSet.iterator();
        while (intBidirectionalIterator.hasNext()) {
            int n4 = intBidirectionalIterator.nextInt();
            doubleArrayList.set(n4 + n2, 1.0);
        }
        return Pair.of((Object)(-n2), (Object)doubleArrayList);
    }

    public static rKt_1 id_class(rqm_3 rqm_32, int n, DoubleList doubleList) {
        return new rKt_1(rqm_32, (Pair<Integer, DoubleList>)Pair.of((Object)n, (Object)doubleList));
    }
}

