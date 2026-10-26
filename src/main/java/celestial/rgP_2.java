/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 */
package celestial;

import celestial.rVi_1;
import celestial.rgM_2;
import celestial.rgN_2;
import celestial.rgO_2;
import celestial.rgS_2;
import celestial.rgc_3;
import celestial.rpl_3;
import celestial.rql_3;
import celestial.rrLb_1;
import celestial.rrQX;
import com.mojang.brigadier.Message;
import java.util.List;
import java.util.Optional;

public interface rgP_2
extends Message,
rgS_2 {
    public static rgP_2 id_byte(String string) {
        return string != null ? new rgN_2(string) : rgN_2.id_byte;
    }

    default public String id_byte() {
        return rql_3.id_class(this.getString());
    }

    @Override
    default public <T> Optional<T> id_class(rgM_2<T> rgM_22, rgc_3 rgc_32) {
        rgc_3 rgc_33 = this.id_class().id_class(rgc_32);
        Optional<T> optional = this.id_break(rgM_22, rgc_33);
        if (optional.isPresent()) {
            return optional;
        }
        for (rgP_2 rgP_22 : this.id_protected()) {
            Optional<T> optional2 = rgP_22.id_class(rgM_22, rgc_33);
            if (!optional2.isPresent()) continue;
            return optional2;
        }
        return Optional.empty();
    }

    @Override
    default public <T> Optional<T> id_class(rgO_2<T> rgO_22) {
        Optional<T> optional = this.id_break(rgO_22);
        if (optional.isPresent()) {
            return optional;
        }
        for (rgP_2 rgP_22 : this.id_protected()) {
            Optional<T> optional2 = rgP_22.id_class(rgO_22);
            if (!optional2.isPresent()) continue;
            return optional2;
        }
        return Optional.empty();
    }

    default public String id_class(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        this.id_class(string -> {
            int n2 = n - stringBuilder.length();
            if (n2 <= 0) {
                return id_class;
            }
            stringBuilder.append(string.length() <= n2 ? string : string.substring(0, n2));
            return Optional.empty();
        });
        return stringBuilder.toString();
    }

    public rgc_3 id_class();

    default public <T> Optional<T> id_break(rgO_2<T> rgO_22) {
        return rgO_22.accept(this.id_break());
    }

    default public <T> Optional<T> id_break(rgM_2<T> rgM_22, rgc_3 rgc_32) {
        rrLb_1 rrLb_12 = rrLb_1.id_class(this.id_break());
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLb_12);
        return rgM_22.accept(rgc_32, rrLb_12.id_class());
    }

    public String id_break();

    public rVi_1 id_throws();

    @Override
    default public String getString() {
        return rgS_2.super.getString();
    }

    public rpl_3 id_catch();

    public rVi_1 id_case();

    public List<rgP_2> id_protected();
}

