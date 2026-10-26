/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lu_1;
import celestial.Ml_1;
import celestial.ZJ;
import celestial.Zu_1;
import celestial.cm_3;
import celestial.rRL;
import celestial.rgP_2;
import java.util.List;

public class ZN
extends Zu_1 {
    private final Lu_1 id_protected;
    public final /* synthetic */ ZJ id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public ZN(ZJ zJ, rgP_2 rgP_22, List list, String string2, rRL rRL2) {
        this.id_class = zJ;
        super(zJ, list, rgP_22);
        this.id_protected = new Lu_1((cm_3)zJ.id_volatile.id_class[15], 10, 5, 42, 20, rgP_22.id_case().id_break("\n").id_break(string2).id_break("\n"));
        this.id_protected.id_class(Integer.toString(rRL2.id_class()));
        this.id_protected.id_class((String string) -> {
            if (rRL2.id_break((String)string)) {
                this.id_protected.id_finally(0xE0E0E0);
                this.id_class.id_break(this);
            } else {
                this.id_protected.id_finally(0xFF0000);
                this.id_class.id_class(this);
            }
        });
        this.id_break.add(this.id_protected);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.id_class(ml_1, n2, n3);
        this.id_protected.id_volatile = n3 + n4 - 44;
        this.id_protected.id_final = n2;
        this.id_protected.id_class(ml_1, n6, n7, f);
    }
}

