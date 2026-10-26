/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgM_2;
import celestial.rgO_2;
import celestial.rgS_2;
import celestial.rgc_3;
import java.util.Optional;

public class rgE_2
implements rgS_2 {
    public final /* synthetic */ String id_byte;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rgE_2(String string) {
        this.id_byte = string;
    }

    @Override
    public <T> Optional<T> id_class(rgO_2<T> rgO_22) {
        return rgO_22.accept(this.id_byte);
    }

    @Override
    public <T> Optional<T> id_class(rgM_2<T> rgM_22, rgc_3 rgc_32) {
        return rgM_22.accept(rgc_32, this.id_byte);
    }
}

