/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hd_1;
import celestial.Hu_1;
import celestial.Hx_1;
import celestial.OQ;
import celestial.Ok_1;
import celestial.lD_2;
import java.util.Optional;

public class Hc_1
implements Hx_1 {
    private final Hd_1 id_class;
    private final Hd_1 id_break = Hx_1.id_class(new lD_2(256));
    private int id_byte = 255;
    private int id_protected = 255;
    private int id_throws = 255;
    private int id_case = 255;

    public Hc_1(Hd_1 hd_1) {
        this.id_class = hd_1;
    }

    public void id_class(int n, int n2, int n3, int n4) {
        this.id_byte = n;
        this.id_protected = n2;
        this.id_throws = n3;
        this.id_case = n4;
    }

    public void id_break() {
        this.id_break.id_break();
    }

    @Override
    public Ok_1 getBuffer(HU hU) {
        if (hU.id_throw()) {
            Ok_1 ok_1 = this.id_break.getBuffer(hU);
            return new Hu_1(ok_1, this.id_byte, this.id_protected, this.id_throws, this.id_case);
        }
        Ok_1 ok_1 = this.id_class.getBuffer(hU);
        Optional<HU> optional = hU.id_instanceof();
        if (optional.isPresent()) {
            Ok_1 ok_12 = this.id_break.getBuffer(optional.get());
            Hu_1 hu_1 = new Hu_1(ok_12, this.id_byte, this.id_protected, this.id_throws, this.id_case);
            return OQ.id_class(hu_1, ok_1);
        }
        return ok_1;
    }
}

