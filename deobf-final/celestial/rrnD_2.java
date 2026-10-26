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
   public static Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;
   private static long[] throws_;
   private static boolean[] case_;
   private static float[] catch_;
   public Object[] break_;
   private static double[] private_;

   public void byte_() {
      Integer var5 = 0;
      this.break_[5] = var5;
      Integer var6 = 0;
      this.break_[6] = var6;
   }

   private static void int_() {
      byte_ = new short[]{
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
      this.private_();
      this.break_[0] = var1;
      rrnU_2 var7 = new rrnU_2(var1);
      this.break_[1] = var7;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, 78, 39, 51, 26, 119, 78, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 636227653;
   }

   public boolean class_(AttackAura var1, float var2, int var3, boolean var4, boolean var5, int var6) {
      if (var1.continue_() == null) {
         return false;
      } else if (!var1.instanceof_().class_() && !var1.s()
         || !((cb_3)import_.class_[57]).sL()
         || ((cb_3)import_.class_[57]).sX().break_() == rdy_3.kN && ((AttackAura)this.break_[0]).double_().class_()) {
         if (var1.else_().class_() && C_throws.byte_().return_().class_()) {
            return false;
         } else if (!this.class_(var2, var3)) {
            return false;
         } else {
            return var1.public_().class_() ? this.class_(var4, var5, var6) : case_[46];
         }
      } else {
         return case_[43];
      }
   }

   public boolean class_(AttackAura var1) {
      return this.class_(var1, 0.5F, 0, true, true, 0);
   }

   public boolean class_(float var1, int var2) {
      if (!rrfo_3.class_(var1)) {
         return false;
      } else {
         return (float)(System.currentTimeMillis() - this.break_[2]) >= 500.0F - (float)var2 ? true : case_[49];
      }
   }

   public boolean class_(boolean var1, boolean var2, int var3) {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().t().new_()) {
         return true;
      } else if (var1 && !this.case_()) {
         return true;
      } else {
         if (var2) {
            double var4 = Math.abs((double)((int)((cb_3)import_.class_[57]).re()) - ((cb_3)import_.class_[57]).re());
            if (var4 == 0.43152384527073195) {
               Integer var12 = 2;
               this.break_[5] = var12;
            } else if (var4 == 0.0548933470320776) {
               Integer var13 = 3;
               this.break_[5] = var13;
            }
         }

         boolean var14;
         if (var3 > 0) {
            rrvy_1 var5 = new rrvy_1((cb_3)import_.class_[57]);
            var5.class_(var3);
            var14 = !var5.BL() && var5.throws_[31] > 0.0F ? true : case_[17];
         } else {
            var14 = !((cb_3)import_.class_[57]).BL() && ((cb_3)import_.class_[57]).throws_[31] > 0.0F ? true : case_[19];
         }

         rrne_3 var15 = ((AttackAura)this.break_[0]).for_();
         if (var15.break_() && var15.class_()) {
            rrvy_1 var6 = new rrvy_1((cb_3)import_.class_[57]);
            List var7 = var6.else_();
            if (var7.size() > 1) {
               return false;
            }
         }

         return var14;
      }
   }

   public boolean class_(iB_2 var1, rrTT var2) {
      if ((C_volatile)rrTT.break_[3] != var2) {
         return false;
      } else {
         float var3 = ((AttackAura)this.break_[0]).try_();
         if (var2.package_()) {
            an_3 var4 = Ph_1.class_(
               var1,
               ((cb_3)import_.class_[57]).new_(1.0F),
               var2.throws_(),
               var3,
               ((AttackAura)this.break_[0]).switch_().class_(),
               var1x -> !((AttackAura)this.break_[0]).P().class_(var1x) ? true : case_[61]
            );
            if (var4 != var1) {
               return false;
            }
         }

         boolean var18 = ((AttackAura)this.break_[0]).float_();
         if (rmD_2.break_ && this.case_()) {
            ((cb_3)import_.class_[57]).c_(false);
            if (var18) {
               if ((Integer)this.break_[6] == 0) {
                  Integer var11 = 1;
                  this.break_[6] = var11;
               }

               return case_[5];
            }

            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmD_2((cb_3)import_.class_[57], rmU_2.STOP_SPRINTING));
            Boolean var12 = true;
            this.break_[4] = var12;
         }

         if (((AttackAura)this.break_[0]).double_().class_() && ((cb_3)import_.class_[57]).sd()) {
            ((Ax_1)import_.class_[55]).break_((cb_3)import_.class_[57]);
         }

         ((Ax_1)import_.class_[55]).class_((cb_3)import_.class_[57], var1, true);
         if (var18 && rrjS_2.protected_()) {
            int var10002 = (Integer)this.break_[7] + 1;
            Integer var13 = var10002;
            this.break_[7] = var13;
            if (var10002 >= 1) {
               Integer var14 = 0;
               this.break_[7] = var14;
               Integer var15 = 1;
               this.break_[6] = var15;
            }
         }

         Long var16 = System.currentTimeMillis();
         this.break_[2] = var16;
         if (((AttackAura)this.break_[0]).this_().class_()) {
            this.class_(var1);
         }

         if (this.new_()) {
            int var5 = ((cb_3)import_.class_[57]).byte_(rLD.protected_).byte_() + 1;
            int var6 = var5 * 2 - var5 / 2;
            if (((cb_3)import_.class_[57]).rv().byte_ < -0.15233518685055708) {
               var6++;
            }

            Integer var17 = var6;
            this.break_[5] = var17;
         }

         return case_[13];
      }
   }

   public long class_() {
      return (Long)this.break_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6129004129455492945L;
   }

   private void class_(iB_2 var1) {
      if (var1 instanceof rhd_3 var2 && var1.extends_(2) && (!var2.native_() || !var2.implements_()) && rrfH_2.class_(var1, rdy_3.kN) != null) {
         int var3 = this.class_(var2, false);
         if (var3 > 8) {
            ((Ax_1)import_.class_[55]).class_(var3);
         }
      }
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.break_[4] = var6;
   }

   private int class_(iB_2 var1, boolean var2) {
      int var3 = rrfY_2.class_(rxM_2.class);
      if (var3 >= 0) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rme_3(var3));
         if (var2) {
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZq_1(var1, rpm_3.MAIN_HAND, false));
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmq_3(rpm_3.MAIN_HAND));
         } else {
            ((Ax_1)import_.class_[55]).break_((cb_3)import_.class_[57], var1, true);
         }

         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rme_3(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_));
         this.extends_();
         return var3;
      } else {
         int var4 = rrfY_2.class_(rxM_2.class, true);
         if (var4 >= 0) {
            ((Ax_1)import_.class_[55]).class_(var4);
            if (var2) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZq_1(var1, rpm_3.MAIN_HAND, false));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmq_3(rpm_3.MAIN_HAND));
            } else {
               ((Ax_1)import_.class_[55]).break_((cb_3)import_.class_[57], var1, true);
            }

            this.extends_();
            return var4;
         } else {
            return protected_[6];
         }
      }
   }

   public iB_2 class_(CheckGroup var1) {
      float var2 = ((AttackAura)this.break_[0]).G();
      Predicate var3 = var3x -> {
         if (var3x == null) {
            return false;
         } else if (var3x == ((cb_3)import_.class_[57]).ra()) {
            return false;
         } else if (var3x == (cb_3)import_.class_[57]) {
            return false;
         } else if (var3x.native_()) {
            return false;
         } else if (var3x instanceof rSY) {
            return false;
         } else if (!var3x.Pu()) {
            return false;
         } else {
            if (((AttackAura)this.break_[0]).throw_()) {
               if (((cb_3)import_.class_[57]).class_(var3x, iM_2.STANDING, var3x.Pb()) > (double)var2
                  && ((cb_3)import_.class_[57]).class_(var3x, iM_2.FALL_FLYING, iM_2.STANDING) > (double)var2) {
                  return false;
               }
            } else if (((cb_3)import_.class_[57]).class_(var3x, iM_2.STANDING, var3x.Pb()) > (double)var2
               && ((cb_3)import_.class_[57]).class_(var3x, iM_2.FALL_FLYING, var3x.Pb()) > (double)var2) {
               return false;
            }

            return rrff_3.class_(var3x, var1);
         }
      };
      iB_2 var4 = ((AttackAura)this.break_[0]).continue_();
      if (var3.test(var4)) {
         return var4;
      } else {
         Object var5;
         if (var2 == Float.MAX_VALUE) {
            ArrayList var6 = new ArrayList();
            ObjectIterator var7 = ((gm_3)import_.class_[56]).return_().values().iterator();

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
            var5 = ((gm_3)import_.class_[56]).class_(iB_2.class, ((cb_3)import_.class_[57]).rN().class_((double)(var2 * 2.0F)), var3);
         }

         var5.sort((Comparator)this.break_[1]);
         return var5.isEmpty() ? null : (iB_2)var5.get(0);
      }
   }

   public void class_(AttackAura var1, q_1 var2) {
      if (var2.class_() == var1.default_() && this.catch_()) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmD_2((cb_3)import_.class_[57], rmU_2.START_SPRINTING));
         ((cb_3)import_.class_[57]).c_(true);
         this.class_(false);
      }
   }

   public long break_() {
      return System.currentTimeMillis() - (Long)this.break_[2];
   }

   public boolean throws_() {
      if (((AttackAura)this.break_[0]).import_().class_()) {
         return true;
      } else {
         return ((cb_3)import_.class_[57]).break_(rLD.private_) ? true : case_[35];
      }
   }

   private static void finally_() {
      protected_ = new byte[]{2, 2, 2, 3, 2, 8, -1, 3, 8, 2, 3, 4, 5, 6, 7, 2};
   }

   public boolean catch_() {
      return (Boolean)this.break_[4];
   }

   private void extends_() {
      ((AttackAura)this.break_[0]).const_().class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
      Long var5 = System.currentTimeMillis();
      this.break_[3] = var5;
   }

   public boolean case_() {
      boolean var1 = ((cb_3)import_.class_[57]).BL();
      if (this.throws_() && !((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_ && var1) {
         return false;
      } else {
         float var2 = catch_[5];
         boolean var3 = ((cb_3)import_.class_[57]).PZ() && !((cb_3)import_.class_[57]).catch_(var2) ? true : case_[24];
         boolean var4 = ((gm_3)import_.class_[56]).break_(((cb_3)import_.class_[57]).rN().protected_(0.0, 0.1, 0.0));
         double var5 = Math.abs((double)((int)((cb_3)import_.class_[57]).re()) - ((cb_3)import_.class_[57]).re());
         boolean var7 = (var5 == 0.125 || var5 == 0.1875) && !var4 ? true : case_[26];
         boolean var8 = ((cb_3)import_.class_[57]).throws_(iM_2.STANDING) && var1 ? true : case_[28];
         boolean var9 = !var4 && var1 ? true : case_[30];
         return !((cb_3)import_.class_[57]).Sy()
               && !((rhx_3)((cb_3)import_.class_[57]).implements_[18]).break_
               && !((cb_3)import_.class_[57]).break_(rLD.goto_)
               && !((cb_3)import_.class_[57]).break_(rLD.package_)
               && !((cb_3)import_.class_[57]).break_(rLD.instanceof_)
               && !((cb_3)import_.class_[57]).Pm()
               && !((cb_3)import_.class_[57]).o_()
               && !((cb_3)import_.class_[57]).Y()
               && !((cb_3)import_.class_[57]).Pe()
               && !((cb_3)import_.class_[57]).Py()
               && !var3
               && !var7
               && !var8
               && !var9
            ? true
            : case_[32];
      }
   }

   private static void implements_() {
      case_ = new boolean[]{
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

   private boolean new_() {
      return ((cb_3)import_.class_[57]).break_(rLD.protected_) && ((cb_3)import_.class_[57]).byte_(rLD.protected_).byte_() < 3 ? true : case_[59];
   }

   private static void package_() {
      private_ = new double[]{-0.15233518685055708, 0.43152384527073195, 0.0548933470320776, 0.0, 0.1, 0.0, 0.125, 0.1875};
   }

   public long protected_() {
      return (Long)this.break_[3];
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[8];
         this.break_[2] = 0L;
         this.break_[3] = 0L;
         this.break_[4] = false;
         this.break_[5] = 0;
         this.break_[6] = 0;
         this.break_[7] = 0;
      }
   }

   private static void final_() {
      catch_ = new float[]{Float.MAX_VALUE, 2.0F, 1.0F, 0.0F, 0.0F, 0.8F, 0.5F, 500.0F, 500.0F};
   }

   private static void volatile_() {
      Object[] var0 = new Object[]{0.0F, 1};
      class_ = var0;
   }

   private static void native_() {
      throws_ = new long[2];
   }
}
