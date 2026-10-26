package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryS extends rryB {
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   @Override
   public rfl_3 id_byte() {
      this.id_new();
      return (rfl_3)this.id_class[1];
   }

   private static void id_int() {
      id_protected = new short[]{0, 1, 1, 2, 3, 0, 4, 1, 4, 0, 0, 2, 3};
   }

   public rryS(SZ var1, rfl_3 var2) {
      this.id_new();
      this.id_class[id_protected[0]] = var1;
      this.id_class[1] = var2;
      rjU_2 var9 = ((rfl_3)this.id_class[1]).id_case();
      this.id_class[2] = var9;
      rdn_3 var10 = new rdn_3(rdy_3.OW);
      this.id_class[3] = var10;
      String var11 = ((SZ)this.id_class[id_protected[5]]).id_break() + " трапка";
      this.id_class[4] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public rjU_2 id_class() {
      this.id_new();
      return (rjU_2)this.id_class[2];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -59, 118, 43, -11, 56, 123, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2008084506728725766L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 227893917;
   }

   @Override
   public rdn_3 id_break() {
      this.id_new();
      return (rdn_3)this.id_class[3];
   }

   @Override
   public long id_throws() {
      this.id_new();
      return ((SZ)this.id_class[id_protected[9]]).id_byte();
   }

   @Override
   public String id_case() {
      this.id_new();
      return (String)this.id_class[4];
   }

   private void id_new() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
      }
   }

   private static void id_package() {
      id_byte = new byte[]{5};
   }

   public SZ id_protected() {
      this.id_new();
      return (SZ)this.id_class[id_protected[10]];
   }
}
