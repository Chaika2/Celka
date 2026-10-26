/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rGB;
import celestial.rGS;
import celestial.rGb_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;

public class rGO
extends rGb_1 {
    private float id_byte;
    private float id_protected;
    private float id_throws;
    private float id_case;
    public final /* synthetic */ rGB id_break;

    @Override
    public void id_byte() {
        this.id_protected = 5.0f + rGB.id_class(this.id_break).nextFloat() * 10.0f;
        this.id_throws = -4.0f + rGB.id_break(this.id_break).nextFloat() * 9.0f;
        this.id_case = rGB.id_byte(this.id_break).nextBoolean() ? 1.0f : -1.0f;
        this.id_private();
    }

    public rGO(rGB rGB2) {
        this.id_break = rGB2;
        super(rGB2);
    }

    @Override
    public boolean id_class() {
        return this.id_break.I_() == null || this.id_break.id_super == rGS.CIRCLE;
    }

    @Override
    public void id_throws() {
        if (rGB.id_protected(this.id_break).nextInt(350) == 0) {
            this.id_throws = -4.0f + rGB.id_throws(this.id_break).nextFloat() * 9.0f;
        }
        if (rGB.id_case(this.id_break).nextInt(250) == 0) {
            this.id_protected += 1.0f;
            if (this.id_protected > 15.0f) {
                this.id_protected = 5.0f;
                this.id_case = -this.id_case;
            }
        }
        if (rGB.id_catch(this.id_break).nextInt(450) == 0) {
            this.id_byte = rGB.id_private(this.id_break).nextFloat() * 2.0f * (float)Math.PI;
            this.id_private();
        }
        if (this.id_catch()) {
            this.id_private();
        }
        if (this.id_break.id_break.id_byte < this.id_break.re() && !((rYB)this.id_break.id_throws[7]).id_finally(this.id_break.Bs().id_catch(1))) {
            this.id_throws = Math.max(1.0f, this.id_throws);
            this.id_private();
        }
        if (this.id_break.id_break.id_byte > this.id_break.re() && !((rYB)this.id_break.id_throws[7]).id_finally(this.id_break.Bs().id_break(1))) {
            this.id_throws = Math.min(-1.0f, this.id_throws);
            this.id_private();
        }
    }

    private void id_private() {
        if (rfH_2.id_protected.equals(this.id_break.id_protected)) {
            this.id_break.id_protected = this.id_break.Bs();
        }
        this.id_byte += this.id_case * 15.0f * ((float)Math.PI / 180);
        this.id_break.id_break = rjU_2.id_byte(this.id_break.id_protected).id_break(this.id_protected * rfU_2.id_break(this.id_byte), -4.0f + this.id_throws, this.id_protected * rfU_2.id_class(this.id_byte));
    }
}

