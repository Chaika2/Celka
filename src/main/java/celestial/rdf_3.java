/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdI_2;
import celestial.rdn_3;
import celestial.ruu_3;
import java.util.ArrayList;

public class rdf_3
extends ArrayList<rdI_2> {
    public rdf_3() {
    }

    public rdf_3(rcd_3 rcd_32) {
        rcy_3 rcy_32 = rcd_32.id_protected("Recipes", 10);
        for (int i = 0; i < rcy_32.size(); ++i) {
            this.add(new rdI_2(rcy_32.id_class(i)));
        }
    }

    public void id_class(ruu_3 ruu_32) {
        ruu_32.writeByte((byte)(this.size() & 0xFF));
        for (int i = 0; i < this.size(); ++i) {
            rdI_2 rdI_22 = (rdI_2)this.get(i);
            ruu_32.id_class(rdI_22.id_class());
            ruu_32.id_class(rdI_22.id_protected());
            rdn_3 rdn_32 = rdI_22.id_byte();
            ruu_32.writeBoolean(!rdn_32.id_class());
            if (!rdn_32.id_class()) {
                ruu_32.id_class(rdn_32);
            }
            ruu_32.writeBoolean(rdI_22.id_int());
            ruu_32.writeInt(rdI_22.id_catch());
            ruu_32.writeInt(rdI_22.id_implements());
            ruu_32.writeInt(rdI_22.id_package());
            ruu_32.writeInt(rdI_22.id_volatile());
            ruu_32.writeFloat(rdI_22.id_final());
            ruu_32.writeInt(rdI_22.id_extends());
        }
    }

    public rcd_3 id_class() {
        rcd_3 rcd_32 = new rcd_3();
        rcy_3 rcy_32 = new rcy_3();
        for (int i = 0; i < this.size(); ++i) {
            rdI_2 rdI_22 = (rdI_2)this.get(i);
            rcy_32.add(rdI_22.id_this());
        }
        rcd_32.id_class("Recipes", rcy_32);
        return rcd_32;
    }

    public rdI_2 id_class(rdn_3 rdn_32, rdn_3 rdn_33, int n) {
        if (n > 0 && n < this.size()) {
            rdI_2 rdI_22 = (rdI_2)this.get(n);
            return rdI_22.id_class(rdn_32, rdn_33) ? rdI_22 : null;
        }
        for (int i = 0; i < this.size(); ++i) {
            rdI_2 rdI_23 = (rdI_2)this.get(i);
            if (!rdI_23.id_class(rdn_32, rdn_33)) continue;
            return rdI_23;
        }
        return null;
    }

    public static rdf_3 id_break(ruu_3 ruu_32) {
        rdf_3 rdf_32 = new rdf_3();
        int n = ruu_32.readByte() & 0xFF;
        for (int i = 0; i < n; ++i) {
            rdn_3 rdn_32 = ruu_32.id_extends();
            rdn_3 rdn_33 = ruu_32.id_extends();
            rdn_3 rdn_34 = rdn_3.id_break;
            if (ruu_32.readBoolean()) {
                rdn_34 = ruu_32.id_extends();
            }
            boolean bl = ruu_32.readBoolean();
            int n2 = ruu_32.readInt();
            int n3 = ruu_32.readInt();
            int n4 = ruu_32.readInt();
            int n5 = ruu_32.readInt();
            float f = ruu_32.readFloat();
            int n6 = ruu_32.readInt();
            rdI_2 rdI_22 = new rdI_2(rdn_32, rdn_34, rdn_33, n2, n3, n4, f, n6);
            if (bl) {
                rdI_22.id_new();
            }
            rdI_22.id_break(n5);
            rdf_32.add(rdI_22);
        }
        return rdf_32;
    }
}

