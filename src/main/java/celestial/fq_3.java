/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fJ_2;
import celestial.fY_2;
import celestial.fj_3;
import celestial.fx_3;
import celestial.jY_2;
import celestial.rAL;
import celestial.rqO_2;
import java.util.stream.Stream;

public abstract class fq_3
extends jY_2<fx_3>
implements AutoCloseable {
    private final fJ_2 id_class;
    private final String id_break;

    public fq_3(fY_2 fY_22, rqO_2 rqO_22, String string) {
        this.id_break = string;
        this.id_class = new fJ_2(rqO_22);
        fY_22.id_class(this.id_class.id_protected(), this.id_class);
    }

    protected fx_3 id_class(rAL rAL2) {
        fx_3 fx_32 = this.id_class.id_class(rAL2, this.id_break().map(this::id_break), 0);
        return fx_32;
    }

    @Override
    protected void id_class(fx_3 fx_32, rAL rAL2) {
        this.id_class.id_class(fx_32);
    }

    protected fj_3 id_class(rqO_2 rqO_22) {
        return this.id_class.id_break(this.id_break(rqO_22));
    }

    @Override
    public void close() {
        this.id_class.id_byte();
    }

    protected abstract Stream<rqO_2> id_break();

    @Override
    protected /* synthetic */ Object id_break(rAL rAL2) {
        return this.id_class(rAL2);
    }

    private rqO_2 id_break(rqO_2 rqO_22) {
        return new rqO_2(rqO_22.id_byte(), this.id_break + "/" + rqO_22.id_break());
    }
}

