package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZK extends rrZN implements rrZT, rrZq_1<GuiComponent> {
   private static double[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;
   private static short[] id_case;
   private static float[] id_catch;
   public static Object[] id_byte;
   private static byte[] id_private;

   @Override
   public void id_byte(int var1, int var2, int var3) {
      super.id_byte(var1, var2, var3);
      this.id_byte().forEach(var3x -> var3x.id_break(var1, var2, var3));
   }

   @Override
   public List<GuiComponent> id_byte() {
      this.id_package();
      rrtY_2 var1 = ((rrvJ)this.id_break[1]).id_finally().id_extends();
      rrfq_3 var2 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_byte();
      Predicate var3 = var2x -> {
         if (var2x instanceof rrZY var3x) {
            rrNd_1 var4 = var3x.id_break();
            if (var2 != null && var4.id_finally() != null && var4.id_finally() != var2) {
               return false;
            } else if (var1.id_new()) {
               return true;
            } else {
               String var5 = var4.id_case();
               String var6 = var1.id_final();
               return var5.toLowerCase().contains(var6.toLowerCase());
            }
         } else {
            return id_throws[12];
         }
      };
      return ((List)this.id_break[2]).stream().filter(var3).toList();
   }

   private static void id_int() {
      Object[] var0 = new Object[]{15, 26, 32};
      id_byte = var0;
   }

   public rrZK(rrvJ var1, rrtu_3 var2, float var3, float var4) {
      this.id_package();
      ArrayList var16 = new ArrayList();
      this.id_break[2] = var16;
      rruL var17 = new rruL();
      this.id_break[3] = var17;
      this.id_break[1] = var1;
      Float var19 = var3;
      this.id_break[0] = var19;
      rrZl_1 var20 = new rrZl_1(new rrZH(0.5F));
      this.id_break[4] = var20;
      ClickGuiScreen var5 = var1.id_volatile();
      Supplier var6 = () -> (float)var5.id_abstract() + var3;
      Supplier var7 = () -> (float)var5.id_finally() + var4;
      float var8 = 363.0F - var3 - 7.0F;
      float var9 = 26.0F;

      for (rrNd_1 var11 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_extends()) {
         ((List)this.id_break[2]).add(new rrZY(this, var11, var2, var5, var6, var7, var8, var9));
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.id_package();
      ClickGuiScreen var7 = ((rrvJ)this.id_break[1]).id_volatile();
      int var8 = id_volatile();
      int var9 = id_class(var8);
      boolean var10 = this.id_class(
         (Integer)rrvk_1.id_class[0],
         (Integer)rrvk_1.id_class[1],
         (float)var7.id_abstract() + (Float)this.id_break[0],
         (float)(var7.id_finally() + var8),
         363.0F - (Float)this.id_break[0] - 5.0F,
         (float)var9
      );
      ((rrZl_1)this.id_break[4]).id_extends().id_class(var10 && super.id_class(var1, var2, var3, var4, var6) ? true : id_throws[7], var4, 25.0);
      this.id_byte().forEach(var7x -> var7x.id_class(var1, var2, var3, var4, var10, var6));
      return false;
   }

   @Override
   public void id_class(Category var1, Category var2) {
      this.id_package();
      super.id_class(var1, var2);
      ((List)this.id_break[2]).forEach(var2x -> var2x.id_class(var1, var2));
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      super.id_class(var1, var2, var3);
      return this.id_byte().stream().anyMatch(var3x -> var3x.id_class(var1, var2, var3));
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.id_package();
      rrZH var10 = ((rrZl_1)this.id_break[4]).id_extends();
      int var11 = this.id_break();
      int var12 = id_volatile();
      int var13 = id_class(var12);
      this.id_implements()
         .id_class(
            () -> {
               this.id_package();
               List var13x = this.id_byte();
               AnimValue var14 = this.id_implements().id_class();
               float var15 = 0.0F;
               var14.id_class(!this.ai_() ? true : id_throws[14]);
               var10.id_class((float)var11, (float)(var13 + 5));
               float var16 = var14.id_byte();
               float var17 = (1.0F - var16) * 5.0F;

               for (int var18 = 0; var18 < var13x.size(); var18++) {
                  GuiComponent var19 = (GuiComponent)var13x.get(var18);
                  if (var19 instanceof rrZY var20) {
                     var20.id_class(false);
                     if (var18 == 0 || var13x.get(var18 - 1) instanceof rrZY var21 && var21.id_break().id_continue() != var20.id_break().id_continue()) {
                        var20.id_class(true);
                     }

                     var15 += (float)var12;
                     if (var20.id_volatile()) {
                        var15 += 15.0F;
                     }

                     var20.id_break(var15 + var10.id_case() + var17);
                     AnimValue var24 = var20.id_private();
                     var24.id_class(!var20.id_private().id_new() ? true : id_throws[20]);
                  }

                  rruv_1 var23 = var19.id_protected();
                  var19.id_break(var1, var2, var7, var8, var23, var9, false);
                  if (!(var23.id_protected() < var4) && !(var23.id_protected() > var4 + (float)var13 + (float)var12 + 10.0F)) {
                     var19.id_class(var1, var2, var7, var8, var23, var9, false);
                  }
               }

               this.id_implements()
                  .id_class(
                     var1,
                     (rrZl_1)this.id_break[4],
                     var2,
                     var3 + var5 - 9.0F,
                     var4 + 10.0F + (float)var12,
                     var7,
                     var8,
                     5.0F,
                     (float)(var13 - 7),
                     (float)(var11 - 12),
                     255,
                     var9
                  );
            },
            var1,
            var3 + 100.0F + 1.0F,
            var4,
            262.0F,
            299.0F
         );
      rrvJ.id_class(var1, var10, var3 + 100.0F + 1.0F, var4 + 30.0F + 4.0F, var4 + (float)var13 + (float)var12 - 10.0F, 253.0F, 20.0F);
      ((rruL)this.id_break[3]).id_class(var1, var2, var7, var8, var9, false);
      return true;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 247219459095133036L;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_package();
      if (((rruL)this.id_break[3]).id_class(var1, var2, var3, var4, var5)) {
         this.id_throws();
      }

      if (!this.id_class(var2, var3)) {
         this.id_throws();
         return false;
      } else if (!super.id_class(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         ((rrZl_1)this.id_break[4]).id_class(var1, var2, var3, var4, var5);
         List var6 = this.id_byte();

         for (int var7 = var6.size() - 1; var7 >= 0; var7--) {
            GuiComponent var8 = (GuiComponent)var6.get(var7);
            var8.id_class(var1, var2, var3, var4, var5);
         }

         return id_throws[5];
      }
   }

   public boolean id_class(int var1, int var2) {
      this.id_package();
      ClickGuiScreen var3 = ((rrvJ)this.id_break[1]).id_volatile();
      int var4 = var3.id_abstract();
      int var5 = var3.id_finally();
      return this.id_class(var1, var2, (float)(var4 + 100), (float)(var5 + 30 + 4), 263.0F, 266.0F);
   }

   private static int id_class(int var0) {
      return 300 - var0 - 10;
   }

   @Override
   public boolean id_class(char var1, int var2) {
      super.id_class(var1, var2);
      return this.id_byte().stream().anyMatch(var2x -> var2x.id_class(var1, var2));
   }

   @Override
   public int id_break() {
      List var1 = this.id_byte();
      int var2 = 0;

      for (GuiComponent var4 : var1) {
         if (var4 instanceof rrZY) {
            rrZY var5 = (rrZY)var4;
            if (var5.id_volatile()) {
               var2 += 15;
            }

            var2 += (int)(var4.id_protected().id_class() + 6.0F);
         }
      }

      return var2 + 6;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, -12, 104, -2, -74, 10, 104, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_package();
      super.id_break(var1, var2, var3);
      ((rrZl_1)this.id_break[4]).id_break(var1, var2, var3);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1859741664;
   }

   @Override
   public void id_throws() {
      super.id_throws();
      this.id_byte().forEach(GuiComponent::an_);
   }

   private static void id_finally() {
      id_protected = new double[]{25.0};
   }

   @Override
   public void id_catch() {
      this.id_package();
      super.id_catch();
      ((List)this.id_break[2]).forEach(GuiComponent::am_);
   }

   private static void id_extends() {
      id_case = new short[]{2, 3, 1, 0, 4, 0, 2, 4, 3, 3, 4, 1, 0, 1, 0, 0, 4, 1, 0, 2, 4, 2, 2, 4, 2, 2, 4, 1, 300, 4, 255};
   }

   @Override
   public rrZl_1 id_case() {
      this.id_package();
      return (rrZl_1)this.id_break[4];
   }

   private static void id_new() {
      id_private = new byte[]{6, 100, 30, 4, 32, 10, 5, 7, 12, 5, 3, 15, 26, 2, 32};
   }

   private void id_package() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
         Object[] var1 = this.id_break;
         var1[0] = 0.0F;
      }
   }

   @Override
   public void id_protected() {
      this.id_package();
      super.id_protected();
      ((List)this.id_break[2]).forEach(GuiComponent::al_);
   }

   @Override
   public void id_private() {
      this.id_package();
      super.id_private();
      ((rrZl_1)this.id_break[4]).id_private();
      ((List)this.id_break[2]).forEach(GuiComponent::id_final);
   }

   private static void id_final() {
      id_catch = new float[]{
         0.5F,
         363.0F,
         7.0F,
         26.0F,
         100.0F,
         1.0F,
         262.0F,
         299.0F,
         100.0F,
         1.0F,
         30.0F,
         4.0F,
         10.0F,
         253.0F,
         20.0F,
         363.0F,
         5.0F,
         6.0F,
         263.0F,
         266.0F,
         0.0F,
         1.0F,
         5.0F,
         15.0F,
         10.0F,
         9.0F,
         10.0F,
         5.0F,
         0.0F
      };
   }

   private static int id_volatile() {
      return 32;
   }

   private static void id_native() {
      id_throws = new boolean[]{
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   @Override
   public rdn_3 ag_() {
      for (GuiComponent var2 : this.id_byte()) {
         rdn_3 var3 = var2.id_byte();
         if (var3 != null) {
            return var3;
         }
      }

      return null;
   }
}
