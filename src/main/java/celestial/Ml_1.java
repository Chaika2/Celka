/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 */
package celestial;

import celestial.MH;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rjj_3;
import celestial.rqR_2;
import com.google.common.collect.Queues;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ml_1 {
    public Deque<MH> id_class = new ArrayDeque<MH>();
    private final Deque<MH> id_break = rqR_2.id_class(Queues.newArrayDeque(), arrayDeque -> {
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class();
        rjj_3 rjj_32 = new rjj_3();
        rjj_32.id_byte();
        arrayDeque.add(new MH(rjV_22, rjj_32));
    });

    public MH id_byte() {
        return this.id_break.getLast();
    }

    public String toString() {
        return this.id_byte().toString();
    }

    public void id_class(double d, double d2, double d3) {
        MH mH = this.id_break.getLast();
        rjV_2 rjV_22 = mH.id_class();
        rjV_22.id_class((float)d, (float)d2, (float)d3);
    }

    public void id_class(rjY_2 rjY_22) {
        MH mH = this.id_break.getLast();
        rjV_2 rjV_22 = mH.id_class();
        rjV_22.id_class(rjY_22);
        rjj_3 rjj_32 = mH.id_break();
        rjj_32.id_class(rjY_22);
    }

    public void id_class() {
        MH mH = this.id_break.getLast();
        MH mH2 = this.id_class.pollLast();
        if (mH2 == null) {
            mH2 = new MH(mH.id_class.id_case(), mH.id_break.id_case());
        } else {
            mH2.id_class.id_break(mH.id_class);
            mH2.id_break.id_class(mH.id_break);
        }
        this.id_break.addLast(mH2);
    }

    public void id_class(float f, float f2, float f3) {
        MH mH = this.id_break.getLast();
        mH.id_class.id_private(f, f2, f3);
        if (f == f2 && f2 == f3) {
            if (f > 0.0f) {
                return;
            }
            mH.id_break.id_class(-1.0f);
        }
        float f4 = 1.0f / f;
        float f5 = 1.0f / f2;
        float f6 = 1.0f / f3;
        float f7 = rfU_2.id_finally(f4 * f5 * f6);
        mH.id_break.id_break(rjj_3.id_protected(f7 * f4, f7 * f5, f7 * f6));
    }

    public void id_break(rjY_2 rjY_22) {
        MH mH = this.id_break.getLast();
        mH.id_class.id_break(rjY_22);
        mH.id_break.id_break(rjY_22);
    }

    public void id_break() {
        MH mH = this.id_break.removeLast();
        if (mH != null) {
            this.id_class.add(mH);
        }
    }

    public float id_throws() {
        return this.id_break.getLast().id_class.id_catch();
    }

    public boolean id_protected() {
        return this.id_break.size() == 1;
    }
}

