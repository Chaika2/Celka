/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgM_2;
import celestial.rgO_2;
import celestial.rgS_2;
import celestial.rgc_3;
import java.util.List;
import java.util.Optional;

public class rgb_3
implements rgS_2 {
    public final /* synthetic */ List id_byte;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rgb_3(List list) {
        this.id_byte = list;
    }

    @Override
    public <T> Optional<T> id_class(rgO_2<T> rgO_22) {
        for (rgS_2 rgS_22 : this.id_byte) {
            Optional<T> optional = rgS_22.id_class(rgO_22);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    @Override
    public <T> Optional<T> id_class(rgM_2<T> rgM_22, rgc_3 rgc_32) {
        for (rgS_2 rgS_22 : this.id_byte) {
            Optional<T> optional = rgS_22.id_class(rgM_22, rgc_32);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }
}

