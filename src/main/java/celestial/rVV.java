/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVj_1;
import celestial.rVo_1;
import celestial.rgA_2;
import celestial.rgL_2;
import celestial.rgM_2;
import celestial.rgS_2;
import celestial.rgc_3;
import java.util.Optional;

public class rVV
implements rgM_2<rgS_2> {
    private final rgA_2 id_break = new rgA_2();
    public final /* synthetic */ rVo_1 id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rVV(rVj_1 rVj_12, rVo_1 rVo_12) {
        this.id_class = rVo_12;
    }

    @Override
    public Optional<rgS_2> accept(rgc_3 rgc_32, String string) {
        this.id_class.id_break();
        if (!rgL_2.id_byte(string, rgc_32, this.id_class)) {
            String string2 = string.substring(0, this.id_class.id_class());
            if (!string2.isEmpty()) {
                this.id_break.id_class(rgS_2.id_class(string2, rgc_32));
            }
            return Optional.of(this.id_break.id_break());
        }
        if (!string.isEmpty()) {
            this.id_break.id_class(rgS_2.id_class(string, rgc_32));
        }
        return Optional.empty();
    }
}

