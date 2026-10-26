/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.cN_2;
import celestial.mj_3;
import celestial.rVF;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.vm_3;
import java.util.Objects;
import java.util.function.Consumer;

public class mf_3
extends vm_3 {
    private static final rgP_2 id_class = new rgn_3("createWorld.customize.buffet.biome");
    private final vm_3 id_throws;
    private final Consumer<rYG> id_case;
    public final rVF<rYG> id_catch;
    private mj_3 id_private;
    public rYG id_implements;
    private LF id_finally;

    public mf_3(vm_3 vm_32, rVm_1 rVm_12, Consumer<rYG> consumer, rYG rYG2) {
        super(new rgn_3("createWorld.customize.buffet.title"));
        this.id_throws = vm_32;
        this.id_case = consumer;
        this.id_implements = rYG2;
        this.id_catch = rVm_12.id_break(rVL.n);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_protected(0);
        this.id_private.id_class(ml_1, n, n2, f);
        mf_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 8, 0xFFFFFF);
        mf_3.id_class(ml_1, this.id_super, id_class, this.id_package / 2, 28, 0xA0A0A0);
        super.id_class(ml_1, n, n2, f);
    }

    public void id_finally() {
        this.id_finally.id_int = this.id_private.id_finally() != null;
    }

    @Override
    public void id_volatile() {
        this.id_volatile.id_break(this.id_throws);
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_private = new mj_3(this);
        this.id_native.add(this.id_private);
        this.id_finally = this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 28, 150, 20, cN_2.id_byte, lF -> {
            this.id_case.accept(this.id_implements);
            this.id_volatile.id_break(this.id_throws);
        }));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int - 28, 150, 20, cN_2.id_protected, lF -> this.id_volatile.id_break(this.id_throws)));
        this.id_private.id_class(this.id_private.x_().stream().filter(mV_22 -> Objects.equals(mV_22.id_break, this.id_implements)).findFirst().orElse(null));
    }
}

