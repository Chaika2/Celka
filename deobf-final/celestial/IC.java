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
   public static final Ig_1 class_ = new Ig_1(fJ_2.class_, new rqO_2("block/fire_0"));
   public static final Ig_1 break_ = new Ig_1(fJ_2.class_, new rqO_2("block/fire_1"));
   public static final Ig_1 byte_ = new Ig_1(fJ_2.class_, new rqO_2("block/lava_flow"));
   public static final Ig_1 protected_ = new Ig_1(fJ_2.class_, new rqO_2("block/water_flow"));
   public static final Ig_1 throws_ = new Ig_1(fJ_2.class_, new rqO_2("block/water_overlay"));
   public static final Ig_1 case_ = new Ig_1(fJ_2.class_, new rqO_2("entity/banner_base"));
   public static final Ig_1 catch_ = new Ig_1(fJ_2.class_, new rqO_2("entity/shield_base"));
   public static final Ig_1 private_ = new Ig_1(fJ_2.class_, new rqO_2("entity/shield_base_nopattern"));
   public static final List<rqO_2> implements_ = IntStream.range(0, 10).mapToObj(var0 -> new rqO_2("block/destroy_stage_" + var0)).collect(Collectors.toList());
   public static final List<rqO_2> finally_ = implements_.stream().map(var0 -> new rqO_2("textures/" + var0.break_() + ".png")).collect(Collectors.toList());
   public static final List<HU> extends_ = finally_.stream().map(HU::package_).collect(Collectors.toList());
   private static final Set<Ig_1> new_ = rqR_2.class_(Sets.newHashSet(), var0 -> {
      var0.add(protected_);
      var0.add(byte_);
      var0.add(throws_);
      var0.add(class_);
      var0.add(break_);
      var0.add(fa_3.class_);
      var0.add(jP_2.class_);
      var0.add(jP_2.break_);
      var0.add(jP_2.byte_);
      var0.add(jP_2.protected_);
      var0.add(jP_2.throws_);
      var0.add(jP_2.case_);
      var0.add(jS_2.class_);
      var0.add(case_);
      var0.add(catch_);
      var0.add(private_);

      for (rqO_2 var2 : implements_) {
         var0.add(new Ig_1(fJ_2.class_, var2));
      }

      var0.add(new Ig_1(fJ_2.class_, rJT.break_));
      var0.add(new Ig_1(fJ_2.class_, rJT.byte_));
      var0.add(new Ig_1(fJ_2.class_, rJT.protected_));
      var0.add(new Ig_1(fJ_2.class_, rJT.catch_));
      var0.add(new Ig_1(fJ_2.class_, rJT.private_));
      lp_3.class_(var0::add);
   });
   private static final Logger continue_ = LogManager.getLogger();
   public static final II native_ = new II("builtin/missing", "missing");
   private static final String super_ = native_.toString();
   public static final String volatile_ = ("{    'textures': {       'particle': '"
         + fQ_2.class_().break_()
         + "',       'missingno': '"
         + fQ_2.class_().break_()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> this_ = Maps.newHashMap(ImmutableMap.of("missing", volatile_));
   private static final Splitter else_ = Splitter.on(',');
   private static final Splitter synchronized_ = Splitter.on('=').limit(2);
   public static final we_3 final_ = rqR_2.class_(we_3.class_("{\"gui_light\": \"front\"}"), var0 -> var0.break_ = "generation marker");
   public static final we_3 package_ = rqR_2.class_(we_3.class_("{\"gui_light\": \"side\"}"), var0 -> var0.break_ = "block entity marker");
   private static final rCF<xd_3, xc_3> return_ = new rCL<xd_3, xc_3>(xu_3.class_).class_(rCN.class_("map")).class_(xd_3::continue_, xc_3::new);
   private static final IN public_ = new IN();
   private static final Map<rqO_2, rCF<xd_3, xc_3>> goto_ = ImmutableMap.of(new rqO_2("item_frame"), return_);
   private final rAL while_;
   private fp_3 try_;
   private final yC_2 instanceof_;
   private final Set<rqO_2> throw_ = Sets.newHashSet();
   private final IP interface_ = new IP();
   private final Map<rqO_2, Id_1> char_ = Maps.newHashMap();
   private final Map<Triple<rqO_2, rjo_3, Boolean>, IJ> abstract_ = Maps.newHashMap();
   private final Map<rqO_2, Id_1> long_ = Maps.newHashMap();
   private final Map<rqO_2, IJ> float_ = Maps.newHashMap();
   private Map<rqO_2, Pair<fJ_2, fx_3>> void_;
   private int static_ = 1;
   private final Object2IntMap<xc_3> import_ = rqR_2.class_(new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));
   public Map<rqO_2, Id_1> int_;

   private void byte_(rqO_2 var1) {
      Id_1 var2 = this.class_(var1);
      this.char_.put(var1, var2);
      this.long_.put(var1, var2);
   }

   public Set<rqO_2> byte_() {
      return Collections.emptySet();
   }

   public IC(rAL var1, yC_2 var2, int var3) {
      this(var1, var2, true);
      this.class_(var3);
   }

   protected IC(rAL var1, yC_2 var2, boolean var3) {
      this.while_ = var1;
      this.instanceof_ = var2;
   }

   protected void class_(int var1) {
      rrxr_3.Bm.catch_();

      try {
         this.char_.put(native_, this.protected_(native_));
         this.class_(native_);
      } catch (IOException var9) {
         continue_.error("Error loading missing model, should never happen :(", var9);
         throw new RuntimeException(var9);
      }

      goto_.forEach((var1x, var2) -> var2.class_().forEach(var2x -> this.class_(lY_2.class_(var1x, var2x))));

      for (xd_3 var3 : rVL.strictfp_) {
         var3.new_().class_().forEach(var1x -> this.class_(lY_2.byte_(var1x)));
      }

      for (rqO_2 var13 : rVL.for_.protected_()) {
         this.class_(new II(var13, "inventory"));
      }

      this.class_(new II("minecraft:trident_in_hand#inventory"));

      for (rqO_2 var14 : this.byte_()) {
         this.byte_(var14);
      }

      this.int_ = this.char_;
      rrzJ_2.class_(this);
      LinkedHashSet var12 = Sets.newLinkedHashSet();
      Set var15 = this.long_.values().stream().flatMap(var2 -> var2.class_(this::class_, var12).stream()).collect(Collectors.toSet());
      var15.addAll(new_);
      rrxr_3.private_(rrxr_3.rz, var15);
      var12.stream()
         .filter(var0 -> !((String)var0.getSecond()).equals(super_))
         .forEach(var0 -> continue_.warn("Unable to resolve texture reference: {} in {}", var0.getFirst(), var0.getSecond()));
      Map var4 = var15.stream().collect(Collectors.groupingBy(Ig_1::class_));
      this.void_ = Maps.newHashMap();

      for (Entry var6 : var4.entrySet()) {
         fJ_2 var7 = new fJ_2((rqO_2)var6.getKey());
         fx_3 var8 = var7.class_(this.while_, ((List)var6.getValue()).stream().map(Ig_1::break_), var1);
         this.void_.put((rqO_2)var6.getKey(), Pair.of(var7, var8));
      }
   }

   public void class_(II var1) {
      Id_1 var2 = this.class_((rqO_2)var1);
      this.char_.put(var1, var2);
      this.long_.put(var1, var2);
   }

   private void class_(Iterable<xc_3> var1) {
      int var2 = this.static_++;
      var1.forEach(var2x -> this.import_.put(var2x, var2));
   }

   public IJ class_(rqO_2 var1, Ix_1 var2) {
      return this.class_(var1, var2, this.try_::class_);
   }

   public IJ class_(rqO_2 var1, Ix_1 var2, Function<Ig_1, fj_3> var3) {
      Triple var4 = Triple.of(var1, var2.class_(), var2.break_());
      if (this.abstract_.containsKey(var4)) {
         return this.abstract_.get(var4);
      } else if (this.try_ == null) {
         throw new IllegalStateException("bake called too early");
      } else {
         Id_1 var5 = this.class_(var1);
         if (!(var5 instanceof we_3 var6) || var6.case_() != final_) {
            IJ var7 = var5.class_(this, this.try_::class_, var2, var1);
            if (rrxr_3.rb.byte_()) {
               var7 = var5.class_(this, var3, var2, var1);
            }

            this.abstract_.put(var4, var7);
            return var7;
         }

         return rrxr_3.rb.byte_()
            ? public_.class_(var3, var6).class_(this, var6, var3, var2, var1, false)
            : public_.class_(this.try_::class_, var6).class_(this, var6, this.try_::class_, var2, var1, false);
      }
   }

   public Map<rqO_2, IJ> class_() {
      return this.float_;
   }

   static <T extends Comparable<T>> T class_(rCZ<T> var0, String var1) {
      return (T)var0.break_(var1).orElse(null);
   }

   public Id_1 class_(rqO_2 var1) {
      if (this.char_.containsKey(var1)) {
         return this.char_.get(var1);
      } else if (this.throw_.contains(var1)) {
         throw new IllegalStateException("Circular reference while loading " + var1);
      } else {
         this.throw_.add(var1);
         Id_1 var2 = this.char_.get(native_);

         while (!this.throw_.isEmpty()) {
            rqO_2 var3 = this.throw_.iterator().next();

            try {
               if (!this.char_.containsKey(var3)) {
                  this.break_(var3);
               }
            } catch (Il_1 var9) {
               continue_.warn(var9.getMessage());
               this.char_.put(var3, var2);
            } catch (Exception var10) {
               continue_.warn("Unable to load model: '{}' referenced from: {}: {}", var3, var1);
               continue_.warn(var10.getClass().getName() + ": " + var10.getMessage());
               this.char_.put(var3, var2);
            } finally {
               this.throw_.remove(var3);
            }
         }

         return this.char_.getOrDefault(var1, var2);
      }
   }

   private void class_(rqO_2 var1, Id_1 var2) {
      this.char_.put(var1, var2);
      this.throw_.addAll(var2.throws_());
   }

   private static Predicate<xc_3> class_(rCF<xd_3, xc_3> var0, String var1) {
      HashMap var2 = Maps.newHashMap();

      for (String var4 : else_.split(var1)) {
         Iterator var5 = synchronized_.split(var4).iterator();
         if (var5.hasNext()) {
            String var6 = (String)var5.next();
            rCZ var7 = var0.class_(var6);
            if (var7 != null && var5.hasNext()) {
               String var8 = (String)var5.next();
               Comparable var9 = class_(var7, var8);
               if (var9 == null) {
                  throw new RuntimeException("Unknown value: '" + var8 + "' for blockstate property: '" + var6 + "' " + var7.class_());
               }

               var2.put(var7, var9);
            } else if (!var6.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + var6 + "'");
            }
         }
      }

      xd_3 var10 = (xd_3)var0.byte_();
      return var2x -> {
         if (var2x != null && var10 == var2x.break_()) {
            for (Entry var4x : var2.entrySet()) {
               if (!Objects.equals(var2x.byte_((rCZ)var4x.getKey()), var4x.getValue())) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      };
   }

   public static void class_(we_3 var0, String var1) {
      rqO_2 var2 = class_(var0.throws_, var1);
      if (var2 != var0.throws_) {
         var0.throws_ = var2;
      }

      if (var0.byte_ != null) {
         for (Entry var4 : var0.byte_.entrySet()) {
            Either var5 = (Either)var4.getValue();
            Optional var6 = var5.left();
            if (var6.isPresent()) {
               Ig_1 var7 = (Ig_1)var6.get();
               rqO_2 var8 = var7.break_();
               String var9 = var8.break_();
               String var10 = class_(var9, var1);
               if (!var10.equals(var9)) {
                  rqO_2 var11 = new rqO_2(var8.byte_(), var10);
                  Ig_1 var12 = new Ig_1(var7.class_(), var11);
                  Either var13 = Either.left(var12);
                  var4.setValue(var13);
               }
            }
         }
      }
   }

   public static rqO_2 class_(rqO_2 var0, String var1) {
      if (var0 != null && var1 != null) {
         if (!var0.byte_().equals("minecraft")) {
            return var0;
         } else {
            String var2 = var0.break_();
            String var3 = class_(var2, var1);
            if (var3 != var2) {
               var0 = new rqO_2(var0.byte_(), var3);
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public fp_3 class_(fY_2 var1) {
      for (Pair var3 : this.void_.values()) {
         fJ_2 var4 = (fJ_2)var3.getFirst();
         fx_3 var5 = (fx_3)var3.getSecond();
         var4.class_(var5);
         var1.class_(var4.protected_(), var4);
         var1.class_(var4.protected_());
         var4.break_(var5);
      }

      this.try_ = new fp_3(this.void_.values().stream().<fJ_2>map(Pair::getFirst).collect(Collectors.toList()));
      this.long_.keySet().forEach(var1x -> {
         IJ var2 = null;

         try {
            var2 = this.class_(var1x, If_1.X0_Y0);
         } catch (Exception var4x) {
            continue_.warn("Unable to bake model: '{}': {}", var1x, var4x);
         }

         if (var2 != null) {
            this.float_.put(var1x, var2);
         }
      });
      return this.try_;
   }

   private static String class_(String var0, String var1) {
      var0 = rrzJ_2.class_(var0, var1);
      var0 = rrzX_2.throws_(var0, ".json");
      return rrzX_2.throws_(var0, ".png");
   }

   private void break_(rqO_2 var1) throws Exception {
      if (!(var1 instanceof II var2)) {
         this.class_(var1, this.protected_(var1));
      } else {
         if (!Objects.equals(var2.class_(), "inventory")) {
            rqO_2 var29 = new rqO_2(var1.byte_(), var1.break_());
            rCF var30 = Optional.ofNullable(goto_.get(var29)).orElseGet(() -> rVL.strictfp_.class_(var29).new_());
            this.interface_.class_(var30);
            ImmutableList var31 = ImmutableList.copyOf(this.instanceof_.class_((xd_3)var30.byte_()));
            ImmutableList var6 = var30.class_();
            HashMap var7 = Maps.newHashMap();
            var6.forEach(var2x -> {
               xc_3 var3x = var7.put(lY_2.class_(var29, var2x), var2x);
            });
            HashMap var8 = Maps.newHashMap();
            rqO_2 var9 = new rqO_2(var1.byte_(), "blockstates/" + var1.break_() + ".json");
            Id_1 var10 = this.char_.get(native_);
            IH var11 = new IH(ImmutableList.of(var10), ImmutableList.of());
            Pair var12 = Pair.of(var10, (Supplier<IH>)() -> var11);

            try {
               List var13;
               try {
                  var13 = this.while_
                     .byte_(var9)
                     .stream()
                     .map(
                        var1x -> {
                           try {
                              Pair var3x;
                              try (InputStream var2x = var1x.break_()) {
                                 var3x = Pair.of(var1x.byte_(), Ir_1.class_(this.interface_, new InputStreamReader(var2x, StandardCharsets.UTF_8)));
                              }

                              return var3x;
                           } catch (Exception var7x) {
                              throw new Il_1(
                                 String.format(
                                    "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s",
                                    var1x.class_(),
                                    var1x.byte_(),
                                    var7x.getMessage()
                                 )
                              );
                           }
                        }
                     )
                     .collect(Collectors.toList());
               } catch (IOException var25) {
                  continue_.warn("Exception loading blockstate definition: {}: {}", var9, var25);
                  return;
               }

               for (Pair var15 : var13) {
                  Ir_1 var16 = (Ir_1)var15.getSecond();
                  IdentityHashMap var17 = Maps.newIdentityHashMap();
                  fS_2 var18;
                  if (var16.break_()) {
                     var18 = var16.byte_();
                     var6.forEach(var3x -> {
                        Pair var4x = var17.put(var3x, Pair.of(var18, (Supplier<IH>)() -> IH.class_(var3x, var18, var31)));
                     });
                  } else {
                     var18 = null;
                  }

                  var16.class_()
                     .forEach(
                        (var9x, var10x) -> {
                           try {
                              var6.stream()
                                 .filter(class_(var30, var9x))
                                 .forEach(
                                    var6xx -> {
                                       Pair var7xx = var17.put(var6xx, Pair.of(var10x, (Supplier<IH>)() -> IH.class_(var6xx, var10x, var31)));
                                       if (var7xx != null && var7xx.getFirst() != var18) {
                                          var17.put(var6xx, var12);
                                          throw new RuntimeException(
                                             "Overlapping definition with: "
                                                + var16.class_()
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
                              continue_.warn(
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
                     continue_.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", var9, var5x);
                     var7x = var12;
                  }

                  this.class_(var5x, (Id_1)var7x.getFirst());

                  try {
                     IH var8x = (IH)((Supplier)var7x.getSecond()).get();
                     var20.computeIfAbsent(var8x, var0 -> Sets.newIdentityHashSet()).add(var6x);
                  } catch (Exception var9x) {
                     continue_.warn("Exception evaluating model definition: '{}'", var5x, var9x);
                  }
               });
               var20.forEach((var1x, var2x) -> {
                  Iterator var3x = ((Set)var2x).iterator();

                  while (var3x.hasNext()) {
                     xc_3 var4x = (xc_3)var3x.next();
                     if (var4x.private_() != xN_2.MODEL) {
                        var3x.remove();
                        this.import_.put(var4x, 0);
                     }
                  }

                  if (((Set)var2x).size() > 1) {
                     this.class_((Iterable<xc_3>)((Set)var2x));
                  }
               });
            }
         }

         rqO_2 var3 = new rqO_2(var1.byte_(), "item/" + var1.break_());
         String var4 = var1.break_();
         if (var4.startsWith("optifine/") || var4.startsWith("item/")) {
            var3 = var1;
         }

         we_3 var5 = this.protected_(var3);
         this.class_((rqO_2)var2, (Id_1)var5);
         this.char_.put(var3, var5);
      }
   }

   public Object2IntMap<xc_3> break_() {
      return this.import_;
   }

   private rqO_2 throws_(rqO_2 var1) {
      String var2 = var1.break_();
      if (var2.startsWith("optifine/")) {
         if (!var2.endsWith(".json")) {
            var1 = new rqO_2(var1.byte_(), var2 + ".json");
         }

         return var1;
      } else {
         return new rqO_2(var1.byte_(), "models/" + var1.break_() + ".json");
      }
   }

   public fp_3 protected_() {
      return this.try_;
   }

   private we_3 protected_(rqO_2 var1) throws IOException {
      Object var2 = null;
      rAF var3 = null;

      we_3 var9;
      try {
         String var5 = var1.break_();
         rqO_2 var6 = var1;
         if ("builtin/generated".equals(var5)) {
            return final_;
         }

         if ("builtin/entity".equals(var5)) {
            return package_;
         }

         if (var5.startsWith("builtin/")) {
            String var7 = var5.substring("builtin/".length());
            String var8 = this_.get(var7);
            if (var8 == null) {
               throw new FileNotFoundException(var1.toString());
            }

            var2 = new StringReader(var8);
         } else {
            var6 = this.throws_(var1);
            var3 = this.while_.class_(var6);
            var2 = new InputStreamReader(var3.break_(), StandardCharsets.UTF_8);
         }

         we_3 var13 = we_3.class_((Reader)var2);
         var13.break_ = var1.toString();
         String var15 = rrzJ_2.class_(var6.break_());
         class_(var13, var15);
         var9 = var13;
      } finally {
         IOUtils.closeQuietly((Reader)var2);
         IOUtils.closeQuietly(var3);
      }

      return var9;
   }
}
