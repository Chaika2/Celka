package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLD {
   public static Object[] id_class;
   private static double[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;

   public rdn_3 id_byte() {
      return (rdn_3)this.id_break[id_protected[11]];
   }

   public rrLD() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   public static void id_class(iB_2 var0, rdn_3 var1, List<rLY> var2, double var3) {
      rrLD var5 = id_break(var0, var1, var2, var3);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[9]]).id_finally().id_class(var5);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-76, 69, -103, 0, -48, 60, 85, 31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -695246301;
   }

   public double id_class() {
      return (Double)this.id_break[id_protected[13]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4730532062994387273L;
   }

   public iB_2 id_break() {
      return (iB_2)this.id_break[id_protected[10]];
   }

   public static rrLD id_break(iB_2 var0, rdn_3 var1, List<rLY> var2, double var3) {
      ((rrLD)id_class[id_protected[0]]).id_break[id_protected[1]] = var0;
      ((rrLD)id_class[id_protected[2]]).id_break[id_protected[3]] = var1;
      ((rrLD)id_class[id_protected[4]]).id_break[id_protected[5]] = var2;
      rrLD var10000 = (rrLD)id_class[id_protected[6]];
      Double var12 = var3;
      var10000.id_break[id_protected[7]] = var12;
      return (rrLD)id_class[id_protected[8]];
   }

   private static void id_throws() {
      id_byte = new double[1];
   }

   private static void id_finally() {
      id_case = new boolean[]{false, true};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0, 1, 2, 3};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
         var1[id_throws[1]] = id_byte[0];
      }
   }

   private static void id_implements() {
      id_throws = new byte[]{4, 3};
   }

   public List<rLY> id_protected() {
      return (List<rLY>)this.id_break[id_protected[12]];
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrLD()};
      id_class = var0;
   }
}
