package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CreeperFarm extends Module {
   private static double[] byte_;
   public Object[] break_;
   private static byte[] protected_;
   private static String[] throws_;
   private static long[] catch_;
   private static float[] private_;
   private static short[] implements_;
   private static boolean[] finally_;

   private static void char_() {
      throws_ = new String[]{
         new String("Creeper Farm"),
         new String("Baritone для охоты на криперов"),
         new String("Автоматический прыжок"),
         new String("Атаковать одновременно\nнесколько существ"),
         new String("Отключаться при полном\nинвентаре"),
         new String("Автоматический перезаход\nна режим"),
         new String("Секунд для перезахода"),
         new String("[^0-9]"),
         new String(""),
         new String("[^0-9]"),
         new String(""),
         new String("[^0-9]"),
         new String(""),
         new String("Необходимо установить область фермы криперов. Используйте команду %scf"),
         new String("стак"),
         new String("стака"),
         new String("стаков"),
         new String("Selection cannot be null")
      };
   }

   private bO_2 long_() {
      return C_throws.byte_().break_();
   }

   private static void float_() {
      implements_ = new short[]{
         4,
         1,
         2,
         3,
         5,
         9,
         10,
         11,
         12,
         12,
         13,
         9,
         10,
         11,
         12,
         13,
         2,
         2,
         0,
         2,
         2,
         255,
         0,
         5,
         5,
         5,
         4,
         5,
         4,
         5,
         7,
         8,
         8,
         8,
         8,
         8,
         6,
         6,
         0,
         0,
         7,
         7,
         0,
         0,
         3,
         4,
         5,
         0,
         9,
         10,
         11,
         12,
         13,
         0,
         3,
         5,
         4,
         5,
         4,
         6,
         7,
         7,
         8,
         2,
         57,
         1,
         57,
         1,
         1,
         6,
         7,
         8,
         3,
         4,
         5,
         0,
         0,
         1
      };
   }

   public CreeperFarm() {
      super("Creeper Farm", "Baritone для охоты на криперов", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.instanceof_();
      ArrayList var5 = new ArrayList();
      this.break_[1] = var5;
      ArrayList var6 = new ArrayList();
      this.break_[2] = var6;
      Long var7 = -1L;
      this.break_[3] = var7;
      Long var8 = -1L;
      this.break_[5] = var8;
      rrIk_1 var9 = new rrIk_1("Автоматический прыжок", true);
      this.break_[9] = var9;
      rrIk_1 var10 = new rrIk_1("Атаковать одновременно\nнесколько существ", true);
      this.break_[10] = var10;
      rrIk_1 var11 = new rrIk_1("Отключаться при полном\nинвентаре", true);
      this.break_[11] = var11;
      rrIk_1 var12 = new rrIk_1("Автоматический перезаход\nна режим", true);
      this.break_[12] = var12;
      rrIm_1 var13 = new rrIm_1("Секунд для перезахода", 60.0F, 10.0F, 600.0F, 5.0F).class_(((rrIk_1)this.break_[12])::class_);
      this.break_[13] = var13;
      this.class_(new Setting[]{(rrIk_1)this.break_[9], (rrIk_1)this.break_[10], (rrIk_1)this.break_[11], (rrIk_1)this.break_[12], (rrIm_1)this.break_[13]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new double[]{Double.MAX_VALUE};
   }

   private void interface_() {
      this.instanceof_();
      if ((cb_3)import_.class_[57] != null && !((List)this.break_[1]).isEmpty()) {
         rjU_2 var1 = ((cb_3)import_.class_[57]).Ps();
         rY_2 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (int var5 = ((List)this.break_[1]).size() - 1; var5 >= 0; var5--) {
            rY_2 var6 = (rY_2)((List)this.break_[1]).get(var5);
            rfl_3 var7 = var6.break_();
            if (var7.case_(var1)) {
               this.class_(var6);
               return;
            }

            double var8 = var1.case_(var7.case_());
            if (var8 < var3) {
               var3 = var8;
               var2 = var6;
            }
         }

         this.class_(var2);
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.instanceof_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         boolean var2 = !this.long_().byte_() ? true : finally_[9];
         if (var2) {
            if ((Long)this.break_[5] == -1L) {
               Long var7 = rqR_2.break_();
               this.break_[5] = var7;
            }
         } else if ((Long)this.break_[5] != -1L) {
            Long var8 = (Long)this.break_[4] + (rqR_2.break_() - (Long)this.break_[5]);
            this.break_[4] = var8;
            Long var9 = -1L;
            this.break_[5] = var9;
         }

         this.else_();
      }
   }

   @EventTarget
   public void class_(rrLh_1 var1) {
      this.instanceof_();
      String var2 = var1.class_();
      Matcher var3 = ((Pattern)rrjb_3.class_[7]).matcher(var2);
      if (var3.find()) {
         long var13 = 0L;
         var13 += Long.parseLong(var3.group(1).replaceAll("[^0-9]", ""));
         String var6 = var3.group(2);
         if (var6 != null) {
            var13 += Long.parseLong(var6.replaceAll("[^0-9]", ""));
         }

         Long var11 = (Long)this.break_[8] + var13;
         this.break_[8] = var11;
      } else {
         Matcher var4 = ((Pattern)rrjb_3.class_[8]).matcher(var2);
         if (var4.find()) {
            long var5 = Long.parseLong(var4.group(2).replaceAll("[^0-9]", ""));
            Long var12 = (Long)this.break_[8] + var5;
            this.break_[8] = var12;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -457241609;
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.byte_(false);
   }

   public void class_(rY_2 var1) {
      this.instanceof_();
      if (var1 == null) {
         throw new IllegalArgumentException("Selection cannot be null");
      } else {
         this.break_[0] = var1;
         this.long_().class_(var1);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7683342274594352950L;
   }

   @EventTarget
   public void class_(rrnx_3 var1) {
      this.instanceof_();
      if (var1.break_().BC() == aI_2.volatile_) {
         Long var6 = (Long)this.break_[6] + 1L;
         this.break_[6] = var6;
      }
   }

   @EventTarget
   public void class_(rrLQ var1) {
      this.instanceof_();
      if (var1.class_() instanceof rsE_2 var2) {
         rdn_3 var9 = var2.protected_();
         if (var9.break_() == rdy_3.hr && var1.break_().size() > 1 && (rY_2)this.break_[0] != null && ((rY_2)this.break_[0]).break_().byte_(var2.rN())) {
            Long var8 = (Long)this.break_[7] + (long)var9.char_();
            this.break_[7] = var8;
         }
      }
   }

   @EventTarget
   public void class_(rrnB_2 var1) {
      this.instanceof_();
      if ((List)this.break_[2] != null && !((List)this.break_[2]).isEmpty()) {
         Ml_1 var2 = var1.class_();
         Qg_1 var3 = import_.else_();
         rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
         int var5 = (int)(var3.volatile_() / 2.0F);
         int var6 = (int)(var3.final_() / 2.0F + 30.0F);

         for (int var7 = 0; var7 < ((List)this.break_[2]).size(); var7++) {
            rrHt_1 var8 = (rrHt_1)((List)this.break_[2]).get(var7);
            if (var7 == 0) {
               var4.class_(var2, var8.break_(), (double)((float)var5 - var8.class_()), (double)var6, 15, 255);
            } else {
               var4.break_(var2, var8.break_(), (double)((float)var5 - var8.class_()), (double)var6, rrZF.d_, false);
            }

            var6 += 10;
         }
      }
   }

   @Override
   public void class_(boolean var1) {
      this.instanceof_();
      this.interface_();
      if ((rY_2)this.break_[0] == null) {
         rrfu_3.byte_(
            rrfu_3.class_((Module)this)
               + "Необходимо установить область фермы криперов. Используйте команду %scf".formatted(C_throws.break_().protected_.class_[0])
         );
         this.byte_(false);
      } else {
         super.class_(var1);
         Long var7 = rqR_2.break_();
         this.break_[3] = var7;
         Long var8 = 0L;
         this.break_[4] = var8;
         Long var9 = -1L;
         this.break_[5] = var9;
         Supplier var2 = () -> {
            PI var0 = C_throws.byte_().native_().protected_();
            if (var0 != null) {
               Pf_1 var1x = var0.class_();
               if (var1x == null || !var1x.break_()) {
                  return finally_[22];
               }
            }

            return finally_[23];
         };
         this.long_()
            .class_(
               (rY_2)this.break_[0],
               var2,
               (rrIk_1)this.break_[9],
               (rrIk_1)this.break_[10],
               (rrIk_1)this.break_[11],
               (rrIk_1)this.break_[12],
               (rrIm_1)this.break_[13]
            );
         this.else_();
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, 22, -120, -98, 86, -52, -67, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.throw_();
      this.abstract_();
   }

   private static void goto_() {
      private_ = new float[]{60.0F, 10.0F, 600.0F, 5.0F, 2.0F, 2.0F, 30.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F};
   }

   public List<rY_2> continue_() {
      this.instanceof_();
      return (List<rY_2>)this.break_[1];
   }

   private void else_() {
      this.instanceof_();
      rrZO var1 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      long var2 = rqR_2.break_();
      long var4 = var2 - (Long)this.break_[3];
      if ((Long)this.break_[5] != -1L) {
         var4 -= this.break_[4] + (var2 - this.break_[5]);
      } else {
         var4 -= this.break_[4];
      }

      String var6 = this.final_();
      String var7 = "Время работы: " + rgF_2.GRAY + rql_3.class_(Duration.ofMillis(Math.max(0L, var4)), rqy_3.HOURS, rqy_3.MINUTES, rqy_3.SECONDS);
      String var8 = "Убито криперов: " + rgF_2.GRAY + (Long)this.break_[6];
      long var9 = (Long)this.break_[7] / (long)rdy_3.hr.implements_();
      String var11 = "Выбито пороха: " + rgF_2.GRAY + (Long)this.break_[7] + " шт. (" + var9 + " " + rql_3.class_(var9, "стак", "стака", "стаков") + ")";
      String var12 = "Заработано: " + rgF_2.GRAY + rql_3.class_((Long)this.break_[8], ' ') + "$";
      List var17 = List.of(
         new rrHt_1(var6, var1.break_(var6) / 2.0F),
         new rrHt_1(var7, var1.break_(var7) / 2.0F),
         new rrHt_1(var11, var1.break_(var11) / 2.0F),
         new rrHt_1(var8, var1.break_(var8) / 2.0F),
         new rrHt_1(var12, var1.break_(var12) / 2.0F)
      );
      this.break_[2] = var17;
   }

   private void instanceof_() {
      if (this.break_ == null) {
         this.break_ = new Object[14];
         this.break_[3] = 0L;
         this.break_[4] = 0L;
         this.break_[5] = 0L;
         this.break_[6] = 0L;
         this.break_[7] = 0L;
         this.break_[8] = 0L;
      }
   }

   public rY_2 new_() {
      this.instanceof_();
      return (rY_2)this.break_[0];
   }

   private static void return_() {
      protected_ = new byte[]{5, 2, 3, 4, 15, 2, 2, 3, 2, 3, 2, 32, 14, 3, 4, 5, 6, 7, 8};
   }

   public void super_() {
      if (this.aJ_()) {
         this.byte_(true);
      }
   }

   private void throw_() {
      this.instanceof_();
      Long var5 = 0L;
      this.break_[6] = var5;
      Long var6 = 0L;
      this.break_[7] = var6;
      Long var7 = 0L;
      this.break_[8] = var7;
      Long var8 = -1L;
      this.break_[3] = var8;
      Long var9 = 0L;
      this.break_[4] = var9;
      Long var10 = -1L;
      this.break_[5] = var10;
   }

   private static void try_() {
      finally_ = new boolean[]{
         true,
         true,
         true,
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
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true
      };
   }

   private static void public_() {
      catch_ = new long[]{-1L, -1L, -1L, -1L, -1L, 0L, 1L, 0L, -1L, -1L, 0L, 0L, 0L, 0L, -1L, 0L, -1L, 0L, 0L, 0L, 0L, 0L, 0L};
   }

   private void abstract_() {
      this.long_().protected_();
   }
}
