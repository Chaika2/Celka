package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZf_1 extends rrZN implements rrZT, rrZq_1<rrvB> {
   private static float[] id_protected;
   private static double[] id_throws;
   public Object[] id_break;
   public static Object[] id_byte;
   private static short[] id_case;
   private static byte[] id_catch;
   private static boolean[] id_private;

   @Override
   public List<rrvB> id_byte() {
      this.id_int();
      Predicate var1 = var1x -> {
         this.id_int();
         rrtY_2 var2 = ((rrvJ)this.id_break[0]).id_finally().id_extends();
         String var3 = var2.id_final();
         String var4 = var1x.id_break().id_byte();
         return var2.id_new() ? true : var4.toLowerCase().contains(var3.trim().toLowerCase());
      };
      return ((List)this.id_break[2]).stream().filter(var1).toList();
   }

   private void id_int() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
         var1[3] = 0;
      }
   }

   public rrZf_1(rrvJ var1, int var2, int var3) {
      this.id_int();
      ArrayList var14 = new ArrayList();
      this.id_break[2] = var14;
      this.id_break[0] = var1;
      Integer var16 = var2;
      this.id_break[3] = var16;
      rrZl_1 var17 = new rrZl_1(new rrZH(0.5F));
      this.id_break[1] = var17;
      Supplier var4 = () -> (float)var1.id_volatile().id_abstract() + (float)var2;
      Supplier var5 = () -> (float)var1.id_volatile().id_finally() + (float)var3;

      for (rrvP var9 : ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[0]).id_class()) {
         ((List)this.id_break[2]).add(new rrvB(this, var9, var4, var5, 75, 30));
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.id_int();
      short var7 = 252;
      boolean var8 = this.id_class(
         (Integer)rrvk_1.id_class[0],
         (Integer)rrvk_1.id_class[1],
         (float)(((rrvJ)this.id_break[0]).id_volatile().id_abstract() + (Integer)this.id_break[3]),
         (float)(((rrvJ)this.id_break[0]).id_volatile().id_finally() + 38),
         (float)(363 - (Integer)this.id_break[3] - 5),
         252.0F
      );
      this.id_finally().id_class(var8 && super.id_class(var1, var2, var3, var4, var6) ? true : id_private[8], var4, 25.0);
      return ((rrZl_1)this.id_break[1]).id_class(var1, var2, var3, var4, var6);
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      short var10 = 252;
      this.id_implements()
         .id_class(
            () -> {
               this.id_int();
               List var9x = this.id_byte();
               AnimValue var10x = this.id_implements().id_class();
               float var11 = 0.0F;
               float var12 = 0.0F;
               var10x.id_class(!this.ai_() ? true : id_private[13]);
               this.id_finally().id_class((float)this.id_break(), 257.0F);
               float var13 = var10x.id_byte();
               float var14 = (1.0F - var13) * 5.0F;

               for (int var15 = 0; var15 < var9x.size(); var15++) {
                  rrvB var16 = (rrvB)var9x.get(var15);
                  var11 += 83.0F;
                  if (var15 % 3 == 0) {
                     var11 = 0.0F;
                     var12 += 38.0F;
                  }

                  var16.id_class(var11, var12 + this.id_finally().id_case() + var14);
                  rruv_1 var17 = var16.id_protected();
                  if (!(var17.id_protected() < var4) && !(var17.id_protected() > var4 + 252.0F + 38.0F + 1.0F + 10.0F)) {
                     var16.id_class(var1, var2, var7, var8, var17, var9, false);
                  }
               }

               this.id_implements()
                  .id_class(
                     var1,
                     (rrZl_1)this.id_break[1],
                     var2,
                     var3 + var5 - 9.0F,
                     var4 + 4.0F + 38.0F,
                     var7,
                     var8,
                     5.0F,
                     251.0F,
                     (float)(this.id_break() - 6),
                     255,
                     var9
                  );
            },
            var1,
            var3,
            var4,
            363.0F,
            299.0F
         );
      rrvJ.id_class(var1, this.id_finally(), var3 + 100.0F + 1.0F, var4 + 30.0F + 4.0F, var4 + 252.0F + 38.0F - 10.0F, 253.0F, 20.0F);
      return true;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7020779580871425429L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -484963537;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_int();
      ClickGuiScreen var6 = ((rrvJ)this.id_break[0]).id_volatile();
      int var7 = var6.id_abstract();
      int var8 = var6.id_finally();
      if (!this.id_class(var2, var3, (float)(var7 + 100), (float)(var8 + 30 + 4), 263.0F, 266.0F)) {
         this.id_throws();
         return false;
      } else if (!super.id_class(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         ((rrZl_1)this.id_break[1]).id_class(var1, var2, var3, var4, var5);
         List var9 = this.id_byte();

         for (int var10 = var9.size() - 1; var10 >= 0; var10--) {
            rrvB var11 = (rrvB)var9.get(var10);
            if (var11.id_class(var1, var2, var3, var4, var5)) {
               return true;
            }
         }

         this.id_throws();
         return false;
      }
   }

   @Override
   public int id_break() {
      List var1 = this.id_byte();
      return var1.stream().filter(var1x -> var1.indexOf(var1x) % 3 == 0 ? true : id_private[10]).mapToInt(var0 -> var0.id_extends() + 8).sum();
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_int();
      ((rrZl_1)this.id_break[1]).id_break(var1, var2, var3);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, 38, 123, -40, 20, 70, 88, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrZH id_finally() {
      this.id_int();
      return ((rrZl_1)this.id_break[1]).id_extends();
   }

   public rrvJ id_extends() {
      this.id_int();
      return (rrvJ)this.id_break[0];
   }

   @Override
   public rrZl_1 id_case() {
      this.id_int();
      return (rrZl_1)this.id_break[1];
   }

   private static void id_continue() {
      id_case = new short[]{2, 0, 3, 1, 0, 2, 252, 0, 1, 1, 252, 0, 1, 0, 3, 0, 363, 3, 1, 1, 2, 1, 0, 1, 1, 0, 1, 255};
   }

   private static void id_new() {
      Object[] var0 = new Object[]{75, 30, 83, 38};
      id_byte = var0;
   }

   private static void id_package() {
      id_private = new boolean[]{false, true, false, false, true, true, false, true, false, true, false, true, true, false, false, false, false, false, true};
   }

   private static void id_super() {
      id_protected = new float[]{
         0.5F,
         363.0F,
         299.0F,
         100.0F,
         1.0F,
         30.0F,
         4.0F,
         252.0F,
         38.0F,
         10.0F,
         253.0F,
         20.0F,
         263.0F,
         266.0F,
         252.0F,
         0.0F,
         0.0F,
         257.0F,
         1.0F,
         5.0F,
         83.0F,
         0.0F,
         38.0F,
         252.0F,
         38.0F,
         1.0F,
         10.0F,
         9.0F,
         4.0F,
         38.0F,
         5.0F,
         251.0F
      };
   }

   @Override
   public void id_private() {
      this.id_int();
      super.id_private();
      ((rrZl_1)this.id_break[1]).id_private();
   }

   private static void id_final() {
      id_throws = new double[]{25.0};
   }

   private static void id_volatile() {
      id_catch = new byte[]{75, 30, 100, 30, 4, 38, 5, 8, 3, 3, 6, 4, 3, 4, 75, 30, 2, 83, 3, 38};
   }

   public rrZl_1 id_native() {
      this.id_int();
      return (rrZl_1)this.id_break[1];
   }
}
