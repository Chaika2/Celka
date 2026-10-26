package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Properties;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrSp_1 {
   public static final Codec<rrSp_1> id_class = RecordCodecBuilder.create(
         var0 -> var0.group(
                  Codec.LONG.fieldOf("seed").stable().forGetter(rrSp_1::id_class),
                  Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(rrSp_1::id_break),
                  Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(rrSp_1::id_byte),
                  rVC.id_break(rVL.id_import, Lifecycle.stable(), rRX.id_class)
                     .xmap(rRX::id_class, Function.identity())
                     .fieldOf("dimensions")
                     .forGetter(rrSp_1::id_protected),
                  Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter(var0x -> var0x.id_catch)
               )
               .apply(var0, var0.stable(rrSp_1::new))
      )
      .comapFlatMap(rrSp_1::id_volatile, Function.identity());
   private static final Logger id_break = LogManager.getLogger();
   private final long id_byte;
   private final boolean id_protected;
   private final boolean id_throws;
   private final rVC<rRX> id_case;
   private final Optional<String> id_catch;

   public boolean id_byte() {
      return this.id_throws;
   }

   private rrSp_1(long var1, boolean var3, boolean var4, rVC<rRX> var5, Optional<String> var6) {
      this.id_byte = var1;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
   }

   public rrSp_1(long var1, boolean var3, boolean var4, rVC<rRX> var5) {
      this(var1, var3, var4, var5, Optional.empty());
      rRX var6 = var5.id_class(rRX.id_break);
      if (var6 == null) {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   public static rrSp_1 id_class(rVm_1 var0, Properties var1) {
      String var2 = (String)MoreObjects.firstNonNull((String)var1.get("generator-settings"), "");
      var1.put("generator-settings", var2);
      String var3 = (String)MoreObjects.firstNonNull((String)var1.get("level-seed"), "");
      var1.put("level-seed", var3);
      String var4 = (String)var1.get("generate-structures");
      boolean var5 = var4 == null || Boolean.parseBoolean(var4);
      var1.put("generate-structures", Objects.toString(var5));
      String var6 = (String)var1.get("level-type");
      String var7 = Optional.ofNullable(var6).map(var0x -> var0x.toLowerCase(Locale.ROOT)).orElse("default");
      var1.put("level-type", var7);
      long var8 = new Random().nextLong();
      if (!var3.isEmpty()) {
         try {
            long var10 = Long.parseLong(var3);
            if (var10 != 0L) {
               var8 = var10;
            }
         } catch (NumberFormatException var17) {
            var8 = (long)var3.hashCode();
         }
      }

      rVF var18 = var0.id_break(rVL.id_void);
      rVF var11 = var0.id_break(rVL.n);
      rVF var12 = var0.id_break(rVL.u);
      rVC var13 = rRJ.id_class(var18, var11, var12, var8);
      switch (var7) {
         case "flat":
            JsonObject var15 = !var2.isEmpty() ? rpY_2.id_class(var2) : new JsonObject();
            Dynamic var16 = new Dynamic(JsonOps.INSTANCE, var15);
            return new rrSp_1(
               var8,
               var5,
               false,
               id_class(var18, var13, new rKz_1(rKQ.id_class.parse(var16).resultOrPartial(id_break::error).orElseGet(() -> rKQ.id_class(var11))))
            );
         case "debug_all_block_states":
            return new rrSp_1(var8, var5, false, id_class(var18, var13, new rKk_1(var11)));
         case "amplified":
            return new rrSp_1(
               var8, var5, false, id_class(var18, var13, new rKT(new rYi_1(var8, false, false, var11), var8, () -> var12.id_byte(rKW.id_protected)))
            );
         case "largebiomes":
            return new rrSp_1(var8, var5, false, id_class(var18, var13, new rKT(new rYi_1(var8, false, true, var11), var8, () -> var12.id_byte(rKW.id_byte))));
         default:
            return new rrSp_1(var8, var5, false, id_class(var18, var13, id_class(var11, var12, var8)));
      }
   }

   public rrSp_1 id_class(boolean var1, OptionalLong var2) {
      long var3 = var2.orElse(this.id_byte);
      rVC var5;
      if (var2.isPresent()) {
         var5 = new rVC<>(rVL.id_import, Lifecycle.experimental());
         long var6 = var2.getAsLong();

         for (Entry var9 : this.id_case.id_throws()) {
            rqM_2 var10 = (rqM_2)var9.getKey();
            var5.id_class(
               var10,
               new rRX(((rRX)var9.getValue()).id_class(), ((rRX)var9.getValue()).id_byte().id_class(var6)),
               this.id_case.id_protected((rRX)var9.getValue())
            );
         }
      } else {
         var5 = this.id_case;
      }

      rrSp_1 var11;
      if (this.id_catch()) {
         var11 = new rrSp_1(var3, false, false, var5);
      } else {
         var11 = new rrSp_1(var3, this.id_break(), this.id_byte() && !var1, var5);
      }

      return var11;
   }

   public long id_class() {
      return this.id_byte;
   }

   public static rVC<rRX> id_class(rVL<rRJ> var0, rVC<rRX> var1, rKd_1 var2) {
      rRX var3 = var1.id_class(rRX.id_break);
      Supplier var4 = () -> var3 == null ? var0.id_byte(rRJ.id_case) : var3.id_break();
      return id_class(var1, var4, var2);
   }

   public static rrSp_1 id_class(rVm_1 var0) {
      rVF var1 = var0.id_break(rVL.n);
      int var2 = "North Carolina".hashCode();
      rVF var3 = var0.id_break(rVL.id_void);
      rVF var4 = var0.id_break(rVL.u);
      return new rrSp_1((long)var2, true, true, id_class(var3, rRJ.id_class(var3, var1, var4, (long)var2), id_class(var1, var4, (long)var2)));
   }

   public static rrSp_1 id_class(rVL<rRJ> var0, rVL<rYG> var1, rVL<rKW> var2) {
      long var3 = new Random().nextLong();
      return new rrSp_1(var3, true, false, id_class(var0, rRJ.id_class(var0, var1, var2, var3), id_class(var1, var2, var3)));
   }

   public static rKT id_class(rVL<rYG> var0, rVL<rKW> var1, long var2) {
      return new rKT(new rYi_1(var2, false, false, var0), var2, () -> var1.id_byte(rKW.id_byte));
   }

   public static rVC<rRX> id_class(rVC<rRX> var0, Supplier<rRJ> var1, rKd_1 var2) {
      rVC var3 = new rVC<>(rVL.id_import, Lifecycle.experimental());
      var3.id_class(rRX.id_break, new rRX(var1, var2), Lifecycle.stable());

      for (Entry var5 : var0.id_throws()) {
         rqM_2 var6 = (rqM_2)var5.getKey();
         if (var6 != rRX.id_break) {
            var3.id_class(var6, (rRX)var5.getValue(), var0.id_protected((rRX)var5.getValue()));
         }
      }

      return var3;
   }

   public boolean id_break() {
      return this.id_protected;
   }

   public rKd_1 id_throws() {
      rRX var1 = this.id_case.id_class(rRX.id_break);
      if (var1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return var1.id_byte();
      }
   }

   public rrSp_1 id_finally() {
      return new rrSp_1(this.id_byte, this.id_protected, true, this.id_case, this.id_catch);
   }

   public boolean id_catch() {
      return this.id_throws() instanceof rKk_1;
   }

   public rrSp_1 id_extends() {
      return new rrSp_1(this.id_byte, !this.id_protected, this.id_throws, this.id_case);
   }

   public ImmutableSet<rqM_2<rYB>> id_case() {
      return this.id_protected()
         .id_throws()
         .stream()
         .map(var0 -> rqM_2.id_class(rVL.id_static, var0.getKey().id_class()))
         .collect(ImmutableSet.toImmutableSet());
   }

   public boolean id_implements() {
      return this.id_catch.isPresent();
   }

   public rVC<rRX> id_protected() {
      return this.id_case;
   }

   public boolean id_private() {
      return this.id_throws() instanceof rKz_1;
   }

   private boolean id_final() {
      return rRX.id_class(this.id_byte, this.id_case);
   }

   private DataResult<rrSp_1> id_volatile() {
      rRX var1 = this.id_case.id_class(rRX.id_break);
      if (var1 == null) {
         return DataResult.error("Overworld settings missing");
      } else {
         return this.id_final() ? DataResult.success(this, Lifecycle.stable()) : DataResult.success(this);
      }
   }

   public rrSp_1 id_native() {
      return new rrSp_1(this.id_byte, this.id_protected, !this.id_throws, this.id_case);
   }
}
