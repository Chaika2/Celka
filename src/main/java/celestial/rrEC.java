/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2IntMap
 *  it.unimi.dsi.fastutil.longs.Long2IntMaps
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
package celestial;

import celestial.rfj_3;
import celestial.roF_2;
import celestial.rrEF;
import celestial.rrEL;
import celestial.rrEl_1;
import celestial.rrEn_1;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class rrEC
extends rrEn_1 {
    private int id_throws;
    private final Long2IntMap id_case;
    private final LongSet id_catch;
    public final /* synthetic */ rrEL id_protected;

    private boolean id_byte(int n) {
        return n <= this.id_throws - 2;
    }

    protected rrEC(rrEL rrEL2, int n) {
        this.id_protected = rrEL2;
        super(rrEL2, n);
        this.id_case = Long2IntMaps.synchronize((Long2IntMap)new Long2IntOpenHashMap());
        this.id_catch = new LongOpenHashSet();
        this.id_throws = 0;
        this.id_case.defaultReturnValue(n + 2);
    }

    @Override
    protected void id_class(long l, int n, int n2) {
        this.id_catch.add(l);
    }

    @Override
    public void id_class() {
        super.id_class();
        if (!this.id_catch.isEmpty()) {
            LongIterator longIterator = this.id_catch.iterator();
            while (longIterator.hasNext()) {
                int n2;
                long l = longIterator.nextLong();
                int n3 = this.id_case.get(l);
                if (n3 == (n2 = this.id_byte(l))) continue;
                this.id_protected.id_implements.id_class(new rfj_3(l), () -> this.id_case.get(l), n2, n -> {
                    if (n >= this.id_case.defaultReturnValue()) {
                        this.id_case.remove(l);
                    } else {
                        this.id_case.put(l, n);
                    }
                });
                this.id_class(l, n2, this.id_byte(n3), this.id_byte(n2));
            }
            this.id_catch.clear();
        }
    }

    private void id_class(long l, int n, boolean bl, boolean bl2) {
        if (bl != bl2) {
            rrEF<rfj_3> rrEF2 = new rrEF<rfj_3>(rrEl_1.id_byte, rrEL.id_break, new rfj_3(l));
            if (bl2) {
                this.id_protected.id_finally.id_class(roF_2.id_class(() -> this.id_protected.id_volatile.execute(() -> {
                    if (this.id_byte(this.id_byte(l))) {
                        this.id_protected.id_class(l, rrEF2);
                        this.id_protected.id_native.add(l);
                    } else {
                        this.id_protected.id_extends.id_class(roF_2.id_class(() -> {}, l, false));
                    }
                }), l, () -> n));
            } else {
                this.id_protected.id_extends.id_class(roF_2.id_class(() -> this.id_protected.id_volatile.execute(() -> this.id_protected.id_break(l, rrEF2)), l, true));
            }
        }
    }

    public void id_break(int n) {
        for (Long2ByteMap.Entry entry : this.id_class.long2ByteEntrySet()) {
            byte by = entry.getByteValue();
            long l = entry.getLongKey();
            this.id_class(l, by, this.id_byte(by), by <= n - 2);
        }
        this.id_throws = n;
    }
}

