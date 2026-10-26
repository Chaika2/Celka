/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Qs_1;
import celestial.kD_2;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class ke_3 {
    private final rYB id_class;
    private final rfH_2 id_break;
    private final boolean id_byte;
    private final rfH_2 id_protected;
    private final rpr_3 id_throws;
    private final List<rfH_2> id_case = Lists.newArrayList();
    private final List<rfH_2> id_catch = Lists.newArrayList();
    private final rpr_3 id_private;

    public List<rfH_2> id_byte() {
        return this.id_catch;
    }

    public ke_3(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32, boolean bl) {
        this.id_class = rYB2;
        this.id_break = rfH_22;
        this.id_private = rpr_32;
        this.id_byte = bl;
        if (bl) {
            this.id_throws = rpr_32;
            this.id_protected = rfH_22.id_break(rpr_32);
        } else {
            this.id_throws = rpr_32.id_case();
            this.id_protected = rfH_22.id_class(rpr_32, 2);
        }
    }

    private boolean id_class(rfH_2 rfH_22, rpr_3 rpr_32) {
        int n;
        xc_3 xc_32 = this.id_class.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        if (xc_32.id_catch()) {
            return true;
        }
        if (!kD_2.id_class(xc_32, this.id_class, rfH_22, this.id_throws, false, rpr_32)) {
            return true;
        }
        if (rfH_22.equals(this.id_break)) {
            return true;
        }
        if (this.id_case.contains(rfH_22)) {
            return true;
        }
        int n2 = 1;
        if (n2 + this.id_case.size() > 12) {
            return false;
        }
        while (ke_3.id_class(xd_32)) {
            rfH_2 rfH_23 = rfH_22.id_class(this.id_throws.id_case(), n2);
            xd_3 xd_33 = xd_32;
            xc_32 = this.id_class.id_byte(rfH_23);
            xd_32 = xc_32.id_break();
            if (xc_32.id_catch() || !ke_3.id_class(xd_33, xd_32) || !kD_2.id_class(xc_32, this.id_class, rfH_23, this.id_throws, false, this.id_throws.id_case()) || rfH_23.equals(this.id_break)) break;
            if (++n2 + this.id_case.size() <= 12) continue;
            return false;
        }
        int n3 = 0;
        for (n = n2 - 1; n >= 0; --n) {
            this.id_case.add(rfH_22.id_class(this.id_throws.id_case(), n));
            ++n3;
        }
        n = 1;
        while (true) {
            rfH_2 rfH_24;
            int n4;
            if ((n4 = this.id_case.indexOf(rfH_24 = rfH_22.id_class(this.id_throws, n))) > -1) {
                this.id_class(n3, n4);
                for (int i = 0; i <= n4 + n3; ++i) {
                    rfH_2 rfH_25 = this.id_case.get(i);
                    if (!ke_3.id_class(this.id_class.id_byte(rfH_25).id_break()) || this.id_class(rfH_25)) continue;
                    return false;
                }
                return true;
            }
            xc_32 = this.id_class.id_byte(rfH_24);
            if (xc_32.id_catch()) {
                return true;
            }
            if (!kD_2.id_class(xc_32, this.id_class, rfH_24, this.id_throws, true, this.id_throws) || rfH_24.equals(this.id_break)) {
                return false;
            }
            if (xc_32.id_extends() == Qs_1.DESTROY) {
                this.id_catch.add(rfH_24);
                return true;
            }
            if (this.id_case.size() >= 12) {
                return false;
            }
            this.id_case.add(rfH_24);
            ++n3;
            ++n;
        }
    }

    private boolean id_class(rfH_2 rfH_22) {
        xc_3 xc_32 = this.id_class.id_byte(rfH_22);
        for (rpr_3 rpr_32 : rpr_3.values()) {
            rfH_2 rfH_23;
            xc_3 xc_33;
            if (rpr_32.id_final() == this.id_throws.id_final() || !ke_3.id_class((xc_33 = this.id_class.id_byte(rfH_23 = rfH_22.id_break(rpr_32))).id_break(), xc_32.id_break()) || this.id_class(rfH_23, rpr_32)) continue;
            return false;
        }
        return true;
    }

    private void id_class(int n, int n2) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        arrayList.addAll(this.id_case.subList(0, n2));
        arrayList2.addAll(this.id_case.subList(this.id_case.size() - n, this.id_case.size()));
        arrayList3.addAll(this.id_case.subList(n2, this.id_case.size() - n));
        this.id_case.clear();
        this.id_case.addAll(arrayList);
        this.id_case.addAll(arrayList2);
        this.id_case.addAll(arrayList3);
    }

    private static boolean id_class(xd_3 xd_32) {
        return xd_32 == xu_3.EN || xd_32 == xu_3.Jh;
    }

    private static boolean id_class(xd_3 xd_32, xd_3 xd_33) {
        if (xd_32 == xu_3.Jh && xd_33 == xu_3.EN) {
            return false;
        }
        if (xd_32 == xu_3.EN && xd_33 == xu_3.Jh) {
            return false;
        }
        return ke_3.id_class(xd_32) || ke_3.id_class(xd_33);
    }

    public boolean id_class() {
        this.id_case.clear();
        this.id_catch.clear();
        xc_3 xc_32 = this.id_class.id_byte(this.id_protected);
        if (!kD_2.id_class(xc_32, this.id_class, this.id_protected, this.id_throws, false, this.id_private)) {
            if (this.id_byte && xc_32.id_extends() == Qs_1.DESTROY) {
                this.id_catch.add(this.id_protected);
                return true;
            }
            return false;
        }
        if (!this.id_class(this.id_protected, this.id_throws)) {
            return false;
        }
        for (int i = 0; i < this.id_case.size(); ++i) {
            rfH_2 rfH_22 = this.id_case.get(i);
            if (!ke_3.id_class(this.id_class.id_byte(rfH_22).id_break()) || this.id_class(rfH_22)) continue;
            return false;
        }
        return true;
    }

    public List<rfH_2> id_break() {
        return this.id_case;
    }
}

