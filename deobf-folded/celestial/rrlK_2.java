package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlK_2 {
   private static byte[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static long[] id_protected;
   private static short[] id_throws;

   public boolean id_byte() {
      return (Boolean)this.id_class[2];
   }

   public rrlK_2(rHu_1 var1) {
      this.id_extends();
      this.id_class[id_throws[0]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrlK_2 var2 = (rrlK_2)var1;
         return this.id_case().equals(var2.id_case());
      } else {
         return id_byte[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[1];
      var10000[id_byte[3]] = this.id_case();
      return Objects.hash(var10000);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, 127, 56, 37, -115, 11, -114, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(long var1) {
      Long var7 = var1;
      this.id_class[1] = var7;
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[2] = var6;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -634165424;
   }

   public xc_3 id_class() {
      return ((rHu_1)this.id_class[id_throws[3]]).id_abstract();
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7384276017873484323L;
   }

   public long id_break() {
      return (Long)this.id_class[1];
   }

   public rHu_1 id_throws() {
      return (rHu_1)this.id_class[id_throws[4]];
   }

   private static void id_finally() {
      id_break = new byte[]{3, 2};
   }

   private static void id_catch() {
      id_protected = new long[1];
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[1] = 0L;
         this.id_class[2] = false;
      }
   }

   public rfH_2 id_case() {
      return ((rHu_1)this.id_class[id_throws[2]]).id_char();
   }

   private static void id_implements() {
      id_throws = new short[]{0, 56, 0, 0, 0, 1, 2, 1, 2};
   }

   public rfl_3 id_protected() {
      xc_3 var1 = this.id_class();
      rfH_2 var2 = this.id_case();
      rjC_2 var3 = var1.id_break().id_class(var1, (gm_3)MinecraftAccessor.id_import.id_class[56], var2, rjm_3.id_break());
      return var3.id_class().id_class(var2);
   }

   private static void id_private() {
      id_byte = new boolean[]{true, false, true, false, true, false};
   }
}
