/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.Zl_1;
import celestial.cN_2;
import celestial.mR_2;
import celestial.mY_2;
import celestial.mo_3;
import celestial.rKN;
import celestial.rKQ;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.vm_3;
import java.util.List;
import java.util.function.Consumer;

public class mg_3
extends vm_3 {
    protected final mo_3 id_class;
    private final Consumer<rKQ> id_throws;
    public rKQ id_case;
    private rgP_2 id_catch;
    private rgP_2 id_private;
    private mR_2 id_implements;
    private LF id_finally;

    public mg_3(mo_3 mo_32, Consumer<rKQ> consumer, rKQ rKQ2) {
        super(new rgn_3("createWorld.customize.flat.title"));
        this.id_class = mo_32;
        this.id_throws = consumer;
        this.id_case = rKQ2;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_implements.id_class(ml_1, n, n2, f);
        mg_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 8, 0xFFFFFF);
        int n3 = this.id_package / 2 - 92 - 16;
        mg_3.id_break(ml_1, this.id_super, this.id_catch, n3, 32, 0xFFFFFF);
        mg_3.id_break(ml_1, this.id_super, this.id_private, n3 + 2 + 213 - this.id_super.id_class(this.id_private), 32, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    public void id_class(rKQ rKQ2) {
        this.id_case = rKQ2;
    }

    public rKQ id_finally() {
        return this.id_case;
    }

    private boolean id_final() {
        return this.id_implements.id_finally() != null;
    }

    @Override
    public void id_volatile() {
        this.id_volatile.id_break(this.id_class);
    }

    public void id_native() {
        this.id_finally.id_int = this.id_final();
    }

    @Override
    protected void v_() {
        this.id_catch = new rgn_3("createWorld.customize.flat.tile");
        this.id_private = new rgn_3("createWorld.customize.flat.height");
        this.id_implements = new mR_2(this);
        this.id_native.add(this.id_implements);
        this.id_finally = this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 52, 150, 20, new rgn_3("createWorld.customize.flat.removeLayer"), lF -> {
            if (this.id_final()) {
                List<rKN> list = this.id_case.id_case();
                int n = this.id_implements.x_().indexOf(this.id_implements.id_finally());
                int n2 = list.size() - n - 1;
                list.remove(n2);
                this.id_implements.id_class(list.isEmpty() ? null : (mY_2)this.id_implements.x_().get(Math.min(n, list.size() - 1)));
                this.id_case.id_private();
                this.id_implements.id_throws();
                this.id_native();
            }
        }));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int - 52, 150, 20, new rgn_3("createWorld.customize.presets"), lF -> {
            this.id_volatile.id_break(new Zl_1(this));
            this.id_case.id_private();
            this.id_native();
        }));
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 28, 150, 20, cN_2.id_byte, lF -> {
            this.id_throws.accept(this.id_case);
            this.id_volatile.id_break(this.id_class);
            this.id_case.id_private();
        }));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int - 28, 150, 20, cN_2.id_protected, lF -> {
            this.id_volatile.id_break(this.id_class);
            this.id_case.id_private();
        }));
        this.id_case.id_private();
        this.id_native();
    }
}

