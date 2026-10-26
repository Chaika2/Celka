package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZw_1 extends rrZN implements rrZT, rrZq_1<rrZa_1> {
   private static short[] id_protected;
   private static String[] id_throws;
   public Object[] id_break;
   private static double[] id_case;
   private static float[] id_catch;
   public static Object[] id_byte;
   private static boolean[] id_private;
   private static byte[] id_implements;

   private static void id_char() {
      id_protected = new short[]{
         1, 2, 4, 0, 5, 3, 0, 0, 1, 2, 0, 300, 3, 0, 4, 2, 0, 2, 3, 0, 0, 1, 5, 5, 3, 1, 1, 3, 4, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 0, 3, 255, 0, 4, 0, 0
      };
   }

   @Override
   public List<rrZa_1> id_byte() {
      this.id_volatile();
      Predicate var1 = var1x -> {
         this.id_volatile();
         rrIX var2 = var1x.id_extends();
         rrtY_2 var3 = ((rrvJ)this.id_break[id_protected[41]]).id_finally().id_extends();
         String var4 = var3.id_final();
         String var5 = var2.id_class();
         String var6 = var2.id_protected();
         if (var3.id_new()) {
            return true;
         } else {
            String var7 = var4.trim().toLowerCase();
            return !var5.toLowerCase().contains(var7) && !var6.toLowerCase().contains(var7) ? id_private[18] : true;
         }
      };
      return ((List)this.id_break[1]).stream().filter(var1).toList();
   }

   @Override
   public void id_byte(int var1, int var2, int var3) {
      super.id_byte(var1, var2, var3);
      this.id_byte().forEach(var3x -> var3x.id_break(var1, var2, var3));
   }

   public rrZa_1 id_byte(String var1) {
      this.id_volatile();
      return ((List)this.id_break[1]).stream().filter(var1x -> var1x.id_extends().id_class().equals(var1)).findFirst().orElse(null);
   }

   public rrZw_1(rrvJ var1, float var2, float var3) {
      this.id_volatile();
      ArrayList var15 = new ArrayList();
      this.id_break[1] = var15;
      rruL var16 = new rruL();
      this.id_break[2] = var16;
      AnimValue var17 = new AnimValue(0.5F, id_private[0]);
      this.id_break[4] = var17;
      this.id_break[id_protected[3]] = var1;
      Float var19 = var2;
      this.id_break[5] = var19;
      rrZl_1 var20 = new rrZl_1(new rrZH(0.5F));
      this.id_break[3] = var20;
      Supplier var4 = () -> (float)var1.id_volatile().id_abstract() + var2;
      Supplier var5 = () -> (float)var1.id_volatile().id_finally() + var3;
      float var6 = 363.0F - var2 - 7.0F;
      float var7 = 26.0F;
      rrIJ var10000 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[6]]).id_catch();
      rrZp_1[] var10001 = new rrZp_1[2];
      var10001[id_private[1]] = new rrZD(this, var4, var5, var6, var7);
      var10001[1] = new rrZU();
      var10000.id_class(var10001);

      for (rrIX var9 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[7]]).id_catch().id_break()) {
         rrZa_1 var10 = new rrZa_1(this, var9, var4, var5, var6, var7);
         var10.id_private();
         ((List)this.id_break[1]).add(var10);
      }

      this.id_class(var4, var5, var6);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new String[]{new String("Create")};
   }

   @Override
   public void id_class(Category var1, Category var2) {
      this.id_volatile();
      super.id_class(var1, var2);
      ((AnimValue)this.id_break[4]).id_extends();
      ((List)this.id_break[1]).forEach(var2x -> var2x.id_class(var1, var2));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4822521452054783750L;
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.id_volatile();
      rrZH var10 = ((rrZl_1)this.id_break[3]).id_extends();
      int var11 = this.id_break();
      int var12 = id_try();
      int var13 = id_class(var12);
      this.id_implements()
         .id_class(
            () -> {
               this.id_volatile();
               List var13x = this.id_byte();
               AnimValue var14x = this.id_implements().id_class();
               float var15 = id_catch[21];
               var14x.id_class(!this.ai_() ? true : id_private[20]);
               var10.id_class((float)var11, (float)(var13 + 5));
               float var16 = (1.0F - var14x.id_byte()) * 5.0F;

               for (rrZa_1 var18 : var13x) {
                  AnimValue var19 = var18.id_volatile();
                  var19.id_class(!var19.id_new() ? true : id_private[22]);
                  var15 += (float)var12 * var19.id_byte();
                  var18.id_class(var15 + var10.id_case() + var16);
                  AnimValue var20 = var18.id_package();
                  var20.id_class(!var18.id_package().id_new() ? true : id_private[24]);
               }

               for (int var21 = var13x.size() - 1; var21 >= 0; var21--) {
                  rrZa_1 var22 = (rrZa_1)var13x.get(var21);
                  rruv_1 var23 = var22.id_protected();
                  if (!(var23.id_protected() < var4) && !(var23.id_protected() > var4 + (float)var13 + (float)var12 + 10.0F)) {
                     var22.id_class(var1, var2, var7, var8, var23, var9, id_private[26]);
                  }
               }

               this.id_implements()
                  .id_class(
                     var1,
                     (rrZl_1)this.id_break[3],
                     var2,
                     var3 + var5 - 9.0F,
                     var4 + 10.0F + (float)var12,
                     var7,
                     var8,
                     5.0F,
                     (float)(var13 - 7),
                     (float)(var11 - 12),
                     255,
                     var9
                  );
            },
            var1,
            var3 + 100.0F + 1.0F,
            var4,
            262.0F,
            299.0F
         );
      rrvJ.id_class(var1, var10, var3 + 100.0F + 1.0F, var4 + 30.0F + 4.0F, var4 + (float)var13 + (float)var12 - 10.0F, 253.0F, 20.0F);
      AnimValue var14 = ((rrvJ)this.id_break[id_protected[13]]).id_finally().id_finally();
      ((AnimValue)this.id_break[4]).id_class(var14.id_protected());
      ((rruL)this.id_break[2]).id_class(var1, var2, var7, var8, var9, id_private[5]);
      return true;
   }

   private void id_class(Supplier<Float> var1, Supplier<Float> var2, float var3) {
      this.id_volatile();
      Runnable var4 = () -> {
         int var0 = 1;
         String var1x = "NewConfig" + var0;

         while (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[46]]).id_catch().id_byte(var1x)) {
            var1x = "NewConfig" + ++var0;
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[47]]).id_catch().id_byte(var1x, true);
      };
      Supplier var5 = () -> new rji_3(
            (float)ColorHelper.id_class(id_catch[37]),
            (float)ColorHelper.id_class(90.0F),
            (float)ColorHelper.id_class(270.0F),
            (float)ColorHelper.id_class(180.0F)
         );
      rruL var10000 = (rruL)this.id_break[2];
      rruF[] var10001 = new rruF[1];
      var10001[id_private[4]] = new rruF(
            new rruH(
                  () -> rrZL.id_case,
                  () -> new rjK_2(4.0F, 2.0F),
                  () -> new rjK_2(8.0F, 8.0F),
                  () -> rrZF.d_,
                  ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_protected[10]]).id_finally(),
                  () -> id_throws[0],
                  () -> new rjK_2((Float)var1.get() + var3 - 81.0F, (Float)var2.get()),
                  () -> new rjK_2(47.0F, 12.0F),
                  () -> new rjK_2(16.5F, 4.5F),
                  () -> rrZF.d_,
                  var5
               )
               .<rrup_1>id_break(ClickGuiTheme::id_class)
               .id_class(() -> {
                  this.id_volatile();
                  return ((AnimValue)this.id_break[4]).id_byte() * this.id_implements().id_class().id_byte();
               })
         )
         .id_class(() -> {
            this.id_volatile();
            ((rrvJ)this.id_break[id_protected[44]]).id_finally().id_extends().id_int();
            var4.run();
         });
      var10000.id_class(var10001);
   }

   @Override
   public boolean id_class(char var1, int var2) {
      return this.id_byte().stream().anyMatch(var2x -> var2x.id_class(var1, var2));
   }

   public void id_class(int var1, rrZa_1 var2) {
      this.id_volatile();
      ((List)this.id_break[1]).add(var1, var2);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_volatile();
      ClickGuiScreen var6 = ((rrvJ)this.id_break[id_protected[16]]).id_volatile();
      int var7 = var6.id_abstract();
      int var8 = var6.id_finally();
      ((rruL)this.id_break[2]).id_class(var1, var2, var3, var4, var5);
      if (!this.id_class(var2, var3, (float)(var7 + 100), (float)(var8 + 30 + 4), 263.0F, 266.0F)) {
         this.id_throws();
         return id_private[7];
      } else if (!super.id_class(var1, var2, var3, var4, var5)) {
         return id_private[8];
      } else {
         ((rrZl_1)this.id_break[3]).id_class(var1, var2, var3, var4, var5);
         List var9 = this.id_byte();

         for (int var10 = var9.size() - 1; var10 >= 0; var10--) {
            rrZa_1 var11 = (rrZa_1)var9.get(var10);
            var11.id_class(var1, var2, var3, var4, var5);
         }

         return id_private[10];
      }
   }

   private static int id_class(int var0) {
      return 300 - var0 - 10;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.id_volatile();
      ClickGuiScreen var7 = ((rrvJ)this.id_break[id_protected[19]]).id_volatile();
      int var8 = id_try();
      int var9 = id_class(var8);
      boolean var10 = this.id_class(
         (Integer)rrvk_1.id_class[id_protected[20]],
         (Integer)rrvk_1.id_class[1],
         (float)var7.id_abstract() + (Float)this.id_break[5],
         (float)(var7.id_finally() + var8),
         363.0F - (Float)this.id_break[5] - 5.0F,
         (float)var9
      );
      ((rrZl_1)this.id_break[3]).id_extends().id_class(var10 && super.id_class(var1, var2, var3, var4, var6) ? true : id_private[12], var4, 25.0);
      this.id_byte().forEach(var7x -> var7x.id_class(var1, var2, var3, var4, var10, var6));
      return id_private[13];
   }

   public void id_class(rrZa_1 var1) {
      this.id_volatile();
      ((List)this.id_break[1]).add(var1);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      return this.id_byte().stream().anyMatch(var3x -> var3x.id_class(var1, var2, var3));
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1690198399;
   }

   public void id_break(rrZa_1 var1) {
      this.id_volatile();
      ((List)this.id_break[1]).remove(var1);
   }

   @Override
   public int id_break() {
      List var1 = this.id_byte();
      return var1.stream().mapToInt(var0 -> (int)(var0.id_catch() + 6.0F)).sum() + 6;
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_volatile();
      ((rrZl_1)this.id_break[3]).id_break(var1, var2, var3);
   }

   public void id_break(String var1) {
      this.id_volatile();
      ((List)this.id_break[1]).remove(this.id_byte(var1));
   }

   @Override
   public void id_throws() {
      this.id_byte().forEach(rrZa_1::an_);
   }

   public List<rrZa_1> id_finally() {
      this.id_volatile();
      return (List<rrZa_1>)this.id_break[1];
   }

   @Override
   public void id_catch() {
      this.id_volatile();
      super.id_catch();
      ((List)this.id_break[1]).forEach(rrZa_1::am_);
   }

   public List<rrZa_1> id_extends() {
      this.id_volatile();
      return ((List)this.id_break[1]).stream().filter(var0 -> !var0.id_package().id_new() ? true : id_private[15]).toList();
   }

   private static void id_goto() {
      id_case = new double[]{25.0};
   }

   @Override
   public rrZl_1 id_case() {
      this.id_volatile();
      return (rrZl_1)this.id_break[3];
   }

   private static void id_instanceof() {
      id_implements = new byte[]{2, 32, 10, 100, 30, 4, 6, 5, 7, 12, 6, 5, 2, 26, 32};
   }

   private static void id_return() {
      id_private = new boolean[]{
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
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
         true
      };
   }

   private static int id_try() {
      return 32;
   }

   private static void id_public() {
      Object[] var0 = new Object[]{26, 32};
      id_byte = var0;
   }

   @Override
   public void id_protected() {
      this.id_volatile();
      super.id_protected();
      ((List)this.id_break[1]).forEach(rrZa_1::al_);
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{103, -62, -97, -52, 93, -61, 127, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_private() {
      this.id_volatile();
      super.id_private();
      ((rrZl_1)this.id_break[3]).id_private();
      ((List)this.id_break[1]).forEach(GuiComponent::id_final);
   }

   private void id_volatile() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
         Object[] var1 = this.id_break;
         var1[5] = id_catch[41];
      }
   }

   private static void id_synchronized() {
      id_catch = new float[]{
         0.5F,
         0.5F,
         363.0F,
         7.0F,
         26.0F,
         100.0F,
         1.0F,
         262.0F,
         299.0F,
         100.0F,
         1.0F,
         30.0F,
         4.0F,
         10.0F,
         253.0F,
         20.0F,
         263.0F,
         266.0F,
         363.0F,
         5.0F,
         6.0F,
         0.0F,
         1.0F,
         5.0F,
         10.0F,
         9.0F,
         10.0F,
         5.0F,
         16.5F,
         4.5F,
         47.0F,
         12.0F,
         81.0F,
         8.0F,
         8.0F,
         4.0F,
         2.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         0.0F
      };
   }
}
