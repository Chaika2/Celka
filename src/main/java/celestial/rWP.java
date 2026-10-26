/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.IntAVLTreeSet
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 */
package celestial;

import celestial.rWr_1;
import celestial.rkg_3;
import celestial.rkw_3;
import celestial.rqs_3;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.BitSet;
import java.util.List;

public class rWP {
    private final rkw_3<?> id_break;
    private final List<rkg_3> id_byte = Lists.newArrayList();
    private final int id_protected;
    private final int[] id_throws;
    private final int id_case;
    private final BitSet id_catch;
    private final IntList id_private = new IntArrayList();
    public final /* synthetic */ rWr_1 id_class;

    private int id_byte(boolean bl, int n) {
        return (bl ? 0 : this.id_protected) + n;
    }

    private void id_byte(boolean bl, int n, int n2) {
        this.id_catch.flip(1 + this.id_protected(bl, n, n2));
    }

    private void id_byte(int n) {
        this.id_catch.set(this.id_protected(n));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rWP(rWr_1 rWr_12, rkw_3 rkw_32) {
        this.id_class = rWr_12;
        this.id_break = rkw_32;
        this.id_byte.addAll(rkw_32.id_class());
        this.id_byte.removeIf(rkg_3::id_protected);
        this.id_protected = this.id_byte.size();
        this.id_throws = this.id_class();
        this.id_case = this.id_throws.length;
        this.id_catch = new BitSet(this.id_protected + this.id_case + this.id_protected + this.id_protected * this.id_case);
        for (int i = 0; i < this.id_byte.size(); ++i) {
            IntList intList = this.id_byte.get(i).id_break();
            for (int j = 0; j < this.id_case; ++j) {
                if (!intList.contains(this.id_throws[j])) continue;
                this.id_catch.set(this.id_protected(true, j, i));
            }
        }
    }

    private void id_class(boolean bl, int n) {
        this.id_catch.set(this.id_byte(bl, n));
        this.id_private.add(n);
    }

    private boolean id_class(boolean bl, int n, int n2) {
        return this.id_catch.get(this.id_protected(bl, n, n2));
    }

    private int[] id_class() {
        IntAVLTreeSet intAVLTreeSet = new IntAVLTreeSet();
        for (rkg_3 rkg_32 : this.id_byte) {
            intAVLTreeSet.addAll((IntCollection)rkg_32.id_break());
        }
        IntIterator intIterator = intAVLTreeSet.iterator();
        while (intIterator.hasNext()) {
            if (this.id_class.id_break(intIterator.nextInt())) continue;
            intIterator.remove();
        }
        return intAVLTreeSet.toIntArray();
    }

    private boolean id_class(int n) {
        int n2 = this.id_case;
        for (int i = 0; i < n2; ++i) {
            if (this.id_class.id_class.get(this.id_throws[i]) < n) continue;
            this.id_class(false, i);
            while (!this.id_private.isEmpty()) {
                int n3;
                int n4 = this.id_private.size();
                boolean bl = (n4 & 1) == 1;
                int n5 = this.id_private.getInt(n4 - 1);
                if (!bl && !this.id_break(n5)) break;
                int n6 = bl ? this.id_protected : n2;
                for (n3 = 0; n3 < n6; ++n3) {
                    if (this.id_break(bl, n3) || !this.id_class(bl, n5, n3) || !this.id_break(bl, n5, n3)) continue;
                    this.id_class(bl, n3);
                    break;
                }
                if ((n3 = this.id_private.size()) != n4) continue;
                this.id_private.removeInt(n3 - 1);
            }
            if (this.id_private.isEmpty()) continue;
            return true;
        }
        return false;
    }

    public boolean id_class(int n, IntList intList) {
        int n2;
        int n3;
        if (n <= 0) {
            return true;
        }
        int n4 = 0;
        while (this.id_class(n)) {
            this.id_class.id_class(this.id_throws[this.id_private.getInt(0)], n);
            n3 = this.id_private.size() - 1;
            this.id_byte(this.id_private.getInt(n3));
            for (n2 = 0; n2 < n3; ++n2) {
                this.id_byte((n2 & 1) == 0, this.id_private.get(n2), this.id_private.get(n2 + 1));
            }
            this.id_private.clear();
            this.id_catch.clear(0, this.id_protected + this.id_case);
            ++n4;
        }
        n3 = n4 == this.id_protected ? 1 : 0;
        int n5 = n2 = n3 != 0 && intList != null ? 1 : 0;
        if (n2 != 0) {
            intList.clear();
        }
        this.id_catch.clear(0, this.id_protected + this.id_case + this.id_protected);
        int n6 = 0;
        rqs_3<rkg_3> rqs_32 = this.id_break.id_class();
        for (int i = 0; i < rqs_32.size(); ++i) {
            if (n2 != 0 && ((rkg_3)rqs_32.get(i)).id_protected()) {
                intList.add(0);
                continue;
            }
            for (int j = 0; j < this.id_case; ++j) {
                if (!this.id_break(false, n6, j)) continue;
                this.id_byte(true, j, n6);
                this.id_class.id_break(this.id_throws[j], n);
                if (n2 == 0) continue;
                intList.add(this.id_throws[j]);
            }
            ++n6;
        }
        return n3 != 0;
    }

    public int id_break(int n, IntList intList) {
        int n2 = 0;
        int n3 = Math.min(n, this.id_break()) + 1;
        while (true) {
            int n4;
            if (this.id_class(n4 = (n2 + n3) / 2, null)) {
                if (n3 - n2 <= 1) {
                    if (n4 > 0) {
                        this.id_class(n4, intList);
                    }
                    return n4;
                }
                n2 = n4;
                continue;
            }
            n3 = n4;
        }
    }

    private boolean id_break(boolean bl, int n) {
        return this.id_catch.get(this.id_byte(bl, n));
    }

    private int id_break() {
        int n = Integer.MAX_VALUE;
        for (rkg_3 rkg_32 : this.id_byte) {
            int n2 = 0;
            IntListIterator intListIterator = rkg_32.id_break().iterator();
            while (intListIterator.hasNext()) {
                int n3 = (Integer)intListIterator.next();
                n2 = Math.max(n2, this.id_class.id_class.get(n3));
            }
            if (n <= 0) continue;
            n = Math.min(n, n2);
        }
        return n;
    }

    private boolean id_break(int n) {
        return this.id_catch.get(this.id_protected(n));
    }

    private boolean id_break(boolean bl, int n, int n2) {
        return bl != this.id_catch.get(1 + this.id_protected(bl, n, n2));
    }

    private int id_protected(boolean bl, int n, int n2) {
        int n3 = bl ? n * this.id_protected + n2 : n2 * this.id_protected + n;
        return this.id_protected + this.id_case + this.id_protected + 2 * n3;
    }

    private int id_protected(int n) {
        return this.id_protected + this.id_case + n;
    }
}

