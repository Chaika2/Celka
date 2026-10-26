/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
package celestial;

import celestial.rRo_1;
import celestial.rfH_2;
import celestial.rjh_3;
import celestial.roH_2;
import celestial.rol_3;
import celestial.rpr_3;
import celestial.rrsR_2;
import celestial.rrsU_2;
import celestial.rrsV_2;
import celestial.rrsg_3;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Arrays;

public class rrsK_2
extends rrsR_2<rrsU_2> {
    private static final rpr_3[] id_extends = new rpr_3[]{rpr_3.NORTH, rpr_3.SOUTH, rpr_3.WEST, rpr_3.EAST};
    private final LongSet id_native = new LongOpenHashSet();
    private final LongSet id_volatile = new LongOpenHashSet();
    private final LongSet id_final = new LongOpenHashSet();
    private final LongSet id_package = new LongOpenHashSet();
    private volatile boolean id_int;

    private void id_int(long l) {
        this.id_final.add(l);
        this.id_volatile.remove(l);
    }

    protected rrsK_2(rol_3 rol_32) {
        super(rRo_1.SKY, rol_32, new rrsU_2((Long2ObjectOpenHashMap<roH_2>)new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
    }

    @Override
    protected void id_class(rrsV_2<rrsU_2, ?> rrsV_22, boolean bl, boolean bl2) {
        super.id_class(rrsV_22, bl, bl2);
        if (bl) {
            int n;
            int n2;
            long l;
            LongIterator longIterator;
            if (!this.id_volatile.isEmpty()) {
                longIterator = this.id_volatile.iterator();
                while (longIterator.hasNext()) {
                    int n3;
                    l = (Long)longIterator.next();
                    n2 = this.id_byte(l);
                    if (n2 == 2 || this.id_final.contains(l) || !this.id_native.add(l)) continue;
                    if (n2 == 1) {
                        long l2;
                        this.id_class(rrsV_22, l);
                        if (this.id_catch.add(l)) {
                            ((rrsU_2)this.id_case).id_class(l);
                        }
                        Arrays.fill(this.id_class(l, true).id_class(), (byte)-1);
                        n = rjh_3.id_catch(rjh_3.id_break(l));
                        n3 = rjh_3.id_catch(rjh_3.id_byte(l));
                        int n4 = rjh_3.id_catch(rjh_3.id_protected(l));
                        rpr_3[] rpr_3Array = id_extends;
                        int n5 = rpr_3Array.length;
                        for (int i = 0; i < n5; ++i) {
                            rpr_3 rpr_32 = rpr_3Array[i];
                            l2 = rjh_3.id_class(l, rpr_32);
                            if (!this.id_final.contains(l2) && (this.id_native.contains(l2) || this.id_volatile.contains(l2)) || !this.id_catch(l2)) continue;
                            for (int j = 0; j < 16; ++j) {
                                for (int k = 0; k < 16; ++k) {
                                    long l3;
                                    long l4 = switch (rpr_32) {
                                        case rpr_3.NORTH -> {
                                            l3 = rfH_2.id_throws(n + j, n3 + k, n4);
                                            yield rfH_2.id_throws(n + j, n3 + k, n4 - 1);
                                        }
                                        case rpr_3.SOUTH -> {
                                            l3 = rfH_2.id_throws(n + j, n3 + k, n4 + 16 - 1);
                                            yield rfH_2.id_throws(n + j, n3 + k, n4 + 16);
                                        }
                                        case rpr_3.WEST -> {
                                            l3 = rfH_2.id_throws(n, n3 + j, n4 + k);
                                            yield rfH_2.id_throws(n - 1, n3 + j, n4 + k);
                                        }
                                        default -> {
                                            l3 = rfH_2.id_throws(n + 16 - 1, n3 + j, n4 + k);
                                            yield rfH_2.id_throws(n + 16, n3 + j, n4 + k);
                                        }
                                    };
                                    rrsV_22.id_class(l3, l4, rrsV_22.id_break(l3, l4, 0), true);
                                }
                            }
                        }
                        for (int i = 0; i < 16; ++i) {
                            for (n5 = 0; n5 < 16; ++n5) {
                                long l5 = rfH_2.id_throws(rjh_3.id_catch(rjh_3.id_break(l)) + i, rjh_3.id_catch(rjh_3.id_byte(l)), rjh_3.id_catch(rjh_3.id_protected(l)) + n5);
                                l2 = rfH_2.id_throws(rjh_3.id_catch(rjh_3.id_break(l)) + i, rjh_3.id_catch(rjh_3.id_byte(l)) - 1, rjh_3.id_catch(rjh_3.id_protected(l)) + n5);
                                rrsV_22.id_class(l5, l2, rrsV_22.id_break(l5, l2, 0), true);
                            }
                        }
                        continue;
                    }
                    for (n = 0; n < 16; ++n) {
                        for (n3 = 0; n3 < 16; ++n3) {
                            long l6 = rfH_2.id_throws(rjh_3.id_catch(rjh_3.id_break(l)) + n, rjh_3.id_catch(rjh_3.id_byte(l)) + 16 - 1, rjh_3.id_catch(rjh_3.id_protected(l)) + n3);
                            rrsV_22.id_class(Long.MAX_VALUE, l6, 0, true);
                        }
                    }
                }
            }
            this.id_volatile.clear();
            if (!this.id_final.isEmpty()) {
                longIterator = this.id_final.iterator();
                while (longIterator.hasNext()) {
                    l = (Long)longIterator.next();
                    if (!this.id_native.remove(l) || !this.id_catch(l)) continue;
                    for (n2 = 0; n2 < 16; ++n2) {
                        for (n = 0; n < 16; ++n) {
                            long l7 = rfH_2.id_throws(rjh_3.id_catch(rjh_3.id_break(l)) + n2, rjh_3.id_catch(rjh_3.id_byte(l)) + 16 - 1, rjh_3.id_catch(rjh_3.id_protected(l)) + n);
                            rrsV_22.id_class(Long.MAX_VALUE, l7, 15, false);
                        }
                    }
                }
            }
            this.id_final.clear();
            this.id_int = false;
        }
    }

    @Override
    protected boolean id_class() {
        return super.id_class() || this.id_int;
    }

    @Override
    protected void id_break(long l, boolean bl) {
        this.id_throws();
        if (bl && this.id_package.add(l)) {
            int n = ((rrsU_2)this.id_case).id_byte.get(l);
            if (n != ((rrsU_2)this.id_case).id_break) {
                long l2 = rjh_3.id_break(rjh_3.id_break(l), n - 1, rjh_3.id_protected(l));
                this.id_new(l2);
                this.id_catch();
            }
        } else if (!bl) {
            this.id_package.remove(l);
        }
    }

    protected boolean id_break(int n) {
        return n >= ((rrsU_2)this.id_case).id_break;
    }

    @Override
    protected roH_2 id_finally(long l) {
        roH_2 roH_22 = (roH_2)this.id_implements.get(l);
        if (roH_22 != null) {
            return roH_22;
        }
        long l2 = rjh_3.id_class(l, rpr_3.UP);
        int n = ((rrsU_2)this.id_case).id_byte.get(rjh_3.id_case(l));
        if (n != ((rrsU_2)this.id_case).id_break && rjh_3.id_byte(l2) < n) {
            roH_2 roH_23;
            while ((roH_23 = this.id_class(l2, true)) == null) {
                l2 = rjh_3.id_class(l2, rpr_3.UP);
            }
            return new roH_2(new rrsg_3(roH_23, 0).id_class());
        }
        return new roH_2();
    }

    private void id_catch() {
        this.id_int = !this.id_volatile.isEmpty() || !this.id_final.isEmpty();
    }

    @Override
    protected void id_extends(long l) {
        long l2;
        int n;
        int n2 = rjh_3.id_byte(l);
        if (((rrsU_2)this.id_case).id_break > n2) {
            ((rrsU_2)this.id_case).id_break = n2;
            ((rrsU_2)this.id_case).id_byte.defaultReturnValue(((rrsU_2)this.id_case).id_break);
        }
        if ((n = ((rrsU_2)this.id_case).id_byte.get(l2 = rjh_3.id_case(l))) < n2 + 1) {
            ((rrsU_2)this.id_case).id_byte.put(l2, n2 + 1);
            if (this.id_package.contains(l2)) {
                this.id_new(l);
                if (n > ((rrsU_2)this.id_case).id_break) {
                    long l3 = rjh_3.id_break(rjh_3.id_break(l), n - 1, rjh_3.id_protected(l));
                    this.id_int(l3);
                }
                this.id_catch();
            }
        }
    }

    private void id_new(long l) {
        this.id_volatile.add(l);
        this.id_final.remove(l);
    }

    protected boolean id_package(long l) {
        long l2 = rjh_3.id_case(l);
        return this.id_package.contains(l2);
    }

    @Override
    protected int id_protected(long l) {
        long l2 = rjh_3.id_throws(l);
        int n = rjh_3.id_byte(l2);
        rrsU_2 rrsU_22 = (rrsU_2)this.id_throws;
        int n2 = rrsU_22.id_byte.get(rjh_3.id_case(l2));
        if (n2 != rrsU_22.id_break && n < n2) {
            roH_2 roH_22 = this.id_class(rrsU_22, l2);
            if (roH_22 == null) {
                l = rfH_2.id_throws(l);
                while (roH_22 == null) {
                    l2 = rjh_3.id_class(l2, rpr_3.UP);
                    if (++n >= n2) {
                        return 15;
                    }
                    l = rfH_2.id_class(l, 0, 16, 0);
                    roH_22 = this.id_class(rrsU_22, l2);
                }
            }
            return roH_22.id_class(rjh_3.id_break(rfH_2.id_class(l)), rjh_3.id_break(rfH_2.id_break(l)), rjh_3.id_break(rfH_2.id_byte(l)));
        }
        return 15;
    }

    protected boolean id_final(long l) {
        long l2 = rjh_3.id_case(l);
        int n = ((rrsU_2)this.id_case).id_byte.get(l2);
        return n == ((rrsU_2)this.id_case).id_break || rjh_3.id_byte(l) >= n;
    }

    protected boolean id_volatile(long l) {
        int n = rfH_2.id_break(l);
        if ((n & 0xF) != 15) {
            return false;
        }
        long l2 = rjh_3.id_throws(l);
        long l3 = rjh_3.id_case(l2);
        if (!this.id_package.contains(l3)) {
            return false;
        }
        int n2 = ((rrsU_2)this.id_case).id_byte.get(l3);
        return rjh_3.id_catch(n2) == n + 16;
    }

    @Override
    protected void id_native(long l) {
        long l2 = rjh_3.id_case(l);
        boolean bl = this.id_package.contains(l2);
        if (bl) {
            this.id_int(l);
        }
        int n = rjh_3.id_byte(l);
        if (((rrsU_2)this.id_case).id_byte.get(l2) == n + 1) {
            long l3 = l;
            while (!this.id_catch(l3) && this.id_break(n)) {
                --n;
                l3 = rjh_3.id_class(l3, rpr_3.DOWN);
            }
            if (this.id_catch(l3)) {
                ((rrsU_2)this.id_case).id_byte.put(l2, n + 1);
                if (bl) {
                    this.id_new(l3);
                }
            } else {
                ((rrsU_2)this.id_case).id_byte.remove(l2);
            }
        }
        if (bl) {
            this.id_catch();
        }
    }
}

