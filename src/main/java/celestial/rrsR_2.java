/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
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
import celestial.rqz_3;
import celestial.rrsV_2;
import celestial.rrsj_3;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public abstract class rrsR_2<M extends rrsj_3<M>>
extends rqz_3 {
    protected static final roH_2 id_class = new roH_2();
    private static final rpr_3[] id_extends = rpr_3.values();
    private final rRo_1 id_native;
    private final rol_3 id_volatile;
    protected final LongSet id_break = new LongOpenHashSet();
    protected final LongSet id_byte = new LongOpenHashSet();
    protected final LongSet id_protected = new LongOpenHashSet();
    protected volatile M id_throws;
    protected final M id_case;
    protected final LongSet id_catch = new LongOpenHashSet();
    protected final LongSet id_private = new LongOpenHashSet();
    protected final Long2ObjectMap<roH_2> id_implements = Long2ObjectMaps.synchronize((Long2ObjectMap)new Long2ObjectOpenHashMap());
    private final LongSet id_final = new LongOpenHashSet();
    private final LongSet id_package = new LongOpenHashSet();
    private final LongSet id_int = new LongOpenHashSet();
    protected volatile boolean id_finally;

    @Override
    protected int id_byte(long l) {
        if (l == Long.MAX_VALUE) {
            return 2;
        }
        if (this.id_break.contains(l)) {
            return 0;
        }
        return !this.id_int.contains(l) && ((rrsj_3)this.id_case).id_break(l) ? 1 : 2;
    }

    public void id_byte(long l, boolean bl) {
        if (bl) {
            this.id_package.add(l);
        } else {
            this.id_package.remove(l);
        }
    }

    protected rrsR_2(rRo_1 rRo_12, rol_3 rol_32, M m) {
        super(3, 16, 256);
        this.id_native = rRo_12;
        this.id_volatile = rol_32;
        this.id_case = m;
        this.id_throws = ((rrsj_3)m).id_break();
        ((rrsj_3)this.id_throws).id_protected();
    }

    protected roH_2 id_class(M m, long l) {
        return ((rrsj_3)m).id_byte(l);
    }

    protected roH_2 id_class(long l, boolean bl) {
        return this.id_class(bl ? this.id_case : this.id_throws, l);
    }

    @Override
    protected void id_class(long l, int n) {
        int n2 = this.id_byte(l);
        if (n2 != 0 && n == 0) {
            this.id_break.add(l);
            this.id_protected.remove(l);
        }
        if (n2 == 0 && n != 0) {
            this.id_break.remove(l);
            this.id_byte.remove(l);
        }
        if (n2 >= 2 && n != 2) {
            if (this.id_int.contains(l)) {
                this.id_int.remove(l);
            } else {
                ((rrsj_3)this.id_case).id_class(l, this.id_finally(l));
                this.id_catch.add(l);
                this.id_extends(l);
                for (int i = -1; i <= 1; ++i) {
                    for (int j = -1; j <= 1; ++j) {
                        for (int k = -1; k <= 1; ++k) {
                            this.id_private.add(rjh_3.id_throws(rfH_2.id_class(l, j, k, i)));
                        }
                    }
                }
            }
        }
        if (n2 != 2 && n >= 2) {
            this.id_int.add(l);
        }
        this.id_finally = !this.id_int.isEmpty();
    }

    protected void id_class(rrsV_2<M, ?> rrsV_22, boolean bl, boolean bl2) {
        if (this.id_class() || !this.id_implements.isEmpty()) {
            long l;
            roH_2 roH_22;
            long l2;
            LongIterator longIterator = this.id_int.iterator();
            while (longIterator.hasNext()) {
                l2 = (Long)longIterator.next();
                this.id_class(rrsV_22, l2);
                roH_2 roH_23 = (roH_2)this.id_implements.remove(l2);
                roH_22 = ((rrsj_3)this.id_case).id_protected(l2);
                if (!this.id_package.contains(rjh_3.id_case(l2))) continue;
                if (roH_23 != null) {
                    this.id_implements.put(l2, (Object)roH_23);
                    continue;
                }
                if (roH_22 == null) continue;
                this.id_implements.put(l2, (Object)roH_22);
            }
            ((rrsj_3)this.id_case).id_byte();
            longIterator = this.id_int.iterator();
            while (longIterator.hasNext()) {
                l2 = (Long)longIterator.next();
                this.id_native(l2);
            }
            this.id_int.clear();
            this.id_finally = false;
            for (Long2ObjectMap.Entry entry : this.id_implements.long2ObjectEntrySet()) {
                l = entry.getLongKey();
                if (!this.id_catch(l)) continue;
                roH_22 = (roH_2)entry.getValue();
                if (((rrsj_3)this.id_case).id_byte(l) == roH_22) continue;
                this.id_class(rrsV_22, l);
                ((rrsj_3)this.id_case).id_class(l, roH_22);
                this.id_catch.add(l);
            }
            ((rrsj_3)this.id_case).id_byte();
            if (!bl2) {
                longIterator = this.id_implements.keySet().iterator();
                while (longIterator.hasNext()) {
                    long l3 = (Long)longIterator.next();
                    this.id_break(rrsV_22, l3);
                }
            } else {
                longIterator = this.id_final.iterator();
                while (longIterator.hasNext()) {
                    long l4 = (Long)longIterator.next();
                    this.id_break(rrsV_22, l4);
                }
            }
            this.id_final.clear();
            longIterator = this.id_implements.long2ObjectEntrySet().iterator();
            while (longIterator.hasNext()) {
                Long2ObjectMap.Entry entry = (Long2ObjectMap.Entry)longIterator.next();
                l = entry.getLongKey();
                if (!this.id_catch(l)) continue;
                longIterator.remove();
            }
        }
    }

    protected void id_class(rrsV_2<?, ?> rrsV_22, long l) {
        if (rrsV_22.id_byte() < 8192) {
            rrsV_22.id_class(l2 -> rjh_3.id_throws(l2) == l);
        } else {
            int n = rjh_3.id_catch(rjh_3.id_break(l));
            int n2 = rjh_3.id_catch(rjh_3.id_byte(l));
            int n3 = rjh_3.id_catch(rjh_3.id_protected(l));
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        long l3 = rfH_2.id_throws(n + i, n2 + j, n3 + k);
                        rrsV_22.id_throws(l3);
                    }
                }
            }
        }
    }

    protected boolean id_class() {
        return this.id_finally;
    }

    protected void id_class(long l, roH_2 roH_22, boolean bl) {
        if (roH_22 != null) {
            this.id_implements.put(l, (Object)roH_22);
            if (!bl) {
                this.id_final.add(l);
            }
        } else {
            this.id_implements.remove(l);
        }
    }

    private void id_break(rrsV_2<M, ?> rrsV_22, long l) {
        if (this.id_catch(l)) {
            int n = rjh_3.id_catch(rjh_3.id_break(l));
            int n2 = rjh_3.id_catch(rjh_3.id_byte(l));
            int n3 = rjh_3.id_catch(rjh_3.id_protected(l));
            for (rpr_3 rpr_32 : id_extends) {
                long l2 = rjh_3.id_class(l, rpr_32);
                if (this.id_implements.containsKey(l2) || !this.id_catch(l2)) continue;
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        long l3;
                        long l4 = switch (rpr_32) {
                            case rpr_3.DOWN -> {
                                l3 = rfH_2.id_throws(n + j, n2, n3 + i);
                                yield rfH_2.id_throws(n + j, n2 - 1, n3 + i);
                            }
                            case rpr_3.UP -> {
                                l3 = rfH_2.id_throws(n + j, n2 + 16 - 1, n3 + i);
                                yield rfH_2.id_throws(n + j, n2 + 16, n3 + i);
                            }
                            case rpr_3.NORTH -> {
                                l3 = rfH_2.id_throws(n + i, n2 + j, n3);
                                yield rfH_2.id_throws(n + i, n2 + j, n3 - 1);
                            }
                            case rpr_3.SOUTH -> {
                                l3 = rfH_2.id_throws(n + i, n2 + j, n3 + 16 - 1);
                                yield rfH_2.id_throws(n + i, n2 + j, n3 + 16);
                            }
                            case rpr_3.WEST -> {
                                l3 = rfH_2.id_throws(n, n2 + i, n3 + j);
                                yield rfH_2.id_throws(n - 1, n2 + i, n3 + j);
                            }
                            default -> {
                                l3 = rfH_2.id_throws(n + 16 - 1, n2 + i, n3 + j);
                                yield rfH_2.id_throws(n + 16, n2 + i, n3 + j);
                            }
                        };
                        rrsV_22.id_class(l3, l4, rrsV_22.id_break(l3, l4, rrsV_22.id_byte(l3)), false);
                        rrsV_22.id_class(l4, l3, rrsV_22.id_break(l4, l3, rrsV_22.id_byte(l4)), false);
                    }
                }
            }
        }
    }

    protected void id_break(long l, boolean bl) {
    }

    protected void id_break(long l, int n) {
        long l2 = rjh_3.id_throws(l);
        if (this.id_catch.add(l2)) {
            ((rrsj_3)this.id_case).id_class(l2);
        }
        roH_2 roH_22 = this.id_class(l2, true);
        roH_22.id_class(rjh_3.id_break(rfH_2.id_class(l)), rjh_3.id_break(rfH_2.id_break(l)), rjh_3.id_break(rfH_2.id_byte(l)), n);
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    this.id_private.add(rjh_3.id_throws(rfH_2.id_class(l, j, k, i)));
                }
            }
        }
    }

    @Override
    protected int id_break(long l) {
        if (this.id_byte.contains(l)) {
            return 2;
        }
        return !this.id_break.contains(l) && !this.id_protected.contains(l) ? 2 : 0;
    }

    protected void id_throws() {
        if (this.id_break()) {
            this.id_class(Integer.MAX_VALUE);
        }
    }

    protected roH_2 id_finally(long l) {
        roH_2 roH_22 = (roH_2)this.id_implements.get(l);
        return roH_22 != null ? roH_22 : new roH_2();
    }

    protected boolean id_catch(long l) {
        return this.id_class(l, true) != null;
    }

    protected void id_extends(long l) {
    }

    protected void id_case() {
        Object object;
        if (!this.id_catch.isEmpty()) {
            object = ((rrsj_3)this.id_case).id_break();
            ((rrsj_3)object).id_protected();
            this.id_throws = object;
            this.id_catch.clear();
        }
        if (!this.id_private.isEmpty()) {
            object = this.id_private.iterator();
            while (object.hasNext()) {
                long l = object.nextLong();
                this.id_volatile.id_class(this.id_native, rjh_3.id_class(l));
            }
            this.id_private.clear();
        }
    }

    protected int id_implements(long l) {
        long l2 = rjh_3.id_throws(l);
        roH_2 roH_22 = this.id_class(l2, true);
        return roH_22.id_class(rjh_3.id_break(rfH_2.id_class(l)), rjh_3.id_break(rfH_2.id_break(l)), rjh_3.id_break(rfH_2.id_byte(l)));
    }

    protected void id_protected(long l, boolean bl) {
        boolean bl2 = this.id_break.contains(l);
        if (!bl2 && !bl) {
            this.id_protected.add(l);
            this.id_class(Long.MAX_VALUE, l, 0, true);
        }
        if (bl2 && bl) {
            this.id_byte.add(l);
            this.id_class(Long.MAX_VALUE, l, 2, false);
        }
    }

    protected abstract int id_protected(long var1);

    public roH_2 id_private(long l) {
        roH_2 roH_22 = (roH_2)this.id_implements.get(l);
        return roH_22 != null ? roH_22 : this.id_class(l, false);
    }

    protected void id_native(long l) {
    }
}

