/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.ZW;
import celestial.Zk_1;
import celestial.cN_2;
import celestial.rRu_1;
import celestial.rgn_3;
import celestial.rpl_3;
import celestial.vm_3;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class ZJ
extends vm_3 {
    private final Consumer<Optional<rRu_1>> id_class;
    private ZW id_throws;
    private final Set<Zk_1> id_case = Sets.newHashSet();
    private LF id_catch;
    private List<rpl_3> id_private;
    private final rRu_1 id_implements;

    public ZJ(rRu_1 rRu_12, Consumer<Optional<rRu_1>> consumer) {
        super(new rgn_3("editGamerule.title"));
        this.id_implements = rRu_12;
        this.id_class = consumer;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_private = null;
        this.id_throws.id_class(ml_1, n, n2, f);
        ZJ.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 20, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
        if (this.id_private != null) {
            this.id_break(ml_1, this.id_private, n, n2);
        }
    }

    public void id_class(Zk_1 zk_1) {
        this.id_case.add(zk_1);
        this.id_finally();
    }

    public void id_break(Zk_1 zk_1) {
        this.id_case.remove(zk_1);
        this.id_finally();
    }

    public void id_break(List<rpl_3> list) {
        this.id_private = list;
    }

    private void id_finally() {
        this.id_catch.id_int = this.id_case.isEmpty();
    }

    @Override
    public void id_volatile() {
        this.id_class.accept(Optional.empty());
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        super.v_();
        this.id_throws = new ZW(this, this.id_implements);
        this.id_native.add(this.id_throws);
        this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int - 29, 150, 20, cN_2.id_protected, lF -> this.id_class.accept(Optional.empty())));
        this.id_catch = this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 29, 150, 20, cN_2.id_byte, lF -> this.id_class.accept(Optional.of(this.id_implements))));
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

