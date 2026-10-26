package celestial;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_extends<T> {
   public Object[] class_;
   private static String[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   public Class<T> byte_() {
      return (Class<T>)Pc_1.class_(this.throws_());
   }

   C_extends(T var1, Object var2) {
      this.case_();
      this.class_[3] = var1;
      if (var2 == null) {
         throw new IllegalArgumentException("Cannot determine value type class from null");
      } else {
         this.class_[0] = var2;
         this.class_[1] = var2;
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return Pd_1.byte_(this);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5238987723454656838L;
   }

   @Deprecated
   public T class_() {
      return (T)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1181783720;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, -20, -66, -87, -59, 24, 113, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_() {
      Object var5 = this.class_[1];
      this.class_[0] = var5;
   }

   public Type throws_() {
      return (Type)((Map)((C_private)this.class_[3]).Pj[2]).get(this);
   }

   private static void catch_() {
      protected_ = new short[]{3, 0, 1, 0, 2, 1, 0, 3, 2};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void implements_() {
      break_ = new String[]{new String("Cannot determine value type class from null")};
   }

   public String protected_() {
      return (String)this.class_[2];
   }

   private static void private_() {
      byte_ = new byte[]{4};
   }
}
