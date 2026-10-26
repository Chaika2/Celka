/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.rJP;
import celestial.rJY;
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

public class rXe_1
extends rJr_1 {
    private final rXu_1 id_class;
    private final List<rJY> id_break = new ArrayList<rJY>();
    private final int id_byte;

    public static rXe_1 id_byte(int n, rhz_3 rhz_32) {
        return new rXe_1(rJP.id_byte, n, rhz_32, 3);
    }

    public rXe_1(rJP<?> rJP2, int n, rhz_3 rhz_32, rXu_1 rXu_12, int n2) {
        super(rJP2, n);
        int n3;
        int n4;
        rXe_1.id_class(rXu_12, n2 * 9);
        this.id_class = rXu_12;
        this.id_byte = n2;
        rXu_12.b_(rhz_32.id_throws);
        int n5 = (this.id_byte - 4) * 18;
        for (n4 = 0; n4 < this.id_byte; ++n4) {
            for (n3 = 0; n3 < 9; ++n3) {
                this.id_break(new rJY(rXu_12, n3 + n4 * 9, 8 + n3 * 18, 18 + n4 * 18));
            }
        }
        for (n4 = 0; n4 < 3; ++n4) {
            for (n3 = 0; n3 < 9; ++n3) {
                this.id_break(new rJY(rhz_32, n3 + n4 * 9 + 9, 8 + n3 * 18, 103 + n4 * 18 + n5));
            }
        }
        for (n4 = 0; n4 < 9; ++n4) {
            this.id_break(new rJY(rhz_32, n4, 8 + n4 * 18, 161 + n5));
        }
    }

    private rXe_1(rJP<?> rJP2, int n, rhz_3 rhz_32, int n2) {
        this(rJP2, n, rhz_32, new rXA(9 * n2), n2);
    }

    public static rXe_1 id_class(int n, rhz_3 rhz_32, rXu_1 rXu_12) {
        return new rXe_1(rJP.id_byte, n, rhz_32, rXu_12, 3);
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
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if (n < this.id_byte * 9 ? !this.id_class(rdn_33, this.id_byte * 9, this.id_throws.size(), true) : !this.id_class(rdn_33, 0, this.id_byte * 9, false)) {
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

    public rXu_1 id_class() {
        return this.id_class;
    }

    public static rXe_1 id_class(int n, rhz_3 rhz_32) {
        return new rXe_1(rJP.id_class, n, rhz_32, 1);
    }

    public static rXe_1 id_break(int n, rhz_3 rhz_32) {
        return new rXe_1(rJP.id_break, n, rhz_32, 2);
    }

    public static rXe_1 id_break(int n, rhz_3 rhz_32, rXu_1 rXu_12) {
        return new rXe_1(rJP.id_case, n, rhz_32, rXu_12, 6);
    }

    public int id_break() {
        return this.id_byte;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_class.id_break(rhd_32);
    }

    public static rXe_1 id_throws(int n, rhz_3 rhz_32) {
        return new rXe_1(rJP.id_throws, n, rhz_32, 5);
    }

    public static rXe_1 id_case(int n, rhz_3 rhz_32) {
        return new rXe_1(rJP.id_case, n, rhz_32, 6);
    }

    public static rXe_1 id_protected(int n, rhz_3 rhz_32) {
        return new rXe_1(rJP.id_protected, n, rhz_32, 4);
    }
}

