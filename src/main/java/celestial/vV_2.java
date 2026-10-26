/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  org.lwjgl.glfw.GLFW
 */
package celestial;

import celestial.FP;
import celestial.HM;
import celestial.LZ;
import celestial.Ml_1;
import celestial.QF;
import celestial.QY;
import celestial.Qg_1;
import celestial.Qw_1;
import celestial.VW;
import celestial.ZT;
import celestial.Zq_1;
import celestial.cm_3;
import celestial.jI_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.rrJE;
import celestial.rrJG;
import celestial.rrJM;
import celestial.rrJP;
import celestial.rrJS;
import celestial.rrJX;
import celestial.rrJd_1;
import celestial.rrJs_1;
import celestial.rrWl_1;
import celestial.rrXa_1;
import celestial.rrXi_1;
import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.rrkx_1;
import celestial.vm_3;
import celestial.yX_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.glfw.GLFW;

public class vV_2
extends rrJM {
    private vm_3 id_class;
    private Qw_1 id_private;
    private static QF[] id_implements = new QF[]{QF.id_return, QF.id_int, QF.id_this, QF.id_extends, QF.d, QF.P, QF.id_public, QF.id_short, QF.id_native, QF.id_else, QF.rx, QF.rJ};
    private HM id_finally;
    private static final rgP_2 id_else = new rgn_3("options.graphics.fabulous").id_class(rgF_2.ITALIC);
    private static final rgP_2 id_synchronized = new rgn_3("options.graphics.warning.message", id_else, id_else);
    private static final rgP_2 id_return = new rgn_3("options.graphics.warning.title").id_class(rgF_2.RED);
    private static final rgP_2 id_public = new rgn_3("options.graphics.warning.accept");
    private static final rgP_2 id_goto = new rgn_3("options.graphics.warning.cancel");
    private static final rgP_2 id_while = new rgN_2("\n");
    private rrJX id_try = new rrJX(this, new rrJd_1());
    private List<LZ> id_instanceof = this.id_new;
    private LZ id_throw;

    @Override
    protected void id_byte(LZ lZ) {
        if (lZ == this.id_throw) {
            QF.id_public.id_class(this.id_private, -1);
            this.id_native();
        }
    }

    public vV_2(vm_3 vm_32, Qw_1 qw_1) {
        super(new rgn_3("options.videoTitle"));
        this.id_class = vm_32;
        this.id_private = qw_1;
        this.id_finally = this.id_class.id_volatile.id_new();
        this.id_finally.id_implements();
        if (this.id_private.id_case == VW.FABULOUS) {
            this.id_finally.id_throws();
        }
    }

    public static String id_class(FP fP) {
        return fP.id_class.id_private();
    }

    private void id_class(rrXi_1 rrXi_12, int n) {
        if (rrXi_12.id_int) {
            rrJM rrJM2;
            if (rrXi_12.id_class == 200) {
                ((Qw_1)this.id_volatile.id_class[20]).id_break();
                this.id_volatile.id_break(this.id_class);
            }
            if (rrXi_12.id_class == 201) {
                ((Qw_1)this.id_volatile.id_class[20]).id_break();
                rrJM2 = new rrJP(this, this.id_private);
                this.id_volatile.id_break(rrJM2);
            }
            if (rrXi_12.id_class == 202) {
                ((Qw_1)this.id_volatile.id_class[20]).id_break();
                rrJM2 = new rrJE(this, this.id_private);
                this.id_volatile.id_break(rrJM2);
            }
            if (rrXi_12.id_class == 211) {
                ((Qw_1)this.id_volatile.id_class[20]).id_break();
                rrJM2 = new rrXa_1(this, this.id_private);
                this.id_volatile.id_break(rrJM2);
            }
            if (rrXi_12.id_class == 212) {
                ((Qw_1)this.id_volatile.id_class[20]).id_break();
                rrJM2 = new rrJs_1(this, this.id_private);
                this.id_volatile.id_break(rrJM2);
            }
            if (rrXi_12.id_class == 222) {
                ((Qw_1)this.id_volatile.id_class[20]).id_break();
                rrJM2 = new rrJS(this, this.id_private);
                this.id_volatile.id_break(rrJM2);
            }
            if (rrXi_12.id_class == 231) {
                if (rrbb_3.T() || rrbb_3.t()) {
                    rrbb_3.id_byte(rrba_3.id_class("of.message.shaders.aa1"), rrba_3.id_class("of.message.shaders.aa2"));
                    return;
                }
                if (rrbb_3.id_instanceof()) {
                    rrbb_3.id_byte(rrba_3.id_class("of.message.shaders.gf1"), rrba_3.id_class("of.message.shaders.gf2"));
                    return;
                }
                ((Qw_1)this.id_volatile.id_class[20]).id_break();
                rrJM2 = new rrkx_1(this, this.id_private);
                this.id_volatile.id_break(rrJM2);
            }
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        vV_2.id_class(ml_1, (cm_3)this.id_volatile.id_class[15], this.id_extends, this.id_package / 2, 15, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
        this.id_try.id_class(ml_1, n, n2, this.id_instanceof);
    }

    @Override
    protected void id_break(LZ lZ) {
        if (lZ == this.id_throw) {
            this.id_native();
        }
        this.id_finally();
        if (lZ instanceof rrXi_1) {
            rrXi_1 rrXi_12 = (rrXi_1)lZ;
            this.id_class(rrXi_12, 1);
        }
    }

    private void id_finally() {
        if (this.id_finally.id_catch()) {
            String string;
            String string2;
            ArrayList arrayList = Lists.newArrayList((Object[])new rgS_2[]{id_synchronized, id_while});
            String string3 = this.id_finally.id_finally();
            if (string3 != null) {
                arrayList.add(id_while);
                arrayList.add(new rgn_3("options.graphics.warning.renderer", string3).id_class(rgF_2.GRAY));
            }
            if ((string2 = this.id_finally.id_native()) != null) {
                arrayList.add(id_while);
                arrayList.add(new rgn_3("options.graphics.warning.vendor", string2).id_class(rgF_2.GRAY));
            }
            if ((string = this.id_finally.id_extends()) != null) {
                arrayList.add(id_while);
                arrayList.add(new rgn_3("options.graphics.warning.version", string).id_class(rgF_2.GRAY));
            }
            this.id_volatile.id_break(new Zq_1(id_return, arrayList, (ImmutableList<ZT>)ImmutableList.of((Object)new ZT(id_public, lF -> {
                this.id_private.id_case = VW.FABULOUS;
                ((yX_2)QY.id_instanceof().id_class[8]).id_throws();
                this.id_finally.id_throws();
                this.id_volatile.id_break(this);
            }), (Object)new ZT(id_goto, lF -> {
                this.id_finally.id_case();
                this.id_volatile.id_break(this);
            }))));
        }
    }

    private void id_native() {
        this.id_volatile.v();
        Qg_1 qg_1 = this.id_volatile.id_else();
        int n = rrWl_1.id_class(this.id_throw);
        int n2 = rrWl_1.id_break(this.id_throw);
        int n3 = this.id_throw.id_volatile + (n - n2);
        int n4 = this.id_throw.id_final + n2 / 2;
        GLFW.glfwSetCursorPos((long)qg_1.id_implements(), (double)((double)n3 * qg_1.id_return()), (double)((double)n4 * qg_1.id_return()));
    }

    @Override
    public void v_() {
        int n;
        this.id_instanceof.clear();
        for (n = 0; n < id_implements.length; ++n) {
            QF qF = id_implements[n];
            if (qF == null) continue;
            int n2 = this.id_package / 2 - 155 + n % 2 * 160;
            int n3 = this.id_int / 6 + 21 * (n / 2) - 12;
            LZ lZ = this.id_class(qF.id_class((Qw_1)this.id_volatile.id_class[20], n2, n3, 150));
            if (qF != QF.id_public) continue;
            this.id_throw = lZ;
        }
        n = this.id_int / 6 + 21 * (id_implements.length / 2) - 12;
        int n4 = 0;
        n4 = this.id_package / 2 - 155;
        this.id_class(new rrJG(231, n4, n, rrba_3.id_class("of.options.shaders")));
        n4 = this.id_package / 2 - 155 + 160;
        this.id_class(new rrJG(202, n4, n, rrba_3.id_class("of.options.quality")));
        n4 = this.id_package / 2 - 155;
        this.id_class(new rrJG(201, n4, n += 21, rrba_3.id_class("of.options.details")));
        n4 = this.id_package / 2 - 155 + 160;
        this.id_class(new rrJG(212, n4, n, rrba_3.id_class("of.options.performance")));
        n4 = this.id_package / 2 - 155;
        this.id_class(new rrJG(211, n4, n += 21, rrba_3.id_class("of.options.animations")));
        n4 = this.id_package / 2 - 155 + 160;
        this.id_class(new rrJG(222, n4, n, rrba_3.id_class("of.options.other")));
        n += 21;
        this.id_class(new rrXi_1(200, this.id_package / 2 - 100, this.id_int / 6 + 168 + 11, jI_2.id_class("gui.done", new Object[0])));
    }

    @Override
    public void w_() {
        super.w_();
        ((Qw_1)this.id_volatile.id_class[20]).id_break();
    }
}

