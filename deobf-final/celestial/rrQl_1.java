package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQl_1 extends vm_3 {
   private static boolean[] throws_;
   private static byte[] case_;
   private static short[] catch_;
   private static int[] private_;
   public Object[] class_;
   private static String[] implements_;

   private static void int_() {
      throws_ = new boolean[]{true, false, false, false, false, false};
   }

   public rrQl_1(rrQC var1, vm_3 var2) {
      super(new rgn_3("gui.authme.method.title"));
      this.package_();
      Object var7 = null;
      this.class_[2] = var7;
      this.class_[1] = var2;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      catch_ = new short[]{2, 1, 0, 2, 0, 128, 128, 0, 128, 128, 0, 128, 128, 2, 2, 1, 0, 1, 0, 1, 0, 1};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4994430456756837262L;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.package_();
      this.class_(var1);
      this.super_.class_(var1, this.extends_, this.package_ / 2, this.int_ / 2 - 27, 16777215);
      if ((rgP_2)this.class_[2] != null) {
         this.super_.class_(var1, (rgP_2)this.class_[2], this.package_ / 2, this.int_ / 2 - 47, 10526880);
      }

      super.class_(var1, var2, var3, var4);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, 109, -80, 35, -110, 80, -46, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1804413931;
   }

   private static void finally_() {
      implements_ = new String[]{
         new String("gui.authme.method.title"),
         new String("gui.authme.method.greeting"),
         new String("gui.authme.method.button.microsoft"),
         new String("gui.authme.method.button.mojang"),
         new String("gui.authme.method.button.offline"),
         new String("gui.back"),
         new String("gui.authme.method.button.offline"),
         new String("gui.authme.method.button.mojang"),
         new String("gui.authme.method.button.microsoft")
      };
   }

   private void package_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void final_() {
      case_ = new byte[]{
         2, 20, 10, 4, 2, 5, 20, 20, 20, 2, 10, 2, 5, 20, 20, 20, 20, 2, 10, 4, 2, 5, 20, 20, 40, 20, 2, 50, 2, 27, 100, 20, 2, 2, 27, 2, 2, 47, 3
      };
   }

   @Override
   public void volatile_() {
      this.package_();
      super.volatile_();
      import_.break_((vm_3)this.class_[1]);
   }

   private static void native_() {
      private_ = new int[]{16777215, 10526880};
   }

   @Override
   public void v_() {
      this.package_();
      super.v_();
      rgn_3 var5 = new rgn_3("gui.authme.method.greeting", new rgN_2(rrQg_1.protected_().byte_()).class_(rgF_2.YELLOW));
      this.class_[2] = var5;
      this.class_(
         new Ll_1(
            this.package_ / 2 - 20 - 10 - 4,
            this.int_ / 2 - 5,
            20,
            20,
            0,
            0,
            20,
            (rqO_2)rrQI.class_[0],
            128,
            128,
            var1 -> {
               this.package_();
               import_.break_(new rrQy_1((rrQC)this.class_[0], this, (vm_3)this.class_[1]));
            },
            (var1, var2, var3, var4) -> this.class_(var2, new rgn_3("gui.authme.method.button.microsoft"), var3, var4),
            new rgn_3("gui.authme.method.button.microsoft")
         )
      );
      this.class_(new Ll_1(this.package_ / 2 - 10, this.int_ / 2 - 5, 20, 20, 20, 0, 20, (rqO_2)rrQI.class_[0], 128, 128, var1 -> {
         this.package_();
         import_.break_(new rrQp_1((rrQC)this.class_[0], this, (vm_3)this.class_[1]));
      }, (var1, var2, var3, var4) -> this.class_(var2, new rgn_3("gui.authme.method.button.mojang"), var3, var4), new rgn_3("gui.authme.method.button.mojang")));
      this.class_(
         new Ll_1(
            this.package_ / 2 + 10 + 4,
            this.int_ / 2 - 5,
            20,
            20,
            40,
            0,
            20,
            (rqO_2)rrQI.class_[0],
            128,
            128,
            var1 -> {
               this.package_();
               import_.break_(new rrQq_1((rrQC)this.class_[0], this, (vm_3)this.class_[1]));
            },
            (var1, var2, var3, var4) -> this.class_(var2, new rgn_3("gui.authme.method.button.offline"), var3, var4),
            new rgn_3("gui.authme.method.button.offline")
         )
      );
      this.class_((LF)(new LF(this.package_ / 2 - 50, this.int_ / 2 + 27, 100, 20, new rgn_3("gui.back"), var1 -> this.volatile_())));
   }
}
