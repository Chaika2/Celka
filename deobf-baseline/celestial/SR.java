package celestial;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SR implements C_return {
   private static byte[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   public void id_byte() {
      C_class.id_interface().execute(() -> ((SI)this.id_class[id_protected[6]]).id_class());
   }

   public SR(Path var1, rqM_2<rYB> var2) {
      this.id_protected();
      this.id_class[id_protected[0]] = var1;
      SI var8 = new SI(var1.resolve(id_byte[0]), var2);
      this.id_class[id_protected[1]] = var8;
      Sg_1 var9 = new Sg_1(var1.resolve(id_byte[1]));
      this.id_class[id_protected[2]] = var9;
      this.id_class[id_protected[3]] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2793887877481915362L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 955201997;
   }

   @Override
   public C_synchronized id_class() {
      return (Sg_1)this.id_class[id_protected[5]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 105, 69, 117, 101, -126, 117, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public C_super id_break() {
      return (SI)this.id_class[id_protected[4]];
   }

   private static void id_throws() {
      id_protected = new short[]{2, 0, 1, 3, 0, 1, 0};
   }

   private static void id_catch() {
      id_break = new byte[]{4};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_private() {
      id_byte = new String[]{new String("cache"), new String("waypoints")};
   }
}
