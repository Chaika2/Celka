package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.RandomStringUtils;

public class FtHelper extends Module {
   private static byte[] protected_;
   public static Object[] break_;
   public Object[] byte_;
   private static long[] throws_;
   private static short[] catch_;
   private static double[] private_;
   private static boolean[] implements_;
   private static String[] finally_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{28, -81, -6, -68, 91, 50, -111, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public FtHelper() {
      super("FT Helper", "Утилитарный модуль для Funtime", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.this_();
      ArrayList var9 = new ArrayList();
      this.byte_[0] = var9;
      rrIk_1 var10 = new rrIk_1("Улучшать команды", true);
      this.byte_[22] = var10;
      rrIk_1 var11 = new rrIk_1("Улучшать информацию о\nпредметах на аукционе", true);
      this.byte_[23] = var11;
      rrIk_1 var12 = new rrIk_1("Уведомлять когда на вас\nналожили плохие эффекты", true);
      this.byte_[24] = var12;
      rrIk_1 var13 = new rrIk_1("Авто. перевыставление\nпредметов в хранилище", true);
      this.byte_[25] = var13;
      rrIk_1 var14 = new rrIk_1("Авто. инвестирование в\nклан", false);
      this.byte_[26] = var14;
      rrIk_1 var15 = new rrIk_1("Авто. добавление друзей в\nрегион", false);
      this.byte_[27] = var15;
      rrIk_1 var16 = new rrIk_1("Позволять открывать\nшалкер внутри шалкера", true);
      this.byte_[28] = var16;
      rrIk_1 var17 = new rrIk_1("Не ставить сферы", false);
      this.byte_[29] = var17;
      rrfP_2 var18 = new rrfP_2();
      this.byte_[30] = var18;
      Integer var19 = -1;
      this.byte_[33] = var19;
      rrfw_3 var20 = new rrfw_3();
      this.byte_[36] = var20;
      GroupSetting var1 = new GroupSetting("Чат", (rrIk_1)this.byte_[22]);
      GroupSetting var2 = new GroupSetting("Аукцион");
      GroupSetting var3 = new GroupSetting("Другое");
      GroupSetting var4 = new GroupSetting("Авто-шахта");
      rryR var21 = this.class_(new rryR(this));
      this.byte_[2] = var21;
      rryf_1 var22 = this.class_(new rryf_1(this));
      this.byte_[1] = var22;
      rrpk_3 var23 = this.class_(new rrpk_3(this));
      this.byte_[3] = var23;
      rryo_1 var24 = this.class_(new rryo_1(this));
      this.byte_[4] = var24;
      rrpx_3 var25 = this.class_(new rrpx_3(this));
      this.byte_[5] = var25;
      rrph_3 var26 = this.class_(new rrph_3(this));
      this.byte_[6] = var26;
      rryU var27 = this.class_(new rryU(this));
      this.byte_[7] = var27;
      rrpB_2 var28 = this.class_(new rrpB_2(this));
      this.byte_[8] = var28;
      rrps_3 var29 = this.class_(new rrps_3(this));
      this.byte_[12] = var29;
      rryw_1 var30 = this.class_(new rryw_1(this));
      this.byte_[11] = var30;
      rrpG_2 var31 = this.class_(new rrpG_2(this));
      this.byte_[9] = var31;
      rrpr_3 var32 = this.class_(new rrpr_3(this));
      this.byte_[15] = var32;
      rrya_1 var33 = this.class_(new rrya_1(this));
      this.byte_[14] = var33;
      rrpM_2 var34 = this.class_(new rrpM_2(this));
      this.byte_[13] = var34;
      rryV var35 = this.class_(new rryV(this));
      this.byte_[10] = var35;
      rrpz_3 var36 = this.class_(new rrpz_3(this, var2));
      this.byte_[16] = var36;
      rrpF_2 var37 = this.class_(new rrpF_2(this));
      this.byte_[17] = var37;
      rrpc_3 var38 = this.class_(new rrpc_3(this, var3));
      this.byte_[18] = var38;
      rrpN_2 var39 = this.class_(new rrpN_2(this));
      this.byte_[19] = var39;
      rrpL_2 var40 = this.class_(new rrpL_2(this));
      this.byte_[20] = var40;
      rrpm_3 var41 = this.class_(new rrpm_3(this, var4));
      this.byte_[21] = var41;
      var3.class_((rrIk_1)this.byte_[26], (rrIk_1)this.byte_[27], (rrIk_1)this.byte_[24], (rrIk_1)this.byte_[28], (rrIk_1)this.byte_[29]);
      var2.class_((rrIk_1)this.byte_[23], (rrIk_1)this.byte_[25]);
      this.class_(new Setting[]{var2, var4, var1, var3});
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[37];
         this.byte_[32] = false;
         this.byte_[33] = 0;
         this.byte_[34] = 0L;
         this.byte_[35] = 0L;
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.this_();
      ((rrfP_2)this.byte_[30]).class_(var1);
   }

   @EventTarget
   public void class_(rrLE var1) {
      if (this.new_()) {
         cW_2 var2 = var1.class_();
         Lu_1 var3 = var2.byte_();
         vm_3 var5 = (vm_3)import_.class_[73];
         if (var5 instanceof FP var4 && var4.class_ == var3) {
            String var12 = var3.private_();
            Matcher var6 = ((Pattern)rrjb_3.class_[9]).matcher(var12);
            Matcher var7 = ((Pattern)rrjb_3.class_[12]).matcher(var12);
            Matcher var8 = ((Pattern)rrjb_3.class_[13]).matcher(var12);
            Matcher var9 = ((Pattern)rrjb_3.class_[15]).matcher(var12);
            String var10 = null;
            String var11 = null;
            if (var6.find()) {
               var10 = this.class_((rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[2], var6.group(2));
               var11 = "Цена";
            } else if (var7.find()) {
               var10 = this.class_(this.break_(var7.group(1)), var7.group(2));
               var11 = "Сумма";
            } else if (var8.find()) {
               var10 = this.class_((rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[0], var8.group(3));
               var11 = "Сумма";
            } else if (var9.find()) {
               var10 = this.class_((rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[1], var9.group(1));
               var11 = "Сумма";
            }

            if (var10 != null && var11 != null) {
               this.class_(var11, var10, var2);
               var1.class_(true);
            }
         }
      }
   }

   private String class_(rryT var1, String var2) {
      this.this_();

      try {
         if (var1 == (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[catch_[154]]
            || var1 == (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[catch_[155]]) {
            String var3 = this.protected_(var2);
            if (var3 != null) {
               var2 = String.valueOf(C_throws.byte_().native_().byte_());
            }
         }

         return ((rrpF_2)this.byte_[catch_[156]]).class_(var2);
      } catch (Exception var4) {
         return null;
      }
   }

   private void class_(String var1, String var2, cW_2 var3) {
      if (var2 != null && !var2.isEmpty()) {
         try {
            List var4 = var3.throws_();
            cz_3 var5 = new cz_3(new rgN_2(var1 + ": " + rgF_2.YELLOW + rql_3.class_(var2, (char)protected_[36])).catch_());
            var4.add(implements_[49], var5);
         } catch (NumberFormatException var6) {
         }
      }
   }

   @EventTarget
   public void class_(rrAv_1 var1) {
      this.this_();
      String var2 = var1.class_();
      boolean var3 = this.new_();
      boolean var4 = ((rrIk_1)this.byte_[26]).class_();
      if (var3 || var4) {
         String var5 = import_.while_().byte_();
         rryt_1 var6 = null;
         Matcher var7 = ((Pattern)rrjb_3.class_[12]).matcher(var2);
         if (var3) {
            Matcher var8 = ((Pattern)rrjb_3.class_[10]).matcher(var2);
            Matcher var9 = ((Pattern)rrjb_3.class_[13]).matcher(var2);
            Matcher var10 = ((Pattern)rrjb_3.class_[14]).matcher(var2);
            Matcher var11 = ((Pattern)rrjb_3.class_[11]).matcher(var2);
            if (var8.find() && this.catch_(var8.group(1)) != null) {
               var1.byte_("/ah " + var5);
            } else if (var11.find() && this.catch_(var11.group(1)) != null) {
               var1.byte_("/duel stats " + var5);
            } else if (var9.find() && this.protected_(var9.group(3)) != null) {
               var6 = new rryt_1("/pay " + var9.group(2), (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[0]);
            } else if (var10.find() && rql_3.break_(var10.group(1))) {
               var1.byte_(this.goto_());
               Boolean var16 = true;
               this.byte_[32] = var16;
            }
         }

         if (var7.find() && this.protected_(var7.group(2)) != null) {
            String var18 = var7.group(1);
            rryT var20 = this.break_(var18);
            if (var20 != null) {
               var6 = new rryt_1("/clan " + var18, var20);
            }
         }

         if (var6 != null) {
            this.byte_[31] = var6;
            rryT var19 = var6.break_();
            var1.byte_(var19 == (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[3] ? "/clan money" : finally_[29]);
         }
      }
   }

   @EventTarget
   public void class_(rrLD var1) {
      this.this_();
      List var2 = var1.protected_();
      iB_2 var3 = var1.break_();
      if (((rrIk_1)this.byte_[24]).class_() && var3 == (cb_3)import_.class_[57]) {
         ArrayList var4 = new ArrayList();

         for (rLY var6 : var2) {
            var4.add(var6.class_());
         }

         rrfO_2 var9 = rrfO_2.class_(var4);
         rVi_1 var10 = null;
         if (var9 == (rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[5]) {
            var10 = new rgN_2("Зелье Радиации").class_(rgF_2.GREEN);
         } else if (var9 == (rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[6]) {
            var10 = new rgN_2("Снотворное").class_(rgF_2.BLUE);
         }

         if (var10 != null) {
            int var7 = ((rryU)this.byte_[7]).break_();
            int var8 = rrfY_2.class_(rdy_3.hi, false, true);
            if (var7 != -1) {
               this.class_(new rgN_2("На вас наложили ").class_(var10).break_(", используйте божью ауру"));
            } else if (var8 != -1) {
               this.class_(new rgN_2("На вас наложили ").class_(var10).break_(", используйте молоко"));
            } else {
               this.class_(new rgN_2("На вас наложили ").class_(var10));
            }
         }
      }
   }

   @EventTarget
   public void class_(rrAZ var1) {
      this.this_();
      if (((rrIk_1)this.byte_[25]).class_() && var1.class_() instanceof Fc_1 var2) {
         String var11 = var2.new_().byte_();
         int var4 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
         if (!var11.startsWith("☃ Хранилище")) {
            return;
         }

         rrNW var5 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_();
         Pj_1 var6 = C_throws.byte_().package_();
         int var7 = var2.throw_();
         if (var6.byte_()) {
            if (var5.int_().isEmpty()) {
               var5.break_(61000L);
               var5.protected_(true);
            } else if (var7 > 0 && var7 % 5 == 0) {
               rqs_3 var8 = var2.G_().extends_();
               rdn_3 var9 = var6.break_(var8);
               int var10 = var8.indexOf(var9);
               if (var10 != -1) {
                  ((Ax_1)import_.class_[55]).class_(var4, var10, 2, rXa_1.CLONE);
               }
            }
         }
      }
   }

   private void class_(rVi_1 var1) {
      rrfu_3.class_(rrfu_3.break_((Module)this).class_(rgF_2.GRAY).class_(var1));
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3(this.case_(), var1, 3000));
   }

   @EventTarget
   public void class_(rrLO var1) {
      this.this_();
      if ((
            (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )
         && var1.break_() == null) {
         String var2 = var1.protected_();
         if (((rrIk_1)this.byte_[27]).class_()) {
            Matcher var3 = ((Pattern)rrjb_3.class_[4]).matcher(var2);
            if (var3.find()) {
               List var4 = rrfp_3.case_();
               if (var4.isEmpty()) {
                  return;
               }

               String var5 = rrfu_3.class_((Module)this);
               String var6 = var3.group(1);

               for (rrZk_1 var8 : var4) {
                  String var9 = var8.class_();
                  ((cb_3)import_.class_[57]).case_("/ps add " + var9 + " " + var6);
                  rrfu_3.byte_(var5 + "Добавляем '" + var9 + "' в регион #" + var6);
               }
            }
         }
      }
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.this_();
      if (var1.class_() instanceof rmt_3 var2
         && (
            (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )
         && ((rrIk_1)this.byte_[28]).class_()
         && (cb_3)import_.class_[57] != null
         && (rJr_1)((cb_3)import_.class_[57]).implements_[4] instanceof rJV
         && var2.protected_() == 1
         && var2.case_().break_() instanceof rxJ_2 var5
         && var5.catch_() instanceof Wp_1) {
         var2.break_(var2.byte_() - 18);
         var2.class_(0);
         ((cb_3)import_.class_[57]).strictfp_();
      }
   }

   @EventTarget
   public void class_(rrLh_1 var1) {
      this.this_();
      boolean var2 = this.new_();
      boolean var3 = ((rrIk_1)this.byte_[26]).class_();
      if (var2 || var3) {
         rgP_2 var4 = var1.throws_();
         String var5 = var1.class_();
         if ((
               (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
                  || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
            )
            && var1.protected_() == null) {
            if (var2) {
               if (var4 instanceof rgN_2 var6) {
                  if (!var5.contains("|| Статус: »") && !var5.contains("До следующего ивента")) {
                     Matcher var17 = ((Pattern)rrjb_3.class_[6]).matcher(var5);
                     if (var17.find()) {
                        String var19 = var17.group(1);
                        var1.class_(var6.class_(var19, rql_3.class_(var19, ','), true));
                     }
                  } else {
                     Matcher var7 = ((Pattern)rrjb_3.class_[16]).matcher(var5);
                     if (var7.find()) {
                        String var8 = var7.group(1);
                        Duration var9 = Duration.ofSeconds(Long.parseLong(var8.replaceAll("[^0-9]", "")));
                        var1.class_(var6.class_(var8, rql_3.class_(var9), true));
                     }
                  }
               }

               if ((Boolean)this.byte_[32] && var5.contains("[⚔] Ошибка, клан с таким названием уже существует!")) {
                  ((cb_3)import_.class_[57]).case_(this.goto_());
               } else if (var5.contains("[⚔] Супер! Вы успешно создали клан:") || var5.contains("[⚔] Ошибка: Ты уже состоишь в клане!")) {
                  Boolean var14 = false;
                  this.byte_[32] = var14;
               }
            }

            if ((rryt_1)this.byte_[31] != null) {
               Matcher var16 = null;
               if (((rryt_1)this.byte_[31]).break_() == (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[3]) {
                  if (var2) {
                     var16 = ((Pattern)rrjb_3.class_[6]).matcher(var5);
                  }
               } else {
                  var16 = ((Pattern)rrjb_3.class_[5]).matcher(var5);
               }

               if (var16 != null && var16.find()) {
                  long var18 = Long.parseLong(var16.group(1).replaceAll("[^0-9]", ""));
                  ((cb_3)import_.class_[57]).case_(((rryt_1)this.byte_[31]).class_() + " " + var18);
                  Object var15 = null;
                  this.byte_[31] = var15;
               }
            }
         }
      }
   }

   public <T extends rrTF<?>> T class_(T var1) {
      this.this_();
      ((List)this.byte_[0]).add(var1);
      if (var1 instanceof rrHv_1 var2) {
         ((rrTm_1)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]).class_(var2);
      }

      return (T)var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1520658337;
   }

   @EventTarget
   public void class_(rrAq_1 var1) {
      this.this_();
      rJY var2 = var1.class_();
      rJr_1 var3 = var1.break_();
      if (var3 instanceof rXe_1 && ((rrIk_1)this.byte_[23]).class_()) {
         if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
            return;
         }

         rdn_3 var4 = var2.class_();
         int var5 = var4.char_();
         if (var2.protected_ > 44 || var5 < 2) {
            return;
         }

         rrNt_1 var6 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).break_(var2);
         if (var6 == null) {
            return;
         }

         List var7 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_().synchronized_();
         var6.class_(var7);
         rcd_3 var8 = var4.package_();
         int var9 = var6.case_();
         if (var8 != null && var8.byte_("display", 10)) {
            rcd_3 var10 = var8.int_("display");
            if (var10.protected_("Lore") == 9) {
               try {
                  rcy_3 var11 = var10.protected_(finally_[40], protected_[26]);
                  int var12 = protected_[27];

                  for (int var13 = implements_[40]; var13 < var11.size(); var13++) {
                     String var14 = var11.implements_(var13);
                     if (var14.contains(finally_[41]) || var14.contains(finally_[42])) {
                        var12 = var13;
                        break;
                     }
                  }

                  if (var12 != protected_[28]) {
                     String var16 = rgF_2.GREEN + "$ " + rgF_2.WHITE + "Цена за штуку: " + rgF_2.GREEN + rql_3.class_(var9 / var5, (char)protected_[29]);
                     var11.byte_(var12 + implements_[41], rca_3.class_("{\"text\":\"" + var16 + "\"}"));
                  }
               } catch (Exception var15) {
                  var15.printStackTrace();
               }
            }
         }
      }
   }

   @EventTarget
   public void class_(rrAR var1) {
      this.this_();
      rdn_3 var2 = var1.class_();
      rpm_3 var3 = var1.throws_();
      xd_3 var4 = var1.protected_();
      rff_3 var5 = var1.break_();
      rfH_2 var6 = var5.class_();
      rpr_3 var7 = var5.break_();
      if (var3 == rpm_3.MAIN_HAND
         && (
            (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )
         && var2.break_() instanceof rkx_3
         && rrjS_2.class_(var2, var4, var6, var7)) {
         int var8 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).throws_();
         if (var8 != -1) {
            if (var8 >= 9) {
               ((rrfP_2)this.byte_[30]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
               Integer var14 = var8;
               this.byte_[33] = var14;
               ((Ax_1)import_.class_[55]).class_(var8);
               Long var15 = rqR_2.break_();
               this.byte_[34] = var15;
            } else {
               Integer var16 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
               this.byte_[33] = var16;
               rrfo_3.class_(var8);
            }

            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZx_1(var3, var5));
            var1.class_(true);
         } else {
            rrfu_3.byte_(rrfu_3.class_((Module)this) + "Нет свободного слота в инвентаре чтобы сесть");
         }
      }

      if (((rrIk_1)this.byte_[29]).class_() && var3 == rpm_3.OFF_HAND) {
         rdn_3 var17 = ((cb_3)import_.class_[57]).ss();
         boolean var9 = var17.break_() != rdy_3.xe && !(var17.break_() instanceof rkX_2) ? implements_[44] : implements_[43];
         if (var9 && rrjS_2.break_(var2)) {
            var1.class_(true);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1100990099058116760L;
   }

   @Override
   public void class_(boolean var1) {
      this.this_();
      super.class_(var1);

      for (rrTF var3 : (List)this.byte_[0]) {
         var3.aI_();
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.this_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.byte_[30]).class_(rqR_2.break_() - this.byte_[34] > 300L ? true : implements_[47]);
         this.instanceof_();
         if (((rrIk_1)this.byte_[26]).class_()) {
            long var2 = C_throws.byte_().native_().byte_();
            if (var2 > 0L && (Long)this.byte_[35] != var2 && ((rrfw_3)this.byte_[36]).class_(10000.0)) {
               ((cb_3)import_.class_[57]).protected_("/clan invest max");
               Long var8 = var2;
               this.byte_[35] = var8;
               ((rrfw_3)this.byte_[36]).class_();
            }
         }
      }
   }

   public rryT break_(String var1) {
      if (var1.equalsIgnoreCase("withdraw")) {
         return (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[3];
      } else {
         return var1.equalsIgnoreCase("invest") ? (rryT)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[4] : null;
      }
   }

   @Override
   public void throws_(boolean var1) {
      this.this_();
      super.throws_(var1);

      for (rrTF var3 : (List)this.byte_[0]) {
         var3.aK_();
      }

      this.instanceof_();
      Object var8 = null;
      this.byte_[31] = var8;
      Boolean var9 = false;
      this.byte_[32] = var9;
      Long var10 = 0L;
      this.byte_[35] = var10;
      ((rrfw_3)this.byte_[36]).class_();
   }

   private String catch_(String var1) {
      for (String var5 : (String[])break_[0]) {
         if (var5.equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }

   private String goto_() {
      return "/clan create " + RandomStringUtils.randomAlphabetic(5);
   }

   public boolean continue_() {
      this.this_();
      return ((rrIk_1)this.byte_[25]).class_();
   }

   private static void else_() {
      Object[] var0 = new Object[2];
      String[] var2 = new String[]{"my", "me", "i", "я", "мой"};
      var0[0] = var2;
      String[] var3 = new String[]{"full", "all", "max", "все", "всё", "макс"};
      var0[1] = var3;
      break_ = var0;
   }

   private void instanceof_() {
      this.this_();
      if ((Integer)this.byte_[33] != -1) {
         if ((Integer)this.byte_[33] >= 9) {
            ((Ax_1)import_.class_[55]).class_((Integer)this.byte_[33]);
         } else {
            rrfo_3.class_((Integer)this.byte_[33]);
         }

         Integer var5 = -1;
         this.byte_[33] = var5;
      }
   }

   public boolean new_() {
      this.this_();
      return ((rrIk_1)this.byte_[22]).class_();
   }

   private static void return_() {
      finally_ = new String[]{
         new String("FT Helper"),
         new String("Утилитарный модуль для Funtime"),
         new String("Улучшать команды"),
         new String("Улучшать информацию о\nпредметах на аукционе"),
         new String("Уведомлять когда на вас\nналожили плохие эффекты"),
         new String("Авто. перевыставление\nпредметов в хранилище"),
         new String("Авто. инвестирование в\nклан"),
         new String("Авто. добавление друзей в\nрегион"),
         new String("Позволять открывать\nшалкер внутри шалкера"),
         new String("Не ставить сферы"),
         new String("Чат"),
         new String("Аукцион"),
         new String("Другое"),
         new String("Авто-шахта"),
         new String("☃ Хранилище"),
         new String("Цена"),
         new String("Сумма"),
         new String("Сумма"),
         new String("Сумма"),
         new String("|| Статус: »"),
         new String("До следующего ивента"),
         new String("[^0-9]"),
         new String(""),
         new String("[⚔] Ошибка, клан с таким названием уже существует!"),
         new String("[⚔] Супер! Вы успешно создали клан:"),
         new String("[⚔] Ошибка: Ты уже состоишь в клане!"),
         new String("[^0-9]"),
         new String(""),
         new String("/clan money"),
         new String("/money"),
         new String("Зелье Радиации"),
         new String("Снотворное"),
         new String("На вас наложили "),
         new String(", используйте божью ауру"),
         new String("На вас наложили "),
         new String(", используйте молоко"),
         new String("На вас наложили "),
         new String("display"),
         new String("display"),
         new String("Lore"),
         new String("Lore"),
         new String("Ценa"),
         new String("Цена"),
         new String("/clan invest max"),
         new String("withdraw"),
         new String("invest"),
         new String("my"),
         new String("me"),
         new String("i"),
         new String("я"),
         new String("мой"),
         new String("full"),
         new String("all"),
         new String("max"),
         new String("все"),
         new String("всё"),
         new String("макс")
      };
   }

   private static void super_() {
      throws_ = new long[]{61000L, 300L, 0L, 0L, 0L, 0L};
   }

   private static void throw_() {
      implements_ = new boolean[]{
         true,
         true,
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
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
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
         false
      };
   }

   private static void try_() {
      protected_ = new byte[]{
         -1,
         5,
         2,
         3,
         4,
         2,
         4,
         2,
         3,
         5,
         -1,
         2,
         2,
         2,
         3,
         18,
         44,
         3,
         2,
         2,
         -1,
         -1,
         44,
         2,
         10,
         9,
         8,
         -1,
         -1,
         44,
         -1,
         9,
         -1,
         9,
         -1,
         5,
         32,
         5,
         2,
         3,
         4,
         6,
         2,
         3,
         4,
         5,
         37,
         32,
         33,
         34,
         35,
         2
      };
   }

   private static void while_() {
      catch_ = new short[]{
         4,
         0,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         33,
         36,
         22,
         2,
         1,
         3,
         4,
         5,
         6,
         7,
         8,
         12,
         11,
         9,
         15,
         14,
         13,
         10,
         16,
         17,
         18,
         19,
         20,
         21,
         26,
         27,
         24,
         28,
         29,
         23,
         25,
         25,
         57,
         4,
         0,
         55,
         73,
         9,
         12,
         13,
         15,
         2,
         0,
         1,
         1,
         2,
         1,
         4,
         28,
         57,
         57,
         4,
         57,
         26,
         1,
         2,
         1,
         4,
         16,
         6,
         32,
         57,
         32,
         31,
         31,
         3,
         6,
         5,
         57,
         31,
         31,
         1,
         2,
         1,
         4,
         27,
         4,
         57,
         26,
         12,
         10,
         13,
         14,
         11,
         0,
         32,
         31,
         3,
         24,
         57,
         5,
         6,
         7,
         23,
         1,
         2,
         1,
         4,
         0,
         0,
         1,
         2,
         1,
         4,
         57,
         1,
         30,
         57,
         1,
         33,
         55,
         34,
         57,
         1,
         33,
         57,
         0,
         29,
         57,
         0,
         30,
         34,
         26,
         35,
         36,
         57,
         35,
         36,
         30,
         0,
         0,
         31,
         32,
         35,
         36,
         33,
         33,
         55,
         33,
         33,
         33,
         0,
         3000,
         4,
         0,
         17,
         22,
         25,
         0,
         1,
         0,
         0,
         3,
         4
      };
   }

   private static void public_() {
      private_ = new double[]{10000.0};
   }

   private String protected_(String var1) {
      for (String var5 : (String[])break_[1]) {
         if (var5.equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }
}
