package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQj_1 {
   private static String[] stringsc4090a7bea7631ca9c84243abffd0bdb;
   public Object[] fieldsc4090a7bea7631ca9c84243abffd0bdb;
   private static boolean[] booleansc4090a7bea7631ca9c84243abffd0bdb;
   public static Object[] staticFieldsc4090a7bea7631ca9c84243abffd0bdb;
   private static byte[] bytesc4090a7bea7631ca9c84243abffd0bdb;
   private static short[] shortsc4090a7bea7631ca9c84243abffd0bdb;

   private static void id_byte() {
      Object[] var0 = new Object[]{
         new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[1]),
         new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[3]),
         new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[5]),
         new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[7]),
         new rrQj_1(stringsc4090a7bea7631ca9c84243abffd0bdb[9]),
         null
      };
      var0[5] = new rrQj_1[]{(rrQj_1)var0[0], (rrQj_1)var0[1], (rrQj_1)var0[2], (rrQj_1)var0[3], (rrQj_1)var0[4]};
      staticFieldsc4090a7bea7631ca9c84243abffd0bdb = var0;
   }

   private rrQj_1(String var3) {
      this.id_catch();
      this.fieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[1]] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return (String)this.fieldsc4090a7bea7631ca9c84243abffd0bdb[shortsc4090a7bea7631ca9c84243abffd0bdb[2]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 313885760;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3796095332915847806L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{2, 23, 32, -4, 53, 74, -31, 106}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      bytesc4090a7bea7631ca9c84243abffd0bdb = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_throws() {
      shortsc4090a7bea7631ca9c84243abffd0bdb = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private void id_catch() {
      if (this.fieldsc4090a7bea7631ca9c84243abffd0bdb == null) {
         this.fieldsc4090a7bea7631ca9c84243abffd0bdb = new Object[booleansc4090a7bea7631ca9c84243abffd0bdb[6]];
         Object[] var1 = this.fieldsc4090a7bea7631ca9c84243abffd0bdb;
      }
   }

   private static void id_case() {
      stringsc4090a7bea7631ca9c84243abffd0bdb = new String[]{
         new String("DEFAULT"),
         new String(""),
         new String("SELECT_ACCOUNT"),
         new String("select_account"),
         new String("LOGIN"),
         new String("login"),
         new String("NONE"),
         new String("none"),
         new String("CONSENT"),
         new String("consent")
      };
   }

   private static void id_protected() {
      booleansc4090a7bea7631ca9c84243abffd0bdb = new boolean[]{false, true, false, false, true, true, true};
   }
}
