/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.cN_2;
import celestial.mo_3;
import celestial.rgn_3;
import celestial.rpl_3;
import celestial.va_3;
import celestial.vi_3;
import celestial.vm_3;
import java.util.List;

public class Fr_1
extends vm_3 {
    protected final vm_3 id_class;
    private List<rpl_3> id_case;
    private LF id_catch;
    private LF id_private;
    private LF id_implements;
    private LF id_finally;
    protected Lu_1 id_throws;
    private va_3 id_else;

    public void id_byte(boolean bl) {
        this.id_private.id_int = bl;
        this.id_catch.id_int = bl;
        this.id_implements.id_int = bl;
        this.id_finally.id_int = bl;
    }

    public Fr_1(vm_3 vm_32) {
        super(new rgn_3("selectWorld.title"));
        this.id_class = vm_32;
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        return super.id_class(d, d2, d3);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_case = null;
        this.id_else.id_class(ml_1, n, n2, f);
        this.id_throws.id_class(ml_1, n, n2, f);
        Fr_1.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 8, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
        if (this.id_case != null) {
            this.id_break(ml_1, this.id_case, n, n2);
        }
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        return super.id_class(n, n2, n3) ? true : this.id_throws.id_class(n, n2, n3);
    }

    @Override
    public boolean id_class(char c, int n) {
        return this.id_throws.id_class(c, n);
    }

    public void id_break(List<rpl_3> list) {
        this.id_case = list;
    }

    @Override
    public void id_private() {
        this.id_throws.id_catch();
    }

    @Override
    public void id_volatile() {
        this.id_volatile.id_break(this.id_class);
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_throws = new Lu_1(this.id_super, this.id_package / 2 - 100, 22, 200, 20, this.id_throws, new rgn_3("selectWorld.search"), true);
        this.id_throws.id_class((String string) -> this.id_else.id_class(() -> string, false));
        this.id_else = new va_3(this, this.id_volatile, this.id_package, this.id_int, 48, this.id_int - 64, 36, () -> this.id_throws.id_private(), this.id_else);
        this.id_native.add(this.id_throws);
        this.id_native.add(this.id_else);
        this.id_private = this.id_class(new LF(this.id_package / 2 - 154, this.id_int - 52, 150, 20, new rgn_3("selectWorld.select"), lF -> this.id_else.id_private().ifPresent(vi_3::id_class)));
        this.id_class(new LF(this.id_package / 2 + 4, this.id_int - 52, 150, 20, new rgn_3("selectWorld.create"), lF -> this.id_volatile.id_break(mo_3.id_class(this))));
        this.id_implements = this.id_class(new LF(this.id_package / 2 - 154, this.id_int - 28, 72, 20, new rgn_3("selectWorld.edit"), lF -> this.id_else.id_private().ifPresent(vi_3::id_byte)));
        this.id_catch = this.id_class(new LF(this.id_package / 2 - 76, this.id_int - 28, 72, 20, new rgn_3("selectWorld.delete"), lF -> this.id_else.id_private().ifPresent(vi_3::id_break)));
        this.id_finally = this.id_class(new LF(this.id_package / 2 + 4, this.id_int - 28, 72, 20, new rgn_3("selectWorld.recreate"), lF -> this.id_else.id_private().ifPresent(vi_3::id_protected)));
        this.id_class(new LF(this.id_package / 2 + 82, this.id_int - 28, 72, 20, cN_2.id_protected, lF -> this.id_volatile.id_break(this.id_class)));
        this.id_byte(false);
        this.id_break(this.id_throws);
    }

    @Override
    public void w_() {
        super.w_();
        if (this.id_else != null) {
            this.id_else.x_().forEach(vi_3::close);
        }
    }
}

