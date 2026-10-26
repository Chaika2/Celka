package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAX implements MinecraftAccessor {
   private static short[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   public Object[] id_break;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrAX()};
      id_class = var0;
   }

   public rrAX() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static rrAX id_class() {
      rrAX var0 = id_break(new PX((Float)((cb_3)id_import.id_class[57]).id_throws[15], (Float)((cb_3)id_import.id_class[57]).id_throws[16]));
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var0);
      return var0;
   }

   public void id_class(PX var1) {
      this.id_break[0] = var1;
      cb_3 var10000 = (cb_3)id_import.id_class[57];
      Float var7 = var1.id_throws();
      var10000.id_private[25] = var7;
      var10000 = (cb_3)id_import.id_class[57];
      Float var8 = var1.id_protected();
      var10000.id_private[26] = var8;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3850867614614397133L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, -94, -82, 113, 50, -46, 0, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1037995513;
   }

   public static rrAX id_break(PX var0) {
      ((rrAX)id_class[0]).id_break[0] = var0;
      return (rrAX)id_class[0];
   }

   public PX id_break() {
      return (PX)this.id_break[0];
   }

   private static void id_throws() {
      id_byte = new short[]{0, 0, 0, 57, 15, 57, 16, 0, 0, 0, 57, 25, 57, 26, 0};
   }

   private static void id_case() {
      id_protected = new boolean[]{false, true, true};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }
}
