package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZY extends GuiComponent {
   public Object[] id_class;
   public static Object[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   private static int[] id_case;
   private static short[] id_catch;
   private static float[] id_private;

   private float id_char() {
      this.id_try();
      return ((AnimValue)this.id_class[id_catch[71]]).id_byte() * ((rrZK)this.id_class[id_catch[72]]).id_implements().id_class().id_byte();
   }

   @Override
   public rdn_3 id_byte() {
      this.id_try();
      return (rdn_3)this.id_class[id_catch[57]];
   }

   private void id_int() {
      this.id_try();
      if (((rrtY_2)this.id_class[id_catch[45]]).aO_()) {
         ((rrtY_2)this.id_class[id_catch[46]]).id_throws();
         String var1 = ((rrtY_2)this.id_class[id_catch[47]]).id_final();
         if (var1.isEmpty()) {
            ((rrtY_2)this.id_class[id_catch[48]]).id_byte(String.valueOf(((rrNd_1)this.id_class[id_catch[49]]).id_else()));
         } else if (!((String)this.id_class[id_catch[50]]).equals(var1)) {
            try {
               int var2 = Integer.parseInt(var1);
               ((rrNd_1)this.id_class[id_catch[51]]).id_break(var2);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[52]]).id_class(new rrtQ_2(id_throws[1], id_throws[2], id_catch[53]));
            } catch (NumberFormatException var4) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[54]]).id_class(new rrtQ_2(id_throws[3], id_throws[4], id_catch[55]));
            }
         }
      }
   }

   public rrZY(rrZK var1, rrNd_1 var2, rrtu_3 var3, ClickGuiScreen var4, Supplier<Float> var5, Supplier<Float> var6, float var7, float var8) {
      this.id_try();
      rruL var13 = new rruL();
      this.id_class[id_catch[0]] = var13;
      AnimValue var14 = new AnimValue(id_private[0], id_protected[0]);
      this.id_class[id_catch[1]] = var14;
      this.id_class[id_catch[2]] = var1;
      this.id_class[id_catch[3]] = var5;
      this.id_class[id_catch[4]] = var6;
      Float var18 = var7;
      this.id_class[id_catch[5]] = var18;
      Float var19 = var8;
      this.id_class[id_catch[6]] = var19;
      this.id_class[id_catch[7]] = var2;
      rrvM var21 = new rrvM(this, this::id_extends, this::id_case);
      this.id_class[id_catch[8]] = var21;
      rrtY_2 var22 = new rrtY_2(
            new rrIv_1(String.valueOf(var2.id_else()), (rrte_3)id_break[id_catch[9]]).id_class(String.valueOf(var2.id_else())),
            (rrtK_2)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[id_catch[10]]
         )
         .id_class(var1x -> this.an_())
         .id_class(() -> var7 / id_private[36])
         .id_break(this::id_char)
         .id_class(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[11]]).id_class())
         .id_class(var0 -> "$" + rql_3.id_class(var0, (char)id_byte[1]))
         .id_break(var2x -> {
            this.id_try();
            String var7x = String.valueOf(var2.id_else());
            this.id_class[id_catch[84]] = var7x;
         });
      this.id_class[id_catch[12]] = var22;
      this.id_class(var3, var4);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(char var1, int var2) {
      this.id_try();
      return ((rrtY_2)this.id_class[id_catch[41]]).id_class(var1, var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8823764644957395917L;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      this.id_int();
      return super.id_class(var1, var2, var3, var4, var6, var7);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_try();
      this.an_();
      if (this.id_protected().id_break((float)var2, (float)var3)) {
         boolean var6 = ((rruL)this.id_class[id_catch[37]]).id_class(var1, var2, var3, var4, var5);
         boolean var7 = !((rrtY_2)this.id_class[id_catch[38]]).id_class(var1, var2, var3, var4, var5) && !var6 ? id_protected[10] : id_protected[9];
         if (var4 == 0 && var7) {
            return id_protected[11];
         }
      }

      return id_protected[12];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-39, 33, 47, -15, 90, 91, 113, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_try();
      return ((rrtY_2)this.id_class[id_catch[39]]).id_class(var1, var2, var3);
   }

   public void id_class(boolean var1) {
      this.id_try();
      Boolean var6 = var1;
      this.id_class[id_catch[75]] = var6;
   }

   public void id_class(float var1) {
      this.id_try();
      Float var6 = var1;
      this.id_class[id_catch[68]] = var6;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.id_try();
      super.id_class(var1, var2, var3, var4, var5, var6, var7);
      rrZO var8 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[17]]).id_finally();
      rrZO var9 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[18]]).id_class();
      float var10 = var5.id_break();
      float var11 = var5.id_protected();
      int var12 = (int)var5.id_byte();
      int var13 = (int)var5.id_class();
      float var14 = ((rrZK)this.id_class[id_catch[19]]).id_implements().id_class().id_byte();
      int var15 = (int)(id_private[2] * ((AnimValue)this.id_class[id_catch[20]]).id_byte() * var14);
      int var16 = ColorHelper.id_break((Integer)rrZI.id_break[id_catch[21]], var15);
      int var17 = ColorHelper.id_break(rrZF.d_, var15);
      int var18 = ColorHelper.id_break(id_case[0], var15);
      rrfD_2.id_break(var1, var10, var11, (float)var12, (float)var13, id_private[3], var16, var16, var16, var16);
      String var19 = ((rrNd_1)this.id_class[id_catch[22]]).id_case();
      String var20 = String.valueOf(((rrNd_1)this.id_class[id_catch[23]]).id_else());
      String var21 = id_throws[0];
      float var22 = var9.id_break(var21);
      rdn_3 var23 = ((rrNd_1)this.id_class[id_catch[24]]).id_package() == null
         ? ((rrNd_1)this.id_class[id_catch[25]]).id_catch().id_continue()
         : ((rrNd_1)this.id_class[id_catch[26]]).id_package();
      id_short.id_class(var1, var23, var10 + id_private[4], var11 + id_private[5], this.id_char());
      var8.id_protected(var1, var19, var10 + id_private[6], var11 + id_private[7], var17, id_protected[6]);
      var9.id_protected(var1, var21, var10 + id_private[8], var11 + id_private[9], var18, id_protected[7]);
      ((rrtY_2)this.id_class[id_catch[27]])
         .id_class(var1, var2, var10 + var22 + id_private[10], var11 + id_private[11], var9.id_break(var20) + id_private[12], id_private[13], var3, var4, var6);
      ((rruL)this.id_class[id_catch[28]]).id_class(var1, var2, var3, var4, var6, var7);
      if (this.id_volatile()) {
         float var25 = var11 - id_private[14];
         String var26 = ((rrNd_1)this.id_class[id_catch[29]]).id_continue().id_class();
         float var27 = var8.id_break(var26);
         rrtF_2.id_class(var1, var10, var25, (float)var12, id_private[15], (Integer)rrZI.id_break[id_catch[30]], var15);
         rrtF_2.id_class(var1, var10 + id_private[16], var25 - id_private[17], var27 + id_private[18], (float)var8.id_class(), rrZF.n_, var15);
         var8.id_class(var1, var26, (double)(var10 + id_private[19]), (double)(var25 - id_private[20]), id_byte[0], var15, id_protected[8]);
      }
   }

   public void id_class(rrtu_3 var1, ClickGuiScreen var2) {
      this.id_try();
      Runnable var3 = () -> {
         this.id_try();
         ((rrNd_1)this.id_class[id_catch[82]]).id_break(!((rrNd_1)this.id_class[id_catch[83]]).id_while() ? id_protected[13] : id_protected[14]);
      };
      rruL var10000 = (rruL)this.id_class[id_catch[13]];
      rruF[] var10001 = new rruF[id_protected[1]];
      var10001[id_protected[2]] = new rruF(new rruA(() -> {
         this.id_try();
         return ((rrNd_1)this.id_class[id_catch[81]]).id_while();
      }, () -> {
         rruv_1 var1x = this.id_protected();
         return new rjK_2(var1x.id_break() + this.id_catch() - id_private[34], var1x.id_protected() + id_private[35]);
      }, () -> new rjK_2(id_private[32], id_private[33])).id_class(this::id_char)).id_class(var3);
      var10000.id_class(var10001);
      float var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[14]])
         .id_finally()
         .id_break(((rrNd_1)this.id_class[id_catch[15]]).id_case());
      Runnable var5 = () -> {
         this.id_try();
         float var3x = rfU_2.id_class(
            (float)var2.id_abstract() - ((rrvM)this.id_class[id_catch[77]]).id_implements() - id_private[27],
            id_private[28],
            id_const.id_volatile() - id_private[29]
         );
         float var4x = rfU_2.id_class(
            (float)var2.id_finally(), id_private[30], (float)id_const.id_native() - ((rrvM)this.id_class[id_catch[78]]).id_double() - id_private[31]
         );
         var1.id_class(((rrvM)this.id_class[id_catch[79]]).id_class(var3x, var4x), () -> {
            this.id_try();
            ((rrvM)this.id_class[id_catch[80]]).id_class(var1);
         });
      };
      var10000 = (rruL)this.id_class[id_catch[16]];
      var10001 = new rruF[id_protected[3]];
      var10001[id_protected[4]] = new rruF(
            new rrun_1(
                  () -> rrZL.id_int,
                  () -> new rjK_2(this.id_extends() + var4 + id_private[25], this.id_case() + id_private[26]),
                  () -> new rjK_2(id_private[23], id_private[24]),
                  () -> rrZF.d_
               )
               .<rrun_1>id_class(this::id_char)
               .id_class(id_private[1])
         )
         .id_class(() -> {
            this.id_try();
            return ((rrvM)this.id_class[id_catch[76]]).id_static();
         })
         .id_class(var5)
         .id_class(id_protected[5]);
      var10000.id_class(var10001);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -768797885;
   }

   @Override
   public rrZN id_class() {
      this.id_try();
      return (rrZK)this.id_class[id_catch[56]];
   }

   public rrNd_1 id_break() {
      this.id_try();
      return (rrNd_1)this.id_class[id_catch[73]];
   }

   public void id_break(float var1) {
      this.id_try();
      Float var6 = var1;
      this.id_class[id_catch[69]] = var6;
   }

   @Override
   public void id_break(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.id_try();
      super.id_break(var1, var2, var3, var4, var5, var6, var7);
      if (var5.id_break((float)var3, (float)var4) && ((rrZK)this.id_class[id_catch[31]]).id_class(var3, var4) && !rrtu_3.id_class(var2, var3, var4)) {
         rdn_3 var12 = ((rrNd_1)this.id_class[id_catch[32]]).id_package() == null
            ? ((rrNd_1)this.id_class[id_catch[33]]).id_catch().id_continue()
            : ((rrNd_1)this.id_class[id_catch[34]]).id_package();
         this.id_class[id_catch[35]] = var12;
      } else {
         Object var13 = null;
         this.id_class[id_catch[36]] = var13;
      }
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_try();
      super.id_break(var1, var2, var3);
      ((rrtY_2)this.id_class[id_catch[40]]).id_byte(var1, var2, var3);
   }

   public float id_catch() {
      this.id_try();
      return (Float)this.id_class[id_catch[66]];
   }

   public float id_extends() {
      this.id_try();
      return (Float)((Supplier)this.id_class[id_catch[62]]).get() + (Float)this.id_class[id_catch[63]];
   }

   public float id_case() {
      this.id_try();
      return (Float)((Supplier)this.id_class[id_catch[64]]).get() + (Float)this.id_class[id_catch[65]];
   }

   private static void id_continue() {
      Object[] var0 = new Object[]{rrte_3.id_class(Pattern.compile("[0-9]+", 0))};
      id_break = var0;
   }

   private static void id_instanceof() {
      id_private = new float[]{
         0.5F,
         0.2F,
         255.0F,
         4.0F,
         3.0F,
         5.0F,
         22.0F,
         7.0F,
         22.0F,
         16.0F,
         24.0F,
         16.0F,
         8.0F,
         4.0F,
         11.5F,
         0.5F,
         12.0F,
         2.0F,
         6.0F,
         15.0F,
         1.5F,
         8.0F,
         0.0F,
         6.0F,
         6.0F,
         23.5F,
         5.5F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         5.0F,
         17.0F,
         8.0F,
         23.0F,
         9.0F,
         1.7F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private static void id_return() {
      id_byte = new byte[]{15, 32, 15, 5, 9, 10, 11, 12};
   }

   private static void id_super() {
      id_case = new int[]{6781311};
   }

   private void id_try() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[2]];
         Object[] var1 = this.id_class;
         var1[id_byte[3]] = id_protected[19];
         var1[id_byte[4]] = id_private[37];
         var1[id_byte[5]] = id_private[38];
         var1[id_byte[6]] = id_private[39];
         var1[id_byte[7]] = id_private[40];
      }
   }

   private static void id_while() {
      id_catch = new short[]{
         0,
         6,
         1,
         7,
         8,
         11,
         12,
         3,
         4,
         0,
         1,
         0,
         2,
         0,
         0,
         3,
         0,
         0,
         0,
         1,
         6,
         4,
         3,
         3,
         3,
         3,
         3,
         2,
         0,
         3,
         4,
         1,
         3,
         3,
         3,
         14,
         14,
         0,
         2,
         2,
         2,
         2,
         2,
         2,
         3,
         2,
         2,
         2,
         2,
         3,
         13,
         3,
         0,
         1500,
         0,
         1500,
         1,
         14,
         1,
         1,
         0,
         0,
         7,
         9,
         8,
         10,
         11,
         12,
         9,
         10,
         6,
         6,
         1,
         3,
         5,
         5,
         4,
         4,
         4,
         4,
         4,
         3,
         3,
         3,
         13
      };
   }

   private static void id_public() {
      id_throws = new String[]{
         new String("Цена за штуку:"),
         new String("Auto Buy"),
         new String("Цена предмета успешна изменена"),
         new String("Auto Buy"),
         new String("Слишком большая цена")
      };
   }

   @Override
   public rruv_1 id_protected() {
      this.id_try();
      float var1 = this.id_catch();
      Pair var2 = ((rrZK)this.id_class[id_catch[58]]).id_implements().id_class(((rrZK)this.id_class[id_catch[59]]).id_case());
      float var3 = id_private[21] * (Float)var2.getLeft();
      if ((Boolean)var2.getRight()) {
         var1 -= var3;
         ((rruL)this.id_class[id_catch[60]]).id_break(-var3);
      } else {
         ((rruL)this.id_class[id_catch[61]]).id_break(id_private[22]);
      }

      return new rruv_1(this.id_extends(), this.id_case(), var1, this.id_native());
   }

   public AnimValue id_private() {
      this.id_try();
      return (AnimValue)this.id_class[id_catch[70]];
   }

   private static void id_abstract() {
      id_protected = new boolean[]{
         true, true, false, true, false, false, false, false, false, true, false, true, false, true, false, true, true, false, false, false, true
      };
   }

   public boolean id_volatile() {
      this.id_try();
      return (Boolean)this.id_class[id_catch[74]];
   }

   public float id_native() {
      this.id_try();
      return (Float)this.id_class[id_catch[67]];
   }

   @Override
   public void am_() {
      this.id_try();
      super.am_();
      ((rrtY_2)this.id_class[id_catch[43]]).id_byte(String.valueOf(((rrNd_1)this.id_class[id_catch[44]]).id_else()));
   }

   @Override
   public void an_() {
      super.an_();
      this.id_int();
   }

   @Override
   public void al_() {
      this.id_try();
      super.al_();
      ((rrtY_2)this.id_class[id_catch[42]]).id_protected();
   }
}
