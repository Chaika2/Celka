package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlM_2 extends rrTF<Spider> implements rrnF_2 {
   private static byte[] break_;
   private static double[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static String[] case_;
   private static boolean[] catch_;
   private static float[] private_;

   private static void int_() {
      break_ = new byte[]{-1, -2, -3, 9, -2, -3, -1, 2};
   }

   public rrlM_2(Spider var1) {
      super(var1);
      this.return_();
      rrTT var6 = new rrTT(this);
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      case_ = new String[]{new String("Не найдено блоков в хотбаре!")};
   }

   private void class_(rff_3 var1, rpm_3 var2, int var3) {
      rdH_2 var4 = new rdH_2((cb_3)import_.class_[57], var2, var1);
      rdn_3 var5;
      if (var3 == -2) {
         var5 = ((cb_3)import_.class_[57]).ss();
      } else if (var3 == -3) {
         var5 = ((cb_3)import_.class_[57]).Sn();
      } else {
         var5 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var3);
      }

      ryZ_2 var6 = var5.class_(var4);
      if (var6.break_()) {
         ((Ax_1)import_.class_[55]).break_((cb_3)import_.class_[57], (gm_3)import_.class_[56], var2, var1);
         ((cb_3)import_.class_[57]).class_(var2);
      }
   }

   private void class_(rff_3 var1, int var2) {
      int var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
      if (var2 == -2) {
         this.class_(var1, rpm_3.MAIN_HAND, var2);
      } else if (var2 == -3) {
         this.class_(var1, rpm_3.OFF_HAND, var2);
      } else {
         if (var2 >= 0 && var2 < 9) {
            ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var2;
            this.class_(var1, rpm_3.MAIN_HAND, var2);
            ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var3;
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, -80, -12, 107, 79, -15, -98, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7425507069312152563L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2037179714;
   }

   @EventTarget
   public void class_(rrAO var1) {
      this.return_();
      if ((Boolean)this.class_[1]) {
         var1.catch_(true);
         var1.protected_(false);
         var1.byte_(false);
         var1.throws_(false);
         var1.case_(false);
         Boolean var6 = false;
         this.class_[1] = var6;
      }
   }

   @EventTarget(
      id_class = 100
   )
   public void class_(q_1 var1) {
      this.return_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         PX var2 = new PX((Float)((cb_3)import_.class_[57]).throws_[15], 81.0F);
         ((rrTT)this.class_[0]).class_((rrTg_1)() -> var2, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         if (((cb_3)import_.class_[57]).BL()) {
            ((cb_3)import_.class_[57]).sl();
         }

         if (!((cb_3)import_.class_[57]).z().break_(var2, 0.05F)) {
            return;
         }

         int var3 = rrfY_2.class_(catch_[0]);
         if (var3 == -1) {
            return;
         }

         if (!((gm_3)import_.class_[56]).finally_(((cb_3)import_.class_[57]).Bs())
            && ((Ax_1)import_.class_[55]).class_(((cb_3)import_.class_[57]).Bs(), rpr_3.UP, true)) {
            ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND);
         }

         rjG_2 var5 = (rjG_2)import_.class_[64];
         if (!(var5 instanceof rff_3 var4)) {
            return;
         }

         if (((gm_3)import_.class_[56]).finally_(var4.class_())) {
            return;
         }

         if (((cb_3)import_.class_[57]).rv().byte_ < 0.0) {
            Boolean var10 = true;
            this.class_[1] = var10;
            if (rmD_2.byte_) {
               this.class_(var4, var3);
            }
         }
      }
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private static void else_() {
      byte_ = new double[1];
   }

   private void new_() {
      Spider var1 = this.continue_();
      String var2 = "Не найдено блоков в хотбаре!";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var1.final_(), var2, 2000));
      rrfu_3.byte_(rrfu_3.class_((Module)var1) + var2);
   }

   private static void package_() {
      protected_ = new short[]{
         0,
         0,
         57,
         15,
         0,
         0,
         57,
         57,
         57,
         56,
         57,
         55,
         57,
         57,
         64,
         56,
         57,
         1,
         1,
         1,
         57,
         1,
         57,
         1,
         57,
         1,
         57,
         57,
         57,
         57,
         1,
         55,
         57,
         56,
         57,
         57,
         56,
         0,
         0,
         0,
         2000,
         3
      };
   }

   private void return_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = false;
      }
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   private static void final_() {
      private_ = new float[]{81.0F, 0.05F, -1.0F, -1.0F};
   }

   private static void synchronized_() {
      catch_ = new boolean[]{true, true, true, true, false, false, false, false, false, false, true, false, true, false};
   }

   @Override
   public boolean aI_() {
      if ((cb_3)import_.class_[57] != null && (gm_3)import_.class_[56] != null) {
         int var1 = rrfY_2.class_(catch_[10]);
         if (var1 == -1) {
            this.new_();
            this.continue_().volatile_();
            return false;
         } else {
            return super.aI_();
         }
      } else {
         return catch_[9];
      }
   }

   @Override
   public boolean aK_() {
      this.return_();
      ((rrTT)this.class_[0]).final_();
      ((rrTT)this.class_[0]).finally_();
      return super.aK_();
   }
}
