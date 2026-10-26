/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NQ;
import celestial.NS;
import celestial.Nf_1;
import celestial.Np_1;
import celestial.QY;
import celestial.rfU_2;
import java.util.Random;

public class NL {
    private final Random id_class = new Random();
    private final QY id_break;
    private NQ id_byte;
    private int id_protected = 100;

    public NL(QY qY) {
        this.id_break = qY;
    }

    public void id_class(NS nS) {
        this.id_byte = Np_1.id_class(nS.id_class());
        if (this.id_byte.id_catch() != Nf_1.id_class) {
            this.id_break.c().id_class(this.id_byte);
        }
        this.id_protected = Integer.MAX_VALUE;
    }

    public void id_class() {
        NS nS = this.id_break.id_try();
        if (this.id_byte != null) {
            if (!nS.id_class().id_class().equals(this.id_byte.id_case()) && nS.id_protected()) {
                this.id_break.c().id_break(this.id_byte);
                this.id_protected = rfU_2.id_class(this.id_class, 0, nS.id_break() / 2);
            }
            if (!this.id_break.c().id_byte(this.id_byte)) {
                this.id_byte = null;
                this.id_protected = Math.min(this.id_protected, rfU_2.id_class(this.id_class, nS.id_break(), nS.id_byte()));
            }
        }
        this.id_protected = Math.min(this.id_protected, nS.id_byte());
        if (this.id_byte == null && this.id_protected-- <= 0) {
            this.id_class(nS);
        }
    }

    public void id_break() {
        if (this.id_byte != null) {
            this.id_break.c().id_break(this.id_byte);
            this.id_byte = null;
        }
        this.id_protected += 100;
    }

    public boolean id_break(NS nS) {
        return this.id_byte == null ? false : nS.id_class().id_class().equals(this.id_byte.id_case());
    }
}

