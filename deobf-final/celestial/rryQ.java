package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryQ extends rrTF<AutoDuel> {
   private static byte[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   private static String[] case_;
   public Object[] break_;
   private static float[] catch_;
   private static short[] private_;

   private void byte_() {
      this.implements_();
      if (this.class_()) {
         ((cb_3)import_.class_[57]).case_("/duel team search");
         rryc_1 var5 = (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[0];
         this.break_[0] = var5;
      } else if (this.break_()) {
         ((cb_3)import_.class_[57]).case_("/duel search");
      }
   }

   private boolean byte_(rdn_3 var1) {
      if (var1 != null && !var1.class_()) {
         String var2 = var1.continue_().byte_();
         return var2.startsWith("[⚔] Игрок") && !var2.contains("лидер") ? true : protected_[37];
      } else {
         return protected_[35];
      }
   }

   public rryQ(AutoDuel var1) {
      super(var1);
      this.implements_();
      rrIQ var6 = new rrIQ("Режим", "Одиночный", "Одиночный", "Командный");
      this.break_[5] = var6;
      var1.class_(((rrIQ)this.break_[5]).class_(() -> var1.new_() == this ? true : protected_[48]));
   }

   static {
      ntfClinit();
   }

   private void class_(rryv_1 var1, rVi_1 var2) {
      if (var1 instanceof rrym_1 var3) {
         String var4 = var3.break_().class_();
         if (!rql_3.break_(var4)) {
            var2.break_(rgF_2.RED + " (" + var4 + ")");
         }
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvt_3 var3) {
         rqA_2 var4 = var3.break_();
         if (var4 == rqn_3.MC) {
            var1.class_(true);
         }
      }
   }

   private boolean class_(Fc_1 var1) {
      return var1.new_().byte_().equals("⚔ Выбор союзников");
   }

   private rVi_1 class_(rVi_1 var1) {
      return rrfu_3.break_(this.continue_()).class_(rgF_2.GRAY).class_(var1);
   }

   @EventTarget
   public void class_(rrLO var1) {
      this.implements_();
      if (var1.class_() == null) {
         String var2 = var1.protected_().toLowerCase();
         if (var2.equals("[⚔] вы не достаточно наиграли времени чтобы начать дуэль!")) {
            this.continue_().byte_(true);
         } else if (var2.equals("[⚔] поиск командной дуэли успешно начат!") || var2.equals("[⚔] отмените поиск, чтобы принять запрос.")) {
            Object var7 = null;
            this.break_[0] = var7;
         } else if (var2.equals("[✘] ошибка! вы не являетесь дуэлянтом!")
            || var2.equals("[✘] ошибка! вы не можете сделать это во время дуэли!")
            || var2.startsWith("[⚔] поиск командной дуэли был отменен")
            || var2.contains("[⚔] поиск дуэли отменён")
            || var2.contains("вы слишком быстро перезаходите")) {
            this.protected_();
         } else if (var2.contains("[⚔] дуэль завершена")) {
            this.extends_();
         } else if (var2.contains("[⚔] дуэль началась!")) {
            Boolean var8 = true;
            this.break_[3] = var8;
         }
      }
   }

   @EventTarget
   public void class_(rrAZ var1) {
      this.implements_();
      if (var1.class_() instanceof Fc_1 var3) {
         rXe_1 var4 = var3.G_();
         if (this.class_(var3)) {
            ((rqr_3)((cb_3)import_.class_[57]).break_[17]).finally_ = true;
            if ((rryc_1)this.break_[0] == (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[0]) {
               List var5 = var4.class_(var1x -> this.byte_(var1x.class_()) && !this.break_(var1x.class_()) ? true : protected_[46]);

               for (rJY var7 : var5) {
                  ((Ax_1)import_.class_[55]).class_(var4.case_, var7.protected_, 2, rXa_1.CLONE);
               }

               if (var5.isEmpty()) {
                  rryc_1 var12 = (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[1];
                  this.break_[0] = var12;
               }
            } else if ((rryc_1)this.break_[0] == (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[1]) {
               List var13 = var4.class_(var1x -> this.class_(var1x.class_()));
               if (!var13.isEmpty()) {
                  ((Ax_1)import_.class_[55]).class_(var4.case_, ((rJY)var13.get(0)).protected_, 2, rXa_1.CLONE);
               }
            }
         }
      }
   }

   @EventTarget
   public void class_(rrAM var1) {
      this.implements_();
      Boolean var6 = rrjS_2.byte_();
      this.break_[2] = var6;
      if (!(Boolean)this.break_[2]) {
         this.protected_();
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, 106, 71, 0, 81, 17, 28, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4871849029238648598L;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.implements_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         boolean var2 = rrjS_2.byte_();
         if (rrfZ_2.byte_() || (Boolean)this.break_[3]) {
            AutoDuel var28 = this.continue_();
            var28.byte_(true);
            if (var2) {
               MinecraftAccessor.a_(rrfu_3.class_((Module)var28) + "Дуэль началась", false);
            }

            return;
         }

         Collection var3 = ((Aq_1)((cb_3)import_.class_[57]).break_[0]).throws_();
         if (!(Boolean)this.break_[1] && !var2) {
            this.byte_();
            Boolean var23 = true;
            this.break_[1] = var23;
         } else if ((Boolean)this.break_[2] && !var3.isEmpty()) {
            Collection var4 = this.class_(var3);
            ArrayList var5 = new ArrayList();
            ArrayList var6 = new ArrayList();

            for (rryu_1 var8 : var4) {
               switch (((int[])rryN.class_[0])[var8.break_().class_().ordinal()]) {
                  case 1:
                     var5.add(var8);
                     break;
                  case 2:
                     var6.add(var8);
               }
            }

            boolean var29 = protected_[5];

            for (rryu_1 var9 : var4) {
               rryv_1 var10 = var9.break_();
               String var11 = var9.class_();
               if (var10.throws_()) {
                  int var10002 = (Integer)this.break_[4] + 1;
                  Integer var24 = var10002;
                  this.break_[4] = var24;
                  if (var10002 >= 18) {
                     rVi_1 var12 = this.class_(new rgN_2("Игрок '" + var11 + "' является вашим другом"));
                     rrfu_3.class_(var12);
                     MinecraftAccessor.a_(var12.getString(), false);
                     this.extends_();
                     var29 = true;
                     break;
                  }
               } else if (var10.byte_()) {
                  if (!var6.isEmpty()) {
                     int var38 = (Integer)this.break_[4] + 1;
                     Integer var25 = var38;
                     this.break_[4] = var25;
                     if (var38 >= 18) {
                        rVi_1 var31;
                        if (var6.size() == 1) {
                           rgN_2 var13 = new rgN_2("Найден игрок в чёрном списке: " + var11);
                           this.class_(((rryu_1)var6.get(0)).break_(), var13);
                           var31 = this.class_(var13);
                        } else {
                           var31 = this.class_(new rgN_2("Найдены игроки в чёрном списке: "));

                           for (int var33 = 0; var33 < var6.size(); var33++) {
                              rryu_1 var14 = (rryu_1)var6.get(var33);
                              String var15 = var14.class_();
                              var31.break_(var15);
                              this.class_(var14.break_(), var31);
                              if (var33 < var6.size() - 1) {
                                 var31.break_(", ");
                              }
                           }
                        }

                        rrfu_3.class_(var31);
                        MinecraftAccessor.a_(var31.getString(), false);
                        this.extends_();
                        var29 = true;
                        break;
                     }
                  }
               } else if (var10.protected_()) {
                  if (var5.isEmpty()) {
                     break;
                  }

                  rgN_2 var35 = new rgN_2(rgF_2.RED + "[Block]");
                  rVi_1 var32;
                  rVi_1 var34;
                  if (var5.size() == 1) {
                     rVi_1 var36 = this.class_(var35, var11);
                     var32 = this.class_(new rgN_2("Найден игрок '" + var11 + "'").break_(" ").class_(var36));
                     var34 = this.class_(new rgN_2("Найден игрок '" + var11 + "'"));
                  } else {
                     var32 = this.class_(new rgN_2("Найдены игроки: "));
                     var34 = this.class_(new rgN_2("Найдены игроки: "));

                     for (int var37 = 0; var37 < var5.size(); var37++) {
                        rryu_1 var16 = (rryu_1)var5.get(var37);
                        String var17 = var16.class_();
                        rVi_1 var18 = this.class_(var35, var17);
                        var32.break_(var17).break_(" ").class_(var18);
                        var34.break_(var17);
                        if (var37 < var5.size() - 1) {
                           var32.break_(", ");
                           var34.break_(", ");
                        }
                     }
                  }

                  rrfu_3.class_(var32);
                  MinecraftAccessor.a_(var34.getString(), false);
                  ((cb_3)import_.class_[57]).class_(rqn_3.MC, rqL_2.RECORDS, 1.0F, 1.0F);
                  var29 = true;
                  break;
               }
            }

            if (var29) {
               Boolean var26 = false;
               this.break_[2] = var26;
               Integer var27 = 0;
               this.break_[4] = var27;
            }
         }
      }
   }

   @EventTarget
   public void class_(rrFo_1 var1) {
      this.implements_();
      if (var1.break_() instanceof Fc_1 var3
         && (
            (rryc_1)this.break_[0] == (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[1]
               || (rryc_1)this.break_[0] == (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[0]
         )
         && this.class_(var3)) {
         Object var8 = null;
         this.break_[0] = var8;
      }
   }

   private boolean class_(rdn_3 var1) {
      if (var1 != null && !var1.class_()) {
         return var1.break_() == rdy_3.Ek && var1.continue_().byte_().equals("[Начать поиск командной дуэли]") ? true : protected_[44];
      } else {
         return protected_[42];
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1231857640;
   }

   public boolean class_() {
      this.implements_();
      return ((rrIQ)this.break_[5]).byte_().equals("Командный");
   }

   private rVi_1 class_(rVi_1 var1, String var2) {
      return rgv_3.class_(
         var1,
         new rgy_3(rgp_3.class_, new rgn_3("autoduel.blacklist.add", var2)),
         new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "duel blacklist add " + var2 + " ")
      );
   }

   private Collection<rryu_1> class_(Collection<Aw_1> var1) {
      if (var1 != null && !var1.isEmpty()) {
         Aw_1 var2 = ((cb_3)import_.class_[57]).continue_();
         HashSet var3 = new HashSet();
         boolean var4 = this.class_();

         for (Aw_1 var6 : var1) {
            if (var6 != var2) {
               String var7 = var6.class_().getName();
               String var8 = var7.toLowerCase();
               if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).break_(var8)) {
                  if (!var4) {
                     var3.add(new rryu_1(var7, (rryv_1)class_[2]));
                  }
               } else {
                  rryk_1 var9 = ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).protected_(var8);
                  if (var9 != null) {
                     var3.add(new rryu_1(var7, new rrym_1(var9)));
                  } else {
                     var3.add(new rryu_1(var7, (rryv_1)class_[1]));
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   @EventTarget
   public void class_(rrFY var1) {
      this.implements_();
      if (var1.class_() instanceof Fc_1 var3 && (rryc_1)this.break_[0] != null && this.class_(var3)) {
         this.continue_().byte_(true);
      }
   }

   private boolean break_(rdn_3 var1) {
      if (var1 != null && !var1.class_() && var1.final_()) {
         rcd_3 var2 = var1.package_();
         if (var2.byte_("display", 10)) {
            rcd_3 var3 = var2.int_("display");
            if (var3.protected_("Lore") == 9) {
               rcy_3 var4 = var3.protected_("Lore", 8);

               for (int var5 = 0; var5 < var4.size(); var5++) {
                  String var6 = var4.implements_(var5);
                  if (var6.contains("Убрать")) {
                     return true;
                  }
               }
            }
         }

         return protected_[41];
      } else {
         return protected_[38];
      }
   }

   public boolean break_() {
      this.implements_();
      return ((rrIQ)this.break_[5]).byte_().equals("Одиночный");
   }

   private static void throws_() {
      Object[] var0 = new Object[]{18, new rryL(), new rryZ()};
      class_ = var0;
   }

   private static void finally_() {
      byte_ = new byte[]{2, 18, 18, 2, 2, 10, 9, 8, 2, 6, 2, 3, 4, 3, 18};
   }

   private void extends_() {
      ((cb_3)import_.class_[57]).case_("/duel leave");
   }

   private static void case_() {
      protected_ = new boolean[]{
         false,
         true,
         true,
         false,
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
         true,
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
         true,
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
         false,
         true,
         false,
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
         false,
         false,
         false,
         false
      };
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
         this.break_[1] = false;
         this.break_[2] = false;
         this.break_[3] = false;
         this.break_[4] = 0;
      }
   }

   private void protected_() {
      this.implements_();
      Boolean var5 = false;
      this.break_[1] = var5;
      Boolean var6 = false;
      this.break_[2] = var6;
      Boolean var7 = false;
      this.break_[3] = var7;
      Integer var8 = 0;
      this.break_[4] = var8;
   }

   private static void private_() {
      catch_ = new float[]{1.0F, 1.0F};
   }

   private static void final_() {
      private_ = new short[]{
         5,
         5,
         0,
         3,
         57,
         0,
         1,
         1,
         2,
         0,
         4,
         4,
         4,
         4,
         57,
         2,
         4,
         57,
         17,
         0,
         0,
         55,
         1,
         0,
         0,
         1,
         55,
         0,
         1,
         0,
         0,
         0,
         0,
         2,
         2,
         0,
         3,
         0,
         0,
         0,
         57,
         0,
         2,
         0,
         1,
         0,
         1,
         2,
         3,
         4,
         57,
         0,
         0,
         57,
         57,
         5,
         5
      };
   }

   private static void native_() {
      case_ = new String[]{
         new String("Режим"),
         new String("Одиночный"),
         new String("Одиночный"),
         new String("Командный"),
         new String("Найдены игроки в чёрном списке: "),
         new String(", "),
         new String(" "),
         new String("Найдены игроки: "),
         new String("Найдены игроки: "),
         new String(" "),
         new String(", "),
         new String(", "),
         new String("[⚔] вы не достаточно наиграли времени чтобы начать дуэль!"),
         new String("[⚔] поиск командной дуэли успешно начат!"),
         new String("[⚔] отмените поиск, чтобы принять запрос."),
         new String("[✘] ошибка! вы не являетесь дуэлянтом!"),
         new String("[✘] ошибка! вы не можете сделать это во время дуэли!"),
         new String("[⚔] поиск командной дуэли был отменен"),
         new String("[⚔] поиск дуэли отменён"),
         new String("вы слишком быстро перезаходите"),
         new String("[⚔] дуэль завершена"),
         new String("[⚔] дуэль началась!"),
         new String("autoduel.blacklist.add"),
         new String("/duel team search"),
         new String("/duel search"),
         new String("/duel leave"),
         new String("⚔ Выбор союзников"),
         new String("[⚔] Игрок"),
         new String("лидер"),
         new String("display"),
         new String("display"),
         new String("Lore"),
         new String("Lore"),
         new String("Убрать"),
         new String("[Начать поиск командной дуэли]"),
         new String("Одиночный"),
         new String("Командный")
      };
   }

   @Override
   public boolean aI_() {
      this.implements_();
      this.protected_();
      Object var5 = null;
      this.break_[0] = var5;
      rrfu_3.byte_(
         rrfu_3.class_(this.continue_())
            + "Добавить игрока в чёрный список: "
            + (String)C_class.instanceof_().protected_.class_[0]
            + "duel blacklist add <ник> <заметка>"
      );
      return super.aI_();
   }

   @Override
   public boolean aK_() {
      this.implements_();
      this.protected_();
      Object var5 = null;
      this.break_[0] = var5;
      return super.aK_();
   }
}
