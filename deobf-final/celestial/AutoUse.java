package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoUse extends Module {
   private static boolean[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static String[] throws_;

   public AutoUse() {
      super("Auto Use", "Автоматически использует\nпредметы в нужный момент", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.super_();
      ArrayList var5 = new ArrayList();
      this.break_[0] = var5;
      this.break_(new rrlV_2(this));
      this.break_(new rrlf_3(this));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new boolean[]{true, false, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -834626668;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6804091756383992238L;
   }

   @Override
   public void class_(boolean var1) {
      this.super_();

      for (rrlg_3 var3 : (List)this.break_[0]) {
         var3.aI_();
      }

      super.class_(var1);
   }

   public boolean class_(rrlg_3 var1) {
      this.super_();

      for (rrlg_3 var3 : (List)this.break_[0]) {
         if (var1 != var3 && !var3.throws_()) {
            return true;
         }
      }

      return byte_[1];
   }

   @EventTarget
   public void class_(j_1 var1) {
      this.super_();
      if (var1.class_() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]) {
         for (rrlg_3 var3 : (List)this.break_[0]) {
            var3.protected_();
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -127, -76, 15, -16, -5, -123, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public <T extends rrlg_3> void break_(T var1) {
      this.super_();
      ((List)this.break_[0]).add(var1);
   }

   @Override
   public void throws_(boolean var1) {
      this.super_();

      for (rrlg_3 var3 : (List)this.break_[0]) {
         var3.aK_();
         var3.protected_();
      }

      super.throws_(var1);
   }

   private static void continue_() {
      throws_ = new String[]{new String("Auto Use"), new String("Автоматически использует\nпредметы в нужный момент")};
   }

   private static void new_() {
      protected_ = new short[]{3, 0, 0, 0, 0, 0, 0, 0};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }
}
