/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.TV;
import celestial.aI_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qW_2;
import celestial.rrMa_1;
import celestial.rrOU;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.te_3;
import java.util.Iterator;
import java.util.List;

public class rrOe_1
extends rrOU {
    public rrOe_1() {
        super(aI_2.id_transient, "llama_decor", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        TV tV;
        qW_2 qW_22;
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pV_2 pV_22 = pg_32.id_throws().get(aI_2.id_transient);
        if (!(pV_22 instanceof qW_2)) {
            rrbb_3.id_protected("Not a RenderLlama: " + pV_22);
            return null;
        }
        if (pV_22.id_byte() == null) {
            qW_22 = new qW_2(pg_32);
            qW_22.id_throws = new te_3(0.0f);
            qW_22.id_byte = 0.7f;
            pV_22 = qW_22;
        }
        qW_22 = (qW_2)pV_22;
        List list = qW_22.id_throws();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            tV = iterator.next();
            if (!(tV instanceof TV)) continue;
            iterator.remove();
        }
        tV = new TV(qW_22);
        if (!rrxr_3.SN.id_protected()) {
            rrbb_3.id_protected("Field not found: LayerLlamaDecor.model");
            return null;
        }
        rrxr_3.SN.id_class(tV, in_1);
        qW_22.id_class(tV);
        return qW_22;
    }

    @Override
    public In_1 id_throws() {
        return new te_3(0.5f);
    }
}

