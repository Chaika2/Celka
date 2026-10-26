/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLP;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rmF_2;
import celestial.rmJ_2;
import celestial.rmO_2;
import celestial.rmW_2;
import celestial.rnW_2;
import celestial.rqu_3;
import celestial.rud_3;
import celestial.ruv_3;

public class rmh_3
implements rmO_2 {
    private static final rgP_2 id_class = new rgN_2("Ignoring status request");
    private final rnW_2 id_break;
    private final rud_3 id_byte;

    public rmh_3(rnW_2 rnW_22, rud_3 rud_32) {
        this.id_break = rnW_22;
        this.id_byte = rud_32;
    }

    @Override
    public void id_class(rmJ_2 rmJ_22) {
        switch (rmJ_22.id_break()) {
            case LOGIN: {
                this.id_byte.id_class(ruv_3.LOGIN);
                if (rmJ_22.id_byte() != rqu_3.id_class().getProtocolVersion()) {
                    rgn_3 rgn_32 = rmJ_22.id_byte() < 754 ? new rgn_3("multiplayer.disconnect.outdated_client", rqu_3.id_class().getName()) : new rgn_3("multiplayer.disconnect.incompatible", rqu_3.id_class().getName());
                    this.id_byte.id_class(new rmF_2(rgn_32));
                    this.id_byte.id_class(rgn_32);
                    break;
                }
                this.id_byte.id_class(new rmW_2(this.id_break, this.id_byte));
                break;
            }
            case STATUS: {
                if (this.id_break.u()) {
                    this.id_byte.id_class(ruv_3.STATUS);
                    this.id_byte.id_class(new rLP(this.id_break, this.id_byte));
                    break;
                }
                this.id_byte.id_class(id_class);
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + rmJ_22.id_break());
            }
        }
    }

    @Override
    public rud_3 id_class() {
        return this.id_byte;
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
    }
}

