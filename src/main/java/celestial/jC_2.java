/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Vg_1;
import celestial.jj_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rgS_2;
import celestial.rgX_2;
import celestial.rpl_3;
import celestial.rqO_2;
import celestial.rrba_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jC_2
extends rgX_2 {
    private static final Logger id_class = LogManager.getLogger();
    private final Map<String, String> id_break;
    private final boolean id_byte;

    private jC_2(Map<String, String> map, boolean bl) {
        this.id_break = map;
        this.id_byte = bl;
    }

    @Override
    public rpl_3 id_class(rgS_2 rgS_22) {
        return Vg_1.id_class(rgS_22, this.id_byte);
    }

    @Override
    public boolean id_class() {
        return this.id_byte;
    }

    public static jC_2 id_class(rAL rAL2, List<jj_3> list) {
        HashMap hashMap = Maps.newHashMap();
        boolean bl = false;
        for (jj_3 jj_32 : list) {
            bl |= jj_32.id_class();
            String string = jj_32.getCode();
            String string2 = "ru_ru".equals(string) ? "celestial/lang/ru_ru.json" : ("en_us".equals(string) ? "celestial/lang/en_us.json" : String.format("lang/%s.json", string));
            for (String string3 : rAL2.id_class()) {
                try {
                    rqO_2 rqO_22 = new rqO_2(string3, string2);
                    jC_2.id_class(rAL2.id_byte(rqO_22), hashMap);
                    rrba_3.id_class(rAL2, string, (Map<String, String>)hashMap);
                }
                catch (FileNotFoundException fileNotFoundException) {
                }
                catch (Exception exception) {
                    id_class.warn("Skipped language file: {}:{} ({})", (Object)string3, (Object)string2, (Object)exception.toString());
                }
            }
        }
        return new jC_2((Map<String, String>)ImmutableMap.copyOf((Map)hashMap), bl);
    }

    @Override
    public String id_class(String string) {
        return this.id_break.getOrDefault(string, string);
    }

    private static void id_class(List<rAF> list, Map<String, String> map) {
        for (rAF rAF2 : list) {
            try {
                InputStream inputStream = rAF2.id_break();
                try {
                    rgX_2.id_class(inputStream, map::put);
                }
                finally {
                    if (inputStream == null) continue;
                    inputStream.close();
                }
            }
            catch (IOException iOException) {
                id_class.warn("Failed to load translations from {}", (Object)rAF2, (Object)iOException);
            }
        }
    }

    @Override
    public boolean id_break(String string) {
        return this.id_break.containsKey(string);
    }

    public Map<String, String> id_break() {
        return this.id_break;
    }
}

