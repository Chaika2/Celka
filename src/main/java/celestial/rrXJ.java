/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.aI_2;
import celestial.rrMU;
import celestial.rrMi_1;
import celestial.rrWQ;
import celestial.rrXX;
import celestial.rrXZ;
import celestial.rrXd_1;
import celestial.rrXh_1;
import celestial.rrXk_1;
import celestial.rrXm_1;
import celestial.rrXt_1;
import celestial.rrbb_3;
import celestial.ryW_2;

public class rrXJ
implements rrXh_1 {
    private rrMi_1 id_class;
    private In_1 id_break;
    private rrMU[] id_byte;
    private Iq_1 id_protected;
    private Iq_1 id_throws;
    private rrXX id_case;

    @Override
    public rrXt_1 id_byte(String string) {
        rrXd_1 rrXd_12 = this.id_break(string);
        if (rrXd_12 != null) {
            return rrXd_12;
        }
        rrXt_1 rrXt_12 = this.id_case.id_class(string);
        return rrXt_12 != null ? rrXt_12 : null;
    }

    public rrXJ(rrMi_1 rrMi_12, In_1 in_1, rrMU[] rrMUArray) {
        this.id_class = rrMi_12;
        this.id_break = in_1;
        this.id_byte = rrMUArray;
        rrWQ<aI_2, ryW_2> rrWQ2 = rrMi_12.id_class();
        this.id_case = rrWQ2.id_break().isPresent() ? new rrXZ() : new rrXm_1();
    }

    public void id_class(Iq_1 iq_1) {
        this.id_throws = iq_1;
    }

    @Override
    public Iq_1 id_class(String string) {
        if (string == null) {
            return null;
        }
        if (string.indexOf(":") >= 0) {
            String[] stringArray = rrbb_3.id_class(string, ":");
            Iq_1 iq_1 = this.id_class(stringArray[0]);
            for (int i = 1; i < stringArray.length; ++i) {
                String string2 = stringArray[i];
                Iq_1 iq_12 = iq_1.id_byte(string2);
                if (iq_12 == null) {
                    return null;
                }
                iq_1 = iq_12;
            }
            return iq_1;
        }
        if (this.id_protected != null && string.equals("this")) {
            return this.id_protected;
        }
        if (this.id_throws != null && string.equals("part")) {
            return this.id_throws;
        }
        Iq_1 iq_1 = this.id_class.id_class(this.id_break, string);
        if (iq_1 != null) {
            return iq_1;
        }
        for (int i = 0; i < this.id_byte.length; ++i) {
            rrMU rrMU2 = this.id_byte[i];
            Iq_1 iq_13 = rrMU2.id_class();
            if (string.equals(iq_13.id_byte())) {
                return iq_13;
            }
            Iq_1 iq_14 = iq_13.id_byte(string);
            if (iq_14 == null) continue;
            return iq_14;
        }
        return null;
    }

    public void id_break(Iq_1 iq_1) {
        this.id_protected = iq_1;
    }

    @Override
    public rrXd_1 id_break(String string) {
        String[] stringArray = rrbb_3.id_class(string, ".");
        if (stringArray.length != 2) {
            return null;
        }
        String string2 = stringArray[0];
        String string3 = stringArray[1];
        Iq_1 iq_1 = this.id_class(string2);
        if (iq_1 == null) {
            return null;
        }
        rrXk_1 rrXk_12 = rrXk_1.id_class(string3);
        return rrXk_12 == null ? null : new rrXd_1(string, iq_1, rrXk_12);
    }
}

