/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package celestial;

import celestial.QY;
import celestial.gm_3;
import celestial.jH_2;
import celestial.rRl_1;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rnB_2;
import celestial.rqO_2;
import celestial.rrQX;
import celestial.rvo_3;
import celestial.uR_2;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;

public class Aw_1 {
    private final GameProfile id_break;
    private final Map<MinecraftProfileTexture.Type, rqO_2> id_byte = Maps.newEnumMap(MinecraftProfileTexture.Type.class);
    private rRl_1 id_protected;
    private int id_throws;
    private boolean id_case;
    private String id_catch;
    private rgP_2 id_private;
    private int id_implements;
    private int id_finally;
    private long id_extends;
    private long id_native;
    private long id_volatile;
    private boolean id_final;
    public long id_class;

    public int id_byte() {
        return this.id_throws;
    }

    public void id_byte(int n) {
        this.id_finally = n;
    }

    public void id_byte(long l) {
        this.id_volatile = l;
    }

    public long id_int() {
        return this.id_extends;
    }

    public Aw_1(rvo_3 rvo_32) {
        this.id_break = rvo_32.id_class();
        this.id_protected = rvo_32.id_byte();
        this.id_throws = rvo_32.id_break();
        this.id_private = rvo_32.id_protected();
        if (!this.id_break.getId().equals(rhd_3.id_extends(this.id_break.getName()))) {
            this.id_final = true;
        }
        this.id_class = System.currentTimeMillis();
    }

    public Aw_1(GameProfile gameProfile) {
        this.id_break = gameProfile;
    }

    public String toString() {
        return "NetworkPlayerInfo{gameProfile=" + this.id_break + ", playerTextures=" + this.id_byte + ", gameType=" + this.id_protected + ", responseTime=" + this.id_throws + ", playerTexturesLoaded=" + this.id_case + ", skinType='" + this.id_catch + "', displayName=" + this.id_private + ", lastHealth=" + this.id_implements + ", displayHealth=" + this.id_finally + ", lastHealthTime=" + this.id_extends + ", healthBlinkTime=" + this.id_native + ", renderVisibilityId=" + this.id_volatile + "}";
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_private = rgP_22;
    }

    public void id_class(long l) {
        this.id_extends = l;
    }

    public void id_class(boolean bl) {
        this.id_final = bl;
    }

    protected void id_class(int n) {
        this.id_throws = n;
    }

    protected void id_class(rRl_1 rRl_12) {
        this.id_protected = rRl_12;
    }

    public GameProfile id_class() {
        return this.id_break;
    }

    public void id_break(int n) {
        this.id_implements = n;
    }

    public void id_break(long l) {
        this.id_native = l;
    }

    public rRl_1 id_break() {
        return this.id_protected;
    }

    public String id_throws() {
        return this.id_catch == null ? jH_2.id_break(this.id_break.getId()) : this.id_catch;
    }

    public rgP_2 id_finally() {
        return uR_2.id_byte(this);
    }

    public rqO_2 id_catch() {
        this.id_native();
        return this.id_byte.get(MinecraftProfileTexture.Type.CAPE);
    }

    public String id_extends() {
        return this.id_finally().id_byte().trim();
    }

    public rqO_2 id_case() {
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_super()) {
            return jH_2.id_class(this.id_break.getId());
        }
        this.id_native();
        return (rqO_2)MoreObjects.firstNonNull((Object)this.id_byte.get(MinecraftProfileTexture.Type.SKIN), (Object)jH_2.id_class(this.id_break.getId()));
    }

    public long id_continue() {
        return this.id_volatile;
    }

    public rnB_2 id_implements() {
        gm_3 gm_32 = (gm_3)QY.id_instanceof().id_class[56];
        if (gm_32 == null) {
            return null;
        }
        return gm_32.id_package().id_private(this.id_class().getName());
    }

    public long id_new() {
        return this.id_native;
    }

    public int id_package() {
        return this.id_finally;
    }

    public boolean id_super() {
        return this.id_final;
    }

    public void id_protected(long l) {
        this.id_class = l;
    }

    public boolean id_protected() {
        return this.id_case() != null;
    }

    public rqO_2 id_private() {
        this.id_native();
        return this.id_byte.get(MinecraftProfileTexture.Type.ELYTRA);
    }

    public int id_final() {
        return this.id_implements;
    }

    public rgP_2 id_volatile() {
        return this.id_private;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void id_native() {
        Aw_1 aw_1 = this;
        synchronized (aw_1) {
            if (!this.id_case) {
                this.id_case = true;
                QY.id_instanceof().id_throws().id_class(this.id_break, (MinecraftProfileTexture.Type type, rqO_2 rqO_22, MinecraftProfileTexture minecraftProfileTexture) -> {
                    this.id_byte.put(type, rqO_22);
                    if (type == MinecraftProfileTexture.Type.SKIN) {
                        this.id_catch = minecraftProfileTexture.getMetadata("model");
                        if (this.id_catch == null) {
                            this.id_catch = "default";
                        }
                    }
                }, true);
            }
        }
    }
}

