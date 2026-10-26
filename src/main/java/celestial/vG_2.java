/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.AQ;
import celestial.AZ;
import celestial.Ak_1;
import celestial.Am_1;
import celestial.Au_1;
import celestial.Av_1;
import celestial.LF;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.cN_2;
import celestial.jI_2;
import celestial.mT_2;
import celestial.mt_3;
import celestial.mz_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rrjC_2;
import celestial.rrwm_3;
import celestial.rrwp_3;
import celestial.vA_2;
import celestial.vC_2;
import celestial.vF_2;
import celestial.vL_2;
import celestial.vm_3;
import celestial.vn_3;
import celestial.vv_3;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vG_2
extends vm_3 {
    private static final Logger id_throws = LogManager.getLogger();
    private final Av_1 id_case = new Av_1();
    private final vm_3 id_catch;
    protected vF_2 id_class;
    private AQ id_private;
    private LF id_implements;
    private LF id_finally;
    private LF id_else;
    private List<rgP_2> id_synchronized;
    private Ak_1 id_return;
    private Am_1 id_public;
    private Au_1 id_goto;
    private boolean id_while;

    private void id_byte(boolean bl) {
        vL_2 vL_22 = (vL_2)this.id_class.id_finally();
        if (bl && vL_22 instanceof vC_2) {
            vC_2 vC_22 = (vC_2)vL_22;
            this.id_private.id_class(vC_22.id_break());
            this.id_private.id_break();
            this.id_class.id_class((vL_2)null);
            this.id_class.id_class(this.id_private);
        }
        this.id_volatile.id_break(this);
    }

    private void id_int() {
        this.id_volatile.id_break(new vG_2(this.id_catch));
    }

    public vG_2(vm_3 vm_32) {
        super(new rgn_3("multiplayer.title"));
        this.id_catch = vm_32;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if (n == 294) {
            this.id_int();
            return true;
        }
        if (this.id_class.id_finally() != null) {
            if (n != 257 && n != 335) {
                return this.id_class.id_class(n, n2, n3);
            }
            this.id_finally();
            return true;
        }
        return false;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_synchronized = null;
        this.id_class(ml_1);
        this.id_class.id_class(ml_1, n, n2, f);
        vG_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 20, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
        if (this.id_synchronized != null) {
            this.id_class(ml_1, this.id_synchronized, n, n2);
        }
    }

    private void id_class(Ak_1 ak_1) {
        this.id_volatile.id_break(new mt_3(this, this.id_volatile, ak_1));
    }

    public void id_class(List<rgP_2> list) {
        this.id_synchronized = list;
    }

    public void id_class(vL_2 vL_22) {
        this.id_class.id_class(vL_22);
        this.id_native();
    }

    private void id_throws(boolean bl) {
        if (bl) {
            this.id_private.id_break(this.id_return);
            this.id_private.id_break();
            this.id_class.id_class((vL_2)null);
            this.id_class.id_class(this.id_private);
        }
        this.id_volatile.id_break(this);
    }

    public void id_finally() {
        vL_2 vL_22 = (vL_2)this.id_class.id_finally();
        if (vL_22 instanceof vC_2) {
            this.id_class(((vC_2)vL_22).id_break());
        } else if (vL_22 instanceof vA_2) {
            AZ aZ = ((vA_2)vL_22).id_class();
            this.id_class(new Ak_1(aZ.id_class(), aZ.id_break(), true));
        }
    }

    private void id_case(boolean bl) {
        if (bl) {
            this.id_class(this.id_return);
        } else {
            this.id_volatile.id_break(this);
        }
    }

    public AQ id_package() {
        return this.id_private;
    }

    private void id_protected(boolean bl) {
        vL_2 vL_22 = (vL_2)this.id_class.id_finally();
        if (bl && vL_22 instanceof vC_2) {
            Ak_1 ak_1 = ((vC_2)vL_22).id_break();
            ak_1.id_class = this.id_return.id_class;
            ak_1.id_break = this.id_return.id_break;
            ak_1.id_class(this.id_return);
            this.id_private.id_break();
            this.id_class.id_class(this.id_private);
        }
        this.id_volatile.id_break(this);
    }

    @Override
    public void id_private() {
        super.id_private();
        if (this.id_public.id_class()) {
            List<AZ> list = this.id_public.id_byte();
            this.id_public.id_break();
            this.id_class.id_class(list);
        }
        this.id_case.id_class();
    }

    public Av_1 id_final() {
        return this.id_case;
    }

    protected void id_native() {
        this.id_finally.id_int = false;
        this.id_implements.id_int = false;
        this.id_else.id_int = false;
        vL_2 vL_22 = (vL_2)this.id_class.id_finally();
        if (vL_22 != null && !(vL_22 instanceof vn_3)) {
            this.id_finally.id_int = true;
            if (vL_22 instanceof vC_2) {
                vC_2 vC_22 = (vC_2)vL_22;
                this.id_implements.id_int = true;
                this.id_else.id_int = !(vC_22.id_break() instanceof rrwp_3);
            }
        }
    }

    @Override
    protected void v_() {
        super.v_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        if (this.id_while) {
            this.id_class.id_break(this.id_package, this.id_int, 32, this.id_int - 64);
        } else {
            this.id_while = true;
            this.id_private = new AQ(this.id_volatile);
            this.id_private.id_class();
            this.id_public = new Am_1();
            try {
                this.id_goto = new Au_1(this.id_public);
                this.id_goto.start();
            }
            catch (Exception exception) {
                id_throws.warn("Unable to start LAN server detection: {}", (Object)exception.getMessage());
            }
            this.id_class = new vF_2(this, this.id_volatile, this.id_package, this.id_int, 32, this.id_int - 64, 36);
            this.id_class.id_class(this.id_private);
        }
        rrwm_3.id_class(this);
        this.id_native.add(this.id_class);
        this.id_finally = this.id_class(new LF(this.id_package / 2 - 154, this.id_int - 52, 100, 20, new rgn_3("selectServer.select"), lF -> this.id_finally()));
        this.id_class(new LF(this.id_package / 2 - 50, this.id_int - 52, 100, 20, new rgn_3("selectServer.direct"), lF -> {
            this.id_return = new Ak_1(jI_2.id_class("selectServer.defaultName", new Object[0]), "", false);
            this.id_volatile.id_break(new vv_3(this, this::id_case, this.id_return));
        }));
        this.id_class(new LF(this.id_package / 2 + 4 + 50, this.id_int - 52, 100, 20, new rgn_3("selectServer.add"), lF -> {
            this.id_return = new Ak_1(jI_2.id_class("selectServer.defaultName", new Object[0]), "", false);
            this.id_volatile.id_break(new mz_3(this, this::id_throws, this.id_return));
        }));
        this.id_implements = this.id_class(new LF(this.id_package / 2 - 154, this.id_int - 28, 70, 20, new rgn_3("selectServer.edit"), lF -> {
            vL_2 vL_22 = (vL_2)this.id_class.id_finally();
            if (vL_22 instanceof vC_2) {
                Ak_1 ak_1 = ((vC_2)vL_22).id_break();
                if (ak_1 instanceof rrwp_3) {
                    rrwp_3 rrwp_32 = (rrwp_3)ak_1;
                    this.id_return = rrwp_32.id_catch();
                    this.id_return.id_class(rrwp_32);
                } else {
                    this.id_return = new Ak_1(ak_1.id_class, ak_1.id_break, false);
                    this.id_return.id_class(ak_1);
                }
                this.id_volatile.id_break(new mz_3(this, this::id_protected, this.id_return));
            }
        }));
        this.id_else = this.id_class(new LF(this.id_package / 2 - 74, this.id_int - 28, 70, 20, new rgn_3("selectServer.delete"), lF -> {
            String string;
            vL_2 vL_22 = (vL_2)this.id_class.id_finally();
            if (vL_22 instanceof vC_2 && (string = ((vC_2)vL_22).id_break().id_class) != null) {
                rgn_3 rgn_32 = new rgn_3("selectServer.deleteQuestion");
                rgn_3 rgn_33 = new rgn_3("selectServer.deleteWarning", string);
                rgn_3 rgn_34 = new rgn_3("selectServer.deleteButton");
                rgP_2 rgP_22 = cN_2.id_protected;
                this.id_volatile.id_break(new mT_2(this::id_byte, rgn_32, rgn_33, rgn_34, rgP_22));
            }
        }));
        this.id_class(new LF(this.id_package / 2 + 4, this.id_int - 28, 70, 20, new rgn_3("selectServer.refresh"), lF -> this.id_int()));
        this.id_class(new LF(this.id_package / 2 + 4 + 76, this.id_int - 28, 75, 20, cN_2.id_protected, lF -> this.id_volatile.id_break(this.id_catch)));
        this.id_class(rrjC_2.id_protected().id_byte());
        this.id_native();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
        if (this.id_goto != null) {
            this.id_goto.interrupt();
            this.id_goto = null;
        }
        this.id_case.id_break();
    }
}

