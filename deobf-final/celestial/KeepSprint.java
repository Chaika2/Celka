package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class KeepSprint extends Module {
   private static boolean[] byte_;
   private static String[] protected_;
   private static short[] throws_;
   private static byte[] catch_;
   public Object[] break_;

   public KeepSprint() {
      super("Keep Sprint", "Не дает сбросить спринт при\nударе", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.this_();
      rrIQ var5 = new rrIQ("Режим", "Vanilla", "Vanilla", "SpookyTime");
      this.break_[0] = var5;
      this.class_((rrIQ)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 552228411;
   }

   @EventTarget
   public void class_(rrFt_1 var1) {
      this.this_();
      String var2 = ((rrIQ)this.break_[0]).byte_();
      if (var2.equals("Vanilla")) {
         var1.class_(true);
      } else if (var2.equals("SpookyTime")) {
         var1.break_(true);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2347592205399617715L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, -125, -122, 114, 6, -96, 59, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      protected_ = new String[]{
         new String("Keep Sprint"),
         new String("Не дает сбросить спринт при\nударе"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("SpookyTime"),
         new String("Vanilla"),
         new String("SpookyTime")
      };
   }

   private static void else_() {
      byte_ = new boolean[]{false, true, true, true, true};
   }

   private static void new_() {
      catch_ = new byte[]{2};
   }

   private static void super_() {
      throws_ = new short[4];
   }
}
