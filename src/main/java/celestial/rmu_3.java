/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.rmk_3;
import celestial.ruS_2;
import celestial.ruu_3;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class rmu_3
implements ruS_2<rmk_3> {
    private GameProfile id_class;

    public rmu_3() {
    }

    public rmu_3(GameProfile gameProfile) {
        this.id_class = gameProfile;
    }

    @Override
    public void id_class(rmk_3 rmk_32) {
        rmk_32.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = new GameProfile((UUID)null, ruu_32.id_throws(16));
    }

    public GameProfile id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class.getName());
    }
}

