/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rJI;
import celestial.rJT;
import celestial.rJY;
import celestial.rJa_1;
import celestial.rJr_1;
import celestial.rWr_1;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rhz_3;
import celestial.rkI_2;
import celestial.rkw_3;
import celestial.rvq_3;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWE<C extends rXu_1>
implements rkI_2<Integer> {
    protected static final Logger id_class = LogManager.getLogger();
    protected final rWr_1 id_break = new rWr_1();
    protected rhz_3 id_byte;
    protected rJI<C> id_protected;

    private int id_byte() {
        int n = 0;
        for (rdn_3 rdn_32 : this.id_byte.id_class) {
            if (!rdn_32.id_class()) continue;
            ++n;
        }
        return n;
    }

    public rWE(rJI<C> rJI2) {
        this.id_protected = rJI2;
    }

    protected int id_class(boolean bl, int n, boolean bl2) {
        int n2 = 1;
        if (bl) {
            n2 = n;
        } else if (bl2) {
            n2 = 64;
            for (int i = 0; i < this.id_protected.id_byte() * this.id_protected.id_protected() + 1; ++i) {
                rdn_3 rdn_32;
                if (i == this.id_protected.id_break() || (rdn_32 = this.id_protected.id_class(i).id_class()).id_class() || n2 <= rdn_32.id_char()) continue;
                n2 = rdn_32.id_char();
            }
            if (n2 < 64) {
                ++n2;
            }
        }
        return n2;
    }

    protected void id_class(rJY rJY2, rdn_3 rdn_32) {
        rdn_3 rdn_33;
        int n = this.id_byte.id_byte(rdn_32);
        if (n != -1 && !(rdn_33 = this.id_byte.id_extends(n).id_implements()).id_class()) {
            if (rdn_33.id_char() > 1) {
                this.id_byte.id_class(n, 1);
            } else {
                this.id_byte.id_native(n);
            }
            rdn_33.id_throws(1);
            if (rJY2.id_class().id_class()) {
                rJY2.id_break(rdn_33);
            } else {
                rJY2.id_class().id_case(1);
            }
        }
    }

    public void id_class(rhN_2 rhN_22, rkw_3<C> rkw_32, boolean bl) {
        if (rkw_32 != null && rhN_22.id_float().id_break(rkw_32)) {
            this.id_byte = (rhz_3)rhN_22.id_implements[1];
            if (this.id_break() || rhN_22.id_implements()) {
                this.id_break.id_class();
                ((rhz_3)rhN_22.id_implements[1]).id_class(this.id_break);
                this.id_protected.id_class(this.id_break);
                if (this.id_break.id_class(rkw_32, null)) {
                    this.id_class(rkw_32, bl);
                } else {
                    this.id_class();
                    rhN_22.id_class.id_class(new rvq_3(((rJr_1)rhN_22.id_implements[4]).id_case, rkw_32));
                }
                ((rhz_3)rhN_22.id_implements[1]).id_break();
            }
        }
    }

    @Override
    public void id_class(Iterator<Integer> iterator, int n, int n2, int n3, int n4) {
        rJY rJY2 = this.id_protected.id_class(n);
        rdn_3 rdn_32 = rWr_1.id_class(iterator.next());
        if (!rdn_32.id_class()) {
            for (int i = 0; i < n2; ++i) {
                this.id_class(rJY2, rdn_32);
            }
        }
    }

    protected void id_class(int n) {
        rdn_3 rdn_32 = this.id_protected.id_class(n).id_class();
        if (!rdn_32.id_class()) {
            while (rdn_32.id_char() > 0) {
                int n2 = this.id_byte.id_protected(rdn_32);
                if (n2 == -1) {
                    n2 = this.id_byte.id_throws();
                }
                rdn_3 rdn_33 = rdn_32.id_implements();
                rdn_33.id_throws(1);
                if (!this.id_byte.id_class(n2, rdn_33)) {
                    id_class.error("Can't find any space for item in the inventory");
                }
                this.id_protected.id_class(n).id_class(1);
            }
        }
    }

    protected void id_class(rkw_3<C> rkw_32, boolean bl) {
        Object object;
        int n;
        boolean bl2 = this.id_protected.id_class(rkw_32);
        int n2 = this.id_break.id_break(rkw_32, null);
        if (bl2) {
            for (n = 0; n < this.id_protected.id_protected() * this.id_protected.id_byte() + 1; ++n) {
                if (n == this.id_protected.id_break() || ((rdn_3)(object = this.id_protected.id_class(n).id_class())).id_class() || Math.min(n2, ((rdn_3)object).id_byte()) >= ((rdn_3)object).id_char() + 1) continue;
                return;
            }
        }
        if (this.id_break.id_class(rkw_32, (IntList)(object = new IntArrayList()), n = this.id_class(bl, n2, bl2))) {
            int n3 = n;
            IntListIterator intListIterator = object.iterator();
            while (intListIterator.hasNext()) {
                int n4 = (Integer)intListIterator.next();
                int n5 = rWr_1.id_class(n4).id_byte();
                if (n5 >= n3) continue;
                n3 = n5;
            }
            if (this.id_break.id_class(rkw_32, (IntList)object, n3)) {
                this.id_class();
                this.id_class(this.id_protected.id_byte(), this.id_protected.id_protected(), this.id_protected.id_break(), rkw_32, object.iterator(), n3);
            }
        }
    }

    protected void id_class() {
        for (int i = 0; i < this.id_protected.id_byte() * this.id_protected.id_protected() + 1; ++i) {
            if (i == this.id_protected.id_break() && (this.id_protected instanceof rJa_1 || this.id_protected instanceof rJT)) continue;
            this.id_class(i);
        }
        this.id_protected.id_class();
    }

    private boolean id_break() {
        ArrayList arrayList = Lists.newArrayList();
        int n = this.id_byte();
        for (int i = 0; i < this.id_protected.id_byte() * this.id_protected.id_protected() + 1; ++i) {
            rdn_3 rdn_32;
            if (i == this.id_protected.id_break() || (rdn_32 = this.id_protected.id_class(i).id_class().id_implements()).id_class()) continue;
            int n2 = this.id_byte.id_protected(rdn_32);
            if (n2 == -1 && arrayList.size() <= n) {
                for (rdn_3 rdn_33 : arrayList) {
                    if (!rdn_33.id_class(rdn_32) || rdn_33.id_char() == rdn_33.id_byte() || rdn_33.id_char() + rdn_32.id_char() > rdn_33.id_byte()) continue;
                    rdn_33.id_case(rdn_32.id_char());
                    rdn_32.id_throws(0);
                    break;
                }
                if (rdn_32.id_class()) continue;
                if (arrayList.size() >= n) {
                    return false;
                }
                arrayList.add(rdn_32);
                continue;
            }
            if (n2 != -1) continue;
            return false;
        }
        return true;
    }
}

