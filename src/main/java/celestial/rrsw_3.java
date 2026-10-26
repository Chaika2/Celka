/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongList
 */
package celestial;

import celestial.rfU_2;
import celestial.rrsH_2;
import celestial.rrsI_2;
import celestial.rrsK_2;
import celestial.rrsf_3;
import celestial.rrso_3;
import celestial.rrsy_3;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongList;
import java.util.function.LongPredicate;

public abstract class rrsw_3 {
    private final int id_class;
    private final LongLinkedOpenHashSet[] id_break;
    private final Long2ByteMap id_byte;
    private int id_protected;
    private volatile boolean id_throws;

    public int id_byte() {
        return this.id_byte.size();
    }

    protected abstract int id_byte(long var1);

    protected rrsw_3(int n, int n2, int n3) {
        if (n >= 254) {
            throw new IllegalArgumentException("Level count must be < 254.");
        }
        this.id_class = n;
        this.id_break = new LongLinkedOpenHashSet[n];
        int n4 = n2;
        int n5 = n3;
        if (this.getClass() != rrsH_2.class && this.getClass() != rrso_3.class) {
            if (this.getClass() == rrsy_3.class || this.getClass() == rrsK_2.class) {
                n4 = Math.max(n2, 2048);
                n5 = Math.max(n3, 2048);
            }
        } else {
            n4 = Math.max(n2, 8192);
            n5 = Math.max(n3, 8192);
        }
        for (int i = 0; i < n; ++i) {
            this.id_break[i] = new rrsI_2(this, n4, 0.5f, n2);
        }
        this.id_byte = new rrsf_3(this, n5, 0.5f, n3);
        this.id_byte.defaultReturnValue((byte)-1);
        this.id_protected = n;
    }

    private void id_class(long l, long l2, int n, int n2, int n3, boolean bl) {
        if (!this.id_class(l2)) {
            boolean bl2;
            n = rfU_2.id_class(n, 0, this.id_class - 1);
            n2 = rfU_2.id_class(n2, 0, this.id_class - 1);
            if (n3 == 255) {
                bl2 = true;
                n3 = n2;
            } else {
                bl2 = false;
            }
            int n4 = bl ? Math.min(n3, n) : rfU_2.id_class(this.id_class(l2, l, n), 0, this.id_class - 1);
            int n5 = this.id_class(n2, n3);
            if (n2 != n4) {
                int n6 = this.id_class(n2, n4);
                if (n5 != n6 && !bl2) {
                    this.id_class(l2, n5, n6, false);
                }
                this.id_class(l2, n4, n6);
            } else if (!bl2) {
                this.id_class(l2, n5, this.id_class, true);
            }
        }
    }

    protected final int id_class(int n) {
        if (this.id_protected >= this.id_class) {
            return n;
        }
        while (this.id_protected < this.id_class && n > 0) {
            int n2;
            --n;
            LongLinkedOpenHashSet longLinkedOpenHashSet = this.id_break[this.id_protected];
            long l = longLinkedOpenHashSet.removeFirstLong();
            int n3 = rfU_2.id_class(this.id_byte(l), 0, this.id_class - 1);
            if (longLinkedOpenHashSet.isEmpty()) {
                this.id_break(this.id_class);
            }
            if ((n2 = this.id_byte.remove(l) & 0xFF) < n3) {
                this.id_class(l, n2);
                this.id_class(l, n2, true);
                continue;
            }
            if (n2 <= n3) continue;
            this.id_class(l, n2, this.id_class(this.id_class - 1, n2));
            this.id_class(l, this.id_class - 1);
            this.id_class(l, n3, false);
        }
        this.id_throws = this.id_protected < this.id_class;
        return n;
    }

    private static /* synthetic */ void id_class(LongPredicate longPredicate, LongList longList, Long l) {
        if (longPredicate.test(l)) {
            longList.add(l);
        }
    }

    protected abstract void id_class(long var1, int var3);

    protected abstract void id_class(long var1, int var3, boolean var4);

    protected abstract int id_class(long var1, long var3, int var5);

    protected abstract boolean id_class(long var1);

    private void id_class(long l, int n, int n2, boolean bl) {
        if (bl) {
            this.id_byte.remove(l);
        }
        this.id_break[n].remove(l);
        if (this.id_break[n].isEmpty() && this.id_protected == n) {
            this.id_break(n2);
        }
    }

    public void id_class(LongPredicate longPredicate) {
        LongArrayList longArrayList = new LongArrayList();
        this.id_byte.keySet().forEach(arg_0 -> rrsw_3.id_class(longPredicate, (LongList)longArrayList, arg_0));
        longArrayList.forEach(this::id_throws);
    }

    private int id_class(int n, int n2) {
        int n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        if (n3 > this.id_class - 1) {
            n3 = this.id_class - 1;
        }
        return n3;
    }

    protected void id_class(long l, long l2, int n, boolean bl) {
        this.id_class(l, l2, n, this.id_byte(l2), this.id_byte.get(l2) & 0xFF, bl);
        this.id_throws = this.id_protected < this.id_class;
    }

    private void id_class(long l, int n, int n2) {
        this.id_byte.put(l, (byte)n);
        this.id_break[n2].add(l);
        if (this.id_protected > n2) {
            this.id_protected = n2;
        }
    }

    private void id_break(int n) {
        int n2 = this.id_protected;
        this.id_protected = n;
        for (int i = n2 + 1; i < n; ++i) {
            if (this.id_break[i].isEmpty()) continue;
            this.id_protected = i;
            break;
        }
    }

    protected abstract int id_break(long var1, long var3, int var5);

    protected final void id_break(long l, long l2, int n, boolean bl) {
        int n2 = this.id_byte.get(l2) & 0xFF;
        int n3 = rfU_2.id_class(this.id_break(l, l2, n), 0, this.id_class - 1);
        if (bl) {
            this.id_class(l, l2, n3, this.id_byte(l2), n2, true);
        } else {
            int n4;
            boolean bl2;
            if (n2 == 255) {
                bl2 = true;
                n4 = rfU_2.id_class(this.id_byte(l2), 0, this.id_class - 1);
            } else {
                n4 = n2;
                bl2 = false;
            }
            if (n3 == n4) {
                this.id_class(l, l2, this.id_class - 1, bl2 ? n4 : this.id_byte(l2), n2, false);
            }
        }
    }

    protected final boolean id_break() {
        return this.id_throws;
    }

    protected void id_throws(long l) {
        int n = this.id_byte.get(l) & 0xFF;
        if (n != 255) {
            int n2 = this.id_byte(l);
            int n3 = this.id_class(n2, n);
            this.id_class(l, n3, this.id_class, true);
            this.id_throws = this.id_protected < this.id_class;
        }
    }

    protected void id_case(long l) {
        this.id_class(l, l, this.id_class - 1, false);
    }

    protected int id_protected() {
        return this.id_byte.size();
    }
}

