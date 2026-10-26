/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qn_3;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.wO_2;
import java.util.ArrayList;
import java.util.Arrays;

public class rrhd_3
extends rrOG {
    public rrhd_3() {
        super(aI_2.d, "piglin", 0.5f);
    }

    protected rrhd_3(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (in_1 instanceof wO_2) {
            wO_2 wO_22 = (wO_2)in_1;
            if (string.equals("left_ear")) {
                return wO_22.id_native;
            }
            if (string.equals("right_ear")) {
                return wO_22.id_volatile;
            }
        }
        return super.id_class(in_1, string);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qn_3 qn_32 = new qn_3(pg_32, false);
        qn_32.id_throws = (wO_2)in_1;
        qn_32.id_byte = f;
        return qn_32;
    }

    @Override
    public In_1 id_throws() {
        return new wO_2(0.0f, 64, 64);
    }

    @Override
    public String[] id_case() {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(super.id_case()));
        arrayList.add("left_ear");
        arrayList.add("right_ear");
        return arrayList.toArray(new String[arrayList.size()]);
    }
}

