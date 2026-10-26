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
import java.util.List;
import java.util.Map;
import java.util.Random;

public class IR
implements IJ {
    protected final List<wK_2> id_class;
    protected final Map<rpr_3, List<wK_2>> id_break;
    protected final boolean id_byte;
    protected final boolean id_protected;
    protected final boolean id_throws;
    protected final fj_3 id_case;
    protected final Ik_1 id_catch;
    protected final IF id_private;

    @Override
    public boolean id_byte() {
        return this.id_throws;
    }

    public IR(List<wK_2> list, Map<rpr_3, List<wK_2>> map, boolean bl, boolean bl2, boolean bl3, fj_3 fj_32, Ik_1 ik_1, IF iF) {
        this.id_class = list;
        this.id_break = map;
        this.id_byte = bl;
        this.id_protected = bl3;
        this.id_throws = bl2;
        this.id_case = fj_32;
        this.id_catch = ik_1;
        this.id_private = iF;
    }

    @Override
    public List<wK_2> id_class(xc_3 xc_32, rpr_3 rpr_32, Random random) {
        return rpr_32 == null ? this.id_class : this.id_break.get(rpr_32);
    }

    @Override
    public boolean id_class() {
        return this.id_byte;
    }

    @Override
    public boolean id_break() {
        return this.id_protected;
    }

    @Override
    public fj_3 id_throws() {
        return this.id_case;
    }

    @Override
    public IF id_catch() {
        return this.id_private;
    }

    @Override
    public Ik_1 id_case() {
        return this.id_catch;
    }

    @Override
    public boolean id_protected() {
        return false;
    }
}

