package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PF extends Pv_1 {
   private static short[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   public boolean id_byte() {
      this.id_case();
      return this.id_break[id_byte[8]] == 0 ? true : id_protected[5];
   }

   public PF(C_class var1) {
      super(var1);
      this.id_case();
   }

   static {
      ntfClinit();
   }

   public boolean id_class(boolean var1) {
      this.id_case();
      int var2 = id_protected[1];
      if (var1) {
         var2 = this.id_protected() * 2;
      }

      return this.id_break[id_byte[7]] > this.id_break() - var2 ? true : id_protected[3];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 627396126;
   }

   public int id_class() {
      this.id_case();
      return (Integer)this.id_break[id_byte[10]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6864570154679503570L;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_case();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[3]] && (Integer)this.id_break[id_byte[4]] > 0) {
         Integer var6 = (Integer)this.id_break[id_byte[5]] - 1;
         this.id_break[id_byte[6]] = var6;
      }
   }

   public int id_break() {
      return 200;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, -21, -94, 92, -10, 82, -120, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(y_1 var1) {
      this.id_case();
      if (var1.id_byte() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]] && var1.id_protected() instanceof rmT_2) {
         Integer var6 = (Integer)this.id_break[id_byte[1]] + this.id_protected();
         this.id_break[id_byte[2]] = var6;
      }
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false, true, false, true, false, true, false, false};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 0};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
         var1[id_protected[7]] = Integer.valueOf(id_protected[8]);
      }
   }

   public int id_protected() {
      return 20;
   }

   private static void id_private() {
      id_throws = new byte[]{2, 20};
   }
}
