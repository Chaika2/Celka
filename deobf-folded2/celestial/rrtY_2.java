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
   public Object[] id_break;
   private static String[] id_protected;
   private static double[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;
   private static byte[] id_private;
   public static Object[] id_byte;
   private static int[] id_implements;
   private static float[] id_finally;

   private void id_char() {
      this.id_this();
      Boolean var5 = false;
      this.id_break[11] = var5;
      this.id_instanceof();
   }

   @Override
   public void id_byte(int var1, int var2, int var3) {
      super.id_byte(var1, var2, var3);
      if (var1 == 256) {
         this.id_long();
      }
   }

   public boolean id_byte(String var1) {
      this.id_this();
      if ((rrte_3)this.id_break[7] != null
         && ((rrte_3)this.id_break[7]).id_throws().equals((rrta_3)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[0])
         && !var1.isEmpty()) {
         rrtU_2 var2 = ((rrte_3)this.id_break[7]).id_break(var1);
         boolean var3 = var2.id_byte();
         if (!var3) {
            String var4 = var2.id_break();
            if (!var4.isEmpty()) {
               this.id_break(var4);
               String var5 = ((rrte_3)this.id_break[7]).id_class();
               if (var5 != null) {
                  this.id_byte(var5);
               }
            }

            return id_catch[34];
         }
      }

      ((rrIv_1)this.id_break[0]).id_class(var1);
      return true;
   }

   public void id_int() {
      this.id_long();
      this.id_byte("");
   }

   private void id_long() {
      this.id_this();
      if (this.aO_()) {
         this.id_char();
         String var1 = this.id_final();
         if ((rrte_3)this.id_break[7] != null
            && ((rrte_3)this.id_break[7]).id_throws().equals((rrta_3)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[1])
            && !var1.isEmpty()) {
            rrtU_2 var2 = ((rrte_3)this.id_break[7]).id_break(var1);
            boolean var3 = var2.id_byte();
            if (!var3) {
               String var4 = var2.id_break();
               if (!var4.isEmpty()) {
                  this.id_break(var4);
                  this.id_byte(Objects.requireNonNullElse(((rrte_3)this.id_break[7]).id_class(), ""));
               }
            }
         }

         this.id_break(false);
         Boolean var9 = false;
         this.id_break[12] = var9;
         ((Qj_1)id_import.id_class[23]).id_class(false);
      }
   }

   private static void id_float() {
      id_private = new byte[]{50, 15, 50, 12, 50, 10, 2, 20, 2, 3, 4, 5, 9, 11, 12, 19};
   }

   public rrtY_2(rrIv_1 var1, rrtK_2 var2) {
      this.id_this();
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.3F, false);
      this.id_break[8] = var7;
      Supplier var8 = () -> Float.MAX_VALUE;
      this.id_break[15] = var8;
      Supplier var9 = () -> 1.0F;
      this.id_break[16] = var9;
      this.id_break[0] = var1;
      this.id_break[6] = var2;
      rrte_3 var12 = var1.id_finally();
      this.id_break[7] = var12;
      this.id_class(() -> var1.id_volatile());
      ((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).id_break(this);
   }

   public rrtY_2(rrtm_3 var1, rrIv_1 var2, rrtK_2 var3) {
      this(var2, var3);
      this.id_break[1] = var1;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[20];
         Object[] var1 = this.id_break;
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

   private int id_interface() {
      this.id_this();
      rrtD_2 var1 = ((rrtK_2)this.id_break[6]).id_class();
      if (this.id_try()) {
         return var1.id_break();
      } else {
         return this.id_break[11] ? var1.id_class() : var1.id_byte();
      }
   }

   public rrtY_2 id_class(Consumer<rrtY_2> var1) {
      this.id_this();
      this.id_break[13] = var1;
      return this;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_this();
      if (!this.aO_()) {
         return false;
      } else if (var1 == 256) {
         return false;
      } else {
         this.id_instanceof();
         if (var1 == 257 || var1 == 335) {
            if ((Consumer)this.id_break[13] != null) {
               ((Consumer)this.id_break[13]).accept(this);
            }

            this.id_long();
         }

         if (vm_3.id_private(var1)) {
            Boolean var10 = true;
            this.id_break[11] = var10;
            return false;
         } else {
            if ((Boolean)this.id_break[11]) {
               Pattern var4 = ((rrte_3)this.id_break[7]).id_break();
               String var5 = Ve_1.id_class(var1, var2).id_byte();
               if (var1 == 259 || var4 != null && var4.matcher(var5).matches()) {
                  this.id_byte("");
                  Boolean var11 = false;
                  this.id_break[11] = var11;
               }
            }

            if (vm_3.id_case(var1)) {
               if ((Boolean)this.id_break[11]) {
                  this.id_byte("");
                  Boolean var12 = false;
                  this.id_break[11] = var12;
               }

               this.id_byte(this.id_final() + ((Qj_1)id_import.id_class[23]).id_class());
               return true;
            } else if ((Boolean)this.id_break[11] && vm_3.id_catch(var1)) {
               ((Qj_1)id_import.id_class[23]).id_class(this.id_final());
               return true;
            } else if (var1 == 259) {
               this.id_break(1);
               return true;
            } else {
               return id_catch[18];
            }
         }
      }
   }

   public rrtY_2 id_class(Supplier<Float> var1) {
      this.id_this();
      this.id_break[15] = var1;
      return this;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1699841828;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      if (!super.id_class(var1, var2, var3, var4, var5)) {
         return false;
      } else if (this.id_package().id_break((float)var2, (float)var3)) {
         this.id_return();
         return true;
      } else {
         return id_catch[7];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4534784480054895200L;
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.id_this();
      Float var30 = var3;
      this.id_break[2] = var30;
      Float var31 = var4;
      this.id_break[3] = var31;
      Float var32 = var5;
      this.id_break[4] = var32;
      Float var33 = var6;
      this.id_break[5] = var33;
      boolean var10 = this.id_new();
      boolean var11 = this.aO_();
      boolean var12 = this.id_try();
      String var13 = ((rrIv_1)this.id_break[0]).id_native().get();
      String var14 = var10 && !var11 ? var13 : this.id_final();
      String var15 = var12 ? (String)this.id_break[10] : ((Function)this.id_break[18] != null ? (String)((Function)this.id_break[18]).apply(var14) : var14);
      if (var11 && !var12 && !(Boolean)this.id_break[11]) {
         var15 = var15 + this.id_short();
      }

      int var16 = this.id_interface();
      int var17 = (int)((float)((rrtm_3)this.id_break[1] == null ? 255 : ((rrtm_3)this.id_break[1]).id_class(255)) * (Float)((Supplier)this.id_break[16]).get());
      rrZO var18 = this.id_public();
      switch (((int[])rrto_3.id_class[0])[((rrtK_2)this.id_break[6]).ordinal()]) {
         case 1:
            if ((Boolean)this.id_break[11]) {
               rrtF_2.id_class(var1, var3, var4 - 3.0F, var18.id_break(var15), 10.0F, -9987865, Math.max(var17 - 50, 0));
            }

            rrtF_2.id_class(var1, var18, var15, var3, var4, var16, var17, (int)var5 - 15);
            rrtF_2.id_class(var1, var3, var4 + 10.0F, var5, 0.5F, rrZF.k_, var17);
            break;
         case 2:
            if ((Boolean)this.id_break[11]) {
               rrtF_2.id_class(var1, var3, var4 - 3.0F, var18.id_break(var15), 9.0F, -9987865, Math.max(var17 - 50, 0));
            }

            rrtF_2.id_class(var1, var18, var15, var3, var4, var16, var17);
            break;
         case 3:
            ((AnimValue)this.id_break[8]).id_class((Boolean)this.id_break[9]);
            byte var19 = 12;
            float var20 = var3 + (float)var19 + 3.0F;
            int var21 = Math.min((int)(255.0F * ((AnimValue)this.id_break[8]).id_byte()) * var17 / 255, 255);
            int var22 = ColorHelper.id_class(0.0F, var21);
            int var23 = ColorHelper.id_class(90.0F, var21);
            int var24 = ColorHelper.id_class(270.0F, var21);
            int var25 = ColorHelper.id_class(180.0F, var21);
            rrfD_2.id_break(
               var1,
               var3 - 1.0F,
               var4 - 1.0F,
               var5 + 2.0F,
               var6 + 2.0F,
               4.0F,
               (Integer)rrZI.id_break[4],
               (Integer)rrZI.id_break[4],
               (Integer)rrZI.id_break[4],
               (Integer)rrZI.id_break[4]
            );
            if (ClickGuiTheme.id_class()) {
               rrfD_2.id_byte(var1, var3 + 2.0F, var4, var5 - 3.0F, var6, 3.0F, var22, var23, var24, var25);
            }

            rrfD_2.id_break(var1, var3, var4, var5, var6, 4.0F, 4.0F, 4.0F, 4.0F, var22, var23, var24, var25);
            if ((Boolean)this.id_break[11]) {
               rrtF_2.id_class(var1, var20, var4 + 2.5F, Math.min(var18.id_break(var15), var5 - 19.0F), 10.0F, -9987865, Math.max(var17 - 50, 0));
            }

            rrtF_2.id_class(var1, (rqO_2)id_byte[0], var3 + 2.0F, var4 + 1.5F, (float)var19, (float)var19, rrZF.d_, var17);
            rrtF_2.id_class(var1, var18, var15, var20, var4 + 5.5F, var16, var17, (int)((double)var5 * 0.8), 0.4F, 0.9F);
      }

      return id_catch[4];
   }

   public rrtY_2 id_class(rrZO var1) {
      this.id_this();
      this.id_break[17] = var1;
      return this;
   }

   public rrtY_2 id_class(Function<String, String> var1) {
      this.id_this();
      this.id_break[18] = var1;
      return this;
   }

   @Override
   public boolean id_class(char var1, int var2) {
      this.id_this();
      if (!this.aO_()) {
         return false;
      } else {
         if ((Boolean)this.id_break[11]
            && (
               (rrte_3)this.id_break[7] == null
                  || ((rrte_3)this.id_break[7]).id_break() != null && ((rrte_3)this.id_break[7]).id_break().matcher(Character.toString(var1)).matches()
            )) {
            this.id_byte("");
            Boolean var7 = false;
            this.id_break[11] = var7;
         }

         return this.id_public().id_break(this.id_final()) >= ((Supplier)this.id_break[15]).get() ? false : this.id_byte(this.id_final() + var1);
      }
   }

   private String id_short() {
      this.id_this();
      return this.id_break[19] / 10 % 2 == 0 ? "|" : id_protected[7];
   }

   private static void id_void() {
      id_implements = new int[]{-9987865, -9987865, -9987865};
   }

   public void id_break(boolean var1) {
      this.id_this();
      Boolean var6 = var1;
      this.id_break[9] = var6;
      if ((Consumer)this.id_break[14] != null) {
         ((Consumer)this.id_break[14]).accept(this);
      }
   }

   public void id_break(String var1) {
      this.id_this();
      this.id_break[10] = var1;
   }

   public rrtY_2 id_break(Consumer<rrtY_2> var1) {
      this.id_this();
      this.id_break[14] = var1;
      return this;
   }

   public rrtY_2 id_break(Supplier<Float> var1) {
      this.id_this();
      this.id_break[16] = var1;
      return this;
   }

   private void id_break(int var1) {
      String var2 = this.id_final();
      int var3 = var2.length() - var1;
      if (var3 <= 0) {
         this.id_byte("");
      } else {
         this.id_byte(var2.substring(0, var3));
      }
   }

   @Override
   public void id_throws() {
      this.id_long();
   }

   public boolean id_extends() {
      this.id_this();
      return (Boolean)this.id_break[12];
   }

   private static void id_goto() {
      id_throws = new double[]{0.8};
   }

   public float id_continue() {
      this.id_this();
      return (Float)this.id_break[3];
   }

   private static void id_else() {
      id_protected = new String[]{
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

   private static void id_import() {
      id_case = new short[]{
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

   private void id_instanceof() {
      this.id_this();
      Object var5 = null;
      this.id_break[10] = var5;
   }

   public boolean id_new() {
      this.id_this();
      String var1 = ((rrIv_1)this.id_break[0]).id_break().toString();
      return !var1.isEmpty() && !var1.isBlank() ? id_catch[33] : id_catch[32];
   }

   public rruv_1 id_package() {
      return new rruv_1(this.id_volatile(), this.id_continue() - 2.0F, this.id_super(), this.id_native() + 3.0F);
   }

   private void id_return() {
      this.id_this();
      this.id_break(true);
      this.id_char();
      Boolean var5 = true;
      this.id_break[12] = var5;
      ((Qj_1)id_import.id_class[23]).id_class(true);
   }

   public float id_super() {
      this.id_this();
      return (Float)this.id_break[4];
   }

   private static void id_throw() {
      id_catch = new boolean[]{
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

   private boolean id_try() {
      this.id_this();
      return (String)this.id_break[10] != null ? true : id_catch[37];
   }

   private static void id_static() {
      id_finally = new float[]{
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

   private rrZO id_public() {
      this.id_this();
      return (rrZO)this.id_break[17] == null
         ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally()
         : (rrZO)this.id_break[17];
   }

   @Override
   public void id_protected() {
      this.id_this();
      if (this.aO_()) {
         Integer var5 = (Integer)this.id_break[19] + 1;
         this.id_break[19] = var5;
      } else {
         Integer var6 = 0;
         this.id_break[19] = var6;
      }
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-116, 4, -81, 38, 114, -9, 88, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_private() {
      this.id_long();
   }

   public String id_final() {
      this.id_this();
      return ((rrIv_1)this.id_break[0]).id_break().toString();
   }

   public float id_volatile() {
      this.id_this();
      return (Float)this.id_break[2];
   }

   private static void id_synchronized() {
      Object[] var0 = new Object[]{new rqO_2("minecraft", "celestial/images/search.png")};
      id_byte = var0;
   }

   public float id_native() {
      this.id_this();
      return (Float)this.id_break[5];
   }

   @Override
   public boolean aO_() {
      this.id_this();
      return (Boolean)this.id_break[9];
   }
}
