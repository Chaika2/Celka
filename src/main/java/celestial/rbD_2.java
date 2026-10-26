/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rBk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbo_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rqn_3;
import celestial.rsE_2;
import java.util.List;

public class rbD_2
extends rBk_1 {
    private int id_break;
    public final /* synthetic */ rbo_3 id_class;

    @Override
    public void id_byte() {
        List<rsE_2> list = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rbo_3.id_class);
        if (!list.isEmpty()) {
            this.id_class.id_public().id_class((an_3)list.get(0), (double)1.2f);
            this.id_class.id_class(rqn_3.Pg, 1.0f, 1.0f);
        }
        this.id_break = 0;
    }

    public rbD_2(rbo_3 rbo_32) {
        this.id_class = rbo_32;
    }

    private void id_class(rdn_3 rdn_32) {
        if (!rdn_32.id_class()) {
            double d = this.id_class.rH() - (double)0.3f;
            rsE_2 rsE_22 = new rsE_2((rYB)this.id_class.id_throws[7], this.id_class.rx(), d, this.id_class.BO(), rdn_32);
            rsE_22.id_class(40);
            rsE_22.id_byte(this.id_class.ro());
            float f = 0.3f;
            float f2 = rbo_3.id_break(this.id_class).nextFloat() * ((float)Math.PI * 2);
            float f3 = 0.02f * rbo_3.id_byte(this.id_class).nextFloat();
            rsE_22.id_catch(0.3f * -rfU_2.id_class(((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180)) * rfU_2.id_break(((Float)this.id_class.id_throws[16]).floatValue() * ((float)Math.PI / 180)) + rfU_2.id_break(f2) * f3, 0.3f * rfU_2.id_class(((Float)this.id_class.id_throws[16]).floatValue() * ((float)Math.PI / 180)) * 1.5f, 0.3f * rfU_2.id_break(((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180)) * rfU_2.id_break(((Float)this.id_class.id_throws[16]).floatValue() * ((float)Math.PI / 180)) + rfU_2.id_class(f2) * f3);
            ((rYB)this.id_class.id_throws[7]).a_(rsE_22);
        }
    }

    @Override
    public boolean id_class() {
        if (this.id_break > (Integer)this.id_class.id_throws[41]) {
            return false;
        }
        List<rsE_2> list = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rbo_3.id_class);
        return !list.isEmpty() || !this.id_class.id_class(rXQ.MAINHAND).id_class();
    }

    @Override
    public void id_throws() {
        List<rsE_2> list = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rbo_3.id_class);
        rdn_3 rdn_32 = this.id_class.id_class(rXQ.MAINHAND);
        if (!rdn_32.id_class()) {
            this.id_class(rdn_32);
            this.id_class.id_class(rXQ.MAINHAND, rdn_3.id_break);
        } else if (!list.isEmpty()) {
            this.id_class.id_public().id_class((an_3)list.get(0), (double)1.2f);
        }
    }

    @Override
    public void id_protected() {
        rdn_3 rdn_32 = this.id_class.id_class(rXQ.MAINHAND);
        if (!rdn_32.id_class()) {
            this.id_class(rdn_32);
            this.id_class.id_class(rXQ.MAINHAND, rdn_3.id_break);
            this.id_break = (Integer)this.id_class.id_throws[41] + rbo_3.id_class(this.id_class).nextInt(100);
        }
    }
}

