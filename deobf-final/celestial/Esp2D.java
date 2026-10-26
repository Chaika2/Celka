package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class Esp2D extends Module {
   private static short[] protected_;
   private static String[] throws_;
   private static double[] catch_;
   private static byte[] private_;
   private static float[] implements_;
   public Object[] break_;
   private static boolean[] finally_;
   public static Object[] byte_;

   public Esp2D() {
      super("2D ESP", "WallHack на сущностей", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.while_();
      rrIk_1 var5 = new rrIk_1("Бокс", false);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Здоровье", true);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Предмет", true);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Неймтег", true);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Пинг", false).class_(((rrIk_1)this.break_[3])::class_);
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Броню", true);
      this.break_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Зачарования", true).class_(((rrIk_1)this.break_[5])::class_);
      this.break_[6] = var11;
      rrIk_1 var12 = new rrIk_1("Эффекты", true);
      this.break_[7] = var12;
      rrIk_1 var13 = new rrIk_1("Превью шалкера", true);
      this.break_[8] = var13;
      rrIm_1 var14 = new rrIm_1("Ширина", 1.0F, 0.5F, 2.0F, 0.5F).class_(() -> {
         this.while_();
         return !((rrIk_1)this.break_[0]).class_() && !((rrIk_1)this.break_[1]).class_() ? finally_[62] : finally_[61];
      });
      this.break_[9] = var14;
      CheckGroup var15 = new CheckGroup()
         .catch_(true)
         .case_(true)
         .throws_(true)
         .private_(true)
         .break_(true)
         .implements_(false)
         .byte_(false)
         .protected_(false)
         .class_(true);
      this.break_[10] = var15;
      rrfL_2 var16 = new rrfL_2()
         .class_(eY_2.class_, eY_2.volatile_, eY_2.new_, eY_2.public_, eY_2.this_, eY_2.synchronized_, eY_2.continue_, eY_2.import_, eY_2.implements_);
      this.break_[11] = var16;
      Int2ObjectOpenHashMap var17 = new Int2ObjectOpenHashMap();
      this.break_[12] = var17;
      rrTr_1 var18 = new rrTr_1();
      this.break_[13] = var18;
      this.class_(
         new Setting[]{
            new rrIc_1("Выбор целей", ((CheckGroup)this.break_[10]).byte_()),
            new rrIc_1(
               "Отображать",
               (rrIk_1)this.break_[0],
               (rrIk_1)this.break_[1],
               (rrIk_1)this.break_[3],
               (rrIk_1)this.break_[4],
               (rrIk_1)this.break_[5],
               (rrIk_1)this.break_[6],
               (rrIk_1)this.break_[7],
               (rrIk_1)this.break_[2],
               (rrIk_1)this.break_[8]
            ),
            (rrIm_1)this.break_[9]
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      implements_ = new float[]{
         1.0F,
         0.5F,
         2.0F,
         0.5F,
         0.0F,
         90.0F,
         180.0F,
         270.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         2.0F,
         2.0F,
         2.0F,
         1.0F,
         1.5F,
         1.5F,
         0.5F,
         2.0F,
         2.0F,
         2.0F,
         1.0F,
         2.0F,
         0.5F,
         2.0F,
         2.0F,
         0.9F,
         2.0F,
         3.0F,
         2.0F,
         1.0F,
         2.0F,
         2.0F,
         4.5F,
         5.0F,
         9.0F,
         0.5F,
         6.5F,
         1.0F,
         0.5F,
         5.0F,
         5.0F,
         5.0F,
         2.0F,
         3.0F,
         6.0F,
         2.0F,
         2.0F
      };
   }

   private void class_(Ml_1 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rrfD_2.class_(var1, (lD_2)rrfD_2.class_[7], var2, var3, var4, var5, var6, var7);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2084323977821850303L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -748681546;
   }

   private void class_(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      String var12 = rrjZ_2.class_(var8);
      float var13 = 0.5F;
      this.class_(var1, var4 - var13, var5 - var13, var6 + var13 * 2.0F, var7 + var13 * 2.0F, var11, var11);
      this.class_(var1, var4, var5 + var7 - var7 * var8, var6, var7 * var8, var9, var10);
      boolean var14 = var2.u_() < var2.SK() * 0.9F ? true : finally_[25];
      boolean var15 = var2 != (cb_3)import_.class_[57] && !(((cb_3)import_.class_[57]).int_(var2) < 900.0) ? finally_[27] : finally_[26];
      if (var14 && var15) {
         var3.byte_(var1, strictfp_, var12, (double)(var4 + var6 / 2.0F), (double)(var5 + var7 - var7 * var8 - 3.0F), rrZF.d_, false, false);
      }
   }

   private void class_(Ml_1 var1, rrZO var2, rgP_2 var3, float var4, float var5, float var6, float var7, int var8) {
      rrfD_2.class_(var1, (lD_2)rrfD_2.class_[7], var4, var5, var6, var7, var8);
      var2.break_(var1, var3, (double)(var4 + 1.0F), (double)(var5 + 2.0F), rrZF.d_, 255);
   }

   @EventTarget(
      id_class = -200
   )
   public void class_(rrnE_2 var1) {
      this.while_();
      ((rrTr_1)this.break_[13]).class_();
      boolean var2 = ((rrIk_1)this.break_[8]).class_();
      if (!((Int2ObjectMap)this.break_[12]).isEmpty() || var2 && ((rrTr_1)this.break_[13]).throws_()) {
         Ml_1 var3 = var1.class_();
         rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).break_();
         rjV_2 var5 = ((Hh_1)import_.class_[16]).volatile_();
         float var6 = var1.break_();
         if (var2 && ((rrTr_1)this.break_[13]).throws_()) {
            ((rrTr_1)this.break_[13]).class_(var5, var6);
         }

         int var7 = ColorHelper.class_(implements_[4]);
         int var8 = ColorHelper.class_(90.0F);
         int var9 = ColorHelper.class_(180.0F);
         int var10 = ColorHelper.class_(270.0F);
         float var11 = ((rrIm_1)this.break_[9]).byte_();
         var3.class_();
         var4.break_(strictfp_);
         rrfD_2.throws_((lD_2)rrfD_2.class_[7]);
         boolean var12 = ((rrIk_1)this.break_[0]).class_();
         boolean var13 = ((rrIk_1)this.break_[3]).class_();
         boolean var14 = ((rrIk_1)this.break_[4]).class_();
         boolean var15 = ((rrIk_1)this.break_[5]).class_();
         boolean var16 = ((rrIk_1)this.break_[7]).class_();
         boolean var17 = ((rrIk_1)this.break_[1]).class_();
         boolean var18 = ((rrIk_1)this.break_[2]).class_();
         ObjectIterator var19 = ((Int2ObjectMap)this.break_[12]).values().iterator();

         while (var19.hasNext()) {
            an_3 var20 = (an_3)var19.next();
            rji_3 var21 = rrfa_3.class_(var5, var20, var6);
            float var22 = var21.class_();
            float var23 = var21.break_();
            float var24 = var21.byte_();
            float var25 = var21.protected_();
            float var26 = var24 - var22;
            float var27 = var25 - var23;
            float var28 = 0.0F;
            float var29 = 0.0F;
            float var30 = 0.0F;
            float var31 = 0.0F;
            float var32 = 0.0F;
            rgN_2 var33 = null;
            if (rrff_3.class_(var20)) {
               var33 = new rgN_2("");
               var33.class_(rrjZ_2.byte_(var20));
               if (var13) {
                  var29 = (float)(var4.class_() + 2);
               }

               if (var20 instanceof iB_2 var34) {
                  float var35 = var34.Sd();
                  var32 = rrjZ_2.class_(var34);
                  String var36 = rgF_2.GRAY + " | " + rgF_2.RED + (int)var34.u_() + "ø";
                  String var37 = "";
                  if (var35 > 0.0F) {
                     var37 = rgF_2.GRAY + " | " + rgF_2.YELLOW + (int)var35 + "ù";
                  }

                  var33.break_(var36 + var37);
               }

               if (var14 && var20 instanceof cG_2 var38) {
                  Aw_1 var40 = var38.continue_();
                  if (var40 != null) {
                     var33.break_(rgF_2.GRAY + " | " + rgF_2.WHITE + var40.byte_() + "ms");
                  }
               }

               var28 = var4.break_(var33.getString()) + 2.0F;
               var30 = var22 + var26 / 2.0F - var28 / 2.0F - 1.0F;
               var31 = var23 - var29 - 1.5F;
            }

            if (var12) {
               this.class_(var3, var22, var23, var24, var25, var26, var27, var11, var7, var8, var9, var10, (Integer)byte_[0]);
            }

            if (var33 != null && var13 && !((rrTr_1)this.break_[13]).class_(var20.V())) {
               this.class_(var3, var4, var33, var30, var31, var28, var29, (Integer)byte_[0]);
            }

            if (var20 instanceof iB_2 var39) {
               if (var18) {
                  this.class_(var3, var39, var4, rpm_3.values(), var22, var24, var25);
               }

               if (var15) {
                  this.break_(var3, var39, var4, var22, var24, var31);
               }

               if (var16) {
                  this.class_(var3, var39, var4, var22, var23, var24);
               }

               if (var17) {
                  this.class_(var3, var39, var4, var22 - var11 - 1.5F, var23, var11, var27, var32, var7, var10, (Integer)byte_[0]);
               }
            }
         }

         rrfD_2.private_((lD_2)rrfD_2.class_[7]);
         var4.byte_(strictfp_);
         ((rrTr_1)this.break_[13]).class_(var3);
         var3.break_();
      }
   }

   public boolean class_(an_3 var1) {
      this.while_();
      aI_2 var2 = var1.BC();
      if (var2 != aI_2.break_ && var2 != aI_2.Q) {
         return this.aJ_() && ((rrIk_1)this.break_[3]).class_() && ((Int2ObjectMap)this.break_[12]).containsKey(var1.V()) ? false : finally_[60];
      } else {
         return finally_[58];
      }
   }

   private void class_(Ml_1 var1, iB_2 var2, rrZO var3, rpm_3[] var4, float var5, float var6, float var7) {
      float var8 = var5 + (var6 - var5) / 2.0F;
      float var9 = var7 + 3.0F;

      for (rpm_3 var13 : var4) {
         rdn_3 var14 = var2.protected_(var13);
         if (!var14.class_()) {
            StringBuilder var15 = new StringBuilder(var14.continue_().byte_());
            if (var14.char_() > 1) {
               var15.append(" ").append(rgF_2.RED).append("x").append(var14.char_());
            }

            var3.byte_(var1, strictfp_, var15.toString(), (double)var8, (double)var9, rrZF.d_, false, false);
            var9 += 6.0F;
         }
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.while_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((Int2ObjectMap)this.break_[12]).clear();
         ((rrTr_1)this.break_[13]).break_();
         ObjectIterator var2 = ((gm_3)import_.class_[56]).return_().int2ObjectEntrySet().iterator();

         while (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            an_3 var4 = (an_3)var3.getValue();
            int var5 = var3.getIntKey();
            if (this.break_(var4)) {
               ((Int2ObjectMap)this.break_[12]).put(var5, var4);
            }

            if (var4 instanceof rsE_2 var6 && var6.protected_().break_() instanceof rxJ_2 var7 && var7.catch_() instanceof Wp_1) {
               ((rrTr_1)this.break_[13]).class_(var6);
            }
         }

         ((rrTr_1)this.break_[13]).byte_();
      }
   }

   private void class_(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6) {
      Collection var7 = var2.So();
      if (!var7.isEmpty()) {
         String var8 = rAB.break_(var7);
         float var9 = var4 + (var6 - var4) + 2.0F;
         float var10 = var5 + 1.0F;
         var3.class_(var1, var8, (double)var9, (double)var10, rrZF.d_, 10, false, false);
      }
   }

   private void class_(Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12) {
      rrfD_2.byte_(var1, (lD_2)rrfD_2.class_[7], var2 + var8, var3, var6 - var8 * 2.0F, var8, var9, var10);
      rrfD_2.class_(var1, (lD_2)rrfD_2.class_[7], var2, var3, var8, var7, var9, var12);
      rrfD_2.byte_(var1, (lD_2)rrfD_2.class_[7], var2 + var8, var5 - var8, var6 - var8 * 2.0F, var8, var12, var11);
      rrfD_2.class_(var1, (lD_2)rrfD_2.class_[7], var4 - var8, var3, var8, var7, var10, var11);
   }

   private void class_(
      Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13
   ) {
      float var14 = 0.5F;
      this.class_(
         var1,
         var2 - var14,
         var3 - var14,
         var4 + var14,
         var5 + var14,
         var6 + var14 * 2.0F,
         var7 + var14 * 2.0F,
         var8 + var14 * 2.0F,
         var13,
         var13,
         var13,
         var13
      );
      this.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   private void break_(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6) {
      this.while_();
      ArrayList var7 = new ArrayList();
      rdn_3 var8 = var2.ss();
      rdn_3 var9 = var2.Sn();
      if (!var8.class_()) {
         var7.add(var8);
      }

      for (rdn_3 var11 : var2.PV()) {
         if (!var11.class_()) {
            var7.add(var11);
         }
      }

      if (!var9.class_()) {
         var7.add(var9);
      }

      int var23 = var7.size();
      byte var24 = 10;
      float var12 = var4 + (var5 - var4) / 2.0F - (float)(var24 * (var23 - 1)) / 2.0F - 4.5F;
      float var13 = var12 + (float)(var24 * (var23 - 1)) + 5.0F;

      for (int var14 = 0; var14 < var7.size(); var14++) {
         rdn_3 var15 = (rdn_3)var7.get(var14);
         rdb_3 var16 = var15.break_();
         float var17 = var12 + (float)(var14 * var24);
         float var18 = var6 - 9.0F;
         rrfD_2.class_(
            var1,
            (lD_2)rrfD_2.class_[7],
            var15,
            var17,
            var18,
            var16 == rdy_3.kL ? true : finally_[36],
            (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[3] ? true : finally_[38],
            implements_[39],
            6.5F,
            8
         );
         if (((rrIk_1)this.break_[6]).class_()
            && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[3]) {
            Pair var19 = ((rrfL_2)this.break_[11]).class_(var15);
            String var20 = (String)var19.getLeft();
            int var21 = (Integer)var19.getRight();
            float var22 = var18 - (float)(var21 * 5) + 1.0F;
            var3.class_(var1, var20, (double)(var17 + 0.5F), (double)var22, rrZF.d_, 10, false, false);
         }

         if (var8.char_() > 1) {
            var3.byte_(var1, strictfp_, "x" + var8.char_(), (double)(var12 + 5.0F), (double)(var18 + 5.0F), rrZF.d_, false, false);
         }

         if (var9.char_() > 1) {
            var3.byte_(var1, strictfp_, "x" + var9.char_(), (double)var13, (double)(var18 + 5.0F), rrZF.d_, false, false);
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, -55, 67, 119, -94, -59, -83, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean break_(an_3 var1) {
      this.while_();
      if (var1 == null) {
         return false;
      } else if (var1 == (cb_3)import_.class_[57] && ((Qw_1)import_.class_[20]).volatile_() == VZ.FIRST_PERSON) {
         return false;
      } else if (!var1.Pu()) {
         return false;
      } else {
         aI_2 var2 = var1.BC();
         if (var2 == aI_2.break_ || var2 == aI_2.Q) {
            return finally_[54];
         } else if (!rrff_3.class_(var1, (CheckGroup)this.break_[10])) {
            return false;
         } else {
            return !rrfo_3.class_(var1) ? false : finally_[57];
         }
      }
   }

   @Override
   public void throws_(boolean var1) {
      this.while_();
      super.throws_(var1);
      ((Int2ObjectMap)this.break_[12]).clear();
      ((rrTr_1)this.break_[13]).protected_();
   }

   private static void goto_() {
      Object[] var0 = new Object[]{-1275068416};
      byte_ = var0;
   }

   private static void continue_() {
      finally_ = new boolean[]{
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false
      };
   }

   private static void else_() {
      catch_ = new double[]{900.0};
   }

   private static void return_() {
      protected_ = new short[]{
         2,
         0,
         1,
         2,
         3,
         3,
         4,
         5,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         10,
         0,
         1,
         3,
         4,
         5,
         6,
         7,
         2,
         8,
         9,
         0,
         12,
         13,
         56,
         12,
         13,
         13,
         13,
         8,
         12,
         13,
         0,
         16,
         13,
         13,
         9,
         7,
         0,
         3,
         4,
         5,
         7,
         1,
         2,
         12,
         0,
         13,
         0,
         0,
         7,
         13,
         12,
         13,
         7,
         255,
         57,
         57,
         7,
         1,
         3,
         6,
         1,
         2,
         1,
         3,
         11,
         7,
         7,
         7,
         7,
         7,
         57,
         20,
         10,
         3,
         12,
         0,
         1,
         180
      };
   }

   private static void super_() {
      throws_ = new String[]{
         new String("2D ESP"),
         new String("WallHack на сущностей"),
         new String("Бокс"),
         new String("Здоровье"),
         new String("Предмет"),
         new String("Неймтег"),
         new String("Пинг"),
         new String("Броню"),
         new String("Зачарования"),
         new String("Эффекты"),
         new String("Превью шалкера"),
         new String("Ширина"),
         new String("Выбор целей"),
         new String("Отображать"),
         new String(""),
         new String(""),
         new String(" "),
         new String("x")
      };
   }

   private void while_() {
      if (this.break_ == null) {
         this.break_ = new Object[14];
      }
   }

   private static void public_() {
      private_ = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 3, 9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 10, 10, 8, 5, 10, 14};
   }
}
