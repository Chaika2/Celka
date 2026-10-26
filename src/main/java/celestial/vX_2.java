/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAZ;
import celestial.rAl_1;
import celestial.rAp_1;
import celestial.rgP_2;
import celestial.rqO_2;
import celestial.vd_3;
import celestial.vh_3;
import java.util.List;
import java.util.function.Function;

public abstract class vX_2
implements vd_3 {
    private final rAp_1 id_break;
    public final /* synthetic */ vh_3 id_class;

    @Override
    public rqO_2 id_byte() {
        return this.id_class.id_case.apply(this.id_break);
    }

    public vX_2(vh_3 vh_32, rAp_1 rAp_12) {
        this.id_class = vh_32;
        this.id_break = rAp_12;
    }

    protected void id_class(int n) {
        List<rAp_1> list = this.id_class();
        int n2 = list.indexOf(this.id_break);
        list.remove(n2);
        list.add(n2 + n, this.id_break);
        this.id_class.id_break.run();
    }

    protected abstract List<rAp_1> id_class();

    protected abstract List<rAp_1> id_break();

    @Override
    public rgP_2 id_throws() {
        return this.id_break.id_class();
    }

    protected void id_finally() {
        this.id_class().remove(this.id_break);
        this.id_break.id_private().id_class(this.id_break(), this.id_break, Function.identity(), true);
        this.id_class.id_break.run();
    }

    @Override
    public rAZ id_catch() {
        return this.id_break.id_implements();
    }

    @Override
    public boolean id_extends() {
        List<rAp_1> list = this.id_class();
        int n = list.indexOf(this.id_break);
        return n > 0 && !list.get(n - 1).id_catch();
    }

    @Override
    public rgP_2 id_case() {
        return this.id_break.id_break();
    }

    @Override
    public boolean id_implements() {
        return this.id_break.id_case();
    }

    @Override
    public rAl_1 id_protected() {
        return this.id_break.id_byte();
    }

    @Override
    public boolean id_private() {
        return this.id_break.id_catch();
    }

    @Override
    public void id_final() {
        this.id_class(1);
    }

    @Override
    public boolean id_volatile() {
        List<rAp_1> list = this.id_class();
        int n = list.indexOf(this.id_break);
        return n >= 0 && n < list.size() - 1 && !list.get(n + 1).id_catch();
    }

    @Override
    public void id_native() {
        this.id_class(-1);
    }
}

