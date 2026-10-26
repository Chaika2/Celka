package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZa_1 extends GuiComponent {
   private static short[] id_break;
   private static String[] id_byte;
   public Object[] id_class;
   private static float[] id_protected;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static int[] id_catch;

   private static void id_boolean() {
      id_break = new short[]{
         4,
         5,
         6,
         3,
         2,
         0,
         1,
         9,
         10,
         6,
         1,
         7,
         4,
         0,
         0,
         2,
         7,
         0,
         3,
         5,
         4,
         2,
         2,
         2,
         7,
         4,
         4,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         8,
         0,
         0,
         1500,
         7,
         2,
         2,
         2,
         2,
         0,
         1500,
         3,
         3,
         4,
         4,
         3,
         5,
         5,
         5,
         0,
         6,
         2,
         0,
         1,
         11,
         9,
         10,
         11,
         5,
         6,
         6,
         6,
         5,
         3,
         3,
         270,
         180,
         0,
         2,
         0,
         2,
         5,
         6,
         8
      };
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, -126, -82, 82, -59, -51, 11, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_int() {
      this.id_new();
      return ((AnimValue)this.id_class[id_break[55]]).id_catch();
   }

   private float id_long() {
      this.id_new();
      return ((AnimValue)this.id_class[id_break[67]]).id_byte() * ((rrZw_1)this.id_class[id_break[68]]).id_implements().id_class().id_byte();
   }

   public rrZa_1(rrZw_1 var1, rrIX var2, Supplier<Float> var3, Supplier<Float> var4, float var5, float var6) {
      this.id_new();
      rruL var11 = new rruL();
      this.id_class[id_break[0]] = var11;
      AnimValue var12 = new AnimValue(id_protected[0], id_throws[0]);
      this.id_class[id_break[1]] = var12;
      AnimValue var13 = new AnimValue(id_protected[1], id_throws[1]);
      this.id_class[id_break[2]] = var13;
      this.id_class[id_break[3]] = var1;
      this.id_class[id_break[4]] = var2;
      this.id_class[id_break[5]] = var3;
      this.id_class[id_break[6]] = var4;
      Float var18 = var5;
      this.id_class[id_break[7]] = var18;
      Float var19 = var6;
      this.id_class[id_break[8]] = var19;
      rrtY_2 var20 = new rrtY_2(
            new rrIv_1(var2.id_class(), rrte_3.id_class((Pattern)rrtR_2.id_class[id_break[9]])).id_class(var2.id_class()),
            (rrtK_2)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[id_break[10]]
         )
         .id_class(var1x -> this.an_())
         .id_class(() -> var5 / id_protected[43])
         .id_break(this::id_long)
         .id_break(var2x -> {
            this.id_new();
            String var7 = var2.id_class();
            this.id_class[id_break[78]] = var7;
         });
      this.id_class[id_break[11]] = var20;
      this.id_throw();
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.id_new();
      super.id_class(var1, var2, var3, var4, var5, var6, var7);
      if (this.id_int()) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[14]]).id_catch().id_break((rrIX)this.id_class[id_break[15]], id_throws[4]);
         ((rrtY_2)this.id_class[id_break[16]]).id_throws();
      } else {
         rrZO var8 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[17]]).id_class();
         float var9 = var5.id_break();
         float var10 = var5.id_protected();
         int var11 = (int)var5.id_byte();
         int var12 = (int)var5.id_class();
         float var13 = ((rrZw_1)this.id_class[id_break[18]]).id_implements().id_class().id_byte();
         int var14 = (int)(id_protected[5] * ((AnimValue)this.id_class[id_break[19]]).id_byte() * var13);
         int var15 = ColorHelper.id_break((Integer)rrZI.id_break[id_break[20]], var14);
         rrfD_2.id_class(var1, var9, var10, (float)var11, (float)var12, id_protected[6], id_protected[7], id_protected[8], id_protected[9], rrZF.n_);
         rrfD_2.id_break(var1, var9, var10, (float)var11, (float)var12, id_protected[10], var15, var15, var15, var15);
         String var16 = ((rrIX)this.id_class[id_break[21]]).id_class();
         String var17 = ((rrIX)this.id_class[id_break[22]]).id_protected();
         String var18 = ((rrIX)this.id_class[id_break[23]]).id_break();
         String var19 = id_byte[0];
         String var20 = id_byte[1];
         float var21 = var8.id_break(var19);
         float var22 = var8.id_break(var18) + id_protected[11];
         float var23 = var8.id_break(var20);
         ((rrtY_2)this.id_class[id_break[24]])
            .id_class(
               var1, var2, var9 + id_protected[12], var10 + id_protected[13], var8.id_break(var16) + id_protected[14], id_protected[15], var3, var4, var6
            );
         int var24 = ColorHelper.id_break(id_catch[0], var14);
         var8.id_break(var1, var19, (double)(var9 + id_protected[16]), (double)(var10 + id_protected[17]), var24, id_throws[5], id_throws[6]);
         var8.id_class(var1, var18, (double)(var9 + var21 + id_protected[18]), (double)(var10 + id_protected[19]), id_case[2], var14, id_throws[7]);
         var8.id_break(var1, var20, (double)(var9 + var21 + var22), (double)(var10 + id_protected[20]), var24, id_throws[8], id_throws[9]);
         var8.id_class(
            var1, var17, (double)(var9 + var21 + var22 + var23 + id_protected[21]), (double)(var10 + id_protected[22]), id_case[3], var14, id_throws[10]
         );
         ((rruL)this.id_class[id_break[25]]).id_class(var1, var2, var3, var4, var6, var7);
      }
   }

   @Override
   public rrZN id_class() {
      this.id_new();
      return (rrZw_1)this.id_class[id_break[50]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 822288335582151767L;
   }

   @Override
   public boolean id_class(char var1, int var2) {
      this.id_new();
      return ((rrtY_2)this.id_class[id_break[30]]).id_class(var1, var2);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      this.id_abstract();
      return super.id_class(var1, var2, var3, var4, var6, var7);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_new();
      if (this.id_protected().id_break((float)var2, (float)var3)) {
         boolean var6 = ((rruL)this.id_class[id_break[26]]).id_class(var1, var2, var3, var4, var5);
         boolean var7 = !((rrtY_2)this.id_class[id_break[27]]).id_class(var1, var2, var3, var4, var5) && !var6 ? id_throws[12] : id_throws[11];
         if (var4 == 0 && var7) {
            return id_throws[13];
         }
      }

      this.an_();
      return id_throws[14];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1980855924;
   }

   public String id_class(String var1) {
      if (var1.isEmpty()) {
         return id_byte[5];
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[54]]).id_catch().id_byte(var1) ? id_byte[6] : null;
      }
   }

   @Override
   public void id_class(Category var1, Category var2) {
      this.id_new();
      super.id_class(var1, var2);
      if (var2 == (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_break[51]]) {
         ((AnimValue)this.id_class[id_break[52]]).id_extends();
      }
   }

   public void id_class(float var1) {
      this.id_new();
      Float var6 = var1;
      this.id_class[id_break[62]] = var6;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_new();
      return ((rrtY_2)this.id_class[id_break[28]]).id_class(var1, var2, var3);
   }

   public float id_break() {
      this.id_new();
      return (Float)((Supplier)this.id_class[id_break[58]]).get() + (Float)this.id_class[id_break[59]];
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_new();
      super.id_break(var1, var2, var3);
      ((rrtY_2)this.id_class[id_break[29]]).id_byte(var1, var2, var3);
   }

   public float id_catch() {
      this.id_new();
      return (Float)this.id_class[id_break[61]];
   }

   public rrIX id_extends() {
      this.id_new();
      return (rrIX)this.id_class[id_break[56]];
   }

   public float id_case() {
      this.id_new();
      return (Float)((Supplier)this.id_class[id_break[57]]).get();
   }

   private static void id_import() {
      id_case = new byte[]{3, 2, 15, 15, 100, 90, 12, 9, 10, 11};
   }

   private void id_new() {
      if (this.id_class == null) {
         this.id_class = new Object[id_case[6]];
         Object[] var1 = this.id_class;
         var1[id_case[7]] = id_protected[44];
         var1[id_case[8]] = id_protected[45];
         var1[id_case[9]] = id_protected[46];
      }
   }

   public AnimValue id_package() {
      this.id_new();
      return (AnimValue)this.id_class[id_break[63]];
   }

   private static void id_super() {
      id_throws = new boolean[]{
         false, false, false, true, true, false, false, false, false, false, false, true, false, true, false, true, false, true, false, false
      };
   }

   private static void id_switch() {
      id_protected = new float[]{
         0.45F,
         0.45F,
         0.2F,
         0.2F,
         0.2F,
         255.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         4.0F,
         10.0F,
         5.0F,
         6.0F,
         5.0F,
         4.0F,
         5.0F,
         16.0F,
         7.0F,
         16.0F,
         16.0F,
         2.0F,
         16.0F,
         8.0F,
         0.0F,
         16.5F,
         4.5F,
         40.5F,
         12.0F,
         46.0F,
         7.0F,
         8.0F,
         8.0F,
         4.0F,
         2.0F,
         10.0F,
         10.0F,
         60.0F,
         8.0F,
         10.0F,
         10.0F,
         74.0F,
         8.0F,
         1.7F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private void id_throw() {
      this.id_new();
      Runnable var1 = () -> {
         this.id_new();
         ((AnimValue)this.id_class[id_break[76]]).id_class(id_throws[18]);
         ((AnimValue)this.id_class[id_break[77]]).id_class(id_throws[19]);
      };
      Runnable var2 = () -> {
         this.id_new();
         this.id_abstract();
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[74]]).id_catch().id_class((rrIX)this.id_class[id_break[75]], id_throws[17]);
      };
      Runnable var3 = () -> {
         this.id_new();
         this.id_abstract();
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[72]]).id_catch().id_byte((rrIX)this.id_class[id_break[73]], id_throws[16]);
      };
      Supplier var4 = () -> {
         this.id_new();
         int var1x = ((rrZw_1)this.id_class[id_break[69]]).id_extends().indexOf(this) * id_case[4];
         return new rji_3(
            (float)ColorHelper.id_class((float)var1x),
            (float)ColorHelper.id_class((float)(var1x + id_case[5])),
            (float)ColorHelper.id_class((float)(var1x + id_break[70])),
            (float)ColorHelper.id_class((float)(var1x + id_break[71]))
         );
      };
      rruL var10000 = (rruL)this.id_class[id_break[12]];
      rruF[] var10001 = new rruF[id_case[0]];
      var10001[id_throws[2]] = new rruF(new rrun_1(() -> rrZL.m_, () -> {
         rruv_1 var1x = this.id_protected();
         return new rjK_2(var1x.id_break() + this.id_native() - id_protected[41], var1x.id_protected() + id_protected[42]);
      }, () -> new rjK_2(id_protected[39], id_protected[40]), () -> rrZF.d_).<rrun_1>id_class(this::id_long).id_class(id_protected[2])).id_class(var1);
      var10001[id_throws[3]] = new rruF(new rrun_1(() -> rrZL.id_private, () -> {
         rruv_1 var1x = this.id_protected();
         return new rjK_2(var1x.id_break() + this.id_native() - id_protected[37], var1x.id_protected() + id_protected[38]);
      }, () -> new rjK_2(id_protected[35], id_protected[36]), () -> rrZF.d_).<rrun_1>id_class(this::id_long).id_class(id_protected[3])).id_class(var3);
      var10001[id_case[1]] = new rruF(
            new rruH(
                  () -> rrZL.id_extends,
                  () -> new rjK_2(id_protected[33], id_protected[34]),
                  () -> new rjK_2(id_protected[31], id_protected[32]),
                  () -> rrZF.d_,
                  ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[13]]).id_finally(),
                  () -> id_byte[7],
                  () -> {
                     rruv_1 var1x = this.id_protected();
                     return new rjK_2(var1x.id_break() + this.id_native() - id_protected[29], var1x.id_protected() + id_protected[30]);
                  },
                  () -> new rjK_2(id_protected[27], id_protected[28]),
                  () -> new rjK_2(id_protected[25], id_protected[26]),
                  () -> rrZF.d_,
                  var4
               )
               .<rrup_1>id_break(ClickGuiTheme::id_class)
               .<rrup_1>id_class(this::id_long)
               .id_class(id_protected[4])
         )
         .id_class(var2);
      var10000.id_class(var10001);
   }

   private static void id_try() {
      id_catch = new int[]{6781311};
   }

   @Override
   public rruv_1 id_protected() {
      this.id_new();
      float var1 = this.id_native();
      Pair var2 = ((rrZw_1)this.id_class[id_break[46]]).id_implements().id_class(((rrZw_1)this.id_class[id_break[47]]).id_case());
      float var3 = id_protected[23] * (Float)var2.getLeft();
      if ((Boolean)var2.getRight()) {
         var1 -= var3;
         ((rruL)this.id_class[id_break[48]]).id_break(-var3);
      } else {
         ((rruL)this.id_class[id_break[49]]).id_break(id_protected[24]);
      }

      return new rruv_1(this.id_case(), this.id_break(), var1, this.id_catch());
   }

   public void id_private() {
      this.id_new();
      ((AnimValue)this.id_class[id_break[65]]).id_class(id_throws[15]);
      ((AnimValue)this.id_class[id_break[66]]).id_class();
   }

   private void id_abstract() {
      this.id_new();
      if (((rrtY_2)this.id_class[id_break[32]]).aO_()) {
         ((rrtY_2)this.id_class[id_break[33]]).id_throws();
         String var1 = ((rrtY_2)this.id_class[id_break[34]]).id_final();
         if (!((String)this.id_class[id_break[35]]).equals(var1)) {
            Map var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[36]]).id_catch().id_throws();
            String var3 = this.id_class(var1);
            if (var3 != null) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[37]]).id_class(new rrtx_3(id_byte[2], var3, id_break[38]));
               ((rrtY_2)this.id_class[id_break[39]]).id_byte(((rrIX)this.id_class[id_break[40]]).id_class());
            } else {
               var2.remove(((rrIX)this.id_class[id_break[41]]).id_class());
               ((rrIX)this.id_class[id_break[42]]).id_protected(var1);
               var2.put(var1, (rrIX)this.id_class[id_break[43]]);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[44]]).id_class(new rrtQ_2(id_byte[3], id_byte[4], id_break[45]));
            }
         }
      }
   }

   public AnimValue id_volatile() {
      this.id_new();
      return (AnimValue)this.id_class[id_break[64]];
   }

   private static void id_synchronized() {
      id_byte = new String[]{
         new String("Создан:"),
         new String("Автор:"),
         new String("Configs"),
         new String("Configs"),
         new String("Имя конфига успешно изменено"),
         new String("Имя конфига не может быть пустым"),
         new String("Такой конфиг уже существует"),
         new String("Load")
      };
   }

   public float id_native() {
      this.id_new();
      return (Float)this.id_class[id_break[60]];
   }

   @Override
   public void am_() {
      this.id_new();
      super.am_();
      ((AnimValue)this.id_class[id_break[53]]).id_extends();
   }

   @Override
   public void an_() {
      super.an_();
      this.id_abstract();
   }

   @Override
   public void al_() {
      this.id_new();
      super.al_();
      ((rrtY_2)this.id_class[id_break[31]]).id_protected();
   }
}
