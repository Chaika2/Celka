package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ra_3 {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new boolean[]{false, true, false, false, true, false, false, true, false, true, false, true};
   }

   public ra_3(String... var1) {
      this.id_throws();
      re_3[] var6 = Stream.of(var1).map(re_3::new).toArray(re_3[]::new);
      this.id_class[id_protected[3]] = var6;
   }

   public ra_3(re_3... var1) {
      this.id_throws();
      this.id_class[id_protected[0]] = var1;
   }

   public ra_3(xd_3... var1) {
      this.id_throws();
      re_3[] var6 = Stream.of(var1).map(re_3::new).toArray(re_3[]::new);
      this.id_class[id_protected[1]] = var6;
   }

   public ra_3(List<xd_3> var1) {
      this.id_throws();
      re_3[] var6 = var1.stream().map(re_3::new).toArray(re_3[]::new);
      this.id_class[id_protected[2]] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      String var10000 = id_byte[0];
      Object[] var10001 = new Object[1];
      var10001[id_break[10]] = Arrays.toString((Object[])((re_3[])this.id_class[id_protected[8]]));
      return String.format(var10000, var10001);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-41, -124, 86, -43, -5, -17, 3, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class(rdn_3 var1) {
      re_3[] var2 = (re_3[])this.id_class[id_protected[6]];
      int var3 = var2.length;

      for (int var4 = id_break[6]; var4 < var3; var4++) {
         re_3 var5 = var2[var4];
         if (var5.id_class(var1)) {
            return true;
         }
      }

      return id_break[8];
   }

   public boolean id_class(xd_3 var1) {
      re_3[] var2 = (re_3[])this.id_class[id_protected[4]];
      int var3 = var2.length;

      for (int var4 = id_break[0]; var4 < var3; var4++) {
         re_3 var5 = var2[var4];
         if (var5.id_break() == var1) {
            return true;
         }
      }

      return id_break[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4742755953535799966L;
   }

   public boolean id_class(xc_3 var1) {
      re_3[] var2 = (re_3[])this.id_class[id_protected[5]];
      int var3 = var2.length;

      for (int var4 = id_break[3]; var4 < var3; var4++) {
         re_3 var5 = var2[var4];
         if (var5.id_class(var1)) {
            return true;
         }
      }

      return id_break[5];
   }

   public List<re_3> id_class() {
      return Arrays.asList((re_3[])this.id_class[id_protected[7]]);
   }

   private static void id_break() {
      id_protected = new short[9];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new String[]{new String("BlockOptionalMetaLookup{%s}")};
   }

   private static int id_protected(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1332649330;
   }
}
