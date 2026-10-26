package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKQ {
   private static final Logger id_break = LogManager.getLogger();
   public static final Codec<rKQ> id_class = RecordCodecBuilder.create(
         var0 -> var0.group(
                  rVn_1.id_class(rVL.n).forGetter(var0x -> var0x.id_protected),
                  rrSq_1.id_class.fieldOf("structures").forGetter(rKQ::id_protected),
                  rKN.id_class.listOf().fieldOf("layers").forGetter(rKQ::id_case),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter(var0x -> var0x.id_extends),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter(var0x -> var0x.id_finally),
                  rYG.id_protected.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter(var0x -> Optional.of(var0x.id_catch))
               )
               .apply(var0, rKQ::new)
      )
      .stable();
   private static final Map<rrrZ<?>, reP_2<?, ?>> id_byte = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put(rrrZ.id_byte, rrrF.id_break);
      var0.put(rrrZ.id_new, rrrF.id_this);
      var0.put(rrrZ.id_extends, rrrF.id_extends);
      var0.put(rrrZ.id_finally, rrrF.id_finally);
      var0.put(rrrZ.id_case, rrrF.id_case);
      var0.put(rrrZ.id_throws, rrrF.id_throws);
      var0.put(rrrZ.id_catch, rrrF.id_catch);
      var0.put(rrrZ.id_volatile, rrrF.id_volatile);
      var0.put(rrrZ.id_implements, rrrF.id_private);
      var0.put(rrrZ.id_native, rrrF.id_native);
      var0.put(rrrZ.id_package, rrrF.id_new);
      var0.put(rrrZ.id_protected, rrrF.id_protected);
      var0.put(rrrZ.id_final, rrrF.id_package);
      var0.put(rrrZ.id_break, rrrF.id_class);
      var0.put(rrrZ.id_private, rrrF.id_goto);
      var0.put(rrrZ.id_super, rrrF.id_super);
   });
   private final rVL<rYG> id_protected;
   private final rrSq_1 id_throws;
   private final List<rKN> id_case = Lists.newArrayList();
   private Supplier<rYG> id_catch;
   private final xc_3[] id_private = new xc_3[256];
   private boolean id_implements;
   private boolean id_finally = false;
   private boolean id_extends = false;

   public rYG id_byte() {
      rYG var1 = this.id_throws();
      rYv_1 var2 = var1.id_throws();
      rYF var3 = new rYF().id_class(var2.id_protected());
      if (this.id_extends) {
         var3.id_class(rKm_1.LAKES, rUx_1.id_strictfp);
         var3.id_class(rKm_1.LAKES, rUx_1.id_boolean);
      }

      for (Entry var5 : this.id_throws.id_class().entrySet()) {
         var3.id_class(var2.id_class(id_byte.get(var5.getKey())));
      }

      boolean var9 = (!this.id_implements || this.id_protected.id_byte(var1).equals(Optional.of(rYl_1.E))) && this.id_finally;
      if (var9) {
         List var10 = var2.id_byte();

         for (int var6 = 0; var6 < var10.size(); var6++) {
            if (var6 != rKm_1.UNDERGROUND_STRUCTURES.ordinal() && var6 != rKm_1.SURFACE_STRUCTURES.ordinal()) {
               for (Supplier var8 : (List)var10.get(var6)) {
                  var3.id_class(var6, var8);
               }
            }
         }
      }

      xc_3[] var11 = this.id_catch();

      for (int var12 = 0; var12 < var11.length; var12++) {
         xc_3 var13 = var11[var12];
         if (var13 != null && !rKv_1.MOTION_BLOCKING.id_throws().test(var13)) {
            this.id_private[var12] = null;
            var3.id_class(rKm_1.TOP_LAYER_MODIFICATION, rUO.id_switch.id_break(new rUz_1(var12, var13)));
         }
      }

      return new rYO()
         .id_class(var1.id_byte())
         .id_class(var1.id_this())
         .id_class(var1.id_private())
         .id_break(var1.id_finally())
         .id_byte(var1.id_extends())
         .id_protected(var1.id_implements())
         .id_class(var1.id_native())
         .id_class(var3.id_class())
         .id_class(var1.id_break())
         .id_class();
   }

   public rKQ(rVL<rYG> var1, rrSq_1 var2, List<rKN> var3, boolean var4, boolean var5, Optional<Supplier<rYG>> var6) {
      this(var2, var1);
      if (var4) {
         this.id_break();
      }

      if (var5) {
         this.id_class();
      }

      this.id_case.addAll(var3);
      this.id_private();
      if (!var6.isPresent()) {
         id_break.error("Unknown biome, defaulting to plains");
         this.id_catch = () -> var1.id_byte(rYl_1.id_break);
      } else {
         this.id_catch = (Supplier<rYG>)var6.get();
      }
   }

   public rKQ(rrSq_1 var1, rVL<rYG> var2) {
      this.id_protected = var2;
      this.id_throws = var1;
      this.id_catch = () -> var2.id_byte(rYl_1.id_break);
   }

   public void id_class() {
      this.id_finally = true;
   }

   public static rKQ id_class(rVL<rYG> var0) {
      rrSq_1 var1 = new rrSq_1(Optional.of(rrSq_1.id_byte), Maps.newHashMap(ImmutableMap.of(rrrZ.id_new, (rrSI)rrSq_1.id_break.get(rrrZ.id_new))));
      rKQ var2 = new rKQ(var1, var0);
      var2.id_catch = () -> var0.id_byte(rYl_1.id_break);
      var2.id_case().add(new rKN(1, xu_3.id_while));
      var2.id_case().add(new rKN(2, xu_3.id_finally));
      var2.id_case().add(new rKN(1, xu_3.id_implements));
      var2.id_private();
      return var2;
   }

   public rKQ id_class(List<rKN> var1, rrSq_1 var2) {
      rKQ var3 = new rKQ(var2, this.id_protected);

      for (rKN var5 : var1) {
         var3.id_case.add(new rKN(var5.id_class(), var5.id_break().id_break()));
         var3.id_private();
      }

      var3.id_class(this.id_catch);
      if (this.id_finally) {
         var3.id_class();
      }

      if (this.id_extends) {
         var3.id_break();
      }

      return var3;
   }

   public rKQ id_class(rrSq_1 var1) {
      return this.id_class(this.id_case, var1);
   }

   public void id_class(Supplier<rYG> var1) {
      this.id_catch = var1;
   }

   public void id_break() {
      this.id_extends = true;
   }

   public rYG id_throws() {
      return this.id_catch.get();
   }

   public xc_3[] id_catch() {
      return this.id_private;
   }

   public List<rKN> id_case() {
      return this.id_case;
   }

   public rrSq_1 id_protected() {
      return this.id_throws;
   }

   public void id_private() {
      Arrays.fill(this.id_private, 0, this.id_private.length, null);
      int var1 = 0;

      for (rKN var3 : this.id_case) {
         var3.id_class(var1);
         var1 += var3.id_class();
      }

      this.id_implements = true;

      for (rKN var7 : this.id_case) {
         for (int var4 = var7.id_byte(); var4 < var7.id_byte() + var7.id_class(); var4++) {
            xc_3 var5 = var7.id_break();
            if (!var5.id_class(xu_3.id_class)) {
               this.id_implements = false;
               this.id_private[var4] = var5;
            }
         }
      }
   }
}
