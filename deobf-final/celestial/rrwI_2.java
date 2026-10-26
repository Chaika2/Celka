package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwI_2 {
   public Object[] case_;
   private static boolean[] class_;
   private static short[] break_;

   public rrwI_2() {
      this.catch_();
      ArrayList var5 = new ArrayList();
      this.case_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public List<Setting<?>> b() {
      return (List<Setting<?>>)this.case_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1914629133;
   }

   public <T extends Setting<?>> T class_(T var1) {
      ((List)this.case_[0]).add(var1);
      return (T)var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8949400235690979340L;
   }

   public void class_(Setting<?>... var1) {
      ((List)this.case_[0]).addAll(Arrays.asList(var1));
   }

   public <T extends Setting<?>> T throws_(String var1) {
      for (Setting var3 : (List)this.case_[0]) {
         if (var3.throws_().equalsIgnoreCase(var1.toLowerCase())) {
            return (T)var3;
         }
      }

      return null;
   }

   private void catch_() {
      if (this.case_ == null) {
         this.case_ = new Object[1];
         Object[] var1 = this.case_;
      }
   }

   public static String case_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, -39, -18, -114, -61, -87, 107, 97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void private_() {
      class_ = new boolean[]{true};
   }

   private static void volatile_() {
      break_ = new short[5];
   }

   public abstract String synchronized_();
}
