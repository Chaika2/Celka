/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.jI_2;
import celestial.rrXi_1;
import celestial.rrdZ;
import celestial.rrdy_1;
import celestial.rrkx_1;

public class rrkO
extends rrXi_1 {
    private rrdy_1 id_throws = null;

    public rrkO(rrdy_1 rrdy_12, int n, int n2, int n3, int n4) {
        super(rrdy_12.ordinal(), n, n2, n3, n4, rrkO.id_class(rrdy_12));
        this.id_throws = rrdy_12;
    }

    private static String id_class(rrdy_1 rrdy_12) {
        String string = jI_2.id_class(rrdy_12.id_class(), new Object[0]) + ": ";
        switch (rrdy_12) {
            case ANTIALIASING: {
                return string + rrkx_1.id_break(rrdZ.So);
            }
            case NORMAL_MAP: {
                return string + rrkx_1.id_byte(rrdZ.SV);
            }
            case SPECULAR_MAP: {
                return string + rrkx_1.id_byte(rrdZ.Sg);
            }
            case RENDER_RES_MUL: {
                return string + rrkx_1.id_class(rrdZ.Sy);
            }
            case SHADOW_RES_MUL: {
                return string + rrkx_1.id_class(rrdZ.Sp);
            }
            case HAND_DEPTH_MUL: {
                return string + rrkx_1.id_break(rrdZ.SH);
            }
            case CLOUD_SHADOW: {
                return string + rrkx_1.id_byte(rrdZ.Sl);
            }
            case OLD_HAND_LIGHT: {
                return string + rrdZ.SY.id_break();
            }
            case OLD_LIGHTING: {
                return string + rrdZ.SR.id_break();
            }
            case SHADOW_CLIP_FRUSTRUM: {
                return string + rrkx_1.id_byte(rrdZ.Sj);
            }
            case TWEAK_BLOCK_DAMAGE: {
                return string + rrkx_1.id_byte(rrdZ.SC);
            }
        }
        return string + rrdZ.id_class(rrdy_12);
    }

    @Override
    protected boolean id_break(int n) {
        return true;
    }

    public void id_implements() {
        this.id_class(rrkO.id_class(this.id_throws));
    }

    public rrdy_1 id_private() {
        return this.id_throws;
    }
}

