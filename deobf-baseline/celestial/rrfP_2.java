package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfP_2 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   private static void id_byte() {
      id_protected = new short[]{1, 57, 57, 1, 0, 0, 1, 57, 1, 1, 0, 1, 1};
   }

   public rrfP_2() {
      this.id_protected();
      Integer var5 = Integer.valueOf(id_break[0]);
      this.id_class[id_protected[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6471351719885462085L;
   }

   public void id_class(boolean var1) {
      if ((Boolean)this.id_class[id_protected[5]] && (Integer)this.id_class[id_protected[6]] != id_break[1]) {
         ((rhz_3)((cb_3)MinecraftAccessor.id_import.id_class[id_protected[7]]).id_implements[id_protected[8]]).id_protected = (Integer)this.id_class[id_protected[9]];
         if (var1) {
            Boolean var6 = id_byte[1];
            this.id_class[id_protected[10]] = var6;
            Integer var7 = Integer.valueOf(id_break[2]);
            this.id_class[id_protected[11]] = var7;
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, -110, -121, 45, 50, 52, -37, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new boolean[]{true, false, false, false, true, false};
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_class[id_protected[12]] = var6;
   }

   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvm_3 var2) {
         if ((cb_3)MinecraftAccessor.id_import.id_class[id_protected[1]] == null) {
            return;
         }

         if (var2.id_break() != ((rhz_3)((cb_3)MinecraftAccessor.id_import.id_class[id_protected[2]]).id_implements[id_protected[3]]).id_protected) {
            Boolean var8 = id_byte[0];
            this.id_class[id_protected[4]] = var8;
         }
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1422086272;
   }

   private static void id_break() {
      id_break = new byte[]{-1, -1, -1, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[0] = false;
         this.id_class[1] = 0;
      }
   }
}
