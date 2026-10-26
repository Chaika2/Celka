/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IF;
import celestial.Ik_1;
import celestial.fj_3;
import celestial.rpr_3;
import celestial.rrGn_1;
import celestial.wK_2;
import celestial.xc_3;
import java.util.List;
import java.util.Random;

public interface IJ
extends rrGn_1 {
    public boolean id_byte();

    public boolean id_class();

    public List<wK_2> id_class(xc_3 var1, rpr_3 var2, Random var3);

    public boolean id_break();

    public fj_3 id_throws();

    public IF id_catch();

    default public Ik_1 id_case() {
        return Ik_1.id_class;
    }

    public boolean id_protected();
}

