package celestial;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvL extends vB_2 {
   private static double[] id_private;
   public Object[] id_catch;
   private static String[] id_implements;
   private static boolean[] id_finally;
   private static short[] id_else;
   private static byte[] id_synchronized;
   private static int[] id_return;
   private static float[] id_public;

   private static void id_char() {
      id_private = new double[]{2.0};
   }

   private static void id_int() {
      id_synchronized = new byte[]{24, 50, 50, 50, -1, 2, 2, 6, 2, 2, 3, 5, 2, 50, 100, 5, 102, 2, 22, 100, 20};
   }

   public rrvL() {
      this.id_native();
      ArrayList var5 = new ArrayList();
      this.id_catch[id_else[0]] = var5;
   }

   public rrvL(boolean var1) {
      super(var1);
      this.id_native();
      ArrayList var6 = new ArrayList();
      this.id_catch[id_else[1]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_public = new float[]{1000.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 255.0F, 170.0F, 0.7F, 255.0F, 2.0F, 4.0F, 6.0F, 1.0F, 4.0F, 2.0F, 2.0F, 1.0F, 3.0F};
   }

   private rgF_2 id_class(rruN var1) {
      return switch (((int[])rrvA.id_class[id_else[17]])[var1.ordinal()]) {
         case 1 -> rgF_2.GREEN;
         case 2 -> rgF_2.RED;
         case 3 -> rgF_2.YELLOW;
         case 4 -> rgF_2.GOLD;
         case 5 -> rgF_2.AQUA;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1218428010739167344L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 91, -109, 12, -56, -15, 1, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_native();
      super.id_class(var1, var2, var3, var4);
      float var5 = this.id_throws ? (float)(rqR_2.id_break() - this.id_case) / 1000.0F : 1.0F;
      float var6 = this.id_throws ? rfU_2.id_class(var5 - 1.0F, id_public[3], 1.0F) : 1.0F;
      int var7 = rfU_2.id_case(var6 * 255.0F) << 24;
      if ((var7 & -67108864) != 0) {
         int var8 = ColorHelper.id_class(50, 50, 50, (int)(170.0F * var6));
         int var9 = ColorHelper.id_class(var8, 0.7F);
         int var10 = ColorHelper.id_break(-1, (int)(255.0F * var6));
         rrZO var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_else[2]]).id_class();
         int var12 = var11.id_class();
         rruz_1 var13 = null;
         int var14 = id_finally[0];
         boolean var15 = ((Qw_1)id_import.id_class[20]).rs != 2 ? true : id_finally[2];
         if (var15) {
            rrnE_2.id_class(2.0);
         }

         for (rrvn_1 var17 : (List)this.id_catch[id_else[4]]) {
            List var18 = var17.id_class();
            rruz_1 var19 = var17.id_break();
            if (!var19.equals(var13)) {
               if (var13 != null) {
                  var14 += 10;
               }

               var13 = var19;
               rVi_1 var20 = new rgN_2(id_implements[0])
                  .id_class(rgF_2.YELLOW)
                  .id_class(new rgN_2(id_implements[1]).id_class(rgF_2.GRAY))
                  .id_class(new rgN_2(var19.id_class()).id_class(rgF_2.WHITE))
                  .id_class(new rgN_2(id_implements[2]).id_class(rgF_2.GRAY))
                  .id_class(new rgN_2(var19.id_break()))
                  .id_class(new rgN_2(id_implements[3]).id_class(rgF_2.GRAY));
               if (!id_implements[4].equals(var19.id_class())) {
                  var20 = var20.id_class(rgF_2.STRIKETHROUGH);
               }

               float var21 = 2.0F;
               float var22 = (float)(2 + var14);
               float var23 = 4.0F + var11.id_break(var20.getString());
               float var24 = var22 + (float)var12 + 6.0F;
               ch_3.id_class(var1, var21, var22, var23, var24, var8);
               var11.id_class(var1, var20, (double)(var21 + 1.0F), (double)(var22 + 4.0F), var10, 255);
               var14 += var12 + 6;
            }

            for (rrvC var42 : var18) {
               rruQ var44 = var42.id_break();
               rVi_1 var46 = var44.id_break();
               rVi_1 var48 = new rgN_2(this.id_break(var44.id_byte())).id_class(this.id_class(var44.id_byte()));
               rVi_1 var25 = var44.id_class().id_case().id_class(rgF_2.WHITE);
               rVi_1 var26 = var48.id_break(id_implements[5]).id_class(var25);
               if (var46 != null && !var46.id_break().isEmpty()) {
                  rVi_1 var27 = new rgN_2(id_implements[6]).id_class(rgF_2.YELLOW);
                  var27.id_class(var27.id_class().id_class(new rgy_3(rgp_3.id_class, var46)));
                  var26 = var26.id_break(id_implements[7]).id_class(var27);
               }

               float var50 = (float)(2 + var14);
               float var28 = 2.0F;
               float var29 = var11.id_break(var26.getString()) + 2.0F;
               float var30 = (float)(2 + var12 + 3);
               var42.id_class(new rruv_1(var28, var50, var29, var30));
               rruv_1 var31 = var42.id_class();
               float var32 = var31.id_break();
               float var33 = var31.id_protected();
               float var34 = var31.id_byte();
               float var35 = var31.id_class();
               ch_3.id_class(var1, var32, var33, var32 + var34, var33 + var35, var9);
               var11.id_class(var1, var26, (double)(var32 + 1.0F), (double)(var33 + 3.0F), var10, 255);
               var14 += var12 + 5;
            }
         }

         label83:
         for (rrvn_1 var37 : (List)this.id_catch[id_else[7]]) {
            List var38 = var37.id_class();
            boolean var39 = id_finally[3];
            Iterator var41 = var38.iterator();

            while (true) {
               if (var41.hasNext()) {
                  rrvC var43 = (rrvC)var41.next();
                  rruQ var45 = var43.id_break();
                  rruv_1 var47 = var43.id_class();
                  rVi_1 var49 = var45.id_break();
                  if (!var47.id_break((float)((Integer)rrvk_1.id_class[id_else[8]]).intValue(), (float)((Integer)rrvk_1.id_class[1]).intValue())) {
                     continue;
                  }

                  if (var49 != null && !var49.id_break().isEmpty()) {
                     this.id_break(
                        var1,
                        ((cm_3)this.id_volatile.id_class[15]).id_break(var49, Math.max(this.id_package / 2 - 50, 100)),
                        (Integer)rrvk_1.id_class[id_else[11]],
                        (Integer)rrvk_1.id_class[1] + 5
                     );
                  }

                  var39 = true;
               }

               if (var39) {
                  break label83;
               }
               break;
            }
         }

         if (var15) {
            rrnE_2.id_class(id_const.id_return());
         }
      }
   }

   private String id_break(rruN var1) {
      return var1.id_class();
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 191365432;
   }

   private static void id_finally() {
      id_else = new short[]{0, 0, 0, 20, 0, 255, 255, 0, 0, 1, 15, 0, 1, 0, 0, 0, 4, 0};
   }

   private static void id_package() {
      id_return = new int[]{-67108864};
   }

   private static void id_abstract() {
      id_implements = new String[]{
         new String("Build"), new String(": "), new String(" ("), new String(")"), new String("1.1"), new String(" "), new String("(?)"), new String(" ")
      };
   }

   private static void id_final() {
      id_finally = new boolean[]{false, true, false, false, true, false, true};
   }

   private void id_native() {
      if (this.id_catch == null) {
         this.id_catch = new Object[1];
         Object[] var1 = this.id_catch;
      }
   }

   @Override
   public void v_() {
      this.id_native();
      super.v_();
      ((List)this.id_catch[id_else[13]]).clear();

      for (Entry var2 : ((rruc_1)rruc_1.staticFields8976bba2dba834c8b8aad687eeef9d7a[id_else[14]]).id_class().entrySet()) {
         rruz_1 var3 = (rruz_1)var2.getKey();
         List var4 = (List)var2.getValue();
         ArrayList var5 = new ArrayList();

         for (rruQ var7 : var4) {
            rrvC var8 = new rrvC(var7);
            var5.add(var8);
         }

         rrvn_1 var12 = new rrvn_1(var3, var5);
         ((List)this.id_catch[id_else[15]]).add(var12);
      }

      BG[] var9 = (BG[])BG.staticFieldsd25d445181413210921a2969c1bcd756[4];

      for (int var10 = id_finally[5]; var10 < var9.length; var10++) {
         BG var11 = var9[var10];
         this.id_class(new LF(this.id_package - 102, 2 + 22 * var10, 100, 20, var11.id_break(), var1 -> {
            URI var2x = URI.create(var11.id_class());
            rrbb_3.id_class(var2x);
         }));
      }
   }
}
