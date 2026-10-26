/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Ml_1;
import celestial.NI;
import celestial.NQ;
import celestial.Nu_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.ch_3;
import celestial.cm_3;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rjU_2;
import celestial.rqR_2;
import celestial.uK_2;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;

public class uo_3
extends ch_3
implements Nu_1 {
    private final QY id_class;
    private final List<uK_2> id_throws = Lists.newArrayList();
    private boolean id_case;

    public uo_3(QY qY) {
        this.id_class = qY;
    }

    public void id_class(Ml_1 ml_1) {
        if (!this.id_case && ((Qw_1)this.id_class.id_class[20]).P) {
            this.id_class.c().id_class(this);
            this.id_case = true;
        } else if (this.id_case && !((Qw_1)this.id_class.id_class[20]).P) {
            this.id_class.c().id_break(this);
            this.id_case = false;
        }
        if (this.id_case && !this.id_throws.isEmpty()) {
            RenderSystem.pushMatrix();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            rjU_2 rjU_22 = new rjU_2(((cb_3)this.id_class.id_class[57]).rx(), ((cb_3)this.id_class.id_class[57]).rH(), ((cb_3)this.id_class.id_class[57]).BO());
            rjU_2 rjU_23 = new rjU_2(0.0, 0.0, -1.0).id_class(-((Float)((cb_3)this.id_class.id_class[57]).id_throws[16]).floatValue() * ((float)Math.PI / 180)).id_break(-((Float)((cb_3)this.id_class.id_class[57]).id_throws[15]).floatValue() * ((float)Math.PI / 180));
            rjU_2 rjU_24 = new rjU_2(0.0, 1.0, 0.0).id_class(-((Float)((cb_3)this.id_class.id_class[57]).id_throws[16]).floatValue() * ((float)Math.PI / 180)).id_break(-((Float)((cb_3)this.id_class.id_class[57]).id_throws[15]).floatValue() * ((float)Math.PI / 180));
            rjU_2 rjU_25 = rjU_23.id_byte(rjU_24);
            int n = 0;
            int n2 = 0;
            Iterator<uK_2> iterator = this.id_throws.iterator();
            while (iterator.hasNext()) {
                uK_2 uK_22 = iterator.next();
                if (uK_22.id_break() + 3000L <= rqR_2.id_break()) {
                    iterator.remove();
                    continue;
                }
                n2 = Math.max(n2, ((cm_3)this.id_class.id_class[15]).id_class(uK_22.id_class()));
            }
            n2 = n2 + ((cm_3)this.id_class.id_class[15]).id_break("<") + ((cm_3)this.id_class.id_class[15]).id_break(" ") + ((cm_3)this.id_class.id_class[15]).id_break(">") + ((cm_3)this.id_class.id_class[15]).id_break(" ");
            for (uK_2 uK_23 : this.id_throws) {
                int n3 = 255;
                rgP_2 rgP_22 = uK_23.id_class();
                rjU_2 rjU_26 = uK_23.id_byte().id_protected(rjU_22).id_protected();
                double d = -rjU_25.id_break(rjU_26);
                double d2 = -rjU_23.id_break(rjU_26);
                boolean bl = d2 > 0.5;
                int n4 = n2 / 2;
                int n5 = 9;
                int n6 = n5 / 2;
                float f = 1.0f;
                int n7 = ((cm_3)this.id_class.id_class[15]).id_class(rgP_22);
                int n8 = rfU_2.id_byte(rfU_2.id_break(255.0, 75.0, (double)((float)(rqR_2.id_break() - uK_23.id_break()) / 3000.0f)));
                int n9 = n8 << 16 | n8 << 8 | n8;
                RenderSystem.pushMatrix();
                RenderSystem.translatef((float)this.id_class.id_else().id_super() - (float)n4 * 1.0f - 2.0f, (float)(this.id_class.id_else().id_this() - 30) - (float)(n * (n5 + 1)) * 1.0f, 0.0f);
                RenderSystem.scalef(1.0f, 1.0f, 1.0f);
                uo_3.id_class(ml_1, -n4 - 1, -n6 - 1, n4 + 1, n6 + 1, ((Qw_1)this.id_class.id_class[20]).id_break(0.8f));
                RenderSystem.enableBlend();
                if (!bl) {
                    if (d > 0.0) {
                        ((cm_3)this.id_class.id_class[15]).id_break(ml_1, ">", (float)(n4 - ((cm_3)this.id_class.id_class[15]).id_break(">")), (float)(-n6), n9 + -16777216);
                    } else if (d < 0.0) {
                        ((cm_3)this.id_class.id_class[15]).id_break(ml_1, "<", (float)(-n4), (float)(-n6), n9 + -16777216);
                    }
                }
                ((cm_3)this.id_class.id_class[15]).id_byte(ml_1, rgP_22, -n7 / 2, -n6, n9 + -16777216);
                RenderSystem.popMatrix();
                ++n;
            }
            RenderSystem.disableBlend();
            RenderSystem.popMatrix();
        }
    }

    @Override
    public void id_class(NQ nQ, NI nI) {
        if (nI.id_protected() != null) {
            rgP_2 rgP_22 = nI.id_protected();
            if (!this.id_throws.isEmpty()) {
                for (uK_2 uK_22 : this.id_throws) {
                    if (!uK_22.id_class().equals(rgP_22)) continue;
                    uK_22.id_class(new rjU_2(nQ.id_final(), nQ.id_package(), nQ.id_int()));
                    return;
                }
            }
            this.id_throws.add(new uK_2(this, rgP_22, new rjU_2(nQ.id_final(), nQ.id_package(), nQ.id_int())));
        }
    }
}

