/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.Property
 */
package celestial;

import celestial.rCB;
import celestial.rFy_1;
import celestial.rHf_1;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rql_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public class rys_3
extends ryO_2
implements rHf_1 {
    private static rCB id_class;
    private static MinecraftSessionService id_break;
    private GameProfile id_byte;
    private int id_protected;
    private boolean id_throws;

    public rys_3() {
        super(ryW_2.id_package);
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        String string;
        super.id_class(xc_32, rcd_32);
        if (rcd_32.id_byte("SkullOwner", 10)) {
            this.id_class(rco_3.id_class(rcd_32.id_int("SkullOwner")));
        } else if (rcd_32.id_byte("ExtraType", 8) && !rql_3.id_break(string = rcd_32.id_native("ExtraType"))) {
            this.id_class(new GameProfile((UUID)null, string));
        }
    }

    public float id_class(float f) {
        return this.id_throws ? (float)this.id_protected + f : (float)this.id_protected;
    }

    public void id_class(GameProfile gameProfile) {
        this.id_byte = gameProfile;
        this.id_private();
    }

    public static void id_class(MinecraftSessionService minecraftSessionService) {
        id_break = minecraftSessionService;
    }

    public static void id_class(rCB rCB2) {
        id_class = rCB2;
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_byte != null) {
            rcd_3 rcd_33 = new rcd_3();
            rco_3.id_class(rcd_33, this.id_byte);
            rcd_32.id_class("SkullOwner", rcd_33);
        }
        return rcd_32;
    }

    public static GameProfile id_break(GameProfile gameProfile) {
        if (gameProfile != null && !rql_3.id_break(gameProfile.getName())) {
            if (gameProfile.isComplete() && gameProfile.getProperties().containsKey((Object)"textures")) {
                return gameProfile;
            }
            if (id_class != null && id_break != null) {
                GameProfile gameProfile2 = id_class.id_class(gameProfile.getName());
                if (gameProfile2 == null) {
                    return gameProfile;
                }
                Property property = (Property)Iterables.getFirst((Iterable)gameProfile2.getProperties().get((Object)"textures"), (Object)null);
                if (property == null) {
                    gameProfile2 = id_break.fillProfileProperties(gameProfile2, true);
                }
                return gameProfile2;
            }
            return gameProfile;
        }
        return gameProfile;
    }

    @Override
    public void id_throws() {
        xc_3 xc_32 = this.id_abstract();
        if (xc_32.id_class(xu_3.sQ) || xc_32.id_class(xu_3.sN)) {
            if (this.id_extends.id_public(this.id_native)) {
                this.id_throws = true;
                ++this.id_protected;
            } else {
                this.id_throws = false;
            }
        }
    }

    public GameProfile id_catch() {
        return this.id_byte;
    }

    private void id_private() {
        this.id_byte = rys_3.id_break(this.id_byte);
        this.id_break();
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 4, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }
}

