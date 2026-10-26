/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrkC;
import celestial.rrkF;
import celestial.rrkH;
import celestial.rrkL;
import celestial.rrkl_1;
import celestial.rrkn_1;
import celestial.rrkp_1;
import celestial.rrky_1;
import java.util.ArrayList;
import java.util.List;

public class rrkq_1 {
    private final List<rrky_1> id_class = new ArrayList<rrky_1>();

    public rrkH id_byte(String string) {
        rrkH rrkH2 = new rrkH(string);
        this.id_class.add(rrkH2);
        return rrkH2;
    }

    public void id_class() {
        for (int i = 0; i < this.id_class.size(); ++i) {
            rrky_1 rrky_12 = this.id_class.get(i);
            rrky_12.id_private();
        }
    }

    public rrkL id_class(String string) {
        rrkL rrkL2 = new rrkL(string);
        this.id_class.add(rrkL2);
        return rrkL2;
    }

    public void id_class(int n) {
        for (int i = 0; i < this.id_class.size(); ++i) {
            rrky_1 rrky_12 = this.id_class.get(i);
            rrky_12.id_byte(n);
        }
    }

    public rrkn_1 id_break(String string) {
        rrkn_1 rrkn_12 = new rrkn_1(string);
        this.id_class.add(rrkn_12);
        return rrkn_12;
    }

    public rrkC id_throws(String string) {
        rrkC rrkC2 = new rrkC(string);
        this.id_class.add(rrkC2);
        return rrkC2;
    }

    public rrkp_1 id_catch(String string) {
        rrkp_1 rrkp_12 = new rrkp_1(string);
        this.id_class.add(rrkp_12);
        return rrkp_12;
    }

    public rrkl_1 id_case(String string) {
        rrkl_1 rrkl_12 = new rrkl_1(string);
        this.id_class.add(rrkl_12);
        return rrkl_12;
    }

    public rrkF id_protected(String string) {
        rrkF rrkF2 = new rrkF(string);
        this.id_class.add(rrkF2);
        return rrkF2;
    }
}

