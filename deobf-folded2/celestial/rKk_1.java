package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class rKk_1 extends rKd_1 {
   public static final Codec<rKk_1> id_protected = rVn_1.id_class(rVL.n).xmap(rKk_1::new, rKk_1::id_catch).stable().codec();
   private static final List<xc_3> id_catch = StreamSupport.stream(rVL.id_strictfp.spliterator(), false)
      .flatMap(var0 -> var0.id_new().id_class().stream())
      .collect(Collectors.toList());
   private static final int id_private = rfU_2.id_case(rfU_2.id_byte((float)id_catch.size()));
   private static final int id_implements = rfU_2.id_case((float)id_catch.size() / (float)id_private);
   protected static final xc_3 id_throws = xu_3.id_class.id_continue();
   protected static final xc_3 id_case = xu_3.Ec.id_continue();
   private final rVL<rYG> id_finally;

   public rKk_1(rVL<rYG> var1) {
      super(new ror_3(var1.id_byte(rYl_1.id_break)), new rrSq_1(false));
      this.id_finally = var1;
   }

   @Override
   public void id_class(rRg_1 var1, rrrA var2, roC_2 var3) {
   }

   @Override
   public int id_class(int var1, int var2, rKv_1 var3) {
      return 0;
   }

   @Override
   public rRq_1 id_class(int var1, int var2) {
      return new rRE(new xc_3[0]);
   }

   @Override
   public void id_class(rKf_1 var1, rrrA var2) {
      rfw_3 var3 = new rfw_3();
      int var4 = var1.id_protected();
      int var5 = var1.id_throws();

      for (int var6 = 0; var6 < 16; var6++) {
         for (int var7 = 0; var7 < 16; var7++) {
            int var8 = (var4 << 4) + var6;
            int var9 = (var5 << 4) + var7;
            var1.id_class(var3.id_class(var8, 60, var9), id_case, 2);
            xc_3 var10 = id_break(var8, var9);
            if (var10 != null) {
               var1.id_class(var3.id_class(var8, 70, var9), var10, 2);
            }
         }
      }
   }

   @Override
   public rKd_1 id_class(long var1) {
      return this;
   }

   @Override
   public void id_class(rKf_1 var1, roC_2 var2) {
   }

   @Override
   public void id_class(long var1, rYA var3, roC_2 var4, rKu_1 var5) {
   }

   @Override
   protected Codec<? extends rKd_1> id_class() {
      return id_protected;
   }

   public static xc_3 id_break(int var0, int var1) {
      xc_3 var2 = id_throws;
      if (var0 > 0 && var1 > 0 && var0 % 2 != 0 && var1 % 2 != 0) {
         var0 /= 2;
         var1 /= 2;
         if (var0 <= id_private && var1 <= id_implements) {
            int var3 = rfU_2.id_class(var0 * id_private + var1);
            if (var3 < id_catch.size()) {
               var2 = id_catch.get(var3);
            }
         }
      }

      return var2;
   }

   public rVL<rYG> id_catch() {
      return this.id_finally;
   }
}
