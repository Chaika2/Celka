/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fY_2;
import celestial.fj_3;
import celestial.fq_3;
import celestial.rVL;
import celestial.rqO_2;
import celestial.rsh_3;
import java.util.stream.Stream;

public class fv_3
extends fq_3 {
    private static final rqO_2 id_class = new rqO_2("back");

    public fj_3 id_byte() {
        return this.id_class(id_class);
    }

    public fv_3(fY_2 fY_22) {
        super(fY_22, new rqO_2("textures/atlas/paintings.png"), "painting");
    }

    public fj_3 id_class(rsh_3 rsh_32) {
        return this.id_class(rVL.P.id_break(rsh_32));
    }

    @Override
    protected Stream<rqO_2> id_break() {
        return Stream.concat(rVL.P.id_protected().stream(), Stream.of(id_class));
    }
}

