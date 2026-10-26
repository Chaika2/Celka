/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.JU;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.WI;
import celestial.Wf_1;
import celestial.Ww_1;
import celestial.fZ_2;
import celestial.jH_2;
import celestial.jQ_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rhd_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rys_3;
import celestial.tg_3;
import celestial.tt_3;
import celestial.xc_3;
import celestial.zV_2;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;

public class jx_3
extends jW_2<rys_3> {
    private static final Map<WI, tt_3> id_class = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
        tt_3 tt_32 = new tt_3(0, 0, 64, 32);
        tg_3 tg_32 = new tg_3();
        jQ_2 jQ_22 = new jQ_2(0.0f);
        hashMap.put(Wf_1.SKELETON, tt_32);
        hashMap.put(Wf_1.WITHER_SKELETON, tt_32);
        hashMap.put(Wf_1.PLAYER, tg_32);
        hashMap.put(Wf_1.ZOMBIE, tg_32);
        hashMap.put(Wf_1.CREEPER, tt_32);
        hashMap.put(Wf_1.DRAGON, jQ_22);
    });
    private static final Map<WI, rqO_2> id_break = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
        hashMap.put(Wf_1.SKELETON, new rqO_2("textures/entity/skeleton/skeleton.png"));
        hashMap.put(Wf_1.WITHER_SKELETON, new rqO_2("textures/entity/skeleton/wither_skeleton.png"));
        hashMap.put(Wf_1.ZOMBIE, new rqO_2("textures/entity/zombie/zombie.png"));
        hashMap.put(Wf_1.CREEPER, new rqO_2("textures/entity/creeper/creeper.png"));
        hashMap.put(Wf_1.DRAGON, new rqO_2("textures/entity/enderdragon/dragon.png"));
        hashMap.put(Wf_1.PLAYER, jH_2.id_class());
    });

    public jx_3(jz_3 jz_32) {
        super(jz_32);
    }

    @Override
    public void id_class(rys_3 rys_32, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        float f2 = rys_32.id_class(f);
        xc_3 xc_32 = rys_32.id_abstract();
        boolean bl = xc_32.id_break() instanceof zV_2;
        rpr_3 rpr_32 = bl ? xc_32.id_byte(zV_2.id_volatile) : null;
        float f3 = 22.5f * (float)(bl ? (2 + rpr_32.id_protected()) * 4 : xc_32.id_byte(Ww_1.id_volatile));
        jx_3.id_class(rpr_32, f3, ((JU)xc_32.id_break()).id_break(), rys_32.id_catch(), f2, ml_1, hx_1, n);
    }

    private static HU id_class(WI wI, GameProfile gameProfile) {
        rqO_2 rqO_22 = id_break.get(wI);
        if (wI == Wf_1.PLAYER && gameProfile != null) {
            QY qY = QY.id_instanceof();
            Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = qY.id_throws().id_class(gameProfile);
            return map.containsKey(MinecraftProfileTexture.Type.SKIN) ? HU.id_private(qY.id_throws().id_class(map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN)) : HU.id_protected(jH_2.id_class(rhd_3.id_class(gameProfile)));
        }
        return HU.id_throws(rqO_22);
    }

    public static void id_class(rpr_3 rpr_32, float f, WI wI, GameProfile gameProfile, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        tt_3 tt_32 = id_class.get(wI);
        ml_1.id_class();
        if (rpr_32 == null) {
            ml_1.id_class(0.5, 0.0, 0.5);
        } else {
            float f3 = 0.25f;
            ml_1.id_class((double)(0.5f - (float)rpr_32.id_implements() * 0.25f), 0.25, (double)(0.5f - (float)rpr_32.id_extends() * 0.25f));
        }
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        Ok_1 ok_1 = hx_1.getBuffer(jx_3.id_class(wI, gameProfile));
        tt_32.id_class(f2, f, 0.0f);
        tt_32.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        ml_1.id_break();
    }
}

