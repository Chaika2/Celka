package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUc_1 extends rUO<rUt_1> {
   private static final rqO_2 id_class = new rqO_2("fossil/spine_1");
   private static final rqO_2 b = new rqO_2("fossil/spine_2");
   private static final rqO_2 M = new rqO_2("fossil/spine_3");
   private static final rqO_2 O = new rqO_2("fossil/spine_4");
   private static final rqO_2 h = new rqO_2("fossil/spine_1_coal");
   private static final rqO_2 X = new rqO_2("fossil/spine_2_coal");
   private static final rqO_2 J = new rqO_2("fossil/spine_3_coal");
   private static final rqO_2 x = new rqO_2("fossil/spine_4_coal");
   private static final rqO_2 d = new rqO_2("fossil/skull_1");
   private static final rqO_2 k = new rqO_2("fossil/skull_2");
   private static final rqO_2 W = new rqO_2("fossil/skull_3");
   private static final rqO_2 z = new rqO_2("fossil/skull_4");
   private static final rqO_2 Q = new rqO_2("fossil/skull_1_coal");
   private static final rqO_2 N = new rqO_2("fossil/skull_2_coal");
   private static final rqO_2 c = new rqO_2("fossil/skull_3_coal");
   private static final rqO_2 u = new rqO_2("fossil/skull_4_coal");
   private static final rqO_2[] m = new rqO_2[]{id_class, b, M, O, d, k, W, z};
   private static final rqO_2[] Z = new rqO_2[]{h, X, J, x, Q, N, c, u};

   public rUc_1(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      rqd_3 var6 = rqd_3.id_class(var3);
      int var7 = var3.nextInt(m.length);
      rrPt_1 var8 = var1.id_byte().id_const().rP();
      rrPl_1 var9 = var8.id_class(m[var7]);
      rrPl_1 var10 = var8.id_class(Z[var7]);
      rfj_3 var11 = new rfj_3(var4);
      rfi_3 var12 = new rfi_3(var11.id_break(), 0, var11.id_byte(), var11.id_protected(), 256, var11.id_throws());
      rrPN var13 = new rrPN().id_class(var6).id_class(var12).id_class(var3).id_class(rrPG.id_protected);
      rfH_2 var14 = var9.id_class(var6);
      int var15 = var3.nextInt(16 - var14.b_());
      int var16 = var3.nextInt(16 - var14.d_());
      int var17 = 256;

      for (int var18 = 0; var18 < var14.b_(); var18++) {
         for (int var19 = 0; var19 < var14.d_(); var19++) {
            var17 = Math.min(var17, var1.id_class(rKv_1.OCEAN_FLOOR_WG, var4.b_() + var18 + var15, var4.d_() + var19 + var16));
         }
      }

      int var22 = Math.max(var17 - 15 - var3.nextInt(10), 10);
      rfH_2 var23 = var9.id_class(var4.id_break(var15, var22, var16), rpa_3.NONE, var6);
      rrPd_1 var20 = new rrPd_1(0.9F);
      var13.id_break().id_class(var20);
      var9.id_class(var1, var23, var23, var13, var3, 4);
      var13.id_break(var20);
      rrPd_1 var21 = new rrPd_1(0.1F);
      var13.id_break().id_class(var21);
      var10.id_class(var1, var23, var23, var13, var3, 4);
      return true;
   }
}
