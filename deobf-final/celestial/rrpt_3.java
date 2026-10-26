package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpt_3 extends rrpi_3 {
   public static Object[] class_;
   private static float[] byte_;
   private static byte[] protected_;
   private static short[] case_;
   private static boolean[] catch_;
   private static String[] private_;
   public Object[] break_;

   private rrpI_2 byte_(int var1) {
      if (var1 == -1) {
         return (rrpI_2)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[1];
      } else {
         return ((cb_3)import_.class_[57]).sK().class_(rdy_3.Gu)
            ? (rrpI_2)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[2]
            : (rrpI_2)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[0];
      }
   }

   @Override
   public rdn_3 byte_() {
      return (rdn_3)class_[0];
   }

   public rrpt_3(HwHelper var1) {
      super(var1);
      this.break_();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.break_[0] = var6;
      Integer var7 = -1;
      this.break_[2] = var7;
      rrmi_3 var8 = new rrmi_3();
      this.break_[3] = var8;
      var1.class_(new GroupSetting("Рюкзак", (rrIF)this.break_[0]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.break_();
      if (var1.break_() == ((rrIF)this.break_[0]).finally_().byte_()) {
         Boolean var6 = true;
         this.break_[1] = var6;
      }
   }

   @EventTarget
   public void class_(rrFo_1 var1) {
      this.break_();
      if (var1.break_() instanceof Fc_1 var2 && var2.new_().byte_().contains("Рюкзак") && ((rrmi_3)this.break_[3]).class_()) {
         int var5 = ((rrmi_3)this.break_[3]).break_();
         int var4 = ((rrmi_3)this.break_[3]).class_(false, "backpack-inventory");
         if (var4 != -1) {
            ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var5, var4, rXa_1.SWAP);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         }

         ((rrmi_3)this.break_[3]).throws_();
      }
   }

   private int class_(int var1) {
      this.break_();
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
         if (!((rrmi_3)this.break_[3]).class_()) {
            rdn_3 var2 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var1);
            ((rrmi_3)this.break_[3]).class_(var2, var1);
         }

         ((Ax_1)import_.class_[55])
            .class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1, ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_, rXa_1.SWAP);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         return var1;
      } else {
         return protected_[11];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 46, 89, 56, -128, 35, -79, 92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3178665295994171469L;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.break_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.break_[1]) {
         HwHelper var2 = this.continue_();
         int var3 = this.implements_();
         rrpI_2 var4 = this.byte_(var3);
         switch (((int[])rrpw_3.class_[0])[var4.ordinal()]) {
            case 1:
               int var5 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.Gu);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.class_(var2, "рюкзака", var6);
               this.extends_();
               return;
            case 2:
               this.extends_();
               return;
            default:
               if (var4 == (rrpI_2)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[0]) {
                  if ((Integer)this.break_[2] == -1) {
                     Integer var11 = this.class_(var3);
                     this.break_[2] = var11;
                  }

                  if ((Integer)this.break_[2] > 8) {
                     if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().P().super_()) {
                        rrfo_3.class_(rpm_3.MAIN_HAND);
                        ((Ax_1)import_.class_[55])
                           .class_(
                              ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_,
                              (Integer)this.break_[2],
                              ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_,
                              rXa_1.SWAP
                           );
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
                        this.extends_();
                     }
                  } else {
                     this.extends_();
                  }
               }
         }
      }
   }

   private void break_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         this.break_[1] = false;
         this.break_[2] = 0;
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1608242230;
   }

   @Override
   public rrIF throws_() {
      this.break_();
      return (rrIF)this.break_[0];
   }

   private static void finally_() {
      case_ = new short[]{
         0,
         0,
         2,
         3,
         0,
         0,
         1,
         0,
         1,
         0,
         57,
         0,
         2,
         2,
         2,
         0,
         55,
         57,
         4,
         2,
         57,
         1,
         0,
         3,
         3,
         3,
         55,
         57,
         4,
         0,
         3,
         3,
         1,
         2,
         1,
         57,
         2,
         0,
         57,
         1,
         3,
         57,
         1,
         3,
         55,
         57,
         4,
         57,
         1,
         0,
         0,
         0,
         57,
         57,
         57,
         1
      };
   }

   private void extends_() {
      this.break_();
      Boolean var5 = false;
      this.break_[1] = var5;
      Integer var6 = -1;
      this.break_[2] = var6;
   }

   private static void case_() {
      catch_ = new boolean[]{true, false, true, false, true, false, false, false, true, false, true, false, false, true};
   }

   private int implements_() {
      Predicate var1 = this.protected_();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = catch_[7]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return protected_[16];
      }
   }

   private static void package_() {
      private_ = new String[]{new String("Активация"), new String("Рюкзак"), new String("рюкзака"), new String("Рюкзак"), new String("backpack-inventory")};
   }

   @Override
   public Predicate<rdn_3> protected_() {
      return var0 -> rrjk_3.throws_(var0);
   }

   private static void private_() {
      protected_ = new byte[]{-1, -1, 8, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 4, 2};
   }

   private static void final_() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.Gu, 1)};
      class_ = var0;
   }

   private static void native_() {
      byte_ = new float[]{20.0F};
   }

   @Override
   public boolean aK_() {
      this.break_();
      this.extends_();
      ((rrmi_3)this.break_[3]).throws_();
      return super.aK_();
   }
}
