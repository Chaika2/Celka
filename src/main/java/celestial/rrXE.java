/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.Tk_1;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.wg_3;

public class rrXE
extends rrOG {
    public rrXE() {
        super(aI_2.rs, "zombie", 0.5f);
    }

    protected rrXE(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        Tk_1 tk_1 = new Tk_1(pg_32);
        tk_1.id_throws = (wg_3)in_1;
        tk_1.id_byte = f;
        return tk_1;
    }

    @Override
    public In_1 id_throws() {
        return new wg_3(0.0f, false);
    }
}

