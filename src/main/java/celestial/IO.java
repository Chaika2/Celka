/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IF;
import celestial.IJ;
import celestial.Ik_1;
import celestial.fj_3;
import celestial.rpr_3;
import celestial.wK_2;
import celestial.xc_3;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class IO
implements IJ {
    private final Ik_1 id_class;
    private final IF id_break;
    private final fj_3 id_byte;
    private final boolean id_protected;

    @Override
    public boolean id_byte() {
        return this.id_protected;
    }

    public IO(Ik_1 ik_1, IF iF, fj_3 fj_32, boolean bl) {
        this.id_class = ik_1;
        this.id_break = iF;
        this.id_byte = fj_32;
        this.id_protected = bl;
    }

    @Override
    public List<wK_2> id_class(xc_3 xc_32, rpr_3 rpr_32, Random random) {
        return Collections.emptyList();
    }

    @Override
    public boolean id_class() {
        return false;
    }

    @Override
    public boolean id_break() {
        return true;
    }

    @Override
    public fj_3 id_throws() {
        return this.id_byte;
    }

    @Override
    public IF id_catch() {
        return this.id_break;
    }

    @Override
    public Ik_1 id_case() {
        return this.id_class;
    }

    @Override
    public boolean id_protected() {
        return true;
    }
}

