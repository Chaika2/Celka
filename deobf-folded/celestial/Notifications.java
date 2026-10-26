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
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_return();
      rrIk_1 var5 = new rrIk_1(id_private[2], true);
      this.id_byte[id_catch[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_private[3], id_implements[1]);
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1(id_private[4], id_implements[2]);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1(id_private[5], id_implements[3]);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1(id_private[6], id_implements[4]);
      this.id_byte[4] = var9;
      rrIk_1 var10 = new rrIk_1(id_private[7], id_implements[5]);
      this.id_byte[5] = var10;
      rrIk_1 var11 = new rrIk_1(id_private[8], id_implements[6]);
      this.id_byte[6] = var11;
      rrIk_1 var12 = new rrIk_1(id_private[9], id_implements[7]);
      this.id_byte[7] = var12;
      rrIk_1 var13 = new rrIk_1(id_private[10], true);
      this.id_byte[8] = var13;
      Pair var14 = rrwg_3.id_class(new rrIk_1(id_private[11], true), new rrIm_1(id_private[12], 1.0F, 0.1F, 2.0F, 0.1F));
      this.id_byte[9] = var14;
      Setting[] var10001 = new Setting[8];
      byte var10003 = id_implements[10];
      String var10006 = id_private[13];
      Setting[] var10007 = new Setting[1];
      var10007[id_implements[12]] = (rrIk_1)this.id_byte[id_catch[11]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10006 = id_private[14];
      var10007 = new Setting[2];
      var10007[id_implements[14]] = (rrIk_1)this.id_byte[1];
      String var10012 = id_private[15];
      rrIk_1[] var10013 = new rrIk_1[2];
      var10013[id_implements[16]] = (rrIk_1)this.id_byte[2];
      var10013[1] = (rrIk_1)this.id_byte[3];
      var10007[1] = new rrIc_1(var10012, var10013).id_class(((rrIk_1)this.id_byte[1])::id_class);
      var10001[1] = new GroupSetting(var10006, var10007);
      var10006 = id_private[16];
      var10007 = new Setting[1];
      var10007[id_implements[19]] = (rrIk_1)this.id_byte[4];
      var10001[2] = new GroupSetting(var10006, var10007);
      var10006 = id_private[17];
      var10007 = new Setting[1];
      var10007[id_implements[21]] = (rrIk_1)this.id_byte[5];
      var10001[3] = new GroupSetting(var10006, var10007);
      var10006 = id_private[18];
      var10007 = new Setting[1];
      var10007[id_implements[23]] = (rrIk_1)this.id_byte[6];
      var10001[4] = new GroupSetting(var10006, var10007);
      var10006 = id_private[19];
      var10007 = new Setting[1];
      var10007[id_implements[25]] = (rrIk_1)this.id_byte[7];
      var10001[5] = new GroupSetting(var10006, var10007);
      var10006 = id_private[20];
      var10007 = new Setting[1];
      var10007[id_implements[27]] = (rrIk_1)this.id_byte[8];
      var10001[6] = new GroupSetting(var10006, var10007);
      var10006 = id_private[21];
      var10007 = new Setting[2];
      var10007[id_implements[28]] = (Setting)((Pair)this.id_byte[9]).getLeft();
      var10007[1] = (Setting)((Pair)this.id_byte[9]).getRight();
      var10001[7] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
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
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[25]] && ((rrIk_1)this.id_byte[8]).id_class()) {
         for (rLY var4 : ((cb_3)id_import.id_class[57]).So()) {
            int var5 = var4.id_break();
            if (var5 == 200 && ((Set)id_break[id_catch[29]]).contains(var4.id_class())) {
               String var6 = jI_2.id_class(id_private[22], var4.id_class().id_byte());
               int var7 = var4.id_byte() + 1;
               if (var7 > 1) {
                  var6 = var6 + " " + var7;
               }

               rVi_1 var8 = new rgN_2(id_private[23])
                  .id_break(var6)
                  .id_class(rgF_2.GRAY)
                  .id_break(id_private[24])
                  .id_class(new rgN_2(id_private[25]).id_class(rgF_2.RED));
               rrfu_3.id_class(var8);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[30]])
                  .id_class(new rrtd_3(this.id_case(), var8.id_class(rgF_2.WHITE), 4000));
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
         rnO_2[] var10001 = new rnO_2[2];
         var10001[id_implements[42]] = rnO_2.PREFIX;
         var10001[1] = rnO_2.NAME;
         rgP_2 var6 = uR_2.id_break(var2, var10001);
         boolean var7 = ((rrIk_1)this.id_byte[2]).id_class() && var3.contains(var4) ? true : id_implements[45];
         boolean var8 = ((rrIk_1)this.id_byte[3]).id_class() && var3.size() > (var7 ? 1 : id_implements[47]) ? true : id_implements[49];
         if (var7) {
            rVi_1 var9 = new rgN_2(id_private[34]).id_class(var6).id_break(id_private[35]).id_class(new rgN_2(id_private[36]).id_class(rgF_2.RED));
            rrtd_3 var10 = new rrtd_3(var5, var9.id_case(), 4000);
            rrfu_3.id_class(var9.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[47]]).id_class(var10);
            MinecraftAccessor.a_(var9.id_byte(), id_implements[50]);
         }

         if (var8) {
            var3.remove(var4);
            rVi_1 var11 = new rgN_2(id_private[37])
               .id_class(var6)
               .id_break(id_private[38])
               .id_class(new rgN_2(String.join(id_private[39], var3)).id_class(rgF_2.RED));
            rrtd_3 var12 = new rrtd_3(var5, var11.id_case(), 4000);
            rrfu_3.id_class(var11.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[49]]).id_class(var12);
            MinecraftAccessor.a_(var11.id_byte(), id_implements[51]);
         }
      }
   }

   @EventTarget
   public void id_class(rrFp_1 var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[6]).id_class()) {
         rgN_2 var2 = new rgN_2(this.id_final());
         Aw_1 var3 = var1.id_class();
         rnO_2[] var10001 = new rnO_2[2];
         var10001[id_implements[36]] = rnO_2.PREFIX;
         var10001[1] = rnO_2.NAME;
         rgP_2 var4 = uR_2.id_break(var3, var10001);
         rVi_1 var5 = new rgN_2(id_private[29]).id_class(var4).id_break(id_private[30]).id_class(new rgN_2(id_private[31]).id_class(rgF_2.RED));
         rrtd_3 var6 = new rrtd_3(var2, var5.id_case(), 4000);
         rrfu_3.id_class(var5.id_class(rgF_2.GRAY));
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[38]]).id_class(var6);
         MinecraftAccessor.a_(var5.id_byte(), id_implements[38]);
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
         rnO_2[] var10001 = new rnO_2[2];
         var10001[id_implements[33]] = rnO_2.PREFIX;
         var10001[1] = rnO_2.NAME;
         rgP_2 var6 = uR_2.id_break(var3, var10001);
         rVi_1 var7 = new rgN_2(id_private[26]).id_class(var6).id_break(id_private[27]).id_class(new rgN_2(id_private[28]).id_class(rgF_2.RED));
         rrtJ_2 var8 = new rrtJ_2(var2, var7.id_case(), 4000);
         rhd_3 var9 = ((gm_3)id_import.id_class[56]).id_class(var5);
         if (var9 != null) {
            rrfu_3.id_class(var7.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[35]]).id_class(var8);
            MinecraftAccessor.a_(var7.id_byte(), id_implements[35]);
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
            rgN_2 var10000 = new rgN_2(id_private[40]);
            Aw_1 var10001 = var4.id_continue();
            rnO_2[] var10002 = new rnO_2[2];
            var10002[id_implements[52]] = rnO_2.PREFIX;
            var10002[1] = rnO_2.NAME;
            rVi_1 var6 = var10000.id_class(uR_2.id_break(var10001, var10002)).id_break(id_private[41]);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[53]]).id_class(new rrtd_3(var5, var6, 2000));
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
         rnO_2[] var10001 = new rnO_2[2];
         var10001[id_implements[39]] = rnO_2.PREFIX;
         var10001[1] = rnO_2.NAME;
         rgP_2 var4 = uR_2.id_break(var2, var10001);
         rVi_1 var5 = new rgN_2(id_private[32]).id_class(var4).id_break(id_private[33]).id_class(new rgN_2("'" + var1.id_break() + "'").id_class(rgF_2.RED));
         rrtd_3 var6 = new rrtd_3(var3, var5.id_case(), 4000);
         rrfu_3.id_class(var5.id_class(rgF_2.GRAY));
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[41]]).id_class(var6);
         MinecraftAccessor.a_(var5.id_byte(), id_implements[41]);
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
      return ((rrIk_1)this.id_byte[id_catch[55]]).id_class();
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
