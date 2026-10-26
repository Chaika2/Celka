/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import java.util.EnumSet;
import java.util.Random;

public class rBO
extends rBk_1 {
    protected final aA_2 id_class;
    private double id_break;
    private double id_byte;
    private double id_protected;
    private final double id_throws;
    private final rYB id_case;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_class(this.id_break, this.id_byte, this.id_protected, this.id_throws);
    }

    public rBO(aA_2 aA_22, double d) {
        this.id_class = aA_22;
        this.id_throws = d;
        this.id_case = (rYB)aA_22.id_throws[7];
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (this.id_class.I_() != null) {
            return false;
        }
        if (!this.id_case.id_strictfp()) {
            return false;
        }
        if (!this.id_class.Pz()) {
            return false;
        }
        if (!this.id_case.id_case(this.id_class.Bs())) {
            return false;
        }
        return !this.id_class.id_class(rXQ.HEAD).id_class() ? false : this.id_catch();
    }

    @Override
    public boolean id_break() {
        return !this.id_class.id_public().id_native();
    }

    protected boolean id_catch() {
        rjU_2 rjU_22 = this.id_private();
        if (rjU_22 == null) {
            return false;
        }
        this.id_break = rjU_22.id_break;
        this.id_byte = rjU_22.id_byte;
        this.id_protected = rjU_22.id_protected;
        return true;
    }

    protected rjU_2 id_private() {
        Random random = this.id_class.Sa();
        rfH_2 rfH_22 = this.id_class.Bs();
        for (int i = 0; i < 10; ++i) {
            rfH_2 rfH_23 = rfH_22.id_break(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
            if (this.id_case.id_case(rfH_23) || !(this.id_class.id_class(rfH_23) < 0.0f)) continue;
            return rjU_2.id_protected(rfH_23);
        }
        return null;
    }
}

