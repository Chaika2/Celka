package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqD_2 {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   public rjU_2 id_byte() {
      return (rjU_2)this.id_class[id_byte[11]];
   }

   public rrqD_2(rrqU_2 var1, rfH_2 var2, rfj_3 var3) {
      this.id_private();
      this.id_class[id_byte[0]] = var1;
      this.id_class[id_byte[1]] = var3;
      rjU_2 var10 = new rjU_2((double)var2.b_(), (double)var2.c_(), (double)var2.d_());
      this.id_class[id_byte[2]] = var10;
      rfH_2 var11 = new rfH_2((rjU_2)this.id_class[id_byte[3]]);
      this.id_class[id_byte[4]] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_protected[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrqD_2 var2 = (rrqD_2)var1;
         return Objects.equals((rjU_2)this.id_class[id_byte[5]], (rjU_2)var2.id_class[id_byte[6]]);
      } else {
         return id_protected[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_protected[2]];
      var10000[id_protected[3]] = (rjU_2)this.id_class[id_byte[7]];
      return Objects.hash(var10000);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6803050990364531202L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1306660529;
   }

   public rfj_3 id_class() {
      return (rfj_3)this.id_class[id_byte[9]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, -122, -56, 61, 35, -87, -15, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrqU_2 id_break() {
      return (rrqU_2)this.id_class[id_byte[8]];
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false, true, false};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 1, 3, 3, 2, 3, 3, 3, 0, 1, 2, 3};
   }

   private static void id_case() {
      id_break = new byte[]{4};
   }

   public rfH_2 id_protected() {
      return (rfH_2)this.id_class[id_byte[10]];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
      }
   }
}
