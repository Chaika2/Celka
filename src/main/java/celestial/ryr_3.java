/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.Qs_1;
import celestial.Wp_1;
import celestial.an_3;
import celestial.iG_2;
import celestial.rHK;
import celestial.rHf_1;
import celestial.rJV;
import celestial.rJr_1;
import celestial.rRg_1;
import celestial.rXC;
import celestial.rXF;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rjw_3;
import celestial.rpG_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rqs_3;
import celestial.rxL_2;
import celestial.ryB_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ryr_3
extends rHK
implements rHf_1,
rXF {
    private static final int[] id_class = IntStream.range(0, 27).toArray();
    private rqs_3<rdn_3> id_break = rqs_3.id_class(27, rdn_3.id_break);
    private int id_byte;
    private ryB_2 id_case = ryB_2.CLOSED;
    private float id_catch;
    private float id_private;
    @Nullable
    private rxL_2 id_implements;
    private boolean id_finally;

    public ryr_3(@Nullable rxL_2 rxL_22) {
        super(ryW_2.id_return);
        this.id_implements = rxL_22;
    }

    public ryr_3() {
        this((rxL_2)null);
        this.id_finally = true;
    }

    @Override
    protected void id_class(rqs_3<rdn_3> rqs_32) {
        this.id_break = rqs_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_protected(rcd_32);
    }

    public float id_class(float f) {
        return rfU_2.id_catch(f, this.id_private, this.id_catch);
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32, @Nullable rpr_3 rpr_32) {
        return !(xd_3.id_class(rdn_32.id_break()) instanceof Wp_1);
    }

    @Override
    public int[] id_class(rpr_3 rpr_32) {
        return id_class;
    }

    @Override
    protected rJr_1 id_class(int n, rhz_3 rhz_32) {
        return new rJV(n, rhz_32, this);
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        return this.id_throws(rcd_32);
    }

    public rfl_3 id_class(xc_3 xc_32, float f) {
        return this.id_class(xc_32.id_byte(Wp_1.id_volatile), f);
    }

    public rfl_3 id_class(rpr_3 rpr_32, float f) {
        float f2 = this.id_class(f);
        return rjw_3.id_break().id_class().id_break(0.5f * f2 * (float)rpr_32.id_implements(), 0.5f * f2 * (float)rpr_32.id_finally(), 0.5f * f2 * (float)rpr_32.id_extends());
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        if (!rhd_32.id_native()) {
            --this.id_byte;
            this.id_extends.id_class(this.id_native, this.id_abstract().id_break(), 1, this.id_byte);
            if (this.id_byte <= 0) {
                this.id_extends.id_class((rhd_3)null, this.id_native, rqn_3.JO, rqL_2.BLOCKS, 0.5f, this.id_extends.id_int.nextFloat() * 0.1f + 0.9f);
            }
        }
    }

    @Override
    public boolean id_break(int n, rdn_3 rdn_32, rpr_3 rpr_32) {
        return true;
    }

    private rfl_3 id_break(rpr_3 rpr_32, float f) {
        rpr_3 rpr_33 = rpr_32.id_case();
        return this.id_class(rpr_32, f).id_class(rpr_33.id_implements(), rpr_33.id_finally(), rpr_33.id_extends());
    }

    public rcd_3 id_throws(rcd_3 rcd_32) {
        if (!this.id_byte(rcd_32)) {
            rXC.id_class(rcd_32, this.id_break, false);
        }
        return rcd_32;
    }

    @Override
    public void id_throws() {
        this.id_catch();
        if (this.id_case == ryB_2.OPENING || this.id_case == ryB_2.CLOSING) {
            this.id_native();
        }
    }

    @Nullable
    public rxL_2 id_finally() {
        if (this.id_finally) {
            this.id_implements = Wp_1.id_class(this.id_abstract().id_break());
            this.id_finally = false;
        }
        return this.id_implements;
    }

    protected void id_catch() {
        this.id_private = this.id_catch;
        switch (this.id_case) {
            case CLOSED: {
                this.id_catch = 0.0f;
                break;
            }
            case OPENING: {
                this.id_catch += 0.1f;
                if (!(this.id_catch >= 1.0f)) break;
                this.id_native();
                this.id_case = ryB_2.OPENED;
                this.id_catch = 1.0f;
                this.id_volatile();
                break;
            }
            case CLOSING: {
                this.id_catch -= 0.1f;
                if (!(this.id_catch <= 0.0f)) break;
                this.id_case = ryB_2.CLOSED;
                this.id_catch = 0.0f;
                this.id_volatile();
                break;
            }
            case OPENED: {
                this.id_catch = 1.0f;
            }
        }
    }

    public boolean id_extends() {
        return this.id_case == ryB_2.CLOSED;
    }

    @Override
    public int id_else() {
        return this.id_break.size();
    }

    public void id_protected(rcd_3 rcd_32) {
        this.id_break = rqs_3.id_class(this.id_else(), rdn_3.id_break);
        if (!this.id_break(rcd_32) && rcd_32.id_byte("Items", 9)) {
            rXC.id_break(rcd_32, this.id_break);
        }
    }

    public ryB_2 id_private() {
        return this.id_case;
    }

    private void id_volatile() {
        this.id_abstract().id_class((rRg_1)this.id_while(), this.id_char(), 3);
    }

    private void id_native() {
        rpr_3 rpr_32;
        rfl_3 rfl_32;
        List<an_3> list;
        xc_3 xc_32 = this.id_extends.id_byte(this.id_char());
        if (xc_32.id_break() instanceof Wp_1 && !(list = this.id_extends.id_class((an_3)null, rfl_32 = this.id_break(rpr_32 = xc_32.id_byte(Wp_1.id_volatile), 1.0f).id_class(this.id_native))).isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                an_3 an_32 = list.get(i);
                if (an_32.r_() == Qs_1.IGNORE) continue;
                double d = 0.0;
                double d2 = 0.0;
                double d3 = 0.0;
                rfl_3 rfl_33 = an_32.rN();
                switch (rpr_32.id_final()) {
                    case X: {
                        d = rpr_32.id_throws() == rpG_2.POSITIVE ? rfl_32.id_protected - rfl_33.id_class : rfl_33.id_protected - rfl_32.id_class;
                        d += 0.01;
                        break;
                    }
                    case Y: {
                        d2 = rpr_32.id_throws() == rpG_2.POSITIVE ? rfl_32.id_throws - rfl_33.id_break : rfl_33.id_throws - rfl_32.id_break;
                        d2 += 0.01;
                        break;
                    }
                    case Z: {
                        d3 = rpr_32.id_throws() == rpG_2.POSITIVE ? rfl_32.id_case - rfl_33.id_byte : rfl_33.id_case - rfl_32.id_byte;
                        d3 += 0.01;
                    }
                }
                an_32.id_class(iG_2.SHULKER_BOX, new rjU_2(d * (double)rpr_32.id_implements(), d2 * (double)rpr_32.id_finally(), d3 * (double)rpr_32.id_extends()));
            }
        }
    }

    @Override
    public boolean a_(int n, int n2) {
        if (n == 1) {
            this.id_byte = n2;
            if (n2 == 0) {
                this.id_case = ryB_2.CLOSING;
                this.id_volatile();
            }
            if (n2 == 1) {
                this.id_case = ryB_2.OPENING;
                this.id_volatile();
            }
            return true;
        }
        return super.a_(n, n2);
    }

    @Override
    protected rqs_3<rdn_3> ad_() {
        return this.id_break;
    }

    @Override
    public void b_(rhd_3 rhd_32) {
        if (!rhd_32.id_native()) {
            if (this.id_byte < 0) {
                this.id_byte = 0;
            }
            ++this.id_byte;
            this.id_extends.id_class(this.id_native, this.id_abstract().id_break(), 1, this.id_byte);
            if (this.id_byte == 1) {
                this.id_extends.id_class((rhd_3)null, this.id_native, rqn_3.Jh, rqL_2.BLOCKS, 0.5f, this.id_extends.id_int.nextFloat() * 0.1f + 0.9f);
            }
        }
    }

    @Override
    protected rgP_2 X_() {
        return new rgn_3("container.shulkerBox");
    }
}

