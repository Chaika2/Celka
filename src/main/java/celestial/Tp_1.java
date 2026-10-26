/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.Hx_1;
import celestial.IQ;
import celestial.JU;
import celestial.Ml_1;
import celestial.QY;
import celestial.Tf_1;
import celestial.iB_2;
import celestial.jx_3;
import celestial.qE_2;
import celestial.rXQ;
import celestial.rbE_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rje_3;
import celestial.rsq_3;
import celestial.rxJ_2;
import celestial.rxS_2;
import celestial.rys_3;
import celestial.tY_2;
import celestial.tp_3;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class Tp_1<T extends iB_2, M extends tp_3<T>>
extends Tf_1<T, M> {
    private final float id_class;
    private final float id_break;
    private final float id_byte;

    public Tp_1(qE_2<T, M> qE_22) {
        this(qE_22, 1.0f, 1.0f, 1.0f);
    }

    public Tp_1(qE_2<T, M> qE_22, float f, float f2, float f3) {
        super(qE_22);
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        rdn_3 rdn_32 = ((iB_2)t).id_class(rXQ.HEAD);
        if (!rdn_32.id_class()) {
            float f7;
            boolean bl;
            rdb_3 rdb_32 = rdn_32.id_break();
            ml_1.id_class();
            ml_1.id_class(this.id_class, this.id_break, this.id_byte);
            boolean bl2 = bl = t instanceof rsq_3 || t instanceof rbE_2;
            if (((iB_2)t).n_() && !(t instanceof rsq_3)) {
                f7 = 2.0f;
                float f8 = 1.4f;
                ml_1.id_class(0.0, 0.03125, 0.0);
                ml_1.id_class(0.7f, 0.7f, 0.7f);
                ml_1.id_class(0.0, 1.0, 0.0);
            }
            ((tY_2)this.id_byte()).id_byte().id_class(ml_1);
            if (rdb_32 instanceof rxJ_2 && ((rxJ_2)rdb_32).id_catch() instanceof JU) {
                f7 = 1.1875f;
                ml_1.id_class(1.1875f, -1.1875f, -1.1875f);
                if (bl) {
                    ml_1.id_class(0.0, 0.0625, 0.0);
                }
                GameProfile gameProfile = null;
                if (rdn_32.id_final()) {
                    String string;
                    rcd_3 rcd_32 = rdn_32.id_package();
                    if (rcd_32.id_byte("SkullOwner", 10)) {
                        gameProfile = rco_3.id_class(rcd_32.id_int("SkullOwner"));
                    } else if (rcd_32.id_byte("SkullOwner", 8) && !StringUtils.isBlank((CharSequence)(string = rcd_32.id_native("SkullOwner")))) {
                        gameProfile = rys_3.id_break(new GameProfile((UUID)null, string));
                        rcd_32.id_class("SkullOwner", rco_3.id_class(new rcd_3(), gameProfile));
                    }
                }
                ml_1.id_class(-0.5, 0.0, -0.5);
                jx_3.id_class(null, 180.0f, ((JU)((rxJ_2)rdb_32).id_catch()).id_break(), gameProfile, f, ml_1, hx_1, n);
            } else if (!(rdb_32 instanceof rxS_2) || ((rxS_2)rdb_32).id_byte() != rXQ.HEAD) {
                f7 = 0.625f;
                ml_1.id_class(0.0, -0.25, 0.0);
                ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
                ml_1.id_class(0.625f, -0.625f, -0.625f);
                if (bl) {
                    ml_1.id_class(0.0, 0.1875, 0.0);
                }
                QY.id_instanceof().id_import().id_class((iB_2)t, rdn_32, IQ.HEAD, false, ml_1, hx_1, n);
            }
            ml_1.id_break();
        }
    }
}

