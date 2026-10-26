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
      this.id_break[id_case[0]] = var7;
      this.id_break[id_case[1]] = var1;
      rrZl_1 var9 = new rrZl_1(new rrZH(id_private[0])).id_native();
      this.id_break[id_case[2]] = var9;
      AnimValue var10 = new AnimValue(id_private[1], id_catch[0]);
      this.id_break[id_case[3]] = var10;
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
      return id_private[25];
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_package();
      ClickGuiScreen var6 = ((rrvJ)this.id_break[id_case[46]]).id_volatile();
      List var7 = ((rruL)this.id_break[id_case[47]]).id_class();
      int var8 = var6.id_finally();

      for (int var9 = var7.size() - id_catch[13]; var9 >= 0; var9--) {
         rruF var10 = (rruF)var7.get(var9);
         float var11 = var10.id_class().id_protected();
         if (!(var11 < (float)var8 + (Float)this.id_break[id_case[48]] - id_private[21] + id_private[22])
            && !(var11 > (float)var8 + (Float)this.id_break[id_case[49]] + id_private[23] - id_private[24])
            && var10.id_class().id_break((float)var2, (float)var3)
            && var10.id_class(var1, var2, var3, var4, var5)) {
            return id_catch[14];
         }
      }

      ((rruL)this.id_break[id_case[50]]).id_break();
      return !((rrZl_1)this.id_break[id_case[51]]).id_class(var1, var2, var3, var4, var5) && !super.id_class(var1, var2, var3, var4, var5)
         ? id_catch[16]
         : id_catch[15];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7997946208726075749L;
   }

   public void id_class(int var1) {
      this.id_package();
      ClickGuiScreen var2 = ((rrvJ)this.id_break[id_case[4]]).id_volatile();
      byte var3 = id_catch[1];

      for (int var4 = id_catch[2]; var4 < ((Category[])id_byte[id_case[5]]).length; var4++) {
         Category var5 = ((Category[])id_byte[id_case[6]])[var4];
         String var6 = var5.id_class();
         if (var4 > 0 && !((Category[])id_byte[id_case[7]])[var4 - id_catch[3]].id_class().equals(var6)) {
            var3 += 15;
         }

         float var7 = (float)var3;
         rrZn_1 var8 = new rrZn_1(
               var5,
               ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[8]]).id_throws(),
               var5::id_byte,
               () -> new rjK_2(id_private[37], id_private[38]),
               () -> new rjK_2(id_private[35], id_private[36]),
               () -> rrZF.d_,
               var5::id_protected,
               () -> {
                  this.id_package();
                  return new rjK_2(
                     (float)(var2.id_abstract() + id_throws[3]) + (Float)this.id_break[id_case[60]],
                     (float)(var2.id_finally() + id_throws[4]) + (Float)this.id_break[id_case[61]] + var7 + (float)(var5.ordinal() * id_throws[5])
                  );
               },
               () -> new rjK_2((float)(var1 - id_throws[2]), id_private[34]),
               () -> new rjK_2(id_private[32], id_private[33]),
               () -> rrZF.d_,
               () -> new rji_3(
                     (float)ColorHelper.id_class(id_private[28]),
                     (float)ColorHelper.id_class(id_private[29]),
                     (float)ColorHelper.id_class(id_private[30]),
                     (float)ColorHelper.id_class(id_private[31])
                  )
            )
            .<rrup_1>id_break(ClickGuiTheme::id_class)
            .<rrup_1>id_byte(id_catch[4])
            .id_class(id_private[2]);
         rruL var10000 = (rruL)this.id_break[id_case[9]];
         rruF[] var10001 = new rruF[id_catch[5]];
         var10001[id_catch[6]] = new rruF(var8)
            .id_class(() -> (Category)id_byte[id_case[59]] != var5 ? id_catch[19] : id_catch[20])
            .id_class(() -> id_class(var2, var5));
         var10000.id_class(var10001);

         for (rruF var10 : ((rruL)this.id_break[id_case[10]]).id_class()) {
            rruu_1 var12 = var10.id_case();
            if (var12 instanceof rrZn_1) {
               rrZn_1 var11 = (rrZn_1)var12;
               Category var13 = var11.id_this();
               if (!((Map)id_byte[id_case[11]]).containsKey(var13.id_class())) {
                  ((Map)id_byte[id_case[12]]).put(var6, var10.id_class().id_protected());
               }
            }
         }
      }
   }

   public static void id_class(ClickGuiScreen var0, Category var1) {
      if (var1 != (Category)id_byte[id_case[13]]) {
         rrvJ var2 = var0.id_interface();
         rrZN var3 = var2.id_class(var1);
         if (var3.aj_()) {
            id_byte[id_case[14]] = var1;
            id_byte[id_case[15]] = var0;
         }
      }
   }

   @Override
   public float id_class(boolean var1) {
      this.id_package();
      float var2 = id_private[26];

      for (rruF var4 : ((rruL)this.id_break[id_case[57]]).id_class()) {
         var2 += var4.id_class().id_class() + id_private[27];
      }

      return var2 + (float)(((Map)id_byte[id_case[58]]).size() * id_throws[1]);
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.id_package();
      id_else();
      Float var23 = var6 - id_private[4];
      this.id_break[id_case[26]] = var23;
      Float var24 = id_private[5];
      this.id_break[id_case[27]] = var24;
      Boolean var25 = this.id_class(
               (Integer)rrvk_1.id_class[id_case[28]],
               (Integer)rrvk_1.id_class[id_case[29]],
               var3 + id_private[6] - id_private[7],
               var4 + id_private[8] - id_private[9],
               id_private[10],
               (Float)this.id_break[id_case[30]] - id_private[11]
            )
            && super.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9)
         ? id_catch[9]
         : id_catch[10];
      this.id_break[id_case[31]] = var25;
      float var10 = this.id_class(id_catch[11]);
      float var11 = this.id_class();
      rrZH var12 = ((rrZl_1)this.id_break[id_case[32]]).id_extends();
      var12.id_class(var10, var11);
      Float var26 = var12.id_case();
      this.id_break[id_case[33]] = var26;
      rrvJ.id_class(var1, var3, var4, (int)var5, (int)var6 - id_throws[0]);

      for (rruF var14 : ((rruL)this.id_break[id_case[34]]).id_class()) {
         float var15 = var14.id_class().id_protected();
         if (!(var15 < var4 + (Float)this.id_break[id_case[35]] - id_private[12] + id_private[13])
            && !(var15 > var4 + (Float)this.id_break[id_case[36]] + id_private[14] - id_private[15])) {
            var14.id_class(var1, var2, var7, var8, var9);
         }
      }

      rrZO var27 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[37]]).id_native();

      for (Entry var29 : ((Map)id_byte[id_case[38]]).entrySet()) {
         String var16 = (String)var29.getKey();
         float var17 = (Float)var29.getValue();
         float var18 = var4 + (Float)this.id_break[id_case[39]] - id_private[16] + var17;
         if (!(var18 < var4 + (Float)this.id_break[id_case[40]] - id_private[17]) && !(var18 > var4 + (Float)this.id_break[id_case[41]] + id_private[18])) {
            var27.id_byte(var1, var16, var3 + (Float)this.id_break[id_case[42]] + id_private[19], var18, rrZF.k_);
         }
      }

      rrvJ.id_final();
      rrvJ.id_class(
         var1,
         ((rrZl_1)this.id_break[id_case[43]]).id_extends(),
         var3,
         var4 + (Float)this.id_break[id_case[44]],
         var4 + (Float)this.id_break[id_case[45]],
         var5,
         id_private[20]
      );
      return id_catch[12];
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.id_package();
      ((rrZl_1)this.id_break[id_case[52]])
         .id_extends()
         .id_class(this.id_break[id_case[53]] && super.id_class(var1, var2, var3, var4, var6) ? id_catch[17] : id_catch[18], var4, id_protected[0]);
      return ((rrZl_1)this.id_break[id_case[54]]).id_class(var1, var2, var3, var4, var6);
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_package();
      super.id_break(var1, var2, var3);
      ((rrZl_1)this.id_break[id_case[55]]).id_break(var1, var2, var3);
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
      if ((Category)id_byte[id_case[16]] != null && (ClickGuiScreen)id_byte[id_case[17]] != null) {
         rrvJ var0 = ((ClickGuiScreen)id_byte[id_case[18]]).id_interface();
         rrZN var1 = var0.id_class((Category)id_byte[id_case[19]]);
         if (!var1.ai_()) {
            if (var1.id_implements().id_class().id_byte() >= id_private[3]) {
               var1.d_(id_catch[7]);
            }
         } else if (var1.ak_()) {
            var1.d_(id_catch[8]);
            var0.id_class((Category)id_byte[id_case[20]], (Category)id_byte[id_case[21]]);
            Category var6 = (Category)id_byte[id_case[22]];
            id_byte[id_case[23]] = var6;
            Object var7 = null;
            id_byte[id_case[24]] = var7;
            Object var8 = null;
            id_byte[id_case[25]] = var8;
         }
      }
   }

   private void id_package() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[10]];
         Object[] var1 = this.id_break;
         var1[id_throws[11]] = id_private[39];
         var1[id_throws[12]] = id_private[40];
         var1[id_throws[13]] = id_catch[21];
         var1[id_throws[14]] = id_private[41];
         var1[id_throws[15]] = id_private[42];
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
      ((rrZl_1)this.id_break[id_case[56]]).id_private();
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
