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
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   private static String[] id_case;
   public Object[] id_break;
   private static float[] id_catch;
   private static short[] id_private;

   private void id_byte() {
      this.id_implements();
      if (this.id_class()) {
         ((cb_3)id_import.id_class[57]).id_case(id_case[23]);
         rryc_1 var5 = (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[51]];
         this.id_break[id_private[52]] = var5;
      } else if (this.id_break()) {
         ((cb_3)id_import.id_class[57]).id_case(id_case[24]);
      }
   }

   private boolean id_byte(rdn_3 var1) {
      if (var1 != null && !var1.id_class()) {
         String var2 = var1.id_continue().id_byte();
         return var2.startsWith(id_case[27]) && !var2.contains(id_case[28]) ? true : id_protected[37];
      } else {
         return id_protected[35];
      }
   }

   public rryQ(AutoDuel var1) {
      super(var1);
      this.id_implements();
      String var10003 = id_case[0];
      String var10004 = id_case[1];
      String[] var10005 = new String[2];
      var10005[id_protected[0]] = id_case[2];
      var10005[1] = id_case[3];
      rrIQ var6 = new rrIQ(var10003, var10004, var10005);
      this.id_break[5] = var6;
      var1.id_class(((rrIQ)this.id_break[5]).id_class(() -> var1.id_new() == this ? true : id_protected[48]));
   }

   static {
      ntfClinit();
   }

   private void id_class(rryv_1 var1, rVi_1 var2) {
      if (var1 instanceof rrym_1 var3) {
         String var4 = var3.id_break().id_class();
         if (!rql_3.id_break(var4)) {
            var2.id_break(rgF_2.RED + " (" + var4 + ")");
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvt_3 var3) {
         rqA_2 var4 = var3.id_break();
         if (var4 == rqn_3.MC) {
            var1.id_class(true);
         }
      }
   }

   private boolean id_class(Fc_1 var1) {
      return var1.id_new().id_byte().equals(id_case[26]);
   }

   private rVi_1 id_class(rVi_1 var1) {
      return rrfu_3.id_break(this.id_continue()).id_class(rgF_2.GRAY).id_class(var1);
   }

   @EventTarget
   public void id_class(rrLO var1) {
      this.id_implements();
      if (var1.id_class() == null) {
         String var2 = var1.id_protected().toLowerCase();
         if (var2.equals(id_case[12])) {
            this.id_continue().id_byte(true);
         } else if (var2.equals(id_case[13]) || var2.equals(id_case[14])) {
            Object var7 = null;
            this.id_break[id_private[35]] = var7;
         } else if (var2.equals(id_case[15])
            || var2.equals(id_case[16])
            || var2.startsWith(id_case[17])
            || var2.contains(id_case[18])
            || var2.contains(id_case[19])) {
            this.id_protected();
         } else if (var2.contains(id_case[20])) {
            this.id_extends();
         } else if (var2.contains(id_case[21])) {
            Boolean var8 = true;
            this.id_break[3] = var8;
         }
      }
   }

   @EventTarget
   public void id_class(rrAZ var1) {
      this.id_implements();
      if (var1.id_class() instanceof Fc_1 var3) {
         rXe_1 var4 = var3.G_();
         if (this.id_class(var3)) {
            ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_finally = true;
            if ((rryc_1)this.id_break[id_private[19]] == (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[20]]) {
               List var5 = var4.id_class(var1x -> this.id_byte(var1x.id_class()) && !this.id_break(var1x.id_class()) ? true : id_protected[46]);

               for (rJY var7 : var5) {
                  ((Ax_1)id_import.id_class[55]).id_class(var4.id_case, var7.id_protected, 2, rXa_1.CLONE);
               }

               if (var5.isEmpty()) {
                  rryc_1 var12 = (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[1];
                  this.id_break[id_private[23]] = var12;
               }
            } else if ((rryc_1)this.id_break[id_private[24]] == (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[1]) {
               List var13 = var4.id_class(var1x -> this.id_class(var1x.id_class()));
               if (!var13.isEmpty()) {
                  ((Ax_1)id_import.id_class[55]).id_class(var4.id_case, ((rJY)var13.get(id_protected[24])).id_protected, 2, rXa_1.CLONE);
               }
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_implements();
      Boolean var6 = rrjS_2.id_byte();
      this.id_break[2] = var6;
      if (!(Boolean)this.id_break[2]) {
         this.id_protected();
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, 106, 71, 0, 81, 17, 28, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4871849029238648598L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_implements();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[2]]) {
         boolean var2 = rrjS_2.id_byte();
         if (rrfZ_2.id_byte() || (Boolean)this.id_break[3]) {
            AutoDuel var28 = this.id_continue();
            var28.id_byte(true);
            if (var2) {
               MinecraftAccessor.a_(rrfu_3.id_class((Module)var28) + "Дуэль началась", id_protected[3]);
            }

            return;
         }

         Collection var3 = ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_private[5]]).id_throws();
         if (!(Boolean)this.id_break[1] && !var2) {
            this.id_byte();
            Boolean var23 = true;
            this.id_break[1] = var23;
         } else if ((Boolean)this.id_break[2] && !var3.isEmpty()) {
            Collection var4 = this.id_class(var3);
            ArrayList var5 = new ArrayList();
            ArrayList var6 = new ArrayList();

            for (rryu_1 var8 : var4) {
               switch (((int[])rryN.id_class[id_private[9]])[var8.id_break().id_class().ordinal()]) {
                  case 1:
                     var5.add(var8);
                     break;
                  case 2:
                     var6.add(var8);
               }
            }

            boolean var29 = id_protected[5];

            for (rryu_1 var9 : var4) {
               rryv_1 var10 = var9.id_break();
               String var11 = var9.id_class();
               if (var10.id_throws()) {
                  int var10002 = (Integer)this.id_break[4] + 1;
                  Integer var24 = var10002;
                  this.id_break[4] = var24;
                  if (var10002 >= 18) {
                     rVi_1 var12 = this.id_class(new rgN_2("Игрок '" + var11 + "' является вашим другом"));
                     rrfu_3.id_class(var12);
                     MinecraftAccessor.a_(var12.getString(), id_protected[7]);
                     this.id_extends();
                     var29 = true;
                     break;
                  }
               } else if (var10.id_byte()) {
                  if (!var6.isEmpty()) {
                     int var38 = (Integer)this.id_break[4] + 1;
                     Integer var25 = var38;
                     this.id_break[4] = var25;
                     if (var38 >= 18) {
                        rVi_1 var31;
                        if (var6.size() == 1) {
                           rgN_2 var13 = new rgN_2("Найден игрок в чёрном списке: " + var11);
                           this.id_class(((rryu_1)var6.get(id_protected[11])).id_break(), var13);
                           var31 = this.id_class(var13);
                        } else {
                           var31 = this.id_class(new rgN_2(id_case[4]));

                           for (int var33 = id_protected[12]; var33 < var6.size(); var33++) {
                              rryu_1 var14 = (rryu_1)var6.get(var33);
                              String var15 = var14.id_class();
                              var31.id_break(var15);
                              this.id_class(var14.id_break(), var31);
                              if (var33 < var6.size() - 1) {
                                 var31.id_break(id_case[5]);
                              }
                           }
                        }

                        rrfu_3.id_class(var31);
                        MinecraftAccessor.a_(var31.getString(), id_protected[14]);
                        this.id_extends();
                        var29 = true;
                        break;
                     }
                  }
               } else if (var10.id_protected()) {
                  if (var5.isEmpty()) {
                     break;
                  }

                  rgN_2 var35 = new rgN_2(rgF_2.RED + "[Block]");
                  rVi_1 var32;
                  rVi_1 var34;
                  if (var5.size() == 1) {
                     rVi_1 var36 = this.id_class(var35, var11);
                     var32 = this.id_class(new rgN_2("Найден игрок '" + var11 + "'").id_break(id_case[6]).id_class(var36));
                     var34 = this.id_class(new rgN_2("Найден игрок '" + var11 + "'"));
                  } else {
                     var32 = this.id_class(new rgN_2(id_case[7]));
                     var34 = this.id_class(new rgN_2(id_case[8]));

                     for (int var37 = id_protected[17]; var37 < var5.size(); var37++) {
                        rryu_1 var16 = (rryu_1)var5.get(var37);
                        String var17 = var16.id_class();
                        rVi_1 var18 = this.id_class(var35, var17);
                        var32.id_break(var17).id_break(id_case[9]).id_class(var18);
                        var34.id_break(var17);
                        if (var37 < var5.size() - 1) {
                           var32.id_break(id_case[10]);
                           var34.id_break(id_case[11]);
                        }
                     }
                  }

                  rrfu_3.id_class(var32);
                  MinecraftAccessor.a_(var34.getString(), id_protected[19]);
                  ((cb_3)id_import.id_class[57]).id_class(rqn_3.MC, rqL_2.RECORDS, 1.0F, 1.0F);
                  var29 = true;
                  break;
               }
            }

            if (var29) {
               Boolean var26 = id_protected[21];
               this.id_break[2] = var26;
               Integer var27 = Integer.valueOf(id_protected[22]);
               this.id_break[4] = var27;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrFo_1 var1) {
      this.id_implements();
      if (var1.id_break() instanceof Fc_1 var3
         && (
            (rryc_1)this.id_break[id_private[27]] == (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[1]
               || (rryc_1)this.id_break[id_private[29]] == (rryc_1)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[30]]
         )
         && this.id_class(var3)) {
         Object var8 = null;
         this.id_break[id_private[31]] = var8;
      }
   }

   private boolean id_class(rdn_3 var1) {
      if (var1 != null && !var1.id_class()) {
         return var1.id_break() == rdy_3.Ek && var1.id_continue().id_byte().equals(id_case[34]) ? true : id_protected[44];
      } else {
         return id_protected[42];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1231857640;
   }

   public boolean id_class() {
      this.id_implements();
      return ((rrIQ)this.id_break[5]).id_byte().equals(id_case[36]);
   }

   private rVi_1 id_class(rVi_1 var1, String var2) {
      rgp_3 var10003 = rgp_3.id_class;
      String var10006 = id_case[22];
      Object[] var10007 = new Object[1];
      var10007[id_protected[30]] = var2;
      return rgv_3.id_class(
         var1,
         new rgy_3(var10003, new rgn_3(var10006, var10007)),
         new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_private[45]] + "duel blacklist add " + var2 + " ")
      );
   }

   private Collection<rryu_1> id_class(Collection<Aw_1> var1) {
      if (var1 != null && !var1.isEmpty()) {
         Aw_1 var2 = ((cb_3)id_import.id_class[57]).id_continue();
         HashSet var3 = new HashSet();
         boolean var4 = this.id_class();

         for (Aw_1 var6 : var1) {
            if (var6 != var2) {
               String var7 = var6.id_class().getName();
               String var8 = var7.toLowerCase();
               if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_private[41]]).id_break(var8)) {
                  if (!var4) {
                     var3.add(new rryu_1(var7, (rryv_1)id_class[2]));
                  }
               } else {
                  rryk_1 var9 = ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_private[43]]).id_protected(var8);
                  if (var9 != null) {
                     var3.add(new rryu_1(var7, new rrym_1(var9)));
                  } else {
                     var3.add(new rryu_1(var7, (rryv_1)id_class[1]));
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
   public void id_class(rrFY var1) {
      this.id_implements();
      if (var1.id_class() instanceof Fc_1 var3 && (rryc_1)this.id_break[id_private[32]] != null && this.id_class(var3)) {
         this.id_continue().id_byte(true);
      }
   }

   private boolean id_break(rdn_3 var1) {
      if (var1 != null && !var1.id_class() && var1.id_final()) {
         rcd_3 var2 = var1.id_package();
         if (var2.id_byte(id_case[29], 10)) {
            rcd_3 var3 = var2.id_int(id_case[30]);
            if (var3.id_protected(id_case[31]) == 9) {
               rcy_3 var4 = var3.id_protected(id_case[32], 8);

               for (int var5 = id_protected[39]; var5 < var4.size(); var5++) {
                  String var6 = var4.id_implements(var5);
                  if (var6.contains(id_case[33])) {
                     return true;
                  }
               }
            }
         }

         return id_protected[41];
      } else {
         return id_protected[38];
      }
   }

   public boolean id_break() {
      this.id_implements();
      return ((rrIQ)this.id_break[5]).id_byte().equals(id_case[35]);
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{18, new rryL(), new rryZ()};
      id_class = var0;
   }

   private static void id_finally() {
      id_byte = new byte[]{2, 18, 18, 2, 2, 10, 9, 8, 2, 6, 2, 3, 4, 3, 18};
   }

   private void id_extends() {
      ((cb_3)id_import.id_class[57]).id_case(id_case[25]);
   }

   private static void id_case() {
      id_protected = new boolean[]{
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

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
         this.id_break[1] = false;
         this.id_break[2] = false;
         this.id_break[3] = false;
         this.id_break[4] = 0;
      }
   }

   private void id_protected() {
      this.id_implements();
      Boolean var5 = id_protected[31];
      this.id_break[1] = var5;
      Boolean var6 = id_protected[32];
      this.id_break[2] = var6;
      Boolean var7 = id_protected[33];
      this.id_break[3] = var7;
      Integer var8 = Integer.valueOf(id_protected[34]);
      this.id_break[4] = var8;
   }

   private static void id_private() {
      id_catch = new float[]{1.0F, 1.0F};
   }

   private static void id_final() {
      id_private = new short[]{
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

   private static void id_native() {
      id_case = new String[]{
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
      this.id_implements();
      this.id_protected();
      Object var5 = null;
      this.id_break[id_private[37]] = var5;
      rrfu_3.id_byte(
         rrfu_3.id_class(this.id_continue())
            + "Добавить игрока в чёрный список: "
            + (String)C_class.id_instanceof().id_protected.id_class[id_private[38]]
            + "duel blacklist add <ник> <заметка>"
      );
      return super.aI_();
   }

   @Override
   public boolean aK_() {
      this.id_implements();
      this.id_protected();
      Object var5 = null;
      this.id_break[id_private[39]] = var5;
      return super.aK_();
   }
}
