/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.reflect.TypeToken
 */
package celestial;

import celestial.rpk_3;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;

public class rpd_3
implements TypeAdapterFactory {
    public String id_class(Object object) {
        return object instanceof Enum ? ((Enum)object).name().toLowerCase(Locale.ROOT) : object.toString().toLowerCase(Locale.ROOT);
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class clazz = typeToken.getRawType();
        if (!clazz.isEnum()) {
            return null;
        }
        HashMap hashMap = Maps.newHashMap();
        for (Object t : clazz.getEnumConstants()) {
            hashMap.put(this.id_class(t), t);
        }
        return new rpk_3(this, hashMap);
    }
}

