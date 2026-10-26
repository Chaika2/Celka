package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrvd_1 {
   ;
   private static byte[] bytesf24d96aa22ff35f08b8eb2172b2f28e7;
   private static boolean[] booleansf24d96aa22ff35f08b8eb2172b2f28e7;
   private static short[] shortsf24d96aa22ff35f08b8eb2172b2f28e7;
   public static Object[] staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7;
   public Object[] fieldsf24d96aa22ff35f08b8eb2172b2f28e7;
   private static String[] stringsf24d96aa22ff35f08b8eb2172b2f28e7;

   public void byte_() {
      ((Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).clear();
   }

   private rrvd_1() {
      this.catch_();
      HashSet var7 = new HashSet();
      this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[0] = var7;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{29, 85, -75, -98, -123, -117, 72, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1846215977;
   }

   public void class_(rrvs_1 var1) {
      ((Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).remove(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 972302310849659982L;
   }

   public Set<rrvs_1> class_() {
      return (Set<rrvs_1>)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[0];
   }

   public void break_(rrvs_1 var1) {
      ((Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).add(var1);
   }

   public boolean break_() {
      for (rrvs_1 var2 : (Set)this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]) {
         if (var2.aO_()) {
            return true;
         }
      }

      return booleansf24d96aa22ff35f08b8eb2172b2f28e7[1];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrvd_1(), null};
      var0[1] = new rrvd_1[]{(rrvd_1)var0[0]};
      staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7 = var0;
   }

   private static void finally_() {
      shortsf24d96aa22ff35f08b8eb2172b2f28e7 = new short[]{1, 0, 0, 0, 0, 0, 0, 0};
   }

   private void catch_() {
      if (this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7 == null) {
         this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7 = new Object[1];
         Object[] var1 = this.fieldsf24d96aa22ff35f08b8eb2172b2f28e7;
      }
   }

   private static void implements_() {
      booleansf24d96aa22ff35f08b8eb2172b2f28e7 = new boolean[]{true, false, true, false, false, false, true, true};
   }

   private static void protected_() {
      bytesf24d96aa22ff35f08b8eb2172b2f28e7 = new byte[]{2};
   }

   private static void private_() {
      stringsf24d96aa22ff35f08b8eb2172b2f28e7 = new String[]{new String("INSTANCE")};
   }
}
