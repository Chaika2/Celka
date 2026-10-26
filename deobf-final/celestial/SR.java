package celestial;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SR implements C_return {
   private static byte[] break_;
   private static String[] byte_;
   private static short[] protected_;
   public Object[] class_;

   public void byte_() {
      C_class.interface_().execute(() -> ((SI)this.class_[0]).class_());
   }

   public SR(Path var1, rqM_2<rYB> var2) {
      this.protected_();
      this.class_[2] = var1;
      SI var8 = new SI(var1.resolve("cache"), var2);
      this.class_[0] = var8;
      Sg_1 var9 = new Sg_1(var1.resolve("waypoints"));
      this.class_[1] = var9;
      this.class_[3] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2793887877481915362L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 955201997;
   }

   @Override
   public C_synchronized class_() {
      return (Sg_1)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 105, 69, 117, 101, -126, 117, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public C_super break_() {
      return (SI)this.class_[0];
   }

   private static void throws_() {
      protected_ = new short[]{2, 0, 1, 3, 0, 1, 0};
   }

   private static void catch_() {
      break_ = new byte[]{4};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void private_() {
      byte_ = new String[]{new String("cache"), new String("waypoints")};
   }
}
