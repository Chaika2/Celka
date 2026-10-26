/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRO;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rxK_2;
import celestial.rye_3;

public class rpQ_2 {
    private int id_class = this.id_protected();
    private float id_break = 5.0f;
    private float id_byte;
    private int id_protected;

    public float id_byte() {
        return this.id_break;
    }

    public void id_class(int n) {
        this.id_class = n;
    }

    public void id_class(float f) {
        this.id_byte = Math.min(this.id_byte + f, 40.0f);
    }

    public int id_class() {
        return this.id_class;
    }

    public void id_class(rhd_3 rhd_32) {
        boolean bl;
        rRO rRO2 = ((rYB)rhd_32.id_throws[7]).id_abstract();
        if (this.id_byte > 4.0f) {
            this.id_byte -= 4.0f;
            if (this.id_break > 0.0f) {
                this.id_break = Math.max(this.id_break - 1.0f, 0.0f);
            } else if (rRO2 != rRO.PEACEFUL) {
                this.id_class = Math.max(this.id_class - 1, 0);
            }
        }
        if ((bl = ((rYB)rhd_32.id_throws[7]).B().id_break(rRu_1.id_implements)) && this.id_break > 0.0f && rhd_32.sA() && this.id_class >= this.id_protected()) {
            ++this.id_protected;
            if (this.id_protected >= 10) {
                float f = Math.min(this.id_break, 6.0f);
                rhd_32.id_protected(f / 6.0f);
                this.id_class(f);
                this.id_protected = 0;
            }
        } else if (bl && this.id_class >= 18 && rhd_32.sA()) {
            ++this.id_protected;
            if (this.id_protected >= 80) {
                rhd_32.id_protected(1.0f);
                this.id_class(6.0f);
                this.id_protected = 0;
            }
        } else if (this.id_class <= 0) {
            ++this.id_protected;
            if (this.id_protected >= 80) {
                if (rhd_32.Ss() > 10.0f || rRO2 == rRO.HARD || rhd_32.Ss() > 1.0f && rRO2 == rRO.NORMAL) {
                    rhd_32.id_break(rye_3.id_implements, 1.0f);
                }
                this.id_protected = 0;
            }
        } else {
            this.id_protected = 0;
        }
    }

    public void id_class(int n, float f) {
        this.id_class = Math.min(n + this.id_class, this.id_protected());
        this.id_break = Math.min(this.id_break + (float)n * f * 2.0f, (float)this.id_class);
    }

    public void id_class(rcd_3 rcd_32) {
        if (rcd_32.id_byte("foodLevel", 99)) {
            this.id_class = rcd_32.id_private("foodLevel");
            this.id_protected = rcd_32.id_private("foodTickTimer");
            this.id_break = rcd_32.id_finally("foodSaturationLevel");
            this.id_byte = rcd_32.id_finally("foodExhaustionLevel");
        }
    }

    public void id_class(rdb_3 rdb_32, rdn_3 rdn_32) {
        if (rdb_32.id_super()) {
            rxK_2 rxK_22 = rdb_32.id_this();
            this.id_class(rxK_22.id_class(), rxK_22.id_break());
        }
    }

    public void id_break(float f) {
        this.id_break = f;
    }

    public void id_break(rcd_3 rcd_32) {
        rcd_32.id_break("foodLevel", this.id_class);
        rcd_32.id_break("foodTickTimer", this.id_protected);
        rcd_32.id_class("foodSaturationLevel", this.id_break);
        rcd_32.id_class("foodExhaustionLevel", this.id_byte);
    }

    public boolean id_break() {
        return this.id_class < this.id_protected();
    }

    public int id_protected() {
        return 20;
    }
}

