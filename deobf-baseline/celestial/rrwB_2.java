package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwB_2 implements rrtn_3 {
   private static float[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   public String id_byte() {
      return ((rrIk_1)this.id_class[id_byte[7]]).id_throws();
   }

   public rrwB_2(rrIk_1 var1) {
      this.id_finally();
      rruv_1 var6 = (rruv_1)rruv_1.id_class[id_byte[0]];
      this.id_class[id_byte[1]] = var6;
      this.id_class[id_byte[2]] = var1;
      AnimValue var8 = new AnimValue(id_break[0], id_protected[0]);
      this.id_class[id_byte[3]] = var8;
      AnimValue var9 = new AnimValue(id_break[1], id_protected[1]);
      this.id_class[id_byte[4]] = var9;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, 90, -111, -84, 38, 114, -11, -37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rruv_1 id_class() {
      return (rruv_1)this.id_class[id_byte[5]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -11779306;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2894118401006318794L;
   }

   public void id_class(rruv_1 var1) {
      this.id_class[id_byte[6]] = var1;
   }

   public AnimValue id_break() {
      return (AnimValue)this.id_class[id_byte[10]];
   }

   public AnimValue id_throws() {
      return (AnimValue)this.id_class[id_byte[11]];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_break = new float[]{0.3F, 0.6F};
   }

   private static void id_extends() {
      id_byte = new short[]{0, 3, 0, 1, 2, 3, 3, 0, 0, 0, 1, 2};
   }

   public rrIk_1 id_case() {
      return (rrIk_1)this.id_class[id_byte[9]];
   }

   private static void id_implements() {
      id_throws = new byte[]{4};
   }

   public boolean id_protected() {
      return ((rrIk_1)this.id_class[id_byte[8]]).id_class();
   }

   private static void id_private() {
      id_protected = new boolean[2];
   }
}
