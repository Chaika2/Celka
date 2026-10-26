/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.cm_3;
import celestial.jI_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpl_3;
import celestial.rrJM;
import celestial.rrXi_1;
import celestial.rrbb_3;
import celestial.vm_3;
import com.google.common.collect.Lists;
import java.util.List;

public class rrJB
extends rrJM {
    private final vm_3 id_private;
    private rgP_2 id_implements;
    private rgP_2 id_finally;
    private final List<rpl_3> id_else = Lists.newArrayList();
    protected String id_class;
    private int id_synchronized;

    public rrJB(vm_3 vm_32, String string, String string2) {
        super(new rgn_3("of.options.detailsTitle"));
        this.id_private = vm_32;
        this.id_implements = new rgN_2(string);
        this.id_finally = new rgN_2(string2);
        this.id_class = jI_2.id_class("gui.done", new Object[0]);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        rrJB.id_class(ml_1, this.id_case, this.id_implements, this.id_package / 2, 70, 0xFFFFFF);
        int n3 = 90;
        for (rpl_3 rpl_32 : this.id_else) {
            rrJB.id_class(ml_1, this.id_case, rpl_32, this.id_package / 2, n3, 0xFFFFFF);
            n3 += 9;
        }
        super.id_class(ml_1, n, n2, f);
    }

    public void id_break(int n) {
        this.id_synchronized = n;
        for (LZ lZ : this.id_throws) {
            lZ.id_int = false;
        }
    }

    @Override
    protected void id_break(LZ lZ) {
        rrbb_3.X().id_break(this.id_private);
    }

    @Override
    public void id_private() {
        super.id_private();
        if (--this.id_synchronized == 0) {
            for (LZ lZ : this.id_throws) {
                lZ.id_int = true;
            }
        }
    }

    @Override
    public void v_() {
        this.id_class(new rrXi_1(0, this.id_package / 2 - 100, this.id_int / 6 + 96, this.id_class));
        this.id_else.clear();
        this.id_else.addAll(((cm_3)this.id_volatile.id_class[15]).id_break(this.id_finally, this.id_package - 50));
    }
}

