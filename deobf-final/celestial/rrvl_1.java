package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.MutablePair;

public class rrvl_1<L, R> extends MutablePair<L, R> {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new byte[]{4};
   }

   public rrvl_1(L var1, R var2) {
      super(var1, var2);
      this.protected_();
      Consumer var7 = var0 -> {
      };
      this.class_[2] = var7;
      Consumer var8 = var0 -> {
      };
      this.class_[3] = var8;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7798686029607607053L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1051788039;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 100, -8, -29, 4, 64, 127, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(L var1, boolean var2) {
      super.setLeft(var1);
      if (var2 && this.class_[0] != var1) {
         ((Consumer)this.class_[2]).accept(var1);
      }

      this.class_[0] = var1;
   }

   public rrvl_1<L, R> class_(Consumer<R> var1) {
      this.class_[3] = var1;
      return this;
   }

   private static void class_() {
      protected_ = new boolean[]{true, true};
   }

   private static void break_() {
      byte_ = new short[]{2, 3, 0, 2, 0, 1, 3, 1, 2, 3};
   }

   public rrvl_1<L, R> break_(Consumer<L> var1) {
      this.class_[2] = var1;
      return this;
   }

   public void break_(R var1, boolean var2) {
      super.setRight(var1);
      if (var2 && this.class_[1] != var1) {
         ((Consumer)this.class_[3]).accept(var1);
      }

      this.class_[1] = var1;
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   public void setLeft(L var1) {
      this.class_((L)var1, true);
   }

   public void setRight(R var1) {
      this.break_((R)var1, true);
   }
}
