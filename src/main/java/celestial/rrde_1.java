/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXV;
import celestial.rrXt_1;
import celestial.rrdD;
import celestial.rrdp_1;
import celestial.rrkr_1;
import java.util.HashMap;
import java.util.Map;

public class rrde_1
implements rrXV {
    private Map<String, rrdp_1> id_class = new HashMap<String, rrdp_1>();

    @Override
    public rrXt_1 id_byte(String string) {
        return this.id_class.get(string);
    }

    public rrde_1(rrdD[] rrdDArray) {
        for (int i = 0; i < rrdDArray.length; ++i) {
            rrdD rrdD2 = rrdDArray[i];
            if (!(rrdD2 instanceof rrkr_1)) continue;
            rrkr_1 rrkr_12 = (rrkr_1)rrdD2;
            rrdp_1 rrdp_12 = new rrdp_1(rrkr_12);
            this.id_class.put(rrdD2.id_class(), rrdp_12);
        }
    }
}

