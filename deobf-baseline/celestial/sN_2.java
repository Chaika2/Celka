package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sN_2 {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;
   private static short[] id_throws;

   private static void id_byte() {
      id_protected = new byte[]{3, 2, 4, 2, 3, 3, 2, 4};
   }

   public sN_2(C_case var1) {
      this.id_break();
      boolean[] var10000 = new boolean[id_break[0]];
      var10000[id_break[1]] = id_break[2];
      boolean[] var2 = var10000;
      var1.id_goto().id_class(new sc_3(this, var2, var1));
      String[] var10005 = new String[id_protected[0]];
      var10005[id_break[3]] = id_byte[0];
      var10005[id_break[4]] = id_byte[1];
      var10005[id_protected[1]] = id_byte[2];
      su_3 var7 = new su_3(this, var1, var10005, var2);
      this.id_class[id_throws[0]] = var7;
      var10005 = new String[id_protected[2]];
      var10005[id_break[5]] = id_byte[3];
      var10005[id_break[6]] = id_byte[4];
      var10005[id_protected[3]] = id_byte[5];
      var10005[id_protected[4]] = id_byte[6];
      sm_3 var8 = new sm_3(this, var1, var10005, var2);
      this.id_class[id_throws[1]] = var8;
      var10005 = new String[id_break[7]];
      var10005[id_break[8]] = id_byte[7];
      sZ_2 var9 = new sZ_2(this, var1, var10005, var2);
      this.id_class[id_throws[2]] = var9;
      var10005 = new String[id_protected[5]];
      var10005[id_break[9]] = id_byte[8];
      var10005[id_break[10]] = id_byte[9];
      var10005[id_protected[6]] = id_byte[10];
      sv_3 var10 = new sv_3(this, var1, var10005, var2);
      this.id_class[id_throws[3]] = var10;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, -64, -86, 101, -87, 36, -24, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -609844861;
   }

   private static void id_class() {
      id_byte = new String[]{
         new String("pause"),
         new String("p"),
         new String("paws"),
         new String("resume"),
         new String("r"),
         new String("unpause"),
         new String("unpaws"),
         new String("paused"),
         new String("cancel"),
         new String("c"),
         new String("stop")
      };
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3251903460635565412L;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[7]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_throws = new short[]{0, 1, 2, 3};
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, false, false, true, false, true, true, false, false, true};
   }
}
