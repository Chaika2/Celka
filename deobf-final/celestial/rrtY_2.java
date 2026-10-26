package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtY_2 extends rrZN implements MinecraftAccessor, rrvs_1 {
   public Object[] break_;
   private static String[] protected_;
   private static double[] throws_;
   private static short[] case_;
   private static boolean[] catch_;
   private static byte[] private_;
   public static Object[] byte_;
   private static int[] implements_;
   private static float[] finally_;

   private void char_() {
      this.this_();
      Boolean var5 = false;
      this.break_[11] = var5;
      this.instanceof_();
   }

   @Override
   public void byte_(int var1, int var2, int var3) {
      super.byte_(var1, var2, var3);
      if (var1 == 256) {
         this.long_();
      }
   }

   public boolean byte_(String var1) {
      this.this_();
      if ((rrte_3)this.break_[7] != null
         && ((rrte_3)this.break_[7]).throws_().equals((rrta_3)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[0])
         && !var1.isEmpty()) {
         rrtU_2 var2 = ((rrte_3)this.break_[7]).break_(var1);
         boolean var3 = var2.byte_();
         if (!var3) {
            String var4 = var2.break_();
            if (!var4.isEmpty()) {
               this.break_(var4);
               String var5 = ((rrte_3)this.break_[7]).class_();
               if (var5 != null) {
                  this.byte_(var5);
               }
            }

            return catch_[34];
         }
      }

      ((rrIv_1)this.break_[0]).class_(var1);
      return true;
   }

   public void int_() {
      this.long_();
      this.byte_("");
   }

   private void long_() {
      this.this_();
      if (this.aO_()) {
         this.char_();
         String var1 = this.final_();
         if ((rrte_3)this.break_[7] != null
            && ((rrte_3)this.break_[7]).throws_().equals((rrta_3)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[1])
            && !var1.isEmpty()) {
            rrtU_2 var2 = ((rrte_3)this.break_[7]).break_(var1);
            boolean var3 = var2.byte_();
            if (!var3) {
               String var4 = var2.break_();
               if (!var4.isEmpty()) {
                  this.break_(var4);
                  this.byte_(Objects.requireNonNullElse(((rrte_3)this.break_[7]).class_(), ""));
               }
            }
         }

         this.break_(false);
         Boolean var9 = false;
         this.break_[12] = var9;
         ((Qj_1)import_.class_[23]).class_(false);
      }
   }

   private static void float_() {
      private_ = new byte[]{50, 15, 50, 12, 50, 10, 2, 20, 2, 3, 4, 5, 9, 11, 12, 19};
   }

   public rrtY_2(rrIv_1 var1, rrtK_2 var2) {
      this.this_();
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.3F, false);
      this.break_[8] = var7;
      Supplier var8 = () -> Float.MAX_VALUE;
      this.break_[15] = var8;
      Supplier var9 = () -> 1.0F;
      this.break_[16] = var9;
      this.break_[0] = var1;
      this.break_[6] = var2;
      rrte_3 var12 = var1.finally_();
      this.break_[7] = var12;
      this.class_(() -> var1.volatile_());
      ((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).break_(this);
   }

   public rrtY_2(rrtm_3 var1, rrIv_1 var2, rrtK_2 var3) {
      this(var2, var3);
      this.break_[1] = var1;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[20];
         Object[] var1 = this.break_;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[9] = false;
         var1[11] = false;
         var1[12] = false;
         var1[19] = 0;
      }
   }

   private int interface_() {
      this.this_();
      rrtD_2 var1 = ((rrtK_2)this.break_[6]).class_();
      if (this.try_()) {
         return var1.break_();
      } else {
         return this.break_[11] ? var1.class_() : var1.byte_();
      }
   }

   public rrtY_2 class_(Consumer<rrtY_2> var1) {
      this.this_();
      this.break_[13] = var1;
      return this;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.this_();
      if (!this.aO_()) {
         return false;
      } else if (var1 == 256) {
         return false;
      } else {
         this.instanceof_();
         if (var1 == 257 || var1 == 335) {
            if ((Consumer)this.break_[13] != null) {
               ((Consumer)this.break_[13]).accept(this);
            }

            this.long_();
         }

         if (vm_3.private_(var1)) {
            Boolean var10 = true;
            this.break_[11] = var10;
            return false;
         } else {
            if ((Boolean)this.break_[11]) {
               Pattern var4 = ((rrte_3)this.break_[7]).break_();
               String var5 = Ve_1.class_(var1, var2).byte_();
               if (var1 == 259 || var4 != null && var4.matcher(var5).matches()) {
                  this.byte_("");
                  Boolean var11 = false;
                  this.break_[11] = var11;
               }
            }

            if (vm_3.case_(var1)) {
               if ((Boolean)this.break_[11]) {
                  this.byte_("");
                  Boolean var12 = false;
                  this.break_[11] = var12;
               }

               this.byte_(this.final_() + ((Qj_1)import_.class_[23]).class_());
               return true;
            } else if ((Boolean)this.break_[11] && vm_3.catch_(var1)) {
               ((Qj_1)import_.class_[23]).class_(this.final_());
               return true;
            } else if (var1 == 259) {
               this.break_(1);
               return true;
            } else {
               return catch_[18];
            }
         }
      }
   }

   public rrtY_2 class_(Supplier<Float> var1) {
      this.this_();
      this.break_[15] = var1;
      return this;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1699841828;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else if (this.package_().break_((float)var2, (float)var3)) {
         this.return_();
         return true;
      } else {
         return catch_[7];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4534784480054895200L;
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.this_();
      Float var30 = var3;
      this.break_[2] = var30;
      Float var31 = var4;
      this.break_[3] = var31;
      Float var32 = var5;
      this.break_[4] = var32;
      Float var33 = var6;
      this.break_[5] = var33;
      boolean var10 = this.new_();
      boolean var11 = this.aO_();
      boolean var12 = this.try_();
      String var13 = ((rrIv_1)this.break_[0]).native_().get();
      String var14 = var10 && !var11 ? var13 : this.final_();
      String var15 = var12 ? (String)this.break_[10] : ((Function)this.break_[18] != null ? (String)((Function)this.break_[18]).apply(var14) : var14);
      if (var11 && !var12 && !(Boolean)this.break_[11]) {
         var15 = var15 + this.short_();
      }

      int var16 = this.interface_();
      int var17 = (int)((float)((rrtm_3)this.break_[1] == null ? 255 : ((rrtm_3)this.break_[1]).class_(255)) * (Float)((Supplier)this.break_[16]).get());
      rrZO var18 = this.public_();
      switch (((int[])rrto_3.class_[0])[((rrtK_2)this.break_[6]).ordinal()]) {
         case 1:
            if ((Boolean)this.break_[11]) {
               rrtF_2.class_(var1, var3, var4 - 3.0F, var18.break_(var15), 10.0F, -9987865, Math.max(var17 - 50, 0));
            }

            rrtF_2.class_(var1, var18, var15, var3, var4, var16, var17, (int)var5 - 15);
            rrtF_2.class_(var1, var3, var4 + 10.0F, var5, 0.5F, rrZF.k_, var17);
            break;
         case 2:
            if ((Boolean)this.break_[11]) {
               rrtF_2.class_(var1, var3, var4 - 3.0F, var18.break_(var15), 9.0F, -9987865, Math.max(var17 - 50, 0));
            }

            rrtF_2.class_(var1, var18, var15, var3, var4, var16, var17);
            break;
         case 3:
            ((AnimValue)this.break_[8]).class_((Boolean)this.break_[9]);
            byte var19 = 12;
            float var20 = var3 + (float)var19 + 3.0F;
            int var21 = Math.min((int)(255.0F * ((AnimValue)this.break_[8]).byte_()) * var17 / 255, 255);
            int var22 = ColorHelper.class_(0.0F, var21);
            int var23 = ColorHelper.class_(90.0F, var21);
            int var24 = ColorHelper.class_(270.0F, var21);
            int var25 = ColorHelper.class_(180.0F, var21);
            rrfD_2.break_(
               var1,
               var3 - 1.0F,
               var4 - 1.0F,
               var5 + 2.0F,
               var6 + 2.0F,
               4.0F,
               (Integer)rrZI.break_[4],
               (Integer)rrZI.break_[4],
               (Integer)rrZI.break_[4],
               (Integer)rrZI.break_[4]
            );
            if (ClickGuiTheme.class_()) {
               rrfD_2.byte_(var1, var3 + 2.0F, var4, var5 - 3.0F, var6, 3.0F, var22, var23, var24, var25);
            }

            rrfD_2.break_(var1, var3, var4, var5, var6, 4.0F, 4.0F, 4.0F, 4.0F, var22, var23, var24, var25);
            if ((Boolean)this.break_[11]) {
               rrtF_2.class_(var1, var20, var4 + 2.5F, Math.min(var18.break_(var15), var5 - 19.0F), 10.0F, -9987865, Math.max(var17 - 50, 0));
            }

            rrtF_2.class_(var1, (rqO_2)byte_[0], var3 + 2.0F, var4 + 1.5F, (float)var19, (float)var19, rrZF.d_, var17);
            rrtF_2.class_(var1, var18, var15, var20, var4 + 5.5F, var16, var17, (int)((double)var5 * 0.8), 0.4F, 0.9F);
      }

      return catch_[4];
   }

   public rrtY_2 class_(rrZO var1) {
      this.this_();
      this.break_[17] = var1;
      return this;
   }

   public rrtY_2 class_(Function<String, String> var1) {
      this.this_();
      this.break_[18] = var1;
      return this;
   }

   @Override
   public boolean class_(char var1, int var2) {
      this.this_();
      if (!this.aO_()) {
         return false;
      } else {
         if ((Boolean)this.break_[11]
            && (
               (rrte_3)this.break_[7] == null
                  || ((rrte_3)this.break_[7]).break_() != null && ((rrte_3)this.break_[7]).break_().matcher(Character.toString(var1)).matches()
            )) {
            this.byte_("");
            Boolean var7 = false;
            this.break_[11] = var7;
         }

         return this.public_().break_(this.final_()) >= ((Supplier)this.break_[15]).get() ? false : this.byte_(this.final_() + var1);
      }
   }

   private String short_() {
      this.this_();
      return this.break_[19] / 10 % 2 == 0 ? "|" : protected_[7];
   }

   private static void void_() {
      implements_ = new int[]{-9987865, -9987865, -9987865};
   }

   public void break_(boolean var1) {
      this.this_();
      Boolean var6 = var1;
      this.break_[9] = var6;
      if ((Consumer)this.break_[14] != null) {
         ((Consumer)this.break_[14]).accept(this);
      }
   }

   public void break_(String var1) {
      this.this_();
      this.break_[10] = var1;
   }

   public rrtY_2 break_(Consumer<rrtY_2> var1) {
      this.this_();
      this.break_[14] = var1;
      return this;
   }

   public rrtY_2 break_(Supplier<Float> var1) {
      this.this_();
      this.break_[16] = var1;
      return this;
   }

   private void break_(int var1) {
      String var2 = this.final_();
      int var3 = var2.length() - var1;
      if (var3 <= 0) {
         this.byte_("");
      } else {
         this.byte_(var2.substring(0, var3));
      }
   }

   @Override
   public void throws_() {
      this.long_();
   }

   public boolean extends_() {
      this.this_();
      return (Boolean)this.break_[12];
   }

   private static void goto_() {
      throws_ = new double[]{0.8};
   }

   public float continue_() {
      this.this_();
      return (Float)this.break_[3];
   }

   private static void else_() {
      protected_ = new String[]{
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String("|"),
         new String(""),
         new String("celestial/images/search.png")
      };
   }

   private static void import_() {
      case_ = new short[]{
         1,
         8,
         15,
         16,
         0,
         6,
         7,
         0,
         1,
         2,
         3,
         4,
         5,
         0,
         10,
         18,
         18,
         11,
         1,
         255,
         1,
         255,
         16,
         0,
         6,
         11,
         11,
         8,
         9,
         8,
         255,
         255,
         4,
         4,
         4,
         4,
         11,
         0,
         256,
         257,
         335,
         13,
         13,
         11,
         11,
         7,
         259,
         11,
         11,
         11,
         23,
         11,
         23,
         259,
         256,
         11,
         7,
         7,
         7,
         11,
         15,
         19,
         19,
         19,
         12,
         23,
         7,
         7,
         1,
         7,
         7,
         12,
         23,
         11,
         10,
         19,
         0,
         0,
         7,
         7,
         0,
         7,
         7,
         0,
         9,
         9,
         14,
         14,
         6,
         11,
         10,
         10,
         15,
         13,
         14,
         16,
         17,
         18,
         2,
         3,
         4,
         5,
         12,
         17,
         0,
         17
      };
   }

   private void instanceof_() {
      this.this_();
      Object var5 = null;
      this.break_[10] = var5;
   }

   public boolean new_() {
      this.this_();
      String var1 = ((rrIv_1)this.break_[0]).break_().toString();
      return !var1.isEmpty() && !var1.isBlank() ? catch_[33] : catch_[32];
   }

   public rruv_1 package_() {
      return new rruv_1(this.volatile_(), this.continue_() - 2.0F, this.super_(), this.native_() + 3.0F);
   }

   private void return_() {
      this.this_();
      this.break_(true);
      this.char_();
      Boolean var5 = true;
      this.break_[12] = var5;
      ((Qj_1)import_.class_[23]).class_(true);
   }

   public float super_() {
      this.this_();
      return (Float)this.break_[4];
   }

   private static void throw_() {
      catch_ = new boolean[]{
         false,
         false,
         false,
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
         false,
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
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
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
         true
      };
   }

   private boolean try_() {
      this.this_();
      return (String)this.break_[10] != null ? true : catch_[37];
   }

   private static void static_() {
      finally_ = new float[]{
         0.3F,
         3.0F,
         10.0F,
         10.0F,
         0.5F,
         3.0F,
         9.0F,
         3.0F,
         255.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         4.0F,
         2.0F,
         3.0F,
         3.0F,
         4.0F,
         4.0F,
         4.0F,
         4.0F,
         2.5F,
         19.0F,
         10.0F,
         2.0F,
         1.5F,
         5.5F,
         0.4F,
         0.9F,
         2.0F,
         3.0F,
         1.0F,
         Float.MAX_VALUE,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private rrZO public_() {
      this.this_();
      return (rrZO)this.break_[17] == null ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_() : (rrZO)this.break_[17];
   }

   @Override
   public void protected_() {
      this.this_();
      if (this.aO_()) {
         Integer var5 = (Integer)this.break_[19] + 1;
         this.break_[19] = var5;
      } else {
         Integer var6 = 0;
         this.break_[19] = var6;
      }
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-116, 4, -81, 38, 114, -9, 88, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void private_() {
      this.long_();
   }

   public String final_() {
      this.this_();
      return ((rrIv_1)this.break_[0]).break_().toString();
   }

   public float volatile_() {
      this.this_();
      return (Float)this.break_[2];
   }

   private static void synchronized_() {
      Object[] var0 = new Object[]{new rqO_2("minecraft", "celestial/images/search.png")};
      byte_ = var0;
   }

   public float native_() {
      this.this_();
      return (Float)this.break_[5];
   }

   @Override
   public boolean aO_() {
      this.this_();
      return (Boolean)this.break_[9];
   }
}
