package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFi_1 {
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   public static Object[] id_break;
   private static boolean[] id_throws;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrFi_1()};
      id_break = var0;
   }

   public rrFi_1() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   public static rrFi_1 id_class(rdn_3 var0, List<rLY> var1) {
      rrFi_1 var2 = id_break(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
      return var2;
   }

   public void id_class(List<rLY> var1) {
      this.id_class[1] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7763043736827534224L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, 83, -106, -100, -123, -95, -70, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1352340895;
   }

   public void id_class(rdn_3 var1) {
      this.id_class[0] = var1;
   }

   public rdn_3 id_class() {
      return (rdn_3)this.id_class[0];
   }

   private static rrFi_1 id_break(rdn_3 var0, List<rLY> var1) {
      ((rrFi_1)id_break[0]).id_class[0] = var0;
      ((rrFi_1)id_break[0]).id_class[1] = var1;
      return (rrFi_1)id_break[0];
   }

   public List<rLY> id_break() {
      return (List<rLY>)this.id_class[1];
   }

   private static void id_throws() {
      id_byte = new byte[]{2};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 1};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_throws = new boolean[]{false, true};
   }
}
