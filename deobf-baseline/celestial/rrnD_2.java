package celestial;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnD_2 implements MinecraftAccessor {
   public static Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;
   private static long[] id_throws;
   private static boolean[] id_case;
   private static float[] id_catch;
   public Object[] id_break;
   private static double[] id_private;

   public void id_byte() {
      Integer var5 = Integer.valueOf(id_case[56]);
      this.id_break[id_byte[98]] = var5;
      Integer var6 = Integer.valueOf(id_case[57]);
      this.id_break[id_byte[99]] = var6;
   }

   private static void id_int() {
      id_byte = new short[]{
         0,
         1,
         0,
         0,
         56,
         56,
         57,
         1,
         3,
         0,
         57,
         0,
         0,
         57,
         6,
         6,
         57,
         0,
         57,
         4,
         0,
         57,
         55,
         57,
         55,
         57,
         7,
         7,
         7,
         6,
         2,
         0,
         57,
         57,
         5,
         0,
         57,
         57,
         5,
         5,
         57,
         31,
         57,
         57,
         31,
         0,
         57,
         57,
         57,
         17,
         57,
         57,
         56,
         57,
         57,
         57,
         57,
         57,
         57,
         18,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         0,
         57,
         57,
         0,
         57,
         57,
         57,
         57,
         0,
         2,
         55,
         57,
         0,
         57,
         0,
         57,
         0,
         55,
         57,
         57,
         0,
         57,
         1,
         55,
         57,
         0,
         57,
         0,
         55,
         57,
         5,
         6,
         0,
         57,
         1,
         3,
         2,
         57,
         57,
         2,
         3,
         4,
         4,
         0,
         57,
         57,
         0,
         57,
         57,
         57,
         57
      };
   }

   public rrnD_2(AttackAura var1) {
      this.id_private();
      this.id_break[id_byte[0]] = var1;
      rrnU_2 var7 = new rrnU_2(var1);
      this.id_break[id_byte[1]] = var7;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, 78, 39, 51, 26, 119, 78, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 636227653;
   }

   public boolean id_class(AttackAura var1, float var2, int var3, boolean var4, boolean var5, int var6) {
      if (var1.id_continue() == null) {
         return id_case[42];
      } else if (!var1.id_instanceof().id_class() && !var1.s()
         || !((cb_3)id_import.id_class[id_byte[74]]).sL()
         || ((cb_3)id_import.id_class[id_byte[75]]).sX().id_break() == rdy_3.kN && ((AttackAura)this.id_break[id_byte[76]]).id_double().id_class()) {
         if (var1.id_else().id_class() && C_throws.id_byte().id_return().id_class()) {
            return id_case[44];
         } else if (!this.id_class(var2, var3)) {
            return id_case[45];
         } else {
            return var1.id_public().id_class() ? this.id_class(var4, var5, var6) : id_case[46];
         }
      } else {
         return id_case[43];
      }
   }

   public boolean id_class(AttackAura var1) {
      return this.id_class(var1, id_catch[6], id_case[38], id_case[39], id_case[40], id_case[41]);
   }

   public boolean id_class(float var1, int var2) {
      if (!rrfo_3.id_class(var1)) {
         return id_case[47];
      } else {
         return (float)(System.currentTimeMillis() - this.id_break[id_byte[77]]) >= id_catch[7] - (float)var2 ? id_case[48] : id_case[49];
      }
   }

   public boolean id_class(boolean var1, boolean var2, int var3) {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[35]]).id_private().t().id_new()) {
         return id_case[14];
      } else if (var1 && !this.id_case()) {
         return id_case[15];
      } else {
         if (var2) {
            double var4 = Math.abs((double)((int)((cb_3)id_import.id_class[id_byte[36]]).re()) - ((cb_3)id_import.id_class[id_byte[37]]).re());
            if (var4 == id_private[1]) {
               Integer var12 = Integer.valueOf(id_protected[2]);
               this.id_break[id_byte[38]] = var12;
            } else if (var4 == id_private[2]) {
               Integer var13 = Integer.valueOf(id_protected[3]);
               this.id_break[id_byte[39]] = var13;
            }
         }

         boolean var14;
         if (var3 > 0) {
            rrvy_1 var5 = new rrvy_1((cb_3)id_import.id_class[id_byte[40]]);
            var5.id_class(var3);
            var14 = !var5.BL() && var5.id_throws[id_byte[41]] > id_catch[3] ? id_case[16] : id_case[17];
         } else {
            var14 = !((cb_3)id_import.id_class[id_byte[42]]).BL() && ((cb_3)id_import.id_class[id_byte[43]]).id_throws[id_byte[44]] > id_catch[4]
               ? id_case[18]
               : id_case[19];
         }

         rrne_3 var15 = ((AttackAura)this.id_break[id_byte[45]]).id_for();
         if (var15.id_break() && var15.id_class()) {
            rrvy_1 var6 = new rrvy_1((cb_3)id_import.id_class[id_byte[46]]);
            List var7 = var6.id_else();
            if (var7.size() > id_case[20]) {
               return id_case[21];
            }
         }

         return var14;
      }
   }

   public boolean id_class(iB_2 var1, rrTT var2) {
      if ((C_volatile)rrTT.id_break[id_byte[8]] != var2) {
         return id_case[1];
      } else {
         float var3 = ((AttackAura)this.id_break[id_byte[9]]).id_try();
         if (var2.id_package()) {
            an_3 var4 = Ph_1.id_class(
               var1,
               ((cb_3)id_import.id_class[id_byte[10]]).id_new(id_catch[2]),
               var2.id_throws(),
               var3,
               ((AttackAura)this.id_break[id_byte[11]]).id_switch().id_class(),
               var1x -> !((AttackAura)this.id_break[id_byte[111]]).P().id_class(var1x) ? id_case[60] : id_case[61]
            );
            if (var4 != var1) {
               return id_case[2];
            }
         }

         boolean var18 = ((AttackAura)this.id_break[id_byte[12]]).id_float();
         if (rmD_2.id_break && this.id_case()) {
            ((cb_3)id_import.id_class[id_byte[13]]).c_(id_case[3]);
            if (var18) {
               if ((Integer)this.id_break[id_byte[14]] == 0) {
                  Integer var11 = Integer.valueOf(id_case[4]);
                  this.id_break[id_byte[15]] = var11;
               }

               return id_case[5];
            }

            ((Aq_1)((cb_3)id_import.id_class[id_byte[16]]).id_break[id_byte[17]])
               .id_class(new rmD_2((cb_3)id_import.id_class[id_byte[18]], rmU_2.STOP_SPRINTING));
            Boolean var12 = id_case[6];
            this.id_break[id_byte[19]] = var12;
         }

         if (((AttackAura)this.id_break[id_byte[20]]).id_double().id_class() && ((cb_3)id_import.id_class[id_byte[21]]).sd()) {
            ((Ax_1)id_import.id_class[id_byte[22]]).id_break((cb_3)id_import.id_class[id_byte[23]]);
         }

         ((Ax_1)id_import.id_class[id_byte[24]]).id_class((cb_3)id_import.id_class[id_byte[25]], var1, id_case[7]);
         if (var18 && rrjS_2.id_protected()) {
            int var10002 = (Integer)this.id_break[id_byte[26]] + id_case[8];
            Integer var13 = var10002;
            this.id_break[id_byte[27]] = var13;
            if (var10002 >= id_case[9]) {
               Integer var14 = Integer.valueOf(id_case[10]);
               this.id_break[id_byte[28]] = var14;
               Integer var15 = Integer.valueOf(id_case[11]);
               this.id_break[id_byte[29]] = var15;
            }
         }

         Long var16 = System.currentTimeMillis();
         this.id_break[id_byte[30]] = var16;
         if (((AttackAura)this.id_break[id_byte[31]]).id_this().id_class()) {
            this.id_class(var1);
         }

         if (this.id_new()) {
            int var5 = ((cb_3)id_import.id_class[id_byte[32]]).id_byte(rLD.id_protected).id_byte() + id_case[12];
            int var6 = var5 * id_protected[0] - var5 / id_protected[1];
            if (((cb_3)id_import.id_class[id_byte[33]]).rv().id_byte < id_private[0]) {
               var6++;
            }

            Integer var17 = var6;
            this.id_break[id_byte[34]] = var17;
         }

         return id_case[13];
      }
   }

   public long id_class() {
      return (Long)this.id_break[id_byte[107]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6129004129455492945L;
   }

   private void id_class(iB_2 var1) {
      if (var1 instanceof rhd_3 var2
         && var1.id_extends(id_protected[4])
         && (!var2.id_native() || !var2.id_implements())
         && rrfH_2.id_class(var1, rdy_3.kN) != null) {
         int var3 = this.id_class(var2, id_case[50]);
         if (var3 > id_protected[5]) {
            ((Ax_1)id_import.id_class[id_byte[78]]).id_class(var3);
         }
      }
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[id_byte[110]] = var6;
   }

   private int id_class(iB_2 var1, boolean var2) {
      int var3 = rrfY_2.id_class(rxM_2.class);
      if (var3 >= 0) {
         ((Aq_1)((cb_3)id_import.id_class[id_byte[79]]).id_break[id_byte[80]]).id_class(new rme_3(var3));
         if (var2) {
            ((Aq_1)((cb_3)id_import.id_class[id_byte[81]]).id_break[id_byte[82]]).id_class(new rZq_1(var1, rpm_3.MAIN_HAND, id_case[51]));
            ((Aq_1)((cb_3)id_import.id_class[id_byte[83]]).id_break[id_byte[84]]).id_class(new rmq_3(rpm_3.MAIN_HAND));
         } else {
            ((Ax_1)id_import.id_class[id_byte[85]]).id_break((cb_3)id_import.id_class[id_byte[86]], var1, id_case[52]);
         }

         ((Aq_1)((cb_3)id_import.id_class[id_byte[87]]).id_break[id_byte[88]])
            .id_class(new rme_3(((rhz_3)((cb_3)id_import.id_class[id_byte[89]]).id_implements[id_byte[90]]).id_protected));
         this.id_extends();
         return var3;
      } else {
         int var4 = rrfY_2.id_class(rxM_2.class, id_case[53]);
         if (var4 >= 0) {
            ((Ax_1)id_import.id_class[id_byte[91]]).id_class(var4);
            if (var2) {
               ((Aq_1)((cb_3)id_import.id_class[id_byte[92]]).id_break[id_byte[93]]).id_class(new rZq_1(var1, rpm_3.MAIN_HAND, id_case[54]));
               ((Aq_1)((cb_3)id_import.id_class[id_byte[94]]).id_break[id_byte[95]]).id_class(new rmq_3(rpm_3.MAIN_HAND));
            } else {
               ((Ax_1)id_import.id_class[id_byte[96]]).id_break((cb_3)id_import.id_class[id_byte[97]], var1, id_case[55]);
            }

            this.id_extends();
            return var4;
         } else {
            return id_protected[6];
         }
      }
   }

   public iB_2 id_class(CheckGroup var1) {
      float var2 = ((AttackAura)this.id_break[id_byte[2]]).G();
      Predicate var3 = var3x -> {
         if (var3x == null) {
            return id_case[62];
         } else if (var3x == ((cb_3)id_import.id_class[id_byte[112]]).ra()) {
            return id_case[63];
         } else if (var3x == (cb_3)id_import.id_class[id_byte[113]]) {
            return id_case[64];
         } else if (var3x.id_native()) {
            return id_case[65];
         } else if (var3x instanceof rSY) {
            return id_case[66];
         } else if (!var3x.Pu()) {
            return id_case[67];
         } else {
            if (((AttackAura)this.id_break[id_byte[114]]).id_throw()) {
               if (((cb_3)id_import.id_class[id_byte[115]]).id_class(var3x, iM_2.STANDING, var3x.Pb()) > (double)var2
                  && ((cb_3)id_import.id_class[id_byte[116]]).id_class(var3x, iM_2.FALL_FLYING, iM_2.STANDING) > (double)var2) {
                  return id_case[68];
               }
            } else if (((cb_3)id_import.id_class[id_byte[117]]).id_class(var3x, iM_2.STANDING, var3x.Pb()) > (double)var2
               && ((cb_3)id_import.id_class[id_byte[118]]).id_class(var3x, iM_2.FALL_FLYING, var3x.Pb()) > (double)var2) {
               return id_case[69];
            }

            return rrff_3.id_class(var3x, var1);
         }
      };
      iB_2 var4 = ((AttackAura)this.id_break[id_byte[3]]).id_continue();
      if (var3.test(var4)) {
         return var4;
      } else {
         Object var5;
         if (var2 == id_catch[0]) {
            ArrayList var6 = new ArrayList();
            ObjectIterator var7 = ((gm_3)id_import.id_class[id_byte[4]]).id_return().values().iterator();

            while (var7.hasNext()) {
               an_3 var8 = (an_3)var7.next();
               if (var8 instanceof iB_2) {
                  iB_2 var9 = (iB_2)var8;
                  if (var3.test(var9)) {
                     var6.add(var9);
                  }
               }
            }

            var5 = var6;
         } else {
            var5 = ((gm_3)id_import.id_class[id_byte[5]])
               .id_class(iB_2.class, ((cb_3)id_import.id_class[id_byte[6]]).rN().id_class((double)(var2 * id_catch[1])), var3);
         }

         var5.sort((Comparator)this.id_break[id_byte[7]]);
         return var5.isEmpty() ? null : (iB_2)var5.get(id_case[0]);
      }
   }

   public void id_class(AttackAura var1, q_1 var2) {
      if (var2.id_class() == var1.id_default() && this.id_catch()) {
         ((Aq_1)((cb_3)id_import.id_class[id_byte[70]]).id_break[id_byte[71]])
            .id_class(new rmD_2((cb_3)id_import.id_class[id_byte[72]], rmU_2.START_SPRINTING));
         ((cb_3)id_import.id_class[id_byte[73]]).c_(id_case[36]);
         this.id_class(id_case[37]);
      }
   }

   public long id_break() {
      return System.currentTimeMillis() - (Long)this.id_break[id_byte[104]];
   }

   public boolean id_throws() {
      if (((AttackAura)this.id_break[id_byte[68]]).id_import().id_class()) {
         return id_case[33];
      } else {
         return ((cb_3)id_import.id_class[id_byte[69]]).id_break(rLD.id_private) ? id_case[34] : id_case[35];
      }
   }

   private static void id_finally() {
      id_protected = new byte[]{2, 2, 2, 3, 2, 8, -1, 3, 8, 2, 3, 4, 5, 6, 7, 2};
   }

   public boolean id_catch() {
      return (Boolean)this.id_break[id_byte[109]];
   }

   private void id_extends() {
      ((AttackAura)this.id_break[id_byte[100]]).id_const().id_class(((rhz_3)((cb_3)id_import.id_class[id_byte[101]]).id_implements[id_byte[102]]).id_protected);
      Long var5 = System.currentTimeMillis();
      this.id_break[id_byte[103]] = var5;
   }

   public boolean id_case() {
      boolean var1 = ((cb_3)id_import.id_class[id_byte[47]]).BL();
      if (this.id_throws() && !((rqr_3)((cb_3)id_import.id_class[id_byte[48]]).id_break[id_byte[49]]).id_private && var1) {
         return id_case[22];
      } else {
         float var2 = id_catch[5];
         boolean var3 = ((cb_3)id_import.id_class[id_byte[50]]).PZ() && !((cb_3)id_import.id_class[id_byte[51]]).id_catch(var2) ? id_case[23] : id_case[24];
         boolean var4 = ((gm_3)id_import.id_class[id_byte[52]])
            .id_break(((cb_3)id_import.id_class[id_byte[53]]).rN().id_protected(id_private[3], id_private[4], id_private[5]));
         double var5 = Math.abs((double)((int)((cb_3)id_import.id_class[id_byte[54]]).re()) - ((cb_3)id_import.id_class[id_byte[55]]).re());
         boolean var7 = (var5 == id_private[6] || var5 == id_private[7]) && !var4 ? id_case[25] : id_case[26];
         boolean var8 = ((cb_3)id_import.id_class[id_byte[56]]).id_throws(iM_2.STANDING) && var1 ? id_case[27] : id_case[28];
         boolean var9 = !var4 && var1 ? id_case[29] : id_case[30];
         return !((cb_3)id_import.id_class[id_byte[57]]).Sy()
               && !((rhx_3)((cb_3)id_import.id_class[id_byte[58]]).id_implements[id_byte[59]]).id_break
               && !((cb_3)id_import.id_class[id_byte[60]]).id_break(rLD.id_goto)
               && !((cb_3)id_import.id_class[id_byte[61]]).id_break(rLD.id_package)
               && !((cb_3)id_import.id_class[id_byte[62]]).id_break(rLD.id_instanceof)
               && !((cb_3)id_import.id_class[id_byte[63]]).Pm()
               && !((cb_3)id_import.id_class[id_byte[64]]).o_()
               && !((cb_3)id_import.id_class[id_byte[65]]).Y()
               && !((cb_3)id_import.id_class[id_byte[66]]).Pe()
               && !((cb_3)id_import.id_class[id_byte[67]]).Py()
               && !var3
               && !var7
               && !var8
               && !var9
            ? id_case[31]
            : id_case[32];
      }
   }

   private static void id_implements() {
      id_case = new boolean[]{
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true
      };
   }

   private boolean id_new() {
      return ((cb_3)id_import.id_class[id_byte[105]]).id_break(rLD.id_protected)
            && ((cb_3)id_import.id_class[id_byte[106]]).id_byte(rLD.id_protected).id_byte() < id_protected[7]
         ? id_case[58]
         : id_case[59];
   }

   private static void id_package() {
      id_private = new double[]{-0.15233518685055708, 0.43152384527073195, 0.0548933470320776, 0.0, 0.1, 0.0, 0.125, 0.1875};
   }

   public long id_protected() {
      return (Long)this.id_break[id_byte[108]];
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[8];
         this.id_break[2] = 0L;
         this.id_break[3] = 0L;
         this.id_break[4] = false;
         this.id_break[5] = 0;
         this.id_break[6] = 0;
         this.id_break[7] = 0;
      }
   }

   private static void id_final() {
      id_catch = new float[]{Float.MAX_VALUE, 2.0F, 1.0F, 0.0F, 0.0F, 0.8F, 0.5F, 500.0F, 500.0F};
   }

   private static void id_volatile() {
      Object[] var0 = new Object[]{0.0F, 1};
      id_class = var0;
   }

   private static void id_native() {
      id_throws = new long[2];
   }
}
