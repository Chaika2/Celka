package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruy_1 extends rrun_1 {
   public Object[] id_byte;
   private static float[] id_protected;
   private static short[] id_throws;
   private static byte[] id_case;
   private static boolean[] id_catch;

   private static void id_int() {
      id_catch = new boolean[2];
   }

   public rruy_1(
      Supplier<String> var1,
      rrZO var2,
      Supplier<Integer> var3,
      Supplier<rjK_2> var4,
      Supplier<rqO_2> var5,
      Supplier<rjK_2> var6,
      Supplier<rjK_2> var7,
      Supplier<Integer> var8
   ) {
      super(var5, var6, var7, var8);
      this.id_new();
      this.id_byte[id_throws[0]] = var1;
      this.id_byte[id_throws[1]] = var2;
      this.id_byte[id_throws[2]] = var3;
      this.id_byte[id_throws[3]] = var4;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new short[]{3, 0, 2, 1, 1, 2, 0, 3};
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_new();
      super.id_class(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.id_catch();
      rjK_2 var7 = (rjK_2)((Supplier)this.id_byte[id_throws[4]]).get();
      int var8 = ColorHelper.id_class((Integer)((Supplier)this.id_byte[id_throws[5]]).get(), this.id_finally());
      ((rrZO)this.id_byte[id_throws[6]])
         .id_break(
            var1,
            (String)((Supplier)this.id_byte[id_throws[7]]).get(),
            (double)(var6.id_break() + var7.id_byte),
            (double)(var6.id_protected() + var7.id_protected),
            ColorHelper.id_break(var8, (int)(id_protected[0] * this.id_package().get())),
            id_catch[0],
            id_catch[1]
         );
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1081492013;
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6076455165781366727L;
   }

   private static void id_continue() {
      id_protected = new float[]{255.0F};
   }

   private void id_new() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_case[0]];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_super() {
      id_case = new byte[]{4};
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, -81, 47, -112, 55, -109, -53, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
