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
   private static short[] id_protected;
   private static String[] id_throws;
   private static double[] id_catch;
   private static byte[] id_private;
   private static float[] id_implements;
   public Object[] id_break;
   private static boolean[] id_finally;
   public static Object[] id_byte;

   public Esp2D() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
      this.id_while();
      rrIk_1 var5 = new rrIk_1(id_throws[2], id_finally[0]);
      this.id_break[id_protected[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_throws[3], id_finally[1]);
      this.id_break[id_protected[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_throws[4], id_finally[2]);
      this.id_break[id_protected[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_throws[5], id_finally[3]);
      this.id_break[id_protected[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_throws[6], id_finally[4]).id_class(((rrIk_1)this.id_break[id_protected[5]])::id_class);
      this.id_break[id_protected[6]] = var9;
      rrIk_1 var10 = new rrIk_1(id_throws[7], id_finally[5]);
      this.id_break[id_protected[7]] = var10;
      rrIk_1 var11 = new rrIk_1(id_throws[8], id_finally[6]).id_class(((rrIk_1)this.id_break[id_protected[8]])::id_class);
      this.id_break[id_protected[9]] = var11;
      rrIk_1 var12 = new rrIk_1(id_throws[9], id_finally[7]);
      this.id_break[id_protected[10]] = var12;
      rrIk_1 var13 = new rrIk_1(id_throws[10], id_finally[8]);
      this.id_break[id_protected[11]] = var13;
      rrIm_1 var14 = new rrIm_1(id_throws[11], id_implements[0], id_implements[1], id_implements[2], id_implements[3])
         .id_class(
            () -> {
               this.id_while();
               return !((rrIk_1)this.id_break[id_protected[84]]).id_class() && !((rrIk_1)this.id_break[id_protected[85]]).id_class()
                  ? id_finally[62]
                  : id_finally[61];
            }
         );
      this.id_break[id_protected[12]] = var14;
      CheckGroup var15 = new CheckGroup()
         .id_catch(id_finally[9])
         .id_case(id_finally[10])
         .id_throws(id_finally[11])
         .id_private(id_finally[12])
         .id_break(id_finally[13])
         .id_implements(id_finally[14])
         .id_byte(id_finally[15])
         .id_protected(id_finally[16])
         .id_class(id_finally[17]);
      this.id_break[id_protected[13]] = var15;
      rrfL_2 var10001 = new rrfL_2();
      ev_3[] var10002 = new ev_3[id_private[0]];
      var10002[id_finally[18]] = eY_2.id_class;
      var10002[id_finally[19]] = eY_2.id_volatile;
      var10002[id_private[1]] = eY_2.id_new;
      var10002[id_private[2]] = eY_2.id_public;
      var10002[id_private[3]] = eY_2.id_this;
      var10002[id_private[4]] = eY_2.id_synchronized;
      var10002[id_private[5]] = eY_2.id_continue;
      var10002[id_private[6]] = eY_2.id_import;
      var10002[id_private[7]] = eY_2.id_implements;
      rrfL_2 var16 = var10001.id_class(var10002);
      this.id_break[id_protected[14]] = var16;
      Int2ObjectOpenHashMap var17 = new Int2ObjectOpenHashMap();
      this.id_break[id_protected[15]] = var17;
      rrTr_1 var18 = new rrTr_1();
      this.id_break[id_protected[16]] = var18;
      Setting[] var19 = new Setting[id_private[8]];
      var19[id_finally[20]] = new rrIc_1(id_throws[12], ((CheckGroup)this.id_break[id_protected[17]]).id_byte());
      byte var10003 = id_finally[21];
      String var10006 = id_throws[13];
      rrIk_1[] var10007 = new rrIk_1[id_private[9]];
      var10007[id_finally[22]] = (rrIk_1)this.id_break[id_protected[18]];
      var10007[id_finally[23]] = (rrIk_1)this.id_break[id_protected[19]];
      var10007[id_private[10]] = (rrIk_1)this.id_break[id_protected[20]];
      var10007[id_private[11]] = (rrIk_1)this.id_break[id_protected[21]];
      var10007[id_private[12]] = (rrIk_1)this.id_break[id_protected[22]];
      var10007[id_private[13]] = (rrIk_1)this.id_break[id_protected[23]];
      var10007[id_private[14]] = (rrIk_1)this.id_break[id_protected[24]];
      var10007[id_private[15]] = (rrIk_1)this.id_break[id_protected[25]];
      var10007[id_private[16]] = (rrIk_1)this.id_break[id_protected[26]];
      var19[var10003] = new rrIc_1(var10006, var10007);
      var19[id_private[17]] = (rrIm_1)this.id_break[id_protected[27]];
      this.id_class(var19);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_implements = new float[]{
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

   private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[id_protected[74]], var2, var3, var4, var5, var6, var7);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2084323977821850303L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -748681546;
   }

   private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      String var12 = rrjZ_2.id_class(var8);
      float var13 = id_implements[26];
      this.id_class(var1, var4 - var13, var5 - var13, var6 + var13 * id_implements[27], var7 + var13 * id_implements[28], var11, var11);
      this.id_class(var1, var4, var5 + var7 - var7 * var8, var6, var7 * var8, var9, var10);
      boolean var14 = var2.u_() < var2.SK() * id_implements[29] ? id_finally[24] : id_finally[25];
      boolean var15 = var2 != (cb_3)id_import.id_class[id_protected[63]] && !(((cb_3)id_import.id_class[id_protected[64]]).id_int(var2) < id_catch[0])
         ? id_finally[27]
         : id_finally[26];
      if (var14 && var15) {
         var3.id_byte(
            var1,
            id_strictfp,
            var12,
            (double)(var4 + var6 / id_implements[30]),
            (double)(var5 + var7 - var7 * var8 - id_implements[31]),
            rrZF.d_,
            id_finally[28],
            id_finally[29]
         );
      }
   }

   private void id_class(Ml_1 var1, rrZO var2, rgP_2 var3, float var4, float var5, float var6, float var7, int var8) {
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[id_protected[61]], var4, var5, var6, var7, var8);
      var2.id_break(var1, var3, (double)(var4 + id_implements[24]), (double)(var5 + id_implements[25]), rrZF.d_, id_protected[62]);
   }

   @EventTarget(
      id_class = -200
   )
   public void id_class(rrnE_2 var1) {
      this.id_while();
      ((rrTr_1)this.id_break[id_protected[35]]).id_class();
      boolean var2 = ((rrIk_1)this.id_break[id_protected[36]]).id_class();
      if (!((Int2ObjectMap)this.id_break[id_protected[37]]).isEmpty() || var2 && ((rrTr_1)this.id_break[id_protected[38]]).id_throws()) {
         Ml_1 var3 = var1.id_class();
         rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_protected[39]]).id_break();
         rjV_2 var5 = ((Hh_1)id_import.id_class[id_protected[40]]).id_volatile();
         float var6 = var1.id_break();
         if (var2 && ((rrTr_1)this.id_break[id_protected[41]]).id_throws()) {
            ((rrTr_1)this.id_break[id_protected[42]]).id_class(var5, var6);
         }

         int var7 = ColorHelper.id_class(id_implements[4]);
         int var8 = ColorHelper.id_class(id_implements[5]);
         int var9 = ColorHelper.id_class(id_implements[6]);
         int var10 = ColorHelper.id_class(id_implements[7]);
         float var11 = ((rrIm_1)this.id_break[id_protected[43]]).id_byte();
         var3.id_class();
         var4.id_break(id_strictfp);
         rrfD_2.id_throws((lD_2)rrfD_2.id_class[id_protected[44]]);
         boolean var12 = ((rrIk_1)this.id_break[id_protected[45]]).id_class();
         boolean var13 = ((rrIk_1)this.id_break[id_protected[46]]).id_class();
         boolean var14 = ((rrIk_1)this.id_break[id_protected[47]]).id_class();
         boolean var15 = ((rrIk_1)this.id_break[id_protected[48]]).id_class();
         boolean var16 = ((rrIk_1)this.id_break[id_protected[49]]).id_class();
         boolean var17 = ((rrIk_1)this.id_break[id_protected[50]]).id_class();
         boolean var18 = ((rrIk_1)this.id_break[id_protected[51]]).id_class();
         ObjectIterator var19 = ((Int2ObjectMap)this.id_break[id_protected[52]]).values().iterator();

         while (var19.hasNext()) {
            an_3 var20 = (an_3)var19.next();
            rji_3 var21 = rrfa_3.id_class(var5, var20, var6);
            float var22 = var21.id_class();
            float var23 = var21.id_break();
            float var24 = var21.id_byte();
            float var25 = var21.id_protected();
            float var26 = var24 - var22;
            float var27 = var25 - var23;
            float var28 = id_implements[8];
            float var29 = id_implements[9];
            float var30 = id_implements[10];
            float var31 = id_implements[11];
            float var32 = id_implements[12];
            rgN_2 var33 = null;
            if (rrff_3.id_class(var20)) {
               var33 = new rgN_2(id_throws[14]);
               var33.id_class(rrjZ_2.id_byte(var20));
               if (var13) {
                  var29 = (float)(var4.id_class() + id_private[18]);
               }

               if (var20 instanceof iB_2 var34) {
                  float var35 = var34.Sd();
                  var32 = rrjZ_2.id_class(var34);
                  String var36 = rgF_2.GRAY + " | " + rgF_2.RED + (int)var34.u_() + "ø";
                  String var37 = id_throws[15];
                  if (var35 > id_implements[13]) {
                     var37 = rgF_2.GRAY + " | " + rgF_2.YELLOW + (int)var35 + "ù";
                  }

                  var33.id_break(var36 + var37);
               }

               if (var14 && var20 instanceof cG_2 var38) {
                  Aw_1 var40 = var38.id_continue();
                  if (var40 != null) {
                     var33.id_break(rgF_2.GRAY + " | " + rgF_2.WHITE + var40.id_byte() + "ms");
                  }
               }

               var28 = var4.id_break(var33.getString()) + id_implements[14];
               var30 = var22 + var26 / id_implements[15] - var28 / id_implements[16] - id_implements[17];
               var31 = var23 - var29 - id_implements[18];
            }

            if (var12) {
               this.id_class(var3, var22, var23, var24, var25, var26, var27, var11, var7, var8, var9, var10, (Integer)id_byte[id_protected[53]]);
            }

            if (var33 != null && var13 && !((rrTr_1)this.id_break[id_protected[54]]).id_class(var20.V())) {
               this.id_class(var3, var4, var33, var30, var31, var28, var29, (Integer)id_byte[id_protected[55]]);
            }

            if (var20 instanceof iB_2 var39) {
               if (var18) {
                  this.id_class(var3, var39, var4, rpm_3.values(), var22, var24, var25);
               }

               if (var15) {
                  this.id_break(var3, var39, var4, var22, var24, var31);
               }

               if (var16) {
                  this.id_class(var3, var39, var4, var22, var23, var24);
               }

               if (var17) {
                  this.id_class(
                     var3, var39, var4, var22 - var11 - id_implements[19], var23, var11, var27, var32, var7, var10, (Integer)id_byte[id_protected[56]]
                  );
               }
            }
         }

         rrfD_2.id_private((lD_2)rrfD_2.id_class[id_protected[57]]);
         var4.id_byte(id_strictfp);
         ((rrTr_1)this.id_break[id_protected[58]]).id_class(var3);
         var3.id_break();
      }
   }

   public boolean id_class(an_3 var1) {
      this.id_while();
      aI_2 var2 = var1.BC();
      if (var2 != aI_2.id_break && var2 != aI_2.Q) {
         return this.aJ_() && ((rrIk_1)this.id_break[id_protected[82]]).id_class() && ((Int2ObjectMap)this.id_break[id_protected[83]]).containsKey(var1.V())
            ? id_finally[59]
            : id_finally[60];
      } else {
         return id_finally[58];
      }
   }

   private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, rpm_3[] var4, float var5, float var6, float var7) {
      float var8 = var5 + (var6 - var5) / id_implements[46];
      float var9 = var7 + id_implements[47];
      rpm_3[] var10 = var4;
      int var11 = var4.length;

      for (int var12 = id_finally[47]; var12 < var11; var12++) {
         rpm_3 var13 = var10[var12];
         rdn_3 var14 = var2.id_protected(var13);
         if (!var14.id_class()) {
            StringBuilder var15 = new StringBuilder(var14.id_continue().id_byte());
            if (var14.id_char() > id_finally[48]) {
               var15.append(id_throws[16]).append(rgF_2.RED).append(id_throws[17]).append(var14.id_char());
            }

            var3.id_byte(var1, id_strictfp, var15.toString(), (double)var8, (double)var9, rrZF.d_, id_finally[49], id_finally[50]);
            var9 += id_implements[48];
         }
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_while();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[28]]) {
         ((Int2ObjectMap)this.id_break[id_protected[29]]).clear();
         ((rrTr_1)this.id_break[id_protected[30]]).id_break();
         ObjectIterator var2 = ((gm_3)id_import.id_class[id_protected[31]]).id_return().int2ObjectEntrySet().iterator();

         while (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            an_3 var4 = (an_3)var3.getValue();
            int var5 = var3.getIntKey();
            if (this.id_break(var4)) {
               ((Int2ObjectMap)this.id_break[id_protected[32]]).put(var5, var4);
            }

            if (var4 instanceof rsE_2 var6 && var6.id_protected().id_break() instanceof rxJ_2 var7 && var7.id_catch() instanceof Wp_1) {
               ((rrTr_1)this.id_break[id_protected[33]]).id_class(var6);
            }
         }

         ((rrTr_1)this.id_break[id_protected[34]]).id_byte();
      }
   }

   private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6) {
      Collection var7 = var2.So();
      if (!var7.isEmpty()) {
         String var8 = rAB.id_break(var7);
         float var9 = var4 + (var6 - var4) + id_implements[32];
         float var10 = var5 + id_implements[33];
         var3.id_class(var1, var8, (double)var9, (double)var10, rrZF.d_, id_private[19], id_finally[30], id_finally[31]);
      }
   }

   private void id_class(
      Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      rrfD_2.id_byte(var1, (lD_2)rrfD_2.id_class[id_protected[75]], var2 + var8, var3, var6 - var8 * id_implements[49], var8, var9, var10);
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[id_protected[76]], var2, var3, var8, var7, var9, var12);
      rrfD_2.id_byte(var1, (lD_2)rrfD_2.id_class[id_protected[77]], var2 + var8, var5 - var8, var6 - var8 * id_implements[50], var8, var12, var11);
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[id_protected[78]], var4 - var8, var3, var8, var7, var10, var11);
   }

   private void id_class(
      Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13
   ) {
      float var14 = id_implements[20];
      this.id_class(
         var1,
         var2 - var14,
         var3 - var14,
         var4 + var14,
         var5 + var14,
         var6 + var14 * id_implements[21],
         var7 + var14 * id_implements[22],
         var8 + var14 * id_implements[23],
         var13,
         var13,
         var13,
         var13
      );
      this.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   private void id_break(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6) {
      this.id_while();
      ArrayList var7 = new ArrayList();
      rdn_3 var8 = var2.ss();
      rdn_3 var9 = var2.Sn();
      if (!var8.id_class()) {
         var7.add(var8);
      }

      for (rdn_3 var11 : var2.PV()) {
         if (!var11.id_class()) {
            var7.add(var11);
         }
      }

      if (!var9.id_class()) {
         var7.add(var9);
      }

      int var23 = var7.size();
      byte var24 = id_private[20];
      float var12 = var4 + (var5 - var4) / id_implements[34] - (float)(var24 * (var23 - id_finally[32])) / id_implements[35] - id_implements[36];
      float var13 = var12 + (float)(var24 * (var23 - id_finally[33])) + id_implements[37];

      for (int var14 = id_finally[34]; var14 < var7.size(); var14++) {
         rdn_3 var15 = (rdn_3)var7.get(var14);
         rdb_3 var16 = var15.id_break();
         float var17 = var12 + (float)(var14 * var24);
         float var18 = var6 - id_implements[38];
         rrfD_2.id_class(
            var1,
            (lD_2)rrfD_2.id_class[id_protected[65]],
            var15,
            var17,
            var18,
            var16 == rdy_3.kL ? id_finally[35] : id_finally[36],
            (rrfq_3)rrfp_3.id_class[id_protected[66]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[67]]
               ? id_finally[37]
               : id_finally[38],
            id_implements[39],
            id_implements[40],
            id_private[21]
         );
         if (((rrIk_1)this.id_break[id_protected[68]]).id_class()
            && (rrfq_3)rrfp_3.id_class[id_protected[69]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[70]]
            && (rrfq_3)rrfp_3.id_class[id_protected[71]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[72]]) {
            Pair var19 = ((rrfL_2)this.id_break[id_protected[73]]).id_class(var15);
            String var20 = (String)var19.getLeft();
            int var21 = (Integer)var19.getRight();
            float var22 = var18 - (float)(var21 * id_private[22]) + id_implements[41];
            var3.id_class(var1, var20, (double)(var17 + id_implements[42]), (double)var22, rrZF.d_, id_private[23], id_finally[39], id_finally[40]);
         }

         if (var8.id_char() > id_finally[41]) {
            var3.id_byte(
               var1,
               id_strictfp,
               "x" + var8.id_char(),
               (double)(var12 + id_implements[43]),
               (double)(var18 + id_implements[44]),
               rrZF.d_,
               id_finally[42],
               id_finally[43]
            );
         }

         if (var9.id_char() > id_finally[44]) {
            var3.id_byte(var1, id_strictfp, "x" + var9.id_char(), (double)var13, (double)(var18 + id_implements[45]), rrZF.d_, id_finally[45], id_finally[46]);
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, -55, 67, 119, -94, -59, -83, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_break(an_3 var1) {
      this.id_while();
      if (var1 == null) {
         return id_finally[51];
      } else if (var1 == (cb_3)id_import.id_class[id_protected[79]] && ((Qw_1)id_import.id_class[id_protected[80]]).id_volatile() == VZ.FIRST_PERSON) {
         return id_finally[52];
      } else if (!var1.Pu()) {
         return id_finally[53];
      } else {
         aI_2 var2 = var1.BC();
         if (var2 == aI_2.id_break || var2 == aI_2.Q) {
            return id_finally[54];
         } else if (!rrff_3.id_class(var1, (CheckGroup)this.id_break[id_protected[81]])) {
            return id_finally[55];
         } else {
            return !rrfo_3.id_class(var1) ? id_finally[56] : id_finally[57];
         }
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_while();
      super.id_throws(var1);
      ((Int2ObjectMap)this.id_break[id_protected[59]]).clear();
      ((rrTr_1)this.id_break[id_protected[60]]).id_protected();
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{-1275068416};
      id_byte = var0;
   }

   private static void id_continue() {
      id_finally = new boolean[]{
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

   private static void id_else() {
      id_catch = new double[]{900.0};
   }

   private static void id_return() {
      id_protected = new short[]{
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

   private static void id_super() {
      id_throws = new String[]{
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

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[14];
      }
   }

   private static void id_public() {
      id_private = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 3, 9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 10, 10, 8, 5, 10, 14};
   }
}
