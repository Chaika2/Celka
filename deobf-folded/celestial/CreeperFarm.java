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
   private static double[] id_byte;
   public Object[] id_break;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static long[] id_catch;
   private static float[] id_private;
   private static short[] id_implements;
   private static boolean[] id_finally;

   private static void id_char() {
      id_throws = new String[]{
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

   private bO_2 id_long() {
      return C_throws.id_byte().id_break();
   }

   private static void id_float() {
      id_implements = new short[]{
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
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_instanceof();
      ArrayList var5 = new ArrayList();
      this.id_break[1] = var5;
      ArrayList var6 = new ArrayList();
      this.id_break[2] = var6;
      Long var7 = -1L;
      this.id_break[3] = var7;
      Long var8 = -1L;
      this.id_break[5] = var8;
      rrIk_1 var9 = new rrIk_1(id_throws[2], true);
      this.id_break[9] = var9;
      rrIk_1 var10 = new rrIk_1(id_throws[3], true);
      this.id_break[10] = var10;
      rrIk_1 var11 = new rrIk_1(id_throws[4], true);
      this.id_break[11] = var11;
      rrIk_1 var12 = new rrIk_1(id_throws[5], true);
      this.id_break[12] = var12;
      rrIm_1 var13 = new rrIm_1(id_throws[6], 60.0F, 10.0F, 600.0F, 5.0F).id_class(((rrIk_1)this.id_break[12])::id_class);
      this.id_break[13] = var13;
      Setting[] var10001 = new Setting[5];
      var10001[id_finally[4]] = (rrIk_1)this.id_break[9];
      var10001[1] = (rrIk_1)this.id_break[10];
      var10001[2] = (rrIk_1)this.id_break[11];
      var10001[3] = (rrIk_1)this.id_break[12];
      var10001[4] = (rrIm_1)this.id_break[13];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new double[]{Double.MAX_VALUE};
   }

   private void id_interface() {
      this.id_instanceof();
      if ((cb_3)id_import.id_class[57] != null && !((List)this.id_break[1]).isEmpty()) {
         rjU_2 var1 = ((cb_3)id_import.id_class[57]).Ps();
         rY_2 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (int var5 = ((List)this.id_break[1]).size() - 1; var5 >= 0; var5--) {
            rY_2 var6 = (rY_2)((List)this.id_break[1]).get(var5);
            rfl_3 var7 = var6.id_break();
            if (var7.id_case(var1)) {
               this.id_class(var6);
               return;
            }

            double var8 = var1.id_case(var7.id_case());
            if (var8 < var3) {
               var3 = var8;
               var2 = var6;
            }
         }

         this.id_class(var2);
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_instanceof();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_implements[22]]) {
         boolean var2 = !this.id_long().id_byte() ? true : id_finally[9];
         if (var2) {
            if ((Long)this.id_break[5] == -1L) {
               Long var7 = rqR_2.id_break();
               this.id_break[5] = var7;
            }
         } else if ((Long)this.id_break[5] != -1L) {
            Long var8 = (Long)this.id_break[4] + (rqR_2.id_break() - (Long)this.id_break[5]);
            this.id_break[4] = var8;
            Long var9 = -1L;
            this.id_break[5] = var9;
         }

         this.id_else();
      }
   }

   @EventTarget
   public void id_class(rrLh_1 var1) {
      this.id_instanceof();
      String var2 = var1.id_class();
      Matcher var3 = ((Pattern)rrjb_3.id_class[7]).matcher(var2);
      if (var3.find()) {
         long var13 = id_catch[5];
         var13 += Long.parseLong(var3.group(1).replaceAll(id_throws[7], id_throws[8]));
         String var6 = var3.group(2);
         if (var6 != null) {
            var13 += Long.parseLong(var6.replaceAll(id_throws[9], id_throws[10]));
         }

         Long var11 = (Long)this.id_break[8] + var13;
         this.id_break[8] = var11;
      } else {
         Matcher var4 = ((Pattern)rrjb_3.id_class[8]).matcher(var2);
         if (var4.find()) {
            long var5 = Long.parseLong(var4.group(2).replaceAll(id_throws[11], id_throws[12]));
            Long var12 = (Long)this.id_break[8] + var5;
            this.id_break[8] = var12;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -457241609;
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_byte(id_finally[12]);
   }

   public void id_class(rY_2 var1) {
      this.id_instanceof();
      if (var1 == null) {
         throw new IllegalArgumentException(id_throws[17]);
      } else {
         this.id_break[id_implements[75]] = var1;
         this.id_long().id_class(var1);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7683342274594352950L;
   }

   @EventTarget
   public void id_class(rrnx_3 var1) {
      this.id_instanceof();
      if (var1.id_break().BC() == aI_2.id_volatile) {
         Long var6 = (Long)this.id_break[6] + 1L;
         this.id_break[6] = var6;
      }
   }

   @EventTarget
   public void id_class(rrLQ var1) {
      this.id_instanceof();
      if (var1.id_class() instanceof rsE_2 var2) {
         rdn_3 var9 = var2.id_protected();
         if (var9.id_break() == rdy_3.hr
            && var1.id_break().size() > 1
            && (rY_2)this.id_break[id_implements[38]] != null
            && ((rY_2)this.id_break[id_implements[39]]).id_break().id_byte(var2.rN())) {
            Long var8 = (Long)this.id_break[7] + (long)var9.id_char();
            this.id_break[7] = var8;
         }
      }
   }

   @EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_instanceof();
      if ((List)this.id_break[2] != null && !((List)this.id_break[2]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         Qg_1 var3 = id_import.id_else();
         rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_implements[18]]).id_class();
         int var5 = (int)(var3.id_volatile() / 2.0F);
         int var6 = (int)(var3.id_final() / 2.0F + 30.0F);

         for (int var7 = id_finally[6]; var7 < ((List)this.id_break[2]).size(); var7++) {
            rrHt_1 var8 = (rrHt_1)((List)this.id_break[2]).get(var7);
            if (var7 == 0) {
               var4.id_class(var2, var8.id_break(), (double)((float)var5 - var8.id_class()), (double)var6, 15, 255);
            } else {
               var4.id_break(var2, var8.id_break(), (double)((float)var5 - var8.id_class()), (double)var6, rrZF.d_, id_finally[7]);
            }

            var6 += 10;
         }
      }
   }

   @Override
   public void id_class(boolean var1) {
      this.id_instanceof();
      this.id_interface();
      if ((rY_2)this.id_break[id_implements[42]] == null) {
         String var10000 = rrfu_3.id_class((Module)this);
         String var10001 = id_throws[13];
         Object[] var10002 = new Object[1];
         var10002[id_finally[14]] = C_throws.id_break().id_protected.id_class[id_implements[43]];
         rrfu_3.id_byte(var10000 + var10001.formatted(var10002));
         this.id_byte(id_finally[15]);
      } else {
         super.id_class(var1);
         Long var7 = rqR_2.id_break();
         this.id_break[3] = var7;
         Long var8 = id_catch[7];
         this.id_break[4] = var8;
         Long var9 = -1L;
         this.id_break[5] = var9;
         Supplier var2 = () -> {
            PI var0 = C_throws.id_byte().id_native().id_protected();
            if (var0 != null) {
               Pf_1 var1x = var0.id_class();
               if (var1x == null || !var1x.id_break()) {
                  return id_finally[22];
               }
            }

            return true;
         };
         this.id_long()
            .id_class(
               (rY_2)this.id_break[id_implements[47]],
               var2,
               (rrIk_1)this.id_break[9],
               (rrIk_1)this.id_break[10],
               (rrIk_1)this.id_break[11],
               (rrIk_1)this.id_break[12],
               (rrIm_1)this.id_break[13]
            );
         this.id_else();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, 22, -120, -98, 86, -52, -67, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_throw();
      this.id_abstract();
   }

   private static void id_goto() {
      id_private = new float[]{60.0F, 10.0F, 600.0F, 5.0F, 2.0F, 2.0F, 30.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F};
   }

   public List<rY_2> id_continue() {
      this.id_instanceof();
      return (List<rY_2>)this.id_break[1];
   }

   private void id_else() {
      this.id_instanceof();
      rrZO var1 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_implements[53]]).id_class();
      long var2 = rqR_2.id_break();
      long var4 = var2 - (Long)this.id_break[3];
      if ((Long)this.id_break[5] != -1L) {
         var4 -= this.id_break[4] + (var2 - this.id_break[5]);
      } else {
         var4 -= this.id_break[4];
      }

      String var6 = this.id_final();
      rgF_2 var10000 = rgF_2.GRAY;
      Duration var10001 = Duration.ofMillis(Math.max(id_catch[10], var4));
      rqy_3[] var10002 = new rqy_3[3];
      var10002[id_finally[16]] = rqy_3.HOURS;
      var10002[1] = rqy_3.MINUTES;
      var10002[2] = rqy_3.SECONDS;
      String var7 = "Время работы: " + var10000 + rql_3.id_class(var10001, var10002);
      String var8 = "Убито криперов: " + rgF_2.GRAY + (Long)this.id_break[6];
      long var9 = (Long)this.id_break[7] / (long)rdy_3.hr.id_implements();
      var10000 = rgF_2.GRAY;
      long var20 = (Long)this.id_break[7];
      String[] var10004 = new String[3];
      var10004[id_finally[18]] = id_throws[14];
      var10004[1] = id_throws[15];
      var10004[2] = id_throws[16];
      String var11 = "Выбито пороха: " + var10000 + var20 + " шт. (" + var9 + " " + rql_3.id_class(var9, var10004) + ")";
      String var12 = "Заработано: " + rgF_2.GRAY + rql_3.id_class((Long)this.id_break[8], ' ') + "$";
      List var17 = List.of(
         new rrHt_1(var6, var1.id_break(var6) / 2.0F),
         new rrHt_1(var7, var1.id_break(var7) / 2.0F),
         new rrHt_1(var11, var1.id_break(var11) / 2.0F),
         new rrHt_1(var8, var1.id_break(var8) / 2.0F),
         new rrHt_1(var12, var1.id_break(var12) / 2.0F)
      );
      this.id_break[2] = var17;
   }

   private void id_instanceof() {
      if (this.id_break == null) {
         this.id_break = new Object[14];
         this.id_break[3] = 0L;
         this.id_break[4] = 0L;
         this.id_break[5] = 0L;
         this.id_break[6] = 0L;
         this.id_break[7] = 0L;
         this.id_break[8] = 0L;
      }
   }

   public rY_2 id_new() {
      this.id_instanceof();
      return (rY_2)this.id_break[id_implements[76]];
   }

   private static void id_return() {
      id_protected = new byte[]{5, 2, 3, 4, 15, 2, 2, 3, 2, 3, 2, 32, 14, 3, 4, 5, 6, 7, 8};
   }

   public void id_super() {
      if (this.aJ_()) {
         this.id_byte(true);
      }
   }

   private void id_throw() {
      this.id_instanceof();
      Long var5 = id_catch[11];
      this.id_break[6] = var5;
      Long var6 = id_catch[12];
      this.id_break[7] = var6;
      Long var7 = id_catch[13];
      this.id_break[8] = var7;
      Long var8 = -1L;
      this.id_break[3] = var8;
      Long var9 = id_catch[15];
      this.id_break[4] = var9;
      Long var10 = -1L;
      this.id_break[5] = var10;
   }

   private static void id_try() {
      id_finally = new boolean[]{
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

   private static void id_public() {
      id_catch = new long[]{-1L, -1L, -1L, -1L, -1L, 0L, 1L, 0L, -1L, -1L, 0L, 0L, 0L, 0L, -1L, 0L, -1L, 0L, 0L, 0L, 0L, 0L, 0L};
   }

   private void id_abstract() {
      this.id_long().id_protected();
   }
}
