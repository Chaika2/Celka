/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHb_1;
import celestial.rRq_1;
import celestial.rVi_1;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfH_2;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rrGh_1;
import celestial.rxL_2;
import celestial.ryO_2;
import java.util.Objects;

public class rrGE {
    private final rfH_2 id_class;
    private final rxL_2 id_break;
    private final rgP_2 id_byte;

    public rgP_2 id_byte() {
        return this.id_byte;
    }

    public rrGE(rfH_2 rfH_22, rxL_2 rxL_22, rgP_2 rgP_22) {
        this.id_class = rfH_22;
        this.id_break = rxL_22;
        this.id_byte = rgP_22;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rrGE rrGE2 = (rrGE)object;
            return Objects.equals(this.id_class, rrGE2.id_class) && this.id_break == rrGE2.id_break && Objects.equals(this.id_byte, rrGE2.id_byte);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.id_class, this.id_break, this.id_byte);
    }

    public static rrGE id_class(rcd_3 rcd_32) {
        rfH_2 rfH_22 = rco_3.id_break(rcd_32.id_int("Pos"));
        rxL_2 rxL_22 = rxL_2.id_class(rcd_32.id_native("Color"), rxL_2.WHITE);
        rVi_1 rVi_12 = rcd_32.id_throws("Name") ? rgB_2.id_class(rcd_32.id_native("Name")) : null;
        return new rrGE(rfH_22, rxL_22, rVi_12);
    }

    public static rrGE id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rRq_12.id_class(rfH_22);
        if (ryO_22 instanceof rHb_1) {
            rHb_1 rHb_12 = (rHb_1)ryO_22;
            rxL_2 rxL_22 = rHb_12.id_class(() -> rRq_12.id_byte(rfH_22));
            rgP_2 rgP_22 = rHb_12.Bk() ? rHb_12.rD() : null;
            return new rrGE(rfH_22, rxL_22, rgP_22);
        }
        return null;
    }

    public rfH_2 id_class() {
        return this.id_class;
    }

    public rrGh_1 id_break() {
        switch (this.id_break) {
            case WHITE: {
                return rrGh_1.BANNER_WHITE;
            }
            case ORANGE: {
                return rrGh_1.BANNER_ORANGE;
            }
            case MAGENTA: {
                return rrGh_1.BANNER_MAGENTA;
            }
            case LIGHT_BLUE: {
                return rrGh_1.BANNER_LIGHT_BLUE;
            }
            case YELLOW: {
                return rrGh_1.BANNER_YELLOW;
            }
            case LIME: {
                return rrGh_1.BANNER_LIME;
            }
            case PINK: {
                return rrGh_1.BANNER_PINK;
            }
            case GRAY: {
                return rrGh_1.BANNER_GRAY;
            }
            case LIGHT_GRAY: {
                return rrGh_1.BANNER_LIGHT_GRAY;
            }
            case CYAN: {
                return rrGh_1.BANNER_CYAN;
            }
            case PURPLE: {
                return rrGh_1.BANNER_PURPLE;
            }
            case BLUE: {
                return rrGh_1.BANNER_BLUE;
            }
            case BROWN: {
                return rrGh_1.BANNER_BROWN;
            }
            case GREEN: {
                return rrGh_1.BANNER_GREEN;
            }
            case RED: {
                return rrGh_1.BANNER_RED;
            }
        }
        return rrGh_1.BANNER_BLACK;
    }

    public String id_throws() {
        return "banner-" + this.id_class.b_() + "," + this.id_class.c_() + "," + this.id_class.d_();
    }

    public rcd_3 id_protected() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("Pos", rco_3.id_class(this.id_class));
        rcd_32.id_class("Color", this.id_break.id_byte());
        if (this.id_byte != null) {
            rcd_32.id_class("Name", rgB_2.id_class(this.id_byte));
        }
        return rcd_32;
    }
}

