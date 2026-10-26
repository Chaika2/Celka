package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrns_3 extends Om_1 {
   private static float[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_case;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 511789574;
   }

   public rrns_3() {
      this.id_final();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8309499739747166358L;
   }

   public static rrns_3 id_class(Fu_1<?> var0, List<rJY> var1, String var2, float var3, float var4, int var5, int var6) {
      ((rrns_3)id_break[id_case[0]]).id_class[id_case[1]] = var0;
      ((rrns_3)id_break[id_case[2]]).id_class[1] = var1;
      ((rrns_3)id_break[id_case[4]]).id_class[2] = var2;
      rrns_3 var10000 = (rrns_3)id_break[id_case[6]];
      Float var14 = var3;
      var10000.id_class[3] = var14;
      var10000 = (rrns_3)id_break[id_case[8]];
      Float var15 = var4;
      var10000.id_class[4] = var15;
      var10000 = (rrns_3)id_break[id_case[10]];
      Integer var16 = var5;
      var10000.id_class[5] = var16;
      var10000 = (rrns_3)id_break[id_case[12]];
      Integer var17 = var6;
      var10000.id_class[6] = var17;
      ((rrns_3)id_break[id_case[14]]).id_class(id_throws[0]);
      return (rrns_3)id_break[id_case[15]];
   }

   public void id_class(int var1) {
      this.id_final();
      Integer var6 = var1;
      this.id_class[6] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, 97, 4, 7, -58, 60, 83, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Fu_1<?> id_class() {
      this.id_final();
      return (Fu_1<?>)this.id_class[id_case[16]];
   }

   public void id_class(List<rJY> var1) {
      this.id_final();
      this.id_class[1] = var1;
   }

   public void id_break(int var1) {
      this.id_final();
      Integer var6 = var1;
      this.id_class[5] = var6;
   }

   public float id_break() {
      this.id_final();
      return (Float)this.id_class[3];
   }

   public List<rJY> id_throws() {
      this.id_final();
      return (List<rJY>)this.id_class[1];
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrns_3()};
      id_break = var0;
   }

   public float id_catch() {
      this.id_final();
      return (Float)this.id_class[4];
   }

   private static void id_extends() {
      id_throws = new boolean[]{false, false, false, false, true};
   }

   public String id_case() {
      this.id_final();
      return (String)this.id_class[2];
   }

   private static void id_implements() {
      id_case = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 0, 0, 1, 2, 3, 4, 5, 6, 1, 5, 6};
   }

   public int id_protected() {
      this.id_final();
      return (Integer)this.id_class[5];
   }

   public int id_private() {
      this.id_final();
      return (Integer)this.id_class[6];
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
         var1[3] = id_byte[0];
         var1[4] = id_byte[1];
         var1[5] = Integer.valueOf(id_throws[2]);
         var1[6] = Integer.valueOf(id_throws[3]);
      }
   }

   private static void id_volatile() {
      id_byte = new float[2];
   }

   private static void id_native() {
      id_protected = new byte[]{7, 3, 4, 5, 6};
   }
}
