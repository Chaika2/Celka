/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 */
package celestial;

import celestial.rJI;
import celestial.rJY;
import celestial.rWE;
import celestial.rWr_1;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rkw_3;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;

public class rWG<C extends rXu_1>
extends rWE<C> {
    private boolean id_throws;

    public rWG(rJI<C> rJI2) {
        super(rJI2);
    }

    protected void id_class(int n, IntList intList) {
        IntListIterator intListIterator = intList.iterator();
        rJY rJY2 = this.id_protected.id_class(0);
        rdn_3 rdn_32 = rWr_1.id_class((Integer)intListIterator.next());
        if (!rdn_32.id_class()) {
            int n2 = Math.min(rdn_32.id_byte(), n);
            if (this.id_throws) {
                n2 -= rJY2.id_class().id_char();
            }
            for (int i = 0; i < n2; ++i) {
                this.id_class(rJY2, rdn_32);
            }
        }
    }

    @Override
    protected void id_class() {
        this.id_class(this.id_protected.id_break());
        super.id_class();
    }

    @Override
    protected void id_class(rkw_3<C> rkw_32, boolean bl) {
        rdn_3 rdn_32;
        this.id_throws = this.id_protected.id_class(rkw_32);
        int n = this.id_break.id_break(rkw_32, null);
        if (this.id_throws && ((rdn_32 = this.id_protected.id_class(0).id_class()).id_class() || n <= rdn_32.id_char())) {
            return;
        }
        IntArrayList intArrayList = new IntArrayList();
        int n2 = this.id_class(bl, n, this.id_throws);
        if (this.id_break.id_class(rkw_32, (IntList)intArrayList, n2)) {
            if (!this.id_throws) {
                this.id_class(this.id_protected.id_break());
                this.id_class(0);
            }
            this.id_class(n2, (IntList)intArrayList);
        }
    }
}

