/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IF;
import celestial.IJ;
import celestial.Ik_1;
import celestial.fj_3;
import celestial.fr_3;
import celestial.rTE;
import celestial.rpr_3;
import celestial.wK_2;
import celestial.xc_3;
import java.util.List;
import java.util.Random;

public class Ia_1
implements IJ {
    private final int id_class;
    private final List<fr_3> id_break;
    private final IJ id_byte;

    @Override
    public boolean id_byte() {
        return this.id_byte.id_byte();
    }

    public Ia_1(List<fr_3> list) {
        this.id_break = list;
        this.id_class = rTE.id_class(list);
        this.id_byte = list.get((int)0).id_class;
    }

    @Override
    public List<wK_2> id_class(xc_3 xc_32, rpr_3 rpr_32, Random random) {
        return rTE.id_class(this.id_break, (int)(Math.abs((int)((int)random.nextLong())) % this.id_class)).id_class.id_class(xc_32, rpr_32, random);
    }

    @Override
    public boolean id_class() {
        return this.id_byte.id_class();
    }

    @Override
    public boolean id_break() {
        return this.id_byte.id_break();
    }

    @Override
    public fj_3 id_throws() {
        return this.id_byte.id_throws();
    }

    @Override
    public IF id_catch() {
        return this.id_byte.id_catch();
    }

    @Override
    public Ik_1 id_case() {
        return this.id_byte.id_case();
    }

    @Override
    public boolean id_protected() {
        return this.id_byte.id_protected();
    }
}

