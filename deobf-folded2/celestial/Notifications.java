package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class Notifications extends Module implements rrnv_3 {
   private static float[] id_protected;
   private static byte[] id_throws;
   public static Object[] id_break;
   public Object[] id_byte;
   private static short[] id_catch;
   private static String[] id_private;
   private static boolean[] id_implements;

   public Notifications() {
      super("Notifications", "Откладка о каких либо действиях", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_return();
      rrIk_1 var5 = new rrIk_1("Включено", true);
      this.id_byte[0] = var5;
      rrIk_1 var6 = new rrIk_1("Включено", false);
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1("Вас", false);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1("Друзей", false);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1("Включено", false);
      this.id_byte[4] = var9;
      rrIk_1 var10 = new rrIk_1("Включено", false);
      this.id_byte[5] = var10;
      rrIk_1 var11 = new rrIk_1("Включено", false);
      this.id_byte[6] = var11;
      rrIk_1 var12 = new rrIk_1("Включено", false);
      this.id_byte[7] = var12;
      rrIk_1 var13 = new rrIk_1("Уведомлять об окончании\nважных эффектов", true);
      this.id_byte[8] = var13;
      Pair var14 = rrwg_3.id_class(new rrIk_1("Воспроизводить звук", true), new rrIm_1("Питч звука", 1.0F, 0.1F, 2.0F, 0.1F));
      this.id_byte[9] = var14;
      this.id_class(
         new Setting[]{
            new GroupSetting("Переключение модулей", (rrIk_1)this.id_byte[0]),
            new GroupSetting(
               "Упоминание в чате",
               (rrIk_1)this.id_byte[1],
               new rrIc_1("Упоминание кого", (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3]).id_class(((rrIk_1)this.id_byte[1])::id_class)
            ),
            new GroupSetting("Спек в чате", (rrIk_1)this.id_byte[4]),
            new GroupSetting("Варп в чате", (rrIk_1)this.id_byte[5]),
            new GroupSetting("/pvp в чате", (rrIk_1)this.id_byte[6]),
            new GroupSetting("Снос щита", (rrIk_1)this.id_byte[7]),
            new GroupSetting("Другое", (rrIk_1)this.id_byte[8]),
            new GroupSetting("Общие настройки", (Setting)((Pair)this.id_byte[9]).getLeft(), (Setting)((Pair)this.id_byte[9]).getRight())
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new float[]{1.0F, 0.1F, 2.0F, 0.1F, 1.0F};
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && ((rrIk_1)this.id_byte[8]).id_class()) {
         for (rLY var4 : ((cb_3)id_import.id_class[57]).So()) {
            int var5 = var4.id_break();
            if (var5 == 200 && ((Set)id_break[0]).contains(var4.id_class())) {
               String var6 = jI_2.id_class("ru_ru", var4.id_class().id_byte());
               int var7 = var4.id_byte() + 1;
               if (var7 > 1) {
                  var6 = var6 + " " + var7;
               }

               rVi_1 var8 = new rgN_2("Эффект '")
                  .id_break(var6)
                  .id_class(rgF_2.GRAY)
                  .id_break("' закончится через ")
                  .id_class(new rgN_2("10 секунд").id_class(rgF_2.RED));
               rrfu_3.id_class(var8);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(this.id_case(), var8.id_class(rgF_2.WHITE), 4000));
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1297111880;
   }

   @EventTarget
   public void id_class(rrFy_1 var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[1]).id_class()) {
         Aw_1 var2 = var1.id_class();
         Set var3 = var1.id_break();
         String var4 = ((cb_3)id_import.id_class[57]).sv().getName();
         rgN_2 var5 = new rgN_2(this.id_final());
         rgP_2 var6 = uR_2.id_break(var2, rnO_2.PREFIX, rnO_2.NAME);
         boolean var7 = ((rrIk_1)this.id_byte[2]).id_class() && var3.contains(var4) ? true : id_implements[45];
         boolean var8 = ((rrIk_1)this.id_byte[3]).id_class() && var3.size() > (var7 ? 1 : id_implements[47]) ? true : id_implements[49];
         if (var7) {
            rVi_1 var9 = new rgN_2("Игрок '").id_class(var6).id_break("' упомянул ").id_class(new rgN_2("вас").id_class(rgF_2.RED));
            rrtd_3 var10 = new rrtd_3(var5, var9.id_case(), 4000);
            rrfu_3.id_class(var9.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var10);
            MinecraftAccessor.a_(var9.id_byte(), false);
         }

         if (var8) {
            var3.remove(var4);
            rVi_1 var11 = new rgN_2("Игрок '").id_class(var6).id_break("' упомянул друзей: ").id_class(new rgN_2(String.join(", ", var3)).id_class(rgF_2.RED));
            rrtd_3 var12 = new rrtd_3(var5, var11.id_case(), 4000);
            rrfu_3.id_class(var11.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var12);
            MinecraftAccessor.a_(var11.id_byte(), false);
         }
      }
   }

   @EventTarget
   public void id_class(rrFp_1 var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[6]).id_class()) {
         rgN_2 var2 = new rgN_2(this.id_final());
         Aw_1 var3 = var1.id_class();
         rgP_2 var4 = uR_2.id_break(var3, rnO_2.PREFIX, rnO_2.NAME);
         rVi_1 var5 = new rgN_2("Игрок '").id_class(var4).id_break("' зовёт на ").id_class(new rgN_2("/pvp").id_class(rgF_2.RED));
         rrtd_3 var6 = new rrtd_3(var2, var5.id_case(), 4000);
         rrfu_3.id_class(var5.id_class(rgF_2.GRAY));
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var6);
         MinecraftAccessor.a_(var5.id_byte(), false);
      }
   }

   @EventTarget
   public void id_class(rrFq_1 var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[4]).id_class()) {
         rgN_2 var2 = new rgN_2(this.id_final());
         Aw_1 var3 = var1.id_class();
         GameProfile var4 = var3.id_class();
         UUID var5 = var4.getId();
         rgP_2 var6 = uR_2.id_break(var3, rnO_2.PREFIX, rnO_2.NAME);
         rVi_1 var7 = new rgN_2("Игрок '").id_class(var6).id_break("' зовёт ").id_class(new rgN_2("спекать").id_class(rgF_2.RED));
         rrtJ_2 var8 = new rrtJ_2(var2, var7.id_case(), 4000);
         rhd_3 var9 = ((gm_3)id_import.id_class[56]).id_class(var5);
         if (var9 != null) {
            rrfu_3.id_class(var7.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var8);
            MinecraftAccessor.a_(var7.id_byte(), false);
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_return();
      if (var1.id_class() instanceof rvQ_2 var2 && var2.id_break() == 30 && ((rrIk_1)this.id_byte[7]).id_class()) {
         an_3 var7 = var2.id_class((gm_3)id_import.id_class[56]);
         if (var7 != (cb_3)id_import.id_class[57] && var7 instanceof cG_2 var4) {
            rgN_2 var5 = new rgN_2(this.id_final());
            rVi_1 var6 = new rgN_2("Щит игрока '").id_class(uR_2.id_break(var4.id_continue(), rnO_2.PREFIX, rnO_2.NAME)).id_break("' сломан");
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(var5, var6, 2000));
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4054606218749955329L;
   }

   @EventTarget
   public void id_class(rrLr_1 var1) {
      this.id_return();
      rrtO_2 var2 = var1.id_class();
      if (((rrIk_1)((Pair)this.id_byte[9]).getLeft()).id_class() && var2.id_class()) {
         rrIy_1.id_class(var2.id_throws(), 1.0F, ((rrIm_1)((Pair)this.id_byte[9]).getRight()).id_byte());
      }
   }

   @EventTarget
   public void id_class(rrFT var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[5]).id_class()) {
         Aw_1 var2 = var1.id_class();
         rgN_2 var3 = new rgN_2(this.id_final());
         rgP_2 var4 = uR_2.id_break(var2, rnO_2.PREFIX, rnO_2.NAME);
         rVi_1 var5 = new rgN_2("Игрок '").id_class(var4).id_break("' зовёт на варп ").id_class(new rgN_2("'" + var1.id_break() + "'").id_class(rgF_2.RED));
         rrtd_3 var6 = new rrtd_3(var3, var5.id_case(), 4000);
         rrfu_3.id_class(var5.id_class(rgF_2.GRAY));
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var6);
         MinecraftAccessor.a_(var5.id_byte(), false);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, 108, 118, 121, -53, -14, -74, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{Set.of((rLR)rLD.id_throws, (rLR)rLD.id_class, (rLR)rLD.id_final)};
      id_break = var0;
   }

   private static void id_continue() {
      id_catch = new short[]{
         2,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         0,
         1,
         2,
         3,
         1,
         4,
         5,
         6,
         7,
         8,
         9,
         9,
         9,
         9,
         0,
         8,
         57,
         200,
         0,
         0,
         4000,
         4,
         4000,
         56,
         0,
         6,
         4000,
         0,
         5,
         4000,
         0,
         1,
         57,
         2,
         3,
         4000,
         0,
         4000,
         0,
         7,
         56,
         57,
         0,
         2000,
         0
      };
   }

   private static void id_else() {
      id_implements = new boolean[]{
         true,
         false,
         false,
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
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true
      };
   }

   public boolean id_new() {
      this.id_return();
      return ((rrIk_1)this.id_byte[0]).id_class();
   }

   private void id_return() {
      if (this.id_byte == null) {
         this.id_byte = new Object[10];
      }
   }

   private static void id_super() {
      id_throws = new byte[]{8, 2, 2, 2, 3, 4, 5, 6, 7, 2, 2, 2, 2, 2, 30, 2, 10};
   }

   private static void id_public() {
      id_private = new String[]{
         new String("Notifications"),
         new String("Откладка о каких либо действиях"),
         new String("Включено"),
         new String("Включено"),
         new String("Вас"),
         new String("Друзей"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Включено"),
         new String("Уведомлять об окончании\nважных эффектов"),
         new String("Воспроизводить звук"),
         new String("Питч звука"),
         new String("Переключение модулей"),
         new String("Упоминание в чате"),
         new String("Упоминание кого"),
         new String("Спек в чате"),
         new String("Варп в чате"),
         new String("/pvp в чате"),
         new String("Снос щита"),
         new String("Другое"),
         new String("Общие настройки"),
         new String("ru_ru"),
         new String("Эффект '"),
         new String("' закончится через "),
         new String("10 секунд"),
         new String("Игрок '"),
         new String("' зовёт "),
         new String("спекать"),
         new String("Игрок '"),
         new String("' зовёт на "),
         new String("/pvp"),
         new String("Игрок '"),
         new String("' зовёт на варп "),
         new String("Игрок '"),
         new String("' упомянул "),
         new String("вас"),
         new String("Игрок '"),
         new String("' упомянул друзей: "),
         new String(", "),
         new String("Щит игрока '"),
         new String("' сломан")
      };
   }
}
