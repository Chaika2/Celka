package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryU extends rrpu_3 {
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] case_;
   private static float[] catch_;
   private static String[] private_;
   public static Object[] class_;
   public Object[] break_;
   private static long[] implements_;

   private int byte_(int var1) {
      this.implements_();
      if (var1 == -2) {
         rrfo_3.class_(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.class_(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.break_[2]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.break_();
         this.break_[4] = var6;
         return var1;
      } else {
         return byte_[11];
      }
   }

   @Override
   public rdn_3 byte_() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[6]).break_().class_();
   }

   private static void int_() {
      protected_ = new boolean[]{
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
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
         true
      };
   }

   public rryU(FtHelper var1) {
      super(var1);
      this.implements_();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.break_[0] = var6;
      rrIk_1 var7 = new rrIk_1("Только если есть плохие\nэффекты", true);
      this.break_[1] = var7;
      rrfP_2 var8 = new rrfP_2();
      this.break_[2] = var8;
      Integer var9 = -1;
      this.break_[5] = var9;
      var1.class_(new GroupSetting("Божья аура", (rrIF)this.break_[0], (rrIk_1)this.break_[1]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.implements_();
      if (var1.break_() == ((rrIF)this.break_[0]).finally_().byte_()) {
         Boolean var6 = true;
         this.break_[3] = var6;
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.implements_();
      ((rrfP_2)this.break_[2]).class_(var1);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -116, -27, 101, -117, 20, -9, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1066627591397802577L;
   }

   private rrye_1 class_(int var1) {
      this.implements_();
      if (var1 == -1) {
         return (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[1];
      } else if (((cb_3)import_.class_[57]).sK().class_(rdy_3.ko)) {
         return (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[2];
      } else {
         return ((rrIk_1)this.break_[1]).class_() && !this.case_() && this.final_()
            ? (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[3]
            : (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[0];
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.implements_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.break_[2]).class_(rqR_2.break_() - this.break_[4] > 300L ? true : protected_[5]);
         if ((Boolean)this.break_[3]) {
            FtHelper var2 = this.continue_();
            int var3 = this.break_();
            rrye_1 var4 = this.class_(var3);
            if (var4 == (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[2]) {
               int var5 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.ko);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.class_(var2, "божьей ауры", var6);
            } else if (var4 == (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[3]) {
               String var18 = rrfu_3.class_((Module)var2);
               String var20 = "Нет плохих эффектов, божья аура не будет использована";
               rrfu_3.byte_(var18 + var20);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var2.final_(), var20, 2000));
            } else if (var4 == (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[0]) {
               int var19 = this.byte_(var3);
               if (var19 > 8) {
                  Integer var11 = var19;
                  this.break_[5] = var11;
                  Integer var12 = 0;
                  this.break_[6] = var12;
               }
            }

            Boolean var13 = false;
            this.break_[3] = var13;
         }

         if ((Integer)this.break_[5] != -1) {
            byte var17 = !((cb_3)import_.class_[57]).sV() && !((cb_3)import_.class_[57]).sZ() ? byte_[4] : protected_[8];
            int var10002 = (Integer)this.break_[6] + 1;
            Integer var14 = var10002;
            this.break_[6] = var14;
            if (var10002 > var17) {
               ((Ax_1)import_.class_[55]).class_((Integer)this.break_[5]);
               Integer var15 = -1;
               this.break_[5] = var15;
               Integer var16 = 0;
               this.break_[6] = var16;
            }
         }
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 587777957;
   }

   public int break_() {
      Predicate var1 = this.protected_();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = protected_[12]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return byte_[16];
      }
   }

   @Override
   public rrIF throws_() {
      this.implements_();
      return (rrIF)this.break_[0];
   }

   private static void finally_() {
      catch_ = new float[]{20.0F};
   }

   private static void extends_() {
      Object[] var0 = new Object[]{
         List.of((rLR)rLD.protected_, (rLR)rLD.private_, (rLR)rLD.break_, (rLR)rLD.continue_, (rLR)rLD.package_, (rLR)rLD.goto_, (rLR)rLD.instanceof_)
      };
      class_ = var0;
   }

   private boolean case_() {
      for (rLY var2 : ((cb_3)import_.class_[57]).So()) {
         if (((List)class_[0]).contains(var2.class_())) {
            return true;
         }
      }

      return protected_[14];
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         this.break_[3] = false;
         this.break_[4] = 0L;
         this.break_[5] = 0;
         this.break_[6] = 0;
      }
   }

   private static void new_() {
      implements_ = new long[]{300L, 0L};
   }

   private static void package_() {
      private_ = new String[]{
         new String("Активация"),
         new String("Только если есть плохие\nэффекты"),
         new String("Божья аура"),
         new String("божьей ауры"),
         new String("Нет плохих эффектов, божья аура не будет использована"),
         new String("[★] Божья аура"),
         new String("godsaura"),
         new String("spooky-item")
      };
   }

   @Override
   public Predicate<rdn_3> protected_() {
      return var0 -> {
         if (var0.break_() != rdy_3.ko) {
            return false;
         } else {
            String var1 = var0.continue_().byte_();
            if (var1.equalsIgnoreCase("[★] Божья аура")) {
               return true;
            } else {
               return !var0.protected_("godsaura") && !var0.protected_("spooky-item") ? protected_[24] : protected_[23];
            }
         }
      };
   }

   private static void private_() {
      case_ = new short[]{
         0,
         0,
         1,
         2,
         5,
         0,
         1,
         0,
         3,
         2,
         0,
         2,
         4,
         3,
         2,
         57,
         3,
         0,
         2000,
         0,
         5,
         6,
         3,
         5,
         57,
         57,
         6,
         6,
         55,
         5,
         5,
         6,
         3,
         57,
         1,
         2,
         57,
         1,
         55,
         4,
         6,
         0,
         57,
         57,
         57,
         1,
         1,
         57,
         2,
         1,
         3,
         0,
         57,
         0,
         57
      };
   }

   private boolean final_() {
      boolean var1 = false;
      boolean var2 = false;

      for (rLY var4 : ((cb_3)import_.class_[57]).So()) {
         rLR var5 = var4.class_();
         if (var5 == rLD.throws_) {
            var1 = true;
         } else if (var5 == rLD.class_) {
            var2 = true;
         }

         if (var1 && var2) {
            return true;
         }
      }

      return protected_[20];
   }

   private static void native_() {
      byte_ = new byte[]{-1, 2, 8, -1, 2, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, -1, 7, 3, 4, 5, 6};
   }

   @Override
   public boolean aK_() {
      this.implements_();
      Boolean var5 = false;
      this.break_[3] = var5;
      return super.aK_();
   }
}
