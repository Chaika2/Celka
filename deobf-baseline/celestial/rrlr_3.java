package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlr_3 extends rrTF<NoSlow> {
   public Object[] id_class;
   private static String[] id_break;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static short[] id_case;

   private static void id_byte() {
      id_case = new short[3];
   }

   public rrlr_3(NoSlow var1) {
      super(var1);
      this.id_protected();
      rrIm_1 var6 = new rrIm_1(id_break[0], id_protected[0], id_protected[1], id_protected[2], id_protected[3]);
      this.id_class[id_case[0]] = var6;
      var1.id_class(((rrIm_1)this.id_class[id_case[1]]).id_class(() -> var1.id_new() == this ? id_byte[0] : id_byte[1]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAB var1) {
      this.id_protected();
      var1.id_break(((rrIm_1)this.id_class[id_case[2]]).id_byte() / id_protected[4]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -114, -105, 52, -98, -34, -51, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2193176261155922981L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1169436654;
   }

   private static void id_class() {
      id_byte = new boolean[]{true, false, true};
   }

   private static void id_break() {
      id_protected = new float[]{100.0F, 20.0F, 100.0F, 1.0F, 100.0F};
   }

   private static void id_throws() {
      id_break = new String[]{new String("Скорость")};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }
}
