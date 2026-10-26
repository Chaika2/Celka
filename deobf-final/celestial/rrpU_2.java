package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpU_2 extends rrpi_3 {
   private static float[] byte_;
   private static String[] protected_;
   private static short[] case_;
   private static byte[] catch_;
   private static boolean[] private_;
   public Object[] class_;
   public static Object[] break_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 55571599;
   }

   @Override
   public rdn_3 byte_() {
      return (rdn_3)break_[0];
   }

   public rrpU_2(HwHelper var1) {
      super(var1);
      this.package_();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.class_[0] = var6;
      Integer var7 = -1;
      this.class_[2] = var7;
      var1.class_(new GroupSetting("Стан", (rrIF)this.class_[0]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.package_();
      if (var1.break_() == ((rrIF)this.class_[0]).finally_().byte_()) {
         Boolean var6 = true;
         this.class_[1] = var6;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2079707073842102010L;
   }

   private int class_(int var1) {
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
         ((Ax_1)import_.class_[55])
            .class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1, ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_, rXa_1.SWAP);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         return var1;
      } else {
         return catch_[10];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, 30, 78, -10, -81, -102, -32, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.package_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.class_[1]) {
         HwHelper var2 = this.continue_();
         int var3 = this.break_();
         rrpa_3 var4 = this.break_(var3);
         switch (((int[])rrpe_3.class_[0])[var4.ordinal()]) {
            case 1:
               int var5 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.dQ);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.class_(var2, "стана", var6);
               this.extends_();
               return;
            case 2:
               this.extends_();
               return;
            default:
               if (var4 == (rrpa_3)rrpa_3.staticFields056fc31e671730e3aeb58e324ad8a234[0]) {
                  if ((Integer)this.class_[2] == -1) {
                     Integer var11 = this.class_(var3);
                     this.class_[2] = var11;
                  }

                  if ((Integer)this.class_[2] > 8) {
                     if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().P().super_()) {
                        rrfo_3.class_(rpm_3.MAIN_HAND);
                        ((Ax_1)import_.class_[55])
                           .class_(
                              ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_,
                              (Integer)this.class_[2],
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

   private int break_() {
      Predicate var1 = this.protected_();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = private_[4]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return catch_[15];
      }
   }

   private rrpa_3 break_(int var1) {
      if (var1 == -1) {
         return (rrpa_3)rrpa_3.staticFields056fc31e671730e3aeb58e324ad8a234[1];
      } else {
         return ((cb_3)import_.class_[57]).sK().class_(rdy_3.dQ)
            ? (rrpa_3)rrpa_3.staticFields056fc31e671730e3aeb58e324ad8a234[2]
            : (rrpa_3)rrpa_3.staticFields056fc31e671730e3aeb58e324ad8a234[0];
      }
   }

   @Override
   public rrIF throws_() {
      this.package_();
      return (rrIF)this.class_[0];
   }

   private static void finally_() {
      byte_ = new float[]{20.0F};
   }

   private void extends_() {
      this.package_();
      Boolean var5 = false;
      this.class_[1] = var5;
      Integer var6 = -1;
      this.class_[2] = var6;
   }

   private static void case_() {
      case_ = new short[]{
         0, 0, 2, 0, 0, 1, 0, 1, 0, 57, 0, 2, 2, 2, 0, 55, 57, 4, 2, 57, 1, 0, 1, 2, 1, 57, 2, 0, 57, 1, 55, 57, 4, 57, 1, 0, 0, 0, 57, 57, 57, 1
      };
   }

   private static void implements_() {
      protected_ = new String[]{new String("Активация"), new String("Стан"), new String("стана")};
   }

   private void package_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[1] = false;
         this.class_[2] = 0;
      }
   }

   @Override
   public Predicate<rdn_3> protected_() {
      return var0 -> rrjk_3.protected_(var0);
   }

   private static void private_() {
      catch_ = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 3, 2};
   }

   private static void final_() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.dQ, 1)};
      break_ = var0;
   }

   private static void native_() {
      private_ = new boolean[]{true, false, true, false, false, true, false, true, false, false, true};
   }

   @Override
   public boolean aK_() {
      this.extends_();
      return super.aK_();
   }
}
