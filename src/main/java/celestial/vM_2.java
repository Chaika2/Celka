/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.LF;
import celestial.LH;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.ZP;
import celestial.ZU;
import celestial.cJ_2;
import celestial.cN_2;
import celestial.gm_3;
import celestial.mC_2;
import celestial.mI_2;
import celestial.mT_2;
import celestial.rAO;
import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rRO;
import celestial.rZP;
import celestial.rZZ;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.vO_2;
import celestial.vV_2;
import celestial.vk_3;
import celestial.vm_3;
import com.google.common.collect.ImmutableList;

public class vM_2
extends vm_3 {
    private static final QF[] id_class = new QF[]{QF.id_implements};
    private final vm_3 id_throws;
    private final Qw_1 id_case;
    private LF id_catch;
    private LH id_private;
    private rRO id_implements;

    private void id_byte(boolean bl) {
        this.id_volatile.id_break(this);
        if (bl && (gm_3)this.id_volatile.id_class[56] != null) {
            this.id_volatile.id_void().id_class(new rZP(true));
            this.id_private.id_byte(true);
            this.id_private.id_int = false;
            this.id_catch.id_int = false;
        }
    }

    public vM_2(vm_3 vm_32, Qw_1 qw_1) {
        super(new rgn_3("options.title"));
        this.id_throws = vm_32;
        this.id_case = qw_1;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        vM_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 15, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    private rgP_2 id_class(rRO rRO2) {
        return new rgn_3("options.difficulty").id_break(": ").id_class(rRO2.id_break());
    }

    private void id_class(rAt_1 rAt_12) {
        ImmutableList immutableList = ImmutableList.copyOf(this.id_case.id_private);
        this.id_case.id_private.clear();
        this.id_case.id_implements.clear();
        for (rAp_1 rAp_12 : rAt_12.id_throws()) {
            if (rAp_12.id_catch()) continue;
            this.id_case.id_private.add(rAp_12.id_throws());
            if (rAp_12.id_byte().id_class()) continue;
            this.id_case.id_implements.add(rAp_12.id_throws());
        }
        this.id_case.id_break();
        ImmutableList immutableList2 = ImmutableList.copyOf(this.id_case.id_private);
        if (!immutableList2.equals(immutableList)) {
            this.id_volatile.id_private();
        }
    }

    @Override
    protected void v_() {
        int n = 0;
        for (QF qF : id_class) {
            int n2 = this.id_package / 2 - 155 + n % 2 * 160;
            int n3 = this.id_int / 6 - 12 + 24 * (n >> 1);
            this.id_class(qF.id_class((Qw_1)this.id_volatile.id_class[20], n2, n3, (gm_3)this.id_volatile.id_class[56] != null ? 150 : 310));
            ++n;
        }
        if ((gm_3)this.id_volatile.id_class[56] != null) {
            this.id_implements = ((gm_3)this.id_volatile.id_class[56]).id_abstract();
            this.id_catch = this.id_class(new LF(this.id_package / 2 - 155 + n % 2 * 160, this.id_int / 6 - 12 + 24 * (n >> 1), 150, 20, this.id_class(this.id_implements), lF -> {
                this.id_implements = rRO.id_class(this.id_implements.id_class() + 1);
                this.id_volatile.id_void().id_class(new rZZ(this.id_implements));
                this.id_catch.id_break(this.id_class(this.id_implements));
            }));
            if (this.id_volatile.id_finally() && !((gm_3)this.id_volatile.id_class[56]).id_synchronized().id_implements()) {
                this.id_catch.id_int(this.id_catch.id_case() - 20);
                this.id_private = this.id_class(new LH(this.id_catch.id_volatile + this.id_catch.id_case(), this.id_catch.id_final, lF -> this.id_volatile.id_break(new mT_2(this::id_byte, new rgn_3("difficulty.lock.title"), new rgn_3("difficulty.lock.question", new rgn_3("options.difficulty." + ((gm_3)this.id_volatile.id_class[56]).id_synchronized().id_extends().id_byte()))))));
                this.id_private.id_byte(((gm_3)this.id_volatile.id_class[56]).id_synchronized().id_native());
                this.id_private.id_int = !this.id_private.id_private();
                this.id_catch.id_int = !this.id_private.id_private();
            } else {
                this.id_catch.id_int = false;
            }
        }
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 6 + 48 - 6, 150, 20, new rgn_3("options.skinCustomisation"), lF -> this.id_volatile.id_break(new ZP(this, this.id_case))));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int / 6 + 48 - 6, 150, 20, new rgn_3("options.sounds"), lF -> this.id_volatile.id_break(new vO_2(this, this.id_case))));
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 6 + 72 - 6, 150, 20, new rgn_3("options.video"), lF -> this.id_volatile.id_break(new vV_2(this, this.id_case))));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int / 6 + 72 - 6, 150, 20, new rgn_3("options.controls"), lF -> this.id_volatile.id_break(new mI_2(this, this.id_case))));
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 6 + 96 - 6, 150, 20, new rgn_3("options.language"), lF -> this.id_volatile.id_break(new ZU((vm_3)this, this.id_case, this.id_volatile.u()))));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int / 6 + 96 - 6, 150, 20, new rgn_3("options.chat.title"), lF -> this.id_volatile.id_break(new mC_2(this, this.id_case))));
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 6 + 120 - 6, 150, 20, new rgn_3("options.resourcepack"), lF -> {
            vk_3 vk_32 = new vk_3(this, this.id_volatile.id_char(), this::id_class, this.id_volatile.h(), new rgn_3("resourcePack.title"));
            this.id_volatile.id_break(new rAO(vk_32));
        }));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int / 6 + 120 - 6, 150, 20, new rgn_3("options.accessibility.title"), lF -> this.id_volatile.id_break(new cJ_2(this, this.id_case))));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 6 + 168, 200, 20, cN_2.id_byte, lF -> this.id_volatile.id_break(this.id_throws)));
    }

    @Override
    public void w_() {
        super.w_();
        this.id_case.id_break();
    }
}

