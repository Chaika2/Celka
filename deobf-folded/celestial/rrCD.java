package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCD extends rrTF<Flight> {
   private static double[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_case;
   public Object[] id_class;
   private static float[] id_catch;

   private static void id_byte() {
      id_break = new double[]{-0.2};
   }

   public rrCD(Flight var1) {
      super(var1);
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_catch = new float[]{2.0F};
   }

   @EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_case();
      float var2 = this.id_continue().id_this().id_byte();
      var1.id_class(var2);
      int var10002 = (Integer)this.id_class[id_byte[0]] + 1;
      Integer var7 = var10002;
      this.id_class[id_byte[1]] = var7;
      if (var10002 > 70) {
         var1.id_catch().id_byte = -0.2;
         Integer var8 = Integer.valueOf(id_protected[1]);
         this.id_class[id_byte[2]] = var8;
      } else {
         var1.id_catch().id_byte = (double)(rrfj_3.id_class() * var2 / 2.0F);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4525601928039463013L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, 106, -52, 52, -56, 100, 17, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -713869217;
   }

   private static void id_break() {
      id_case = new byte[]{70};
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false, false, true, false, false};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         this.id_class[0] = 0;
      }
   }

   private static void id_protected() {
      id_byte = new short[4];
   }

   @Override
   public boolean aK_() {
      this.id_case();
      Integer var5 = Integer.valueOf(id_protected[2]);
      this.id_class[id_byte[3]] = var5;
      return super.aK_();
   }
}
