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
   private static byte[] id_byte;
   public static Object[] id_class;
   private static float[] id_protected;
   private static String[] id_throws;
   private static short[] id_case;
   private static int[] id_catch;
   private static boolean[] id_private;
   public Object[] id_break;
   private static long[] id_implements;

   @Override
   public rdn_3 id_byte() {
      this.id_extends();
      return (rdn_3)this.id_break[9];
   }

   private static void id_int() {
      id_catch = new int[]{6781311};
   }

   public rrZg_1(rrZj_1 var1, rrNF var2, Supplier<Float> var3, Supplier<Float> var4, float var5, float var6) {
      this.id_extends();
      AnimValue var18 = new AnimValue(0.5F, true);
      this.id_break[8] = var18;
      ArrayList var19 = new ArrayList();
      this.id_break[12] = var19;
      this.id_break[0] = var1;
      this.id_break[2] = var3;
      this.id_break[3] = var4;
      Float var23 = var5;
      this.id_break[6] = var23;
      Float var24 = var6;
      this.id_break[7] = var24;
      this.id_break[1] = var2;
      rrNd_1 var7 = ((rrNF)this.id_break[1]).id_break();
      rrNw_1 var8 = var7.id_break();
      rrNL var9 = ((rrNF)this.id_break[1]).id_class();
      if (var8 != null) {
         rdn_3 var10 = var8.id_protected();
         int var11 = var10.id_char();
         rdn_3 var26 = var7.id_package() == null ? var7.id_catch().id_continue() : var7.id_package();
         this.id_break[10] = var26;
         String var27 = var7.id_case() + (var11 > 1 ? rgF_2.RED + " x" + var11 : id_throws[0]);
         this.id_break[11] = var27;
         this.id_class(var7, var8, var11, var9);
         int var12 = ((List)this.id_break[12]).size() + (this.id_break[14] ? 1 : id_private[3]);
         int var13 = Math.max(0, var12 - 1);
         Float var28 = var6 + (float)var13 * 9.0F;
         this.id_break[7] = var28;
      }
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_case = new short[]{
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
   public rrZN id_class() {
      this.id_extends();
      return (rrZj_1)this.id_break[0];
   }

   private static String id_class(String var0, String var1) {
      return (String)id_class[1] + var0 + ": " + (String)id_class[2] + var1;
   }

   public void id_class(float var1) {
      this.id_extends();
      Float var6 = var1;
      this.id_break[5] = var6;
   }

   private static String id_class(Number var0) {
      return "$" + rql_3.id_class(var0, ' ');
   }

   private static String id_class(long var0) {
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

   private void id_class(rrNd_1 var1, rrNw_1 var2, int var3, rrNL var4) {
      this.id_extends();
      int var5 = var2.id_case();
      int var6 = var1.id_else();
      switch (((int[])SyntheticSwitch.id_class[0])[var4.ordinal()]) {
         case 1:
            String var7 = id_class(Integer.valueOf(var5));
            if (var3 > 1) {
               var7 = var7 + " (" + id_class(Float.valueOf((float)var5 / (float)var3)) + " шт.)";
            }

            ((List)this.id_break[12]).add(id_class("Куплено за", var7));
            if (var6 > 0) {
               int var8 = var6 * var3;
               if (var8 > var5) {
                  int var9 = var8 - var5;
                  float var10 = (float)var9 / (float)var8 * 100.0F;
                  ((List)this.id_break[12])
                     .add(
                        id_class(
                           "Лимит",
                           (String)id_class[2]
                              + id_class(Integer.valueOf(var8))
                              + (String)id_class[1]
                              + ", выгода "
                              + rgF_2.GREEN
                              + id_class(Integer.valueOf(var9))
                              + " ("
                              + ((DecimalFormat)id_class[3]).format((double)var10)
                              + "%)"
                        )
                     );
               }
            }

            Long var15 = System.currentTimeMillis();
            this.id_break[13] = var15;
            Boolean var16 = true;
            this.id_break[14] = var16;
            break;
         case 2:
            ((List)this.id_break[12]).add(rgF_2.RED + "Не удалось купить");
            ((List)this.id_break[12]).add(id_class("Цена", id_class(Integer.valueOf(var5))));
            if (var6 > 0) {
               ((List)this.id_break[12]).add(id_class("Лимит", id_class(Integer.valueOf(var6))));
            }

            Long var17 = System.currentTimeMillis();
            this.id_break[13] = var17;
            Boolean var18 = true;
            this.id_break[14] = var18;
            break;
         case 3:
            ((List)this.id_break[12]).add(rgF_2.YELLOW + "В ожидании");
            if (var6 > 0) {
               ((List)this.id_break[12]).add(id_class("Лимит", id_class(Integer.valueOf(var6))));
            }

            if (var3 > 1) {
               ((List)this.id_break[12]).add(id_class("Кол-во", String.valueOf(var3)));
            }
      }
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.id_extends();
      super.id_class(var1, var2, var3, var4, var5, var6, var7);
      if ((rdn_3)this.id_break[10] != null && (String)this.id_break[11] != null && !((List)this.id_break[12]).isEmpty()) {
         rrZO var8 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally();
         rrZO var9 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
         float var10 = var5.id_break();
         float var11 = var5.id_protected();
         int var12 = (int)var5.id_byte();
         int var13 = (int)var5.id_class();
         float var14 = ((rrZj_1)this.id_break[0]).id_implements().id_class().id_byte();
         int var15 = (int)(255.0F * ((AnimValue)this.id_break[8]).id_byte() * var14);
         int var16 = ColorHelper.id_break((Integer)rrZI.id_break[4], var15);
         int var17 = ColorHelper.id_break(rrZF.d_, var15);
         int var18 = ColorHelper.id_break(6781311, var15);
         rrfD_2.id_break(var1, var10, var11, (float)var12, (float)var13, 4.0F, var16, var16, var16, var16);
         id_short.id_class(var1, (rdn_3)this.id_break[10], var10 + 3.0F, var11 + 5.0F, ((AnimValue)this.id_break[8]).id_byte() * var14);
         var8.id_protected(var1, (String)this.id_break[11], var10 + 22.0F, var11 + 7.0F, var17, false);
         float var19 = var11 + 16.0F;

         for (String var21 : (List)this.id_break[12]) {
            var9.id_protected(var1, var21, var10 + 22.0F, var19, var18, false);
            var19 += 9.0F;
         }

         if ((Boolean)this.id_break[14]) {
            var9.id_protected(var1, id_class("Время", id_class(((Long)this.id_break[13]).longValue())), var10 + 22.0F, var19, var18, false);
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 121, 11, 60, -59, -14, 12, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 203241156;
   }

   public void id_break(float var1) {
      this.id_extends();
      Float var6 = var1;
      this.id_break[4] = var6;
   }

   public float id_break() {
      this.id_extends();
      return (Float)this.id_break[6];
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3592077170712039717L;
   }

   @Override
   public void id_break(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.id_extends();
      super.id_break(var1, var2, var3, var4, var5, var6, var7);
      if (var5.id_break((float)var3, (float)var4) && ((rrZj_1)this.id_break[0]).id_class(var3, var4) && !rrtu_3.id_class(var2, var3, var4)) {
         rdn_3 var12 = (rdn_3)this.id_break[10];
         this.id_break[9] = var12;
      } else {
         Object var13 = null;
         this.id_break[9] = var13;
      }
   }

   public float id_throws() {
      this.id_extends();
      return (Float)((Supplier)this.id_break[3]).get() + (Float)this.id_break[5];
   }

   public float id_finally() {
      this.id_extends();
      return (Float)((Supplier)this.id_break[2]).get() + (Float)this.id_break[4];
   }

   public AnimValue id_catch() {
      this.id_extends();
      return (AnimValue)this.id_break[8];
   }

   private void id_extends() {
      if (this.id_break == null) {
         this.id_break = new Object[15];
         Object[] var1 = this.id_break;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = 0.0F;
         var1[7] = 0.0F;
         var1[13] = 0L;
         var1[14] = false;
      }
   }

   public rrNF id_case() {
      this.id_extends();
      return (rrNF)this.id_break[1];
   }

   private static void id_continue() {
      id_protected = new float[]{0.5F, 9.0F, 100.0F, 255.0F, 4.0F, 3.0F, 5.0F, 22.0F, 7.0F, 16.0F, 22.0F, 9.0F, 22.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F};
   }

   public long id_implements() {
      this.id_extends();
      return (Long)this.id_break[13];
   }

   private static void id_new() {
      id_private = new boolean[]{true, true, true, false, false, true, true, true, true, true, false, false, false, true, false, false};
   }

   private static void id_package() {
      id_throws = new String[]{
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

   private static void id_super() {
      id_byte = new byte[]{32, 2, 3, 15, 4, 5, 6, 7, 13, 14, 4};
   }

   @Override
   public rruv_1 id_protected() {
      this.id_extends();
      float var1 = this.id_break();
      Pair var2 = ((rrZj_1)this.id_break[0]).id_implements().id_class(((rrZj_1)this.id_break[0]).id_case());
      float var3 = 8.0F * (Float)var2.getLeft();
      if ((Boolean)var2.getRight()) {
         var1 -= var3;
      }

      return new rruv_1(this.id_finally(), this.id_throws(), var1, this.id_private());
   }

   public float id_private() {
      this.id_extends();
      return (Float)this.id_break[7];
   }

   private static void id_volatile() {
      Object[] var0 = new Object[]{0.0F, new String("§7"), new String("§f"), new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(Locale.US))};
      id_class = var0;
   }

   private static void id_native() {
      id_implements = new long[]{0L, 1000L, 60L, 60L, 60L, 60L, 24L, 24L, 0L};
   }
}
