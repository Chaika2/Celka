package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvH<T> extends LinkedList<T> {
   private static short[] break_;
   private static boolean[] byte_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   public rrvH(int var1) {
      this.byte_();
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean add(T var1) {
      if (this.size() >= (Integer)this.class_[0]) {
         this.removeFirst();
      }

      return super.add(var1);
   }

   public int class_() {
      return (Integer)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 4, 88, 92, 120, 21, -96, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(int var1) {
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8543015812637597795L;
   }

   public boolean break_() {
      return this.size() >= this.class_[0] ? true : byte_[1];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1156335885;
   }

   private static void throws_() {
      break_ = new short[5];
   }

   private static void protected_() {
      byte_ = new boolean[]{true, false, true, false, false};
   }
}
