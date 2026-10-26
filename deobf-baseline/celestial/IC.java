package celestial;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
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
import java.util.Map.Entry;
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
   public static final List<rqO_2> id_implements = IntStream.range(0, 10)
      .mapToObj(var0 -> new rqO_2("block/destroy_stage_" + var0))
      .collect(Collectors.toList());
   public static final List<rqO_2> id_finally = id_implements.stream()
      .map(var0 -> new rqO_2("textures/" + var0.id_break() + ".png"))
      .collect(Collectors.toList());
   public static final List<HU> id_extends = id_finally.stream().map(HU::id_package).collect(Collectors.toList());
   private static final Set<Ig_1> id_new = rqR_2.id_class(Sets.newHashSet(), var0 -> {
      var0.add(id_protected);
      var0.add(id_byte);
      var0.add(id_throws);
      var0.add(id_class);
      var0.add(id_break);
      var0.add(fa_3.id_class);
      var0.add(jP_2.id_class);
      var0.add(jP_2.id_break);
      var0.add(jP_2.id_byte);
      var0.add(jP_2.id_protected);
      var0.add(jP_2.id_throws);
      var0.add(jP_2.id_case);
      var0.add(jS_2.id_class);
      var0.add(id_case);
      var0.add(id_catch);
      var0.add(id_private);

      for (rqO_2 var2 : id_implements) {
         var0.add(new Ig_1(fJ_2.id_class, var2));
      }

      var0.add(new Ig_1(fJ_2.id_class, rJT.id_break));
      var0.add(new Ig_1(fJ_2.id_class, rJT.id_byte));
      var0.add(new Ig_1(fJ_2.id_class, rJT.id_protected));
      var0.add(new Ig_1(fJ_2.id_class, rJT.id_catch));
      var0.add(new Ig_1(fJ_2.id_class, rJT.id_private));
      lp_3.id_class(var0::add);
   });
   private static final Logger id_continue = LogManager.getLogger();
   public static final II id_native = new II("builtin/missing", "missing");
   private static final String id_super = id_native.toString();
   public static final String id_volatile = ("{    'textures': {       'particle': '"
         + fQ_2.id_class().id_break()
         + "',       'missingno': '"
         + fQ_2.id_class().id_break()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> id_this = Maps.newHashMap(ImmutableMap.of("missing", id_volatile));
   private static final Splitter id_else = Splitter.on(',');
   private static final Splitter id_synchronized = Splitter.on('=').limit(2);
   public static final we_3 id_final = rqR_2.id_class(we_3.id_class("{\"gui_light\": \"front\"}"), var0 -> var0.id_break = "generation marker");
   public static final we_3 id_package = rqR_2.id_class(we_3.id_class("{\"gui_light\": \"side\"}"), var0 -> var0.id_break = "block entity marker");
   private static final rCF<xd_3, xc_3> id_return = new rCL<xd_3, xc_3>(xu_3.id_class).id_class(rCN.id_class("map")).id_class(xd_3::id_continue, xc_3::new);
   private static final IN id_public = new IN();
   private static final Map<rqO_2, rCF<xd_3, xc_3>> id_goto = ImmutableMap.of(new rqO_2("item_frame"), id_return);
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
   private final Object2IntMap<xc_3> id_import = rqR_2.id_class(new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));
   public Map<rqO_2, Id_1> id_int;

   private void id_byte(rqO_2 var1) {
      Id_1 var2 = this.id_class(var1);
      this.id_char.put(var1, var2);
      this.id_long.put(var1, var2);
   }

   public Set<rqO_2> id_byte() {
      return Collections.emptySet();
   }

   public IC(rAL var1, yC_2 var2, int var3) {
      this(var1, var2, true);
      this.id_class(var3);
   }

   protected IC(rAL var1, yC_2 var2, boolean var3) {
      this.id_while = var1;
      this.id_instanceof = var2;
   }

   protected void id_class(int var1) {
      rrxr_3.Bm.id_catch();

      try {
         this.id_char.put(id_native, this.id_protected(id_native));
         this.id_class(id_native);
      } catch (IOException var9) {
         id_continue.error("Error loading missing model, should never happen :(", var9);
         throw new RuntimeException(var9);
      }

      id_goto.forEach((var1x, var2) -> var2.id_class().forEach(var2x -> this.id_class(lY_2.id_class(var1x, var2x))));

      for (xd_3 var3 : rVL.id_strictfp) {
         var3.id_new().id_class().forEach(var1x -> this.id_class(lY_2.id_byte(var1x)));
      }

      for (rqO_2 var13 : rVL.id_for.id_protected()) {
         this.id_class(new II(var13, "inventory"));
      }

      this.id_class(new II("minecraft:trident_in_hand#inventory"));

      for (rqO_2 var14 : this.id_byte()) {
         this.id_byte(var14);
      }

      this.id_int = this.id_char;
      rrzJ_2.id_class(this);
      LinkedHashSet var12 = Sets.newLinkedHashSet();
      Set var15 = this.id_long.values().stream().flatMap(var2 -> var2.id_class(this::id_class, var12).stream()).collect(Collectors.toSet());
      var15.addAll(id_new);
      rrxr_3.id_private(rrxr_3.rz, var15);
      var12.stream()
         .filter(var0 -> !((String)var0.getSecond()).equals(id_super))
         .forEach(var0 -> id_continue.warn("Unable to resolve texture reference: {} in {}", var0.getFirst(), var0.getSecond()));
      Map var4 = var15.stream().collect(Collectors.groupingBy(Ig_1::id_class));
      this.id_void = Maps.newHashMap();

      for (Entry var6 : var4.entrySet()) {
         fJ_2 var7 = new fJ_2((rqO_2)var6.getKey());
         fx_3 var8 = var7.id_class(this.id_while, ((List)var6.getValue()).stream().map(Ig_1::id_break), var1);
         this.id_void.put((rqO_2)var6.getKey(), Pair.of(var7, var8));
      }
   }

   public void id_class(II var1) {
      Id_1 var2 = this.id_class((rqO_2)var1);
      this.id_char.put(var1, var2);
      this.id_long.put(var1, var2);
   }

   private void id_class(Iterable<xc_3> var1) {
      int var2 = this.id_static++;
      var1.forEach(var2x -> this.id_import.put(var2x, var2));
   }

   public IJ id_class(rqO_2 var1, Ix_1 var2) {
      return this.id_class(var1, var2, this.id_try::id_class);
   }

   public IJ id_class(rqO_2 var1, Ix_1 var2, Function<Ig_1, fj_3> var3) {
      Triple var4 = Triple.of(var1, var2.id_class(), var2.id_break());
      if (this.id_abstract.containsKey(var4)) {
         return this.id_abstract.get(var4);
      } else if (this.id_try == null) {
         throw new IllegalStateException("bake called too early");
      } else {
         Id_1 var5 = this.id_class(var1);
         if (!(var5 instanceof we_3 var6) || var6.id_case() != id_final) {
            IJ var7 = var5.id_class(this, this.id_try::id_class, var2, var1);
            if (rrxr_3.rb.id_byte()) {
               var7 = var5.id_class(this, var3, var2, var1);
            }

            this.id_abstract.put(var4, var7);
            return var7;
         }

         return rrxr_3.rb.id_byte()
            ? id_public.id_class(var3, var6).id_class(this, var6, var3, var2, var1, false)
            : id_public.id_class(this.id_try::id_class, var6).id_class(this, var6, this.id_try::id_class, var2, var1, false);
      }
   }

   public Map<rqO_2, IJ> id_class() {
      return this.id_float;
   }

   static <T extends Comparable<T>> T id_class(rCZ<T> var0, String var1) {
      return (T)var0.id_break(var1).orElse(null);
   }

   public Id_1 id_class(rqO_2 var1) {
      if (this.id_char.containsKey(var1)) {
         return this.id_char.get(var1);
      } else if (this.id_throw.contains(var1)) {
         throw new IllegalStateException("Circular reference while loading " + var1);
      } else {
         this.id_throw.add(var1);
         Id_1 var2 = this.id_char.get(id_native);

         while (!this.id_throw.isEmpty()) {
            rqO_2 var3 = this.id_throw.iterator().next();

            try {
               if (!this.id_char.containsKey(var3)) {
                  this.id_break(var3);
               }
            } catch (Il_1 var9) {
               id_continue.warn(var9.getMessage());
               this.id_char.put(var3, var2);
            } catch (Exception var10) {
               id_continue.warn("Unable to load model: '{}' referenced from: {}: {}", var3, var1);
               id_continue.warn(var10.getClass().getName() + ": " + var10.getMessage());
               this.id_char.put(var3, var2);
            } finally {
               this.id_throw.remove(var3);
            }
         }

         return this.id_char.getOrDefault(var1, var2);
      }
   }

   private void id_class(rqO_2 var1, Id_1 var2) {
      this.id_char.put(var1, var2);
      this.id_throw.addAll(var2.id_throws());
   }

   private static Predicate<xc_3> id_class(rCF<xd_3, xc_3> var0, String var1) {
      HashMap var2 = Maps.newHashMap();

      for (String var4 : id_else.split(var1)) {
         Iterator var5 = id_synchronized.split(var4).iterator();
         if (var5.hasNext()) {
            String var6 = (String)var5.next();
            rCZ var7 = var0.id_class(var6);
            if (var7 != null && var5.hasNext()) {
               String var8 = (String)var5.next();
               Comparable var9 = id_class(var7, var8);
               if (var9 == null) {
                  throw new RuntimeException("Unknown value: '" + var8 + "' for blockstate property: '" + var6 + "' " + var7.id_class());
               }

               var2.put(var7, var9);
            } else if (!var6.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + var6 + "'");
            }
         }
      }

      xd_3 var10 = (xd_3)var0.id_byte();
      return var2x -> {
         if (var2x != null && var10 == var2x.id_break()) {
            for (Entry var4x : var2.entrySet()) {
               if (!Objects.equals(var2x.id_byte((rCZ)var4x.getKey()), var4x.getValue())) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      };
   }

   public static void id_class(we_3 var0, String var1) {
      rqO_2 var2 = id_class(var0.id_throws, var1);
      if (var2 != var0.id_throws) {
         var0.id_throws = var2;
      }

      if (var0.id_byte != null) {
         for (Entry var4 : var0.id_byte.entrySet()) {
            Either var5 = (Either)var4.getValue();
            Optional var6 = var5.left();
            if (var6.isPresent()) {
               Ig_1 var7 = (Ig_1)var6.get();
               rqO_2 var8 = var7.id_break();
               String var9 = var8.id_break();
               String var10 = id_class(var9, var1);
               if (!var10.equals(var9)) {
                  rqO_2 var11 = new rqO_2(var8.id_byte(), var10);
                  Ig_1 var12 = new Ig_1(var7.id_class(), var11);
                  Either var13 = Either.left(var12);
                  var4.setValue(var13);
               }
            }
         }
      }
   }

   public static rqO_2 id_class(rqO_2 var0, String var1) {
      if (var0 != null && var1 != null) {
         if (!var0.id_byte().equals("minecraft")) {
            return var0;
         } else {
            String var2 = var0.id_break();
            String var3 = id_class(var2, var1);
            if (var3 != var2) {
               var0 = new rqO_2(var0.id_byte(), var3);
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public fp_3 id_class(fY_2 var1) {
      for (Pair var3 : this.id_void.values()) {
         fJ_2 var4 = (fJ_2)var3.getFirst();
         fx_3 var5 = (fx_3)var3.getSecond();
         var4.id_class(var5);
         var1.id_class(var4.id_protected(), var4);
         var1.id_class(var4.id_protected());
         var4.id_break(var5);
      }

      this.id_try = new fp_3(this.id_void.values().stream().<fJ_2>map(Pair::getFirst).collect(Collectors.toList()));
      this.id_long.keySet().forEach(var1x -> {
         IJ var2 = null;

         try {
            var2 = this.id_class(var1x, If_1.X0_Y0);
         } catch (Exception var4x) {
            id_continue.warn("Unable to bake model: '{}': {}", var1x, var4x);
         }

         if (var2 != null) {
            this.id_float.put(var1x, var2);
         }
      });
      return this.id_try;
   }

   private static String id_class(String var0, String var1) {
      var0 = rrzJ_2.id_class(var0, var1);
      var0 = rrzX_2.id_throws(var0, ".json");
      return rrzX_2.id_throws(var0, ".png");
   }

   private void id_break(rqO_2 var1) throws Exception {
      if (!(var1 instanceof II var2)) {
         this.id_class(var1, this.id_protected(var1));
      } else {
         if (!Objects.equals(var2.id_class(), "inventory")) {
            rqO_2 var29 = new rqO_2(var1.id_byte(), var1.id_break());
            rCF var30 = Optional.ofNullable(id_goto.get(var29)).orElseGet(() -> rVL.id_strictfp.id_class(var29).id_new());
            this.id_interface.id_class(var30);
            ImmutableList var31 = ImmutableList.copyOf(this.id_instanceof.id_class((xd_3)var30.id_byte()));
            ImmutableList var6 = var30.id_class();
            HashMap var7 = Maps.newHashMap();
            var6.forEach(var2x -> {
               xc_3 var3x = var7.put(lY_2.id_class(var29, var2x), var2x);
            });
            HashMap var8 = Maps.newHashMap();
            rqO_2 var9 = new rqO_2(var1.id_byte(), "blockstates/" + var1.id_break() + ".json");
            Id_1 var10 = this.id_char.get(id_native);
            IH var11 = new IH(ImmutableList.of(var10), ImmutableList.of());
            Pair var12 = Pair.of(var10, (Supplier<IH>)() -> var11);

            try {
               List var13;
               try {
                  var13 = this.id_while
                     .id_byte(var9)
                     .stream()
                     .map(
                        var1x -> {
                           try {
                              Pair var3x;
                              try (InputStream var2x = var1x.id_break()) {
                                 var3x = Pair.of(var1x.id_byte(), Ir_1.id_class(this.id_interface, new InputStreamReader(var2x, StandardCharsets.UTF_8)));
                              }

                              return var3x;
                           } catch (Exception var7x) {
                              throw new Il_1(
                                 String.format(
                                    "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s",
                                    var1x.id_class(),
                                    var1x.id_byte(),
                                    var7x.getMessage()
                                 )
                              );
                           }
                        }
                     )
                     .collect(Collectors.toList());
               } catch (IOException var25) {
                  id_continue.warn("Exception loading blockstate definition: {}: {}", var9, var25);
                  return;
               }

               for (Pair var15 : var13) {
                  Ir_1 var16 = (Ir_1)var15.getSecond();
                  IdentityHashMap var17 = Maps.newIdentityHashMap();
                  fS_2 var18;
                  if (var16.id_break()) {
                     var18 = var16.id_byte();
                     var6.forEach(var3x -> {
                        Pair var4x = var17.put(var3x, Pair.of(var18, (Supplier<IH>)() -> IH.id_class(var3x, var18, var31)));
                     });
                  } else {
                     var18 = null;
                  }

                  var16.id_class()
                     .forEach(
                        (var9x, var10x) -> {
                           try {
                              var6.stream()
                                 .filter(id_class(var30, var9x))
                                 .forEach(
                                    var6xx -> {
                                       Pair var7xx = var17.put(var6xx, Pair.of(var10x, (Supplier<IH>)() -> IH.id_class(var6xx, var10x, var31)));
                                       if (var7xx != null && var7xx.getFirst() != var18) {
                                          var17.put(var6xx, var12);
                                          throw new RuntimeException(
                                             "Overlapping definition with: "
                                                + var16.id_class()
                                                   .entrySet()
                                                   .stream()
                                                   .filter(var1xxx -> var1xxx.getValue() == var7xx.getFirst())
                                                   .findFirst()
                                                   .get()
                                                   .getKey()
                                          );
                                       }
                                    }
                                 );
                           } catch (Exception var12x) {
                              id_continue.warn(
                                 "Exception loading blockstate definition: '{}' in resourcepack: '{}' for variant: '{}': {}",
                                 var9,
                                 var15.getFirst(),
                                 var9x,
                                 var12x.getMessage()
                              );
                           }
                        }
                     );
                  var8.putAll(var17);
               }

               return;
            } catch (Il_1 var26) {
               throw var26;
            } catch (Exception var27) {
               throw new Il_1(String.format("Exception loading blockstate definition: '%s': %s", var9, var27));
            } finally {
               HashMap var20 = Maps.newHashMap();
               var7.forEach((var5x, var6x) -> {
                  Pair var7x = (Pair)var8.get(var6x);
                  if (var7x == null) {
                     id_continue.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", var9, var5x);
                     var7x = var12;
                  }

                  this.id_class(var5x, (Id_1)var7x.getFirst());

                  try {
                     IH var8x = (IH)((Supplier)var7x.getSecond()).get();
                     var20.computeIfAbsent(var8x, var0 -> Sets.newIdentityHashSet()).add(var6x);
                  } catch (Exception var9x) {
                     id_continue.warn("Exception evaluating model definition: '{}'", var5x, var9x);
                  }
               });
               var20.forEach((var1x, var2x) -> {
                  Iterator var3x = ((Set)var2x).iterator();

                  while (var3x.hasNext()) {
                     xc_3 var4x = (xc_3)var3x.next();
                     if (var4x.id_private() != xN_2.MODEL) {
                        var3x.remove();
                        this.id_import.put(var4x, 0);
                     }
                  }

                  if (((Set)var2x).size() > 1) {
                     this.id_class((Iterable<xc_3>)((Set)var2x));
                  }
               });
            }
         }

         rqO_2 var3 = new rqO_2(var1.id_byte(), "item/" + var1.id_break());
         String var4 = var1.id_break();
         if (var4.startsWith("optifine/") || var4.startsWith("item/")) {
            var3 = var1;
         }

         we_3 var5 = this.id_protected(var3);
         this.id_class((rqO_2)var2, (Id_1)var5);
         this.id_char.put(var3, var5);
      }
   }

   public Object2IntMap<xc_3> id_break() {
      return this.id_import;
   }

   private rqO_2 id_throws(rqO_2 var1) {
      String var2 = var1.id_break();
      if (var2.startsWith("optifine/")) {
         if (!var2.endsWith(".json")) {
            var1 = new rqO_2(var1.id_byte(), var2 + ".json");
         }

         return var1;
      } else {
         return new rqO_2(var1.id_byte(), "models/" + var1.id_break() + ".json");
      }
   }

   public fp_3 id_protected() {
      return this.id_try;
   }

   private we_3 id_protected(rqO_2 var1) throws IOException {
      Object var2 = null;
      rAF var3 = null;

      we_3 var9;
      try {
         String var5 = var1.id_break();
         rqO_2 var6 = var1;
         if ("builtin/generated".equals(var5)) {
            return id_final;
         }

         if ("builtin/entity".equals(var5)) {
            return id_package;
         }

         if (var5.startsWith("builtin/")) {
            String var7 = var5.substring("builtin/".length());
            String var8 = id_this.get(var7);
            if (var8 == null) {
               throw new FileNotFoundException(var1.toString());
            }

            var2 = new StringReader(var8);
         } else {
            var6 = this.id_throws(var1);
            var3 = this.id_while.id_class(var6);
            var2 = new InputStreamReader(var3.id_break(), StandardCharsets.UTF_8);
         }

         we_3 var13 = we_3.id_class((Reader)var2);
         var13.id_break = var1.toString();
         String var15 = rrzJ_2.id_class(var6.id_break());
         id_class(var13, var15);
         var9 = var13;
      } finally {
         IOUtils.closeQuietly((Reader)var2);
         IOUtils.closeQuietly(var3);
      }

      return var9;
   }
}
