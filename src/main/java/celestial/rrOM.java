/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.pv_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrXO;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.tu_3;
import com.google.common.collect.ImmutableList;

public class rrOM
extends rrMi_1 {
    public rrOM() {
        super(aI_2.id_catch, "boat", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pv_3 pv_32 = new pv_3(pg_32);
        if (!rrxr_3.Eg.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderBoat.modelBoat");
            return null;
        }
        rrxr_3.id_class((Object)pv_32, rrxr_3.Eg, (Object)in_1);
        pv_32.id_byte = f;
        return pv_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tu_3)) {
            return null;
        }
        tu_3 tu_32 = (tu_3)in_1;
        ImmutableList<Iq_1> immutableList = tu_32.id_break();
        if (immutableList != null) {
            if (string.equals("bottom")) {
                return rrXO.id_class(immutableList, 0);
            }
            if (string.equals("back")) {
                return rrXO.id_class(immutableList, 1);
            }
            if (string.equals("front")) {
                return rrXO.id_class(immutableList, 2);
            }
            if (string.equals("right")) {
                return rrXO.id_class(immutableList, 3);
            }
            if (string.equals("left")) {
                return rrXO.id_class(immutableList, 4);
            }
            if (string.equals("paddle_left")) {
                return rrXO.id_class(immutableList, 5);
            }
            if (string.equals("paddle_right")) {
                return rrXO.id_class(immutableList, 6);
            }
        }
        return string.equals("bottom_no_water") ? tu_32.id_byte() : null;
    }

    @Override
    public In_1 id_throws() {
        return new tu_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"bottom", "back", "front", "right", "left", "paddle_left", "paddle_right", "bottom_no_water"};
    }
}

