/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWr_1;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkt_3;
import celestial.rqO_2;
import celestial.rqs_3;

public class rWO
implements rkt_3 {
    private final rqO_2 id_class;
    public final String id_break;
    public final rdn_3 id_byte;
    public final rqs_3<rkg_3> id_protected;

    @Override
    public rdn_3 id_byte() {
        return this.id_byte;
    }

    public rWO(rqO_2 rqO_22, String string, rdn_3 rdn_32, rqs_3<rkg_3> rqs_32) {
        this.id_class = rqO_22;
        this.id_break = string;
        this.id_byte = rdn_32;
        this.id_protected = rqs_32;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        rWr_1 rWr_12 = new rWr_1();
        int n = 0;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            ++n;
            rWr_12.id_class(rdn_32, 1);
        }
        return n == this.id_protected.size() && rWr_12.id_class(this, null);
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        return this.id_byte.id_implements();
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= this.id_protected.size();
    }

    @Override
    public rqs_3<rkg_3> id_class() {
        return this.id_protected;
    }

    @Override
    public rqO_2 id_case() {
        return this.id_class;
    }

    @Override
    public String id_protected() {
        return this.id_break;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_break;
    }
}

