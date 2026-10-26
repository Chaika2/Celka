/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pA_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOg_1;
import celestial.rrxr_3;
import celestial.tj_3;
import celestial.tp_3;
import java.util.ArrayList;
import java.util.Arrays;

public class rrhM_2
extends rrOg_1 {
    public rrhM_2() {
        super(aI_2.G, "mule", 0.75f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pA_2 pA_22 = new pA_2(pg_32, 0.92f);
        pA_22.id_throws = (tp_3)in_1;
        pA_22.id_byte = f;
        return pA_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tj_3)) {
            return null;
        }
        tj_3 tj_32 = (tj_3)in_1;
        if (string.equals("left_chest")) {
            return (Iq_1)rrxr_3.sX.id_class(tj_32, 0);
        }
        return string.equals("right_chest") ? (Iq_1)rrxr_3.sX.id_class(tj_32, 1) : super.id_class(in_1, string);
    }

    @Override
    public In_1 id_throws() {
        return new tj_3(0.92f);
    }

    @Override
    public String[] id_case() {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(super.id_case()));
        arrayList.add("left_chest");
        arrayList.add("right_chest");
        return arrayList.toArray(new String[arrayList.size()]);
    }
}

