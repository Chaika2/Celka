package celestial;

import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZg_1 extends GuiComponent {
   private static byte[] byte_;
   public static Object[] class_;
   private static float[] protected_;
   private static String[] throws_;
   private static short[] case_;
   private static int[] catch_;
   private static boolean[] private_;
   public Object[] break_;
   private static long[] implements_;

   @Override
   public rdn_3 byte_() {
      this.extends_();
      return (rdn_3)this.break_[9];
   }

   private static void int_() {
      catch_ = new int[]{6781311};
   }

   public rrZg_1(rrZj_1 var1, rrNF var2, Supplier<Float> var3, Supplier<Float> var4, float var5, float var6) {
      this.extends_();
      AnimValue var18 = new AnimValue(0.5F, true);
      this.break_[8] = var18;
      ArrayList var19 = new ArrayList();
      this.break_[12] = var19;
      this.break_[0] = var1;
      this.break_[2] = var3;
      this.break_[3] = var4;
      Float var23 = var5;
      this.break_[6] = var23;
      Float var24 = var6;
      this.break_[7] = var24;
      this.break_[1] = var2;
      rrNd_1 var7 = ((rrNF)this.break_[1]).break_();
      rrNw_1 var8 = var7.break_();
      rrNL var9 = ((rrNF)this.break_[1]).class_();
      if (var8 != null) {
         rdn_3 var10 = var8.protected_();
         int var11 = var10.char_();
         rdn_3 var26 = var7.package_() == null ? var7.catch_().continue_() : var7.package_();
         this.break_[10] = var26;
         String var27 = var7.case_() + (var11 > 1 ? rgF_2.RED + " x" + var11 : throws_[0]);
         this.break_[11] = var27;
         this.class_(var7, var8, var11, var9);
         int var12 = ((List)this.break_[12]).size() + (this.break_[14] ? 1 : private_[3]);
         int var13 = Math.max(0, var12 - 1);
         Float var28 = var6 + (float)var13 * 9.0F;
         this.break_[7] = var28;
      }
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      case_ = new short[]{
         8,
         12,
         0,
         2,
         3,
         6,
         7,
         1,
         1,
         1,
         10,
         11,
         12,
         14,
         7,
         0,
         12,
         12,
         2,
         1,
         3,
         13,
         14,
         12,
         12,
         12,
         13,
         14,
         12,
         12,
         12,
         1,
         2,
         10,
         11,
         12,
         0,
         0,
         0,
         8,
         4,
         10,
         8,
         11,
         12,
         14,
         13,
         0,
         10,
         9,
         9,
         0,
         0,
         0,
         9,
         13,
         2,
         4,
         3,
         5,
         6,
         7,
         4,
         5,
         8,
         1
      };
   }

   @Override
   public rrZN class_() {
      this.extends_();
      return (rrZj_1)this.break_[0];
   }

   private static String class_(String var0, String var1) {
      return (String)class_[1] + var0 + ": " + (String)class_[2] + var1;
   }

   public void class_(float var1) {
      this.extends_();
      Float var6 = var1;
      this.break_[5] = var6;
   }

   private static String class_(Number var0) {
      return "$" + rql_3.class_(var0, ' ');
   }

   private static String class_(long var0) {
      long var2 = Math.max(0L, System.currentTimeMillis() - var0);
      long var4 = var2 / 1000L;
      if (var4 < 60L) {
         return var4 + " сек. назад";
      } else {
         long var6 = var4 / 60L;
         if (var6 < 60L) {
            return var6 + " мин. назад";
         } else {
            long var8 = var6 / 60L;
            return var8 < 24L ? var8 + " ч. назад" : var8 / 24L + " дн. назад";
         }
      }
   }

   private void class_(rrNd_1 var1, rrNw_1 var2, int var3, rrNL var4) {
      this.extends_();
      int var5 = var2.case_();
      int var6 = var1.else_();
      switch (((int[])SyntheticSwitch.class_[0])[var4.ordinal()]) {
         case 1:
            String var7 = class_(Integer.valueOf(var5));
            if (var3 > 1) {
               var7 = var7 + " (" + class_(Float.valueOf((float)var5 / (float)var3)) + " шт.)";
            }

            ((List)this.break_[12]).add(class_("Куплено за", var7));
            if (var6 > 0) {
               int var8 = var6 * var3;
               if (var8 > var5) {
                  int var9 = var8 - var5;
                  float var10 = (float)var9 / (float)var8 * 100.0F;
                  ((List)this.break_[12])
                     .add(
                        class_(
                           "Лимит",
                           (String)class_[2]
                              + class_(Integer.valueOf(var8))
                              + (String)class_[1]
                              + ", выгода "
                              + rgF_2.GREEN
                              + class_(Integer.valueOf(var9))
                              + " ("
                              + ((DecimalFormat)class_[3]).format((double)var10)
                              + "%)"
                        )
                     );
               }
            }

            Long var15 = System.currentTimeMillis();
            this.break_[13] = var15;
            Boolean var16 = true;
            this.break_[14] = var16;
            break;
         case 2:
            ((List)this.break_[12]).add(rgF_2.RED + "Не удалось купить");
            ((List)this.break_[12]).add(class_("Цена", class_(Integer.valueOf(var5))));
            if (var6 > 0) {
               ((List)this.break_[12]).add(class_("Лимит", class_(Integer.valueOf(var6))));
            }

            Long var17 = System.currentTimeMillis();
            this.break_[13] = var17;
            Boolean var18 = true;
            this.break_[14] = var18;
            break;
         case 3:
            ((List)this.break_[12]).add(rgF_2.YELLOW + "В ожидании");
            if (var6 > 0) {
               ((List)this.break_[12]).add(class_("Лимит", class_(Integer.valueOf(var6))));
            }

            if (var3 > 1) {
               ((List)this.break_[12]).add(class_("Кол-во", String.valueOf(var3)));
            }
      }
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.extends_();
      super.class_(var1, var2, var3, var4, var5, var6, var7);
      if ((rdn_3)this.break_[10] != null && (String)this.break_[11] != null && !((List)this.break_[12]).isEmpty()) {
         rrZO var8 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
         rrZO var9 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
         float var10 = var5.break_();
         float var11 = var5.protected_();
         int var12 = (int)var5.byte_();
         int var13 = (int)var5.class_();
         float var14 = ((rrZj_1)this.break_[0]).implements_().class_().byte_();
         int var15 = (int)(255.0F * ((AnimValue)this.break_[8]).byte_() * var14);
         int var16 = ColorHelper.break_((Integer)rrZI.break_[4], var15);
         int var17 = ColorHelper.break_(rrZF.d_, var15);
         int var18 = ColorHelper.break_(6781311, var15);
         rrfD_2.break_(var1, var10, var11, (float)var12, (float)var13, 4.0F, var16, var16, var16, var16);
         short_.class_(var1, (rdn_3)this.break_[10], var10 + 3.0F, var11 + 5.0F, ((AnimValue)this.break_[8]).byte_() * var14);
         var8.protected_(var1, (String)this.break_[11], var10 + 22.0F, var11 + 7.0F, var17, false);
         float var19 = var11 + 16.0F;

         for (String var21 : (List)this.break_[12]) {
            var9.protected_(var1, var21, var10 + 22.0F, var19, var18, false);
            var19 += 9.0F;
         }

         if ((Boolean)this.break_[14]) {
            var9.protected_(var1, class_("Время", class_(((Long)this.break_[13]).longValue())), var10 + 22.0F, var19, var18, false);
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 121, 11, 60, -59, -14, 12, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 203241156;
   }

   public void break_(float var1) {
      this.extends_();
      Float var6 = var1;
      this.break_[4] = var6;
   }

   public float break_() {
      this.extends_();
      return (Float)this.break_[6];
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3592077170712039717L;
   }

   @Override
   public void break_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.extends_();
      super.break_(var1, var2, var3, var4, var5, var6, var7);
      if (var5.break_((float)var3, (float)var4) && ((rrZj_1)this.break_[0]).class_(var3, var4) && !rrtu_3.class_(var2, var3, var4)) {
         rdn_3 var12 = (rdn_3)this.break_[10];
         this.break_[9] = var12;
      } else {
         Object var13 = null;
         this.break_[9] = var13;
      }
   }

   public float throws_() {
      this.extends_();
      return (Float)((Supplier)this.break_[3]).get() + (Float)this.break_[5];
   }

   public float finally_() {
      this.extends_();
      return (Float)((Supplier)this.break_[2]).get() + (Float)this.break_[4];
   }

   public AnimValue catch_() {
      this.extends_();
      return (AnimValue)this.break_[8];
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[15];
         Object[] var1 = this.break_;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = 0.0F;
         var1[7] = 0.0F;
         var1[13] = 0L;
         var1[14] = false;
      }
   }

   public rrNF case_() {
      this.extends_();
      return (rrNF)this.break_[1];
   }

   private static void continue_() {
      protected_ = new float[]{0.5F, 9.0F, 100.0F, 255.0F, 4.0F, 3.0F, 5.0F, 22.0F, 7.0F, 16.0F, 22.0F, 9.0F, 22.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F};
   }

   public long implements_() {
      this.extends_();
      return (Long)this.break_[13];
   }

   private static void new_() {
      private_ = new boolean[]{true, true, true, false, false, true, true, true, true, true, false, false, false, true, false, false};
   }

   private static void package_() {
      throws_ = new String[]{
         new String(""),
         new String("Куплено за"),
         new String("Лимит"),
         new String("Цена"),
         new String("Лимит"),
         new String("Лимит"),
         new String("Кол-во"),
         new String("Время"),
         new String("#.#")
      };
   }

   private static void super_() {
      byte_ = new byte[]{32, 2, 3, 15, 4, 5, 6, 7, 13, 14, 4};
   }

   @Override
   public rruv_1 protected_() {
      this.extends_();
      float var1 = this.break_();
      Pair var2 = ((rrZj_1)this.break_[0]).implements_().class_(((rrZj_1)this.break_[0]).case_());
      float var3 = 8.0F * (Float)var2.getLeft();
      if ((Boolean)var2.getRight()) {
         var1 -= var3;
      }

      return new rruv_1(this.finally_(), this.throws_(), var1, this.private_());
   }

   public float private_() {
      this.extends_();
      return (Float)this.break_[7];
   }

   private static void volatile_() {
      Object[] var0 = new Object[]{0.0F, new String("§7"), new String("§f"), new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(Locale.US))};
      class_ = var0;
   }

   private static void native_() {
      implements_ = new long[]{0L, 1000L, 60L, 60L, 60L, 60L, 24L, 24L, 0L};
   }
}
