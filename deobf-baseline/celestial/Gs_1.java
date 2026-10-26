package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gs_1 extends Ev_1 {
   private static float[] id_super;
   private static short[] id_this;
   private static boolean[] id_else;
   private static byte[] id_synchronized;
   private static double[] id_return;
   public static Object[] id_continue;

   @Override
   public EA id_byte(EA var1) {
      super.id_byte(var1);
      if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[37]]) {
         return var1;
      } else {
         rU_2 var2 = ((Ps_1)this.id_new[id_this[38]]).id_volatile();
         PX var3 = PJ.id_class(
            ((Ps_1)this.id_new[id_this[39]]).id_finally(), Pu_1.id_class((rU_2)this.id_new[id_this[40]]), ((Ps_1)this.id_new[id_this[41]]).id_protected()
         );
         PX var4 = null;
         xc_3 var5 = ((Ps_1)this.id_new[id_this[42]]).id_case().id_byte((rU_2)this.id_new[id_this[43]]);
         xd_3 var6 = var5.id_break();
         boolean var7 = var5.id_volatile().id_class() instanceof rXh_1;
         if (!var7 && this.id_int() && !var2.equals((rU_2)this.id_new[id_this[44]])) {
            if (!rhz_3.id_break(((rhz_3)((Ps_1)this.id_new[id_this[45]]).id_catch().id_implements[id_this[46]]).id_break((rdn_3)id_continue[id_this[47]]))
               || ((Ps_1)this.id_new[id_this[48]]).id_case().E() == rYB.id_protected) {
               return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[49]]);
            }

            if (((Ps_1)this.id_new[id_this[50]]).id_catch().Ps().id_byte - (double)((rU_2)this.id_new[id_this[51]]).c_()
                  < ((Ps_1)this.id_new[id_this[52]]).id_native().id_case()
               && !((Ps_1)this.id_new[id_this[53]]).id_catch().BL()) {
               ((rhz_3)((Ps_1)this.id_new[id_this[54]]).id_catch().id_implements[id_this[55]]).id_protected = ((rhz_3)((Ps_1)this.id_new[id_this[56]])
                     .id_catch()
                     .id_implements[id_this[57]])
                  .id_break((rdn_3)id_continue[id_this[58]]);
               var4 = new PX(var3.id_throws(), id_super[0]);
               if (((Ps_1)this.id_new[id_this[59]]).id_class((rU_2)this.id_new[id_this[60]])
                  || ((Ps_1)this.id_new[id_this[61]]).id_class(((rU_2)this.id_new[id_this[62]]).id_case())) {
                  var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[63]], id_else[0]);
               }
            }
         }

         if (var4 != null) {
            var1.id_class(new En_1(var4, id_else[1]));
         } else {
            var1.id_class(new En_1(var3, id_else[2]));
         }

         if (var2.equals((rU_2)this.id_new[id_this[64]])
            && (((Ps_1)this.id_new[id_this[65]]).id_catch().Ps().id_byte - (double)var2.c_() < id_return[2] || var7)) {
            if (!var7) {
               return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[78]]);
            }

            if (rhz_3.id_break(((rhz_3)((Ps_1)this.id_new[id_this[66]]).id_catch().id_implements[id_this[67]]).id_break((rdn_3)id_continue[id_this[68]]))) {
               ((rhz_3)((Ps_1)this.id_new[id_this[69]]).id_catch().id_implements[id_this[70]]).id_protected = ((rhz_3)((Ps_1)this.id_new[id_this[71]])
                     .id_catch()
                     .id_implements[id_this[72]])
                  .id_break((rdn_3)id_continue[id_this[73]]);
               if (((Ps_1)this.id_new[id_this[74]]).id_catch().rv().id_byte >= id_return[3]) {
                  return var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[75]], id_else[3]);
               }

               return var1;
            }

            if (((Ps_1)this.id_new[id_this[76]]).id_catch().rv().id_byte >= id_return[4]) {
               return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[77]]);
            }
         }

         rjU_2 var8 = Pu_1.id_class((rU_2)this.id_new[id_this[79]]);
         if (Math.abs(((Ps_1)this.id_new[id_this[80]]).id_catch().Ps().id_break + ((Ps_1)this.id_new[id_this[81]]).id_catch().rv().id_break - var8.id_break)
               > id_return[5]
            || Math.abs(
                  ((Ps_1)this.id_new[id_this[82]]).id_catch().Ps().id_protected
                     + ((Ps_1)this.id_new[id_this[83]]).id_catch().rv().id_protected
                     - var8.id_protected
               )
               > id_return[6]) {
            if (!((Ps_1)this.id_new[id_this[84]]).id_catch().BL() && Math.abs(((Ps_1)this.id_new[id_this[85]]).id_catch().rv().id_byte) > id_return[7]) {
               var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[86]], id_else[4]);
            }

            var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[87]], id_else[5]);
         }

         Object var9 = Optional.ofNullable(this.id_package()).map(rpr_3::id_int).orElse(null);
         if (var9 == null) {
            var9 = ((rU_2)this.id_new[id_this[88]]).id_byte((rU_2)this.id_new[id_this[89]]);
         } else {
            double var10 = Math.abs(
                  (double)((rja_3)var9).b_()
                     * (var8.id_break - (double)((rja_3)var9).b_() / id_return[8] - ((Ps_1)this.id_new[id_this[90]]).id_catch().Ps().id_break)
               )
               + Math.abs(
                  (double)((rja_3)var9).d_()
                     * (var8.id_protected - (double)((rja_3)var9).d_() / id_return[9] - ((Ps_1)this.id_new[id_this[91]]).id_catch().Ps().id_protected)
               );
            if (var10 < id_return[10]) {
               var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[92]], id_else[6]);
            } else if (!((Ps_1)this.id_new[id_this[93]]).id_catch().BL()) {
               var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[94]], id_else[7]);
            }
         }

         if (var4 == null) {
            rjU_2 var12 = new rjU_2(
               var8.id_break + id_return[11] * (double)((rja_3)var9).b_(), var8.id_byte, var8.id_protected + id_return[12] * (double)((rja_3)var9).d_()
            );
            var1.id_class(
               new En_1(PJ.id_class(((Ps_1)this.id_new[id_this[95]]).id_finally(), var12, ((Ps_1)this.id_new[id_this[96]]).id_protected()), id_else[8])
            );
         }

         return var1;
      }
   }

   private boolean id_int() {
      EZ var1 = new EZ((C_case)this.id_new[id_this[20]]);
      Mr_1 var2 = new Mr_1();
      return GP.id_class(
         var1,
         (Integer)((rU_2)this.id_new[id_this[21]]).id_break[id_this[22]],
         (Integer)((rU_2)this.id_new[id_this[23]]).id_break[id_this[24]],
         (Integer)((rU_2)this.id_new[id_this[25]]).id_break[id_this[26]],
         (Integer)((rU_2)this.id_new[id_this[27]]).id_break[id_this[28]],
         (Integer)((rU_2)this.id_new[id_this[29]]).id_break[id_this[30]],
         id_return[1],
         var1.id_class(
            (Integer)((rU_2)this.id_new[id_this[31]]).id_break[id_this[32]],
            (Integer)((rU_2)this.id_new[id_this[33]]).id_break[id_this[34]] - id_synchronized[0],
            (Integer)((rU_2)this.id_new[id_this[35]]).id_break[id_this[36]]
         ),
         var2
      );
   }

   public Gs_1(C_case var1, rU_2 var2, rU_2 var3) {
      super(var1, var2, var3, id_class(var2, var3));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_else = new boolean[]{true, true, false, true, true, true, true, false, false, false, true, false, false, true, true, false, true, false, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2708287656851244607L;
   }

   private static rU_2[] id_class(rU_2 var0, rU_2 var1) {
      int var3 = var0.b_() - var1.b_();
      int var4 = var0.d_() - var1.d_();
      int var5 = var0.c_() - var1.c_();
      rU_2[] var2 = new rU_2[var5 + id_synchronized[2]];

      for (int var6 = id_else[12]; var6 < var2.length; var6++) {
         var2[var6] = new rU_2(var0.b_() - var3, var0.c_() + id_else[13] - var6, var0.d_() - var4);
      }

      return var2;
   }

   @Override
   public double id_class(EZ var1) {
      Mr_1 var2 = new Mr_1();
      GP.id_class(
         var1,
         (Integer)((rU_2)this.id_new[id_this[0]]).id_break[id_this[1]],
         (Integer)((rU_2)this.id_new[id_this[2]]).id_break[id_this[3]],
         (Integer)((rU_2)this.id_new[id_this[4]]).id_break[id_this[5]],
         (Integer)((rU_2)this.id_new[id_this[6]]).id_break[id_this[7]],
         (Integer)((rU_2)this.id_new[id_this[8]]).id_break[id_this[9]],
         var2
      );
      return var2.id_class[id_this[10]] != ((rU_2)this.id_new[id_this[11]]).id_break[id_this[12]] ? id_return[0] : (Double)var2.id_class[id_this[13]];
   }

   @Override
   public boolean id_class(EA var1) {
      return !((Ps_1)this.id_new[id_this[99]]).id_volatile().equals((rU_2)this.id_new[id_this[100]])
            && var1.id_byte() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[101]]
         ? id_else[11]
         : id_else[10];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -975750885;
   }

   @Override
   public boolean id_break(EA var1) {
      if (var1.id_byte() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[102]]) {
         return id_else[14];
      } else {
         for (int var2 = id_else[15]; var2 < id_synchronized[3] && var2 < ((rU_2[])this.id_new[id_this[103]]).length; var2++) {
            if (!EF.id_class((Ps_1)this.id_new[id_this[104]], ((rU_2[])this.id_new[id_this[105]])[var2])) {
               return super.id_break(var1);
            }
         }

         return id_else[16];
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, -122, 60, 89, -101, -100, 25, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.hR), new rdn_3(rdy_3.hg)};
      id_continue = var0;
   }

   private static void id_else() {
      id_this = new short[]{
         3,
         0,
         3,
         1,
         3,
         2,
         4,
         0,
         4,
         2,
         1,
         4,
         1,
         3,
         3,
         3,
         1,
         4,
         1,
         4,
         0,
         3,
         0,
         3,
         1,
         3,
         2,
         4,
         0,
         4,
         2,
         4,
         0,
         3,
         1,
         4,
         2,
         2,
         1,
         1,
         4,
         1,
         1,
         4,
         4,
         1,
         1,
         0,
         1,
         4,
         1,
         4,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         1,
         4,
         1,
         4,
         5,
         4,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         5,
         1,
         3,
         3,
         4,
         1,
         1,
         1,
         1,
         1,
         1,
         7,
         0,
         3,
         4,
         1,
         1,
         0,
         1,
         7,
         1,
         1,
         1,
         1,
         1,
         3,
         2,
         1,
         5,
         1,
         5
      };
   }

   private static void id_new() {
      id_super = new float[]{90.0F};
   }

   private rpr_3 id_package() {
      for (int var1 = id_else[9]; var1 < id_synchronized[1]; var1++) {
         xc_3 var2 = ((Ps_1)this.id_new[id_this[97]]).id_case().id_byte(((Ps_1)this.id_new[id_this[98]]).id_volatile().id_protected(var1));
         if (var2.id_break() == xu_3.PJ) {
            return var2.id_byte(kc_3.id_volatile);
         }
      }

      return null;
   }

   private static void id_super() {
      id_return = new double[]{1000000.0, 0.0, 0.094, 0.0, 0.0, 0.1, 0.1, 0.4, 2.0, 2.0, 0.6, 0.125, 0.125};
   }

   private static void id_synchronized() {
      id_synchronized = new byte[]{2, 15, 2, 4, 2};
   }

   @Override
   public Set<rU_2> id_native() {
      HashSet var1 = new HashSet();
      var1.add((rU_2)this.id_new[id_this[14]]);

      for (int var2 = (Integer)((rU_2)this.id_new[id_this[15]]).id_break[id_this[16]] - (Integer)((rU_2)this.id_new[id_this[17]]).id_break[id_this[18]];
         var2 >= 0;
         var2--
      ) {
         var1.add(((rU_2)this.id_new[id_this[19]]).id_final(var2));
      }

      return var1;
   }
}
