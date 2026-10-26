/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.UnmodifiableIterator
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.datafixers.DataFixer
 *  it.unimi.dsi.fastutil.objects.Object2FloatMap
 *  it.unimi.dsi.fastutil.objects.Object2FloatMaps
 *  it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfj_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.roe_3;
import celestial.roj_3;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.rrEi_1;
import celestial.rrGk_1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rTM {
    private static final Logger id_class = LogManager.getLogger();
    private static final ThreadFactory id_break = new ThreadFactoryBuilder().setDaemon(true).build();
    private final ImmutableSet<rqM_2<rYB>> id_byte;
    private final boolean id_protected;
    private final rrGk_1 id_throws;
    private final Thread id_case;
    private final DataFixer id_catch;
    private volatile boolean id_private = true;
    private volatile boolean id_implements;
    private volatile float id_finally;
    private volatile int id_extends;
    private volatile int id_native;
    private volatile int id_volatile;
    private final Object2FloatMap<rqM_2<rYB>> id_final = Object2FloatMaps.synchronize((Object2FloatMap)new Object2FloatOpenCustomHashMap(rqR_2.id_extends()));
    private volatile rgP_2 id_package = new rgn_3("optimizeWorld.stage.counting");
    private static final Pattern id_int = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
    private final rrEi_1 id_new;

    public ImmutableSet<rqM_2<rYB>> id_byte() {
        return this.id_byte;
    }

    public rTM(rrGk_1 rrGk_12, DataFixer dataFixer, ImmutableSet<rqM_2<rYB>> immutableSet, boolean bl) {
        this.id_byte = immutableSet;
        this.id_protected = bl;
        this.id_catch = dataFixer;
        this.id_throws = rrGk_12;
        this.id_new = new rrEi_1(new File(this.id_throws.id_class(rYB.id_byte), "data"), dataFixer);
        this.id_case = id_break.newThread(this::id_implements);
        this.id_case.setUncaughtExceptionHandler((thread, throwable) -> {
            id_class.error("Error upgrading world", throwable);
            this.id_package = new rgn_3("optimizeWorld.stage.failed");
            this.id_implements = true;
        });
        this.id_case.start();
    }

    public void id_class() {
        this.id_private = false;
        try {
            this.id_case.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    public float id_class(rqM_2<rYB> rqM_22) {
        return this.id_final.getFloat(rqM_22);
    }

    private List<rfj_3> id_break(rqM_2<rYB> rqM_22) {
        File file2 = this.id_throws.id_class(rqM_22);
        File file3 = new File(file2, "region");
        File[] fileArray = file3.listFiles((file, string) -> string.endsWith(".mca"));
        if (fileArray == null) {
            return ImmutableList.of();
        }
        ArrayList arrayList = Lists.newArrayList();
        for (File file4 : fileArray) {
            Matcher matcher = id_int.matcher(file4.getName());
            if (!matcher.matches()) continue;
            int n = Integer.parseInt(matcher.group(1)) << 5;
            int n2 = Integer.parseInt(matcher.group(2)) << 5;
            try (roe_3 roe_32 = new roe_3(file4, file3, true);){
                for (int i = 0; i < 32; ++i) {
                    for (int j = 0; j < 32; ++j) {
                        rfj_3 rfj_32 = new rfj_3(i + n, j + n2);
                        if (!roe_32.id_break(rfj_32)) continue;
                        arrayList.add(rfj_32);
                    }
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return arrayList;
    }

    public boolean id_break() {
        return this.id_implements;
    }

    public int id_throws() {
        return this.id_extends;
    }

    public int id_catch() {
        return this.id_volatile;
    }

    public int id_case() {
        return this.id_native;
    }

    private void id_implements() {
        ImmutableMap.Builder builder;
        this.id_extends = 0;
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        for (rqM_2 rqM_22 : this.id_byte) {
            builder = this.id_break(rqM_22);
            builder2.put((Object)rqM_22, builder.listIterator());
            this.id_extends += builder.size();
        }
        if (this.id_extends == 0) {
            this.id_implements = true;
        } else {
            rqM_2 rqM_22;
            float f = this.id_extends;
            rqM_22 = builder2.build();
            builder = ImmutableMap.builder();
            for (rqM_2 rqM_23 : this.id_byte) {
                File file = this.id_throws.id_class(rqM_23);
                builder.put((Object)rqM_23, (Object)new roj_3(new File(file, "region"), this.id_catch, true));
            }
            UnmodifiableIterator unmodifiableIterator = builder.build();
            long l = rqR_2.id_break();
            this.id_package = new rgn_3("optimizeWorld.stage.upgrading");
            while (this.id_private) {
                boolean bl = false;
                float f2 = 0.0f;
                for (rqM_2 rqM_24 : this.id_byte) {
                    ListIterator listIterator = (ListIterator)rqM_22.get(rqM_24);
                    roj_3 roj_32 = (roj_3)unmodifiableIterator.get((Object)rqM_24);
                    if (listIterator.hasNext()) {
                        rfj_3 rfj_32 = (rfj_3)listIterator.next();
                        boolean bl2 = false;
                        try {
                            rcd_3 rcd_32 = roj_32.id_class(rfj_32);
                            if (rcd_32 != null) {
                                boolean bl3;
                                int n = roj_3.id_class(rcd_32);
                                rcd_3 rcd_33 = roj_32.id_class(rqM_24, () -> this.id_new, rcd_32);
                                rcd_3 rcd_34 = rcd_33.id_int("Level");
                                rfj_3 rfj_33 = new rfj_3(rcd_34.id_private("xPos"), rcd_34.id_private("zPos"));
                                if (!rfj_33.equals(rfj_32)) {
                                    id_class.warn("Chunk {} has invalid position {}", (Object)rfj_32, (Object)rfj_33);
                                }
                                boolean bl4 = bl3 = n < rqu_3.id_class().getWorldVersion();
                                if (this.id_protected) {
                                    bl3 = bl3 || rcd_34.id_throws("Heightmaps");
                                    rcd_34.id_continue("Heightmaps");
                                    bl3 = bl3 || rcd_34.id_throws("isLightOn");
                                    rcd_34.id_continue("isLightOn");
                                }
                                if (bl3) {
                                    roj_32.id_class(rfj_32, rcd_33);
                                    bl2 = true;
                                }
                            }
                        }
                        catch (KU kU) {
                            Throwable throwable = kU.getCause();
                            if (!(throwable instanceof IOException)) {
                                throw kU;
                            }
                            id_class.error("Error upgrading chunk {}", (Object)rfj_32, (Object)throwable);
                        }
                        catch (IOException iOException) {
                            id_class.error("Error upgrading chunk {}", (Object)rfj_32, (Object)iOException);
                        }
                        if (bl2) {
                            ++this.id_native;
                        } else {
                            ++this.id_volatile;
                        }
                        bl = true;
                    }
                    float f3 = (float)listIterator.nextIndex() / f;
                    this.id_final.put((Object)rqM_24, f3);
                    f2 += f3;
                }
                this.id_finally = f2;
                if (bl) continue;
                this.id_private = false;
            }
            this.id_package = new rgn_3("optimizeWorld.stage.finished");
            for (roj_3 roj_33 : unmodifiableIterator.values()) {
                try {
                    roj_33.close();
                }
                catch (IOException iOException) {
                    id_class.error("Error upgrading chunk", (Throwable)iOException);
                }
            }
            this.id_new.id_class();
            l = rqR_2.id_break() - l;
            id_class.info("World optimizaton finished after {} ms", (Object)l);
            this.id_implements = true;
        }
    }

    public float id_protected() {
        return this.id_finally;
    }

    public rgP_2 id_private() {
        return this.id_package;
    }
}

