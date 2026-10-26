package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ChestStealer extends Module {
   private static byte[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static String[] throws_;

   public ChestStealer() {
      super("Chest Stealer", "Автоматически забирает ресурсы\nиз сундука", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.else_();
      rrlY_2 var5 = new rrlY_2(this);
      this.break_[1] = var5;
      rrlY_2 var6 = (rrlY_2)this.break_[1];
      this.break_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new short[]{3, 1, 1, 0, 0};
   }

   @Override
   public void class_(boolean var1) {
      if (this.new_().aI_()) {
         super.class_(var1);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2245457121105690902L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 684768188;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, 22, -3, -64, 62, -2, 21, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      if (this.new_().aK_()) {
         super.throws_(var1);
      }
   }

   private static void continue_() {
      throws_ = new String[]{new String("Chest Stealer"), new String("Автоматически забирает ресурсы\nиз сундука")};
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   public rrTF<ChestStealer> new_() {
      this.else_();
      return (rrTF<ChestStealer>)this.break_[0];
   }

   private static void super_() {
      byte_ = new byte[]{2};
   }
}
