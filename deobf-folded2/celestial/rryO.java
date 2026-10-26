package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryO {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static long[] id_protected;
   private static boolean[] id_throws;

   public boolean id_byte() {
      return (Boolean)this.id_class[3];
   }

   public rryO(rhd_3 var1, rdn_3 var2) {
      this.id_case();
      Long var7 = rqR_2.id_break();
      this.id_class[2] = var7;
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rryO var2 = (rryO)var1;
         return Objects.equals((rhd_3)this.id_class[0], (rhd_3)var2.id_class[0]);
      } else {
         return id_throws[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((rhd_3)this.id_class[0]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{56, -71, 19, -9, -88, -21, -87, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[3] = var6;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2026049751;
   }

   public rdn_3 id_class() {
      return (rdn_3)this.id_class[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4683044087926002858L;
   }

   public long id_break() {
      return (Long)this.id_class[2];
   }

   private static void id_throws() {
      id_break = new short[]{0, 0, 0, 0, 1, 2, 3, 2, 0, 1, 3};
   }

   private static void id_catch() {
      id_byte = new byte[]{4, 2, 3};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[2] = 0L;
         this.id_class[3] = false;
      }
   }

   private static void id_implements() {
      id_throws = new boolean[]{true, false, false};
   }

   public rhd_3 id_protected() {
      return (rhd_3)this.id_class[0];
   }

   private static void id_private() {
      id_protected = new long[1];
   }
}
