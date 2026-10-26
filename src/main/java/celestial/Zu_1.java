/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Ml_1;
import celestial.ZJ;
import celestial.Zk_1;
import celestial.cC_2;
import celestial.cm_3;
import celestial.rgP_2;
import celestial.rpl_3;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class Zu_1
extends Zk_1 {
    private final List<rpl_3> id_class;
    protected final List<cC_2> id_break;
    public final /* synthetic */ ZJ id_byte;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public Zu_1(ZJ zJ, List list, rgP_2 rgP_22) {
        this.id_byte = zJ;
        super(zJ, list);
        this.id_break = Lists.newArrayList();
        this.id_class = ((cm_3)zJ.id_volatile.id_class[15]).id_break(rgP_22, 175);
    }

    protected void id_class(Ml_1 ml_1, int n, int n2) {
        if (this.id_class.size() == 1) {
            ((cm_3)this.id_byte.id_volatile.id_class[15]).id_break(ml_1, this.id_class.get(0), (float)n2, (float)(n + 5), 0xFFFFFF);
        } else if (this.id_class.size() >= 2) {
            ((cm_3)this.id_byte.id_volatile.id_class[15]).id_break(ml_1, this.id_class.get(0), (float)n2, (float)n, 0xFFFFFF);
            ((cm_3)this.id_byte.id_volatile.id_class[15]).id_break(ml_1, this.id_class.get(1), (float)n2, (float)(n + 10), 0xFFFFFF);
        }
    }

    @Override
    public List<? extends cC_2> x_() {
        return this.id_break;
    }
}

