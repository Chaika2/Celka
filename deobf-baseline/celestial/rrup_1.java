package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrup_1 extends rruu_1 {
   private static boolean[] id_break;
   public Object[] id_byte;
   private static byte[] id_protected;
   private static float[] id_throws;
   private static short[] id_case;

   public <T extends rrup_1> T id_byte(boolean var1) {
      this.id_package();
      Boolean var6 = var1;
      this.id_byte[id_case[30]] = var6;
      return (T)this;
   }

   private static void id_int() {
      id_case = new short[]{7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 4, 6, 5, 11, 7, 9, 9, 9, 9, 9, 1, 10, 0, 8, 0, 8, 2, 3, 8, 10, 11, 9, 8, 7, 11, 8};
   }

   public rrup_1(
      rrZO var1, Supplier<String> var2, Supplier<rjK_2> var3, Supplier<rjK_2> var4, Supplier<rjK_2> var5, Supplier<Integer> var6, Supplier<rji_3> var7
   ) {
      this.id_package();
      Supplier var12 = () -> id_break[3];
      this.id_byte[id_case[0]] = var12;
      Supplier var13 = () -> id_throws[10];
      this.id_byte[id_case[1]] = var13;
      Float var14 = id_throws[0];
      this.id_byte[id_case[2]] = var14;
      this.id_byte[id_case[3]] = var1;
      this.id_byte[id_case[4]] = var2;
      this.id_byte[id_case[5]] = var3;
      this.id_byte[id_case[6]] = var4;
      this.id_byte[id_case[7]] = var5;
      this.id_byte[id_case[8]] = var6;
      this.id_byte[id_case[9]] = var7;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_break = new boolean[]{false, false, true, true, false, false};
   }

   public <T extends rrup_1> T id_class(int var1) {
      this.id_package();
      Float var6 = (float)var1;
      this.id_byte[id_case[31]] = var6;
      return (T)this;
   }

   public <T extends rrup_1> T id_class(Supplier<Float> var1) {
      this.id_package();
      this.id_byte[id_case[32]] = var1;
      return (T)this;
   }

   @Override
   public Supplier<rjK_2> id_class() {
      this.id_package();
      return (Supplier<rjK_2>)this.id_byte[id_case[26]];
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_package();
      super.id_class(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.id_catch();
      rjK_2 var7 = this.id_extends().get();
      rjK_2 var8 = (rjK_2)((Supplier)this.id_byte[id_case[10]]).get();
      rji_3 var9 = (rji_3)((Supplier)this.id_byte[id_case[11]]).get();
      int var10 = ColorHelper.id_class((Integer)((Supplier)this.id_byte[id_case[12]]).get(), this.id_finally());
      UnaryOperator var11 = var1x -> {
         this.id_package();
         return ColorHelper.id_break(
            var1x, (int)(id_throws[8] * (this.id_byte[id_case[34]] ? this.id_protected() : id_throws[9]) * (Float)((Supplier)this.id_byte[id_case[35]]).get())
         );
      };
      int var12 = var11.apply(Integer.valueOf((int)var9.id_class()));
      int var13 = var11.apply(Integer.valueOf((int)var9.id_break()));
      int var14 = var11.apply(Integer.valueOf((int)var9.id_byte()));
      int var15 = var11.apply(Integer.valueOf((int)var9.id_protected()));
      float var16 = var7.id_byte * (this.id_byte[id_case[13]] ? this.id_protected() : id_throws[1]);
      if ((Boolean)((Supplier)this.id_byte[id_case[14]]).get()) {
         rrfD_2.id_class(
            var1,
            var6.id_break(),
            var6.id_protected() - id_throws[2],
            var16,
            var7.id_protected + id_throws[3],
            (Float)this.id_byte[id_case[15]] / id_throws[4],
            id_protected[0],
            id_protected[1],
            var12,
            var13,
            var14,
            var15
         );
      }

      rrfD_2.id_break(
         var1,
         var6.id_break(),
         var6.id_protected(),
         var16,
         var7.id_protected,
         (Float)this.id_byte[id_case[16]],
         (Float)this.id_byte[id_case[17]],
         (Float)this.id_byte[id_case[18]],
         (Float)this.id_byte[id_case[19]],
         var12,
         var13,
         var14,
         var15
      );
      String var17 = this.id_class((String)((Supplier)this.id_byte[id_case[20]]).get());
      if ((Boolean)this.id_byte[id_case[21]]) {
         ((rrZO)this.id_byte[id_case[22]])
            .id_byte(
               var1,
               var17,
               var6.id_break() + var6.id_byte() / id_throws[5] + var8.id_byte,
               var6.id_protected() + var8.id_protected,
               ColorHelper.id_break(var10, (int)(id_throws[6] * (Float)((Supplier)this.id_byte[id_case[23]]).get())),
               id_break[0]
            );
      } else {
         ((rrZO)this.id_byte[id_case[24]])
            .id_protected(
               var1,
               var17,
               var6.id_break() + var8.id_byte,
               var6.id_protected() + var8.id_protected,
               ColorHelper.id_break(var10, (int)(id_throws[7] * (Float)((Supplier)this.id_byte[id_case[25]]).get())),
               id_break[1]
            );
      }
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4199915859870418433L;
   }

   public <T extends rrup_1> T id_break(Supplier<Boolean> var1) {
      this.id_package();
      this.id_byte[id_case[33]] = var1;
      return (T)this;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -824665302;
   }

   @Override
   public Supplier<rjK_2> id_extends() {
      this.id_package();
      return (Supplier<rjK_2>)this.id_byte[id_case[27]];
   }

   public Supplier<Float> id_continue() {
      this.id_package();
      return (Supplier<Float>)this.id_byte[id_case[28]];
   }

   private void id_package() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_protected[2]];
         Object[] var1 = this.id_byte;
         var1[id_protected[3]] = id_throws[11];
         var1[id_protected[4]] = id_break[4];
         var1[id_protected[5]] = id_break[5];
      }
   }

   private static void id_return() {
      id_protected = new byte[]{4, 9, 12, 9, 10, 11};
   }

   public rruu_1 id_super() {
      this.id_package();
      Boolean var5 = id_break[2];
      this.id_byte[id_case[29]] = var5;
      return this;
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, -122, -14, 77, 88, -58, 75, -106}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_synchronized() {
      id_throws = new float[]{4.0F, 1.0F, 2.0F, 4.0F, 2.0F, 2.0F, 255.0F, 255.0F, 255.0F, 1.0F, 1.0F, 0.0F};
   }
}
