/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.rRl_1;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rvg_3;
import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class rvo_3 {
    private final int id_class;
    private final rRl_1 id_break;
    private final GameProfile id_byte;
    private final rgP_2 id_protected;

    public rRl_1 id_byte() {
        return this.id_break;
    }

    public rvo_3(rvg_3 rvg_32, GameProfile gameProfile, @Nullable int n, @Nullable rRl_1 rRl_12, rgP_2 rgP_22) {
        this.id_byte = gameProfile;
        this.id_class = n;
        this.id_break = rRl_12;
        this.id_protected = rgP_22;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("latency", this.id_class).add("gameMode", (Object)this.id_break).add("profile", (Object)this.id_byte).add("displayName", this.id_protected == null ? null : rgB_2.id_class(this.id_protected)).toString();
    }

    public GameProfile id_class() {
        return this.id_byte;
    }

    public int id_break() {
        return this.id_class;
    }

    @Nullable
    public rgP_2 id_protected() {
        return this.id_protected;
    }
}

