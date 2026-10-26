/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.an_3;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgr_3;
import celestial.rgy_3;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class rgv_3 {
    public static rgP_2 id_class(Message message) {
        return message instanceof rgP_2 ? (rgP_2)message : new rgN_2(message.getString());
    }

    public static rVi_1 id_class(rgP_2 rgP_22) {
        return new rgn_3("chat.square_brackets", rgP_22);
    }

    public static rVi_1 id_class(rVi_1 rVi_12, rgy_3 rgy_32) {
        return rVi_12.id_case().id_class(rVi_12.id_class().id_class(rgy_32));
    }

    public static rVi_1 id_class(rVi_1 rVi_12, rgl_3 rgl_32) {
        return rVi_12.id_case().id_class(rVi_12.id_class().id_class(rgl_32));
    }

    public static rVi_1 id_class(rVi_1 rVi_12, rgy_3 rgy_32, rgl_3 rgl_32) {
        return rgv_3.id_class(rgv_3.id_class(rVi_12, rgl_32), rgy_32);
    }

    public static rVi_1 id_class(rVi_1 rVi_12, rgc_3 rgc_32) {
        if (rgc_32.id_catch()) {
            return rVi_12;
        }
        rgc_3 rgc_33 = rVi_12.id_class();
        if (rgc_33.id_catch()) {
            return rVi_12.id_class(rgc_32);
        }
        return rgc_33.equals(rgc_32) ? rVi_12 : rVi_12.id_class(rgc_33.id_class(rgc_32));
    }

    public static rVi_1 id_class(gy_3 gy_32, rgP_2 rgP_22, an_3 an_32, int n) throws CommandSyntaxException {
        if (n > 100) {
            return rgP_22.id_case();
        }
        rVi_1 rVi_12 = rgP_22 instanceof rgr_3 ? ((rgr_3)((Object)rgP_22)).id_class(gy_32, an_32, n + 1) : rgP_22.id_throws();
        for (rgP_2 rgP_23 : rgP_22.id_protected()) {
            rVi_12.id_class(rgv_3.id_class(gy_32, rgP_23, an_32, n + 1));
        }
        return rVi_12.id_break(rgv_3.id_class(gy_32, rgP_22.id_class(), an_32, n));
    }

    private static rgc_3 id_class(gy_3 gy_32, rgc_3 rgc_32, an_3 an_32, int n) throws CommandSyntaxException {
        rgP_2 rgP_22;
        rgy_3 rgy_32 = rgc_32.id_implements();
        if (rgy_32 != null && (rgP_22 = rgy_32.id_class(rgp_3.id_class)) != null) {
            rgy_3 rgy_33 = new rgy_3(rgp_3.id_class, rgv_3.id_class(gy_32, rgP_22, an_32, n + 1));
            return rgc_32.id_class(rgy_33);
        }
        return rgc_32;
    }

    public static <T extends Comparable<T>> rgP_2 id_class(Collection<T> collection, Function<T, rgP_2> function) {
        if (collection.isEmpty()) {
            return rgN_2.id_byte;
        }
        if (collection.size() == 1) {
            return function.apply((Comparable)collection.iterator().next());
        }
        ArrayList arrayList = Lists.newArrayList(collection);
        arrayList.sort(Comparable::compareTo);
        return rgv_3.id_break(arrayList, function);
    }

    public static rgP_2 id_class(Collection<String> collection) {
        return rgv_3.id_class(collection, (T string) -> new rgN_2((String)string).id_class(rgF_2.GREEN));
    }

    public static rgP_2 id_class(GameProfile gameProfile) {
        if (gameProfile.getName() != null) {
            return new rgN_2(gameProfile.getName());
        }
        return gameProfile.getId() != null ? new rgN_2(gameProfile.getId().toString()) : new rgN_2("(unknown)");
    }

    public static <T> rVi_1 id_break(Collection<T> collection, Function<T, rgP_2> function) {
        if (collection.isEmpty()) {
            return new rgN_2("");
        }
        if (collection.size() == 1) {
            return function.apply(collection.iterator().next()).id_case();
        }
        rgN_2 rgN_22 = new rgN_2("");
        boolean bl = true;
        for (T t : collection) {
            if (!bl) {
                rgN_22.id_class(new rgN_2(", ").id_class(rgF_2.GRAY));
            }
            rgN_22.id_class(function.apply(t));
            bl = false;
        }
        return rgN_22;
    }
}

