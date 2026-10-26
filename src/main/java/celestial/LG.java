/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package celestial;

import celestial.LS;
import celestial.Lb_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.ch_3;
import celestial.jH_2;
import celestial.rZv_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rqO_2;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class LG
implements LS {
    private final GameProfile id_class;
    private final rqO_2 id_break;
    private final rgN_2 id_byte;

    @Override
    public rgP_2 id_byte() {
        return this.id_byte;
    }

    public LG(GameProfile gameProfile) {
        this.id_class = gameProfile;
        QY qY = QY.id_instanceof();
        Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = qY.id_throws().id_class(gameProfile);
        this.id_break = map.containsKey(MinecraftProfileTexture.Type.SKIN) ? qY.id_throws().id_class(map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN) : jH_2.id_class(rhd_3.id_class(gameProfile));
        this.id_byte = new rgN_2(gameProfile.getName());
    }

    @Override
    public void id_class(Lb_1 lb_1) {
        QY.id_instanceof().id_void().id_class(new rZv_1(this.id_class.getId()));
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, int n) {
        QY.id_instanceof().A().id_class(this.id_break);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, (float)n / 255.0f);
        ch_3.id_class(ml_1, 2, 2, 12, 12, 8.0f, 8.0f, 8, 8, 64, 64);
        ch_3.id_class(ml_1, 2, 2, 12, 12, 40.0f, 8.0f, 8, 8, 64, 64);
    }

    @Override
    public boolean id_protected() {
        return true;
    }
}

