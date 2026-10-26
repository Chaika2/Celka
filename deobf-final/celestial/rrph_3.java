package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrph_3 extends rrpu_3 implements rrnF_2 {
   private static short[] break_;
   private static boolean[] byte_;
   private static long[] protected_;
   private static String[] case_;
   private static float[] catch_;
   public Object[] class_;
   private static byte[] private_;

   @Override
   public rdn_3 byte_() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[4]).break_().class_();
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -607669236;
   }

   private static void int_() {
      byte_ = new boolean[]{
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   public rrph_3(FtHelper var1) {
      super(var1);
      this.goto_();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.class_[0] = var6;
      rrTT var7 = new rrTT(this);
      this.class_[1] = var7;
      rrfP_2 var8 = new rrfP_2();
      this.class_[2] = var8;
      Integer var9 = -1;
      this.class_[6] = var9;
      var1.class_(new GroupSetting("Пласт", (rrIF)this.class_[0]));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new long[]{300L, 0L};
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.goto_();
      if (var1.break_() == ((rrIF)this.class_[0]).finally_().byte_()) {
         Boolean var6 = true;
         this.class_[3] = var6;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8866007168812045352L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, -52, 17, 120, -79, -110, -104, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.goto_();
      ((rrfP_2)this.class_[2]).class_(var1);
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.goto_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.class_[2]).class_(rqR_2.break_() - this.class_[4] > 300L ? true : byte_[4]);
         if ((Boolean)this.class_[3]) {
            FtHelper var2 = this.continue_();
            int var3 = this.package_();
            int var4 = this.final_();
            rrpJ_2 var5 = this.break_(var3);
            switch (((int[])rrpX_2.class_[0])[var5.ordinal()]) {
               case 1:
                  int var23 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.Jd);
                  float var7 = (float)var23 / 20.0F;
                  rrfu_3.class_(var2, "пласта", var7);
                  Boolean var12 = false;
                  this.class_[3] = var12;
                  return;
               case 2:
                  Boolean var13 = false;
                  this.class_[3] = var13;
                  return;
            }

            label50:
            if (var5 == (rrpJ_2)rrpJ_2.staticFields5c082363986d3091901b81d145e82889[0]) {
               if (var4 > 0) {
                  ((rrTT)this.class_[1])
                     .class_(
                        (rrTg_1)() -> new PX((Float)((cb_3)import_.class_[57]).break_[45], (Float)((cb_3)import_.class_[57]).break_[46]),
                        (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]
                     );
               }

               if (var4 != 0) {
                  int var10002 = (Integer)this.class_[5] + 1;
                  Integer var14 = var10002;
                  this.class_[5] = var14;
                  if (var10002 < var4) {
                     break label50;
                  }
               }

               int var6 = this.class_(var3);
               if (var6 > 8) {
                  Integer var15 = var6;
                  this.class_[6] = var15;
                  Integer var16 = 0;
                  this.class_[7] = var16;
               }

               if (var4 != 0) {
                  ((rrTT)this.class_[1]).final_();
                  ((rrTT)this.class_[1]).finally_();
               }

               Integer var17 = 0;
               this.class_[5] = var17;
               Boolean var18 = false;
               this.class_[3] = var18;
            }
         }

         if ((Integer)this.class_[6] != -1) {
            byte var22 = !((cb_3)import_.class_[57]).sV() && !((cb_3)import_.class_[57]).sZ() ? private_[3] : byte_[11];
            int var24 = (Integer)this.class_[7] + 1;
            Integer var19 = var24;
            this.class_[7] = var19;
            if (var24 > var22) {
               ((Ax_1)import_.class_[55]).class_((Integer)this.class_[6]);
               Integer var20 = -1;
               this.class_[6] = var20;
               Integer var21 = 0;
               this.class_[7] = var21;
            }
         }
      }
   }

   private int class_(int var1) {
      this.goto_();
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
         ((rrfP_2)this.class_[2]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.break_();
         this.class_[4] = var6;
         return var1;
      } else {
         return private_[12];
      }
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   private rrpJ_2 break_(int var1) {
      if (var1 == -1) {
         return (rrpJ_2)rrpJ_2.staticFields5c082363986d3091901b81d145e82889[1];
      } else {
         return ((cb_3)import_.class_[57]).sK().class_(rdy_3.Jd)
            ? (rrpJ_2)rrpJ_2.staticFields5c082363986d3091901b81d145e82889[2]
            : (rrpJ_2)rrpJ_2.staticFields5c082363986d3091901b81d145e82889[0];
      }
   }

   @Override
   public rrIF throws_() {
      this.goto_();
      return (rrIF)this.class_[0];
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private void goto_() {
      if (this.class_ == null) {
         this.class_ = new Object[8];
         this.class_[3] = false;
         this.class_[4] = 0L;
         this.class_[5] = 0;
         this.class_[6] = 0;
         this.class_[7] = 0;
      }
   }

   private static void else_() {
      catch_ = new float[]{20.0F, -1.0F, -1.0F};
   }

   private static void new_() {
      case_ = new String[]{
         new String("Активация"),
         new String("Пласт"),
         new String("пласта"),
         new String("[★] Пласт"),
         new String("[★] Новогодний пласт"),
         new String("stratum"),
         new String("christmasstratum"),
         new String("spooky-item")
      };
   }

   private int package_() {
      Predicate var1 = this.protected_();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = byte_[17]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return private_[18];
      }
   }

   private static void public_() {
      private_ = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, 2, -1, -2, -3, 45, -1, 8, 3, 4, 5, 6, 7};
   }

   @Override
   public Predicate<rdn_3> protected_() {
      return var0 -> {
         if (var0.break_() != rdy_3.Jd) {
            return false;
         } else {
            String var1 = var0.continue_().byte_();
            if (var1.equalsIgnoreCase("[★] Пласт") || var1.equalsIgnoreCase("[★] Новогодний пласт")) {
               return byte_[19];
            } else {
               return !var0.protected_("stratum") && !var0.protected_("christmasstratum") && !var0.protected_("spooky-item") ? byte_[21] : byte_[20];
            }
         }
      };
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   private int final_() {
      return (C_volatile)rrTT.break_[3] instanceof rrTT && ((C_volatile)rrTT.break_[3]).byte_() != null ? 2 : byte_[16];
   }

   private static void synchronized_() {
      break_ = new short[]{
         0,
         0,
         1,
         2,
         6,
         0,
         0,
         3,
         2,
         0,
         2,
         4,
         3,
         0,
         57,
         3,
         3,
         0,
         1,
         0,
         5,
         5,
         6,
         7,
         1,
         1,
         5,
         3,
         6,
         57,
         57,
         7,
         7,
         55,
         6,
         6,
         7,
         3,
         6,
         7,
         1,
         57,
         2,
         0,
         57,
         1,
         2,
         57,
         1,
         55,
         4,
         4,
         0,
         3,
         3,
         57,
         57,
         57,
         1,
         3,
         57,
         45,
         57,
         46
      };
   }

   @Override
   public boolean aK_() {
      this.goto_();
      Boolean var5 = false;
      this.class_[3] = var5;
      Integer var6 = -1;
      this.class_[6] = var6;
      Integer var7 = 0;
      this.class_[7] = var7;
      return super.aK_();
   }
}
