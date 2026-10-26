package celestial;

import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bI_2 implements rRq_1 {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      return ((bw_3)this.id_class[id_break[1]]).id_class(var1.b_(), var1.c_(), var1.d_());
   }

   private static void id_byte() {
      id_byte = new boolean[]{true};
   }

   public bI_2(bw_3 var1) {
      this.id_break();
      this.id_class[id_break[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_break = new short[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8231955920765995561L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1400817779;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, 53, 29, -108, -45, 72, -17, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Nullable
   @Override
   public ryO_2 id_class(rfH_2 var1) {
      return null;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      return this.id_byte(var1).id_volatile();
   }
}
