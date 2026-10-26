package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fD_2 extends jW_2<rHb_1> {
   private final Iq_1 class_ = class_();
   private final Iq_1 break_ = new Iq_1(64, 64, 44, 0);
   private final Iq_1 byte_;

   public fD_2(jz_3 var1) {
      super(var1);
      this.break_.class_(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F, 0.0F);
      this.byte_ = new Iq_1(64, 64, 0, 42);
      this.byte_.class_(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F);
   }

   public static void class_(Ml_1 var0, Hx_1 var1, int var2, int var3, Iq_1 var4, Ig_1 var5, boolean var6, List<Pair<rHE, rxL_2>> var7) {
      class_(var0, var1, var2, var3, var4, var5, var6, var7, false);
   }

   public static void class_(Ml_1 var0, Hx_1 var1, int var2, int var3, Iq_1 var4, Ig_1 var5, boolean var6, List<Pair<rHE, rxL_2>> var7, boolean var8) {
      var4.class_(var0, var5.class_(var1, HU::break_, var8), var2, var3);

      for (int var9 = 0; var9 < 17 && var9 < var7.size(); var9++) {
         Pair var10 = (Pair)var7.get(var9);
         float[] var11 = ((rxL_2)var10.getSecond()).protected_();
         Ig_1 var12 = new Ig_1(var6 ? lp_3.byte_ : lp_3.protected_, ((rHE)var10.getFirst()).class_(var6));
         var4.class_(var0, var12.class_(var1, HU::extends_), var2, var3, var11[0], var11[1], var11[2], 1.0F);
      }
   }

   public void class_(rHb_1 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      List var7 = var1.throws_();
      if (var7 != null) {
         float var8 = 0.6666667F;
         boolean var9 = var1.while_() == null;
         var3.class_();
         long var10;
         if (var9) {
            var10 = 0L;
            var3.class_(0.5, 0.5, 0.5);
            this.break_.finally_ = true;
         } else {
            var10 = var1.while_().r();
            xc_3 var12 = var1.abstract_();
            if (var12.break_() instanceof xS_2) {
               var3.class_(0.5, 0.5, 0.5);
               float var13 = (float)(-var12.byte_(xS_2.volatile_) * 360) / 16.0F;
               var3.class_(rje_3.protected_.byte_(var13));
               this.break_.finally_ = true;
            } else {
               var3.class_(0.5, -0.16666667F, 0.5);
               float var16 = -var12.byte_(zt_3.volatile_).package_();
               var3.class_(rje_3.protected_.byte_(var16));
               var3.class_(0.0, -0.3125, -0.4375);
               this.break_.finally_ = false;
            }
         }

         var3.class_();
         var3.class_(0.6666667F, -0.6666667F, -0.6666667F);
         Ok_1 var15 = IC.case_.class_(var4, HU::break_);
         this.break_.class_(var3, var15, var5, var6);
         this.byte_.class_(var3, var15, var5, var6);
         rfH_2 var17 = var1.char_();
         float var14 = ((float)Math.floorMod((long)(var17.b_() * 7 + var17.c_() * 9 + var17.d_() * 13) + var10, 100L) + var2) / 100.0F;
         this.class_.case_ = (-0.0125F + 0.01F * rfU_2.break_((float) (Math.PI * 2) * var14)) * (float) Math.PI;
         this.class_.protected_ = -32.0F;
         class_(var3, var4, var5, var6, this.class_, IC.case_, true, var7);
         var3.break_();
         var3.break_();
      }
   }

   public static Iq_1 class_() {
      Iq_1 var0 = new Iq_1(64, 64, 0, 0);
      var0.class_(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F, 0.0F);
      return var0;
   }
}
