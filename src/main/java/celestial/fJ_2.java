/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.MT;
import celestial.fF_2;
import celestial.fN_2;
import celestial.fQ_2;
import celestial.fT_2;
import celestial.fV_2;
import celestial.fW_2;
import celestial.ff_3;
import celestial.fj_3;
import celestial.fo_3;
import celestial.fx_3;
import celestial.ji_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rJT;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrMh_1;
import celestial.rrWd_1;
import celestial.rrbY_2;
import celestial.rrbb_3;
import celestial.rrdA;
import celestial.rrdZ;
import celestial.rrdn_1;
import celestial.rrdr_1;
import celestial.rrkg_1;
import celestial.rrko_1;
import celestial.rrxr_3;
import celestial.rrzJ_2;
import celestial.yG_2;
import celestial.yX_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.awt.Dimension;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fJ_2
extends ff_3
implements fW_2 {
    private static final Logger id_finally = LogManager.getLogger();
    @Deprecated
    public static final rqO_2 id_class = rJT.id_class;
    @Deprecated
    public static final rqO_2 id_break = new rqO_2("textures/atlas/particles.png");
    private final List<fj_3> id_extends = Lists.newArrayList();
    private final Set<rqO_2> id_native = Sets.newHashSet();
    private final Map<rqO_2, fj_3> id_volatile = Maps.newHashMap();
    private final rqO_2 id_final;
    private final int id_package;
    private Map<rqO_2, fj_3> id_int = new LinkedHashMap<rqO_2, fj_3>();
    private Map<rqO_2, fj_3> id_new = new LinkedHashMap<rqO_2, fj_3>();
    private fj_3[] id_continue = null;
    private int id_super = -1;
    private int id_this = -1;
    private int id_else = -1;
    private double id_synchronized = -1.0;
    private double id_return = -1.0;
    private rrWd_1 id_public = new rrWd_1(0);
    public int id_byte = 0;
    public int id_protected = 0;
    public int id_throws = 0;
    private int id_goto;
    private int id_while;
    private boolean id_try;
    private boolean id_instanceof;
    private boolean id_throw;
    private rrdr_1 id_interface;

    private boolean id_byte(String string) {
        String string2 = string.toLowerCase();
        return string2.startsWith("optifine/");
    }

    public fj_3 id_byte(rqO_2 rqO_22) {
        return this.id_int.get(rqO_22);
    }

    public void id_byte() {
        for (fj_3 fj_32 : this.id_volatile.values()) {
            fj_32.close();
        }
        if (this.id_throw) {
            for (fj_3 fj_32 : this.id_volatile.values()) {
                fj_32.id_else();
                if (fj_32.id_extends != null) {
                    fj_32.id_extends.id_else();
                }
                if (fj_32.id_native == null) continue;
                fj_32.id_native.id_else();
            }
        }
        this.id_volatile.clear();
        this.id_extends.clear();
    }

    private static int id_byte(fj_3 fj_32) {
        fj_3 fj_33 = fj_32.id_catch;
        if (fj_33 != null) {
            fj_32.id_this();
            fj_33.id_package();
            if (fj_33.id_super()) {
                return 1;
            }
        }
        return 0;
    }

    public boolean id_int() {
        return this.id_break(rrdn_1.SPECULAR);
    }

    public fJ_2(rqO_2 rqO_22) {
        this.id_final = rqO_22;
        this.id_package = RenderSystem.maxSupportedTextureSize();
        this.id_try = rqO_22.equals(id_class);
        this.id_instanceof = rrbb_3.rs();
        this.id_throw = rrbb_3.w();
        if (this.id_try) {
            rrbb_3.id_class(this);
        }
    }

    public String toString() {
        return "" + this.id_final;
    }

    private static fV_2 id_class(fV_2 fV_22, int n) {
        if (fV_22.id_break() >= n && fV_22.id_byte() >= n) {
            return fV_22;
        }
        int n2 = Math.max(fV_22.id_break(), n);
        int n3 = Math.max(fV_22.id_byte(), n);
        return new fV_2(fV_22.id_class(), n2, n3, fV_22.id_protected());
    }

    public fj_3 id_class(double d, double d2) {
        if (this.id_continue == null) {
            return null;
        }
        int n = (int)(d2 / this.id_return);
        int n2 = (int)(d / this.id_synchronized);
        int n3 = n * this.id_this + n2;
        return n3 >= 0 && n3 <= this.id_continue.length ? this.id_continue[n3] : null;
    }

    private void id_class(int n, int n2) {
        this.id_this = -1;
        this.id_else = -1;
        this.id_continue = null;
        if (this.id_super > 0) {
            this.id_this = n / this.id_super;
            this.id_else = n2 / this.id_super;
            this.id_continue = new fj_3[this.id_this * this.id_else];
            this.id_synchronized = 1.0 / (double)this.id_this;
            this.id_return = 1.0 / (double)this.id_else;
            for (fj_3 fj_32 : this.id_volatile.values()) {
                double d = 0.5 / (double)n;
                double d2 = 0.5 / (double)n2;
                double d3 = (double)Math.min(fj_32.id_case(), fj_32.id_catch()) + d;
                double d4 = (double)Math.min(fj_32.id_private(), fj_32.id_implements()) + d2;
                double d5 = (double)Math.max(fj_32.id_case(), fj_32.id_catch()) - d;
                double d6 = (double)Math.max(fj_32.id_private(), fj_32.id_implements()) - d2;
                int n3 = (int)(d3 / this.id_synchronized);
                int n4 = (int)(d4 / this.id_return);
                int n5 = (int)(d5 / this.id_synchronized);
                int n6 = (int)(d6 / this.id_return);
                for (int i = n3; i <= n5; ++i) {
                    if (i >= 0 && i < this.id_this) {
                        for (int j = n4; j <= n6; ++j) {
                            if (j >= 0 && j < this.id_this) {
                                int n7 = j * this.id_this + i;
                                this.id_continue[n7] = fj_32;
                                continue;
                            }
                            rrbb_3.id_protected("Invalid grid V: " + j + ", icon: " + fj_32.id_finally());
                        }
                        continue;
                    }
                    rrbb_3.id_protected("Invalid grid U: " + i + ", icon: " + fj_32.id_finally());
                }
            }
        }
    }

    public fx_3 id_class(rAL rAL2, Stream<rqO_2> stream, int n) {
        int n2;
        int n3;
        this.id_try = this.id_final.equals(id_class);
        this.id_instanceof = rrbb_3.rs();
        this.id_throw = rrbb_3.w();
        this.id_interface = rrdr_1.id_byte();
        int n4 = n;
        this.id_int.clear();
        this.id_new.clear();
        this.id_public.id_break();
        Set<rqO_2> set = stream.peek(rqO_22 -> {
            if (rqO_22 == null) {
                throw new IllegalArgumentException("Location cannot be null!");
            }
        }).collect(Collectors.toSet());
        rrbb_3.id_byte("Multitexture: " + rrbb_3.w());
        rrzJ_2.id_class(this);
        set.addAll(this.id_int.keySet());
        Set<rqO_2> set2 = fJ_2.id_class(set, this.id_int.keySet());
        rrbY_2.id_class(this, set2);
        set.addAll(this.id_int.keySet());
        if (n >= 4) {
            n4 = this.id_class(set, rAL2);
            rrbb_3.id_case("Mipmap levels: " + n4);
        }
        int n5 = rrzJ_2.id_case();
        fT_2 fT_22 = new fT_2(n5, n5, n);
        int n6 = Integer.MAX_VALUE;
        this.id_super = n3 = fJ_2.id_class(n4);
        int n7 = 1 << n;
        rrxr_3.id_class(rrxr_3.rt, this, set);
        for (fV_2 fV_23 : this.id_class(rAL2, set)) {
            n2 = fV_23.id_break();
            int n8 = fV_23.id_byte();
            if (n2 >= 1 && n8 >= 1) {
                int n9;
                if (n2 < n3 || n4 > 0) {
                    int n10 = n9 = n4 > 0 ? rrzJ_2.id_class(n2, n3) : rrzJ_2.id_break(n2, n3);
                    if (n9 != n2) {
                        if (!rrzJ_2.id_throws(n2)) {
                            rrbb_3.id_case("Scaled non power of 2: " + fV_23.id_class() + ", " + n2 + " -> " + n9);
                        } else {
                            rrbb_3.id_case("Scaled too small texture: " + fV_23.id_class() + ", " + n2 + " -> " + n9);
                        }
                        int n11 = n8 * n9 / n2;
                        fV_23.id_class(n9);
                        fV_23.id_break(n11);
                        fV_23.id_class((double)n9 * 1.0 / (double)n2);
                    }
                }
                n6 = Math.min(n6, Math.min(fV_23.id_break(), fV_23.id_byte()));
                n9 = Math.min(Integer.lowestOneBit(fV_23.id_break()), Integer.lowestOneBit(fV_23.id_byte()));
                if (n9 < n7) {
                    id_finally.warn("Texture {} with size {}x{} limits mip level from {} to {}", (Object)fV_23.id_class(), (Object)fV_23.id_break(), (Object)fV_23.id_byte(), (Object)rfU_2.id_case(n7), (Object)rfU_2.id_case(n9));
                    n7 = n9;
                }
                fT_22.id_class(fV_23);
                continue;
            }
            rrbb_3.id_protected("Invalid sprite size: " + fV_23.id_class());
        }
        int n12 = Math.min(n6, n7);
        int n13 = rfU_2.id_case(n12);
        if (n13 < 0) {
            n13 = 0;
        }
        if (n13 < n) {
            id_finally.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", (Object)this.id_final, (Object)n, (Object)n13, (Object)n12);
            n2 = n13;
        } else {
            n2 = n;
        }
        fV_2 fV_24 = fJ_2.id_class(fQ_2.id_break(), n3);
        fT_22.id_class(fV_24);
        try {
            fT_22.id_byte();
        }
        catch (yG_2 yG_22) {
            KY kY = KY.id_class(yG_22, "Stitching");
            Ko_1 ko_1 = kY.id_class("Stitcher");
            ko_1.id_class("Sprites", yG_22.id_class().stream().map(fV_22 -> String.format("%s[%dx%d]", fV_22.id_class(), fV_22.id_break(), fV_22.id_byte())).collect(Collectors.joining(",")));
            ko_1.id_class("Max Texture Size", n5);
            throw new KU(kY);
        }
        List<fj_3> list = this.id_class(rAL2, fT_22, n2);
        return new fx_3(set, fT_22.id_class(), fT_22.id_break(), n2, list);
    }

    private int id_class(Set<rqO_2> set, rAL rAL2) {
        int n;
        int n2 = this.id_class(set, rAL2, 20);
        if (n2 < 16) {
            n2 = 16;
        }
        if ((n2 = rfU_2.id_byte(n2)) > 16) {
            rrbb_3.id_case("Sprite size: " + n2);
        }
        if ((n = rfU_2.id_case(n2)) < 4) {
            n = 4;
        }
        return n;
    }

    private int id_class(Set<rqO_2> set, rAL rAL2, int n) {
        int n2;
        int n3;
        Object exception;
        Object object;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (rqO_2 object32 : set) {
            object = this.id_class(object32);
            try {
                InputStream n6;
                exception = rAL2.id_class((rqO_2)object);
                if (exception == null || (n6 = exception.id_break()) == null) continue;
                Dimension n7 = rrzJ_2.id_class(n6, "png");
                n6.close();
                if (n7 == null) continue;
                int iterator = n7.width;
                n3 = rfU_2.id_byte(iterator);
                if (!hashMap.containsKey(n3)) {
                    hashMap.put(n3, 1);
                    continue;
                }
                n2 = (Integer)hashMap.get(n3);
                hashMap.put(n3, n2 + 1);
            }
            catch (Exception n8) {}
        }
        int n5 = 0;
        Set set2 = hashMap.keySet();
        object = new TreeSet(set2);
        exception = object.iterator();
        while (exception.hasNext()) {
            int n9 = (Integer)exception.next();
            int n10 = (Integer)hashMap.get(n9);
            n5 += n10;
        }
        int n4 = 16;
        int n6 = 0;
        int n7 = n5 * n / 100;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            n3 = (Integer)iterator.next();
            n2 = (Integer)hashMap.get(n3);
            n6 += n2;
            if (n3 > n4) {
                n4 = n3;
            }
            if (n6 <= n7) continue;
            return n4;
        }
        return n4;
    }

    public void id_class(fx_3 fx_32) {
        this.id_native.clear();
        this.id_native.addAll(fx_32.id_class);
        id_finally.info("Created: {}x{}x{} {}-atlas", (Object)fx_32.id_break, (Object)fx_32.id_byte, (Object)fx_32.id_protected, (Object)this.id_final);
        fo_3.id_class(this.id_new(), fx_32.id_protected, fx_32.id_break, fx_32.id_byte);
        this.id_byte = fx_32.id_break;
        this.id_protected = fx_32.id_byte;
        this.id_throws = fx_32.id_protected;
        if (this.id_instanceof) {
            rrdA.id_class(fx_32.id_protected, fx_32.id_break, fx_32.id_byte, this);
        }
        this.id_byte();
        for (fj_3 iterator : fx_32.id_throws) {
            this.id_volatile.put(iterator.id_finally(), iterator);
            try {
                iterator.id_volatile();
            }
            catch (Throwable throwable) {
                KY kY = KY.id_class(throwable, "Stitching texture atlas");
                Ko_1 ko_1 = kY.id_class("Texture being stitched together");
                ko_1.id_class("Atlas path", this.id_final);
                ko_1.id_class("Sprite", iterator);
                throw new KU(kY);
            }
            if (!iterator.id_int()) continue;
            iterator.id_class(this.id_extends.size());
            this.id_extends.add(iterator);
        }
        rrzJ_2.id_break(this);
        rrbb_3.id_case("Animated sprites: " + this.id_extends.size());
        if (rrbb_3.w()) {
            for (fj_3 fj_32 : fx_32.id_throws) {
                fJ_2.id_break(fj_32);
                if (fj_32.id_extends != null) {
                    fJ_2.id_break(fj_32.id_extends);
                }
                if (fj_32.id_native == null) continue;
                fJ_2.id_break(fj_32.id_native);
            }
            MT.id_super(this.id_new());
        }
        if (rrbb_3.rs()) {
            fj_3 fj_33;
            fj_3 fj_34;
            List<fj_3> list = fx_32.id_throws;
            if (rrdZ.SV) {
                MT.id_super(this.id_this().id_break);
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    fj_34 = (fj_3)iterator.next();
                    fj_33 = fj_34.id_extends;
                    if (fj_33 == null) continue;
                    fj_33.id_volatile();
                }
            }
            if (rrdZ.Sg) {
                MT.id_super(this.id_this().id_byte);
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    fj_34 = (fj_3)iterator.next();
                    fj_33 = fj_34.id_native;
                    if (fj_33 == null) continue;
                    fj_33.id_volatile();
                }
            }
            MT.id_super(this.id_new());
        }
        rrxr_3.id_class(rrxr_3.rw, this);
        this.id_class(fx_32.id_break, fx_32.id_byte);
        if (rrbb_3.id_class((Object)System.getProperty("saveTextureMap"), (Object)"true")) {
            rrbb_3.id_byte("Exporting texture map: " + this.id_final);
            rrzJ_2.id_class("debug/" + this.id_final.id_break().replaceAll("/", "_"), this.id_new(), fx_32.id_protected, fx_32.id_break, fx_32.id_byte);
            if (this.id_instanceof) {
                if (rrdZ.SV) {
                    rrzJ_2.id_class("debug/" + this.id_final.id_break().replaceAll("/", "_").replace(".png", "_n.png"), this.id_implements.id_break, fx_32.id_protected, fx_32.id_break, fx_32.id_byte);
                }
                if (rrdZ.Sg) {
                    rrzJ_2.id_class("debug/" + this.id_final.id_break().replaceAll("/", "_").replace(".png", "_s.png"), this.id_implements.id_byte, fx_32.id_protected, fx_32.id_break, fx_32.id_byte);
                }
                MT.id_super(this.id_new());
            }
        }
    }

    private static int id_class(int n) {
        int n2 = 1 << n;
        if (n2 < 8) {
            n2 = 8;
        }
        return n2;
    }

    public rrko_1 id_class(rrdn_1 rrdn_12) {
        if (rrdn_12 == null) {
            return null;
        }
        return this.id_interface != null ? this.id_interface.id_class(rrdn_12) : new rrkg_1();
    }

    private static <T> Set<T> id_class(Set<T> set, Set<T> set2) {
        HashSet<T> hashSet = new HashSet<T>();
        hashSet.addAll(set);
        hashSet.addAll(set2);
        return hashSet;
    }

    private Collection<fV_2> id_class(rAL rAL2, Set<rqO_2> set) {
        ArrayList arrayList = Lists.newArrayList();
        ConcurrentLinkedQueue<fV_2> concurrentLinkedQueue = new ConcurrentLinkedQueue<fV_2>();
        for (rqO_2 rqO_22 : set) {
            if (fQ_2.id_class().equals(rqO_22)) continue;
            arrayList.add(CompletableFuture.runAsync(() -> {
                fV_2 fV_22;
                rqO_2 rqO_23 = this.id_class(rqO_22);
                try (rAF rAF2 = rAL2.id_class(rqO_23);){
                    fF_2 fF_22 = new fF_2(rAF2.toString(), rAF2.id_break());
                    ji_3 ji_32 = rAF2.id_class(ji_3.id_class);
                    if (ji_32 == null) {
                        ji_32 = ji_3.id_break;
                    }
                    Pair<Integer, Integer> pair = ji_32.id_class(fF_22.id_class, fF_22.id_break);
                    fV_22 = new fV_2(rqO_22, (Integer)pair.getFirst(), (Integer)pair.getSecond(), ji_32);
                }
                catch (RuntimeException runtimeException) {
                    id_finally.error("Unable to parse metadata from {} : {}", (Object)rqO_23, (Object)runtimeException);
                    this.id_catch(rqO_22);
                    return;
                }
                catch (IOException iOException) {
                    id_finally.error("Using missing texture, unable to load {} : {}", (Object)rqO_23, (Object)iOException);
                    this.id_catch(rqO_22);
                    return;
                }
                concurrentLinkedQueue.add(fV_22);
            }, rqR_2.id_case()));
        }
        CompletableFuture.allOf(arrayList.toArray(new CompletableFuture[0])).join();
        return concurrentLinkedQueue;
    }

    private fj_3 id_class(rAL rAL2, fV_2 fV_22, int n, int n2, int n3, int n4, int n5) {
        fj_3 fj_32;
        block9: {
            rqO_2 rqO_22 = this.id_class(fV_22.id_class());
            rAF rAF2 = rAL2.id_class(rqO_22);
            try {
                fN_2 fN_22 = fN_2.id_class(rAF2.id_break());
                fj_3 fj_33 = new fj_3(this, fV_22, n3, n, n2, n4, n5, fN_22);
                fj_33.id_class(rAL2);
                fj_32 = fj_33;
                if (rAF2 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (rAF2 != null) {
                        try {
                            rAF2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (RuntimeException runtimeException) {
                    id_finally.error("Unable to parse metadata from {}", (Object)rqO_22, (Object)runtimeException);
                    return null;
                }
                catch (IOException iOException) {
                    id_finally.error("Using missing texture, unable to load {}", (Object)rqO_22, (Object)iOException);
                    return null;
                }
            }
            rAF2.close();
        }
        return fj_32;
    }

    public fj_3 id_class(String string) {
        rqO_2 rqO_22 = new rqO_2(string);
        return this.id_byte(rqO_22);
    }

    private List<fj_3> id_class(rAL rAL2, fT_2 fT_22, int n) {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        ArrayList arrayList = Lists.newArrayList();
        fT_22.id_class((fV_2 fV_22, int n2, int n3, int n4, int n5) -> {
            if (fV_22.id_class().equals(fQ_2.id_break().id_class())) {
                fQ_2 fQ_22 = new fQ_2(this, fV_22, n, n2, n3, n4, n5);
                fQ_22.id_class(rAL2);
                concurrentLinkedQueue.add(fQ_22);
            } else {
                arrayList.add(CompletableFuture.runAsync(() -> {
                    fj_3 fj_32 = this.id_class(rAL2, fV_22, n2, n3, n, n4, n5);
                    if (fj_32 != null) {
                        concurrentLinkedQueue.add(fj_32);
                    }
                }, rqR_2.id_case()));
            }
        });
        CompletableFuture.allOf(arrayList.toArray(new CompletableFuture[0])).join();
        return Lists.newArrayList(concurrentLinkedQueue);
    }

    public void id_class() {
        boolean bl = false;
        boolean bl2 = false;
        if (!this.id_extends.isEmpty()) {
            this.id_super();
        }
        int n = 0;
        for (fj_3 fj_32 : this.id_extends) {
            if (!this.id_class(fj_32)) continue;
            fj_32.id_package();
            if (fj_32.id_super()) {
                ++n;
            }
            if (fj_32.id_extends != null) {
                bl = true;
            }
            if (fj_32.id_native == null) continue;
            bl2 = true;
        }
        if (rrbb_3.rs()) {
            if (bl) {
                MT.id_super(this.id_this().id_break);
                for (fj_3 fj_32 : this.id_extends) {
                    if (fj_32.id_extends == null || !this.id_class(fj_32) || !fj_32.id_super()) continue;
                    fj_32.id_extends.id_package();
                    if (!fj_32.id_extends.id_super()) continue;
                    ++n;
                }
            }
            if (bl2) {
                MT.id_super(this.id_this().id_byte);
                for (fj_3 fj_32 : this.id_extends) {
                    if (fj_32.id_native == null || !this.id_class(fj_32) || !fj_32.id_super()) continue;
                    fj_32.id_native.id_package();
                    if (!fj_32.id_native.id_super()) continue;
                    ++n;
                }
            }
            if (bl || bl2) {
                MT.id_super(this.id_new());
            }
        }
        if (rrbb_3.w()) {
            for (fj_3 fj_32 : this.id_extends) {
                if (!this.id_class(fj_32) || !fj_32.id_super()) continue;
                n += fJ_2.id_byte(fj_32);
                if (fj_32.id_extends != null) {
                    n += fJ_2.id_byte(fj_32.id_extends);
                }
                if (fj_32.id_native == null) continue;
                n += fJ_2.id_byte(fj_32.id_native);
            }
            MT.id_super(this.id_new());
        }
        if (this.id_try) {
            int n2 = ((yX_2)rrbb_3.X().id_class[8]).id_public();
            if (n2 != this.id_while) {
                this.id_goto = n;
                this.id_while = n2;
            }
            if (rrMh_1.id_class()) {
                rrMh_1.id_class(this);
            }
        }
    }

    private boolean id_class(fj_3 fj_32) {
        if (!this.id_try) {
            return true;
        }
        if (fj_32 != rrzJ_2.id_private && fj_32 != rrzJ_2.id_implements) {
            if (fj_32 != rrzJ_2.id_finally && fj_32 != rrzJ_2.id_extends) {
                if (fj_32 != rrzJ_2.id_native && fj_32 != rrzJ_2.id_volatile) {
                    if (fj_32 != rrzJ_2.id_final && fj_32 != rrzJ_2.id_package) {
                        if (fj_32 != rrzJ_2.id_int && fj_32 != rrzJ_2.id_new) {
                            if (fj_32 != rrzJ_2.id_continue && fj_32 != rrzJ_2.id_super) {
                                return fj_32 == rrzJ_2.id_this ? rrbb_3.id_strictfp() : rrbb_3.j();
                            }
                            return rrbb_3.id_for();
                        }
                        return rrbb_3.id_for();
                    }
                    return rrbb_3.id_for();
                }
                return rrbb_3.id_for();
            }
            return rrbb_3.id_boolean();
        }
        return rrbb_3.id_default();
    }

    public rqO_2 id_class(rqO_2 rqO_22) {
        return this.id_case(rqO_22) ? new rqO_2(rqO_22.id_byte(), rqO_22.id_break() + ".png") : new rqO_2(rqO_22.id_byte(), String.format("textures/%s%s", rqO_22.id_break(), ".png"));
    }

    public boolean id_break(rrdn_1 rrdn_12) {
        if (rrdn_12 == null) {
            return true;
        }
        return this.id_interface != null ? this.id_interface.id_break(rrdn_12) : true;
    }

    public void id_break(fx_3 fx_32) {
        this.id_class(false, fx_32.id_protected > 0);
    }

    private static void id_break(fj_3 fj_32) {
        fj_3 fj_33 = fj_32.id_catch;
        if (fj_33 != null) {
            fj_33.id_class(fj_32.id_continue());
            fj_32.id_this();
            try {
                fj_33.id_volatile();
            }
            catch (Exception exception) {
                rrbb_3.id_byte("Error uploading sprite single: " + fj_33 + ", parent: " + fj_32);
                exception.printStackTrace();
            }
        }
    }

    public fj_3 id_break(rqO_2 rqO_22) {
        fj_3 fj_32 = this.id_volatile.get(rqO_22);
        return fj_32 == null ? this.id_volatile.get(fQ_2.id_class()) : fj_32;
    }

    @Override
    public void id_break() {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(this::id_class);
        } else {
            this.id_class();
        }
    }

    public fj_3 id_break(String string) {
        rqO_2 rqO_22 = new rqO_2(string);
        return this.id_protected(rqO_22);
    }

    public fj_3 id_throws(rqO_2 rqO_22) {
        if (rqO_22 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        fj_3 fj_32 = this.id_int.get(rqO_22);
        if (fj_32 != null) {
            return fj_32;
        }
        this.id_native.add(rqO_22);
        fj_32 = new fj_3(rqO_22);
        this.id_int.put(rqO_22, fj_32);
        fj_32.id_class(this.id_public);
        return fj_32;
    }

    public int id_throws() {
        return this.id_public.id_byte();
    }

    public boolean id_finally() {
        return this.id_try;
    }

    private void id_catch(rqO_2 rqO_22) {
        fj_3 fj_32 = this.id_int.get(rqO_22);
        if (fj_32 != null) {
            this.id_new.put(rqO_22, fj_32);
        }
    }

    public int id_catch() {
        return this.id_extends.size();
    }

    public rrWd_1 id_extends() {
        return this.id_public;
    }

    public boolean id_case() {
        int n;
        int n2 = MT.S();
        return n2 == (n = this.id_new());
    }

    private boolean id_case(rqO_2 rqO_22) {
        String string = rqO_22.id_break();
        return this.id_byte(string);
    }

    public Collection<fj_3> id_implements() {
        return Collections.unmodifiableCollection(this.id_int.values());
    }

    public boolean id_package() {
        return this.id_break(rrdn_1.NORMAL);
    }

    public fj_3 id_protected(rqO_2 rqO_22) {
        return this.id_volatile.get(rqO_22);
    }

    public rqO_2 id_protected() {
        return this.id_final;
    }

    public int id_private() {
        return this.id_goto;
    }

    public rrdr_1 id_final() {
        return this.id_interface;
    }

    public boolean id_volatile() {
        return this.id_throws > 0;
    }

    public int id_native() {
        return this.id_throws;
    }

    @Override
    public void a_(rAL rAL2) throws IOException {
    }
}

