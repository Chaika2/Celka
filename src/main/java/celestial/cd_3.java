/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rFv_1;
import celestial.rRG;
import celestial.rRM;
import celestial.rRb_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rqR_2;
import java.util.UUID;

public class cd_3
extends rRG {
    protected float id_class;
    protected long id_break;

    public cd_3(rFv_1 rFv_12) {
        super(rFv_12.id_break(), rFv_12.id_protected(), rFv_12.id_case(), rFv_12.id_catch());
        this.id_class = rFv_12.id_throws();
        this.id_protected = rFv_12.id_throws();
        this.id_break = rqR_2.id_break();
        this.id_class(rFv_12.id_private());
        this.id_break(rFv_12.id_implements());
        this.id_byte(rFv_12.id_finally());
    }

    public cd_3(UUID uUID, rgP_2 rgP_22, rRb_1 rRb_12, rRM rRM2, float f, boolean bl, boolean bl2, boolean bl3) {
        super(uUID, rgP_22, rRb_12, rRM2);
        this.id_class = f;
        this.id_protected = f;
        this.id_break = rqR_2.id_break();
        this.id_class(bl);
        this.id_break(bl2);
        this.id_byte(bl3);
    }

    @Override
    public float id_class() {
        long l = rqR_2.id_break() - this.id_break;
        float f = rfU_2.id_class((float)l / 100.0f, 0.0f, 1.0f);
        return rfU_2.id_catch(f, this.id_protected, this.id_class);
    }

    public void id_class(rFv_1 rFv_12) {
        switch (rFv_12.id_byte()) {
            case UPDATE_NAME: {
                this.id_class(rFv_12.id_protected());
                break;
            }
            case UPDATE_PCT: {
                this.id_class(rFv_12.id_throws());
                break;
            }
            case UPDATE_STYLE: {
                this.id_class(rFv_12.id_case());
                this.id_class(rFv_12.id_catch());
                break;
            }
            case UPDATE_PROPERTIES: {
                this.id_class(rFv_12.id_private());
                this.id_break(rFv_12.id_implements());
            }
        }
    }

    @Override
    public void id_class(float f) {
        this.id_protected = this.id_class();
        this.id_class = f;
        this.id_break = rqR_2.id_break();
    }
}

