package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Popka extends Module {
   private static short[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;
   public Object[] break_;
   private static byte[] catch_;

   public Popka() {
      super("Popka", ":D", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.this_();
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         this.break_[0] = 0;
         this.break_[1] = false;
      }
   }

   @EventTarget
   public void class_(rrAG var1) {
      this.this_();
      Integer var6 = 5;
      this.break_[0] = var6;
      Boolean var7 = true;
      this.break_[1] = var7;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7296016987662541885L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1135209048;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.this_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.break_[1]) {
         ((cb_3)import_.class_[57]).protected_("/warp huhu");
         Boolean var6 = false;
         this.break_[1] = var6;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 106, -79, -27, 19, 34, 92, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.this_();
      super.throws_(var1);
      Integer var6 = 0;
      this.break_[0] = var6;
      Boolean var7 = false;
      this.break_[1] = var7;
   }

   private static void continue_() {
      byte_ = new short[]{0, 0, 1, 0, 1, 57, 1, 0, 1};
   }

   private static void else_() {
      catch_ = new byte[]{5, 2};
   }

   private static void new_() {
      throws_ = new boolean[]{true, false, false, false, false, false, true, false};
   }

   private static void super_() {
      protected_ = new String[]{new String("Popka"), new String(":D"), new String("/warp huhu")};
   }
}
