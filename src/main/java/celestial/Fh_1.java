/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FX;
import celestial.Fd_1;
import celestial.Fk_1;
import celestial.Fu_1;
import celestial.Fx_1;
import celestial.LZ;
import celestial.Ml_1;
import celestial.QY;
import celestial.rHO;
import celestial.rLR;
import celestial.rXT;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class Fh_1
extends Fu_1<rXT> {
    public static final rqO_2 id_class = new rqO_2("textures/gui/container/beacon.png");
    private static final rgP_2 id_throws = new rgn_3("block.minecraft.beacon.primary");
    private static final rgP_2 id_case = new rgn_3("block.minecraft.beacon.secondary");
    private Fd_1 id_catch;
    public boolean id_private;
    public rLR id_implements;
    public rLR id_finally;

    public static /* synthetic */ QY id_byte(Fh_1 fh_1) {
        return fh_1.id_volatile;
    }

    public Fh_1(rXT rXT2, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rXT2, rhz_32, rgP_22);
        this.id_synchronized = 230;
        this.id_return = 219;
        rXT2.id_class(new FX(this, rXT2));
    }

    public static /* synthetic */ QY id_class(Fh_1 fh_1) {
        return fh_1.id_volatile;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n3 = (this.id_package - this.id_synchronized) / 2;
        int n4 = (this.id_int - this.id_return) / 2;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
        this.id_final.id_break = 100.0f;
        this.id_final.id_class(new rdn_3(rdy_3.Ok), n3 + 20, n4 + 109);
        this.id_final.id_class(new rdn_3(rdy_3.dP), n3 + 41, n4 + 109);
        this.id_final.id_class(new rdn_3(rdy_3.OJ), n3 + 41 + 22, n4 + 109);
        this.id_final.id_class(new rdn_3(rdy_3.Od), n3 + 42 + 44, n4 + 109);
        this.id_final.id_class(new rdn_3(rdy_3.Ox), n3 + 42 + 66, n4 + 109);
        this.id_final.id_break = 0.0f;
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2) {
        Fh_1.id_class(ml_1, this.id_super, id_throws, 62, 10, 0xE0E0E0);
        Fh_1.id_class(ml_1, this.id_super, id_case, 169, 10, 0xE0E0E0);
        for (LZ lZ : this.id_new) {
            if (!lZ.B_()) continue;
            lZ.id_class(ml_1, n - this.id_char, n2 - this.id_abstract);
            break;
        }
    }

    public static /* synthetic */ QY id_break(Fh_1 fh_1) {
        return fh_1.id_volatile;
    }

    public static /* synthetic */ QY id_throws(Fh_1 fh_1) {
        return fh_1.id_volatile;
    }

    public static /* synthetic */ QY id_catch(Fh_1 fh_1) {
        return fh_1.id_volatile;
    }

    public static /* synthetic */ QY id_case(Fh_1 fh_1) {
        return fh_1.id_volatile;
    }

    public static /* synthetic */ List id_implements(Fh_1 fh_1) {
        return fh_1.id_native;
    }

    public static /* synthetic */ QY id_protected(Fh_1 fh_1) {
        return fh_1.id_volatile;
    }

    @Override
    public void id_private() {
        super.id_private();
        int n = ((rXT)this.id_instanceof).id_class();
        if (this.id_private && n >= 0) {
            Fk_1 fk_1;
            rLR rLR2;
            int n2;
            int n3;
            int n4;
            int n5;
            this.id_private = false;
            for (n5 = 0; n5 <= 2; ++n5) {
                n4 = rHO.id_class[n5].length;
                n3 = n4 * 22 + (n4 - 1) * 2;
                for (n2 = 0; n2 < n4; ++n2) {
                    rLR2 = rHO.id_class[n5][n2];
                    fk_1 = new Fk_1(this, this.id_char + 76 + n2 * 24 - n3 / 2, this.id_abstract + 22 + n5 * 25, rLR2, true);
                    this.id_class(fk_1);
                    if (n5 >= n) {
                        fk_1.id_int = false;
                        continue;
                    }
                    if (rLR2 != this.id_implements) continue;
                    fk_1.id_class(true);
                }
            }
            n5 = 3;
            n4 = rHO.id_class[3].length + 1;
            n3 = n4 * 22 + (n4 - 1) * 2;
            for (n2 = 0; n2 < n4 - 1; ++n2) {
                rLR2 = rHO.id_class[3][n2];
                fk_1 = new Fk_1(this, this.id_char + 167 + n2 * 24 - n3 / 2, this.id_abstract + 47, rLR2, false);
                this.id_class(fk_1);
                if (3 >= n) {
                    fk_1.id_int = false;
                    continue;
                }
                if (rLR2 != this.id_finally) continue;
                fk_1.id_class(true);
            }
            if (this.id_implements != null) {
                Fk_1 fk_12 = new Fk_1(this, this.id_char + 167 + (n4 - 1) * 24 - n3 / 2, this.id_abstract + 47, this.id_implements, false);
                this.id_class(fk_12);
                if (3 >= n) {
                    fk_12.id_int = false;
                } else if (this.id_implements == this.id_finally) {
                    fk_12.id_class(true);
                }
            }
        }
        this.id_catch.id_int = ((rXT)this.id_instanceof).id_protected() && this.id_implements != null;
    }

    public static /* synthetic */ List id_private(Fh_1 fh_1) {
        return fh_1.id_new;
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_catch = this.id_class(new Fd_1(this, this.id_char + 164, this.id_abstract + 107));
        this.id_class(new Fx_1(this, this.id_char + 190, this.id_abstract + 107));
        this.id_private = true;
        this.id_catch.id_int = false;
    }
}

