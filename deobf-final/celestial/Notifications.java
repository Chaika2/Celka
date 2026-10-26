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
   private static float[] protected_;
   private static byte[] throws_;
   public static Object[] break_;
   public Object[] byte_;
   private static short[] catch_;
   private static String[] private_;
   private static boolean[] implements_;

   public Notifications() {
      super("Notifications", "Откладка о каких либо действиях", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.return_();
      rrIk_1 var5 = new rrIk_1("Включено", true);
      this.byte_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Включено", false);
      this.byte_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Вас", false);
      this.byte_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Друзей", false);
      this.byte_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Включено", false);
      this.byte_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Включено", false);
      this.byte_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Включено", false);
      this.byte_[6] = var11;
      rrIk_1 var12 = new rrIk_1("Включено", false);
      this.byte_[7] = var12;
      rrIk_1 var13 = new rrIk_1("Уведомлять об окончании\nважных эффектов", true);
      this.byte_[8] = var13;
      Pair var14 = rrwg_3.class_(new rrIk_1("Воспроизводить звук", true), new rrIm_1("Питч звука", 1.0F, 0.1F, 2.0F, 0.1F));
      this.byte_[9] = var14;
      this.class_(
         new Setting[]{
            new GroupSetting("Переключение модулей", (rrIk_1)this.byte_[0]),
            new GroupSetting(
               "Упоминание в чате",
               (rrIk_1)this.byte_[1],
               new rrIc_1("Упоминание кого", (rrIk_1)this.byte_[2], (rrIk_1)this.byte_[3]).class_(((rrIk_1)this.byte_[1])::class_)
            ),
            new GroupSetting("Спек в чате", (rrIk_1)this.byte_[4]),
            new GroupSetting("Варп в чате", (rrIk_1)this.byte_[5]),
            new GroupSetting("/pvp в чате", (rrIk_1)this.byte_[6]),
            new GroupSetting("Снос щита", (rrIk_1)this.byte_[7]),
            new GroupSetting("Другое", (rrIk_1)this.byte_[8]),
            new GroupSetting("Общие настройки", (Setting)((Pair)this.byte_[9]).getLeft(), (Setting)((Pair)this.byte_[9]).getRight())
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new float[]{1.0F, 0.1F, 2.0F, 0.1F, 1.0F};
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.return_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && ((rrIk_1)this.byte_[8]).class_()) {
         for (rLY var4 : ((cb_3)import_.class_[57]).So()) {
            int var5 = var4.break_();
            if (var5 == 200 && ((Set)break_[0]).contains(var4.class_())) {
               String var6 = jI_2.class_("ru_ru", var4.class_().byte_());
               int var7 = var4.byte_() + 1;
               if (var7 > 1) {
                  var6 = var6 + " " + var7;
               }

               rVi_1 var8 = new rgN_2("Эффект '")
                  .break_(var6)
                  .class_(rgF_2.GRAY)
                  .break_("' закончится через ")
                  .class_(new rgN_2("10 секунд").class_(rgF_2.RED));
               rrfu_3.class_(var8);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3(this.case_(), var8.class_(rgF_2.WHITE), 4000));
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1297111880;
   }

   @EventTarget
   public void class_(rrFy_1 var1) {
      this.return_();
      if (((rrIk_1)this.byte_[1]).class_()) {
         Aw_1 var2 = var1.class_();
         Set var3 = var1.break_();
         String var4 = ((cb_3)import_.class_[57]).sv().getName();
         rgN_2 var5 = new rgN_2(this.final_());
         rgP_2 var6 = uR_2.break_(var2, rnO_2.PREFIX, rnO_2.NAME);
         boolean var7 = ((rrIk_1)this.byte_[2]).class_() && var3.contains(var4) ? true : implements_[45];
         boolean var8 = ((rrIk_1)this.byte_[3]).class_() && var3.size() > (var7 ? 1 : implements_[47]) ? true : implements_[49];
         if (var7) {
            rVi_1 var9 = new rgN_2("Игрок '").class_(var6).break_("' упомянул ").class_(new rgN_2("вас").class_(rgF_2.RED));
            rrtd_3 var10 = new rrtd_3(var5, var9.case_(), 4000);
            rrfu_3.class_(var9.class_(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(var10);
            MinecraftAccessor.a_(var9.byte_(), false);
         }

         if (var8) {
            var3.remove(var4);
            rVi_1 var11 = new rgN_2("Игрок '").class_(var6).break_("' упомянул друзей: ").class_(new rgN_2(String.join(", ", var3)).class_(rgF_2.RED));
            rrtd_3 var12 = new rrtd_3(var5, var11.case_(), 4000);
            rrfu_3.class_(var11.class_(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(var12);
            MinecraftAccessor.a_(var11.byte_(), false);
         }
      }
   }

   @EventTarget
   public void class_(rrFp_1 var1) {
      this.return_();
      if (((rrIk_1)this.byte_[6]).class_()) {
         rgN_2 var2 = new rgN_2(this.final_());
         Aw_1 var3 = var1.class_();
         rgP_2 var4 = uR_2.break_(var3, rnO_2.PREFIX, rnO_2.NAME);
         rVi_1 var5 = new rgN_2("Игрок '").class_(var4).break_("' зовёт на ").class_(new rgN_2("/pvp").class_(rgF_2.RED));
         rrtd_3 var6 = new rrtd_3(var2, var5.case_(), 4000);
         rrfu_3.class_(var5.class_(rgF_2.GRAY));
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(var6);
         MinecraftAccessor.a_(var5.byte_(), false);
      }
   }

   @EventTarget
   public void class_(rrFq_1 var1) {
      this.return_();
      if (((rrIk_1)this.byte_[4]).class_()) {
         rgN_2 var2 = new rgN_2(this.final_());
         Aw_1 var3 = var1.class_();
         GameProfile var4 = var3.class_();
         UUID var5 = var4.getId();
         rgP_2 var6 = uR_2.break_(var3, rnO_2.PREFIX, rnO_2.NAME);
         rVi_1 var7 = new rgN_2("Игрок '").class_(var6).break_("' зовёт ").class_(new rgN_2("спекать").class_(rgF_2.RED));
         rrtJ_2 var8 = new rrtJ_2(var2, var7.case_(), 4000);
         rhd_3 var9 = ((gm_3)import_.class_[56]).class_(var5);
         if (var9 != null) {
            rrfu_3.class_(var7.class_(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(var8);
            MinecraftAccessor.a_(var7.byte_(), false);
         }
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.return_();
      if (var1.class_() instanceof rvQ_2 var2 && var2.break_() == 30 && ((rrIk_1)this.byte_[7]).class_()) {
         an_3 var7 = var2.class_((gm_3)import_.class_[56]);
         if (var7 != (cb_3)import_.class_[57] && var7 instanceof cG_2 var4) {
            rgN_2 var5 = new rgN_2(this.final_());
            rVi_1 var6 = new rgN_2("Щит игрока '").class_(uR_2.break_(var4.continue_(), rnO_2.PREFIX, rnO_2.NAME)).break_("' сломан");
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3(var5, var6, 2000));
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4054606218749955329L;
   }

   @EventTarget
   public void class_(rrLr_1 var1) {
      this.return_();
      rrtO_2 var2 = var1.class_();
      if (((rrIk_1)((Pair)this.byte_[9]).getLeft()).class_() && var2.class_()) {
         rrIy_1.class_(var2.throws_(), 1.0F, ((rrIm_1)((Pair)this.byte_[9]).getRight()).byte_());
      }
   }

   @EventTarget
   public void class_(rrFT var1) {
      this.return_();
      if (((rrIk_1)this.byte_[5]).class_()) {
         Aw_1 var2 = var1.class_();
         rgN_2 var3 = new rgN_2(this.final_());
         rgP_2 var4 = uR_2.break_(var2, rnO_2.PREFIX, rnO_2.NAME);
         rVi_1 var5 = new rgN_2("Игрок '").class_(var4).break_("' зовёт на варп ").class_(new rgN_2("'" + var1.break_() + "'").class_(rgF_2.RED));
         rrtd_3 var6 = new rrtd_3(var3, var5.case_(), 4000);
         rrfu_3.class_(var5.class_(rgF_2.GRAY));
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(var6);
         MinecraftAccessor.a_(var5.byte_(), false);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, 108, 118, 121, -53, -14, -74, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void goto_() {
      Object[] var0 = new Object[]{Set.of((rLR)rLD.throws_, (rLR)rLD.class_, (rLR)rLD.final_)};
      break_ = var0;
   }

   private static void continue_() {
      catch_ = new short[]{
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

   private static void else_() {
      implements_ = new boolean[]{
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

   public boolean new_() {
      this.return_();
      return ((rrIk_1)this.byte_[0]).class_();
   }

   private void return_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[10];
      }
   }

   private static void super_() {
      throws_ = new byte[]{8, 2, 2, 2, 3, 4, 5, 6, 7, 2, 2, 2, 2, 2, 30, 2, 10};
   }

   private static void public_() {
      private_ = new String[]{
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
