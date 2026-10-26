/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.FM;
import celestial.Ff_1;
import celestial.Fv_1;
import celestial.Hd_1;
import celestial.LZ;
import celestial.Ll_1;
import celestial.Ml_1;
import celestial.PX;
import celestial.QY;
import celestial.cb_3;
import celestial.cc_3;
import celestial.iB_2;
import celestial.mB_2;
import celestial.ms_3;
import celestial.pg_3;
import celestial.rJI;
import celestial.rJT;
import celestial.rJY;
import celestial.rXa_1;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class FH
extends cc_3<rJT>
implements mB_2 {
    private static final rqO_2 id_throws = new rqO_2("textures/gui/recipe_button.png");
    private float id_case;
    private float id_catch;
    private final ms_3 id_private = new ms_3();
    private boolean id_implements;
    private boolean id_finally;
    private boolean id_boolean;
    private LZ id_transient;

    public FH(rhd_3 rhd_32) {
        super((rJT)rhd_32.id_implements[3], (rhz_3)rhd_32.id_implements[1], new rgn_3("container.crafting"));
        this.id_continue = true;
        this.id_public = 97;
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_else);
        int n3 = this.id_char;
        int n4 = this.id_abstract;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
        FH.id_class(n3 + 51, n4 + 75, 30, (float)(n3 + 51) - this.id_case, (float)(n4 + 75 - 50) - this.id_catch, (cb_3)this.id_volatile.id_class[57]);
    }

    public static void id_class(int n, int n2, int n3, float f, float f2, iB_2 iB_22) {
        PX pX;
        float f3 = (float)Math.atan(f / 40.0f);
        float f4 = (float)Math.atan(f2 / 40.0f);
        RenderSystem.pushMatrix();
        RenderSystem.translatef(n, n2, 1050.0f);
        RenderSystem.scalef(1.0f, 1.0f, -1.0f);
        Ml_1 ml_1 = new Ml_1();
        ml_1.id_class(0.0, 0.0, 1000.0);
        ml_1.id_class(n3, n3, n3);
        rjY_2 rjY_22 = rje_3.id_case.id_byte(180.0f);
        rjY_2 rjY_23 = rje_3.id_break.id_byte(f4 * 20.0f);
        rjY_22.id_class(rjY_23);
        ml_1.id_class(rjY_22);
        float f5 = ((Float)iB_22.id_private[23]).floatValue();
        float f6 = ((Float)iB_22.id_throws[15]).floatValue();
        float f7 = ((Float)iB_22.id_private[26]).floatValue();
        float f8 = ((Float)iB_22.id_private[27]).floatValue();
        float f9 = ((Float)iB_22.id_private[25]).floatValue();
        Float f10 = Float.valueOf(180.0f + f3 * 20.0f);
        iB_22.id_private[23] = f10;
        Float f11 = Float.valueOf(180.0f + f3 * 40.0f);
        iB_22.id_throws[15] = f11;
        Float f12 = Float.valueOf(-f4 * 20.0f);
        iB_22.id_private[26] = f12;
        Float f13 = Float.valueOf(((Float)iB_22.id_throws[15]).floatValue());
        iB_22.id_private[25] = f13;
        Float f14 = Float.valueOf(((Float)iB_22.id_throws[15]).floatValue());
        iB_22.id_private[27] = f14;
        PX pX2 = pX = iB_22 == (cb_3)FH.id_import.id_class[57] ? ((cb_3)FH.id_import.id_class[57]).id_switch() : null;
        if (iB_22 == (cb_3)FH.id_import.id_class[57]) {
            ((cb_3)FH.id_import.id_class[57]).id_class(new PX(((Float)iB_22.id_throws[15]).floatValue(), ((Float)iB_22.id_private[26]).floatValue()));
        }
        pg_3 pg_32 = QY.id_instanceof().id_case();
        rjY_23.id_throws();
        pg_32.id_class(rjY_23);
        pg_32.id_class(false);
        Hd_1 hd_1 = QY.id_instanceof().id_interface().id_break();
        RenderSystem.runAsFancy(() -> pg_32.id_class(iB_22, 0.0, 0.0, 0.0, 0.0f, 1.0f, ml_1, hd_1, 0xF000F0));
        hd_1.id_break();
        pg_32.id_class(true);
        Float f15 = Float.valueOf(f5);
        iB_22.id_private[23] = f15;
        Float f16 = Float.valueOf(f6);
        iB_22.id_throws[15] = f16;
        Float f17 = Float.valueOf(f7);
        iB_22.id_private[26] = f17;
        Float f18 = Float.valueOf(f8);
        iB_22.id_private[27] = f18;
        Float f19 = Float.valueOf(f9);
        iB_22.id_private[25] = f19;
        if (pX != null) {
            ((cb_3)FH.id_import.id_class[57]).id_class(pX);
        }
        RenderSystem.popMatrix();
    }

    @Override
    protected boolean id_class(int n, int n2, int n3, int n4, double d, double d2) {
        return (!this.id_finally || !this.id_private.id_private()) && super.id_class(n, n2, n3, n4, d, d2);
    }

    @Override
    public void id_class() {
        this.id_private.id_finally();
    }

    @Override
    protected boolean id_class(double d, double d2, int n, int n2, int n3) {
        boolean bl = d < (double)n || d2 < (double)n2 || d >= (double)(n + this.id_synchronized) || d2 >= (double)(n2 + this.id_return);
        return this.id_private.id_class(d, d2, this.id_char, this.id_abstract, this.id_synchronized, this.id_return, n3) && bl;
    }

    @Override
    public void id_class(rJY rJY2, int n, int n2, rXa_1 rXa_12) {
        super.id_class(rJY2, n, n2, rXa_12);
        this.id_private.id_class(rJY2);
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        if (this.id_boolean) {
            this.id_boolean = false;
            return true;
        }
        return super.id_class(d, d2, n);
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2) {
        this.id_super.id_byte(ml_1, this.id_extends, this.id_public, this.id_goto, 0x404040);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        boolean bl = this.id_class = !this.id_private.id_private();
        if (this.id_private.id_private() && this.id_finally) {
            this.id_class(ml_1, f, n, n2);
            this.id_private.id_class(ml_1, n, n2, f);
        } else {
            this.id_private.id_class(ml_1, n, n2, f);
            super.id_class(ml_1, n, n2, f);
            this.id_private.id_class(ml_1, this.id_char, this.id_abstract, false, f);
        }
        this.id_break(ml_1, n, n2);
        this.id_private.id_byte(ml_1, this.id_char, this.id_abstract, n, n2);
        this.id_case = n;
        this.id_catch = n2;
    }

    @Override
    public ms_3 id_break() {
        return this.id_private;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (this.id_private.id_break(d, d2, n)) {
            this.id_class(this.id_private);
            return true;
        }
        return (!this.id_finally || !this.id_private.id_private()) && super.id_break(d, d2, n);
    }

    @Override
    public boolean id_finally() {
        return true;
    }

    @Override
    public void id_private() {
        super.id_private();
        if (((Ax_1)this.id_volatile.id_class[55]).id_catch()) {
            this.id_volatile.id_break(new Fv_1((cb_3)this.id_volatile.id_class[57]));
        } else {
            this.id_private.id_implements();
        }
    }

    @Override
    public void id_final() {
        super.id_final();
        this.id_private.id_class(this.id_package, this.id_int, this.id_volatile, this.id_finally, (rJI)this.id_instanceof);
        this.id_implements = true;
        this.id_char = this.id_private.id_class(this.id_finally, this.id_package, this.id_synchronized);
    }

    @Override
    public List<LZ> id_native() {
        ArrayList<LZ> arrayList = new ArrayList<LZ>();
        this.id_transient = new Ff_1(this, this.id_char + this.id_synchronized / 2 - 50, this.id_abstract - 23, 100, 20, lF -> this.id_class(FM.DROP_ALL)).id_finally(false);
        arrayList.add(this.id_transient);
        return arrayList;
    }

    @Override
    protected void v_() {
        if (((Ax_1)this.id_volatile.id_class[55]).id_catch()) {
            this.id_volatile.id_break(new Fv_1((cb_3)this.id_volatile.id_class[57]));
        } else {
            super.v_();
            this.id_finally = this.id_package < 379;
            this.id_native.add(this.id_private);
            this.id_break(this.id_private);
            this.id_class(new Ll_1(this.id_char + 104, this.id_int / 2 - 22, 20, 18, 0, 0, 19, id_throws, lF -> {
                this.id_private.id_class(this.id_finally);
                this.id_private.id_catch();
                this.id_char = this.id_private.id_class(this.id_finally, this.id_package, this.id_synchronized);
                ((Ll_1)lF).id_class(this.id_char + 104, this.id_int / 2 - 22);
                this.id_boolean = true;
                this.id_transient.id_volatile = this.id_char + this.id_synchronized / 2 - 50;
            }));
        }
    }

    @Override
    public void w_() {
        super.w_();
        if (this.id_implements) {
            this.id_private.id_case();
        }
    }
}

