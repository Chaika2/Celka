package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZn_1 extends rruH {
   private static boolean[] id_throws;
   public Object[] id_protected;
   private static short[] id_case;
   private static float[] id_catch;

   public rrZn_1(
      Category var1,
      rrZO var2,
      Supplier<rqO_2> var3,
      Supplier<rjK_2> var4,
      Supplier<rjK_2> var5,
      Supplier<Integer> var6,
      Supplier<String> var7,
      Supplier<rjK_2> var8,
      Supplier<rjK_2> var9,
      Supplier<rjK_2> var10,
      Supplier<Integer> var11,
      Supplier<rji_3> var12
   ) {
      super(var3, var4, var5, var6, var2, var7, var8, var9, var10, var11, var12);
      this.id_synchronized();
      this.id_protected[0] = var1;
   }

   static {
      ntfClinit();
   }

   public Category id_this() {
      this.id_synchronized();
      return (Category)this.id_protected[0];
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(!var1 && this.id_native() ? id_throws[1] : id_throws[0]);
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4272554677177023593L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 372682864;
   }

   public static String id_throws(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, -120, 51, -100, 77, 109, -82, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float id_finally() {
      return 0.7F + 0.3F * this.id_protected();
   }

   private static void id_else() {
      id_catch = new float[]{0.7F, 0.3F};
   }

   private static void id_return() {
      id_case = new short[2];
   }

   private static void id_public() {
      id_throws = new boolean[]{true, false, true};
   }

   private void id_synchronized() {
      if (this.id_protected == null) {
         this.id_protected = new Object[1];
         Object[] var1 = this.id_protected;
      }
   }
}
