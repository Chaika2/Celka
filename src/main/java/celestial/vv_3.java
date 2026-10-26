/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
package celestial;

import celestial.Ak_1;
import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.Qw_1;
import celestial.cN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.vm_3;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class vv_3
extends vm_3 {
    private static final rgP_2 id_class = new rgn_3("addServer.enterIp");
    private LF id_throws;
    private final Ak_1 id_case;
    private Lu_1 id_catch;
    private final BooleanConsumer id_private;
    private final vm_3 id_implements;

    public vv_3(vm_3 vm_32, BooleanConsumer booleanConsumer, Ak_1 ak_1) {
        super(new rgn_3("selectServer.direct"));
        this.id_implements = vm_32;
        this.id_case = ak_1;
        this.id_private = booleanConsumer;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        vv_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 20, 0xFFFFFF);
        vv_3.id_break(ml_1, this.id_super, id_class, this.id_package / 2 - 100, 100, 0xA0A0A0);
        this.id_catch.id_class(ml_1, n, n2, f);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (this.id_catch() != this.id_catch || n != 257 && n != 335) {
            return super.id_class(n, n2, n3);
        }
        this.id_finally();
        return true;
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_catch.id_private();
        this.id_break(qY, n, n2);
        this.id_catch.id_class(string);
    }

    private void id_finally() {
        this.id_case.id_break = this.id_catch.id_private();
        this.id_private.accept(true);
    }

    @Override
    public void id_private() {
        this.id_catch.id_catch();
    }

    @Override
    public void id_volatile() {
        this.id_volatile.id_break(this.id_implements);
    }

    private void id_native() {
        String string = this.id_catch.id_private();
        this.id_throws.id_int = !string.isEmpty() && string.split(":").length > 0 && string.indexOf(32) == -1;
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_throws = this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 96 + 12, 200, 20, new rgn_3("selectServer.select"), lF -> this.id_finally()));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120 + 12, 200, 20, cN_2.id_protected, lF -> this.id_private.accept(false)));
        this.id_catch = new Lu_1(this.id_super, this.id_package / 2 - 100, 116, 200, 20, new rgn_3("addServer.enterIp"));
        this.id_catch.id_implements(128);
        this.id_catch.id_byte(true);
        this.id_catch.id_class(((Qw_1)this.id_volatile.id_class[20]).K);
        this.id_catch.id_class((String string) -> this.id_native());
        this.id_native.add(this.id_catch);
        this.id_break(this.id_catch);
        this.id_native();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
        ((Qw_1)this.id_volatile.id_class[20]).K = this.id_catch.id_private();
        ((Qw_1)this.id_volatile.id_class[20]).id_break();
    }
}

