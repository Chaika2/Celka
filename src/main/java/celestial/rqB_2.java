/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rqS_2;
import celestial.rrLa_1;
import celestial.rrLi_1;
import celestial.ryY_2;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class rqB_2
implements ryY_2 {
    private final List<rqS_2> id_class = Lists.newArrayList();
    private int id_break;

    public int id_byte(rdn_3 rdn_32) {
        if (rdn_32.id_break() == rdy_3.id_class || this.id_class.isEmpty()) {
            return 0;
        }
        for (rqS_2 rqS_22 : this.id_class) {
            if (!rqS_22.id_class.test(rdn_32)) continue;
            return rqS_22.id_byte - this.id_break;
        }
        return 0;
    }

    public void id_class(rdn_3 rdn_32, Predicate<rdn_3> predicate, int n) {
        this.id_class.add(new rqS_2(predicate, this.id_break, this.id_break + n));
        rrLa_1.id_break(rdn_32, rrLi_1.id_class(n));
    }

    public boolean id_class(rdn_3 rdn_32) {
        return this.id_class(rdn_32, 0.0f) > 0.0f;
    }

    public boolean id_class(rdn_3 ... rdn_3Array) {
        for (rdn_3 rdn_32 : rdn_3Array) {
            if (!this.id_class(rdn_32)) continue;
            return true;
        }
        return false;
    }

    public float id_class(rdn_3 rdn_32, float f) {
        if (rdn_32.id_break() == rdy_3.id_class || this.id_class.isEmpty()) {
            return 0.0f;
        }
        for (rqS_2 rqS_22 : this.id_class) {
            if (!rqS_22.id_class.test(rdn_32)) continue;
            float f2 = rqS_22.id_byte - rqS_22.id_break;
            float f3 = (float)rqS_22.id_byte - ((float)this.id_break + f);
            return rfU_2.id_class(f3 / f2, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public void id_class() {
        ++this.id_break;
        if (!this.id_class.isEmpty()) {
            this.id_class.removeIf(rqS_22 -> rqS_22.id_byte <= this.id_break);
        }
    }

    public void id_break(rdn_3 rdn_32) {
        this.id_class.removeIf(rqS_22 -> rqS_22.id_class.test(rdn_32));
        rrLa_1.id_break(rdn_32, rrLi_1.id_class());
    }

    public void id_break() {
        this.id_class.clear();
    }
}

