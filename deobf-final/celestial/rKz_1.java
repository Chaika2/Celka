package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;

public class rKz_1 extends rKd_1 {
   public static final Codec<rKz_1> protected_ = rKQ.class_.fieldOf("settings").xmap(rKz_1::new, rKz_1::catch_).codec();
   private final rKQ throws_;

   @Override
   public int byte_() {
      xc_3[] var1 = this.throws_.catch_();

      for (int var2 = 0; var2 < var1.length; var2++) {
         xc_3 var3 = var1[var2] == null ? xu_3.class_.continue_() : var1[var2];
         if (!rKv_1.MOTION_BLOCKING.throws_().test(var3)) {
            return var2 - 1;
         }
      }

      return var1.length;
   }

   public rKz_1(rKQ var1) {
      super(new ror_3(var1.byte_()), new ror_3(var1.throws_()), var1.protected_(), 0L);
      this.throws_ = var1;
   }

   @Override
   public void class_(rRg_1 var1, rrrA var2, roC_2 var3) {
      xc_3[] var4 = this.throws_.catch_();
      rfw_3 var5 = new rfw_3();
      rKZ var6 = var3.class_(rKv_1.OCEAN_FLOOR_WG);
      rKZ var7 = var3.class_(rKv_1.WORLD_SURFACE_WG);

      for (int var8 = 0; var8 < var4.length; var8++) {
         xc_3 var9 = var4[var8];
         if (var9 != null) {
            for (int var10 = 0; var10 < 16; var10++) {
               for (int var11 = 0; var11 < 16; var11++) {
                  var3.class_(var5.class_(var10, var8, var11), var9, false);
                  var6.class_(var10, var8, var11, var9);
                  var7.class_(var10, var8, var11, var9);
               }
            }
         }
      }
   }

   @Override
   public rRq_1 class_(int var1, int var2) {
      return new rRE(Arrays.stream(this.throws_.catch_()).map(var0 -> var0 == null ? xu_3.class_.continue_() : var0).toArray(xc_3[]::new));
   }

   @Override
   public int class_(int var1, int var2, rKv_1 var3) {
      xc_3[] var4 = this.throws_.catch_();

      for (int var5 = var4.length - 1; var5 >= 0; var5--) {
         xc_3 var6 = var4[var5];
         if (var6 != null && var3.throws_().test(var6)) {
            return var5 + 1;
         }
      }

      return 0;
   }

   @Override
   public void class_(rKf_1 var1, roC_2 var2) {
   }

   @Override
   public rKd_1 class_(long var1) {
      return this;
   }

   @Override
   protected Codec<? extends rKd_1> class_() {
      return protected_;
   }

   public rKQ catch_() {
      return this.throws_;
   }
}
