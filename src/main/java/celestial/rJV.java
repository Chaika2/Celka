/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.rJP;
import celestial.rJY;
import celestial.rJg_1;
import celestial.rJr_1;
import celestial.rXA;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class rJV
extends rJr_1 {
    private final rXu_1 id_class;

    public rJV(int n, rhz_3 rhz_32) {
        this(n, rhz_32, new rXA(27));
    }

    public rJV(int n, rhz_3 rhz_32, rXu_1 rXu_12) {
        super(rJP.id_this, n);
        int n2;
        int n3;
        rJV.id_class(rXu_12, 27);
        this.id_class = rXu_12;
        rXu_12.b_(rhz_32.id_throws);
        int n4 = 3;
        int n5 = 9;
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.id_break(new rJg_1(rXu_12, n2 + n3 * 9, 8 + n2 * 18, 18 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.id_break(new rJY(rhz_32, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.id_break(new rJY(rhz_32, n3, 8 + n3 * 18, 142));
        }
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if (n < this.id_class.id_else() ? !this.id_class(rdn_33, this.id_class.id_else(), this.id_throws.size(), true) : !this.id_class(rdn_33, 0, this.id_class.id_else(), false)) {
                return rdn_3.id_break;
            }
            if (rdn_33.id_class()) {
                rJY2.id_break(rdn_3.id_break);
            } else {
                rJY2.id_byte();
            }
        }
        return rdn_32;
    }

    @Override
    public List<rJY> id_class(@Nullable Predicate<rJY> predicate) {
        ArrayList<rJY> arrayList = new ArrayList<rJY>();
        for (rJY rJY2 : this.id_throws) {
            if (rJY2.id_byte != this.id_class || predicate != null && !predicate.test(rJY2)) continue;
            arrayList.add(rJY2);
        }
        return arrayList;
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return this.id_class.id_byte(rhd_32);
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_class.id_break(rhd_32);
    }
}

