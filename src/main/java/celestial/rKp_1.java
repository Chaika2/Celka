/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap
 */
package celestial;

import celestial.rKA;
import celestial.rKg_1;
import celestial.rKj_1;
import celestial.rKy_1;
import celestial.rpW_2;
import celestial.rrBw_1;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.Random;

public class rKp_1
implements rKA<rKg_1> {
    private final Long2IntLinkedOpenHashMap id_class;
    private final int id_break;
    private final rKy_1 id_byte;
    private final long id_protected;
    private long id_throws;

    public rKp_1(int n, long l, long l2) {
        this.id_protected = rKp_1.id_break(l, l2);
        this.id_byte = new rKy_1(new Random(l));
        this.id_class = new Long2IntLinkedOpenHashMap(16, 0.25f);
        this.id_class.defaultReturnValue(Integer.MIN_VALUE);
        this.id_break = n;
    }

    @Override
    public rKy_1 id_class() {
        return this.id_byte;
    }

    @Override
    public int id_class(int n) {
        int n2 = (int)Math.floorMod(this.id_throws >> 24, (long)n);
        this.id_throws = rpW_2.id_class(this.id_throws, this.id_protected);
        return n2;
    }

    @Override
    public /* synthetic */ rKj_1 id_class(rrBw_1 rrBw_12) {
        return this.id_break(rrBw_12);
    }

    @Override
    public rKg_1 id_class(rrBw_1 rrBw_12, rKg_1 rKg_12) {
        return new rKg_1(this.id_class, Math.min(1024, rKg_12.id_class() * 4), rrBw_12);
    }

    @Override
    public rKg_1 id_class(rrBw_1 rrBw_12, rKg_1 rKg_12, rKg_1 rKg_13) {
        return new rKg_1(this.id_class, Math.min(1024, Math.max(rKg_12.id_class(), rKg_13.id_class()) * 4), rrBw_12);
    }

    @Override
    public void id_class(long l, long l2) {
        long l3 = this.id_protected;
        l3 = rpW_2.id_class(l3, l);
        l3 = rpW_2.id_class(l3, l2);
        l3 = rpW_2.id_class(l3, l);
        this.id_throws = l3 = rpW_2.id_class(l3, l2);
    }

    private static long id_break(long l, long l2) {
        long l3 = rpW_2.id_class(l2, l2);
        l3 = rpW_2.id_class(l3, l2);
        l3 = rpW_2.id_class(l3, l2);
        long l4 = rpW_2.id_class(l, l3);
        l4 = rpW_2.id_class(l4, l3);
        return rpW_2.id_class(l4, l3);
    }

    public rKg_1 id_break(rrBw_1 rrBw_12) {
        return new rKg_1(this.id_class, this.id_break, rrBw_12);
    }
}

