package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCo_1 extends rrTF<Flight> {
   private static double[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_case;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         this.id_class[0] = 0;
      }
   }

   public rrCo_1(Flight var1) {
      super(var1);
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1746503085;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6506181075765063635L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_byte();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]] && ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private) {
         int var10002 = (Integer)this.id_class[id_byte[3]] + 1;
         Integer var6 = var10002;
         this.id_class[id_byte[4]] = var6;
         if (var10002 > 70) {
            ((cb_3)id_import.id_class[57]).rv().id_byte = -0.2;
            Integer var7 = Integer.valueOf(id_case[1]);
            this.id_class[id_byte[6]] = var7;
         } else {
            ((cb_3)id_import.id_class[57]).sl();
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, 70, 89, -52, 104, 22, -97, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_protected = new byte[]{70};
   }

   private static void id_break() {
      id_byte = new short[]{0, 57, 17, 0, 0, 57, 0, 57, 0};
   }

   private static void id_throws() {
      id_case = new boolean[]{true, false, false, true, false, false};
   }

   private static void id_protected() {
      id_break = new double[]{-0.2};
   }

   @Override
   public boolean aK_() {
      this.id_byte();
      Integer var5 = Integer.valueOf(id_case[2]);
      this.id_class[id_byte[8]] = var5;
      return super.aK_();
   }
}
