package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ra_3 {
   private static boolean[] break_;
   private static String[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private static void byte_() {
      break_ = new boolean[]{false, true, false, false, true, false, false, true, false, true, false, true};
   }

   public ra_3(String... var1) {
      this.throws_();
      re_3[] var6 = Stream.of(var1).map(re_3::new).toArray(re_3[]::new);
      this.class_[0] = var6;
   }

   public ra_3(re_3... var1) {
      this.throws_();
      this.class_[0] = var1;
   }

   public ra_3(xd_3... var1) {
      this.throws_();
      re_3[] var6 = Stream.of(var1).map(re_3::new).toArray(re_3[]::new);
      this.class_[0] = var6;
   }

   public ra_3(List<xd_3> var1) {
      this.throws_();
      re_3[] var6 = var1.stream().map(re_3::new).toArray(re_3[]::new);
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return String.format("BlockOptionalMetaLookup{%s}", Arrays.toString((Object[])((re_3[])this.class_[0])));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-41, -124, 86, -43, -5, -17, 3, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_(rdn_3 var1) {
      for (re_3 var5 : (re_3[])this.class_[0]) {
         if (var5.class_(var1)) {
            return true;
         }
      }

      return break_[8];
   }

   public boolean class_(xd_3 var1) {
      for (re_3 var5 : (re_3[])this.class_[0]) {
         if (var5.break_() == var1) {
            return true;
         }
      }

      return break_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4742755953535799966L;
   }

   public boolean class_(xc_3 var1) {
      for (re_3 var5 : (re_3[])this.class_[0]) {
         if (var5.class_(var1)) {
            return true;
         }
      }

      return break_[5];
   }

   public List<re_3> class_() {
      return Arrays.asList((re_3[])this.class_[0]);
   }

   private static void break_() {
      protected_ = new short[9];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new String[]{new String("BlockOptionalMetaLookup{%s}")};
   }

   private static int protected_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1332649330;
   }
}
