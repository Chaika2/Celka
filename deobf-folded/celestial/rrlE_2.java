package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlE_2 extends rrTF<Speed> {
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static float[] id_case;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new boolean[]{true, false, true};
   }

   public rrlE_2(Speed var1) {
      super(var1);
      this.id_break();
      rrIm_1 var6 = new rrIm_1(id_break[0], 0.5F, 0.3F, 2.0F, 0.1F);
      this.id_class[id_protected[0]] = var6;
      var1.id_class(((rrIm_1)this.id_class[id_protected[1]]).id_class(() -> var1.id_new() == this ? true : id_byte[1]));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5635585295514232056L;
   }

   private static void id_class() {
      id_break = new String[]{new String("Скорость")};
   }

   @EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_break();
      var1.id_class(((rrIm_1)this.id_class[id_protected[2]]).id_byte());
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 788451313;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, -112, 108, 79, 47, 72, 43, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   private static void id_throws() {
      id_protected = new short[3];
   }

   private static void id_protected() {
      id_case = new float[]{0.5F, 0.3F, 2.0F, 0.1F};
   }
}
