package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fD_2 extends jW_2<rHb_1> {
   private final Iq_1 id_class = id_class();
   private final Iq_1 id_break = new Iq_1(64, 64, 44, 0);
   private final Iq_1 id_byte;

   public fD_2(jz_3 var1) {
      super(var1);
      this.id_break.id_class(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F, 0.0F);
      this.id_byte = new Iq_1(64, 64, 0, 42);
      this.id_byte.id_class(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F);
   }

   public static void id_class(Ml_1 var0, Hx_1 var1, int var2, int var3, Iq_1 var4, Ig_1 var5, boolean var6, List<Pair<rHE, rxL_2>> var7) {
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, false);
   }

   public static void id_class(Ml_1 var0, Hx_1 var1, int var2, int var3, Iq_1 var4, Ig_1 var5, boolean var6, List<Pair<rHE, rxL_2>> var7, boolean var8) {
      var4.id_class(var0, var5.id_class(var1, HU::id_break, var8), var2, var3);

      for (int var9 = 0; var9 < 17 && var9 < var7.size(); var9++) {
         Pair var10 = (Pair)var7.get(var9);
         float[] var11 = ((rxL_2)var10.getSecond()).id_protected();
         Ig_1 var12 = new Ig_1(var6 ? lp_3.id_byte : lp_3.id_protected, ((rHE)var10.getFirst()).id_class(var6));
         var4.id_class(var0, var12.id_class(var1, HU::id_extends), var2, var3, var11[0], var11[1], var11[2], 1.0F);
      }
   }

   public void id_class(rHb_1 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      List var7 = var1.id_throws();
      if (var7 != null) {
         float var8 = 0.6666667F;
         boolean var9 = var1.id_while() == null;
         var3.id_class();
         long var10;
         if (var9) {
            var10 = 0L;
            var3.id_class(0.5, 0.5, 0.5);
            this.id_break.id_finally = true;
         } else {
            var10 = var1.id_while().r();
            xc_3 var12 = var1.id_abstract();
            if (var12.id_break() instanceof xS_2) {
               var3.id_class(0.5, 0.5, 0.5);
               float var13 = (float)(-var12.id_byte(xS_2.id_volatile) * 360) / 16.0F;
               var3.id_class(rje_3.id_protected.id_byte(var13));
               this.id_break.id_finally = true;
            } else {
               var3.id_class(0.5, -0.16666667F, 0.5);
               float var16 = -var12.id_byte(zt_3.id_volatile).id_package();
               var3.id_class(rje_3.id_protected.id_byte(var16));
               var3.id_class(0.0, -0.3125, -0.4375);
               this.id_break.id_finally = false;
            }
         }

         var3.id_class();
         var3.id_class(0.6666667F, -0.6666667F, -0.6666667F);
         Ok_1 var15 = IC.id_case.id_class(var4, HU::id_break);
         this.id_break.id_class(var3, var15, var5, var6);
         this.id_byte.id_class(var3, var15, var5, var6);
         rfH_2 var17 = var1.id_char();
         float var14 = ((float)Math.floorMod((long)(var17.b_() * 7 + var17.c_() * 9 + var17.d_() * 13) + var10, 100L) + var2) / 100.0F;
         this.id_class.id_case = (-0.0125F + 0.01F * rfU_2.id_break((float) (Math.PI * 2) * var14)) * (float) Math.PI;
         this.id_class.id_protected = -32.0F;
         id_class(var3, var4, var5, var6, this.id_class, IC.id_case, true, var7);
         var3.id_break();
         var3.id_break();
      }
   }

   public static Iq_1 id_class() {
      Iq_1 var0 = new Iq_1(64, 64, 0, 0);
      var0.id_class(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F, 0.0F);
      return var0;
   }
}
