package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAK extends Om_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;
   public static Object[] id_break;

   public rrAK() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5420951777635316875L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -71448828;
   }

   public static rrAK id_class(int var0, int var1, int var2, rXa_1 var3) {
      ((rrAK)id_break[id_byte[0]]).id_class(id_protected[0]);
      rrAK var10000 = (rrAK)id_break[id_byte[1]];
      Integer var8 = var0;
      var10000.id_class[id_byte[2]] = var8;
      var10000 = (rrAK)id_break[id_byte[3]];
      Integer var9 = var1;
      var10000.id_class[id_byte[4]] = var9;
      var10000 = (rrAK)id_break[id_byte[5]];
      Integer var10 = var2;
      var10000.id_class[id_byte[6]] = var10;
      ((rrAK)id_break[id_byte[7]]).id_class[id_byte[8]] = var3;
      return (rrAK)id_break[id_byte[9]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, 21, -124, -9, -106, 124, 58, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rXa_1 id_class() {
      this.id_private();
      return (rXa_1)this.id_class[id_byte[15]];
   }

   public static rrAK id_break(int var0, int var1, int var2, rXa_1 var3) {
      rrAK var4 = id_class(var0, var1, var2, var3);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[10]]).id_finally().id_class(var4);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[11]]).id_class(var4);
      return var4;
   }

   public int id_break() {
      this.id_private();
      return (Integer)this.id_class[id_byte[14]];
   }

   public int id_throws() {
      this.id_private();
      return (Integer)this.id_class[id_byte[13]];
   }

   private static void id_finally() {
      id_protected = new boolean[]{false, false, false, false, true, false, false, true};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrAK()};
      id_break = var0;
   }

   private static void id_case() {
      id_throws = new byte[]{4, 2};
   }

   private static void id_implements() {
      id_byte = new short[]{0, 0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0, 0, 1, 2, 3};
   }

   public int id_protected() {
      this.id_private();
      return (Integer)this.id_class[id_byte[12]];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[2]] = Integer.valueOf(id_protected[3]);
         var1[id_protected[4]] = Integer.valueOf(id_protected[5]);
         var1[id_throws[1]] = Integer.valueOf(id_protected[6]);
      }
   }
}
