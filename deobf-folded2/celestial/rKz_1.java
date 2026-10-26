package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;

public class rKz_1 extends rKd_1 {
   public static final Codec<rKz_1> id_protected = rKQ.id_class.fieldOf("settings").xmap(rKz_1::new, rKz_1::id_catch).codec();
   private final rKQ id_throws;

   @Override
   public int id_byte() {
      xc_3[] var1 = this.id_throws.id_catch();

      for (int var2 = 0; var2 < var1.length; var2++) {
         xc_3 var3 = var1[var2] == null ? xu_3.id_class.id_continue() : var1[var2];
         if (!rKv_1.MOTION_BLOCKING.id_throws().test(var3)) {
            return var2 - 1;
         }
      }

      return var1.length;
   }

   public rKz_1(rKQ var1) {
      super(new ror_3(var1.id_byte()), new ror_3(var1.id_throws()), var1.id_protected(), 0L);
      this.id_throws = var1;
   }

   @Override
   public void id_class(rRg_1 var1, rrrA var2, roC_2 var3) {
      xc_3[] var4 = this.id_throws.id_catch();
      rfw_3 var5 = new rfw_3();
      rKZ var6 = var3.id_class(rKv_1.OCEAN_FLOOR_WG);
      rKZ var7 = var3.id_class(rKv_1.WORLD_SURFACE_WG);

      for (int var8 = 0; var8 < var4.length; var8++) {
         xc_3 var9 = var4[var8];
         if (var9 != null) {
            for (int var10 = 0; var10 < 16; var10++) {
               for (int var11 = 0; var11 < 16; var11++) {
                  var3.id_class(var5.id_class(var10, var8, var11), var9, false);
                  var6.id_class(var10, var8, var11, var9);
                  var7.id_class(var10, var8, var11, var9);
               }
            }
         }
      }
   }

   @Override
   public rRq_1 id_class(int var1, int var2) {
      return new rRE(Arrays.stream(this.id_throws.id_catch()).map(var0 -> var0 == null ? xu_3.id_class.id_continue() : var0).toArray(xc_3[]::new));
   }

   @Override
   public int id_class(int var1, int var2, rKv_1 var3) {
      xc_3[] var4 = this.id_throws.id_catch();

      for (int var5 = var4.length - 1; var5 >= 0; var5--) {
         xc_3 var6 = var4[var5];
         if (var6 != null && var3.id_throws().test(var6)) {
            return var5 + 1;
         }
      }

      return 0;
   }

   @Override
   public void id_class(rKf_1 var1, roC_2 var2) {
   }

   @Override
   public rKd_1 id_class(long var1) {
      return this;
   }

   @Override
   protected Codec<? extends rKd_1> id_class() {
      return id_protected;
   }

   public rKQ id_catch() {
      return this.id_throws;
   }
}
