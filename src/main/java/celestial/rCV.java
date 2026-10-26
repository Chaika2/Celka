/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QP;
import celestial.rls_3;
import celestial.rpH_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xu_3;

public final class rCV
extends Enum<rCV>
implements rpH_2 {
    public static final /* enum */ rCV HARP = new rCV("harp", rqn_3.MA);
    public static final /* enum */ rCV BASEDRUM = new rCV("basedrum", rqn_3.Mu);
    public static final /* enum */ rCV SNARE = new rCV("snare", rqn_3.Ml);
    public static final /* enum */ rCV HAT = new rCV("hat", rqn_3.Mn);
    public static final /* enum */ rCV BASS = new rCV("bass", rqn_3.Mm);
    public static final /* enum */ rCV FLUTE = new rCV("flute", rqn_3.MF);
    public static final /* enum */ rCV BELL = new rCV("bell", rqn_3.MZ);
    public static final /* enum */ rCV GUITAR = new rCV("guitar", rqn_3.ML);
    public static final /* enum */ rCV CHIME = new rCV("chime", rqn_3.Mv);
    public static final /* enum */ rCV XYLOPHONE = new rCV("xylophone", rqn_3.MH);
    public static final /* enum */ rCV IRON_XYLOPHONE = new rCV("iron_xylophone", rqn_3.My);
    public static final /* enum */ rCV COW_BELL = new rCV("cow_bell", rqn_3.Mp);
    public static final /* enum */ rCV DIDGERIDOO = new rCV("didgeridoo", rqn_3.Mq);
    public static final /* enum */ rCV BIT = new rCV("bit", rqn_3.MT);
    public static final /* enum */ rCV BANJO = new rCV("banjo", rqn_3.Mt);
    public static final /* enum */ rCV PLING = new rCV("pling", rqn_3.MC);
    private final String name;
    private final rqA_2 sound;
    private static final /* synthetic */ rCV[] $VALUES;

    private static /* synthetic */ rCV[] id_byte() {
        return new rCV[]{HARP, BASEDRUM, SNARE, HAT, BASS, FLUTE, BELL, GUITAR, CHIME, XYLOPHONE, IRON_XYLOPHONE, COW_BELL, DIDGERIDOO, BIT, BANJO, PLING};
    }

    private rCV(String string2, rqA_2 rqA_22) {
        this.name = string2;
        this.sound = rqA_22;
    }

    static {
        $VALUES = rCV.id_byte();
    }

    public static rCV[] values() {
        return (rCV[])$VALUES.clone();
    }

    public static rCV valueOf(String string) {
        return Enum.valueOf(rCV.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public static rCV id_class(xc_3 xc_32) {
        if (xc_32.id_class(xu_3.PI)) {
            return FLUTE;
        }
        if (xc_32.id_class(xu_3.rt)) {
            return BELL;
        }
        if (xc_32.id_class(rls_3.id_break)) {
            return GUITAR;
        }
        if (xc_32.id_class(xu_3.Ei)) {
            return CHIME;
        }
        if (xc_32.id_class(xu_3.bY)) {
            return XYLOPHONE;
        }
        if (xc_32.id_class(xu_3.rw)) {
            return IRON_XYLOPHONE;
        }
        if (xc_32.id_class(xu_3.PY)) {
            return COW_BELL;
        }
        if (xc_32.id_class(xu_3.Pg)) {
            return DIDGERIDOO;
        }
        if (xc_32.id_class(xu_3.SN)) {
            return BIT;
        }
        if (xc_32.id_class(xu_3.Ey)) {
            return BANJO;
        }
        if (xc_32.id_class(xu_3.Pa)) {
            return PLING;
        }
        QP qP = xc_32.id_byte();
        if (qP == QP.id_void) {
            return BASEDRUM;
        }
        if (qP == QP.id_synchronized) {
            return SNARE;
        }
        if (qP == QP.id_abstract) {
            return HAT;
        }
        return qP != QP.id_goto && qP != QP.id_while ? HARP : BASS;
    }

    public rqA_2 id_break() {
        return this.sound;
    }
}

