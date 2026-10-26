package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoLeave extends Module {
   private static float[] id_byte;
   public Object[] id_break;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_catch;
   private static String[] id_private;

   private Pair<rVi_1, rVi_1> id_byte(cb_3 var1) {
      this.id_else();
      rrIm_1 var2 = (rrIm_1)((Pair)this.id_break[1]).getRight();
      boolean var3 = var2.id_int();
      double var4 = (double)var2.id_byte().floatValue();

      for (cG_2 var7 : ((gm_3)id_import.id_class[56]).id_continue()) {
         if (rrff_3.id_class(var7)) {
            double var8 = (double)var1.id_implements(var7);
            if (var3 || !(var8 > var4)) {
               rVi_1 var10 = new rgN_2("Рядом был игрок ").id_class(var7.L_());
               rVi_1 var11 = var10.id_case();
               rVi_1 var12 = new rgN_2((int)var8 + "м").id_class(rgF_2.RED);
               var10.id_break("\n\nДистанция до игрока: ").id_class(var12);
               var11.id_break("\n • Дистанция до игрока: ").id_class(var12);
               if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new()) {
                  String var13 = (int)var7.rx() + " " + (int)var7.re() + " " + (int)var7.BO();
                  rVi_1 var14 = new rgN_2(var13).id_class(rgF_2.RED);
                  var10.id_break("\n\nКоординаты игрока: ").id_class(var14);
                  var11.id_break("\n • Координаты игрока: ").id_class(var14);
               }

               return Pair.of(var10, var11);
            }
         }
      }

      return null;
   }

   public AutoLeave() {
      super("Auto Leave", "Избегает определенных условий", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_else();
      Pair var5 = rrwg_3.id_class(new rrIk_1("Мало ХП", true), new rrIm_1("Количество ХП", 10.0F, 5.0F, 19.0F, 1.0F));
      this.id_break[0] = var5;
      Pair var6 = rrwg_3.id_class(
         new rrIk_1("Рядом игрок", false),
         new rrIm_1("Дистанция до игрока", 128.0F, 10.0F, 128.0F, 5.0F)
            .id_class((var0, var1) -> "MAX")
            .id_break((var0, var1) -> var1 == var0.id_native() ? "MAX" : null)
      );
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Staff в сети", false);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Staff в спеке", false).id_class(() -> {
         this.id_else();
         return !((rrIk_1)this.id_break[2]).id_class() ? true : id_throws[44];
      });
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Бан в чате", false).id_class("banInChat", (var1, var2) -> {
         this.id_else();
         Boolean var7x = false;
         this.id_break[9] = var7x;
      });
      this.id_break[4] = var9;
      rrIQ var10 = new rrIQ("Метод лива", "Отключение", "Отключение", "Перезаход", "Сообщение");
      this.id_break[5] = var10;
      rrIm_1 var11 = new rrIm_1("Минут для перезахода", 1.0F, 0.1F, 30.0F, 0.1F).id_class(() -> {
         this.id_else();
         return ((rrIQ)this.id_break[5]).id_byte().equals("Перезаход");
      });
      this.id_break[6] = var11;
      rrIv_1 var12 = new rrIv_1("Сообщение для лива (home/rtp)", rrte_3.id_class((Pattern)rrtR_2.id_class[5])).id_package().id_class(120.0F).id_class(() -> {
         this.id_else();
         return ((rrIQ)this.id_break[5]).id_byte().equals("Сообщение");
      });
      this.id_break[7] = var12;
      this.id_class(
         new Setting[]{
            new rrIc_1(
               "Ливать если",
               (rrIk_1)((Pair)this.id_break[0]).getLeft(),
               (rrIk_1)((Pair)this.id_break[1]).getLeft(),
               (rrIk_1)this.id_break[2],
               (rrIk_1)this.id_break[3],
               (rrIk_1)this.id_break[4]
            ),
            (rrIQ)this.id_break[5],
            (rrIm_1)this.id_break[6],
            (Setting)((Pair)this.id_break[0]).getRight(),
            (Setting)((Pair)this.id_break[1]).getRight(),
            (rrIv_1)this.id_break[7]
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new short[]{
         3,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         5,
         7,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         0,
         1,
         7,
         0,
         8,
         1,
         2,
         1,
         4,
         56,
         0,
         57,
         1,
         57,
         2,
         57,
         3,
         57,
         4,
         9,
         4,
         9,
         8,
         9,
         5,
         7,
         57,
         8,
         8,
         6,
         1,
         2,
         1,
         4,
         57,
         1,
         6,
         57,
         1,
         0,
         57,
         5,
         1,
         2,
         1,
         4,
         1,
         0,
         1,
         6,
         0,
         2000,
         0,
         1,
         56,
         0,
         0,
         0,
         1,
         9,
         5,
         5,
         9,
         2
      };
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.id_instanceof() || C_throws.id_byte().id_default().id_throws()) {
            Boolean var11 = false;
            this.id_break[8] = var11;
            return;
         }

         if (rrfZ_2.id_byte()) {
            return;
         }

         boolean var2 = id_throws[12];
         if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            || (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
            PI var3 = C_throws.id_byte().id_native().id_protected();
            if (var3 != null && !var3.id_class().id_break()) {
               return;
            }

            rqM_2 var4 = ((gm_3)id_import.id_class[56]).E();
            rqO_2 var5 = var4.id_class();
            String var6 = var5.id_break();
            if (var4 != null && var6 != null && (var6.equals("lobby") || var6.equals("spawn"))) {
               var2 = id_throws[13];
            }
         }

         C_class var13 = C_throws.id_byte();
         if (((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class()) {
            Pair var14 = this.id_protected((cb_3)id_import.id_class[57]);
            if (var14 != null) {
               this.id_class(var13, (rVi_1)var14.getLeft(), (rVi_1)var14.getRight());
               return;
            }
         }

         if (((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class() && !var2) {
            Pair var15 = this.id_byte((cb_3)id_import.id_class[57]);
            if (var15 != null) {
               this.id_class(var13, (rVi_1)var15.getLeft(), (rVi_1)var15.getRight());
               return;
            }
         }

         if (((rrIk_1)this.id_break[2]).id_class()) {
            Pair var16 = this.id_break((cb_3)id_import.id_class[57]);
            if (var16 != null) {
               this.id_class(var13, (rVi_1)var16.getLeft(), (rVi_1)var16.getRight());
               return;
            }
         }

         if (((rrIk_1)this.id_break[3]).id_class()) {
            Pair var17 = this.id_class((cb_3)id_import.id_class[57]);
            if (var17 != null) {
               this.id_class(var13, (rVi_1)var17.getLeft(), (rVi_1)var17.getRight());
               return;
            }
         }

         if (((rrIk_1)this.id_break[4]).id_class()) {
            Pair var18 = this.id_new();
            if (var18 != null && this.id_class(var13, (rVi_1)var18.getLeft(), (rVi_1)var18.getRight())) {
               Boolean var12 = false;
               this.id_break[9] = var12;
            }
         }
      }
   }

   private boolean id_class(C_class var1, rVi_1 var2, rVi_1 var3) {
      this.id_else();
      boolean var4 = false;
      String var5 = ((rrIQ)this.id_break[5]).id_byte();
      switch (var5) {
         case "Отключение":
            rrjv_3.id_class(this.id_case(), var2);
            var4 = true;
            break;
         case "Сообщение":
            String var7 = ((rrIv_1)this.id_break[7]).id_extends();
            if (var7 == null || var7.isEmpty()) {
               return id_throws[23];
            }

            ((cb_3)id_import.id_class[57]).id_protected(var7);
            var4 = true;
            break;
         case "Перезаход":
            if (!this.id_class(var1)) {
               return false;
            }
      }

      if (!(Boolean)this.id_break[8]) {
         if (!var1.id_break().id_byte() && !var1.id_volatile().id_byte()) {
            rrfZ_2.id_break();
         }

         this.id_class(var3);
      }

      Boolean var12 = true;
      this.id_break[8] = var12;
      if (var4) {
         this.id_byte(true);
      }

      return id_throws[28];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6191522545172092546L;
   }

   private void id_class(rVi_1 var1) {
      rVi_1 var2 = rrfu_3.id_break((Module)this).id_class(rgF_2.GRAY);
      rVi_1 var3 = var2.id_class(var1.id_case().id_class(rgF_2.GRAY));
      rrfu_3.id_class(var3);
      MinecraftAccessor.a_(var3.id_byte(), false);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1764955597;
   }

   @EventTarget
   public void id_class(rrFH var1) {
      this.id_else();
      if (((rrIk_1)this.id_break[4]).id_class() && var1.id_class().equals("Пункт 4.3.1")) {
         Boolean var6 = true;
         this.id_break[9] = var6;
      }
   }

   private Pair<rVi_1, rVi_1> id_class(cb_3 var1) {
      for (rrqr_3 var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().o().id_new()) {
         if (var3 instanceof rrqP_2 var4
            && var4.id_case().id_class()
            && var4.id_finally().id_byte() == (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[1]) {
            rVi_1 var5 = new rgN_2("Персонал ").id_class(var4.id_implements().id_case().id_break(" в спеке"));
            return Pair.of(var5, var5);
         }
      }

      return null;
   }

   @Override
   public void id_class(boolean var1) {
      if (!this.id_instanceof()) {
         this.id_byte(false);
      } else {
         super.id_class(var1);
      }
   }

   private boolean id_class(C_class var1) {
      this.id_else();
      SL var2 = var1.id_default();
      float var3 = ((rrIm_1)this.id_break[6]).id_byte();
      if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         || (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         PI var9 = var1.id_native().id_protected();
         if (var9 == null) {
            return false;
         } else {
            Pf_1 var11 = var9.id_class();
            if (!var11.id_break()) {
               return false;
            } else {
               int var12 = Math.round(var3 * 60.0F * 20.0F);
               ((cb_3)id_import.id_class[57]).id_case("/hub");
               var2.id_class(new Sl_1(var11.id_class() + var9.id_break(), var12));
               return true;
            }
         }
      } else if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]) {
         Po_1 var8 = var1.P().id_break();
         if (var8 == null) {
            return false;
         } else {
            PK var10 = var8.id_break();
            if (!var10.id_break()) {
               return false;
            } else {
               long var6 = (long)Math.round(var3 * 60000.0F);
               ((cb_3)id_import.id_class[57]).id_case("/hub");
               var2.id_class(new SF(var10.id_class() + var8.id_class(), var6));
               return true;
            }
         }
      } else if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         String var4 = C_throws.id_byte().id_final().id_throws();
         if (var4.isEmpty()) {
            return false;
         } else {
            ((cb_3)id_import.id_class[57]).id_case("/hub");
            long var5 = (long)Math.round(var3 * 60000.0F);
            var2.id_class(new SF(var4, var5));
            return true;
         }
      } else {
         return id_throws[37];
      }
   }

   private Pair<rVi_1, rVi_1> id_break(cb_3 var1) {
      for (rrqr_3 var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().o().id_new()) {
         if (var3 instanceof rrqP_2 var4 && var4.id_case().id_class()) {
            rVi_1 var5 = new rgN_2("Персонал ").id_class(var4.id_implements().id_case().id_break(" в сети"));
            return Pair.of(var5, var5);
         }
      }

      return null;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, -76, -65, -128, -25, 37, -66, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_else();
      super.id_throws(var1);
      Boolean var6 = false;
      this.id_break[8] = var6;
      Boolean var7 = false;
      this.id_break[9] = var7;
   }

   private static void id_continue() {
      id_private = new String[]{
         new String("Auto Leave"),
         new String("Избегает определенных условий"),
         new String("Мало ХП"),
         new String("Количество ХП"),
         new String("Рядом игрок"),
         new String("Дистанция до игрока"),
         new String("Staff в сети"),
         new String("Staff в спеке"),
         new String("Бан в чате"),
         new String("banInChat"),
         new String("Метод лива"),
         new String("Отключение"),
         new String("Отключение"),
         new String("Перезаход"),
         new String("Сообщение"),
         new String("Минут для перезахода"),
         new String("Сообщение для лива (home/rtp)"),
         new String("Ливать если"),
         new String("lobby"),
         new String("spawn"),
         new String("Пункт 4.3.1"),
         new String("Отключение"),
         new String("Сообщение"),
         new String("Перезаход"),
         new String("/hub"),
         new String("/hub"),
         new String("/hub"),
         new String("Перезаход"),
         new String("Режим \"Перезаход\" не работает на этом сервере"),
         new String("У вас мало ХП "),
         new String("Рядом был игрок "),
         new String("\n\nДистанция до игрока: "),
         new String("\n • Дистанция до игрока: "),
         new String("\n\nКоординаты игрока: "),
         new String("\n • Координаты игрока: "),
         new String("Персонал "),
         new String(" в сети"),
         new String("Персонал "),
         new String(" в спеке"),
         new String("Бан в чате"),
         new String("Сообщение"),
         new String("Перезаход"),
         new String("MAX"),
         new String("MAX")
      };
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[10];
         this.id_break[8] = false;
         this.id_break[9] = false;
      }
   }

   private boolean id_instanceof() {
      this.id_else();
      if (((rrIQ)this.id_break[5]).id_byte().equals("Перезаход")
         && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]
         && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]) {
         String var1 = "Режим \"Перезаход\" не работает на этом сервере";
         rrfu_3.id_byte(rrfu_3.id_class((Module)this) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
         this.id_byte(false);
         return false;
      } else {
         return id_throws[40];
      }
   }

   private Pair<rVi_1, rVi_1> id_new() {
      this.id_else();
      if ((Boolean)this.id_break[9]) {
         rgN_2 var1 = new rgN_2("Бан в чате");
         return Pair.of(var1, var1);
      } else {
         return null;
      }
   }

   private static void id_super() {
      id_protected = new byte[]{3, 2, 6, 5, 2, 3, 4, 2, 3, 4, 5, -1, 2, 10, 8, 9};
   }

   private static void id_while() {
      id_throws = new boolean[]{
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
         true,
         false,
         true,
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
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false
      };
   }

   private static void id_public() {
      id_byte = new float[]{10.0F, 5.0F, 19.0F, 1.0F, 128.0F, 10.0F, 128.0F, 5.0F, 1.0F, 0.1F, 30.0F, 0.1F, 120.0F, 60.0F, 20.0F, 60000.0F, 60000.0F};
   }

   private Pair<rVi_1, rVi_1> id_protected(cb_3 var1) {
      this.id_else();
      if (var1.Ss() <= ((rrIm_1)((Pair)this.id_break[0]).getRight()).id_byte()) {
         rVi_1 var2 = new rgN_2("У вас мало ХП ").id_class(new rgN_2("(" + (int)var1.Ss() + ")").id_class(rgF_2.RED));
         return Pair.of(var2, var2);
      } else {
         return null;
      }
   }
}
