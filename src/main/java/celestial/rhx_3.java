/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;

public class rhx_3 {
    public boolean id_class;
    public boolean id_break;
    public boolean id_byte;
    public boolean id_protected;
    public boolean id_throws = true;
    private float id_case = 0.05f;
    private float id_catch = 0.1f;

    public void id_class(float f) {
        this.id_case = f;
    }

    public float id_class() {
        return this.id_case;
    }

    public void id_class(rcd_3 rcd_32) {
        rcd_3 rcd_33 = new rcd_3();
        rcd_33.id_class("invulnerable", this.id_class);
        rcd_33.id_class("flying", this.id_break);
        rcd_33.id_class("mayfly", this.id_byte);
        rcd_33.id_class("instabuild", this.id_protected);
        rcd_33.id_class("mayBuild", this.id_throws);
        rcd_33.id_class("flySpeed", this.id_case);
        rcd_33.id_class("walkSpeed", this.id_catch);
        rcd_32.id_class("abilities", rcd_33);
    }

    public void id_break(float f) {
        this.id_catch = f;
    }

    public float id_break() {
        return this.id_catch;
    }

    public void id_break(rcd_3 rcd_32) {
        if (rcd_32.id_byte("abilities", 10)) {
            rcd_3 rcd_33 = rcd_32.id_int("abilities");
            this.id_class = rcd_33.id_new("invulnerable");
            this.id_break = rcd_33.id_new("flying");
            this.id_byte = rcd_33.id_new("mayfly");
            this.id_protected = rcd_33.id_new("instabuild");
            if (rcd_33.id_byte("flySpeed", 99)) {
                this.id_case = rcd_33.id_finally("flySpeed");
                this.id_catch = rcd_33.id_finally("walkSpeed");
            }
            if (rcd_33.id_byte("mayBuild", 1)) {
                this.id_throws = rcd_33.id_new("mayBuild");
            }
        }
    }
}

