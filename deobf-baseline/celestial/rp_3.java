package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rp_3 extends rl_3 {
   private static short[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;

   public rp_3(int var1, int var2, int var3, re_3 var4) {
      super(var1, var2, var3);
      this.id_private();
      this.id_break[id_byte[0]] = var4;
   }

   public rp_3(int var1, int var2, int var3, xc_3 var4) {
      this(var1, var2, var3, new re_3(var4.id_break()));
   }

   static {
      ntfClinit();
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      this.id_private();
      if (((re_3)this.id_break[id_byte[2]]).id_class(var4)) {
         return var4;
      } else {
         for (xc_3 var7 : var5) {
            if (((re_3)this.id_break[id_byte[3]]).id_class(var7)) {
               return var7;
            }
         }

         return ((re_3)this.id_break[id_byte[4]]).id_protected();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4531202822019734618L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 87677214;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 94, 41, -114, -61, 21, 106, -110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public re_3 id_throws() {
      this.id_private();
      return (re_3)this.id_break[id_byte[1]];
   }

   private static void id_catch() {
      id_byte = new short[5];
   }

   private static void id_case() {
      id_protected = new boolean[]{true};
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[0]];
         Object[] var1 = this.id_break;
      }
   }
}
