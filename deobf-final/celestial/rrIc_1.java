package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIc_1 extends Setting<Boolean> implements rrtf_3<rrIk_1> {
   public Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] throws_;

   public rrIc_1(String var1, rrIk_1... var2) {
      super(var1, false);
      this.volatile_();
      rrIu_1 var7 = (rrIu_1)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[0];
      this.break_[1] = var7;
      this.class_[0] = var1;
      List var9 = Arrays.asList(var2);
      this.break_[0] = var9;
   }

   public rrIc_1(String var1, List<rrIk_1> var2) {
      super(var1, false);
      this.volatile_();
      rrIu_1 var7 = (rrIu_1)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[0];
      this.break_[1] = var7;
      this.class_[0] = var1;
      this.break_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -632115390;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8352234045539757421L;
   }

   @Override
   public List<rrIk_1> class_() {
      this.volatile_();
      return (List<rrIk_1>)this.break_[0];
   }

   public rrIc_1 class_(rrIu_1 var1) {
      this.volatile_();
      this.break_[1] = var1;
      return this;
   }

   @Override
   public Setting<?> break_() {
      return this;
   }

   public boolean finally_() {
      this.volatile_();
      return ((List)this.break_[0]).stream().anyMatch(rrIk_1::class_);
   }

   public rrIu_1 extends_() {
      this.volatile_();
      return (rrIu_1)this.break_[1];
   }

   private static void package_() {
      byte_ = new boolean[2];
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -84, -95, -57, -19, 123, -88, -25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void final_() {
      throws_ = new byte[]{2};
   }

   private void volatile_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void native_() {
      protected_ = new short[]{0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1};
   }
}
