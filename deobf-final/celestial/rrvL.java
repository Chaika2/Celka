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
   private static double[] private_;
   public Object[] catch_;
   private static String[] implements_;
   private static boolean[] finally_;
   private static short[] else_;
   private static byte[] synchronized_;
   private static int[] return_;
   private static float[] public_;

   private static void char_() {
      private_ = new double[]{2.0};
   }

   private static void int_() {
      synchronized_ = new byte[]{24, 50, 50, 50, -1, 2, 2, 6, 2, 2, 3, 5, 2, 50, 100, 5, 102, 2, 22, 100, 20};
   }

   public rrvL() {
      this.native_();
      ArrayList var5 = new ArrayList();
      this.catch_[0] = var5;
   }

   public rrvL(boolean var1) {
      super(var1);
      this.native_();
      ArrayList var6 = new ArrayList();
      this.catch_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      public_ = new float[]{1000.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 255.0F, 170.0F, 0.7F, 255.0F, 2.0F, 4.0F, 6.0F, 1.0F, 4.0F, 2.0F, 2.0F, 1.0F, 3.0F};
   }

   private rgF_2 class_(rruN var1) {
      return switch (((int[])rrvA.class_[0])[var1.ordinal()]) {
         case 1 -> rgF_2.GREEN;
         case 2 -> rgF_2.RED;
         case 3 -> rgF_2.YELLOW;
         case 4 -> rgF_2.GOLD;
         case 5 -> rgF_2.AQUA;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1218428010739167344L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 91, -109, 12, -56, -15, 1, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.native_();
      super.class_(var1, var2, var3, var4);
      float var5 = this.throws_ ? (float)(rqR_2.break_() - this.case_) / 1000.0F : public_[1];
      float var6 = this.throws_ ? rfU_2.class_(var5 - 1.0F, 0.0F, 1.0F) : public_[5];
      int var7 = rfU_2.case_(var6 * 255.0F) << 24;
      if ((var7 & -67108864) != 0) {
         int var8 = ColorHelper.class_(synchronized_[1], 50, 50, (int)(170.0F * var6));
         int var9 = ColorHelper.class_(var8, 0.7F);
         int var10 = ColorHelper.break_(-1, (int)(255.0F * var6));
         rrZO var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
         int var12 = var11.class_();
         rruz_1 var13 = null;
         int var14 = 0;
         boolean var15 = ((Qw_1)import_.class_[20]).rs != 2 ? true : finally_[2];
         if (var15) {
            rrnE_2.class_(2.0);
         }

         for (rrvn_1 var17 : (List)this.catch_[0]) {
            List var18 = var17.class_();
            rruz_1 var19 = var17.break_();
            if (!var19.equals(var13)) {
               if (var13 != null) {
                  var14 += 10;
               }

               var13 = var19;
               rVi_1 var20 = new rgN_2("Build")
                  .class_(rgF_2.YELLOW)
                  .class_(new rgN_2(": ").class_(rgF_2.GRAY))
                  .class_(new rgN_2(var19.class_()).class_(rgF_2.WHITE))
                  .class_(new rgN_2(" (").class_(rgF_2.GRAY))
                  .class_(new rgN_2(var19.break_()))
                  .class_(new rgN_2(")").class_(rgF_2.GRAY));
               if (!"1.1".equals(var19.class_())) {
                  var20 = var20.class_(rgF_2.STRIKETHROUGH);
               }

               float var21 = public_[10];
               float var22 = (float)(2 + var14);
               float var23 = 4.0F + var11.break_(var20.getString());
               float var24 = var22 + (float)var12 + 6.0F;
               ch_3.class_(var1, var21, var22, var23, var24, var8);
               var11.class_(var1, var20, (double)(var21 + 1.0F), (double)(var22 + 4.0F), var10, 255);
               var14 += var12 + 6;
            }

            for (rrvC var42 : var18) {
               rruQ var44 = var42.break_();
               rVi_1 var46 = var44.break_();
               rVi_1 var48 = new rgN_2(this.break_(var44.byte_())).class_(this.class_(var44.byte_()));
               rVi_1 var25 = var44.class_().case_().class_(rgF_2.WHITE);
               rVi_1 var26 = var48.break_(" ").class_(var25);
               if (var46 != null && !var46.break_().isEmpty()) {
                  rVi_1 var27 = new rgN_2("(?)").class_(rgF_2.YELLOW);
                  var27.class_(var27.class_().class_(new rgy_3(rgp_3.class_, var46)));
                  var26 = var26.break_(" ").class_(var27);
               }

               float var50 = (float)(synchronized_[8] + var14);
               float var28 = 2.0F;
               float var29 = var11.break_(var26.getString()) + 2.0F;
               float var30 = (float)(2 + var12 + 3);
               var42.class_(new rruv_1(var28, var50, var29, var30));
               rruv_1 var31 = var42.class_();
               float var32 = var31.break_();
               float var33 = var31.protected_();
               float var34 = var31.byte_();
               float var35 = var31.class_();
               ch_3.class_(var1, var32, var33, var32 + var34, var33 + var35, var9);
               var11.class_(var1, var26, (double)(var32 + 1.0F), (double)(var33 + 3.0F), var10, 255);
               var14 += var12 + 5;
            }
         }

         label83:
         for (rrvn_1 var37 : (List)this.catch_[0]) {
            List var38 = var37.class_();
            boolean var39 = false;
            Iterator var41 = var38.iterator();

            while (true) {
               if (var41.hasNext()) {
                  rrvC var43 = (rrvC)var41.next();
                  rruQ var45 = var43.break_();
                  rruv_1 var47 = var43.class_();
                  rVi_1 var49 = var45.break_();
                  if (!var47.break_((float)((Integer)rrvk_1.class_[0]).intValue(), (float)((Integer)rrvk_1.class_[1]).intValue())) {
                     continue;
                  }

                  if (var49 != null && !var49.break_().isEmpty()) {
                     this.break_(
                        var1,
                        ((cm_3)this.volatile_.class_[15]).break_(var49, Math.max(this.package_ / 2 - 50, 100)),
                        (Integer)rrvk_1.class_[0],
                        (Integer)rrvk_1.class_[1] + 5
                     );
                  }

                  var39 = finally_[4];
               }

               if (var39) {
                  break label83;
               }
               break;
            }
         }

         if (var15) {
            rrnE_2.class_(const_.return_());
         }
      }
   }

   private String break_(rruN var1) {
      return var1.class_();
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 191365432;
   }

   private static void finally_() {
      else_ = new short[]{0, 0, 0, 20, 0, 255, 255, 0, 0, 1, 15, 0, 1, 0, 0, 0, 4, 0};
   }

   private static void package_() {
      return_ = new int[]{-67108864};
   }

   private static void abstract_() {
      implements_ = new String[]{
         new String("Build"), new String(": "), new String(" ("), new String(")"), new String("1.1"), new String(" "), new String("(?)"), new String(" ")
      };
   }

   private static void final_() {
      finally_ = new boolean[]{false, true, false, false, true, false, true};
   }

   private void native_() {
      if (this.catch_ == null) {
         this.catch_ = new Object[1];
         Object[] var1 = this.catch_;
      }
   }

   @Override
   public void v_() {
      this.native_();
      super.v_();
      ((List)this.catch_[0]).clear();

      for (Entry var2 : ((rruc_1)rruc_1.staticFields8976bba2dba834c8b8aad687eeef9d7a[0]).class_().entrySet()) {
         rruz_1 var3 = (rruz_1)var2.getKey();
         List var4 = (List)var2.getValue();
         ArrayList var5 = new ArrayList();

         for (rruQ var7 : var4) {
            rrvC var8 = new rrvC(var7);
            var5.add(var8);
         }

         rrvn_1 var12 = new rrvn_1(var3, var5);
         ((List)this.catch_[0]).add(var12);
      }

      BG[] var9 = (BG[])BG.staticFieldsd25d445181413210921a2969c1bcd756[4];

      for (int var10 = 0; var10 < var9.length; var10++) {
         BG var11 = var9[var10];
         this.class_(new LF(this.package_ - 102, 2 + 22 * var10, 100, 20, var11.break_(), var1 -> {
            URI var2x = URI.create(var11.class_());
            rrbb_3.class_(var2x);
         }));
      }
   }
}
