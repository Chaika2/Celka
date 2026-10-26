/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rCF;
import celestial.rCZ;
import celestial.rCn_1;
import celestial.rTv_1;
import celestial.rVL;
import celestial.rcL_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.rqV_2;
import celestial.rql_3;
import celestial.rqu_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rco_3 {
    private static final Logger id_class = LogManager.getLogger();

    public static xc_3 id_byte(rcd_3 rcd_32) {
        if (!rcd_32.id_byte("Name", 8)) {
            return xu_3.id_class.id_continue();
        }
        xd_3 xd_32 = rVL.id_strictfp.id_class(new rqO_2(rcd_32.id_native("Name")));
        xc_3 xc_32 = xd_32.id_continue();
        if (rcd_32.id_byte("Properties", 10)) {
            rcd_3 rcd_33 = rcd_32.id_int("Properties");
            rCF<xd_3, xc_3> rCF2 = xd_32.id_new();
            for (String string : rcd_33.id_protected()) {
                rCZ<?> rCZ2 = rCF2.id_class(string);
                if (rCZ2 == null) continue;
                xc_32 = rco_3.id_class(xc_32, rCZ2, string, rcd_33, rcd_32);
            }
        }
        return xc_32;
    }

    private static <S extends rCn_1<?, S>, T extends Comparable<T>> S id_class(S s, rCZ<T> rCZ2, String string, rcd_3 rcd_32, rcd_3 rcd_33) {
        Optional<T> optional = rCZ2.id_break(rcd_32.id_native(string));
        if (optional.isPresent()) {
            return (S)((rCn_1)s.id_class(rCZ2, (Comparable)((Comparable)optional.get())));
        }
        id_class.warn("Unable to read property: {} with value: {} for blockstate: {}", (Object)string, (Object)rcd_32.id_native(string), (Object)rcd_33.toString());
        return s;
    }

    public static rcd_3 id_class(xc_3 xc_32) {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("Name", rVL.id_strictfp.id_break(xc_32.id_break()).toString());
        ImmutableMap<rCZ<?>, Comparable<?>> immutableMap = xc_32.id_goto();
        if (!immutableMap.isEmpty()) {
            rcd_3 rcd_33 = new rcd_3();
            for (Map.Entry entry : immutableMap.entrySet()) {
                rCZ rCZ2 = (rCZ)entry.getKey();
                rcd_33.id_class(rCZ2.id_throws(), rco_3.id_class(rCZ2, (Comparable)entry.getValue()));
            }
            rcd_32.id_class("Properties", rcd_33);
        }
        return rcd_32;
    }

    private static <T extends Comparable<T>> String id_class(rCZ<T> rCZ2, Comparable<?> comparable) {
        return rCZ2.id_class(comparable);
    }

    public static rcd_3 id_class(DataFixer dataFixer, rTv_1 rTv_12, rcd_3 rcd_32, int n) {
        return rco_3.id_class(dataFixer, rTv_12, rcd_32, n, rqu_3.id_class().getWorldVersion());
    }

    public static rcd_3 id_class(DataFixer dataFixer, rTv_1 rTv_12, rcd_3 rcd_32, int n, int n2) {
        return (rcd_3)dataFixer.update(rTv_12.id_class(), new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_32), n, n2).getValue();
    }

    public static rcd_3 id_class(rfH_2 rfH_22) {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_break("X", rfH_22.b_());
        rcd_32.id_break("Y", rfH_22.c_());
        rcd_32.id_break("Z", rfH_22.d_());
        return rcd_32;
    }

    public static boolean id_class(rcZ_2 rcZ_22, rcZ_2 rcZ_23, boolean bl) {
        if (rcZ_22 == rcZ_23) {
            return true;
        }
        if (rcZ_22 == null) {
            return true;
        }
        if (rcZ_23 == null) {
            return false;
        }
        if (!rcZ_22.getClass().equals(rcZ_23.getClass())) {
            return false;
        }
        if (rcZ_22 instanceof rcd_3) {
            rcd_3 rcd_32 = (rcd_3)rcZ_22;
            rcd_3 rcd_33 = (rcd_3)rcZ_23;
            for (String string : rcd_32.id_protected()) {
                rcZ_2 rcZ_24 = rcd_32.id_byte(string);
                if (rco_3.id_class(rcZ_24, rcd_33.id_byte(string), bl)) continue;
                return false;
            }
            return true;
        }
        if (rcZ_22 instanceof rcy_3 && bl) {
            rcy_3 rcy_32 = (rcy_3)rcZ_22;
            rcy_3 rcy_33 = (rcy_3)rcZ_23;
            if (rcy_32.isEmpty()) {
                return rcy_33.isEmpty();
            }
            for (int i = 0; i < rcy_32.size(); ++i) {
                rcZ_2 rcZ_25 = rcy_32.id_finally(i);
                boolean bl2 = false;
                for (int j = 0; j < rcy_33.size(); ++j) {
                    if (!rco_3.id_class(rcZ_25, rcy_33.id_finally(j), bl)) continue;
                    bl2 = true;
                    break;
                }
                if (bl2) continue;
                return false;
            }
            return true;
        }
        return rcZ_22.equals(rcZ_23);
    }

    public static rcL_2 id_class(UUID uUID) {
        return new rcL_2(rqV_2.id_class(uUID));
    }

    public static UUID id_class(rcZ_2 rcZ_22) {
        if (rcZ_22.id_break() != rcL_2.id_class) {
            throw new IllegalArgumentException("Expected UUID-Tag to be of type " + rcL_2.id_class.id_class() + ", but found " + rcZ_22.id_break().id_class() + ".");
        }
        int[] nArray = ((rcL_2)rcZ_22).id_case();
        if (nArray.length != 4) {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + nArray.length + ".");
        }
        return rqV_2.id_class(nArray);
    }

    public static rcd_3 id_class(rcd_3 rcd_32, GameProfile gameProfile) {
        if (!rql_3.id_break(gameProfile.getName())) {
            rcd_32.id_class("Name", gameProfile.getName());
        }
        if (gameProfile.getId() != null) {
            rcd_32.id_class("Id", gameProfile.getId());
        }
        if (!gameProfile.getProperties().isEmpty()) {
            rcd_3 rcd_33 = new rcd_3();
            for (String string : gameProfile.getProperties().keySet()) {
                rcy_3 rcy_32 = new rcy_3();
                for (Property property : gameProfile.getProperties().get((Object)string)) {
                    rcd_3 rcd_34 = new rcd_3();
                    rcd_34.id_class("Value", property.getValue());
                    if (property.hasSignature()) {
                        rcd_34.id_class("Signature", property.getSignature());
                    }
                    rcy_32.add(rcd_34);
                }
                rcd_33.id_class(string, rcy_32);
            }
            rcd_32.id_class("Properties", rcd_33);
        }
        return rcd_32;
    }

    public static GameProfile id_class(rcd_3 rcd_32) {
        String string = null;
        UUID uUID = null;
        if (rcd_32.id_byte("Name", 8)) {
            string = rcd_32.id_native("Name");
        }
        if (rcd_32.id_break("Id")) {
            uUID = rcd_32.id_class("Id");
        }
        try {
            GameProfile gameProfile = new GameProfile(uUID, string);
            if (rcd_32.id_byte("Properties", 10)) {
                rcd_3 rcd_33 = rcd_32.id_int("Properties");
                for (String string2 : rcd_33.id_protected()) {
                    rcy_3 rcy_32 = rcd_33.id_protected(string2, 10);
                    for (int i = 0; i < rcy_32.size(); ++i) {
                        rcd_3 rcd_34 = rcy_32.id_class(i);
                        String string3 = rcd_34.id_native("Value");
                        if (rcd_34.id_byte("Signature", 8)) {
                            gameProfile.getProperties().put((Object)string2, (Object)new Property(string2, string3, rcd_34.id_native("Signature")));
                            continue;
                        }
                        gameProfile.getProperties().put((Object)string2, (Object)new Property(string2, string3));
                    }
                }
            }
            return gameProfile;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static rfH_2 id_break(rcd_3 rcd_32) {
        return new rfH_2(rcd_32.id_private("X"), rcd_32.id_private("Y"), rcd_32.id_private("Z"));
    }
}

