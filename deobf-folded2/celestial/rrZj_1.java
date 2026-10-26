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
   private static byte[] id_protected;
   private static double[] id_throws;
   private static float[] id_case;
   public static Object[] id_break;
   private static long[] id_catch;
   private static boolean[] id_private;
   public Object[] id_byte;
   private static short[] id_implements;
   private static String[] id_finally;

   @Override
   public List<GuiComponent> id_byte() {
      this.id_native();
      rrtY_2 var1 = ((rrvJ)this.id_byte[2]).id_finally().id_extends();
      Predicate var2 = var1x -> {
         if (var1x instanceof rrZg_1 var2x) {
            if (var1.id_new()) {
               return true;
            } else {
               String var3 = var2x.id_case().id_break().id_case();
               String var4 = var1.id_final();
               return var3.toLowerCase().contains(var4.toLowerCase());
            }
         } else {
            return id_private[27];
         }
      };
      return ((List)this.id_byte[3]).stream().filter(var2).toList();
   }

   @Override
   public void id_byte(int var1, int var2, int var3) {
      super.id_byte(var1, var2, var3);
      this.id_byte().forEach(var3x -> var3x.id_break(var1, var2, var3));
   }

   private static void id_int() {
      id_finally = new String[]{
         new String("Всего покупок"), new String("Не удалось купить"), new String("Самый частый"), new String("Между покупками"), new String("Потрачено")
      };
   }

   public rrZj_1(rrvJ var1, rrtu_3 var2, float var3, float var4) {
      this.id_native();
      ArrayList var9 = new ArrayList();
      this.id_byte[3] = var9;
      AnimValue var10 = new AnimValue(0.5F, true);
      this.id_byte[6] = var10;
      this.id_byte[2] = var1;
      this.id_byte[4] = var2;
      Float var13 = var3;
      this.id_byte[0] = var13;
      Float var14 = var4;
      this.id_byte[1] = var14;
      rrZl_1 var15 = new rrZl_1(new rrZH(0.5F));
      this.id_byte[5] = var15;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      Object[] var0 = new Object[]{26, 20, 10, 12, 0.0F, new String("§7"), new String("§f"), new String("§7 · ")};
      id_break = var0;
   }

   private static List<String> id_class(List<String> var0, float var1, rrZO var2) {
      ArrayList var3 = new ArrayList();
      StringBuilder var4 = new StringBuilder();

      for (String var6 : var0) {
         String var7 = var4.isEmpty() ? var6 : var4 + (String)id_break[7] + var6;
         if (var2.id_break(var7) <= var1) {
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
   public void id_class(Category var1, Category var2) {
      this.id_native();
      super.id_class(var1, var2);
      ((AnimValue)this.id_byte[6]).id_extends();
      ((List)this.id_byte[3]).forEach(var2x -> var2x.id_class(var1, var2));
   }

   private static String id_class(long var0) {
      return "$" + rql_3.id_class(var0, ' ');
   }

   @Override
   public boolean id_class(char var1, int var2) {
      super.id_class(var1, var2);
      return this.id_byte().stream().anyMatch(var2x -> var2x.id_class(var1, var2));
   }

   public boolean id_class(int var1, int var2) {
      this.id_native();
      ClickGuiScreen var3 = ((rrvJ)this.id_byte[2]).id_volatile();
      int var4 = var3.id_abstract();
      int var5 = var3.id_finally();
      return this.id_class(var1, var2, (float)(var4 + 100), (float)(var5 + 30 + 4), 263.0F, 266.0F);
   }

   private static int id_class(int var0) {
      return 300 - var0 - 10;
   }

   public void id_class(rrNF var1) {
      this.id_native();
      rrNL var2 = var1.id_class();
      if (var2 == (rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[2]) {
         Integer var12 = (Integer)this.id_byte[7] + 1;
         this.id_byte[7] = var12;
      } else if (var2 == (rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[1]) {
         ClickGuiScreen var3 = ((rrvJ)this.id_byte[2]).id_volatile();
         Supplier var4 = () -> {
            this.id_native();
            return (float)var3.id_abstract() + (Float)this.id_byte[0];
         };
         Supplier var5 = () -> {
            this.id_native();
            return (float)var3.id_finally() + (Float)this.id_byte[1];
         };
         float var6 = 363.0F - (Float)this.id_byte[0] - 7.0F;
         float var7 = 26.0F;
         ((List)this.id_byte[3]).add(0, new rrZg_1(this, var1, var4, var5, var6, var7));
      }
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.id_native();
      ClickGuiScreen var7 = ((rrvJ)this.id_byte[2]).id_volatile();
      int var8 = this.id_package();
      int var9 = id_class(var8);
      boolean var10 = this.id_class(
         (Integer)rrvk_1.id_class[0],
         (Integer)rrvk_1.id_class[1],
         (float)var7.id_abstract() + (Float)this.id_byte[0],
         (float)(var7.id_finally() + var8),
         363.0F - (Float)this.id_byte[0] - 5.0F,
         (float)var9
      );
      ((rrZl_1)this.id_byte[5]).id_extends().id_class(var10 && super.id_class(var1, var2, var3, var4, var6) ? true : id_private[11], var4, 25.0);
      this.id_byte().forEach(var7x -> var7x.id_class(var1, var2, var3, var4, var10, var6));
      return false;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_native();
      if (!this.id_class(var2, var3)) {
         this.id_throws();
         return false;
      } else if (!super.id_class(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         ((rrZl_1)this.id_byte[5]).id_class(var1, var2, var3, var4, var5);
         List var6 = this.id_byte();

         for (int var7 = var6.size() - 1; var7 >= 0; var7--) {
            GuiComponent var8 = (GuiComponent)var6.get(var7);
            var8.id_class(var1, var2, var3, var4, var5);
         }

         return id_private[9];
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      super.id_class(var1, var2, var3);
      return this.id_byte().stream().anyMatch(var3x -> var3x.id_class(var1, var2, var3));
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_native();
      super.id_class(var1);
      ((AnimValue)this.id_byte[6]).id_extends();
      ((List)this.id_byte[3]).clear();
      Integer var6 = 0;
      this.id_byte[7] = var6;
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.id_native();
      rrZH var10 = ((rrZl_1)this.id_byte[5]).id_extends();
      int var11 = this.id_break();
      int var12 = this.id_package();
      int var13 = id_class(var12);
      int var14 = this.id_else().isEmpty() ? 0 : Math.max(id_private[4], (int)((Float)this.id_byte[1]).floatValue() + var12 - 30 - 5);
      this.id_implements()
         .id_class(
            () -> {
               this.id_native();
               List var13x = this.id_byte();
               AnimValue var14x = this.id_implements().id_class();
               float var15x = 0.0F;
               var14x.id_class(!this.ai_() ? true : id_private[29]);
               var10.id_class((float)var11, (float)(var13 + 5));
               float var16x = var14x.id_byte();
               float var17x = (1.0F - var16x) * 5.0F;
               float var18x = (float)var12;

               for (GuiComponent var20x : var13x) {
                  rruv_1 var21 = var20x.id_protected();
                  if (var20x instanceof rrZg_1 var22) {
                     var15x += var18x;
                     var18x = var22.id_private() + 6.0F;
                     var22.id_class(var15x + var10.id_case() + var17x);
                     AnimValue var23 = var22.id_catch();
                     var23.id_class(!var22.id_catch().id_new() ? true : id_private[31]);
                  }

                  var20x.id_break(var1, var2, var7, var8, var21, var9, false);
                  if (!(var21.id_protected() < var4) && !(var21.id_protected() > var4 + (float)var13 + (float)var12 + 10.0F)) {
                     var20x.id_class(var1, var2, var7, var8, var21, var9, false);
                  }
               }

               this.id_implements()
                  .id_class(
                     var1,
                     (rrZl_1)this.id_byte[5],
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
      List var15 = this.id_else();
      float var16 = var15.isEmpty() ? var4 + 30.0F + 4.0F : var4 + 30.0F + 12.0F + (float)(var15.size() * 10) - 4.0F;
      rrvJ.id_class(var1, var10, var3 + 100.0F + 1.0F, var16, var4 + (float)var13 + (float)var12 - 10.0F, 253.0F, 20.0F);
      if (!var15.isEmpty()) {
         float var17 = var4 + 30.0F - 8.0F;
         float var18 = var4 + 30.0F + 12.0F + (float)(var15.size() * 10) + 16.0F;
         float var19 = var17 - 30.0F - 5.0F;
         float var20 = var18 - var19;
         this.id_implements().id_class(() -> this.id_break(var1, var3 + 100.0F + 1.0F, var4), var1, var3 + 100.0F + 1.0F, var19, 254.0F, var20);
      }

      return id_private[5];
   }

   private static String id_class(String var0, String var1) {
      return (String)id_break[5] + var0 + ": " + (String)id_break[6] + var1;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 69471197;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -10, -77, -39, 64, -24, -55, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break(Ml_1 var1, float var2, float var3) {
      this.id_native();
      List var4 = this.id_else();
      ((AnimValue)this.id_byte[6]).id_class(!var4.isEmpty() ? true : id_private[22]);
      float var5 = ((AnimValue)this.id_byte[6]).id_byte();
      if (!(var5 <= 0.0F) && !var4.isEmpty()) {
         float var6 = this.id_implements().id_class().id_byte();
         float var7 = var5 * var6;
         if (!(var7 <= 0.0F)) {
            int var8 = (int)(id_case[36] * var7);
            int var9 = ColorHelper.id_break(-1, var8);
            float var10 = (1.0F - var6) * 5.0F;
            rrZO var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
            float var12 = var3 + 30.0F + 12.0F + var10;

            for (String var14 : var4) {
               var11.id_protected(var1, var14, var2 + 6.0F, var12, var9, false);
               var12 += 10.0F;
            }
         }
      }
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2033836497393255796L;
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_native();
      super.id_break(var1, var2, var3);
      ((rrZl_1)this.id_byte[5]).id_break(var1, var2, var3);
   }

   @Override
   public int id_break() {
      List var1 = this.id_byte();
      int var2 = 0;

      for (GuiComponent var4 : var1) {
         if (var4 instanceof rrZg_1) {
            var2 += (int)(var4.id_protected().id_class() + 6.0F);
         }
      }

      return var2 + 6;
   }

   @Override
   public void id_throws() {
      super.id_throws();
      this.id_byte().forEach(GuiComponent::an_);
   }

   private static void id_finally() {
      id_case = new float[]{
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
   public void id_catch() {
      this.id_native();
      super.id_catch();
      ((AnimValue)this.id_byte[6]).id_extends();
      ((List)this.id_byte[3]).forEach(GuiComponent::am_);
   }

   private static void id_extends() {
      id_implements = new short[]{
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
   public rrZl_1 id_case() {
      this.id_native();
      return (rrZl_1)this.id_byte[5];
   }

   private static void id_continue() {
      id_throws = new double[]{25.0};
   }

   private List<String> id_else() {
      List var1 = this.id_final();
      return var1.isEmpty() ? List.of() : id_class(var1, 239.0F, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class());
   }

   private static void id_new() {
      id_private = new boolean[]{
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

   private int id_package() {
      int var1 = this.id_else().size();
      return var1 == 0 ? 20 : id_protected[9] + var1 * 10;
   }

   private static void id_super() {
      id_catch = new long[]{Long.MAX_VALUE, 0L, 0L, 1000L, 0L};
   }

   @Override
   public void id_protected() {
      this.id_native();
      super.id_protected();
      ((List)this.id_byte[3]).forEach(GuiComponent::al_);
   }

   @Override
   public void id_private() {
      this.id_native();
      super.id_private();
      ((AnimValue)this.id_byte[6]).id_extends();
      ((rrZl_1)this.id_byte[5]).id_private();
      ((List)this.id_byte[3]).forEach(GuiComponent::id_final);
   }

   private List<String> id_final() {
      this.id_native();
      rrZV var1 = this.id_volatile();
      ArrayList var2 = new ArrayList();
      if ((Integer)var1.id_class[0] == 0) {
         return var2;
      } else {
         long var3 = var1.id_class[2] == Long.MAX_VALUE ? 0L : System.currentTimeMillis() - (Long)var1.id_class[2];
         String var5 = String.valueOf(((Integer)var1.id_class[0]).intValue());
         if (var3 > 0L) {
            var5 = var5 + (String)id_break[5] + " за " + (String)id_break[6] + rql_3.id_class(Duration.ofMillis(var3));
         }

         var2.add(id_class("Всего покупок", var5));
         if ((Integer)this.id_byte[7] > 0) {
            var2.add(id_class("Не удалось купить", String.valueOf(((Integer)this.id_byte[7]).intValue())));
         }

         if ((String)var1.id_class[4] != null && (Integer)var1.id_class[5] > 1) {
            var2.add(id_class("Самый частый", (String)var1.id_class[4]));
         }

         if (var3 >= 1000L) {
            long var6 = var3 / (long)Math.max(1, (Integer)var1.id_class[0]);
            var2.add(id_class("Между покупками", "~" + rql_3.id_class(Duration.ofMillis(var6))));
         }

         var2.add(id_class("Потрачено", id_class((Long)var1.id_class[1])));
         return var2;
      }
   }

   private rrZV id_volatile() {
      this.id_native();
      rrZV var1 = new rrZV();

      for (GuiComponent var3 : (List)this.id_byte[3]) {
         if (var3 instanceof rrZg_1) {
            rrZg_1 var4 = (rrZg_1)var3;
            rrNF var5 = var4.id_case();
            if (var5.id_class() == (rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[1]) {
               rrNd_1 var6 = var5.id_break();
               rrNw_1 var7 = var6.id_break();
               if (var7 != null) {
                  Integer var15 = (Integer)var1.id_class[0] + 1;
                  var1.id_class[0] = var15;
                  Long var16 = (Long)var1.id_class[1] + (long)var7.id_case();
                  var1.id_class[1] = var16;
                  String var8 = var6.id_case();
                  if (var8 != null && !var8.isEmpty()) {
                     int var9 = ((Map)var1.id_class[3]).merge(var8, 1, Integer::sum);
                     if (var9 > (Integer)var1.id_class[5]) {
                        Integer var17 = var9;
                        var1.id_class[5] = var17;
                        var1.id_class[4] = var8;
                     }
                  }

                  long var20 = var4.id_implements();
                  if (var20 > 0L && var20 < (Long)var1.id_class[2]) {
                     Long var19 = var20;
                     var1.id_class[2] = var19;
                  }
               }
            }
         }
      }

      return var1;
   }

   private static void id_synchronized() {
      id_protected = new byte[]{30, 5, 10, 10, 6, 100, 30, 4, 20, 32, 10, 10, -1, 32, 5, 7, 12, 5, 6, 5, 7, 8, 7, 8, 26, 20, 2, 10, 3, 12, 4};
   }

   private void id_native() {
      if (this.id_byte == null) {
         this.id_byte = new Object[8];
         Object[] var1 = this.id_byte;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[7] = 0;
      }
   }

   @Override
   public rdn_3 ag_() {
      for (GuiComponent var2 : this.id_byte()) {
         rdn_3 var3 = var2.id_byte();
         if (var3 != null) {
            return var3;
         }
      }

      return null;
   }
}
