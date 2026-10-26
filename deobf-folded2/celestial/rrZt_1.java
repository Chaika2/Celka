package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZt_1 extends rrZN implements rrZA {
   private static double[] id_protected;
   public Object[] id_break;
   public static Object[] id_byte;
   private static byte[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;
   private static float[] id_private;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1473538746;
   }

   private static void id_int() {
      id_case = new short[]{
         1,
         0,
         2,
         3,
         0,
         8,
         8,
         8,
         0,
         1,
         1,
         9,
         9,
         5,
         6,
         7,
         6,
         7,
         7,
         5,
         5,
         6,
         6,
         5,
         6,
         7,
         8,
         7,
         0,
         1,
         8,
         6,
         2,
         5,
         1,
         7,
         8,
         0,
         9,
         5,
         7,
         8,
         4,
         2,
         7,
         8,
         0,
         1,
         7,
         8,
         1,
         2,
         2,
         6,
         2,
         2,
         2,
         1,
         9,
         5,
         4,
         5
      };
   }

   public rrZt_1(rrvJ var1, int var2) {
      this.id_package();
      rruL var7 = new rruL();
      this.id_break[1] = var7;
      this.id_break[0] = var1;
      rrZl_1 var9 = new rrZl_1(new rrZH(0.5F)).id_native();
      this.id_break[2] = var9;
      AnimValue var10 = new AnimValue(0.5F, false);
      this.id_break[3] = var10;
      this.id_class(var2);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new byte[]{25, 15, 12, 5, 52, 25, 2, 5, 8, 9, 9, 4, 5, 6, 7, 8, 10, 5, 52, 2, 15, 3, 25, 4, 20};
   }

   @Override
   public float id_class() {
      return 235.0F;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_package();
      ClickGuiScreen var6 = ((rrvJ)this.id_break[0]).id_volatile();
      List var7 = ((rruL)this.id_break[1]).id_class();
      int var8 = var6.id_finally();

      for (int var9 = var7.size() - 1; var9 >= 0; var9--) {
         rruF var10 = (rruF)var7.get(var9);
         float var11 = var10.id_class().id_protected();
         if (!(var11 < (float)var8 + (Float)this.id_break[7] - 20.0F + 5.0F)
            && !(var11 > (float)var8 + (Float)this.id_break[8] + 20.0F - 5.0F)
            && var10.id_class().id_break((float)var2, (float)var3)
            && var10.id_class(var1, var2, var3, var4, var5)) {
            return true;
         }
      }

      ((rruL)this.id_break[1]).id_break();
      return !((rrZl_1)this.id_break[2]).id_class(var1, var2, var3, var4, var5) && !super.id_class(var1, var2, var3, var4, var5) ? id_catch[16] : id_catch[15];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7997946208726075749L;
   }

   public void id_class(int var1) {
      this.id_package();
      ClickGuiScreen var2 = ((rrvJ)this.id_break[0]).id_volatile();
      byte var3 = 0;

      for (int var4 = 0; var4 < ((Category[])id_byte[8]).length; var4++) {
         Category var5 = ((Category[])id_byte[8])[var4];
         String var6 = var5.id_class();
         if (var4 > 0 && !((Category[])id_byte[8])[var4 - 1].id_class().equals(var6)) {
            var3 += 15;
         }

         float var7 = (float)var3;
         rrZn_1 var8 = new rrZn_1(
               var5,
               ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_throws(),
               var5::id_byte,
               () -> new rjK_2(2.0F, 3.0F),
               () -> new rjK_2(14.0F, 14.0F),
               () -> rrZF.d_,
               var5::id_protected,
               () -> {
                  this.id_package();
                  return new rjK_2(
                     (float)(var2.id_abstract() + 5) + (Float)this.id_break[4],
                     (float)(var2.id_finally() + 52) + (Float)this.id_break[5] + var7 + (float)(var5.ordinal() * 25)
                  );
               },
               () -> new rjK_2((float)(var1 - 12), 20.0F),
               () -> new rjK_2(20.0F, 8.0F),
               () -> rrZF.d_,
               () -> new rji_3(
                     (float)ColorHelper.id_class(0.0F),
                     (float)ColorHelper.id_class(90.0F),
                     (float)ColorHelper.id_class(270.0F),
                     (float)ColorHelper.id_class(180.0F)
                  )
            )
            .<rrup_1>id_break(ClickGuiTheme::id_class)
            .<rrup_1>id_byte(true)
            .id_class(0.3F);
         ((rruL)this.id_break[1])
            .id_class(new rruF(var8).id_class(() -> (Category)id_byte[5] != var5 ? true : id_catch[20]).id_class(() -> id_class(var2, var5)));

         for (rruF var10 : ((rruL)this.id_break[1]).id_class()) {
            rruu_1 var12 = var10.id_case();
            if (var12 instanceof rrZn_1) {
               rrZn_1 var11 = (rrZn_1)var12;
               Category var13 = var11.id_this();
               if (!((Map)id_byte[9]).containsKey(var13.id_class())) {
                  ((Map)id_byte[9]).put(var6, var10.id_class().id_protected());
               }
            }
         }
      }
   }

   public static void id_class(ClickGuiScreen var0, Category var1) {
      if (var1 != (Category)id_byte[5]) {
         rrvJ var2 = var0.id_interface();
         rrZN var3 = var2.id_class(var1);
         if (var3.aj_()) {
            id_byte[6] = var1;
            id_byte[7] = var0;
         }
      }
   }

   @Override
   public float id_class(boolean var1) {
      this.id_package();
      float var2 = 0.0F;

      for (rruF var4 : ((rruL)this.id_break[1]).id_class()) {
         var2 += var4.id_class().id_class() + 5.0F;
      }

      return var2 + (float)(((Map)id_byte[9]).size() * 15);
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.id_package();
      id_else();
      Float var23 = var6 - 50.0F;
      this.id_break[8] = var23;
      Float var24 = 35.0F;
      this.id_break[7] = var24;
      Boolean var25 = this.id_class(
               (Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var3 + 5.0F - 5.0F, var4 + 52.0F - 20.0F, 100.0F, (Float)this.id_break[8] - 10.0F
            )
            && super.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9)
         ? true
         : id_catch[10];
      this.id_break[6] = var25;
      float var10 = this.id_class(false);
      float var11 = this.id_class();
      rrZH var12 = ((rrZl_1)this.id_break[2]).id_extends();
      var12.id_class(var10, var11);
      Float var26 = var12.id_case();
      this.id_break[5] = var26;
      rrvJ.id_class(var1, var3, var4, (int)var5, (int)var6 - 25);

      for (rruF var14 : ((rruL)this.id_break[1]).id_class()) {
         float var15 = var14.id_class().id_protected();
         if (!(var15 < var4 + (Float)this.id_break[7] - 20.0F + 5.0F) && !(var15 > var4 + (Float)this.id_break[8] + 20.0F - 5.0F)) {
            var14.id_class(var1, var2, var7, var8, var9);
         }
      }

      rrZO var27 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_native();

      for (Entry var29 : ((Map)id_byte[9]).entrySet()) {
         String var16 = (String)var29.getKey();
         float var17 = (Float)var29.getValue();
         float var18 = var4 + (Float)this.id_break[5] - 10.0F + var17;
         if (!(var18 < var4 + (Float)this.id_break[7] - 10.0F) && !(var18 > var4 + (Float)this.id_break[8] + 10.0F)) {
            var27.id_byte(var1, var16, var3 + (Float)this.id_break[4] + 5.0F, var18, rrZF.k_);
         }
      }

      rrvJ.id_final();
      rrvJ.id_class(var1, ((rrZl_1)this.id_break[2]).id_extends(), var3, var4 + (Float)this.id_break[7], var4 + (Float)this.id_break[8], var5, 25.0F);
      return true;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.id_package();
      ((rrZl_1)this.id_break[2]).id_extends().id_class(this.id_break[6] && super.id_class(var1, var2, var3, var4, var6) ? true : id_catch[18], var4, 25.0);
      return ((rrZl_1)this.id_break[2]).id_class(var1, var2, var3, var4, var6);
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_package();
      super.id_break(var1, var2, var3);
      ((rrZl_1)this.id_break[2]).id_break(var1, var2, var3);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, 36, -31, 119, 15, 120, 99, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_catch = new boolean[]{
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private static void id_else() {
      if ((Category)id_byte[6] != null && (ClickGuiScreen)id_byte[7] != null) {
         rrvJ var0 = ((ClickGuiScreen)id_byte[7]).id_interface();
         rrZN var1 = var0.id_class((Category)id_byte[5]);
         if (!var1.ai_()) {
            if (var1.id_implements().id_class().id_byte() >= 1.0F) {
               var1.d_(true);
            }
         } else if (var1.ak_()) {
            var1.d_(false);
            var0.id_class((Category)id_byte[5], (Category)id_byte[6]);
            Category var6 = (Category)id_byte[6];
            id_byte[5] = var6;
            Object var7 = null;
            id_byte[6] = var7;
            Object var8 = null;
            id_byte[7] = var8;
         }
      }
   }

   private void id_package() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
         Object[] var1 = this.id_break;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = false;
         var1[7] = 0.0F;
         var1[8] = 0.0F;
      }
   }

   private static void id_return() {
      Object[] var0 = new Object[10];
      var0[0] = 5;
      var0[1] = 52;
      var0[2] = 15;
      var0[3] = 25;
      var0[4] = 20;
      var0[5] = Category.valueOf("RENDER");
      Category[] var2 = new Category[]{
         Category.valueOf("COMBAT"),
         Category.valueOf("MOVEMENT"),
         Category.valueOf("RENDER"),
         Category.valueOf("PLAYER"),
         Category.valueOf("UTIL"),
         Category.valueOf("CONFIGS"),
         Category.valueOf("THEMES"),
         Category.valueOf("AUTOBUY_ITEMS"),
         Category.valueOf("AUTOBUY_HISTORY")
      };
      var0[8] = var2;
      var0[9] = new HashMap();
      id_byte = var0;
   }

   @Override
   public void id_private() {
      this.id_package();
      super.id_private();
      ((rrZl_1)this.id_break[2]).id_private();
   }

   private static void id_volatile() {
      id_private = new float[]{
         0.5F,
         0.5F,
         0.3F,
         1.0F,
         50.0F,
         35.0F,
         5.0F,
         5.0F,
         52.0F,
         20.0F,
         100.0F,
         10.0F,
         20.0F,
         5.0F,
         20.0F,
         5.0F,
         10.0F,
         10.0F,
         10.0F,
         5.0F,
         25.0F,
         20.0F,
         5.0F,
         20.0F,
         5.0F,
         235.0F,
         0.0F,
         5.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         20.0F,
         8.0F,
         20.0F,
         14.0F,
         14.0F,
         2.0F,
         3.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private static void id_synchronized() {
      id_protected = new double[]{25.0};
   }
}
