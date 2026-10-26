package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcl_3 extends rrfI_2<Boolean> {
   private static boolean[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;
   private static short[] id_protected;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcl_3(rrcC_2 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_throws();
      this.id_class[id_protected[0]] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1034178266;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, -70, -66, 47, -2, -67, -69, 35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2033892290074795290L;
   }

   public Boolean id_break() {
      this.id_throws();
      if ((rrNw_1)this.id_class[id_protected[2]] instanceof rrNt_1) {
         rrNt_1 var1 = (rrNt_1)((rrNw_1)this.id_class[id_protected[3]]);
         List var2 = var1.id_break();
         int var3 = var1.id_case();
         String var4 = rrcC_2.id_class(var2, var1);
         if (var4 != null) {
            return id_break[0];
         }
      }

      return true;
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_byte = new byte[]{2};
   }

   private static void id_case() {
      id_break = new boolean[]{false, true};
   }

   private static void id_protected() {
      id_protected = new short[]{0, 1, 0, 0};
   }
}
