package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruH extends rrup_1 {
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;
   private static float[] id_case;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, 107, -44, 24, -67, -89, 19, -15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Supplier<rqO_2> id_int() {
      this.id_synchronized();
      return (Supplier<rqO_2>)this.id_break[id_protected[8]];
   }

   public rruH(
      Supplier<rqO_2> var1,
      Supplier<rjK_2> var2,
      Supplier<rjK_2> var3,
      Supplier<Integer> var4,
      rrZO var5,
      Supplier<String> var6,
      Supplier<rjK_2> var7,
      Supplier<rjK_2> var8,
      Supplier<rjK_2> var9,
      Supplier<Integer> var10,
      Supplier<rji_3> var11
   ) {
      super(var5, var6, var7, var8, var9, var10, var11);
      this.id_synchronized();
      this.id_break[id_protected[0]] = var2;
      this.id_break[id_protected[1]] = var3;
      this.id_break[id_protected[2]] = var4;
      this.id_break[id_protected[3]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new byte[]{4};
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_synchronized();
      super.id_class(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.id_catch();
      rjK_2 var7 = this.id_new().get();
      rjK_2 var8 = this.id_package().get();
      int var9 = ColorHelper.id_class((Integer)((Supplier)this.id_break[id_protected[4]]).get(), this.id_finally());
      rrfD_2.id_class(
         var1,
         (rqO_2)((Supplier)this.id_break[id_protected[5]]).get(),
         var6.id_break() + var7.id_byte,
         var6.id_protected() + var7.id_protected,
         var8.id_byte,
         var8.id_protected,
         ColorHelper.id_break(var9, (int)(id_case[0] * this.id_continue().get()))
      );
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4853165087480461457L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1822078590;
   }

   @Override
   public float id_finally() {
      return id_case[1] - id_case[2] * this.id_protected();
   }

   private static void id_else() {
      id_protected = new short[]{0, 1, 2, 3, 2, 3, 0, 1, 3};
   }

   public Supplier<rjK_2> id_new() {
      this.id_synchronized();
      return (Supplier<rjK_2>)this.id_break[id_protected[6]];
   }

   public Supplier<rjK_2> id_package() {
      this.id_synchronized();
      return (Supplier<rjK_2>)this.id_break[id_protected[7]];
   }

   private static void id_return() {
      id_case = new float[]{255.0F, 1.0F, 0.2F};
   }

   private void id_synchronized() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
      }
   }
}
