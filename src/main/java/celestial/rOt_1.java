/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.iO_2;
import celestial.rBd_1;
import celestial.rOp_1;
import celestial.rOw_1;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rYB;
import celestial.rcd_3;
import java.util.List;
import java.util.stream.Stream;

public abstract class rOt_1
extends rOp_1 {
    private rOt_1 id_class;
    private int id_break = 1;

    public rOt_1(aI_2<? extends rOt_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rOp_1>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        List<?> list;
        super.id_this();
        if (this.sz() && ((rYB)this.id_throws[7]).id_int.nextInt(200) == 1 && (list = ((rYB)this.id_throws[7]).id_class(this.getClass(), this.rN().id_byte(8.0, 8.0, 8.0))).size() <= 1) {
            this.id_break = 1;
        }
    }

    @Override
    protected boolean n() {
        return !this.sd();
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        if (aU_22 == null) {
            aU_22 = new rOw_1(this);
        } else {
            this.id_class(((rOw_1)aU_22).id_class);
        }
        return aU_22;
    }

    public void id_class(Stream<rOt_1> stream) {
        stream.limit(this.sx() - this.id_break).filter(rOt_12 -> rOt_12 != this).forEach(rOt_12 -> rOt_12.id_class(this));
    }

    public rOt_1 id_class(rOt_1 rOt_12) {
        this.id_class = rOt_12;
        rOt_12.sc();
        return rOt_12;
    }

    private void sc() {
        ++this.id_break;
    }

    public boolean sd() {
        return this.id_class != null && this.id_class.BM();
    }

    public int sx() {
        return super.E();
    }

    public void sk() {
        this.id_class.su();
        this.id_class = null;
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(5, new rBd_1(this));
    }

    @Override
    public int E() {
        return this.sx();
    }

    public boolean sz() {
        return this.id_break > 1;
    }

    public void sN() {
        if (this.sd()) {
            this.id_public().id_class((an_3)this.id_class, 1.0);
        }
    }

    private void su() {
        --this.id_break;
    }

    public boolean sW() {
        return this.sz() && this.id_break < this.sx();
    }

    public boolean sQ() {
        return this.id_int(this.id_class) <= 121.0;
    }
}

