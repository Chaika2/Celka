/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.rRD;
import celestial.rRV;
import celestial.rYr_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rqO_2;
import celestial.rrEN;
import celestial.rrEm_1;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class rrEu_1<T>
implements rRV<T> {
    protected final Predicate<T> id_class;
    private final Function<T, rqO_2> id_break;
    private final Set<rRD<T>> id_byte = Sets.newHashSet();
    private final TreeSet<rRD<T>> id_protected = Sets.newTreeSet(rRD.id_class());
    private final rrEm_1 id_throws;
    private final Queue<rRD<T>> id_case = Queues.newArrayDeque();
    private final List<rRD<T>> id_catch = Lists.newArrayList();
    private final Consumer<rRD<T>> id_private;

    public rrEu_1(rrEm_1 rrEm_12, Predicate<T> predicate, Function<T, rqO_2> function, Consumer<rRD<T>> consumer) {
        this.id_class = predicate;
        this.id_break = function;
        this.id_throws = rrEm_12;
        this.id_private = consumer;
    }

    private static <T> rcy_3 id_class(Function<T, rqO_2> function, Iterable<rRD<T>> iterable, long l) {
        rcy_3 rcy_32 = new rcy_3();
        for (rRD<T> rRD2 : iterable) {
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("i", function.apply(rRD2.id_break()).toString());
            rcd_32.id_break("x", rRD2.id_class.b_());
            rcd_32.id_break("y", rRD2.id_class.c_());
            rcd_32.id_break("z", rRD2.id_class.d_());
            rcd_32.id_break("t", (int)(rRD2.id_break - l));
            rcd_32.id_break("p", rRD2.id_byte.id_class());
            rcy_32.add(rcd_32);
        }
        return rcy_32;
    }

    public rcy_3 id_class(rfj_3 rfj_32) {
        List<rRD<T>> list = this.id_class(rfj_32, false, true);
        return rrEu_1.id_class(this.id_break, list, this.id_throws.r());
    }

    public void id_class(rfi_3 rfi_32, rfH_2 rfH_22) {
        for (rRD<T> rRD2 : this.id_class(rfi_32, false, false)) {
            if (!rfi_32.id_break(rRD2.id_class)) continue;
            rfH_2 rfH_23 = rRD2.id_class.id_break(rfH_22);
            T t = rRD2.id_break();
            this.id_class(new rRD<T>(rfH_23, t, rRD2.id_break, rRD2.id_byte));
        }
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, T t) {
        return this.id_byte.contains(new rRD<T>(rfH_22, t));
    }

    @Override
    public void id_class(rfH_2 rfH_22, T t, int n, rYr_1 rYr_12) {
        if (!this.id_class.test(t)) {
            this.id_class(new rRD<T>(rfH_22, t, (long)n + this.id_throws.r(), rYr_12));
        }
    }

    private void id_class(rRD<T> rRD2) {
        if (!this.id_byte.contains(rRD2)) {
            this.id_byte.add(rRD2);
            this.id_protected.add(rRD2);
        }
    }

    public void id_class() {
        rRD<T> rRD2;
        int n = this.id_protected.size();
        if (n != this.id_byte.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (n > 65536) {
            n = 65536;
        }
        rrEN rrEN2 = this.id_throws.id_else();
        Iterator<rRD<T>> iterator = this.id_protected.iterator();
        while (n > 0 && iterator.hasNext()) {
            rRD2 = iterator.next();
            if (rRD2.id_break > this.id_throws.r()) break;
            if (!rrEN2.id_class(rRD2.id_class)) continue;
            iterator.remove();
            this.id_byte.remove(rRD2);
            this.id_case.add(rRD2);
            --n;
        }
        while ((rRD2 = this.id_case.poll()) != null) {
            if (rrEN2.id_class(rRD2.id_class)) {
                try {
                    this.id_catch.add(rRD2);
                    this.id_private.accept(rRD2);
                    continue;
                }
                catch (Throwable throwable) {
                    KY kY = KY.id_class(throwable, "Exception while ticking");
                    Ko_1 ko_1 = kY.id_class("Block being ticked");
                    Ko_1.id_class(ko_1, rRD2.id_class, null);
                    throw new KU(kY);
                }
            }
            this.id_class(rRD2.id_class, rRD2.id_break(), 0);
        }
        this.id_catch.clear();
        this.id_case.clear();
    }

    public List<rRD<T>> id_class(rfj_3 rfj_32, boolean bl, boolean bl2) {
        int n = (rfj_32.id_break << 4) - 2;
        int n2 = n + 16 + 2;
        int n3 = (rfj_32.id_byte << 4) - 2;
        int n4 = n3 + 16 + 2;
        return this.id_class(new rfi_3(n, 0, n3, n2, 256, n4), bl, bl2);
    }

    public List<rRD<T>> id_class(rfi_3 rfi_32, boolean bl, boolean bl2) {
        List<rRD<T>> list = this.id_class((List)null, this.id_protected, rfi_32, bl);
        if (bl && list != null) {
            this.id_byte.removeAll(list);
        }
        list = this.id_class(list, this.id_case, rfi_32, bl);
        if (!bl2) {
            list = this.id_class(list, this.id_catch, rfi_32, bl);
        }
        return list == null ? Collections.emptyList() : list;
    }

    private List<rRD<T>> id_class(List<rRD<T>> arrayList, Collection<rRD<T>> collection, rfi_3 rfi_32, boolean bl) {
        Iterator<rRD<T>> iterator = collection.iterator();
        while (iterator.hasNext()) {
            rRD<T> rRD2 = iterator.next();
            rfH_2 rfH_22 = rRD2.id_class;
            if (rfH_22.b_() < rfi_32.id_class || rfH_22.b_() >= rfi_32.id_protected || rfH_22.d_() < rfi_32.id_byte || rfH_22.d_() >= rfi_32.id_case) continue;
            if (bl) {
                iterator.remove();
            }
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            arrayList.add(rRD2);
        }
        return arrayList;
    }

    public int id_break() {
        return this.id_byte.size();
    }

    @Override
    public boolean id_break(rfH_2 rfH_22, T t) {
        return this.id_case.contains(new rRD<T>(rfH_22, t));
    }
}

