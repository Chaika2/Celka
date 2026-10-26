/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qN_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wr_3;

public class rrhr_3
extends rrMi_1 {
    public rrhr_3() {
        super(aI_2.id_switch, "minecart", 0.5f);
    }

    protected rrhr_3(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wr_3)) {
            return null;
        }
        wr_3 wr_32 = (wr_3)in_1;
        Iq_1[] iq_1Array = (Iq_1[])rrxr_3.sA.id_class(wr_32);
        if (iq_1Array != null) {
            if (string.equals("bottom")) {
                return iq_1Array[0];
            }
            if (string.equals("back")) {
                return iq_1Array[1];
            }
            if (string.equals("front")) {
                return iq_1Array[2];
            }
            if (string.equals("right")) {
                return iq_1Array[3];
            }
            if (string.equals("left")) {
                return iq_1Array[4];
            }
            if (string.equals("dirt")) {
                return iq_1Array[5];
            }
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qN_2 qN_22 = new qN_2(pg_32);
        if (!rrxr_3.Gr.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderMinecart.modelMinecart");
            return null;
        }
        rrxr_3.id_class(qN_22, rrxr_3.Gr, (Object)in_1);
        qN_22.id_byte = f;
        return qN_22;
    }

    @Override
    public In_1 id_throws() {
        return new wr_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"bottom", "back", "front", "right", "left", "dirt"};
    }
}

