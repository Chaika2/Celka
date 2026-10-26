package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTF<T> implements MinecraftAccessor {
   private static short[] class_;
   public Object[] throws_;
   private static boolean[] break_;

   public rrTF(T var1) {
      this.package_();
      this.throws_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -860454532;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1160207334969593820L;
   }

   public static String throws_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{28, -17, 37, -115, -115, 77, 69, -121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public T continue_() {
      return (T)this.throws_[0];
   }

   private void package_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[1];
      }
   }

   public void super_() {
   }

   private static void private_() {
      break_ = new boolean[]{true, true, true};
   }

   private static void final_() {
      class_ = new short[4];
   }

   public boolean aI_() {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().break_(this);
      return true;
   }

   public boolean aK_() {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().byte_(this);
      return true;
   }
}
