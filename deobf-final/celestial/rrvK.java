package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvK extends rrFl_1<rrvU> {
   private static boolean[] break_;
   private static int[] protected_;
   private static String[] throws_;
   private static byte[] case_;
   public Object[] class_;
   private static short[] catch_;
   private static float[] private_;

   static String byte_(String var0) {
      return var0.replace("ё", "е").replaceAll("[^a-zA-Zа-яА-Я- ]+", "").trim();
   }

   @Override
   public Collection<rrvU> byte_() {
      this.implements_();
      return (List)this.class_[1];
   }

   public rrvK(rrvo_1 var1) {
      this.implements_();
      ArrayList var6 = new ArrayList();
      this.class_[1] = var6;
      ArrayList var7 = new ArrayList();
      this.class_[2] = var7;
      this.class_[0] = var1;
      ((List)this.class_[1]).add(new rrve_1(this, "Preview Cooldown", "**:**"));
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(Ml_1 var1, float var2, float var3) {
      this.implements_();
      float var4 = ((rrvo_1)this.class_[0]).long_();
      rrZO var5 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      this.break_(18.0F);
      float var6 = this.finally_();
      float var7 = this.protected_();
      var5.class_(MinecraftAccessor.strictfp_);

      for (rrvU var9 : this.byte_()) {
         AnimValue var10 = var9.break_();
         var9.class_(var9.catch_());
         if (var10.case_()) {
            float var11 = var10.byte_();
            float var12 = var10.continue_();
            float var13 = var7 * 0.8F * var12;
            float var14 = var2 + 3.0F;
            float var15 = var3 + var6 - var13;
            int var16 = ColorHelper.break_(rrZF.d_, (int)(255.0F * var11 * var4));
            String var17 = var9.case_();
            String var18 = var9.class_();
            var5.break_(var1, MinecraftAccessor.strictfp_, var17, (double)var14, (double)var15, var16, false, false);
            var5.break_(
               var1,
               MinecraftAccessor.strictfp_,
               var18,
               (double)(var14 + ((rrvo_1)this.class_[0]).implements_() - var5.break_(var18) - 5.0F),
               (double)var15,
               var16,
               false,
               false
            );
            float var19 = var7 * var11;
            var6 += var19;
            this.class_(var19);
         }
      }

      var5.byte_(MinecraftAccessor.strictfp_);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -623258179;
   }

   public void class_(rrLa_1 var1) {
      this.implements_();
      rdn_3 var2 = var1.class_();
      if (var1.break_() instanceof rrAr_1 var3) {
         synchronized ((List)this.class_[1]) {
            if (this.class_(var2, var3.break_())) {
               return;
            }

            var2 = class_(var2);
            rrvD var5 = new rrvD(var2);
            if (!((List)this.class_[catch_[13]]).contains(var5)) {
               ((List)this.class_[catch_[14]]).add(var5);
               if (((List)this.class_[catch_[15]]).size() > break_[6]) {
                  ((List)this.class_[catch_[16]]).sort(Comparator.comparingInt(var0 -> var0 instanceof rrvD var1x ? -var1x.implements_() : break_[15]));
               }
            }
         }
      }
   }

   private boolean class_(rdn_3 var1, int var2) {
      rdb_3 var3 = var1.break_();
      if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         if (var3 == rdy_3.dc && var2 >= 72000) {
            return true;
         }

         if (var3 == rdy_3.hR && var2 >= 72000) {
            return true;
         }

         if (var3 == rdy_3.WL && var2 >= 6000) {
            return true;
         }

         if (var3 == rdy_3.Ex && var2 >= 6000) {
            return true;
         }
      }

      return break_[11];
   }

   public List<rrvU> class_() {
      this.implements_();
      return (List<rrvU>)this.class_[2];
   }

   public float class_(rrvU var1) {
      String var2 = var1.case_() + var1.class_();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_().break_(var2) + 15.0F;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 115, -79, 31, 60, 54, 127, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static rdn_3 class_(rdn_3 var0) {
      if (!var0.class_() && (cb_3)MinecraftAccessor.import_.class_[57] != null) {
         rdn_3 var1 = null;
         int var2 = -1;
         boolean var3 = false;

         for (rqs_3 var5 : ((rhz_3)((cb_3)MinecraftAccessor.import_.class_[57]).implements_[1]).extends_()) {
            for (rdn_3 var7 : var5) {
               if (rdn_3.byte_(var7, var0)) {
                  boolean var8 = var7.this_();
                  int var9 = var7.abstract_();
                  if (var1 == null || var8 && !var3 || var8 == var3 && var9 > var2) {
                     var1 = var7;
                     var3 = var8;
                     var2 = var9;
                  }
               }
            }
         }

         return var1 != null ? var1 : var0;
      } else {
         return var0;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8247475847129452823L;
   }

   public void break_() {
      this.implements_();
      ((List)this.class_[1]).removeIf(var0 -> !var0.byte_() ? true : break_[14]);
   }

   @Override
   public void throws_() {
      this.implements_();
      super.throws_();
      Collection var1 = this.byte_();
      Boolean var11 = false;
      this.class_[3] = var11;
      ((List)this.class_[2]).clear();
      if (!var1.isEmpty()) {
         Iterator var2 = var1.iterator();

         while (var2.hasNext()) {
            rrvU var3 = (rrvU)var2.next();
            AnimValue var4 = var3.break_();
            boolean var5 = var3.byte_();
            if (!var5) {
               if (var4.catch_()) {
                  var2.remove();
                  continue;
               }

               if (var3 instanceof rrvD var6) {
                  var6.throws_();
               }
            }

            if (var4.finally_()) {
               if (var3.catch_()) {
                  ((List)this.class_[2]).add(var3);
               }

               if (!var5) {
                  Boolean var12 = true;
                  this.class_[3] = var12;
               }
            }
         }
      }
   }

   private static void catch_() {
      catch_ = new short[]{1, 2, 0, 1, 0, 0, 0, 1, 3, 2, 2, 3, 1, 1, 1, 1, 1, 1, 4, 6000, 6000, 1, 0, 57, 57, 1, 2, 3};
   }

   private static void extends_() {
      case_ = new byte[]{-1, 4, 3};
   }

   public boolean case_() {
      this.implements_();
      return (Boolean)this.class_[3];
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[3] = false;
      }
   }

   @Override
   public float protected_() {
      return 10.0F;
   }

   private static void private_() {
      protected_ = new int[]{72000, 72000};
   }

   private static void final_() {
      break_ = new boolean[]{false, false, false, false, false, true, true, true, true, true, true, false, false, true, false, false, false};
   }

   private static void volatile_() {
      private_ = new float[]{18.0F, 0.8F, 3.0F, 255.0F, 5.0F, 15.0F, 10.0F};
   }

   private static void native_() {
      throws_ = new String[]{
         new String("Preview Cooldown"), new String("**:**"), new String("ё"), new String("е"), new String("[^a-zA-Zа-яА-Я- ]+"), new String("")
      };
   }
}
