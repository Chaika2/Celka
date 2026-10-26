/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import celestial.rrMM;
import celestial.rrMz_1;
import celestial.rrbD_2;
import celestial.rrbb_3;
import java.util.ArrayList;
import java.util.Properties;

public class rrMb_1 {
    public String id_class = null;
    public String id_break = null;
    public rqO_2[] id_byte = null;
    public rrMM[] id_protected = null;

    public rrMb_1(String string, rqO_2[] rqO_2Array) {
        rrMz_1 rrMz_12 = new rrMz_1("RandomEntities");
        this.id_class = rrMz_12.id_class(string);
        this.id_break = rrMz_12.id_break(string);
        this.id_byte = rqO_2Array;
    }

    public rrMb_1(Properties properties, String string, rqO_2 rqO_22) {
        rrMz_1 rrMz_12 = new rrMz_1("RandomEntities");
        this.id_class = rrMz_12.id_class(string);
        this.id_break = rrMz_12.id_break(string);
        this.id_protected = this.id_class(properties, string, rqO_22, rrMz_12);
    }

    public boolean id_class(String string) {
        Object object;
        int n;
        if (this.id_byte == null && this.id_protected == null) {
            rrbb_3.id_protected("No skins specified: " + string);
            return false;
        }
        if (this.id_protected != null) {
            for (n = 0; n < this.id_protected.length; ++n) {
                object = this.id_protected[n];
                if (((rrMM)object).id_class(string)) continue;
                return false;
            }
        }
        if (this.id_byte != null) {
            for (n = 0; n < this.id_byte.length; ++n) {
                object = this.id_byte[n];
                if (rrbb_3.id_byte((rqO_2)object)) continue;
                rrbb_3.id_protected("Texture not found: " + ((rqO_2)object).id_break());
                return false;
            }
        }
        return true;
    }

    public boolean id_class() {
        if (this.id_protected != null) {
            return false;
        }
        return this.id_byte == null;
    }

    private rrMM[] id_class(Properties properties, String string, rqO_2 rqO_22, rrMz_1 rrMz_12) {
        ArrayList<rrMM> arrayList = new ArrayList<rrMM>();
        int n = properties.size();
        for (int i = 0; i < n; ++i) {
            rrMM rrMM2;
            int n2 = i + 1;
            String string2 = properties.getProperty("textures." + n2);
            if (string2 == null) {
                string2 = properties.getProperty("skins." + n2);
            }
            if (string2 == null || !(rrMM2 = new rrMM(properties, string, rqO_22, n2, string2, rrMz_12)).id_class(string)) continue;
            arrayList.add(rrMM2);
        }
        return arrayList.toArray(new rrMM[arrayList.size()]);
    }

    public rqO_2 id_class(rqO_2 rqO_22, rrbD_2 rrbD_22) {
        int n;
        if (this.id_protected != null) {
            for (n = 0; n < this.id_protected.length; ++n) {
                rrMM rrMM2 = this.id_protected[n];
                if (!rrMM2.id_class(rrbD_22)) continue;
                return rrMM2.id_class(rqO_22, rrbD_22.id_class());
            }
        }
        if (this.id_byte != null) {
            n = rrbD_22.id_class();
            int n2 = n % this.id_byte.length;
            return this.id_byte[n2];
        }
        return rqO_22;
    }
}

