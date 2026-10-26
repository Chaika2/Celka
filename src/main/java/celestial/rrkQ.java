/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXI;
import celestial.rrXt_1;
import celestial.rrkz_1;
import java.util.ArrayList;
import java.util.Map;

public class rrkQ {
    private rrkz_1[] id_class;
    private rrXI[] id_break;

    private void id_byte() {
        for (int i = 0; i < this.id_break.length; ++i) {
            rrXI rrXI2 = this.id_break[i];
            rrXI2.id_break();
        }
    }

    public rrkQ(rrkz_1[] rrkz_1Array, Map<String, rrXt_1> map) {
        this.id_class = rrkz_1Array;
        ArrayList<rrXI> arrayList = new ArrayList<rrXI>();
        for (String string : map.keySet()) {
            rrXt_1 rrXt_12 = map.get(string);
            if (!(rrXt_12 instanceof rrXI)) continue;
            rrXI rrXI2 = (rrXI)((Object)rrXt_12);
            arrayList.add(rrXI2);
        }
        this.id_break = arrayList.toArray(new rrXI[arrayList.size()]);
    }

    public void id_class() {
        this.id_byte();
        for (int i = 0; i < this.id_class.length; ++i) {
            rrkz_1 rrkz_12 = this.id_class[i];
            rrkz_12.id_class();
        }
    }

    public void id_class(int n) {
        for (int i = 0; i < this.id_class.length; ++i) {
            rrkz_1 rrkz_12 = this.id_class[i];
            rrkz_12.id_class(n);
        }
    }

    public void id_break() {
        for (int i = 0; i < this.id_class.length; ++i) {
            rrkz_1 rrkz_12 = this.id_class[i];
            rrkz_12.id_break();
        }
    }
}

