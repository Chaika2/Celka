/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.tuple.Triple
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.HU;
import celestial.IH;
import celestial.II;
import celestial.IJ;
import celestial.IN;
import celestial.IP;
import celestial.IU;
import celestial.Id_1;
import celestial.If_1;
import celestial.Ig_1;
import celestial.Il_1;
import celestial.Ir_1;
import celestial.Ix_1;
import celestial.fJ_2;
import celestial.fQ_2;
import celestial.fS_2;
import celestial.fY_2;
import celestial.fa_3;
import celestial.fj_3;
import celestial.fp_3;
import celestial.fx_3;
import celestial.jP_2;
import celestial.jS_2;
import celestial.lY_2;
import celestial.lp_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rCF;
import celestial.rCL;
import celestial.rCN;
import celestial.rCZ;
import celestial.rJT;
import celestial.rVL;
import celestial.rjo_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrxr_3;
import celestial.rrzJ_2;
import celestial.rrzX_2;
import celestial.we_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.yC_2;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.tuple.Triple;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IC {
    public static final Ig_1 id_class = new Ig_1(fJ_2.id_class, new rqO_2("block/fire_0"));
    public static final Ig_1 id_break = new Ig_1(fJ_2.id_class, new rqO_2("block/fire_1"));
    public static final Ig_1 id_byte = new Ig_1(fJ_2.id_class, new rqO_2("block/lava_flow"));
    public static final Ig_1 id_protected = new Ig_1(fJ_2.id_class, new rqO_2("block/water_flow"));
    public static final Ig_1 id_throws = new Ig_1(fJ_2.id_class, new rqO_2("block/water_overlay"));
    public static final Ig_1 id_case = new Ig_1(fJ_2.id_class, new rqO_2("entity/banner_base"));
    public static final Ig_1 id_catch = new Ig_1(fJ_2.id_class, new rqO_2("entity/shield_base"));
    public static final Ig_1 id_private = new Ig_1(fJ_2.id_class, new rqO_2("entity/shield_base_nopattern"));
    public static final List<rqO_2> id_implements = IntStream.range(0, 10).mapToObj(n -> new rqO_2("block/destroy_stage_" + n)).collect(Collectors.toList());
    public static final List<rqO_2> id_finally = id_implements.stream().map(rqO_22 -> new rqO_2("textures/" + rqO_22.id_break() + ".png")).collect(Collectors.toList());
    public static final List<HU> id_extends = id_finally.stream().map(HU::id_package).collect(Collectors.toList());
    private static final Set<Ig_1> id_new = rqR_2.id_class(Sets.newHashSet(), (T hashSet) -> {
        hashSet.add(id_protected);
        hashSet.add(id_byte);
        hashSet.add(id_throws);
        hashSet.add(id_class);
        hashSet.add(id_break);
        hashSet.add(fa_3.id_class);
        hashSet.add(jP_2.id_class);
        hashSet.add(jP_2.id_break);
        hashSet.add(jP_2.id_byte);
        hashSet.add(jP_2.id_protected);
        hashSet.add(jP_2.id_throws);
        hashSet.add(jP_2.id_case);
        hashSet.add(jS_2.id_class);
        hashSet.add(id_case);
        hashSet.add(id_catch);
        hashSet.add(id_private);
        for (rqO_2 rqO_22 : id_implements) {
            hashSet.add(new Ig_1(fJ_2.id_class, rqO_22));
        }
        hashSet.add(new Ig_1(fJ_2.id_class, rJT.id_break));
        hashSet.add(new Ig_1(fJ_2.id_class, rJT.id_byte));
        hashSet.add(new Ig_1(fJ_2.id_class, rJT.id_protected));
        hashSet.add(new Ig_1(fJ_2.id_class, rJT.id_catch));
        hashSet.add(new Ig_1(fJ_2.id_class, rJT.id_private));
        lp_3.id_class(hashSet::add);
    });
    private static final Logger id_continue = LogManager.getLogger();
    public static final II id_native = new II("builtin/missing", "missing");
    private static final String id_super = id_native.toString();
    public static final String id_volatile = ("{    'textures': {       'particle': '" + fQ_2.id_class().id_break() + "',       'missingno': '" + fQ_2.id_class().id_break() + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}").replace('\'', '\"');
    private static final Map<String, String> id_this = Maps.newHashMap((Map)ImmutableMap.of((Object)"missing", (Object)id_volatile));
    private static final Splitter id_else = Splitter.on((char)',');
    private static final Splitter id_synchronized = Splitter.on((char)'=').limit(2);
    public static final we_3 id_final = rqR_2.id_class(we_3.id_class("{\"gui_light\": \"front\"}"), (T we_32) -> {
        we_32.id_break = "generation marker";
    });
    public static final we_3 id_package = rqR_2.id_class(we_3.id_class("{\"gui_light\": \"side\"}"), (T we_32) -> {
        we_32.id_break = "block entity marker";
    });
    private static final rCF<xd_3, xc_3> id_return = new rCL(xu_3.id_class).id_class(new rCZ[]{rCN.id_class("map")}).id_class(xd_3::id_continue, xc_3::new);
    private static final IN id_public = new IN();
    private static final Map<rqO_2, rCF<xd_3, xc_3>> id_goto = ImmutableMap.of((Object)new rqO_2("item_frame"), id_return);
    private final rAL id_while;
    private fp_3 id_try;
    private final yC_2 id_instanceof;
    private final Set<rqO_2> id_throw = Sets.newHashSet();
    private final IP id_interface = new IP();
    private final Map<rqO_2, Id_1> id_char = Maps.newHashMap();
    private final Map<Triple<rqO_2, rjo_3, Boolean>, IJ> id_abstract = Maps.newHashMap();
    private final Map<rqO_2, Id_1> id_long = Maps.newHashMap();
    private final Map<rqO_2, IJ> id_float = Maps.newHashMap();
    private Map<rqO_2, Pair<fJ_2, fx_3>> id_void;
    private int id_static = 1;
    private final Object2IntMap<xc_3> id_import = (Object2IntMap)rqR_2.id_class(new Object2IntOpenHashMap(), (T object2IntOpenHashMap) -> object2IntOpenHashMap.defaultReturnValue(-1));
    public Map<rqO_2, Id_1> id_int;

    private void id_byte(rqO_2 rqO_22) {
        Id_1 id_1 = this.id_class(rqO_22);
        this.id_char.put(rqO_22, id_1);
        this.id_long.put(rqO_22, id_1);
    }

    public Set<rqO_2> id_byte() {
        return Collections.emptySet();
    }

    public IC(rAL rAL2, yC_2 yC_22, int n) {
        this(rAL2, yC_22, true);
        this.id_class(n);
    }

    protected IC(rAL rAL2, yC_2 yC_22, boolean bl) {
        this.id_while = rAL2;
        this.id_instanceof = yC_22;
    }

    private static /* synthetic */ void id_class(Map map, fS_2 fS_22, List list, xc_3 xc_32) {
        Pair pair = map.put(xc_32, Pair.of((Object)fS_22, () -> IH.id_class(xc_32, fS_22, list)));
    }

    protected void id_class(int n) {
        rrxr_3.Bm.id_catch(new Object[0]);
        try {
            this.id_char.put(id_native, this.id_protected(id_native));
            this.id_class(id_native);
        }
        catch (IOException iOException) {
            id_continue.error("Error loading missing model, should never happen :(", (Throwable)iOException);
            throw new RuntimeException(iOException);
        }
        id_goto.forEach((rqO_22, rCF2) -> rCF2.id_class().forEach(xc_32 -> this.id_class(lY_2.id_class(rqO_22, xc_32))));
        for (xd_3 set2 : rVL.id_strictfp) {
            set2.id_new().id_class().forEach(xc_32 -> this.id_class(lY_2.id_byte(xc_32)));
        }
        for (rqO_2 rqO_23 : rVL.id_for.id_protected()) {
            this.id_class(new II(rqO_23, "inventory"));
        }
        this.id_class(new II("minecraft:trident_in_hand#inventory"));
        for (rqO_2 rqO_24 : this.id_byte()) {
            this.id_byte(rqO_24);
        }
        this.id_int = this.id_char;
        rrzJ_2.id_class(this);
        LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        Set set = this.id_long.values().stream().flatMap(id_1 -> id_1.id_class(this::id_class, linkedHashSet).stream()).collect(Collectors.toSet());
        set.addAll(id_new);
        rrxr_3.id_private(rrxr_3.rz, set);
        linkedHashSet.stream().filter(pair -> !((String)pair.getSecond()).equals(id_super)).forEach(pair -> id_continue.warn("Unable to resolve texture reference: {} in {}", pair.getFirst(), pair.getSecond()));
        Map<rqO_2, List<Ig_1>> map = set.stream().collect(Collectors.groupingBy(Ig_1::id_class));
        this.id_void = Maps.newHashMap();
        for (Map.Entry<rqO_2, List<Ig_1>> entry : map.entrySet()) {
            fJ_2 fJ_22 = new fJ_2(entry.getKey());
            fx_3 fx_32 = fJ_22.id_class(this.id_while, entry.getValue().stream().map(Ig_1::id_break), n);
            this.id_void.put(entry.getKey(), (Pair<fJ_2, fx_3>)Pair.of((Object)fJ_22, (Object)fx_32));
        }
    }

    private static /* synthetic */ void id_class(ImmutableList immutableList, rCF rCF2, Map map, List list, fS_2 fS_22, Pair pair, Ir_1 ir_1, rqO_2 rqO_22, Pair pair2, String string, IU iU) {
        try {
            immutableList.stream().filter(IC.id_class(rCF2, string)).forEach(xc_32 -> {
                Pair pair2 = map.put(xc_32, Pair.of((Object)iU, () -> IH.id_class(xc_32, iU, list)));
                if (pair2 != null && pair2.getFirst() != fS_22) {
                    map.put(xc_32, pair);
                    throw new RuntimeException("Overlapping definition with: " + (String)ir_1.id_class().entrySet().stream().filter(entry -> entry.getValue() == pair2.getFirst()).findFirst().get().getKey());
                }
            });
        }
        catch (Exception exception) {
            id_continue.warn("Exception loading blockstate definition: '{}' in resourcepack: '{}' for variant: '{}': {}", (Object)rqO_22, pair2.getFirst(), (Object)string, (Object)exception.getMessage());
        }
    }

    public void id_class(II iI) {
        Id_1 id_1 = this.id_class((rqO_2)iI);
        this.id_char.put(iI, id_1);
        this.id_long.put(iI, id_1);
    }

    private void id_class(Iterable<xc_3> iterable) {
        int n = this.id_static++;
        iterable.forEach(xc_32 -> this.id_import.put(xc_32, n));
    }

    public IJ id_class(rqO_2 rqO_22, Ix_1 ix_1) {
        return this.id_class(rqO_22, ix_1, this.id_try::id_class);
    }

    public IJ id_class(rqO_2 rqO_22, Ix_1 ix_1, Function<Ig_1, fj_3> function) {
        Object object;
        Triple triple = Triple.of((Object)rqO_22, (Object)ix_1.id_class(), (Object)ix_1.id_break());
        if (this.id_abstract.containsKey(triple)) {
            return this.id_abstract.get(triple);
        }
        if (this.id_try == null) {
            throw new IllegalStateException("bake called too early");
        }
        Id_1 id_1 = this.id_class(rqO_22);
        if (id_1 instanceof we_3 && ((we_3)(object = (we_3)id_1)).id_case() == id_final) {
            if (rrxr_3.rb.id_byte()) {
                return id_public.id_class(function, (we_3)object).id_class(this, (we_3)object, function, ix_1, rqO_22, false);
            }
            return id_public.id_class(this.id_try::id_class, (we_3)object).id_class(this, (we_3)object, this.id_try::id_class, ix_1, rqO_22, false);
        }
        object = id_1.id_class(this, this.id_try::id_class, ix_1, rqO_22);
        if (rrxr_3.rb.id_byte()) {
            object = id_1.id_class(this, function, ix_1, rqO_22);
        }
        this.id_abstract.put((Triple<rqO_2, rjo_3, Boolean>)triple, (IJ)object);
        return object;
    }

    public Map<rqO_2, IJ> id_class() {
        return this.id_float;
    }

    public static <T extends Comparable<T>> T id_class(rCZ<T> rCZ2, String string) {
        return (T)rCZ2.id_break(string).orElse(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Id_1 id_class(rqO_2 rqO_22) {
        if (this.id_char.containsKey(rqO_22)) {
            return this.id_char.get(rqO_22);
        }
        if (this.id_throw.contains(rqO_22)) {
            throw new IllegalStateException("Circular reference while loading " + rqO_22);
        }
        this.id_throw.add(rqO_22);
        Id_1 id_1 = this.id_char.get(id_native);
        while (!this.id_throw.isEmpty()) {
            rqO_2 rqO_23 = this.id_throw.iterator().next();
            try {
                if (this.id_char.containsKey(rqO_23)) continue;
                this.id_break(rqO_23);
            }
            catch (Il_1 il_1) {
                id_continue.warn(il_1.getMessage());
                this.id_char.put(rqO_23, id_1);
            }
            catch (Exception exception) {
                id_continue.warn("Unable to load model: '{}' referenced from: {}: {}", (Object)rqO_23, (Object)rqO_22);
                id_continue.warn(exception.getClass().getName() + ": " + exception.getMessage());
                this.id_char.put(rqO_23, id_1);
            }
            finally {
                this.id_throw.remove(rqO_23);
            }
        }
        return this.id_char.getOrDefault(rqO_22, id_1);
    }

    private void id_class(rqO_2 rqO_22, Id_1 id_1) {
        this.id_char.put(rqO_22, id_1);
        this.id_throw.addAll(id_1.id_throws());
    }

    private static Predicate<xc_3> id_class(rCF<xd_3, xc_3> rCF2, String string) {
        HashMap hashMap = Maps.newHashMap();
        for (String string2 : id_else.split((CharSequence)string)) {
            Iterator iterator = id_synchronized.split((CharSequence)string2).iterator();
            if (!iterator.hasNext()) continue;
            String string3 = (String)iterator.next();
            rCZ<?> rCZ2 = rCF2.id_class(string3);
            if (rCZ2 != null && iterator.hasNext()) {
                String string4 = (String)iterator.next();
                Object obj = IC.id_class(rCZ2, string4);
                if (obj == null) {
                    throw new RuntimeException("Unknown value: '" + string4 + "' for blockstate property: '" + string3 + "' " + rCZ2.id_class());
                }
                hashMap.put(rCZ2, obj);
                continue;
            }
            if (string3.isEmpty()) continue;
            throw new RuntimeException("Unknown blockstate property: '" + string3 + "'");
        }
        xd_3 xd_32 = rCF2.id_byte();
        return xc_32 -> {
            if (xc_32 != null && xd_32 == xc_32.id_break()) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (Objects.equals(xc_32.id_byte((rCZ)entry.getKey()), entry.getValue())) continue;
                    return false;
                }
                return true;
            }
            return false;
        };
    }

    public static void id_class(we_3 we_32, String string) {
        rqO_2 rqO_22 = IC.id_class(we_32.id_throws, string);
        if (rqO_22 != we_32.id_throws) {
            we_32.id_throws = rqO_22;
        }
        if (we_32.id_byte != null) {
            for (Map.Entry<String, Either<Ig_1, String>> entry : we_32.id_byte.entrySet()) {
                Ig_1 ig_1;
                rqO_2 rqO_23;
                String string2;
                String string3;
                Either<Ig_1, String> either = entry.getValue();
                Optional optional = either.left();
                if (!optional.isPresent() || (string3 = IC.id_class(string2 = (rqO_23 = (ig_1 = (Ig_1)optional.get()).id_break()).id_break(), string)).equals(string2)) continue;
                rqO_2 rqO_24 = new rqO_2(rqO_23.id_byte(), string3);
                Ig_1 ig_12 = new Ig_1(ig_1.id_class(), rqO_24);
                Either either2 = Either.left((Object)ig_12);
                entry.setValue((Either<Ig_1, String>)either2);
            }
        }
    }

    public static rqO_2 id_class(rqO_2 rqO_22, String string) {
        if (rqO_22 != null && string != null) {
            if (!rqO_22.id_byte().equals("minecraft")) {
                return rqO_22;
            }
            String string2 = rqO_22.id_break();
            String string3 = IC.id_class(string2, string);
            if (string3 != string2) {
                rqO_22 = new rqO_2(rqO_22.id_byte(), string3);
            }
            return rqO_22;
        }
        return rqO_22;
    }

    public fp_3 id_class(fY_2 fY_22) {
        for (Pair<fJ_2, fx_3> pair : this.id_void.values()) {
            fJ_2 fJ_22 = (fJ_2)pair.getFirst();
            fx_3 fx_32 = (fx_3)pair.getSecond();
            fJ_22.id_class(fx_32);
            fY_22.id_class(fJ_22.id_protected(), fJ_22);
            fY_22.id_class(fJ_22.id_protected());
            fJ_22.id_break(fx_32);
        }
        this.id_try = new fp_3(this.id_void.values().stream().map(Pair::getFirst).collect(Collectors.toList()));
        this.id_long.keySet().forEach(rqO_22 -> {
            IJ iJ = null;
            try {
                iJ = this.id_class((rqO_2)rqO_22, If_1.X0_Y0);
            }
            catch (Exception exception) {
                id_continue.warn("Unable to bake model: '{}': {}", rqO_22, (Object)exception);
            }
            if (iJ != null) {
                this.id_float.put((rqO_2)rqO_22, iJ);
            }
        });
        return this.id_try;
    }

    private static String id_class(String string, String string2) {
        string = rrzJ_2.id_class(string, string2);
        string = rrzX_2.id_throws(string, ".json");
        return rrzX_2.id_throws(string, ".png");
    }

    private void id_break(rqO_2 rqO_22) throws Exception {
        if (!(rqO_22 instanceof II)) {
            this.id_class(rqO_22, (Id_1)this.id_protected(rqO_22));
        } else {
            II iI2 = (II)rqO_22;
            if (Objects.equals(iI2.id_class(), "inventory")) {
                rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), "item/" + rqO_22.id_break());
                String string = rqO_22.id_break();
                if (string.startsWith("optifine/") || string.startsWith("item/")) {
                    rqO_23 = rqO_22;
                }
                we_3 we_32 = this.id_protected(rqO_23);
                this.id_class((rqO_2)iI2, (Id_1)we_32);
                this.id_char.put(rqO_23, we_32);
            } else {
                rqO_2 rqO_24 = new rqO_2(rqO_22.id_byte(), rqO_22.id_break());
                rCF rCF2 = Optional.ofNullable(id_goto.get(rqO_24)).orElseGet(() -> rVL.id_strictfp.id_class(rqO_24).id_new());
                this.id_interface.id_class(rCF2);
                ImmutableList immutableList = ImmutableList.copyOf(this.id_instanceof.id_class((xd_3)rCF2.id_byte()));
                ImmutableList immutableList2 = rCF2.id_class();
                HashMap hashMap = Maps.newHashMap();
                immutableList2.forEach(xc_32 -> {
                    xc_3 xc_33 = hashMap.put(lY_2.id_class(rqO_24, xc_32), xc_32);
                });
                HashMap hashMap2 = Maps.newHashMap();
                rqO_2 rqO_25 = new rqO_2(rqO_22.id_byte(), "blockstates/" + rqO_22.id_break() + ".json");
                Id_1 id_1 = this.id_char.get(id_native);
                IH iH = new IH((List<Id_1>)ImmutableList.of((Object)id_1), (List<Object>)ImmutableList.of());
                Pair pair = Pair.of((Object)id_1, () -> iH);
                try {
                    List list;
                    try {
                        list = this.id_while.id_byte(rqO_25).stream().map(rAF2 -> {
                            Pair pair;
                            block8: {
                                InputStream inputStream = rAF2.id_break();
                                try {
                                    pair = Pair.of((Object)rAF2.id_byte(), (Object)Ir_1.id_class(this.id_interface, new InputStreamReader(inputStream, StandardCharsets.UTF_8)));
                                    if (inputStream == null) break block8;
                                }
                                catch (Throwable throwable) {
                                    try {
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            }
                                            catch (Throwable throwable2) {
                                                throwable.addSuppressed(throwable2);
                                            }
                                        }
                                        throw throwable;
                                    }
                                    catch (Exception exception) {
                                        throw new Il_1(String.format("Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", rAF2.id_class(), rAF2.id_byte(), exception.getMessage()));
                                    }
                                }
                                inputStream.close();
                            }
                            return pair;
                        }).collect(Collectors.toList());
                    }
                    catch (IOException iOException) {
                        id_continue.warn("Exception loading blockstate definition: {}: {}", (Object)rqO_25, (Object)iOException);
                        HashMap hashMap3 = Maps.newHashMap();
                        hashMap.forEach((iI, xc_32) -> {
                            Pair pair2 = (Pair)hashMap2.get(xc_32);
                            if (pair2 == null) {
                                id_continue.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", (Object)rqO_25, iI);
                                pair2 = pair;
                            }
                            this.id_class((rqO_2)iI, (Id_1)pair2.getFirst());
                            try {
                                IH iH = (IH)((Supplier)pair2.getSecond()).get();
                                ((Set)hashMap3.computeIfAbsent(iH, object -> Sets.newIdentityHashSet())).add(xc_32);
                            }
                            catch (Exception exception) {
                                id_continue.warn("Exception evaluating model definition: '{}'", iI, (Object)exception);
                            }
                        });
                        hashMap3.forEach((object, object2) -> {
                            Iterator iterator = ((Set)object2).iterator();
                            while (iterator.hasNext()) {
                                xc_3 xc_32 = (xc_3)iterator.next();
                                if (xc_32.id_private() == xN_2.MODEL) continue;
                                iterator.remove();
                                this.id_import.put((Object)xc_32, 0);
                            }
                            if (((Set)object2).size() > 1) {
                                this.id_class((Set)object2);
                            }
                        });
                        return;
                    }
                    for (Pair pair2 : list) {
                        fS_2 fS_22;
                        Ir_1 ir_1 = (Ir_1)pair2.getSecond();
                        IdentityHashMap identityHashMap = Maps.newIdentityHashMap();
                        if (ir_1.id_break()) {
                            fS_22 = ir_1.id_byte();
                            immutableList2.forEach(arg_0 -> IC.id_class(identityHashMap, fS_22, (List)immutableList, arg_0));
                        } else {
                            fS_22 = null;
                        }
                        ir_1.id_class().forEach((arg_0, arg_1) -> IC.id_class(immutableList2, rCF2, identityHashMap, (List)immutableList, fS_22, pair, ir_1, rqO_25, pair2, arg_0, arg_1));
                        hashMap2.putAll(identityHashMap);
                    }
                    return;
                }
                catch (Il_1 il_1) {
                    throw il_1;
                }
                catch (Exception exception) {
                    throw new Il_1(String.format("Exception loading blockstate definition: '%s': %s", rqO_25, exception));
                }
                finally {
                    HashMap hashMap4 = Maps.newHashMap();
                    hashMap.forEach((iI, xc_32) -> {
                        Pair pair2 = (Pair)hashMap2.get(xc_32);
                        if (pair2 == null) {
                            id_continue.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", (Object)rqO_25, iI);
                            pair2 = pair;
                        }
                        this.id_class((rqO_2)iI, (Id_1)pair2.getFirst());
                        try {
                            IH iH = (IH)((Supplier)pair2.getSecond()).get();
                            ((Set)hashMap3.computeIfAbsent(iH, object -> Sets.newIdentityHashSet())).add(xc_32);
                        }
                        catch (Exception exception) {
                            id_continue.warn("Exception evaluating model definition: '{}'", iI, (Object)exception);
                        }
                    });
                    hashMap4.forEach((object, object2) -> {
                        Iterator iterator = ((Set)object2).iterator();
                        while (iterator.hasNext()) {
                            xc_3 xc_32 = (xc_3)iterator.next();
                            if (xc_32.id_private() == xN_2.MODEL) continue;
                            iterator.remove();
                            this.id_import.put((Object)xc_32, 0);
                        }
                        if (((Set)object2).size() > 1) {
                            this.id_class((Set)object2);
                        }
                    });
                }
            }
        }
    }

    public Object2IntMap<xc_3> id_break() {
        return this.id_import;
    }

    private rqO_2 id_throws(rqO_2 rqO_22) {
        String string = rqO_22.id_break();
        if (string.startsWith("optifine/")) {
            if (!string.endsWith(".json")) {
                rqO_22 = new rqO_2(rqO_22.id_byte(), string + ".json");
            }
            return rqO_22;
        }
        return new rqO_2(rqO_22.id_byte(), "models/" + rqO_22.id_break() + ".json");
    }

    public fp_3 id_protected() {
        return this.id_try;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private we_3 id_protected(rqO_2 rqO_22) throws IOException {
        we_3 we_32;
        rAF rAF2;
        Reader reader;
        block9: {
            String string;
            Object object;
            rqO_2 rqO_23;
            String string2;
            block8: {
                reader = null;
                rAF2 = null;
                string2 = rqO_22.id_break();
                rqO_23 = rqO_22;
                if (!"builtin/generated".equals(string2)) break block8;
                we_3 we_33 = id_final;
                IOUtils.closeQuietly(reader);
                IOUtils.closeQuietly(rAF2);
                return we_33;
            }
            if ("builtin/entity".equals(string2)) break block9;
            if (string2.startsWith("builtin/")) {
                object = string2.substring("builtin/".length());
                string = id_this.get(object);
                if (string == null) {
                    throw new FileNotFoundException(rqO_22.toString());
                }
                reader = new StringReader(string);
            } else {
                rqO_23 = this.id_throws(rqO_22);
                rAF2 = this.id_while.id_class(rqO_23);
                reader = new InputStreamReader(rAF2.id_break(), StandardCharsets.UTF_8);
            }
            object = we_3.id_class(reader);
            ((we_3)object).id_break = rqO_22.toString();
            string = rrzJ_2.id_class(rqO_23.id_break());
            IC.id_class((we_3)object, string);
            Object object2 = object;
            IOUtils.closeQuietly((Reader)reader);
            IOUtils.closeQuietly((Closeable)rAF2);
            return object2;
        }
        try {
            we_32 = id_package;
        }
        finally {
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(rAF2);
        }
        return we_32;
    }
}

