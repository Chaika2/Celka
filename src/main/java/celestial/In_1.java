/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.rqO_2;
import celestial.rrbY_2;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class In_1
implements Consumer<Iq_1> {
    protected final Function<rqO_2, HU> id_synchronized;
    public int id_return = 64;
    public int id_public = 32;

    public In_1(Function<rqO_2, HU> function) {
        this.id_synchronized = function;
    }

    public abstract void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8);

    public final HU id_class(rqO_2 rqO_22) {
        HU hU = this.id_synchronized.apply(rqO_22);
        if (rrbY_2.id_case() && hU.id_abstract()) {
            hU = HU.id_byte(rqO_22);
        }
        return hU;
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.a_((Iq_1)object);
    }

    public void a_(Iq_1 iq_1) {
    }
}

