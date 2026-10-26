package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpn_3 extends rrpl_3 {
   private static float[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static String[] id_case;
   private static short[] id_catch;

   private boolean id_byte() {
      rgP_2 var1 = ((cq_3)id_import.id_class[19]).id_implements().id_protected();
      return var1 != null && var1.id_byte().contains("Вы находитесь в: Lobby") ? true : id_protected[9];
   }

   public rrpn_3(GriefJoiner var1) {
      super(var1);
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_throws();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrpC_2)this.id_class[0] != (rrpC_2)rrpC_2.staticFields58cea7ed1d8d31da9b1cc2bca3fc3669[0]) {
            return;
         }

         if ((Boolean)this.id_class[1] && (Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 25 == 0) {
            Boolean var13 = false;
            this.id_class[1] = var13;
         }

         GriefJoiner var2 = this.id_continue();
         String var3 = var2.id_new();
         boolean var4 = !var3.equalsIgnoreCase("mega") && !var3.equalsIgnoreCase("мега") ? id_protected[2] : id_protected[1];
         vm_3 var6 = (vm_3)id_import.id_class[73];
         if (var6 instanceof Fc_1 var5) {
            String var15 = var5.id_new().id_byte().toLowerCase();
            rqs_3 var7 = var5.G_().id_extends();
            if (var4) {
               rdn_3 var17 = this.id_break(var7);
               if (var17 != null) {
                  this.id_class(var7, var17);
               }

               return;
            }

            if (var15.contains("выбор сервера")) {
               rdn_3 var16 = this.id_class(var7);
               if (var16 != null) {
                  this.id_class(var7, var16);
               }

               return;
            }

            if (var15.contains("выбор мира грифа")) {
               rdn_3 var8 = this.id_class(var3, var7);
               if (var8 != null) {
                  this.id_class(var7, var8);
               }
            }
         } else if (!(Boolean)this.id_class[1]) {
            this.id_private();
            Boolean var14 = true;
            this.id_class[1] = var14;
         }
      }
   }

   private rdn_3 id_class(rqs_3<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte().toLowerCase();
         if (var4.contains("гриферское выживание")) {
            return var3;
         }
      }

      return null;
   }

   @EventTarget
   public void id_class(rrFY var1) {
      vm_3 var2 = var1.id_class();
      if (var2 instanceof Fc_1) {
         String var3 = var2.id_new().id_byte().toLowerCase();
         if (var3.contains("выбор сервера") || var3.contains("выбор мира грифа")) {
            this.id_continue().id_byte(true);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4999888400485090739L;
   }

   private void id_class(rqs_3<rdn_3> var1, rdn_3 var2) {
      ((Ax_1)id_import.id_class[55]).id_class(((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case, var1.indexOf(var2), 1, rXa_1.PICKUP);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1702324786;
   }

   @Override
   public void id_class() {
      this.id_throws();
      GriefJoiner var1 = this.id_continue();
      if (!this.id_byte()) {
         var1.id_byte(false);
         String var2 = "Вы не находитесь в хабе";
         rrfu_3.id_byte(rrfu_3.id_class((Module)var1) + var2);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(var1.id_final(), var2, 2000));
      } else {
         rrpC_2 var7 = (rrpC_2)rrpC_2.staticFields58cea7ed1d8d31da9b1cc2bca3fc3669[0];
         this.id_class[0] = var7;
      }
   }

   @EventTarget
   public void id_class(rrAl_1 var1) {
      if (var1.id_class() > 10.0F) {
         GriefJoiner var2 = this.id_continue();
         var2.id_byte(false);
         String var3 = "Вы успешно зашли на " + var2.id_new() + " гриф";
         String var4 = rrfu_3.id_class((Module)var2) + var3;
         rrfu_3.id_byte(var4);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtQ_2(var2.id_final(), var3, 2000));
         MinecraftAccessor.a_(var4, false);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 32, 43, 51, 84, 21, -73, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rdn_3 id_class(String var1, List<rdn_3> var2) {
      try {
         int var3 = Integer.parseInt(var1);

         for (rdn_3 var5 : var2) {
            if (!var5.id_class() && var5.id_continue().id_byte().contains("#" + var3)) {
               return var5;
            }
         }

         return null;
      } catch (NumberFormatException var6) {
         return null;
      }
   }

   private static void id_break() {
      id_byte = new byte[]{25, -1, -2, -3, 2};
   }

   private rdn_3 id_break(rqs_3<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte().toLowerCase();
         if (var4.contains("мега гриф")) {
            return var3;
         }
      }

      return null;
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = false;
      }
   }

   private static void id_finally() {
      id_case = new String[]{
         new String("mega"),
         new String("мега"),
         new String("выбор сервера"),
         new String("выбор мира грифа"),
         new String("выбор сервера"),
         new String("выбор мира грифа"),
         new String("Вы не находитесь в хабе"),
         new String("Вы находитесь в: Lobby"),
         new String("мега гриф"),
         new String("гриферское выживание")
      };
   }

   private static void id_case() {
      id_break = new float[]{10.0F};
   }

   private static void id_implements() {
      id_protected = new boolean[]{false, true, false, true, true, false, false, false, true, false, true, true, false};
   }

   private static void id_protected() {
      id_catch = new short[]{0, 0, 0, 1, 57, 41, 1, 73, 1, 1, 57, 0, 57, 0, 57, 0, 0, 2000, 0, 2000, 0, 0, 0, 19, 55, 57, 4};
   }

   private void id_private() {
      int var1 = rrfY_2.id_break(rdy_3.Xx);
      if (var1 != -1) {
         if (var1 == -2) {
            ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZd_1(rpm_3.MAIN_HAND));
         } else if (var1 == -3) {
            ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZd_1(rpm_3.OFF_HAND));
         } else {
            rrfo_3.id_class(var1);
            ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZd_1(rpm_3.MAIN_HAND));
         }
      }
   }

   @Override
   public boolean aK_() {
      this.id_throws();
      Object var5 = null;
      this.id_class[0] = var5;
      return super.aK_();
   }
}
