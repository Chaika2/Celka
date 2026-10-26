/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgM_2;
import celestial.rgO_2;
import celestial.rgS_2;
import celestial.rgc_3;
import java.util.Optional;

public class rgG_2
implements rgS_2 {
    public final /* synthetic */ String id_byte;
    public final /* synthetic */ rgc_3 id_protected;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rgG_2(String string, rgc_3 rgc_32) {
        this.id_byte = string;
        this.id_protected = rgc_32;
    }

    @Override
    public <T> Optional<T> id_class(rgO_2<T> rgO_22) {
        return rgO_22.accept(this.id_byte);
    }

    @Override
    public <T> Optional<T> id_class(rgM_2<T> rgM_22, rgc_3 rgc_32) {
        return rgM_22.accept(this.id_protected.id_class(rgc_32), this.id_byte);
    }
}

