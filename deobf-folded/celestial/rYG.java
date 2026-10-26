package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rYG {
   public static final Logger id_class = LogManager.getLogger();
   public static final Codec<rYG> id_break = RecordCodecBuilder.create(
      var0 -> var0.group(
               rYX.id_class.forGetter(var0x -> var0x.id_finally),
               rYh_1.CODEC.fieldOf("category").forGetter(var0x -> var0x.id_package),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.id_volatile),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.id_final),
               rYW.id_class.fieldOf("effects").forGetter(var0x -> var0x.id_int),
               rYv_1.id_byte.forGetter(var0x -> var0x.id_extends),
               rYt_1.id_byte.forGetter(var0x -> var0x.id_native)
            )
            .apply(var0, rYG::new)
   );
   public static final Codec<rYG> id_byte = RecordCodecBuilder.create(
      var0 -> var0.group(
               rYX.id_class.forGetter(var0x -> var0x.id_finally),
               rYh_1.CODEC.fieldOf("category").forGetter(var0x -> var0x.id_package),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.id_volatile),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.id_final),
               rYW.id_class.fieldOf("effects").forGetter(var0x -> var0x.id_int)
            )
            .apply(var0, (var0x, var1, var2, var3, var4) -> new rYG(var0x, var1, var2, var3, var4, rYv_1.id_break, rYt_1.id_break))
   );
   public static final Codec<Supplier<rYG>> id_protected = rVA.id_class(rVL.n, id_break);
   public static final Codec<List<Supplier<rYG>>> id_throws = rVA.id_break(rVL.n, id_break);
   private final Map<Integer, List<rrrZ<?>>> id_catch = rVL.t.id_case().collect(Collectors.groupingBy(var0 -> var0.id_protected().ordinal()));
   private static final rKw_1 id_private = new rKw_1(new rqm_3(1234L), ImmutableList.of(0));
   static final rKw_1 id_implements = new rKw_1(new rqm_3(3456L), ImmutableList.of(-2, -1, 0));
   public static final rKw_1 id_case = new rKw_1(new rqm_3(2345L), ImmutableList.of(0));
   private final rYX id_finally;
   private final rYv_1 id_extends;
   private final rYt_1 id_native;
   private final float id_volatile;
   private final float id_final;
   private final rYh_1 id_package;
   private final rYW id_int;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> id_new = ThreadLocal.withInitial(
      () -> rqR_2.id_class((Supplier<? extends Long2FloatLinkedOpenHashMap>)(() -> {
            rYb_1 var1x = new rYb_1(this, 1024, 0.25F);
            var1x.defaultReturnValue(Float.NaN);
            return var1x;
         }))
   );

   public rYJ id_byte() {
      return this.id_finally.id_break;
   }

   public Optional<rqA_2> id_int() {
      return this.id_int.id_implements();
   }

   rYG(rYX var1, rYh_1 var2, float var3, float var4, rYW var5, rYv_1 var6, rYt_1 var7) {
      this.id_finally = var1;
      this.id_extends = var6;
      this.id_native = var7;
      this.id_package = var2;
      this.id_volatile = var3;
      this.id_final = var4;
      this.id_int = var5;
   }

   @Override
   public String toString() {
      rqO_2 var1 = rVy_1.id_implements.id_break(this);
      return var1 == null ? super.toString() : var1.toString();
   }

   public final rYh_1 id_this() {
      return this.id_package;
   }

   public int id_class(double var1, double var3) {
      int var5 = this.id_int.id_case().orElseGet(this::id_else);
      return this.id_int.id_catch().id_class(var1, var3, var5);
   }

   public void id_class(Random var1, roC_2 var2, int var3, int var4, int var5, double var6, xc_3 var8, xc_3 var9, int var10, long var11) {
      rrSR var13 = this.id_extends.id_protected().get();
      var13.id_class(var11);
      var13.id_class(var1, var2, this, var3, var4, var5, var6, var8, var9, var10, var11);
   }

   public int id_class() {
      return this.id_int.id_protected();
   }

   public boolean id_class(rRR var1, rfH_2 var2, boolean var3) {
      if (this.id_class(var2) >= 0.15F) {
         return false;
      } else {
         if (var2.c_() >= 0 && var2.c_() < 256 && var1.id_class(rRo_1.BLOCK, var2) < 10) {
            xc_3 var4 = var1.id_byte(var2);
            rXE var5 = var1.id_break(var2);
            if (var5.id_class() == rXG.id_byte && var4.id_break() instanceof dj_3) {
               if (!var3) {
                  return true;
               }

               boolean var6 = var1.id_final(var2.id_byte())
                  && var1.id_final(var2.id_extends())
                  && var1.id_final(var2.id_private())
                  && var1.id_final(var2.id_protected());
               if (!var6) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean id_class(rRR var1, rfH_2 var2) {
      return this.id_class(var1, var2, true);
   }

   public final float id_class(rfH_2 var1) {
      long var2 = var1.id_package();
      Long2FloatLinkedOpenHashMap var4 = this.id_new.get();
      float var5 = var4.get(var2);
      if (!Float.isNaN(var5)) {
         return var5;
      } else {
         float var6 = this.id_break(var1);
         if (var4.size() == 1024) {
            var4.removeFirstFloat();
         }

         var4.put(var2, var6);
         return var6;
      }
   }

   public void id_class(rrrA var1, rKd_1 var2, rKf_1 var3, long var4, rqm_3 var6, rfH_2 var7) {
      List var8 = this.id_extends.id_byte();
      int var9 = rKm_1.values().length;

      for (int var10 = 0; var10 < var9; var10++) {
         int var11 = 0;
         if (var1.id_class()) {
            for (rrrZ var13 : this.id_catch.getOrDefault(var10, Collections.emptyList())) {
               var6.id_break(var4, var11, var10);
               int var14 = var7.b_() >> 4;
               int var15 = var7.d_() >> 4;
               int var16 = var14 << 4;
               int var17 = var15 << 4;

               try {
                  var1.id_class(rjh_3.id_class(var7), var13)
                     .forEach(var8x -> var8x.id_class(var3, var1, var2, var6, new rfi_3(var16, var17, var16 + 15, var17 + 15), new rfj_3(var14, var15)));
               } catch (Exception var20) {
                  KY var19 = KY.id_class(var20, "Feature placement");
                  var19.id_class("Feature").id_class("Id", rVL.t.id_break(var13)).id_class("Description", () -> var13.toString());
                  throw new KU(var19);
               }

               var11++;
            }
         }

         if (var8.size() > var10) {
            for (Supplier var23 : (List)var8.get(var10)) {
               rDg_1 var24 = (rDg_1)var23.get();
               var6.id_break(var4, var11, var10);

               try {
                  var24.id_class(var3, var2, var6, var7);
               } catch (Exception var21) {
                  KY var25 = KY.id_class(var21, "Feature placement");
                  var25.id_class("Feature")
                     .id_class("Id", rVL.q.id_break(var24.id_throws))
                     .id_class("Config", var24.id_case)
                     .id_class("Description", () -> var24.id_throws.toString());
                  throw new KU(var25);
               }

               var11++;
            }
         }
      }
   }

   public rYt_1 id_break() {
      return this.id_native;
   }

   public boolean id_break(rRR var1, rfH_2 var2) {
      if (this.id_class(var2) >= 0.15F) {
         return false;
      } else {
         if (var2.c_() >= 0 && var2.c_() < 256 && var1.id_class(rRo_1.BLOCK, var2) < 10) {
            xc_3 var3 = var1.id_byte(var2);
            if (var3.id_catch() && xu_3.Pq.id_continue().id_class(var1, var2)) {
               return true;
            }
         }

         return false;
      }
   }

   private float id_break(rfH_2 var1) {
      float var2 = this.id_finally.id_protected.id_class(var1, this.id_extends());
      if (var1.c_() > 64) {
         float var3 = (float)(id_private.id_class((double)((float)var1.b_() / 8.0F), (double)((float)var1.d_() / 8.0F), false) * 4.0);
         return var2 - (var3 + (float)var1.c_() - 64.0F) * 0.05F / 30.0F;
      } else {
         return var2;
      }
   }

   public rYv_1 id_throws() {
      return this.id_extends;
   }

   public final float id_finally() {
      return this.id_final;
   }

   public int id_catch() {
      return this.id_int.id_throws().orElseGet(this::id_synchronized);
   }

   public final float id_extends() {
      return this.id_finally.id_byte;
   }

   public int id_case() {
      return this.id_int.id_class();
   }

   public Optional<rYg_1> id_continue() {
      return this.id_int.id_extends();
   }

   private int id_else() {
      double var1 = (double)rfU_2.id_class(this.id_finally.id_byte, 0.0F, 1.0F);
      double var3 = (double)rfU_2.id_class(this.id_finally.id_throws, 0.0F, 1.0F);
      return rRH.id_class(var1, var3);
   }

   public final float id_implements() {
      return this.id_finally.id_throws;
   }

   public Optional<rYj_1> id_new() {
      return this.id_int.id_finally();
   }

   public Optional<rYV> id_package() {
      return this.id_int.id_private();
   }

   public Optional<NS> id_super() {
      return this.id_int.id_native();
   }

   public boolean id_protected() {
      return this.id_implements() > 0.85F;
   }

   public final float id_private() {
      return this.id_volatile;
   }

   public final int id_final() {
      return this.id_int.id_byte();
   }

   public final int id_volatile() {
      return this.id_int.id_break();
   }

   private int id_synchronized() {
      double var1 = (double)rfU_2.id_class(this.id_finally.id_byte, 0.0F, 1.0F);
      double var3 = (double)rfU_2.id_class(this.id_finally.id_throws, 0.0F, 1.0F);
      return rRN.id_class(var1, var3);
   }

   public rYW id_native() {
      return this.id_int;
   }
}
