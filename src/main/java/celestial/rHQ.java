/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAr_1;
import celestial.rHD;
import celestial.rHN;
import celestial.rHf_1;
import celestial.rJr_1;
import celestial.rXC;
import celestial.rXF;
import celestial.rXf_1;
import celestial.rXn_1;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpF_2;
import celestial.rpr_3;
import celestial.rqs_3;
import celestial.ryW_2;
import celestial.xZ_2;
import celestial.xc_3;
import java.util.Arrays;

public class rHQ
extends rHD
implements rHf_1,
rXF {
    private static final int[] id_break = new int[]{3};
    private static final int[] id_byte = new int[]{0, 1, 2, 3};
    private static final int[] id_protected = new int[]{0, 1, 2, 4};
    private rqs_3<rdn_3> id_throws = rqs_3.id_class(5, rdn_3.id_break);
    public int id_case;
    private boolean[] id_catch;
    private rdb_3 id_private;
    public int id_implements;
    protected final rpF_2 id_class = new rHN(this);

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        if (this.id_extends.id_class(this.id_native) != this) {
            return false;
        }
        return !(rhd_32.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5) > 64.0);
    }

    public rHQ() {
        super(ryW_2.id_extends);
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_throws = rqs_3.id_class(this.id_else(), rdn_3.id_break);
        rXC.id_break(rcd_32, this.id_throws);
        this.id_case = rcd_32.id_catch("BrewTime");
        this.id_implements = rcd_32.id_case("Fuel");
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("BrewTime", (short)this.id_case);
        rXC.id_class(rcd_32, this.id_throws);
        rcd_32.id_class("Fuel", (byte)this.id_implements);
        return rcd_32;
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32, rpr_3 rpr_32) {
        return this.a_(n, rdn_32);
    }

    @Override
    public int[] id_class(rpr_3 rpr_32) {
        if (rpr_32 == rpr_3.UP) {
            return id_break;
        }
        return rpr_32 == rpr_3.DOWN ? id_byte : id_protected;
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        return rXC.id_class(this.id_throws, n, n2);
    }

    @Override
    protected rJr_1 id_class(int n, rhz_3 rhz_32) {
        return new rXf_1(n, rhz_32, this, this.id_class);
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        if (n >= 0 && n < this.id_throws.size()) {
            this.id_throws.set(n, rdn_32);
        }
    }

    @Override
    public boolean id_break(int n, rdn_3 rdn_32, rpr_3 rpr_32) {
        if (n == 3) {
            return rdn_32.id_break() == rdy_3.Jn;
        }
        return true;
    }

    @Override
    public void id_throws() {
        boolean[] blArray;
        rdn_3 rdn_32 = this.id_throws.get(4);
        if (this.id_implements <= 0 && rdn_32.id_break() == rdy_3.JH) {
            this.id_implements = 20;
            rdn_32.id_catch(1);
            this.id_break();
        }
        boolean bl = this.id_private();
        boolean bl2 = this.id_case > 0;
        rdn_3 rdn_33 = this.id_throws.get(3);
        if (bl2) {
            boolean bl3;
            --this.id_case;
            boolean bl4 = bl3 = this.id_case == 0;
            if (bl3 && bl) {
                this.id_finally();
                this.id_break();
            } else if (!bl) {
                this.id_case = 0;
                this.id_break();
            } else if (this.id_private != rdn_33.id_break()) {
                this.id_case = 0;
                this.id_break();
            }
        } else if (bl && this.id_implements > 0) {
            --this.id_implements;
            this.id_case = 400;
            this.id_private = rdn_33.id_break();
            this.id_break();
        }
        if (!this.id_extends.id_continue && !Arrays.equals(blArray = this.id_catch(), this.id_catch)) {
            this.id_catch = blArray;
            xc_3 xc_32 = this.id_extends.id_byte(this.id_char());
            if (!(xc_32.id_break() instanceof xZ_2)) {
                return;
            }
            for (int i = 0; i < xZ_2.id_volatile.length; ++i) {
                xc_32 = (xc_3)xc_32.id_class(xZ_2.id_volatile[i], blArray[i]);
            }
            this.id_extends.id_class(this.id_native, xc_32, 2);
        }
    }

    private void id_finally() {
        rdn_3 rdn_32 = this.id_throws.get(3);
        for (int i = 0; i < 3; ++i) {
            this.id_throws.set(i, rAr_1.id_protected(rdn_32, this.id_throws.get(i)));
        }
        rdn_32.id_catch(1);
        rfH_2 rfH_22 = this.id_char();
        if (rdn_32.id_break().id_int()) {
            rdn_3 rdn_33 = new rdn_3(rdn_32.id_break().id_package());
            if (rdn_32.id_class()) {
                rdn_32 = rdn_33;
            } else if (!this.id_extends.id_continue) {
                rXn_1.id_class(this.id_extends, (double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), rdn_33);
            }
        }
        this.id_throws.set(3, rdn_32);
        this.id_extends.id_byte(1035, rfH_22, 0);
    }

    public boolean[] id_catch() {
        boolean[] blArray = new boolean[3];
        for (int i = 0; i < 3; ++i) {
            if (this.id_throws.get(i).id_class()) continue;
            blArray[i] = true;
        }
        return blArray;
    }

    @Override
    public rdn_3 id_extends(int n) {
        return n >= 0 && n < this.id_throws.size() ? this.id_throws.get(n) : rdn_3.id_break;
    }

    @Override
    public int id_else() {
        return this.id_throws.size();
    }

    @Override
    public boolean id_return() {
        for (rdn_3 rdn_32 : this.id_throws) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_public() {
        this.id_throws.clear();
    }

    private boolean id_private() {
        rdn_3 rdn_32 = this.id_throws.get(3);
        if (rdn_32.id_class()) {
            return false;
        }
        if (!rAr_1.id_class(rdn_32)) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            rdn_3 rdn_33 = this.id_throws.get(i);
            if (rdn_33.id_class() || !rAr_1.id_class(rdn_33, rdn_32)) continue;
            return true;
        }
        return false;
    }

    @Override
    public rdn_3 id_native(int n) {
        return rXC.id_class(this.id_throws, n);
    }

    @Override
    public boolean a_(int n, rdn_3 rdn_32) {
        if (n == 3) {
            return rAr_1.id_class(rdn_32);
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        if (n == 4) {
            return rdb_32 == rdy_3.JH;
        }
        return (rdb_32 == rdy_3.JA || rdb_32 == rdy_3.kk || rdb_32 == rdy_3.kQ || rdb_32 == rdy_3.Jn) && this.id_extends(n).id_class();
    }

    @Override
    protected rgP_2 X_() {
        return new rgn_3("container.brewing");
    }
}

