/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CJ;
import celestial.HU;
import celestial.Hd_1;
import celestial.In_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.fZ_2;
import celestial.gm_3;
import celestial.ly_3;
import celestial.pT_2;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.tf_3;

public class CA
extends CH {
    private final In_1 id_class = new tf_3();
    private final HU id_break = HU.id_private(pT_2.id_class);

    public CA(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3);
        this.id_else = 0.0f;
        this.id_this = 30;
    }

    @Override
    public CJ id_class() {
        return CJ.id_throws;
    }

    @Override
    public void id_class(Ok_1 ok_1, ly_3 ly_32, float f) {
        float f2 = ((float)this.id_super + f) / (float)this.id_this;
        float f3 = 0.05f + 0.5f * rfU_2.id_class(f2 * (float)Math.PI);
        Ml_1 ml_1 = new Ml_1();
        ml_1.id_class(ly_32.id_case());
        ml_1.id_class(rje_3.id_break.id_byte(150.0f * f2 - 60.0f));
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        ml_1.id_class(0.0, (double)-1.101f, 1.5);
        Hd_1 hd_1 = QY.id_instanceof().id_interface().id_break();
        Ok_1 ok_12 = hd_1.getBuffer(this.id_break);
        this.id_class.id_class(ml_1, ok_12, 0xF000F0, fZ_2.id_class, 1.0f, 1.0f, 1.0f, f3);
        hd_1.id_break();
    }
}

