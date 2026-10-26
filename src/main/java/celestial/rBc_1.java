/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.ay_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rOQ;
import celestial.rRu_1;
import celestial.rSM;
import celestial.rYB;
import celestial.rfl_3;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class rBc_1
extends rSM {
    private static final ay_3 id_class = new ay_3().id_byte().id_throws();
    private boolean id_break;
    private int id_byte;
    private final Class<?>[] id_protected;
    private Class<?>[] id_implements;

    @Override
    public void id_byte() {
        this.id_throws.id_byte(this.id_throws.Sr());
        this.id_catch = this.id_throws.I_();
        this.id_byte = this.id_throws.Sb();
        this.id_private = 300;
        if (this.id_break) {
            this.id_catch();
        }
        super.id_byte();
    }

    public rBc_1(aA_2 aA_22, Class<?> ... classArray) {
        super(aA_22, true);
        this.id_protected = classArray;
        this.id_class(EnumSet.of(rBW.TARGET));
    }

    protected void id_class(is_3 is_32, iB_2 iB_22) {
        is_32.id_byte(iB_22);
    }

    public rBc_1 id_class(Class<?> ... classArray) {
        this.id_break = true;
        this.id_implements = classArray;
        return this;
    }

    @Override
    public boolean id_class() {
        int n = this.id_throws.Sb();
        iB_2 iB_22 = this.id_throws.Sr();
        if (n != this.id_byte && iB_22 != null) {
            if (iB_22.BC() == aI_2.rM && ((rYB)this.id_throws.id_throws[7]).B().id_break(rRu_1.id_long)) {
                return false;
            }
            for (Class<?> clazz : this.id_protected) {
                if (!clazz.isAssignableFrom(iB_22.getClass())) continue;
                return false;
            }
            return this.id_class(iB_22, id_class);
        }
        return false;
    }

    protected void id_catch() {
        double d = this.id_extends();
        rfl_3 rfl_32 = rfl_3.id_class(this.id_throws.Ps()).id_byte(d, 10.0, d);
        List<?> list = ((rYB)this.id_throws.id_throws[7]).id_break(this.id_throws.getClass(), rfl_32);
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            is_3 is_32 = (is_3)iterator.next();
            if (this.id_throws == is_32 || is_32.I_() != null || this.id_throws instanceof rOQ && ((rOQ)this.id_throws).sF() != ((rOQ)is_32).sF() || is_32.id_final(this.id_throws.Sr())) continue;
            if (this.id_implements != null) {
                boolean bl = false;
                for (Class<?> clazz : this.id_implements) {
                    if (is_32.getClass() != clazz) continue;
                    bl = true;
                    break;
                }
                if (bl) continue;
            }
            this.id_class(is_32, this.id_throws.Sr());
        }
        return;
    }
}

