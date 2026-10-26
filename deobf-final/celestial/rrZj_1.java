package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZj_1 extends rrZN implements rrZT, rrZq_1<GuiComponent> {
   private static byte[] protected_;
   private static double[] throws_;
   private static float[] case_;
   public static Object[] break_;
   private static long[] catch_;
   private static boolean[] private_;
   public Object[] byte_;
   private static short[] implements_;
   private static String[] finally_;

   @Override
   public List<GuiComponent> byte_() {
      this.native_();
      rrtY_2 var1 = ((rrvJ)this.byte_[2]).finally_().extends_();
      Predicate var2 = var1x -> {
         if (var1x instanceof rrZg_1 var2x) {
            if (var1.new_()) {
               return true;
            } else {
               String var3 = var2x.case_().break_().case_();
               String var4 = var1.final_();
               return var3.toLowerCase().contains(var4.toLowerCase());
            }
         } else {
            return private_[27];
         }
      };
      return ((List)this.byte_[3]).stream().filter(var2).toList();
   }

   @Override
   public void byte_(int var1, int var2, int var3) {
      super.byte_(var1, var2, var3);
      this.byte_().forEach(var3x -> var3x.break_(var1, var2, var3));
   }

   private static void int_() {
      finally_ = new String[]{
         new String("Всего покупок"), new String("Не удалось купить"), new String("Самый частый"), new String("Между покупками"), new String("Потрачено")
      };
   }

   public rrZj_1(rrvJ var1, rrtu_3 var2, float var3, float var4) {
      this.native_();
      ArrayList var9 = new ArrayList();
      this.byte_[3] = var9;
      AnimValue var10 = new AnimValue(0.5F, true);
      this.byte_[6] = var10;
      this.byte_[2] = var1;
      this.byte_[4] = var2;
      Float var13 = var3;
      this.byte_[0] = var13;
      Float var14 = var4;
      this.byte_[1] = var14;
      rrZl_1 var15 = new rrZl_1(new rrZH(0.5F));
      this.byte_[5] = var15;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      Object[] var0 = new Object[]{26, 20, 10, 12, 0.0F, new String("§7"), new String("§f"), new String("§7 · ")};
      break_ = var0;
   }

   private static List<String> class_(List<String> var0, float var1, rrZO var2) {
      ArrayList var3 = new ArrayList();
      StringBuilder var4 = new StringBuilder();

      for (String var6 : var0) {
         String var7 = var4.isEmpty() ? var6 : var4 + (String)break_[7] + var6;
         if (var2.break_(var7) <= var1) {
            var4.setLength(0);
            var4.append(var7);
         } else {
            if (!var4.isEmpty()) {
               var3.add(var4.toString());
               var4.setLength(0);
            }

            var4.append(var6);
         }
      }

      if (!var4.isEmpty()) {
         var3.add(var4.toString());
      }

      return var3;
   }

   @Override
   public void class_(Category var1, Category var2) {
      this.native_();
      super.class_(var1, var2);
      ((AnimValue)this.byte_[6]).extends_();
      ((List)this.byte_[3]).forEach(var2x -> var2x.class_(var1, var2));
   }

   private static String class_(long var0) {
      return "$" + rql_3.class_(var0, ' ');
   }

   @Override
   public boolean class_(char var1, int var2) {
      super.class_(var1, var2);
      return this.byte_().stream().anyMatch(var2x -> var2x.class_(var1, var2));
   }

   public boolean class_(int var1, int var2) {
      this.native_();
      ClickGuiScreen var3 = ((rrvJ)this.byte_[2]).volatile_();
      int var4 = var3.abstract_();
      int var5 = var3.finally_();
      return this.class_(var1, var2, (float)(var4 + 100), (float)(var5 + 30 + 4), 263.0F, 266.0F);
   }

   private static int class_(int var0) {
      return 300 - var0 - 10;
   }

   public void class_(rrNF var1) {
      this.native_();
      rrNL var2 = var1.class_();
      if (var2 == (rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[2]) {
         Integer var12 = (Integer)this.byte_[7] + 1;
         this.byte_[7] = var12;
      } else if (var2 == (rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[1]) {
         ClickGuiScreen var3 = ((rrvJ)this.byte_[2]).volatile_();
         Supplier var4 = () -> {
            this.native_();
            return (float)var3.abstract_() + (Float)this.byte_[0];
         };
         Supplier var5 = () -> {
            this.native_();
            return (float)var3.finally_() + (Float)this.byte_[1];
         };
         float var6 = 363.0F - (Float)this.byte_[0] - 7.0F;
         float var7 = 26.0F;
         ((List)this.byte_[3]).add(0, new rrZg_1(this, var1, var4, var5, var6, var7));
      }
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.native_();
      ClickGuiScreen var7 = ((rrvJ)this.byte_[2]).volatile_();
      int var8 = this.package_();
      int var9 = class_(var8);
      boolean var10 = this.class_(
         (Integer)rrvk_1.class_[0],
         (Integer)rrvk_1.class_[1],
         (float)var7.abstract_() + (Float)this.byte_[0],
         (float)(var7.finally_() + var8),
         363.0F - (Float)this.byte_[0] - 5.0F,
         (float)var9
      );
      ((rrZl_1)this.byte_[5]).extends_().class_(var10 && super.class_(var1, var2, var3, var4, var6) ? true : private_[11], var4, 25.0);
      this.byte_().forEach(var7x -> var7x.class_(var1, var2, var3, var4, var10, var6));
      return false;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.native_();
      if (!this.class_(var2, var3)) {
         this.throws_();
         return false;
      } else if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         ((rrZl_1)this.byte_[5]).class_(var1, var2, var3, var4, var5);
         List var6 = this.byte_();

         for (int var7 = var6.size() - 1; var7 >= 0; var7--) {
            GuiComponent var8 = (GuiComponent)var6.get(var7);
            var8.class_(var1, var2, var3, var4, var5);
         }

         return private_[9];
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      super.class_(var1, var2, var3);
      return this.byte_().stream().anyMatch(var3x -> var3x.class_(var1, var2, var3));
   }

   @Override
   public void class_(rrFK var1) {
      this.native_();
      super.class_(var1);
      ((AnimValue)this.byte_[6]).extends_();
      ((List)this.byte_[3]).clear();
      Integer var6 = 0;
      this.byte_[7] = var6;
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.native_();
      rrZH var10 = ((rrZl_1)this.byte_[5]).extends_();
      int var11 = this.break_();
      int var12 = this.package_();
      int var13 = class_(var12);
      int var14 = this.else_().isEmpty() ? 0 : Math.max(private_[4], (int)((Float)this.byte_[1]).floatValue() + var12 - 30 - 5);
      this.implements_()
         .class_(
            () -> {
               this.native_();
               List var13x = this.byte_();
               AnimValue var14x = this.implements_().class_();
               float var15x = 0.0F;
               var14x.class_(!this.ai_() ? true : private_[29]);
               var10.class_((float)var11, (float)(var13 + 5));
               float var16x = var14x.byte_();
               float var17x = (1.0F - var16x) * 5.0F;
               float var18x = (float)var12;

               for (GuiComponent var20x : var13x) {
                  rruv_1 var21 = var20x.protected_();
                  if (var20x instanceof rrZg_1 var22) {
                     var15x += var18x;
                     var18x = var22.private_() + 6.0F;
                     var22.class_(var15x + var10.case_() + var17x);
                     AnimValue var23 = var22.catch_();
                     var23.class_(!var22.catch_().new_() ? true : private_[31]);
                  }

                  var20x.break_(var1, var2, var7, var8, var21, var9, false);
                  if (!(var21.protected_() < var4) && !(var21.protected_() > var4 + (float)var13 + (float)var12 + 10.0F)) {
                     var20x.class_(var1, var2, var7, var8, var21, var9, false);
                  }
               }

               this.implements_()
                  .class_(
                     var1,
                     (rrZl_1)this.byte_[5],
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
            var4 + (float)var14,
            262.0F,
            (float)(299 - var14)
         );
      List var15 = this.else_();
      float var16 = var15.isEmpty() ? var4 + 30.0F + 4.0F : var4 + 30.0F + 12.0F + (float)(var15.size() * 10) - 4.0F;
      rrvJ.class_(var1, var10, var3 + 100.0F + 1.0F, var16, var4 + (float)var13 + (float)var12 - 10.0F, 253.0F, 20.0F);
      if (!var15.isEmpty()) {
         float var17 = var4 + 30.0F - 8.0F;
         float var18 = var4 + 30.0F + 12.0F + (float)(var15.size() * 10) + 16.0F;
         float var19 = var17 - 30.0F - 5.0F;
         float var20 = var18 - var19;
         this.implements_().class_(() -> this.break_(var1, var3 + 100.0F + 1.0F, var4), var1, var3 + 100.0F + 1.0F, var19, 254.0F, var20);
      }

      return private_[5];
   }

   private static String class_(String var0, String var1) {
      return (String)break_[5] + var0 + ": " + (String)break_[6] + var1;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 69471197;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -10, -77, -39, 64, -24, -55, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_(Ml_1 var1, float var2, float var3) {
      this.native_();
      List var4 = this.else_();
      ((AnimValue)this.byte_[6]).class_(!var4.isEmpty() ? true : private_[22]);
      float var5 = ((AnimValue)this.byte_[6]).byte_();
      if (!(var5 <= 0.0F) && !var4.isEmpty()) {
         float var6 = this.implements_().class_().byte_();
         float var7 = var5 * var6;
         if (!(var7 <= 0.0F)) {
            int var8 = (int)(case_[36] * var7);
            int var9 = ColorHelper.break_(-1, var8);
            float var10 = (1.0F - var6) * 5.0F;
            rrZO var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
            float var12 = var3 + 30.0F + 12.0F + var10;

            for (String var14 : var4) {
               var11.protected_(var1, var14, var2 + 6.0F, var12, var9, false);
               var12 += 10.0F;
            }
         }
      }
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2033836497393255796L;
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.native_();
      super.break_(var1, var2, var3);
      ((rrZl_1)this.byte_[5]).break_(var1, var2, var3);
   }

   @Override
   public int break_() {
      List var1 = this.byte_();
      int var2 = 0;

      for (GuiComponent var4 : var1) {
         if (var4 instanceof rrZg_1) {
            var2 += (int)(var4.protected_().class_() + 6.0F);
         }
      }

      return var2 + 6;
   }

   @Override
   public void throws_() {
      super.throws_();
      this.byte_().forEach(GuiComponent::an_);
   }

   private static void finally_() {
      case_ = new float[]{
         0.5F,
         0.5F,
         363.0F,
         7.0F,
         26.0F,
         100.0F,
         1.0F,
         262.0F,
         30.0F,
         4.0F,
         30.0F,
         12.0F,
         4.0F,
         100.0F,
         1.0F,
         10.0F,
         253.0F,
         20.0F,
         30.0F,
         8.0F,
         30.0F,
         12.0F,
         16.0F,
         30.0F,
         5.0F,
         100.0F,
         1.0F,
         254.0F,
         363.0F,
         5.0F,
         6.0F,
         263.0F,
         266.0F,
         239.0F,
         0.0F,
         0.0F,
         255.0F,
         1.0F,
         5.0F,
         30.0F,
         12.0F,
         6.0F,
         10.0F,
         100.0F,
         1.0F,
         0.0F,
         1.0F,
         5.0F,
         6.0F,
         10.0F,
         9.0F,
         10.0F,
         5.0F,
         0.0F,
         0.0F,
         239.0F
      };
   }

   @Override
   public void catch_() {
      this.native_();
      super.catch_();
      ((AnimValue)this.byte_[6]).extends_();
      ((List)this.byte_[3]).forEach(GuiComponent::am_);
   }

   private static void extends_() {
      implements_ = new short[]{
         3,
         6,
         2,
         4,
         0,
         1,
         5,
         2,
         7,
         7,
         1,
         2,
         0,
         3,
         5,
         1,
         299,
         5,
         2,
         0,
         1,
         0,
         0,
         5,
         2,
         3,
         5,
         6,
         3,
         6,
         3,
         6,
         5,
         3,
         3,
         6,
         3,
         7,
         5,
         2,
         300,
         0,
         0,
         2,
         2,
         0,
         5,
         6,
         7,
         7,
         4,
         5,
         4,
         0,
         1,
         7,
         6,
         6,
         0,
         3,
         1,
         0,
         0,
         1,
         1,
         3,
         5,
         5,
         4,
         2,
         2,
         5,
         6,
         5,
         255,
         1,
         0
      };
   }

   @Override
   public rrZl_1 case_() {
      this.native_();
      return (rrZl_1)this.byte_[5];
   }

   private static void continue_() {
      throws_ = new double[]{25.0};
   }

   private List<String> else_() {
      List var1 = this.final_();
      return var1.isEmpty() ? List.of() : class_(var1, 239.0F, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_());
   }

   private static void new_() {
      private_ = new boolean[]{
         true,
         true,
         false,
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
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true
      };
   }

   private int package_() {
      int var1 = this.else_().size();
      return var1 == 0 ? 20 : protected_[9] + var1 * 10;
   }

   private static void super_() {
      catch_ = new long[]{Long.MAX_VALUE, 0L, 0L, 1000L, 0L};
   }

   @Override
   public void protected_() {
      this.native_();
      super.protected_();
      ((List)this.byte_[3]).forEach(GuiComponent::al_);
   }

   @Override
   public void private_() {
      this.native_();
      super.private_();
      ((AnimValue)this.byte_[6]).extends_();
      ((rrZl_1)this.byte_[5]).private_();
      ((List)this.byte_[3]).forEach(GuiComponent::final_);
   }

   private List<String> final_() {
      this.native_();
      rrZV var1 = this.volatile_();
      ArrayList var2 = new ArrayList();
      if ((Integer)var1.class_[0] == 0) {
         return var2;
      } else {
         long var3 = var1.class_[2] == Long.MAX_VALUE ? 0L : System.currentTimeMillis() - (Long)var1.class_[2];
         String var5 = String.valueOf(((Integer)var1.class_[0]).intValue());
         if (var3 > 0L) {
            var5 = var5 + (String)break_[5] + " за " + (String)break_[6] + rql_3.class_(Duration.ofMillis(var3));
         }

         var2.add(class_("Всего покупок", var5));
         if ((Integer)this.byte_[7] > 0) {
            var2.add(class_("Не удалось купить", String.valueOf(((Integer)this.byte_[7]).intValue())));
         }

         if ((String)var1.class_[4] != null && (Integer)var1.class_[5] > 1) {
            var2.add(class_("Самый частый", (String)var1.class_[4]));
         }

         if (var3 >= 1000L) {
            long var6 = var3 / (long)Math.max(1, (Integer)var1.class_[0]);
            var2.add(class_("Между покупками", "~" + rql_3.class_(Duration.ofMillis(var6))));
         }

         var2.add(class_("Потрачено", class_((Long)var1.class_[1])));
         return var2;
      }
   }

   private rrZV volatile_() {
      this.native_();
      rrZV var1 = new rrZV();

      for (GuiComponent var3 : (List)this.byte_[3]) {
         if (var3 instanceof rrZg_1) {
            rrZg_1 var4 = (rrZg_1)var3;
            rrNF var5 = var4.case_();
            if (var5.class_() == (rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[1]) {
               rrNd_1 var6 = var5.break_();
               rrNw_1 var7 = var6.break_();
               if (var7 != null) {
                  Integer var15 = (Integer)var1.class_[0] + 1;
                  var1.class_[0] = var15;
                  Long var16 = (Long)var1.class_[1] + (long)var7.case_();
                  var1.class_[1] = var16;
                  String var8 = var6.case_();
                  if (var8 != null && !var8.isEmpty()) {
                     int var9 = ((Map)var1.class_[3]).merge(var8, 1, Integer::sum);
                     if (var9 > (Integer)var1.class_[5]) {
                        Integer var17 = var9;
                        var1.class_[5] = var17;
                        var1.class_[4] = var8;
                     }
                  }

                  long var20 = var4.implements_();
                  if (var20 > 0L && var20 < (Long)var1.class_[2]) {
                     Long var19 = var20;
                     var1.class_[2] = var19;
                  }
               }
            }
         }
      }

      return var1;
   }

   private static void synchronized_() {
      protected_ = new byte[]{30, 5, 10, 10, 6, 100, 30, 4, 20, 32, 10, 10, -1, 32, 5, 7, 12, 5, 6, 5, 7, 8, 7, 8, 26, 20, 2, 10, 3, 12, 4};
   }

   private void native_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[8];
         Object[] var1 = this.byte_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[7] = 0;
      }
   }

   @Override
   public rdn_3 ag_() {
      for (GuiComponent var2 : this.byte_()) {
         rdn_3 var3 = var2.byte_();
         if (var3 != null) {
            return var3;
         }
      }

      return null;
   }
}
