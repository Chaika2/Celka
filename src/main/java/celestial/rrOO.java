/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.jS_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ryW_2;
import celestial.tm_3;

public class rrOO
extends rrMi_1 {
    public rrOO() {
        super(ryW_2.id_native, "enchanting_book", 0.0f, new String[]{"book"});
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jW_2 jW_22 = jz_32.id_class(ryW_2.id_native);
        if (!(jW_22 instanceof jS_2)) {
            return null;
        }
        if (jW_22.id_byte() == null) {
            jW_22 = new jS_2(jz_32);
        }
        if (!rrxr_3.GF.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
            return null;
        }
        rrxr_3.id_class((Object)jW_22, rrxr_3.GF, (Object)in_1);
        return jW_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tm_3)) {
            return null;
        }
        tm_3 tm_32 = (tm_3)in_1;
        if (string.equals("cover_right")) {
            return (Iq_1)rrxr_3.St.id_class(tm_32, 0);
        }
        if (string.equals("cover_left")) {
            return (Iq_1)rrxr_3.St.id_class(tm_32, 1);
        }
        if (string.equals("pages_right")) {
            return (Iq_1)rrxr_3.St.id_class(tm_32, 2);
        }
        if (string.equals("pages_left")) {
            return (Iq_1)rrxr_3.St.id_class(tm_32, 3);
        }
        if (string.equals("flipping_page_right")) {
            return (Iq_1)rrxr_3.St.id_class(tm_32, 4);
        }
        if (string.equals("flipping_page_left")) {
            return (Iq_1)rrxr_3.St.id_class(tm_32, 5);
        }
        return string.equals("book_spine") ? (Iq_1)rrxr_3.St.id_class(tm_32, 6) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tm_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine"};
    }
}

