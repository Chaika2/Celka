/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package celestial;

import celestial.rrGi_1;
import celestial.rrbr_3;
import com.google.common.collect.AbstractIterator;

public class rrbP_2
extends AbstractIterator {
    private rrGi_1 id_break = null;
    public final /* synthetic */ rrbr_3 id_class;

    public rrbP_2(rrbr_3 rrbr_32) {
        this.id_class = rrbr_32;
    }

    protected Object computeNext() {
        if (this.id_break == null) {
            this.id_break = new rrGi_1(this.id_class.id_class.b_(), this.id_class.id_class.c_(), this.id_class.id_class.d_(), 3);
            return this.id_break;
        }
        if (this.id_break.equals(this.id_class.id_break)) {
            return (rrGi_1)this.endOfData();
        }
        int n = this.id_break.b_();
        int n2 = this.id_break.c_();
        int n3 = this.id_break.d_();
        if (n < this.id_class.id_break.b_()) {
            ++n;
        } else if (n3 < this.id_class.id_break.d_()) {
            n = this.id_class.id_class.b_();
            ++n3;
        } else if (n2 < this.id_class.id_break.c_()) {
            n = this.id_class.id_class.b_();
            n3 = this.id_class.id_class.d_();
            ++n2;
        }
        this.id_break.id_class(n, n2, n3);
        return this.id_break;
    }
}

