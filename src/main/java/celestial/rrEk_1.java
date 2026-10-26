/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 */
package celestial;

import celestial.rfj_3;
import celestial.rrEM;
import celestial.rrEx_1;
import com.mojang.datafixers.util.Either;

public class rrEk_1
implements rrEM {
    public final /* synthetic */ int id_class;
    public final /* synthetic */ int id_byte;
    public final /* synthetic */ int id_protected;
    public final /* synthetic */ int id_throws;
    public final /* synthetic */ Either id_case;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrEk_1(rrEx_1 rrEx_12, int n, int n2, int n3, int n4, Either either) {
        this.id_class = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
        this.id_case = either;
    }

    public String toString() {
        return "Unloaded " + new rfj_3(this.id_class + this.id_byte % (this.id_protected * 2 + 1), this.id_throws + this.id_byte / (this.id_protected * 2 + 1)) + " " + this.id_case.right().get();
    }
}

