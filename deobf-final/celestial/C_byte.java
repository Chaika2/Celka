package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_byte implements C_catch {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;

   @Override
   public C_char byte_() {
      return (SK)SK.staticFields84fbf20de4d13027acc13a6866788039[0];
   }

   public C_byte() {
      this.finally_();
      C_class var5 = new C_class();
      this.class_[0] = var5;
      List var6 = Collections.singletonList((C_class)this.class_[0]);
      this.class_[1] = var6;
      new SD((C_class)this.class_[0]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3369204341062574843L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -91, 43, -77, 114, 122, -2, 81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1145238131;
   }

   @Override
   public rt_3 class_() {
      return (MG)MG.staticFields4592673f607b3ff2b69d116fa51286d2[0];
   }

   @Override
   public C_case break_() {
      return (C_class)this.class_[0];
   }

   @Override
   public C_goto throws_() {
      return (So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[0];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void extends_() {
      byte_ = new short[]{0, 0, 1, 0, 0, 1, 0, 0, 0, 0};
   }

   @Override
   public List<C_case> case_() {
      return (List<C_case>)this.class_[1];
   }

   private static void implements_() {
      break_ = new byte[]{2};
   }

   public C_class protected_() {
      return (C_class)this.class_[0];
   }
}
