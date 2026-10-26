package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpx_3 extends rrpu_3 {
   private static String[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] case_;
   private static long[] catch_;
   private static float[] private_;
   public Object[] class_;

   @Override
   public rdn_3 byte_() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[5]).break_().class_();
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -329871552;
   }

   public rrpx_3(FtHelper var1) {
      super(var1);
      this.finally_();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.class_[0] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.class_[1] = var7;
      Integer var8 = -1;
      this.class_[4] = var8;
      var1.class_(new GroupSetting("Трапка", (rrIF)this.class_[0]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.finally_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.class_[1]).class_(rqR_2.break_() - this.class_[3] > 300L ? true : byte_[4]);
         if ((Boolean)this.class_[2]) {
            FtHelper var2 = this.continue_();
            int var3 = this.extends_();
            rrpd_3 var4 = this.break_(var3);
            if (var4 == (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[2]) {
               int var5 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.OW);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.class_(var2, "трапки", var6);
            } else if (var4 == (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[0]) {
               int var18 = this.class_(var3);
               if (var18 > 8) {
                  Integer var11 = var18;
                  this.class_[4] = var11;
                  Integer var12 = 0;
                  this.class_[5] = var12;
               }
            }

            Boolean var13 = false;
            this.class_[2] = var13;
         }

         if ((Integer)this.class_[4] != -1) {
            byte var17 = !((cb_3)import_.class_[57]).sV() && !((cb_3)import_.class_[57]).sZ() ? case_[3] : byte_[7];
            int var10002 = (Integer)this.class_[5] + 1;
            Integer var14 = var10002;
            this.class_[5] = var14;
            if (var10002 > var17) {
               ((Ax_1)import_.class_[55]).class_((Integer)this.class_[4]);
               Integer var15 = -1;
               this.class_[4] = var15;
               Integer var16 = 0;
               this.class_[5] = var16;
            }
         }
      }
   }

   private void class_(rpm_3 var1) {
      boolean var2 = ((cb_3)import_.class_[57]).boolean_();
      if (var2) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rmD_2((cb_3)import_.class_[57], rmU_2.RELEASE_SHIFT_KEY));
      }

      rrfo_3.class_(var1);
      if (var2) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rmD_2((cb_3)import_.class_[57], rmU_2.PRESS_SHIFT_KEY));
      }
   }

   private int class_(int var1) {
      this.finally_();
      if (var1 == -2) {
         this.class_(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         this.class_(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.class_(var1);
         this.class_(rpm_3.MAIN_HAND);
         rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.class_[1]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         this.class_(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.break_();
         this.class_[3] = var6;
         return var1;
      } else {
         return case_[12];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3348930223001861781L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{42, 20, 116, -54, -88, -4, -98, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.finally_();
      if (var1.break_() == ((rrIF)this.class_[0]).finally_().byte_()) {
         Boolean var6 = true;
         this.class_[2] = var6;
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.finally_();
      ((rrfP_2)this.class_[1]).class_(var1);
   }

   private rrpd_3 break_(int var1) {
      if (var1 == -1) {
         return (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[1];
      } else {
         return ((cb_3)import_.class_[57]).sK().class_(rdy_3.OW)
            ? (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[2]
            : (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[0];
      }
   }

   private static void break_() {
      case_ = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
   }

   @Override
   public rrIF throws_() {
      this.finally_();
      return (rrIF)this.class_[0];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[2] = false;
         this.class_[3] = 0L;
         this.class_[4] = 0;
         this.class_[5] = 0;
      }
   }

   private int extends_() {
      Predicate var1 = this.protected_();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = byte_[12]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return case_[17];
      }
   }

   private static void case_() {
      protected_ = new short[]{
         0,
         0,
         1,
         4,
         0,
         0,
         2,
         1,
         0,
         1,
         3,
         2,
         2,
         57,
         0,
         4,
         5,
         2,
         4,
         57,
         57,
         5,
         5,
         55,
         4,
         4,
         5,
         2,
         4,
         5,
         1,
         57,
         2,
         0,
         57,
         1,
         1,
         57,
         1,
         55,
         3,
         5,
         0,
         57,
         57,
         57,
         1,
         57,
         57,
         0,
         57,
         57,
         0,
         57
      };
   }

   private static void implements_() {
      byte_ = new boolean[]{
         true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false
      };
   }

   @Override
   public Predicate<rdn_3> protected_() {
      return var0 -> {
         if (var0.break_() != rdy_3.OW) {
            return false;
         } else {
            String var1 = var0.continue_().byte_();
            if (var1.equalsIgnoreCase("[★] Трапка") || var1.equalsIgnoreCase("[★] Новогодняя ловушка")) {
               return byte_[14];
            } else {
               return !var0.protected_("trap") && !var0.protected_("christmastrap") && !var0.protected_("spooky-item") ? byte_[16] : byte_[15];
            }
         }
      };
   }

   private static void private_() {
      private_ = new float[]{20.0F};
   }

   private static void final_() {
      catch_ = new long[]{300L, 0L};
   }

   private static void native_() {
      break_ = new String[]{
         new String("Активация"),
         new String("Трапка"),
         new String("трапки"),
         new String("[★] Трапка"),
         new String("[★] Новогодняя ловушка"),
         new String("trap"),
         new String("christmastrap"),
         new String("spooky-item")
      };
   }

   @Override
   public boolean aK_() {
      this.finally_();
      Boolean var5 = false;
      this.class_[2] = var5;
      Integer var6 = -1;
      this.class_[4] = var6;
      Integer var7 = 0;
      this.class_[5] = var7;
      return super.aK_();
   }
}
