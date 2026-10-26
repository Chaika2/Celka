package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ItemPhysics extends Module {
   private static float[] byte_;
   private static String[] protected_;
   public Object[] break_;
   private static boolean[] throws_;
   private static short[] catch_;

   public ItemPhysics() {
      super("Item Physics", "Реалистичная физика предметов", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.this_();
      rrIm_1 var5 = new rrIm_1("Скорость вращения", 5.0F, 2.0F, 7.0F, 0.1F);
      this.break_[0] = var5;
      this.class_((rrIm_1)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4334536060028415510L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1457275704;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, -33, -95, -124, 126, 86, -97, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      byte_ = new float[]{5.0F, 2.0F, 7.0F, 0.1F};
   }

   private static void else_() {
      protected_ = new String[]{new String("Item Physics"), new String("Реалистичная физика предметов"), new String("Скорость вращения")};
   }

   public float new_() {
      this.this_();
      return ((rrIm_1)this.break_[0]).byte_();
   }

   private static void return_() {
      throws_ = new boolean[]{true};
   }

   private static void super_() {
      catch_ = new short[]{2, 0, 0, 0};
   }
}
