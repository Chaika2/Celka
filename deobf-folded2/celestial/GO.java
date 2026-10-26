package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GO extends MP {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;

   @Override
   public rP_2 id_byte() {
      this.id_extends();
      return (rP_2)this.id_class[3];
   }

   public GO(a_1 var1, int var2, int var3) {
      this.id_extends();
      List var8 = var1.id_break().subList(var2, var3 + 1);
      this.id_class[0] = var8;
      List var9 = var1.id_catch().subList(var2, var3);
      this.id_class[1] = var9;
      Integer var10 = var1.id_case();
      this.id_class[2] = var10;
      rP_2 var11 = var1.id_byte();
      this.id_class[3] = var11;
      this.id_throws();
   }

   public GO(a_1 var1, int var2) {
      this(var1, 0, var2);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, -105, -116, 81, -66, -49, 6, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7165601208488771438L;
   }

   @Override
   public List<rU_2> id_break() {
      this.id_extends();
      return Collections.unmodifiableList((List<? extends rU_2>)this.id_class[0]);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -138700167;
   }

   private static void id_finally() {
      id_break = new short[]{0, 1, 2, 3, 3, 1, 0, 2};
   }

   @Override
   public List<rd_3> id_catch() {
      this.id_extends();
      return Collections.unmodifiableList((List<? extends rd_3>)this.id_class[1]);
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[2] = 0;
      }
   }

   @Override
   public int id_case() {
      this.id_extends();
      return (Integer)this.id_class[2];
   }

   private static void id_volatile() {
      id_byte = new byte[]{4, 2};
   }

   private static void id_native() {
      id_protected = new boolean[]{true, false, false};
   }
}
