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
   public static final Codec<rrSp_1> class_ = RecordCodecBuilder.create(
         var0 -> var0.group(
                  Codec.LONG.fieldOf("seed").stable().forGetter(rrSp_1::class_),
                  Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(rrSp_1::break_),
                  Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(rrSp_1::byte_),
                  rVC.break_(rVL.import_, Lifecycle.stable(), rRX.class_)
                     .xmap(rRX::class_, Function.identity())
                     .fieldOf("dimensions")
                     .forGetter(rrSp_1::protected_),
                  Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter(var0x -> var0x.catch_)
               )
               .apply(var0, var0.stable(rrSp_1::new))
      )
      .comapFlatMap(rrSp_1::volatile_, Function.identity());
   private static final Logger break_ = LogManager.getLogger();
   private final long byte_;
   private final boolean protected_;
   private final boolean throws_;
   private final rVC<rRX> case_;
   private final Optional<String> catch_;

   public boolean byte_() {
      return this.throws_;
   }

   private rrSp_1(long var1, boolean var3, boolean var4, rVC<rRX> var5, Optional<String> var6) {
      this.byte_ = var1;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
   }

   public rrSp_1(long var1, boolean var3, boolean var4, rVC<rRX> var5) {
      this(var1, var3, var4, var5, Optional.empty());
      rRX var6 = var5.class_(rRX.break_);
      if (var6 == null) {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   public static rrSp_1 class_(rVm_1 var0, Properties var1) {
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

      rVF var18 = var0.break_(rVL.void_);
      rVF var11 = var0.break_(rVL.n);
      rVF var12 = var0.break_(rVL.u);
      rVC var13 = rRJ.class_(var18, var11, var12, var8);
      switch (var7) {
         case "flat":
            JsonObject var15 = !var2.isEmpty() ? rpY_2.class_(var2) : new JsonObject();
            Dynamic var16 = new Dynamic(JsonOps.INSTANCE, var15);
            return new rrSp_1(
               var8, var5, false, class_(var18, var13, new rKz_1(rKQ.class_.parse(var16).resultOrPartial(break_::error).orElseGet(() -> rKQ.class_(var11))))
            );
         case "debug_all_block_states":
            return new rrSp_1(var8, var5, false, class_(var18, var13, new rKk_1(var11)));
         case "amplified":
            return new rrSp_1(var8, var5, false, class_(var18, var13, new rKT(new rYi_1(var8, false, false, var11), var8, () -> var12.byte_(rKW.protected_))));
         case "largebiomes":
            return new rrSp_1(var8, var5, false, class_(var18, var13, new rKT(new rYi_1(var8, false, true, var11), var8, () -> var12.byte_(rKW.byte_))));
         default:
            return new rrSp_1(var8, var5, false, class_(var18, var13, class_(var11, var12, var8)));
      }
   }

   public rrSp_1 class_(boolean var1, OptionalLong var2) {
      long var3 = var2.orElse(this.byte_);
      rVC var5;
      if (var2.isPresent()) {
         var5 = new rVC<>(rVL.import_, Lifecycle.experimental());
         long var6 = var2.getAsLong();

         for (Entry var9 : this.case_.throws_()) {
            rqM_2 var10 = (rqM_2)var9.getKey();
            var5.class_(
               var10, new rRX(((rRX)var9.getValue()).class_(), ((rRX)var9.getValue()).byte_().class_(var6)), this.case_.protected_((rRX)var9.getValue())
            );
         }
      } else {
         var5 = this.case_;
      }

      rrSp_1 var11;
      if (this.catch_()) {
         var11 = new rrSp_1(var3, false, false, var5);
      } else {
         var11 = new rrSp_1(var3, this.break_(), this.byte_() && !var1, var5);
      }

      return var11;
   }

   public long class_() {
      return this.byte_;
   }

   public static rVC<rRX> class_(rVL<rRJ> var0, rVC<rRX> var1, rKd_1 var2) {
      rRX var3 = var1.class_(rRX.break_);
      Supplier var4 = () -> var3 == null ? var0.byte_(rRJ.case_) : var3.break_();
      return class_(var1, var4, var2);
   }

   public static rrSp_1 class_(rVm_1 var0) {
      rVF var1 = var0.break_(rVL.n);
      int var2 = "North Carolina".hashCode();
      rVF var3 = var0.break_(rVL.void_);
      rVF var4 = var0.break_(rVL.u);
      return new rrSp_1((long)var2, true, true, class_(var3, rRJ.class_(var3, var1, var4, (long)var2), class_(var1, var4, (long)var2)));
   }

   public static rrSp_1 class_(rVL<rRJ> var0, rVL<rYG> var1, rVL<rKW> var2) {
      long var3 = new Random().nextLong();
      return new rrSp_1(var3, true, false, class_(var0, rRJ.class_(var0, var1, var2, var3), class_(var1, var2, var3)));
   }

   public static rKT class_(rVL<rYG> var0, rVL<rKW> var1, long var2) {
      return new rKT(new rYi_1(var2, false, false, var0), var2, () -> var1.byte_(rKW.byte_));
   }

   public static rVC<rRX> class_(rVC<rRX> var0, Supplier<rRJ> var1, rKd_1 var2) {
      rVC var3 = new rVC<>(rVL.import_, Lifecycle.experimental());
      var3.class_(rRX.break_, new rRX(var1, var2), Lifecycle.stable());

      for (Entry var5 : var0.throws_()) {
         rqM_2 var6 = (rqM_2)var5.getKey();
         if (var6 != rRX.break_) {
            var3.class_(var6, (rRX)var5.getValue(), var0.protected_((rRX)var5.getValue()));
         }
      }

      return var3;
   }

   public boolean break_() {
      return this.protected_;
   }

   public rKd_1 throws_() {
      rRX var1 = this.case_.class_(rRX.break_);
      if (var1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return var1.byte_();
      }
   }

   public rrSp_1 finally_() {
      return new rrSp_1(this.byte_, this.protected_, true, this.case_, this.catch_);
   }

   public boolean catch_() {
      return this.throws_() instanceof rKk_1;
   }

   public rrSp_1 extends_() {
      return new rrSp_1(this.byte_, !this.protected_, this.throws_, this.case_);
   }

   public ImmutableSet<rqM_2<rYB>> case_() {
      return this.protected_().throws_().stream().map(var0 -> rqM_2.class_(rVL.static_, var0.getKey().class_())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean implements_() {
      return this.catch_.isPresent();
   }

   public rVC<rRX> protected_() {
      return this.case_;
   }

   public boolean private_() {
      return this.throws_() instanceof rKz_1;
   }

   private boolean final_() {
      return rRX.class_(this.byte_, this.case_);
   }

   private DataResult<rrSp_1> volatile_() {
      rRX var1 = this.case_.class_(rRX.break_);
      if (var1 == null) {
         return DataResult.error("Overworld settings missing");
      } else {
         return this.final_() ? DataResult.success(this, Lifecycle.stable()) : DataResult.success(this);
      }
   }

   public rrSp_1 native_() {
      return new rrSp_1(this.byte_, this.protected_, !this.throws_, this.case_);
   }
}
