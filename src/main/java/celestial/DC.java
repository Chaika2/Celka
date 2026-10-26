/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.DA;
import celestial.Ux_1;
import celestial.aI_2;
import celestial.rVL;
import celestial.rlE_2;
import celestial.rlO_2;
import celestial.rqO_2;
import java.nio.file.Path;

public class DC
extends Ux_1<aI_2<?>> {
    public DC(DA dA) {
        super(dA, rVL.id_transient);
    }

    @Override
    public String id_class() {
        return "Entity Type Tags";
    }

    @Override
    protected Path id_class(rqO_2 rqO_22) {
        return this.id_break.id_break().resolve("data/" + rqO_22.id_byte() + "/tags/entity_types/" + rqO_22.id_break() + ".json");
    }

    @Override
    protected void id_break() {
        this.id_class(rlE_2.id_break).id_class((aI_2<?>)new aI_2[]{aI_2.A, aI_2.t, aI_2.rr});
        this.id_class(rlE_2.id_byte).id_class((aI_2<?>)new aI_2[]{aI_2.id_return, aI_2.W, aI_2.u, aI_2.U, aI_2.id_static, aI_2.a});
        this.id_class(rlE_2.id_protected).id_class(aI_2.id_throws);
        this.id_class(rlE_2.id_throws).id_class((aI_2<?>)new aI_2[]{aI_2.id_byte, aI_2.p});
        this.id_class(rlE_2.id_case).id_class((aI_2<?>)((Object)rlE_2.id_throws)).id_class((rlO_2<aI_2<?>>)new aI_2[]{aI_2.y, aI_2.id_const, aI_2.l, aI_2.I, aI_2.g, aI_2.id_int, aI_2.rP});
    }
}

