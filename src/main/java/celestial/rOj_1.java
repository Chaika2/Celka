/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBk_1;
import celestial.rOf_1;
import celestial.rYB;
import java.util.List;

public class rOj_1
extends rBk_1 {
    private final rOf_1 id_class;

    @Override
    public void id_byte() {
        this.id_class.id_break = 1;
        this.id_class.id_protected = 0;
    }

    public rOj_1(rOf_1 rOf_12) {
        this.id_class = rOf_12;
    }

    @Override
    public boolean id_class() {
        List<iB_2> list = ((rYB)this.id_class.id_throws[7]).id_class(iB_2.class, this.id_class.rN().id_class(2.0), rOf_1.id_super);
        return !list.isEmpty();
    }

    @Override
    public boolean id_break() {
        List<iB_2> list = ((rYB)this.id_class.id_throws[7]).id_class(iB_2.class, this.id_class.rN().id_class(2.0), rOf_1.id_super);
        return !list.isEmpty();
    }

    @Override
    public void id_protected() {
        this.id_class.id_break = 0;
    }
}

