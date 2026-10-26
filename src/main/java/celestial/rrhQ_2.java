/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qy_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wJ_2;

public class rrhQ_2
extends rrMi_1 {
    public rrhQ_2() {
        super(aI_2.N, "puffer_fish_big", 0.2f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        qy_3 qy_32;
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pV_2 pV_22 = pg_32.id_throws().get(aI_2.N);
        if (!(pV_22 instanceof qy_3)) {
            rrbb_3.id_protected("Not a PufferfishRenderer: " + pV_22);
            return null;
        }
        if (pV_22.id_byte() == null) {
            qy_32 = new qy_3(pg_32);
            qy_32.id_byte = f;
            pV_22 = qy_32;
        }
        qy_32 = (qy_3)pV_22;
        if (!rrxr_3.Ea.id_protected()) {
            rrbb_3.id_protected("Model field not found: RenderPufferfish.modelBig");
            return null;
        }
        rrxr_3.Ea.id_class(qy_32, in_1);
        return qy_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wJ_2)) {
            return null;
        }
        wJ_2 wJ_22 = (wJ_2)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 0);
        }
        if (string.equals("fin_right")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 1);
        }
        if (string.equals("fin_left")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 2);
        }
        if (string.equals("spikes_front_top")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 3);
        }
        if (string.equals("spikes_middle_top")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 4);
        }
        if (string.equals("spikes_back_top")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 5);
        }
        if (string.equals("spikes_front_right")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 6);
        }
        if (string.equals("spikes_front_left")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 7);
        }
        if (string.equals("spikes_front_bottom")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 8);
        }
        if (string.equals("spikes_middle_bottom")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 9);
        }
        if (string.equals("spikes_back_bottom")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 10);
        }
        if (string.equals("spikes_back_right")) {
            return (Iq_1)rrxr_3.sI.id_class(wJ_22, 11);
        }
        return string.equals("spikes_back_left") ? (Iq_1)rrxr_3.sI.id_class(wJ_22, 12) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wJ_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "fin_right", "fin_left", "spikes_front_top", "spikes_middle_top", "spikes_back_top", "spikes_front_right", "spikes_front_left", "spikes_front_bottom", "spikes_middle_bottom", "spikes_back_bottom", "spikes_back_right", "spikes_back_left"};
    }
}

