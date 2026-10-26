/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXC;
import celestial.rXu_1;
import celestial.rdI_2;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rqs_3;
import celestial.rsA_2;

public class rXl_1
implements rXu_1 {
    private final rsA_2 id_class;
    private final rqs_3<rdn_3> id_break = rqs_3.id_class(3, rdn_3.id_break);
    private rdI_2 id_byte;
    private int id_protected;
    private int id_throws;

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        return this.id_class.id_class() == rhd_32;
    }

    public void id_byte() {
        rdn_3 rdn_32;
        rdn_3 rdn_33;
        this.id_byte = null;
        if (this.id_break.get(0).id_class()) {
            rdn_33 = this.id_break.get(1);
            rdn_32 = rdn_3.id_break;
        } else {
            rdn_33 = this.id_break.get(0);
            rdn_32 = this.id_break.get(1);
        }
        if (rdn_33.id_class()) {
            this.id_break(2, rdn_3.id_break);
            this.id_throws = 0;
        } else {
            rdf_3 rdf_32 = this.id_class.id_break();
            if (!rdf_32.isEmpty()) {
                rdI_2 rdI_22 = rdf_32.id_class(rdn_33, rdn_32, this.id_protected);
                if (rdI_22 == null || rdI_22.id_int()) {
                    this.id_byte = rdI_22;
                    rdI_22 = rdf_32.id_class(rdn_32, rdn_33, this.id_protected);
                }
                if (rdI_22 != null && !rdI_22.id_int()) {
                    this.id_byte = rdI_22;
                    this.id_break(2, rdI_22.id_case());
                    this.id_throws = rdI_22.id_package();
                } else {
                    this.id_break(2, rdn_3.id_break);
                    this.id_throws = 0;
                }
            }
            this.id_class.id_class(this.id_extends(2));
        }
    }

    public rXl_1(rsA_2 rsA_22) {
        this.id_class = rsA_22;
    }

    public void id_class(int n) {
        this.id_protected = n;
        this.id_byte();
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        rdn_3 rdn_32 = this.id_break.get(n);
        if (n == 2 && !rdn_32.id_class()) {
            return rXC.id_class(this.id_break, n, rdn_32.id_char());
        }
        rdn_3 rdn_33 = rXC.id_class(this.id_break, n, n2);
        if (!rdn_33.id_class() && this.id_break(n)) {
            this.id_byte();
        }
        return rdn_33;
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        this.id_break.set(n, rdn_32);
        if (!rdn_32.id_class() && rdn_32.id_char() > this.ab_()) {
            rdn_32.id_throws(this.ab_());
        }
        if (this.id_break(n)) {
            this.id_byte();
        }
    }

    @Override
    public void id_break() {
        this.id_byte();
    }

    private boolean id_break(int n) {
        return n == 0 || n == 1;
    }

    public int id_throws() {
        return this.id_throws;
    }

    @Override
    public rdn_3 id_extends(int n) {
        return this.id_break.get(n);
    }

    @Override
    public int id_else() {
        return this.id_break.size();
    }

    @Override
    public boolean id_return() {
        for (rdn_3 rdn_32 : this.id_break) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_public() {
        this.id_break.clear();
    }

    public rdI_2 id_protected() {
        return this.id_byte;
    }

    @Override
    public rdn_3 id_native(int n) {
        return rXC.id_class(this.id_break, n);
    }
}

