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
      boolean[] var2 = new boolean[]{false};
      var1.id_goto().id_class(new sc_3(this, var2, var1));
      su_3 var7 = new su_3(this, var1, new String[]{"pause", "p", "paws"}, var2);
      this.id_class[0] = var7;
      sm_3 var8 = new sm_3(this, var1, new String[]{"resume", "r", "unpause", "unpaws"}, var2);
      this.id_class[1] = var8;
      sZ_2 var9 = new sZ_2(this, var1, new String[]{"paused"}, var2);
      this.id_class[2] = var9;
      sv_3 var10 = new sv_3(this, var1, new String[]{"cancel", "c", "stop"}, var2);
      this.id_class[3] = var10;
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
         this.id_class = new Object[4];
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
