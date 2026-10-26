/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRM;
import celestial.rRb_1;
import celestial.rgP_2;
import java.util.UUID;

public abstract class rRG {
    private final UUID id_class;
    protected rgP_2 id_byte;
    protected float id_protected;
    protected rRb_1 id_throws;
    protected rRM id_case;
    protected boolean id_catch;
    protected boolean id_private;
    protected boolean id_implements;

    public rRG id_byte(boolean bl) {
        this.id_implements = bl;
        return this;
    }

    public rRG(UUID uUID, rgP_2 rgP_22, rRb_1 rRb_12, rRM rRM2) {
        this.id_class = uUID;
        this.id_byte = rgP_22;
        this.id_throws = rRb_12;
        this.id_case = rRM2;
        this.id_protected = 1.0f;
    }

    public void id_class(rRb_1 rRb_12) {
        this.id_throws = rRb_12;
    }

    public void id_class(float f) {
        this.id_protected = f;
    }

    public rRG id_class(boolean bl) {
        this.id_catch = bl;
        return this;
    }

    public void id_class(rRM rRM2) {
        this.id_case = rRM2;
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_byte = rgP_22;
    }

    public float id_class() {
        return this.id_protected;
    }

    public rRG id_break(boolean bl) {
        this.id_private = bl;
        return this;
    }

    public rRb_1 id_finally() {
        return this.id_throws;
    }

    public rRM id_extends() {
        return this.id_case;
    }

    public rgP_2 id_implements() {
        return this.id_byte;
    }

    public UUID id_private() {
        return this.id_class;
    }

    public boolean id_final() {
        return this.id_implements;
    }

    public boolean id_volatile() {
        return this.id_private;
    }

    public boolean id_native() {
        return this.id_catch;
    }
}

