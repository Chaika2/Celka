package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrun_1 extends rruu_1 {
   private static float[] id_byte;
   private static byte[] id_protected;
   public Object[] id_break;
   private static boolean[] id_throws;
   private static short[] id_case;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, -70, 102, 58, -127, 123, -110, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_int() {
      id_case = new short[]{0, 4, 5, 0, 1, 2, 3, 3, 0, 0, 5, 0, 4, 1, 2, 5, 5, 4};
   }

   public rrun_1(Supplier<rqO_2> var1, Supplier<rjK_2> var2, Supplier<rjK_2> var3, Supplier<Integer> var4) {
      this.id_new();
      rrul_1 var9 = (rrul_1)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[id_case[0]];
      this.id_break[id_case[1]] = var9;
      Supplier var10 = () -> id_byte[5];
      this.id_break[id_case[2]] = var10;
      this.id_break[id_case[3]] = var1;
      this.id_break[id_case[4]] = var2;
      this.id_break[id_case[5]] = var3;
      this.id_break[id_case[6]] = var4;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new boolean[]{true, false};
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(!var1 && this.id_native() ? id_throws[1] : id_throws[0]);
   }

   public <T extends rrun_1> T id_class(Supplier<Float> var1) {
      this.id_new();
      this.id_break[id_case[16]] = var1;
      return (T)this;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_new();
      super.id_class(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.id_catch();
      rjK_2 var7 = this.id_extends().get();
      int var8 = ColorHelper.id_class((Integer)((Supplier)this.id_break[id_case[7]]).get(), this.id_finally());
      if ((Supplier)this.id_break[id_case[8]] != null) {
         rrfD_2.id_class(
            var1,
            (rqO_2)((Supplier)this.id_break[id_case[9]]).get(),
            var6.id_break(),
            var6.id_protected(),
            var7.id_byte,
            var7.id_protected,
            ColorHelper.id_break(var8, (int)(id_byte[0] * (Float)((Supplier)this.id_break[id_case[10]]).get()))
         );
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -96387269;
   }

   @Override
   public Supplier<rjK_2> id_class() {
      this.id_new();
      return (Supplier<rjK_2>)this.id_break[id_case[13]];
   }

   public <T extends rrun_1> T id_class(rrul_1 var1) {
      this.id_new();
      this.id_break[id_case[17]] = var1;
      return (T)this;
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5724297939063835166L;
   }

   @Override
   public float id_finally() {
      this.id_new();

      return switch (((int[])rruC.id_class[id_case[11]])[((rrul_1)this.id_break[id_case[12]]).ordinal()]) {
         case 1 -> id_byte[1] - id_byte[2] * this.id_protected();
         case 2 -> id_byte[3] + id_byte[4] * this.id_protected();
         default -> throw new IncompatibleClassChangeError();
      };
   }

   @Override
   public Supplier<rjK_2> id_extends() {
      this.id_new();
      return (Supplier<rjK_2>)this.id_break[id_case[14]];
   }

   private static void id_else() {
      id_protected = new byte[]{6};
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[0]];
         Object[] var1 = this.id_break;
      }
   }

   public Supplier<Float> id_package() {
      this.id_new();
      return (Supplier<Float>)this.id_break[id_case[15]];
   }

   private static void id_super() {
      id_byte = new float[]{255.0F, 1.0F, 0.2F, 0.8F, 0.2F, 1.0F};
   }
}
