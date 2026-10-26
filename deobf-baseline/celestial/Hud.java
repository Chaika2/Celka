package celestial;

import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Hud extends Module {
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static float[] id_catch;
   private static byte[] id_private;
   public static Object[] id_break;
   private static String[] id_implements;
   public Object[] id_byte;

   private static void id_boolean() {
      id_private = new byte[]{2, 9, 2, 3, 2, 4, 5, 6, 7, 4, 2, 3, 8, 4, 2, 3, 18, 16, 16, 16, 20, 20, 9, 2, 18, 17, 4, 3, 8};
   }

   private boolean id_char() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[81]]).id_class();
   }

   private static void id_long() {
      Object[] var0 = new Object[]{
         FontManager.id_class("montserrat", 13.0F, false),
         FontManager.id_class("montserrat", 13.0F, false),
         FontManager.id_class("montserrat", 13.0F, false),
         8
      };
      id_break = var0;
   }

   public Hud() {
      super(id_implements[0], id_implements[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_import();
      rrIk_1 var5 = new rrIk_1(id_implements[2], id_protected[0]);
      this.id_byte[id_throws[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_implements[3], id_protected[1]);
      this.id_byte[id_throws[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_implements[4], id_protected[2]);
      this.id_byte[id_throws[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_implements[5], id_protected[3]);
      this.id_byte[id_throws[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_implements[6], id_protected[4]);
      this.id_byte[id_throws[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_implements[7], id_protected[5]);
      this.id_byte[id_throws[6]] = var10;
      rrIk_1 var11 = new rrIk_1(id_implements[8], id_protected[6]);
      this.id_byte[id_throws[7]] = var11;
      rrIk_1 var12 = new rrIk_1(id_implements[9], id_protected[7]);
      this.id_byte[id_throws[8]] = var12;
      rrIk_1 var13 = new rrIk_1(id_implements[10], id_protected[8]);
      this.id_byte[id_throws[9]] = var13;
      rrIk_1 var14 = new rrIk_1(id_implements[11], id_protected[9]);
      this.id_byte[id_throws[10]] = var14;
      rrIk_1 var15 = new rrIk_1(id_implements[12], id_protected[10]);
      this.id_byte[id_throws[11]] = var15;
      rrIk_1 var16 = new rrIk_1(id_implements[13], id_protected[11]);
      this.id_byte[id_throws[12]] = var16;
      String var10003 = id_implements[14];
      String var10004 = id_implements[15];
      String[] var10005 = new String[id_private[0]];
      var10005[id_protected[12]] = id_implements[16];
      var10005[id_protected[13]] = id_implements[17];
      rrIQ var17 = new rrIQ(var10003, var10004, var10005).id_class(this::id_this);
      this.id_byte[id_throws[13]] = var17;
      List var18 = List.of(
         new rrqH_2(
            () -> new StringBuilder(id_implements[35])
                  .append(rgF_2.GRAY)
                  .append((int)((cb_3)id_import.id_class[id_throws[92]]).rx())
                  .append(id_implements[36])
                  .append((int)((cb_3)id_import.id_class[id_throws[93]]).re())
                  .append(id_implements[37])
                  .append((int)((cb_3)id_import.id_class[id_throws[94]]).BO()),
            this::id_continue
         ),
         new rrqH_2(() -> new StringBuilder(id_implements[34]).append(rgF_2.GRAY).append(rrfj_3.id_case()), this::id_char),
         new rrqH_2(() -> new StringBuilder(id_implements[33]).append(rgF_2.GRAY).append(((Integer)QY.id_break[id_throws[91]]).intValue()), this::id_instanceof),
         new rrqH_2(() -> new StringBuilder(id_implements[32]).append(rgF_2.GRAY).append(rrfp_3.id_protected()), this::id_interface)
      );
      this.id_byte[id_throws[14]] = var18;
      AnimValue var19 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[15]], id_catch[0], id_protected[14]);
      this.id_byte[id_throws[16]] = var19;
      AnimValue var20 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[17]], id_catch[1], id_protected[15]);
      this.id_byte[id_throws[18]] = var20;
      Setting[] var10001 = new Setting[id_private[1]];
      byte var21 = id_protected[16];
      String var10006 = id_implements[18];
      Setting[] var10007 = new Setting[id_protected[17]];
      var10007[id_protected[18]] = (rrIk_1)this.id_byte[id_throws[19]];
      var10001[var21] = new GroupSetting(var10006, var10007);
      byte var22 = id_protected[19];
      var10006 = id_implements[19];
      var10007 = new Setting[id_protected[20]];
      var10007[id_protected[21]] = (rrIk_1)this.id_byte[id_throws[20]];
      var10001[var22] = new GroupSetting(var10006, var10007);
      byte var23 = id_private[2];
      var10006 = id_implements[20];
      var10007 = new Setting[id_protected[22]];
      var10007[id_protected[23]] = (rrIk_1)this.id_byte[id_throws[21]];
      var10001[var23] = new GroupSetting(var10006, var10007);
      byte var24 = id_private[3];
      var10006 = id_implements[21];
      var10007 = new Setting[id_private[4]];
      var10007[id_protected[24]] = (rrIk_1)this.id_byte[id_throws[22]];
      var10007[id_protected[25]] = (rrIQ)this.id_byte[id_throws[23]];
      var10001[var24] = new GroupSetting(var10006, var10007);
      byte var25 = id_private[5];
      var10006 = id_implements[22];
      var10007 = new Setting[id_protected[26]];
      var10007[id_protected[27]] = (rrIk_1)this.id_byte[id_throws[24]];
      var10001[var25] = new GroupSetting(var10006, var10007);
      byte var26 = id_private[6];
      var10006 = id_implements[23];
      var10007 = new Setting[id_protected[28]];
      var10007[id_protected[29]] = (rrIk_1)this.id_byte[id_throws[25]];
      var10001[var26] = new GroupSetting(var10006, var10007);
      byte var27 = id_private[7];
      var10006 = id_implements[24];
      var10007 = new Setting[id_protected[30]];
      var10007[id_protected[31]] = (rrIk_1)this.id_byte[id_throws[26]];
      var10001[var27] = new GroupSetting(var10006, var10007);
      byte var28 = id_private[8];
      var10006 = id_implements[25];
      var10007 = new Setting[id_private[9]];
      var10007[id_protected[32]] = (rrIk_1)this.id_byte[id_throws[27]];
      var10007[id_protected[33]] = (rrIk_1)this.id_byte[id_throws[28]];
      var10007[id_private[10]] = (rrIk_1)this.id_byte[id_throws[29]];
      var10007[id_private[11]] = (rrIk_1)this.id_byte[id_throws[30]];
      var10001[var28] = new GroupSetting(var10006, var10007);
      byte var29 = id_private[12];
      var10006 = id_implements[26];
      var10007 = new Setting[id_protected[34]];
      var10007[id_protected[35]] = (rrIk_1)this.id_byte[id_throws[31]];
      var10001[var29] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   public boolean id_this() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[83]]).id_class();
   }

   public boolean id_interface() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[82]]).id_class();
   }

   private void id_class(Ml_1 var1, rrZO var2, float var3, float var4) {
      this.id_import();
      ((AnimValue)this.id_byte[id_throws[69]]).id_break(this.id_default());
      var4 -= ((AnimValue)this.id_byte[id_throws[70]]).id_byte();

      for (rrqH_2 var6 : (List)this.id_byte[id_throws[71]]) {
         var6.id_byte();
         AnimValue var7 = var6.id_throws();
         if (var7.id_case()) {
            float var8 = var7.id_byte();
            var2.id_class(
               var1,
               id_strictfp,
               ((StringBuilder)((Supplier)var6.id_class[id_throws[72]]).get()).toString(),
               (double)var3,
               (double)var4,
               ColorHelper.id_class((float)(((List)this.id_byte[id_throws[73]]).indexOf(var6) * id_private[20]), (int)(id_catch[25] * var8))
            );
            var4 -= var6.id_break();
         }
      }
   }

   private void id_class(Ml_1 var1, float var2, float var3, float var4) {
      this.id_import();
      if (!((cb_3)id_import.id_class[id_throws[58]]).id_implements()
         && !((cb_3)id_import.id_class[id_throws[59]]).id_native()
         && ((Ax_1)id_import.id_class[id_throws[60]]).id_class()) {
         ((AnimValue)this.id_byte[id_throws[61]]).id_break((float)((cq_3)id_import.id_class[id_throws[62]]).id_int());
         var4 += ((AnimValue)this.id_byte[id_throws[63]]).id_byte();
         int var5 = (int)(var3 / id_catch[23] + id_catch[24]);
         byte var6 = id_private[17];
         rqs_3 var7 = ((rhz_3)((cb_3)id_import.id_class[id_throws[64]]).id_implements[id_throws[65]]).id_break;
         int var8 = var7.size();
         int var9 = var8 - id_protected[39];

         for (int var10 = id_protected[40]; var10 < var8; var10++) {
            rXQ var11 = rJT.id_finally[var10];
            rdn_3 var12 = (rdn_3)var7.get(var9 - var10);
            float var13 = (float)(var5 + var10 * var6);
            if (var12.id_class()) {
               Pair var14 = Pair.of(rJT.id_class, rJT.id_implements[var11.id_break()]);
               fj_3 var15 = id_import.id_class((rqO_2)var14.getFirst()).apply((rqO_2)var14.getSecond());
               id_import.A().id_class(var15.id_extends().id_protected());
               ch_3.id_class(var1, var13, var4, ((cq_3)id_import.id_class[id_throws[66]]).h_(), id_private[18], id_private[19], var15);
            } else {
               ((cq_3)id_import.id_class[id_throws[67]]).id_class(var13, var4, var2, (cb_3)id_import.id_class[id_throws[68]], var12, id_protected[41]);
               RenderSystem.disableDepthTest();
            }
         }

         RenderSystem.enableDepthTest();
      }
   }

   private void id_class(Ml_1 var1, rrZO var2, float var3, float var4, int var5, int var6, int var7, int var8) {
      this.id_import();
      String var9 = (String)rrQJ.id_class[id_throws[52]];
      rrfD_2.id_class(
         var1, var3, var4, (Float)this.id_byte[id_throws[53]], (float)var2.id_class() + id_catch[14], id_throws[54], var5, var6, var7, var8, id_protected[38]
      );
      var2.id_byte(var1, var9, var3 + id_catch[15], var4 + id_catch[16], ColorHelper.id_class(id_catch[17], id_throws[55]));
      var2.id_byte(var1, (String)this.id_byte[id_throws[56]], var3 + id_catch[18], var4 + id_catch[19], rrZF.d_);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1705112962;
   }

   private void id_class(Ml_1 var1, Collection<rLY> var2, rrZO var3, float var4, float var5, float var6, float var7) {
      List var8 = Ordering.natural().sortedCopy(var2);

      for (int var9 = id_protected[42]; var9 < var8.size(); var9++) {
         rLY var10 = (rLY)var8.get(var9);
         int var11 = ColorHelper.id_class((float)(var9 * id_private[21]), id_throws[74]);
         String var12 = id_implements[27];
         if (var10.id_byte() >= id_protected[43] && var10.id_byte() <= id_private[22]) {
            var12 = jI_2.id_class("enchantment.level." + (var10.id_byte() + id_protected[44]));
         }

         StringBuilder var13 = new StringBuilder()
            .append(var10.id_final())
            .append(id_implements[28])
            .append(var12)
            .append(id_implements[29])
            .append(rgF_2.GRAY)
            .append(rLK.id_class(var10, id_catch[26]));
         String var14 = var13.toString();
         String var15 = var10.id_final() + " " + var12;
         float var16 = var7 * (float)var9;
         rrfD_2.id_class(var1, var4, var5 + var16, var3.id_break(var15) + id_catch[27], var6, id_throws[75], var11, var11, var11, var11, id_protected[46]);
         var3.id_class(var1, var14, (double)(var4 + id_catch[28]), (double)(var5 + var16 + id_catch[29]), rrZF.d_, id_protected[47], id_protected[48]);
         rrfD_2.id_class(var1, var10.id_class(), var4 + id_catch[30], var5 + var16 + id_catch[31], id_catch[32]);
      }
   }

   public void id_class(Ml_1 var1, float var2) {
      this.id_import();
      if (this.aJ_() && ((rrIk_1)this.id_byte[id_throws[51]]).id_class()) {
         float var3 = (float)id_const.id_super();
         float var4 = (float)id_const.id_this();
         this.id_class(var1, var2, var3, var4 - id_catch[13]);
      }
   }

   @EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_import();
      Ml_1 var2 = var1.id_class();
      float var3 = (float)((int)id_const.id_final());
      int var4 = ColorHelper.id_class(id_catch[2], id_throws[32]);
      int var5 = ColorHelper.id_class(id_catch[3], id_throws[33]);
      int var6 = ColorHelper.id_class(id_catch[4], id_throws[34]);
      int var7 = ColorHelper.id_class(id_catch[5], id_throws[35]);
      if (((rrIk_1)this.id_byte[id_throws[36]]).id_class() && !((Qw_1)id_import.id_class[id_throws[37]]).R) {
         this.id_class(var2, (rrZO)id_break[id_throws[38]], id_catch[6], id_catch[7], var4, var5, var6, var7);
      }

      if (((rrIk_1)this.id_byte[id_throws[39]]).id_class() && this.id_public()) {
         this.id_break(var2, (rrZO)id_break[id_throws[40]], id_catch[8], var3 / id_catch[9]);
      }

      var2.id_class();
      ((rrZO)id_break[id_throws[41]]).id_break(id_strictfp);
      this.id_class(var2, (rrZO)id_break[id_throws[42]], id_catch[10], var3 - (float)((List)this.id_byte[id_throws[43]]).size() - id_catch[11]);
      ((rrZO)id_break[id_throws[44]]).id_byte(id_strictfp);
      var2.id_break();
   }

   @EventTarget
   public void id_class(j_1 var1) {
      this.id_import();
      rrZr_1 var2 = (rrZr_1)rrQJ.id_class[id_throws[45]];
      Object var3 = (String)rrQJ.id_class[id_throws[46]];
      String[] var10000 = new String[id_private[13]];
      var10000[id_protected[36]] = rgF_2.RESET + var3;
      var10000[id_protected[37]] = rgF_2.RESET + var2.id_break();
      var10000[id_private[14]] = rgF_2.RESET + "UID: " + var2.id_protected();
      var10000[id_private[15]] = rgF_2.RESET + rrfT_2.id_class();
      String[] var4 = var10000;
      String var9 = String.join(rgF_2.GRAY + " » ", var4);
      this.id_byte[id_throws[47]] = var9;
      Float var10 = ((rrZO)id_break[id_throws[48]]).id_break((String)this.id_byte[id_throws[49]]) + id_catch[12];
      this.id_byte[id_throws[50]] = var10;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1663863677646967364L;
   }

   private float id_default() {
      float var1 = id_catch[33];
      if ((vm_3)id_import.id_class[id_throws[76]] instanceof FP) {
         var1 += id_catch[34];
      }

      return (float)((double)var1 * id_const.id_return());
   }

   private static void id_void() {
      id_throws = new short[]{
         2,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         1,
         14,
         1,
         15,
         0,
         7,
         8,
         5,
         12,
         9,
         10,
         6,
         4,
         1,
         2,
         3,
         11,
         225,
         225,
         225,
         225,
         0,
         20,
         1,
         5,
         2,
         0,
         0,
         13,
         0,
         5,
         1,
         16,
         1,
         16,
         17,
         6,
         1,
         17,
         225,
         180,
         16,
         57,
         57,
         57,
         55,
         15,
         19,
         15,
         57,
         1,
         19,
         19,
         57,
         14,
         14,
         13,
         0,
         13,
         225,
         225,
         73,
         11,
         1,
         4,
         0,
         2,
         3,
         5,
         12,
         12,
         7,
         8,
         9,
         10,
         14,
         9,
         57,
         57,
         57
      };
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, -53, -42, 20, -3, -77, -31, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break(Ml_1 var1, rrZO var2, float var3, float var4) {
      Collection var5 = ((cb_3)id_import.id_class[id_throws[57]]).So();
      if (!var5.isEmpty()) {
         float var6 = (float)(var2.id_class() + id_private[16]);
         float var7 = var6 + id_catch[20];
         this.id_class(var1, var5, var2, var3, var4 - (float)var5.size() * var7 / id_catch[21] + id_catch[22], var6, var7);
      }
   }

   public boolean id_goto() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[77]]).id_class();
   }

   private static void id_const() {
      id_catch = new float[]{
         0.5F,
         0.5F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         5.0F,
         5.0F,
         5.0F,
         2.0F,
         2.0F,
         2.0F,
         5.0F,
         45.0F,
         6.5F,
         2.0F,
         4.5F,
         0.0F,
         2.0F,
         4.0F,
         7.0F,
         2.0F,
         10.0F,
         2.0F,
         8.0F,
         255.0F,
         1.0F,
         25.0F,
         22.0F,
         5.0F,
         2.0F,
         2.0F,
         1.0F,
         0.0F,
         7.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   public boolean id_continue() {
      this.id_import();
      if (!((rrIk_1)this.id_byte[id_throws[79]]).id_class()) {
         return id_protected[49];
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[80]]).id_private().id_throws().id_new()
            ? id_protected[50]
            : id_protected[51];
      }
   }

   public boolean id_else() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[87]]).id_class();
   }

   private void id_import() {
      if (this.id_byte == null) {
         this.id_byte = new Object[18];
         this.id_byte[17] = 0.0F;
      }
   }

   public boolean id_instanceof() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[78]]).id_class();
   }

   public float id_new() {
      this.id_import();
      if (!this.aJ_()) {
         return id_catch[36];
      } else {
         return !this.id_instanceof() && !this.id_continue() && !this.id_interface() ? id_catch[37] : ((AnimValue)this.id_byte[id_throws[90]]).id_byte();
      }
   }

   public boolean id_return() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[88]]).id_class();
   }

   public boolean id_super() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[89]]).id_class();
   }

   public boolean id_throw() {
      this.id_import();
      return ((rrIQ)this.id_byte[id_throws[85]]).id_byte().equals(id_implements[31]);
   }

   public boolean id_try() {
      this.id_import();
      return ((rrIk_1)this.id_byte[id_throws[86]]).id_class();
   }

   public float id_while() {
      return id_catch[35];
   }

   private static void id_static() {
      id_protected = new boolean[]{
         true,
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
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
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
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   public boolean id_public() {
      this.id_import();
      return ((rrIQ)this.id_byte[id_throws[84]]).id_byte().equals(id_implements[30]);
   }

   private static void id_transient() {
      id_implements = new String[]{
         new String("HUD"),
         new String("Пользовательский интерфейс"),
         new String("Включено"),
         new String("Фпс"),
         new String("Бпс"),
         new String("Тпс"),
         new String("Координаты"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Оптимизация"),
         new String("Режим"),
         new String("Плавающий"),
         new String("Плавающий"),
         new String("Стандартный"),
         new String("Ватермарк"),
         new String("Бинды модулей"),
         new String("Бинды предметов"),
         new String("Эффекты"),
         new String("Задержки"),
         new String("Расписания"),
         new String("Броня"),
         new String("Информация"),
         new String("Другое"),
         new String(""),
         new String(" "),
         new String("\n"),
         new String("Стандартный"),
         new String("Плавающий"),
         new String("TPS: "),
         new String("FPS: "),
         new String("BPS: "),
         new String("Coords: "),
         new String(" "),
         new String(" ")
      };
   }
}
