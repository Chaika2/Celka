/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.VB;
import celestial.jC_2;
import celestial.jI_2;
import celestial.jj_3;
import celestial.rAC;
import celestial.rAL;
import celestial.rAn_1;
import celestial.rgX_2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jV_2
implements rAn_1 {
    private static final Logger id_break = LogManager.getLogger();
    public static final jj_3 id_class = new jj_3("en_us", "US", "English", false);
    private Map<String, jj_3> id_byte = ImmutableMap.of((Object)"en_us", (Object)id_class);
    private String id_protected;
    private jj_3 id_throws = id_class;

    public SortedSet<jj_3> id_byte() {
        return Sets.newTreeSet(this.id_byte.values());
    }

    public jV_2(String string) {
        this.id_protected = string;
    }

    public jj_3 id_class(String string) {
        return this.id_byte.get(string);
    }

    public static Map<String, jj_3> id_class(Stream<rAC> stream) {
        HashMap hashMap = Maps.newHashMap();
        stream.forEach(rAC2 -> {
            try {
                VB vB = rAC2.id_class(VB.id_class);
                if (vB != null) {
                    for (jj_3 jj_32 : vB.id_class()) {
                        hashMap.putIfAbsent(jj_32.getCode(), jj_32);
                    }
                }
            }
            catch (IOException | RuntimeException exception) {
                id_break.warn("Unable to parse language metadata section of resourcepack: {}", (Object)rAC2.id_class(), (Object)exception);
            }
        });
        return ImmutableMap.copyOf((Map)hashMap);
    }

    @Override
    public void id_class(rAL rAL2) {
        this.id_byte = jV_2.id_class(rAL2.id_break());
        jj_3 jj_32 = this.id_byte.getOrDefault("en_us", id_class);
        this.id_throws = this.id_byte.getOrDefault(this.id_protected, jj_32);
        ArrayList arrayList = Lists.newArrayList((Object[])new jj_3[]{jj_32});
        if (this.id_throws != jj_32) {
            arrayList.add(this.id_throws);
        }
        jC_2 jC_22 = jC_2.id_class(rAL2, arrayList);
        jI_2.id_class(jC_22);
        rgX_2.id_class(jC_22);
    }

    public void id_class(jj_3 jj_32) {
        this.id_protected = jj_32.getCode();
        this.id_throws = jj_32;
    }

    public jj_3 id_break() {
        return this.id_throws;
    }
}

