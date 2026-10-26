/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.rgE_2;
import celestial.rgG_2;
import celestial.rgM_2;
import celestial.rgO_2;
import celestial.rgb_3;
import celestial.rgc_3;
import celestial.rgs_3;
import celestial.rqg_3;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface rgS_2 {
    public static final Optional<rqg_3> id_class = Optional.of(rqg_3.INSTANCE);
    public static final rgS_2 id_break = new rgs_3();

    public static rgS_2 id_class(rgS_2 ... rgS_2Array) {
        return rgS_2.id_class((List<rgS_2>)ImmutableList.copyOf((Object[])rgS_2Array));
    }

    public static rgS_2 id_class(List<rgS_2> list) {
        return new rgb_3(list);
    }

    public <T> Optional<T> id_class(rgO_2<T> var1);

    public <T> Optional<T> id_class(rgM_2<T> var1, rgc_3 var2);

    public static rgS_2 id_class(String string, rgc_3 rgc_32) {
        return new rgG_2(string, rgc_32);
    }

    default public String getString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.id_class(string -> {
            stringBuilder.append(string);
            return Optional.empty();
        });
        return stringBuilder.toString();
    }

    public static rgS_2 id_protected(String string) {
        return new rgE_2(string);
    }
}

