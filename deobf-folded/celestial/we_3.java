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
   private static final Logger id_case = LogManager.getLogger();
   private static final Ih_1 id_catch = new Ih_1();
   static final Gson id_class = new GsonBuilder()
      .registerTypeAdapter(we_3.class, new wa_3())
      .registerTypeAdapter(IS.class, new IE())
      .registerTypeAdapter(IG.class, new Ib_1())
      .registerTypeAdapter(wD_2.class, new wU_2())
      .registerTypeAdapter(IL.class, new IA())
      .registerTypeAdapter(Ik_1.class, new Iz_1())
      .registerTypeAdapter(IZ.class, new Iv_1())
      .create();
   private final List<IS> id_private;
   private final wi_3 id_implements;
   private final boolean id_finally;
   private final Ik_1 id_extends;
   private final List<IZ> id_native;
   public String id_break = "";
   protected final Map<String, Either<Ig_1, String>> id_byte;
   protected we_3 id_protected;
   protected rqO_2 id_throws;

   public wi_3 id_byte() {
      if (this.id_implements != null) {
         return this.id_implements;
      } else {
         return this.id_protected != null ? this.id_protected.id_byte() : wi_3.SIDE;
      }
   }

   public Ig_1 id_byte(String var1) {
      if (id_throws(var1)) {
         var1 = var1.substring(1);
      }

      ArrayList var2 = Lists.newArrayList();

      while (true) {
         Either var3 = this.id_protected(var1);
         Optional var4 = var3.left();
         if (var4.isPresent()) {
            return (Ig_1)var4.get();
         }

         var1 = (String)var3.right().get();
         if (var2.contains(var1)) {
            id_case.warn("Unable to resolve texture due to reference chain {}->{} in {}", Joiner.on("->").join(var2), var1, this.id_break);
            return new Ig_1(fJ_2.id_class, fQ_2.id_class());
         }

         var2.add(var1);
      }
   }

   public we_3(rqO_2 var1, List<IS> var2, Map<String, Either<Ig_1, String>> var3, boolean var4, wi_3 var5, Ik_1 var6, List<IZ> var7) {
      this.id_private = var2;
      this.id_finally = var4;
      this.id_implements = var5;
      this.id_byte = var3;
      this.id_throws = var1;
      this.id_extends = var6;
      this.id_native = var7;
   }

   @Override
   public String toString() {
      return this.id_break;
   }

   public static we_3 id_class(Reader var0) {
      return rpY_2.id_class(id_class, var0, we_3.class);
   }

   public IJ id_class(IC var1, we_3 var2, Function<Ig_1, fj_3> var3, Ix_1 var4, rqO_2 var5, boolean var6) {
      fj_3 var7 = (fj_3)var3.apply(this.id_byte("particle"));
      if (this.id_case() == IC.id_package) {
         return new IO(this.id_catch(), this.id_class(var1, var2), var7, this.id_byte().id_class());
      } else {
         IY var8 = new IY(this, this.id_class(var1, var2), var6).id_class(var7);

         for (IS var10 : this.id_class()) {
            for (rpr_3 var12 : var10.id_byte.keySet()) {
               IG var13 = var10.id_byte.get(var12);
               fj_3 var14 = (fj_3)var3.apply(this.id_byte(var13.id_byte));
               if (var13.id_class == null) {
                  var8.id_class(id_class(var10, var13, var14, var12, var4, var5));
               } else {
                  var8.id_class(rpr_3.id_class(var4.id_class().id_byte(), var13.id_class), id_class(var10, var13, var14, var12, var4, var5));
               }
            }
         }

         return var8.id_class();
      }
   }

   private static wK_2 id_class(IS var0, IG var1, fj_3 var2, rpr_3 var3, Ix_1 var4, rqO_2 var5) {
      return id_catch.id_class(var0.id_class, var0.id_break, var1, var2, var3, var4, var0.id_protected, var0.id_throws, var5);
   }

   private IL id_class(IQ var1) {
      return this.id_protected != null && !this.id_extends.id_break(var1) ? this.id_protected.id_class(var1) : this.id_extends.id_class(var1);
   }

   public List<IS> id_class() {
      return this.id_private.isEmpty() && this.id_protected != null ? this.id_protected.id_class() : this.id_private;
   }

   private IF id_class(IC var1, we_3 var2) {
      return this.id_native.isEmpty() ? IF.id_class : new IF(var1, var2, var1::id_class, this.id_native);
   }

   public static we_3 id_class(String var0) {
      return id_class(new StringReader(var0));
   }

   @Override
   public Collection<Ig_1> id_class(Function<rqO_2, Id_1> var1, Set<Pair<String, String>> var2) {
      LinkedHashSet var3 = Sets.newLinkedHashSet();

      for (we_3 var4 = this; var4.id_throws != null && var4.id_protected == null; var4 = var4.id_protected) {
         var3.add(var4);
         Id_1 var5 = (Id_1)var1.apply(var4.id_throws);
         if (var5 == null) {
            id_case.warn("No parent '{}' while loading model '{}'", this.id_throws, var4);
         }

         if (var3.contains(var5)) {
            id_case.warn(
               "Found 'parent' loop while loading model '{}' in chain: {} -> {}",
               var4,
               var3.stream().map(Object::toString).collect(Collectors.joining(" -> ")),
               this.id_throws
            );
            var5 = null;
         }

         if (var5 == null) {
            var4.id_throws = IC.id_native;
            var5 = (Id_1)var1.apply(var4.id_throws);
         }

         if (!(var5 instanceof we_3)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         var4.id_protected = (we_3)var5;
      }

      HashSet var10 = Sets.newHashSet(new Ig_1[]{this.id_byte("particle")});

      for (IS var6 : this.id_class()) {
         for (IG var8 : var6.id_byte.values()) {
            Ig_1 var9 = this.id_byte(var8.id_byte);
            if (Objects.equals(var9.id_break(), fQ_2.id_class())) {
               var2.add(Pair.of(var8.id_byte, this.id_break));
            }

            var10.add(var9);
         }
      }

      this.id_native.forEach(var4x -> {
         Id_1 var5x = (Id_1)var1.apply(var4x.id_class());
         if (!Objects.equals(var5x, this)) {
            var10.addAll(var5x.id_class(var1, var2));
         }
      });
      if (this.id_case() == IC.id_final) {
         IN.id_class.forEach(var2x -> var10.add(this.id_byte(var2x)));
      }

      return var10;
   }

   @Override
   public IJ id_class(IC var1, Function<Ig_1, fj_3> var2, Ix_1 var3, rqO_2 var4) {
      return this.id_class(var1, this, var2, var3, var4, true);
   }

   public boolean id_break(String var1) {
      return !fQ_2.id_class().equals(this.id_byte(var1).id_break());
   }

   public boolean id_break() {
      return this.id_protected != null ? this.id_protected.id_break() : this.id_finally;
   }

   @Override
   public Collection<rqO_2> id_throws() {
      HashSet var1 = Sets.newHashSet();

      for (IZ var3 : this.id_native) {
         var1.add(var3.id_class());
      }

      if (this.id_throws != null) {
         var1.add(this.id_throws);
      }

      return var1;
   }

   static boolean id_throws(String var0) {
      return var0.charAt(0) == '#';
   }

   public Ik_1 id_catch() {
      IL var1 = this.id_class(IQ.THIRD_PERSON_LEFT_HAND);
      IL var2 = this.id_class(IQ.THIRD_PERSON_RIGHT_HAND);
      IL var3 = this.id_class(IQ.FIRST_PERSON_LEFT_HAND);
      IL var4 = this.id_class(IQ.FIRST_PERSON_RIGHT_HAND);
      IL var5 = this.id_class(IQ.HEAD);
      IL var6 = this.id_class(IQ.GUI);
      IL var7 = this.id_class(IQ.GROUND);
      IL var8 = this.id_class(IQ.FIXED);
      return new Ik_1(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public we_3 id_case() {
      return this.id_protected == null ? this : this.id_protected.id_case();
   }

   private Either<Ig_1, String> id_protected(String var1) {
      for (we_3 var2 = this; var2 != null; var2 = var2.id_protected) {
         Either var3 = var2.id_byte.get(var1);
         if (var3 != null) {
            return var3;
         }
      }

      return Either.left(new Ig_1(fJ_2.id_class, fQ_2.id_class()));
   }

   public List<IZ> id_protected() {
      return this.id_native;
   }
}
