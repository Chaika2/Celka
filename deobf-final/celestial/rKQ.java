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
   private static final Logger break_ = LogManager.getLogger();
   public static final Codec<rKQ> class_ = RecordCodecBuilder.create(
         var0 -> var0.group(
                  rVn_1.class_(rVL.n).forGetter(var0x -> var0x.protected_),
                  rrSq_1.class_.fieldOf("structures").forGetter(rKQ::protected_),
                  rKN.class_.listOf().fieldOf("layers").forGetter(rKQ::case_),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter(var0x -> var0x.extends_),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter(var0x -> var0x.finally_),
                  rYG.protected_.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter(var0x -> Optional.of(var0x.catch_))
               )
               .apply(var0, rKQ::new)
      )
      .stable();
   private static final Map<rrrZ<?>, reP_2<?, ?>> byte_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(rrrZ.byte_, rrrF.break_);
      var0.put(rrrZ.new_, rrrF.this_);
      var0.put(rrrZ.extends_, rrrF.extends_);
      var0.put(rrrZ.finally_, rrrF.finally_);
      var0.put(rrrZ.case_, rrrF.case_);
      var0.put(rrrZ.throws_, rrrF.throws_);
      var0.put(rrrZ.catch_, rrrF.catch_);
      var0.put(rrrZ.volatile_, rrrF.volatile_);
      var0.put(rrrZ.implements_, rrrF.private_);
      var0.put(rrrZ.native_, rrrF.native_);
      var0.put(rrrZ.package_, rrrF.new_);
      var0.put(rrrZ.protected_, rrrF.protected_);
      var0.put(rrrZ.final_, rrrF.package_);
      var0.put(rrrZ.break_, rrrF.class_);
      var0.put(rrrZ.private_, rrrF.goto_);
      var0.put(rrrZ.super_, rrrF.super_);
   });
   private final rVL<rYG> protected_;
   private final rrSq_1 throws_;
   private final List<rKN> case_ = Lists.newArrayList();
   private Supplier<rYG> catch_;
   private final xc_3[] private_ = new xc_3[256];
   private boolean implements_;
   private boolean finally_ = false;
   private boolean extends_ = false;

   public rYG byte_() {
      rYG var1 = this.throws_();
      rYv_1 var2 = var1.throws_();
      rYF var3 = new rYF().class_(var2.protected_());
      if (this.extends_) {
         var3.class_(rKm_1.LAKES, rUx_1.strictfp_);
         var3.class_(rKm_1.LAKES, rUx_1.boolean_);
      }

      for (Entry var5 : this.throws_.class_().entrySet()) {
         var3.class_(var2.class_(byte_.get(var5.getKey())));
      }

      boolean var9 = (!this.implements_ || this.protected_.byte_(var1).equals(Optional.of(rYl_1.E))) && this.finally_;
      if (var9) {
         List var10 = var2.byte_();

         for (int var6 = 0; var6 < var10.size(); var6++) {
            if (var6 != rKm_1.UNDERGROUND_STRUCTURES.ordinal() && var6 != rKm_1.SURFACE_STRUCTURES.ordinal()) {
               for (Supplier var8 : (List)var10.get(var6)) {
                  var3.class_(var6, var8);
               }
            }
         }
      }

      xc_3[] var11 = this.catch_();

      for (int var12 = 0; var12 < var11.length; var12++) {
         xc_3 var13 = var11[var12];
         if (var13 != null && !rKv_1.MOTION_BLOCKING.throws_().test(var13)) {
            this.private_[var12] = null;
            var3.class_(rKm_1.TOP_LAYER_MODIFICATION, rUO.switch_.break_(new rUz_1(var12, var13)));
         }
      }

      return new rYO()
         .class_(var1.byte_())
         .class_(var1.this_())
         .class_(var1.private_())
         .break_(var1.finally_())
         .byte_(var1.extends_())
         .protected_(var1.implements_())
         .class_(var1.native_())
         .class_(var3.class_())
         .class_(var1.break_())
         .class_();
   }

   public rKQ(rVL<rYG> var1, rrSq_1 var2, List<rKN> var3, boolean var4, boolean var5, Optional<Supplier<rYG>> var6) {
      this(var2, var1);
      if (var4) {
         this.break_();
      }

      if (var5) {
         this.class_();
      }

      this.case_.addAll(var3);
      this.private_();
      if (!var6.isPresent()) {
         break_.error("Unknown biome, defaulting to plains");
         this.catch_ = () -> var1.byte_(rYl_1.break_);
      } else {
         this.catch_ = (Supplier<rYG>)var6.get();
      }
   }

   public rKQ(rrSq_1 var1, rVL<rYG> var2) {
      this.protected_ = var2;
      this.throws_ = var1;
      this.catch_ = () -> var2.byte_(rYl_1.break_);
   }

   public void class_() {
      this.finally_ = true;
   }

   public static rKQ class_(rVL<rYG> var0) {
      rrSq_1 var1 = new rrSq_1(Optional.of(rrSq_1.byte_), Maps.newHashMap(ImmutableMap.of(rrrZ.new_, (rrSI)rrSq_1.break_.get(rrrZ.new_))));
      rKQ var2 = new rKQ(var1, var0);
      var2.catch_ = () -> var0.byte_(rYl_1.break_);
      var2.case_().add(new rKN(1, xu_3.while_));
      var2.case_().add(new rKN(2, xu_3.finally_));
      var2.case_().add(new rKN(1, xu_3.implements_));
      var2.private_();
      return var2;
   }

   public rKQ class_(List<rKN> var1, rrSq_1 var2) {
      rKQ var3 = new rKQ(var2, this.protected_);

      for (rKN var5 : var1) {
         var3.case_.add(new rKN(var5.class_(), var5.break_().break_()));
         var3.private_();
      }

      var3.class_(this.catch_);
      if (this.finally_) {
         var3.class_();
      }

      if (this.extends_) {
         var3.break_();
      }

      return var3;
   }

   public rKQ class_(rrSq_1 var1) {
      return this.class_(this.case_, var1);
   }

   public void class_(Supplier<rYG> var1) {
      this.catch_ = var1;
   }

   public void break_() {
      this.extends_ = true;
   }

   public rYG throws_() {
      return this.catch_.get();
   }

   public xc_3[] catch_() {
      return this.private_;
   }

   public List<rKN> case_() {
      return this.case_;
   }

   public rrSq_1 protected_() {
      return this.throws_;
   }

   public void private_() {
      Arrays.fill(this.private_, 0, this.private_.length, null);
      int var1 = 0;

      for (rKN var3 : this.case_) {
         var3.class_(var1);
         var1 += var3.class_();
      }

      this.implements_ = true;

      for (rKN var7 : this.case_) {
         for (int var4 = var7.byte_(); var4 < var7.byte_() + var7.class_(); var4++) {
            xc_3 var5 = var7.break_();
            if (!var5.class_(xu_3.class_)) {
               this.implements_ = false;
               this.private_[var4] = var5;
            }
         }
      }
   }
}
