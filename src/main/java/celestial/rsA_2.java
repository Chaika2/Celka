/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJR;
import celestial.rJp_1;
import celestial.rYB;
import celestial.rdI_2;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rqA_2;
import java.util.OptionalInt;

public interface rsA_2 {
    public rYB id_byte();

    public void id_class(rdn_3 var1);

    public void id_class(int var1);

    default public void id_class(rhd_3 rhd_33, rgP_2 rgP_22, int n2) {
        rdf_3 rdf_32;
        OptionalInt optionalInt = rhd_33.id_class(new rJR((n, rhz_32, rhd_32) -> new rJp_1(n, rhz_32, this), rgP_22));
        if (optionalInt.isPresent() && !(rdf_32 = this.id_break()).isEmpty()) {
            rhd_33.id_class(optionalInt.getAsInt(), rdf_32, n2, this.id_protected(), this.id_throws(), this.Q_());
        }
    }

    public rhd_3 id_class();

    public void id_class(rhd_3 var1);

    public void id_class(rdf_3 var1);

    public void id_class(rdI_2 var1);

    public rdf_3 id_break();

    public boolean id_throws();

    public rqA_2 id_case();

    public int id_protected();

    default public boolean Q_() {
        return false;
    }
}

