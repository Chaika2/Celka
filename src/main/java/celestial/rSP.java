/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.ag_3;
import celestial.an_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.rBk_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfl_3;
import java.util.List;

public class rSP<T extends is_3>
extends rBk_1 {
    private final T id_class;
    private final boolean id_break;
    private int id_byte;

    @Override
    public void id_byte() {
        this.id_byte = ((iB_2)this.id_class).Sb();
        ((ag_3)this.id_class).id_case();
        if (this.id_break) {
            this.id_private().stream().filter(is_32 -> is_32 != this.id_class).map(is_32 -> (ag_3)((Object)is_32)).forEach(ag_3::id_case);
        }
        super.id_byte();
    }

    public rSP(T t, boolean bl) {
        this.id_class = t;
        this.id_break = bl;
    }

    @Override
    public boolean id_class() {
        return ((rYB)((is_3)this.id_class).id_throws[7]).B().id_break(rRu_1.id_long) && this.id_catch();
    }

    private boolean id_catch() {
        return ((iB_2)this.id_class).Sr() != null && ((iB_2)this.id_class).Sr().BC() == aI_2.rM && ((iB_2)this.id_class).Sb() > this.id_byte;
    }

    private List<is_3> id_private() {
        double d = ((iB_2)this.id_class).id_class(iQ_2.id_break);
        rfl_3 rfl_32 = rfl_3.id_class(((an_3)this.id_class).Ps()).id_byte(d, 10.0, d);
        return ((rYB)((is_3)this.id_class).id_throws[7]).id_break(this.id_class.getClass(), rfl_32);
    }
}

