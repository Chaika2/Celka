package celestial;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class we_3 implements Id_1 {
   private static final Logger case_ = LogManager.getLogger();
   private static final Ih_1 catch_ = new Ih_1();
   static final Gson class_ = new GsonBuilder()
      .registerTypeAdapter(we_3.class, new wa_3())
      .registerTypeAdapter(IS.class, new IE())
      .registerTypeAdapter(IG.class, new Ib_1())
      .registerTypeAdapter(wD_2.class, new wU_2())
      .registerTypeAdapter(IL.class, new IA())
      .registerTypeAdapter(Ik_1.class, new Iz_1())
      .registerTypeAdapter(IZ.class, new Iv_1())
      .create();
   private final List<IS> private_;
   private final wi_3 implements_;
   private final boolean finally_;
   private final Ik_1 extends_;
   private final List<IZ> native_;
   public String break_ = "";
   protected final Map<String, Either<Ig_1, String>> byte_;
   protected we_3 protected_;
   protected rqO_2 throws_;

   public wi_3 byte_() {
      if (this.implements_ != null) {
         return this.implements_;
      } else {
         return this.protected_ != null ? this.protected_.byte_() : wi_3.SIDE;
      }
   }

   public Ig_1 byte_(String var1) {
      if (throws_(var1)) {
         var1 = var1.substring(1);
      }

      ArrayList var2 = Lists.newArrayList();

      while (true) {
         Either var3 = this.protected_(var1);
         Optional var4 = var3.left();
         if (var4.isPresent()) {
            return (Ig_1)var4.get();
         }

         var1 = (String)var3.right().get();
         if (var2.contains(var1)) {
            case_.warn("Unable to resolve texture due to reference chain {}->{} in {}", Joiner.on("->").join(var2), var1, this.break_);
            return new Ig_1(fJ_2.class_, fQ_2.class_());
         }

         var2.add(var1);
      }
   }

   public we_3(rqO_2 var1, List<IS> var2, Map<String, Either<Ig_1, String>> var3, boolean var4, wi_3 var5, Ik_1 var6, List<IZ> var7) {
      this.private_ = var2;
      this.finally_ = var4;
      this.implements_ = var5;
      this.byte_ = var3;
      this.throws_ = var1;
      this.extends_ = var6;
      this.native_ = var7;
   }

   @Override
   public String toString() {
      return this.break_;
   }

   public static we_3 class_(Reader var0) {
      return rpY_2.class_(class_, var0, we_3.class);
   }

   public IJ class_(IC var1, we_3 var2, Function<Ig_1, fj_3> var3, Ix_1 var4, rqO_2 var5, boolean var6) {
      fj_3 var7 = (fj_3)var3.apply(this.byte_("particle"));
      if (this.case_() == IC.package_) {
         return new IO(this.catch_(), this.class_(var1, var2), var7, this.byte_().class_());
      } else {
         IY var8 = new IY(this, this.class_(var1, var2), var6).class_(var7);

         for (IS var10 : this.class_()) {
            for (rpr_3 var12 : var10.byte_.keySet()) {
               IG var13 = var10.byte_.get(var12);
               fj_3 var14 = (fj_3)var3.apply(this.byte_(var13.byte_));
               if (var13.class_ == null) {
                  var8.class_(class_(var10, var13, var14, var12, var4, var5));
               } else {
                  var8.class_(rpr_3.class_(var4.class_().byte_(), var13.class_), class_(var10, var13, var14, var12, var4, var5));
               }
            }
         }

         return var8.class_();
      }
   }

   private static wK_2 class_(IS var0, IG var1, fj_3 var2, rpr_3 var3, Ix_1 var4, rqO_2 var5) {
      return catch_.class_(var0.class_, var0.break_, var1, var2, var3, var4, var0.protected_, var0.throws_, var5);
   }

   private IL class_(IQ var1) {
      return this.protected_ != null && !this.extends_.break_(var1) ? this.protected_.class_(var1) : this.extends_.class_(var1);
   }

   public List<IS> class_() {
      return this.private_.isEmpty() && this.protected_ != null ? this.protected_.class_() : this.private_;
   }

   private IF class_(IC var1, we_3 var2) {
      return this.native_.isEmpty() ? IF.class_ : new IF(var1, var2, var1::class_, this.native_);
   }

   public static we_3 class_(String var0) {
      return class_(new StringReader(var0));
   }

   @Override
   public Collection<Ig_1> class_(Function<rqO_2, Id_1> var1, Set<Pair<String, String>> var2) {
      LinkedHashSet var3 = Sets.newLinkedHashSet();

      for (we_3 var4 = this; var4.throws_ != null && var4.protected_ == null; var4 = var4.protected_) {
         var3.add(var4);
         Id_1 var5 = (Id_1)var1.apply(var4.throws_);
         if (var5 == null) {
            case_.warn("No parent '{}' while loading model '{}'", this.throws_, var4);
         }

         if (var3.contains(var5)) {
            case_.warn(
               "Found 'parent' loop while loading model '{}' in chain: {} -> {}",
               var4,
               var3.stream().map(Object::toString).collect(Collectors.joining(" -> ")),
               this.throws_
            );
            var5 = null;
         }

         if (var5 == null) {
            var4.throws_ = IC.native_;
            var5 = (Id_1)var1.apply(var4.throws_);
         }

         if (!(var5 instanceof we_3)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         var4.protected_ = (we_3)var5;
      }

      HashSet var10 = Sets.newHashSet(new Ig_1[]{this.byte_("particle")});

      for (IS var6 : this.class_()) {
         for (IG var8 : var6.byte_.values()) {
            Ig_1 var9 = this.byte_(var8.byte_);
            if (Objects.equals(var9.break_(), fQ_2.class_())) {
               var2.add(Pair.of(var8.byte_, this.break_));
            }

            var10.add(var9);
         }
      }

      this.native_.forEach(var4x -> {
         Id_1 var5x = (Id_1)var1.apply(var4x.class_());
         if (!Objects.equals(var5x, this)) {
            var10.addAll(var5x.class_(var1, var2));
         }
      });
      if (this.case_() == IC.final_) {
         IN.class_.forEach(var2x -> var10.add(this.byte_(var2x)));
      }

      return var10;
   }

   @Override
   public IJ class_(IC var1, Function<Ig_1, fj_3> var2, Ix_1 var3, rqO_2 var4) {
      return this.class_(var1, this, var2, var3, var4, true);
   }

   public boolean break_(String var1) {
      return !fQ_2.class_().equals(this.byte_(var1).break_());
   }

   public boolean break_() {
      return this.protected_ != null ? this.protected_.break_() : this.finally_;
   }

   @Override
   public Collection<rqO_2> throws_() {
      HashSet var1 = Sets.newHashSet();

      for (IZ var3 : this.native_) {
         var1.add(var3.class_());
      }

      if (this.throws_ != null) {
         var1.add(this.throws_);
      }

      return var1;
   }

   static boolean throws_(String var0) {
      return var0.charAt(0) == '#';
   }

   public Ik_1 catch_() {
      IL var1 = this.class_(IQ.THIRD_PERSON_LEFT_HAND);
      IL var2 = this.class_(IQ.THIRD_PERSON_RIGHT_HAND);
      IL var3 = this.class_(IQ.FIRST_PERSON_LEFT_HAND);
      IL var4 = this.class_(IQ.FIRST_PERSON_RIGHT_HAND);
      IL var5 = this.class_(IQ.HEAD);
      IL var6 = this.class_(IQ.GUI);
      IL var7 = this.class_(IQ.GROUND);
      IL var8 = this.class_(IQ.FIXED);
      return new Ik_1(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public we_3 case_() {
      return this.protected_ == null ? this : this.protected_.case_();
   }

   private Either<Ig_1, String> protected_(String var1) {
      for (we_3 var2 = this; var2 != null; var2 = var2.protected_) {
         Either var3 = var2.byte_.get(var1);
         if (var3 != null) {
            return var3;
         }
      }

      return Either.left(new Ig_1(fJ_2.class_, fQ_2.class_()));
   }

   public List<IZ> protected_() {
      return this.native_;
   }
}
